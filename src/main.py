import argparse
from framework_detector import detect_framework

def main():
    parser = argparse.ArgumentParser(description="DeCodeKit - Framework Detection Tool")
    parser.add_argument('--input', required=True, help='Path to APK file')
    parser.add_argument('--output', required=False, help='Output file path (optional)')

    args = parser.parse_args()
    framework = detect_framework(args.input)

    print(f"Detected Framework: {framework}")  # 👈 Terminal çıktısı

    if args.output:
        with open(args.output, 'w') as f:
            f.write(f"Detected Framework: {framework}\n")

if __name__ == '__main__':
    main()
