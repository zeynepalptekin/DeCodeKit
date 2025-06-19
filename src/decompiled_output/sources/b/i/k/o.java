package b.i.k;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.h0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1067a = "TraceCompat";

    /* renamed from: b, reason: collision with root package name */
    private static long f1068b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f1069c;
    private static Method d;
    private static Method e;
    private static Method f;

    static {
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 18 || r1 >= 29) {
            return;
        }
        try {
            f1068b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            f1069c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
        } catch (Exception e2) {
            Log.i(f1067a, "Unable to initialize via reflection.", e2);
        }
    }

    private o() {
    }

    public static void a(@h0 String str, int r7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 29) {
            Trace.beginAsyncSection(str, r7);
        } else if (r0 >= 18) {
            try {
                d.invoke(null, Long.valueOf(f1068b), str, Integer.valueOf(r7));
            } catch (Exception unused) {
                Log.v(f1067a, "Unable to invoke asyncTraceBegin() via reflection.");
            }
        }
    }

    public static void b(@h0 String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void c(@h0 String str, int r7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 29) {
            Trace.endAsyncSection(str, r7);
        } else if (r0 >= 18) {
            try {
                e.invoke(null, Long.valueOf(f1068b), str, Integer.valueOf(r7));
            } catch (Exception unused) {
                Log.v(f1067a, "Unable to invoke endAsyncSection() via reflection.");
            }
        }
    }

    public static void d() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static boolean e() {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 29) {
            return Trace.isEnabled();
        }
        if (r0 >= 18) {
            try {
                return ((Boolean) f1069c.invoke(null, Long.valueOf(f1068b))).booleanValue();
            } catch (Exception unused) {
                Log.v(f1067a, "Unable to invoke isTagEnabled() via reflection.");
            }
        }
        return false;
    }

    public static void f(@h0 String str, int r7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 29) {
            Trace.setCounter(str, r7);
        } else if (r0 >= 18) {
            try {
                f.invoke(null, Long.valueOf(f1068b), str, Integer.valueOf(r7));
            } catch (Exception unused) {
                Log.v(f1067a, "Unable to invoke traceCounter() via reflection.");
            }
        }
    }
}
