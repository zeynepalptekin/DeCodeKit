package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class qt1 {
    public static File a(@androidx.annotation.h0 File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File b(String str, @androidx.annotation.h0 File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(file, str), false);
    }

    public static File c(String str, String str2, @androidx.annotation.h0 File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(b(str, file), str2);
    }

    public static boolean d(@androidx.annotation.h0 File file, @androidx.annotation.h0 byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                com.google.android.gms.common.util.q.b(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                com.google.android.gms.common.util.q.b(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                com.google.android.gms.common.util.q.b(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean e(@androidx.annotation.h0 File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            z = true;
            for (int r4 = 0; r4 < length; r4++) {
                File file2 = fileArrListFiles[r4];
                z = file2 != null && e(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    public static byte[] f(@androidx.annotation.h0 File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (IOException unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArrC = a82.H(fileInputStream).c();
            com.google.android.gms.common.util.q.b(fileInputStream);
            return bArrC;
        } catch (IOException unused2) {
            com.google.android.gms.common.util.q.b(fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            com.google.android.gms.common.util.q.b(fileInputStream2);
            throw th;
        }
    }
}
