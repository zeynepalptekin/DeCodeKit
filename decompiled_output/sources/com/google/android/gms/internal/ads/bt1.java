package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class bt1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2875a;

    /* renamed from: b, reason: collision with root package name */
    private final xr1 f2876b;

    public bt1(@androidx.annotation.h0 Context context, xr1 xr1Var) {
        this.f2875a = context;
        this.f2876b = xr1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r3 r4
  0x0045: PHI (r3v1 'e' java.lang.Exception) = (r3v0 'e' java.lang.Exception), (r3v2 'e' java.lang.Exception) binds: [B:20:0x004c, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r4v1 com.google.android.gms.internal.ads.xr1) = (r4v0 com.google.android.gms.internal.ads.xr1), (r4v2 com.google.android.gms.internal.ads.xr1) binds: [B:20:0x004c, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String a() {
        /*
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "i686"
            java.lang.String r2 = "armv71"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.google.android.gms.internal.ads.av1 r1 = com.google.android.gms.internal.ads.av1.OS_ARCH
            java.lang.String r1 = r1.e()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L24
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L24
            return r1
        L24:
            r0 = 0
            r2 = 2024(0x7e8, float:2.836E-42)
            java.lang.Class<android.os.Build> r3 = android.os.Build.class
            java.lang.String r4 = "SUPPORTED_ABIS"
            java.lang.reflect.Field r3 = r3.getField(r4)     // Catch: java.lang.IllegalAccessException -> L40 java.lang.NoSuchFieldException -> L49
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.IllegalAccessException -> L40 java.lang.NoSuchFieldException -> L49
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch: java.lang.IllegalAccessException -> L40 java.lang.NoSuchFieldException -> L49
            if (r3 == 0) goto L4f
            int r4 = r3.length     // Catch: java.lang.IllegalAccessException -> L40 java.lang.NoSuchFieldException -> L49
            if (r4 <= 0) goto L4f
            r4 = 0
            r0 = r3[r4]     // Catch: java.lang.IllegalAccessException -> L40 java.lang.NoSuchFieldException -> L49
            return r0
        L40:
            r3 = move-exception
            com.google.android.gms.internal.ads.xr1 r4 = r5.f2876b
            if (r4 == 0) goto L4f
        L45:
            r4.b(r2, r0, r3)
            goto L4f
        L49:
            r3 = move-exception
            com.google.android.gms.internal.ads.xr1 r4 = r5.f2876b
            if (r4 == 0) goto L4f
            goto L45
        L4f:
            java.lang.String r0 = android.os.Build.CPU_ABI
            if (r0 == 0) goto L54
            return r0
        L54:
            java.lang.String r0 = android.os.Build.CPU_ABI2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bt1.a():java.lang.String");
    }

    private final ch2 b() throws IOException {
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(this.f2875a.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            return ch2.UNSUPPORTED;
        }
        File[] fileArrListFiles = file.listFiles(new jw1(Pattern.compile(".*\\.so$", 2)));
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return ch2.UNSUPPORTED;
        }
        try {
            fileInputStream = new FileInputStream(fileArrListFiles[0]);
            try {
                bArr = new byte[20];
            } finally {
            }
        } catch (IOException unused) {
        }
        if (fileInputStream.read(bArr) != 20) {
            fileInputStream.close();
            return ch2.UNSUPPORTED;
        }
        byte[] bArr2 = {0, 0};
        if (bArr[5] == 2) {
            d(bArr);
            ch2 ch2Var = ch2.UNSUPPORTED;
            fileInputStream.close();
            return ch2Var;
        }
        bArr2[0] = bArr[19];
        bArr2[1] = bArr[18];
        short s = ByteBuffer.wrap(bArr2).getShort();
        if (s == 3) {
            ch2 ch2Var2 = ch2.X86;
            fileInputStream.close();
            return ch2Var2;
        }
        if (s == 40) {
            ch2 ch2Var3 = ch2.ARM7;
            fileInputStream.close();
            return ch2Var3;
        }
        if (s == 62) {
            ch2 ch2Var4 = ch2.X86_64;
            fileInputStream.close();
            return ch2Var4;
        }
        if (s != 183) {
            ch2 ch2Var5 = ch2.UNSUPPORTED;
            fileInputStream.close();
            return ch2Var5;
        }
        ch2 ch2Var6 = ch2.ARM64;
        fileInputStream.close();
        return ch2Var6;
    }

    private final void d(byte[] bArr) {
        if (this.f2876b == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(av1.OS_ARCH.e());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";");
        sb.append("CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        this.f2876b.i(4007, sb.toString());
    }

    public final ch2 c() throws IOException {
        ch2 ch2VarB = b();
        if (ch2VarB != ch2.UNSUPPORTED) {
            return ch2VarB;
        }
        String strA = a();
        if (!TextUtils.isEmpty(strA)) {
            if (strA.equalsIgnoreCase("i686") || strA.equalsIgnoreCase("x86")) {
                return ch2.X86;
            }
            if (strA.equalsIgnoreCase("x86_64")) {
                return ch2.X86_64;
            }
            if (strA.equalsIgnoreCase("arm64-v8a")) {
                return ch2.ARM64;
            }
            if (strA.equalsIgnoreCase("armeabi-v7a") || strA.equalsIgnoreCase("armv71")) {
                return ch2.ARM7;
            }
        }
        d(null);
        return ch2.UNSUPPORTED;
    }
}
