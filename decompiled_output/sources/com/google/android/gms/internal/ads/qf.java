package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class qf {

    /* renamed from: a, reason: collision with root package name */
    private static String f4994a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4995b = Log.isLoggable("Volley", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final String f4996c = qf.class.getName();

    static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f4997c = qf.f4995b;

        /* renamed from: a, reason: collision with root package name */
        private final List<sh> f4998a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f4999b = false;

        a() {
        }

        public final synchronized void a(String str, long j) {
            if (this.f4999b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f4998a.add(new sh(str, j, SystemClock.elapsedRealtime()));
        }

        public final synchronized void b(String str) {
            this.f4999b = true;
            long j = this.f4998a.size() == 0 ? 0L : this.f4998a.get(this.f4998a.size() - 1).f5260c - this.f4998a.get(0).f5260c;
            if (j <= 0) {
                return;
            }
            long j2 = this.f4998a.get(0).f5260c;
            qf.a("(%-4d ms) %s", Long.valueOf(j), str);
            for (sh shVar : this.f4998a) {
                long j3 = shVar.f5260c;
                qf.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(shVar.f5259b), shVar.f5258a);
                j2 = j3;
            }
        }

        protected final void finalize() throws Throwable {
            if (this.f4999b) {
                return;
            }
            b("Request on the loose");
            qf.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public static void a(String str, Object... objArr) {
        Log.d(f4994a, d(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.e(f4994a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (f4995b) {
            Log.v(f4994a, d(str, objArr));
        }
    }

    private static String d(String str, Object... objArr) {
        String string;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int r1 = 2;
        while (true) {
            if (r1 >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[r1].getClassName().equals(f4996c)) {
                String className = stackTrace[r1].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[r1].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(strSubstring2);
                sb.append(".");
                sb.append(methodName);
                string = sb.toString();
                break;
            }
            r1++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str);
    }

    public static void e(Throwable th, String str, Object... objArr) {
        Log.e(f4994a, d(str, objArr), th);
    }
}
