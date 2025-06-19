import zipfile
import subprocess
import os
import shutil

def detect_framework(apk_path):
    print(f"[+] APK analiz ediliyor: {apk_path}")
    framework = "Bilinmiyor"

    try:
        with zipfile.ZipFile(apk_path, 'r') as apk:
            namelist = apk.namelist()

            if any("libflutter.so" in name for name in namelist):
                return "Flutter"
            elif any("index.android.bundle" in name for name in namelist):
                return "React Native"
            elif any("libmonodroid.so" in name for name in namelist):
                return "Xamarin"
            elif any("kotlin/" in name for name in namelist):
                return "Kotlin"
            elif "classes.dex" in namelist:
                framework = "Java"

        # JADX ile analiz
        print("[*] JADX ile detaylı analiz başlatılıyor...")
        jadx_path = "C:\\Users\\zeyne\\Desktop\\jadx-1.5.2\\bin\\jadx.bat"  
        output_dir = "decompiled_output"

        if os.path.exists(output_dir):
            shutil.rmtree(output_dir)

        subprocess.run([jadx_path, "-d", output_dir, apk_path])

        # .java dosyalarında framework izlerini ara
        for root, _, files in os.walk(output_dir):
            for file in files:
                if file.endswith(".java"):
                    with open(os.path.join(root, file), 'r', errors='ignore') as f:
                        content = f.read().lower()

                        if "com.facebook.react" in content or "reactrootview" in content:
                            return "React Native (jadx)"
                        if "io.flutter" in content or "flutteractivity" in content:
                            return "Flutter (jadx)"
                        if "mono.android" in content or "monoruntime" in content:
                            return "Xamarin (jadx)"
                        if "cordova" in content or "org.apache.cordova" in content:
                            return "Cordova (jadx)"
                        if "unityplayeractivity" in content or "com.unity3d.player" in content:
                            return "Unity (jadx)"

    except Exception as e:
        print(f"[!] Hata: {e}")
        framework = "Analiz hatası"

    return framework
