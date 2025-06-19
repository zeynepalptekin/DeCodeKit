import zipfile
import subprocess
import os
import shutil

def check_namelist_for_framework(namelist):
    # Zip içeriğine bakarak framework tespiti
    if any("libflutter.so" in name for name in namelist):
        return "Flutter"
    elif any("index.android.bundle" in name for name in namelist):
        return "React Native"
    elif any("libmonodroid.so" in name for name in namelist):
        return "Xamarin"
    elif any("kotlin/" in name for name in namelist):
        return "Kotlin"
    elif any("cordova.js" in name or "config.xml" in name for name in namelist):
        return "Cordova"
    elif any("libunity.so" in name for name in namelist):
        return "Unity"
    elif any("tns_modules/" in name for name in namelist):
        return "NativeScript"
    elif any("phonegap.js" in name for name in namelist):
        return "PhoneGap"
    elif any("ionic.bundle.js" in name for name in namelist):
        return "Ionic"
    elif "classes.dex" in namelist:
        return "Java"
    else:
        return None

def check_java_files_for_framework(decompiled_dir):
    # JADX ile decompile edilmiş .java dosyalarında arama
    for root, _, files in os.walk(decompiled_dir):
        for file in files:
            if file.endswith(".java"):
                try:
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
                        if "com.tns" in content or "nativescript" in content:
                            return "NativeScript (jadx)"
                        if "phonegap" in content or "com.phonegap" in content:
                            return "PhoneGap (jadx)"
                        if "ionic" in content and "angular" in content:
                            return "Ionic (jadx)"
                except Exception:
                    continue
    return None

def detect_framework(apk_path):
    print(f"[+] APK analiz ediliyor: {apk_path}")
    framework = "Bilinmiyor"
    output_dir = "decompiled_output"

    try:
        with zipfile.ZipFile(apk_path, 'r') as apk:
            namelist = apk.namelist()

            result = check_namelist_for_framework(namelist)
            if result:
                return result

        print("[*] JADX ile detaylı analiz başlatılıyor...")
        jadx_path = "C:\\Users\\zeyne\\Desktop\\jadx-1.5.2\\bin\\jadx.bat"

        if os.path.exists(output_dir):
            shutil.rmtree(output_dir)

        completed = subprocess.run([jadx_path, "-d", output_dir, apk_path], capture_output=True, text=True)

        if completed.returncode != 0:
            print(f"[!] JADX hata verdi:\n{completed.stderr}")
            return "Analiz hatası"

        result = check_java_files_for_framework(output_dir)
        if result:
            return result

    except Exception as e:
        print(f"[!] Hata: {e}")
        framework = "Analiz hatası"

    return framework
