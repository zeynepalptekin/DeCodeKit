package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.RecentlyNullable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private static String f2598a;

    /* renamed from: b, reason: collision with root package name */
    private static int f2599b;

    private x() {
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static String a() {
        if (f2598a == null) {
            if (f2599b == 0) {
                f2599b = Process.myPid();
            }
            f2598a = c(f2599b);
        }
        return f2598a;
    }

    private static BufferedReader b(String str) throws IOException {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Nullable
    private static String c(int r4) throws Throwable {
        Throwable th;
        BufferedReader bufferedReaderB;
        String strTrim = null;
        if (r4 <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(r4);
            sb.append("/cmdline");
            bufferedReaderB = b(sb.toString());
        } catch (IOException unused) {
            bufferedReaderB = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReaderB = null;
        }
        try {
            strTrim = ((String) com.google.android.gms.common.internal.r.k(bufferedReaderB.readLine())).trim();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
            q.b(bufferedReaderB);
            throw th;
        }
        q.b(bufferedReaderB);
        return strTrim;
    }
}
