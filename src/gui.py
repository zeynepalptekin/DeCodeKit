import tkinter as tk
from tkinter import filedialog, messagebox, scrolledtext, ttk
from framework_detector import detect_framework
import threading

class DeCodeKitApp:
    def __init__(self, root):
        self.root = root
        self.root.title("DeCodeKit Framework Detector")
        self.root.geometry("650x600")
        self.root.configure(bg="#2c3e50")

        # Başlık
        self.title_label = tk.Label(root, text="APK Framework Tespiti", font=("Helvetica", 18, "bold"), fg="white", bg="#2c3e50")
        self.title_label.pack(pady=15)

        # Dosya seçme çerçevesi
        frame = tk.Frame(root, bg="#34495e", pady=10, padx=10)
        frame.pack(padx=20, pady=10, fill="x")

        self.file_path_var = tk.StringVar()
        self.file_entry = tk.Entry(frame, textvariable=self.file_path_var, font=("Helvetica", 12), width=55)
        self.file_entry.pack(side="left", padx=(0,10), ipady=5)

        self.browse_button = tk.Button(frame, text="Gözat", command=self.browse_file, bg="#1abc9c", fg="white", font=("Helvetica", 12, "bold"), relief="flat", cursor="hand2")
        self.browse_button.pack(side="left")

        # Buton çerçevesi
        btn_frame = tk.Frame(root, bg="#2c3e50")
        btn_frame.pack(pady=15)

        self.analyze_button = tk.Button(btn_frame, text="Analiz Et", command=self.analyze_single, bg="#e67e22", fg="white", font=("Helvetica", 14, "bold"), relief="flat", cursor="hand2")
        self.analyze_button.pack(side="left", ipadx=15, ipady=8, padx=10)

        self.batch_analyze_button = tk.Button(btn_frame, text="Toplu Analiz Et", command=self.analyze_batch, bg="#2980b9", fg="white", font=("Helvetica", 14, "bold"), relief="flat", cursor="hand2")
        self.batch_analyze_button.pack(side="left", ipadx=15, ipady=8, padx=10)

        self.save_button = tk.Button(root, text="Sonuçları Kaydet", command=self.save_results, bg="#27ae60", fg="white", font=("Helvetica", 12, "bold"), relief="flat", cursor="hand2")
        self.save_button.pack(pady=5, ipadx=15, ipady=5)

        # Arama çerçevesi
        search_frame = tk.Frame(root, bg="#34495e", pady=5, padx=10)
        search_frame.pack(padx=20, pady=5, fill="x")

        tk.Label(search_frame, text="Sonuçlarda Ara:", bg="#34495e", fg="white", font=("Helvetica", 12, "bold")).pack(side="left")

        self.search_var = tk.StringVar()
        self.search_entry = tk.Entry(search_frame, textvariable=self.search_var, font=("Helvetica", 12), width=30)
        self.search_entry.pack(side="left", padx=10, ipady=3)

        self.search_button = tk.Button(search_frame, text="Ara", command=self.search_text, bg="#3498db", fg="white", font=("Helvetica", 12, "bold"), relief="flat", cursor="hand2")
        self.search_button.pack(side="left", padx=5)

        self.clear_results_button = tk.Button(search_frame, text="Sonuçları Temizle", command=self.clear_results, bg="#c0392b", fg="white", font=("Helvetica", 12, "bold"), relief="flat", cursor="hand2")
        self.clear_results_button.pack(side="right", padx=5)

        # İlerleme çubuğu
        self.progress = ttk.Progressbar(root, orient="horizontal", mode="indeterminate", length=600)
        self.progress.pack(pady=10)

        # Sonuç gösterme alanı
        self.result_box = scrolledtext.ScrolledText(root, width=80, height=14, font=("Consolas", 12), bg="#ecf0f1", fg="#2c3e50")
        self.result_box.pack(padx=20, pady=10)
        self.result_box.config(state="disabled")

    def browse_file(self):
        filename = filedialog.askopenfilename(
            title="APK Dosyası Seçin",
            filetypes=[("APK dosyaları", "*.apk")]
        )
        if filename:
            self.file_path_var.set(filename)

    def get_file_paths(self):
        text = self.file_path_var.get().strip()
        if not text:
            return []
        if ',' in text:
            files = [f.strip() for f in text.split(',') if f.strip()]
        elif ';' in text:
            files = [f.strip() for f in text.split(';') if f.strip()]
        else:
            files = [text]
        return files

    def analyze_single(self):
        files = self.get_file_paths()
        if not files:
            messagebox.showwarning("Uyarı", "Lütfen en az bir APK dosyası yazın veya seçin.")
            return
        if len(files) > 1:
            messagebox.showwarning("Uyarı", "Tek dosya analizi için lütfen sadece bir dosya yazın veya seçin.")
            return
        self.start_analysis()
        threading.Thread(target=self.run_analysis, args=(files[0],), daemon=True).start()

    def analyze_batch(self):
        files = self.get_file_paths()
        if not files:
            messagebox.showwarning("Uyarı", "Lütfen en az bir APK dosyası yazın veya seçin.")
            return
        self.start_analysis()
        threading.Thread(target=self.run_batch_analysis, args=(files,), daemon=True).start()

    def start_analysis(self):
        self.result_box.config(state="normal")
        self.result_box.delete("1.0", tk.END)
        self.result_box.insert(tk.END, "Analiz yapılıyor...\n")
        self.result_box.config(state="disabled")
        self.progress.start(10)
        self.analyze_button.config(state="disabled")
        self.batch_analyze_button.config(state="disabled")
        self.browse_button.config(state="disabled")
        self.save_button.config(state="disabled")
        self.clear_results_button.config(state="disabled")
        self.search_button.config(state="disabled")

    def run_analysis(self, apk_path):
        try:
            result = detect_framework(apk_path)
            self.root.after(0, self.show_result, result)
        except Exception as e:
            self.root.after(0, self.show_error, str(e))

    def run_batch_analysis(self, files):
        for apk_path in files:
            self.root.after(0, self.append_result, f"\nAnaliz ediliyor: {apk_path}\n")
            try:
                result = detect_framework(apk_path)
                self.root.after(0, self.append_result, f"Tespit Edilen Framework: {result}\n")
            except Exception as e:
                self.root.after(0, self.append_result, f"Hata: {e}\n")
        self.root.after(0, self.finish_analysis)

    def show_result(self, result):
        self.progress.stop()
        self.enable_buttons()
        self.result_box.config(state="normal")
        self.result_box.insert(tk.END, f"Tespit Edilen Framework: {result}\n")
        self.result_box.config(state="disabled")

    def append_result(self, text):
        self.result_box.config(state="normal")
        self.result_box.insert(tk.END, text)
        self.result_box.config(state="disabled")
        self.result_box.see(tk.END)

    def finish_analysis(self):
        self.progress.stop()
        self.enable_buttons()
        self.append_result("\nToplu analiz tamamlandı.")

    def show_error(self, message):
        self.progress.stop()
        self.enable_buttons()
        messagebox.showerror("Analiz Hatası", f"Bir hata oluştu:\n{message}")

    def enable_buttons(self):
        self.analyze_button.config(state="normal")
        self.batch_analyze_button.config(state="normal")
        self.browse_button.config(state="normal")
        self.save_button.config(state="normal")
        self.clear_results_button.config(state="normal")
        self.search_button.config(state="normal")

    def save_results(self):
        content = self.result_box.get("1.0", tk.END).strip()
        if not content:
            messagebox.showinfo("Bilgi", "Kaydedilecek sonuç yok.")
            return
        save_path = filedialog.asksaveasfilename(
            title="Sonuçları Kaydet",
            defaultextension=".txt",
            filetypes=[("Metin Dosyası", "*.txt"), ("Tüm Dosyalar", "*.*")]
        )
        if save_path:
            try:
                with open(save_path, "w", encoding="utf-8") as f:
                    f.write(content)
                messagebox.showinfo("Başarılı", f"Sonuçlar kaydedildi:\n{save_path}")
            except Exception as e:
                messagebox.showerror("Hata", f"Dosya kaydedilirken hata oluştu:\n{e}")

    def clear_results(self):
        self.result_box.config(state="normal")
        self.result_box.delete("1.0", tk.END)
        self.result_box.config(state="disabled")

    def search_text(self):
        target = self.search_var.get().strip()
        if not target:
            messagebox.showinfo("Bilgi", "Lütfen aranacak kelimeyi girin.")
            return

        self.result_box.tag_remove("found", "1.0", tk.END)

        start_pos = "1.0"
        found = False
        while True:
            start_pos = self.result_box.search(target, start_pos, nocase=1, stopindex=tk.END)
            if not start_pos:
                break
            end_pos = f"{start_pos}+{len(target)}c"
            self.result_box.tag_add("found", start_pos, end_pos)
            start_pos = end_pos
            found = True

        if found:
            self.result_box.tag_config("found", background="yellow", foreground="black")
            # İlk bulduğu yere git
            self.result_box.see(start_pos)
        else:
            messagebox.showinfo("Bilgi", f"'{target}' kelimesi sonuçlarda bulunamadı.")

if __name__ == "__main__":
    root = tk.Tk()
    app = DeCodeKitApp(root)
    root.mainloop()
