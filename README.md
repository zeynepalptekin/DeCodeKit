<div align="center">
  <img src="https://img.shields.io/github/languages/count/zeynepalptekin/DeCodeKit?style=flat-square&color=blueviolet" alt="Language Count">
  <img src="https://img.shields.io/github/languages/top/zeynepalptekin/DeCodeKit?style=flat-square&color=1e90ff" alt="Top Language">
  <img src="https://img.shields.io/github/last-commit/zeynepalptekin/DeCodeKit?style=flat-square&color=ff69b4" alt="Last Commit">
  <img src="https://img.shields.io/github/license/zeynepalptekin/DeCodeKit?style=flat-square&color=yellow" alt="License">
  <img src="https://img.shields.io/badge/Status-Active-green?style=flat-square" alt="Status">
  <img src="https://img.shields.io/badge/Contributions-Welcome-brightgreen?style=flat-square" alt="Contributions">
</div>

# DeCodeKit

*A reverse engineering tool for detecting development frameworks in Android APKs.*  
*Android APK dosyalarında kullanılan geliştirme framework’ünü tespit etmek için bir tersine mühendislik aracı.*

---

## Features / Özellikler

- **APK/XAPK Analysis:** Takes Android packages and decompiles them using JADX.  
  *APK/XAPK dosyalarını alır ve JADX ile decompile eder.*
- **Framework Detection:** Identifies if the app is developed with Flutter, React Native, Kotlin, Java, Xamarin, or others.  
  *Uygulamanın Flutter, React Native, Kotlin, Java, Xamarin veya diğerleriyle yazılıp yazılmadığını tespit eder.*
- **Clear Output:** Prints framework info in a user-friendly way.  
  *Kullanıcı dostu şekilde framework bilgisi verir.*
- **Extendable:** Easily add more framework signatures.  
  *Yeni framework imzaları kolayca eklenebilir.*

---

## Team / Ekip

- **219*****031** - Zeynep Alptekin: Developer & Researcher  
  *Geliştirici ve Araştırmacı*

## Roadmap / *Yol Haritası*

See our plans in [ROADMAP.md](ROADMAP.md).  
*Yolculuğu görmek için [ROADMAP.md](ROADMAP.md) dosyasına göz atın.*

---

## Research / *Araştırmalar*

| Topic / *Başlık*        | Link                                    | Description / *Açıklama*                        |
|-------------------------|-----------------------------------------|------------------------------------------------|
| Aircrack Deep Dive      | [researchs/aircrack.md](researchs/aircrack.md) | In-depth analysis of Aircrack-ng suite. / *Aircrack-ng paketinin derinlemesine analizi.* |
| Example Research Topic  | [researchs/your-research-file.md](researchs/your-research-file.md) | Brief overview of this research. / *Bu araştırmanın kısa bir özeti.* |
| Add More Research       | *Link to your other research files*     | *Description of the research*                  |

---

## Installation / *Kurulum*

1. **Clone the Repository / *Depoyu Klonlayın***:  
   ```bash
    git clone https://github.com/zeynepalptekin/DeCodeKit.git
   cd DeCodeKit
   ```

2. **Set Up Virtual Environment / *Sanal Ortam Kurulumu*** (Recommended):  
   ```bash
   python -m venv venv
   source venv/bin/activate  # On Windows: venv\Scripts\activate
   ```

3. **Install Dependencies / *Bağımlılıkları Yükleyin***:  
   ```bash
   pip install -r requirements.txt
   ```

---

## Usage / *Kullanım*

Run the project:  
*Projeyi çalıştırın:*

```bash
python main.py --input your_file.pcap --output results.txt
```

**Steps**:  
1. Prepare input data (*explain data needed*).  
2. Run the script with arguments (*explain key arguments*).  
3. Check output (*explain where to find results*).  

*Adımlar*:  
1. Giriş verilerini hazırlayın (*ne tür verilere ihtiyaç duyulduğunu açıklayın*).  
2. Betiği argümanlarla çalıştırın (*önemli argümanları açıklayın*).  
3. Çıktıyı kontrol edin (*sonuçları nerede bulacağınızı açıklayın*).

---

## Contributing / *Katkıda Bulunma*

We welcome contributions! To help:  
1. Fork the repository.  
2. Clone your fork (`git clone git@github.com:YOUR_USERNAME/YOUR_REPO.git`).  
3. Create a branch (`git checkout -b feature/your-feature`).  
4. Commit changes with clear messages.  
5. Push to your fork (`git push origin feature/your-feature`).  
6. Open a Pull Request.  

Follow our coding standards (see [CONTRIBUTING.md](CONTRIBUTING.md)).  

*Topluluk katkilerini memnuniyetle karşılıyoruz! Katkıda bulunmak için yukarıdaki adımları izleyin ve kodlama standartlarımıza uyun.*

---

## License / *Lisans*

Licensed under the [MIT License](LICENSE.md).  
*MIT Lisansı altında lisanslanmıştır.*

---

## Acknowledgements / *Teşekkürler* (Optional)

Thanks to:  
- Awesome Library: For enabling X.  
- Inspiration Source.  
- Special thanks to...  

*Teşekkürler: Harika kütüphaneler ve ilham kaynakları için.*

---

## Contact / *İletişim* (Optional)

Project Maintainer: [Zeynep Alptekin] - [zeynepp.alptekinn@gmail.com]  
Found a bug? Open an issue.  

*Proje Sorumlusu: [Zeynep Alptekin] - [zeynepp.alptekinn@gmail.com]. Hata bulursanız bir sorun bildirin.*

---

*Replace placeholders (e.g., YOUR_USERNAME/YOUR_REPO) with your project details.*
