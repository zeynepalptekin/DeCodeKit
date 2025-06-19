package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import androidx.annotation.RecentlyNonNull;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@com.google.android.gms.common.internal.v
@com.google.android.gms.common.annotation.a
@Deprecated
/* loaded from: classes.dex */
public final class q {
    private q() {
    }

    @com.google.android.gms.common.annotation.a
    public static void a(@Nullable ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void b(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static long c(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream) throws IOException {
        return i(inputStream, outputStream, false);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static long d(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream, @RecentlyNonNull boolean z, @RecentlyNonNull int r10) throws IOException {
        byte[] bArr = new byte[r10];
        long j = 0;
        while (true) {
            try {
                int r4 = inputStream.read(bArr, 0, r10);
                if (r4 == -1) {
                    break;
                }
                j += r4;
                outputStream.write(bArr, 0, r4);
            } finally {
                if (z) {
                    b(inputStream);
                    b(outputStream);
                }
            }
        }
        return j;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean e(@RecentlyNonNull byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static byte[] f(@RecentlyNonNull InputStream inputStream) throws IOException {
        return g(inputStream, true);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static byte[] g(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static byte[] h(@RecentlyNonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.android.gms.common.internal.r.k(inputStream);
        com.google.android.gms.common.internal.r.k(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int r2 = inputStream.read(bArr);
            if (r2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, r2);
        }
    }

    @Deprecated
    private static long i(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        return d(inputStream, outputStream, z, 1024);
    }
}
