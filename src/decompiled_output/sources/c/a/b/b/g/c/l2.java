package c.a.b.b.g.c;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class l2<T> {

    @Nullable
    private static volatile t2 h = null;
    private static volatile boolean i = false;

    /* renamed from: a, reason: collision with root package name */
    private final q2 f1752a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1753b;

    /* renamed from: c, reason: collision with root package name */
    private final T f1754c;
    private volatile int d;
    private volatile T e;
    private final boolean f;
    private static final Object g = new Object();
    private static final AtomicReference<Collection<l2<?>>> j = new AtomicReference<>();
    private static u2 k = new u2(n2.f1778a);
    private static final AtomicInteger l = new AtomicInteger();

    private l2(q2 q2Var, String str, T t, boolean z) {
        this.d = -1;
        if (q2Var.f1796b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f1752a = q2Var;
        this.f1753b = str;
        this.f1754c = t;
        this.f = z;
    }

    /* synthetic */ l2(q2 q2Var, String str, Object obj, boolean z, m2 m2Var) {
        this(q2Var, str, obj, z);
    }

    private final String f(String str) {
        if (str != null && str.isEmpty()) {
            return this.f1753b;
        }
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(this.f1753b);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    static void g() {
        l.incrementAndGet();
    }

    @Deprecated
    public static void h(final Context context) {
        synchronized (g) {
            t2 t2Var = h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (t2Var == null || t2Var.a() != context) {
                w1.d();
                s2.b();
                b2.b();
                h = new t1(context, k3.a(new h3(context) { // from class: c.a.b.b.g.c.k2
                    private final Context d;

                    {
                        this.d = context;
                    }

                    @Override // c.a.b.b.g.c.h3
                    public final Object a() {
                        return l2.m(this.d);
                    }
                }));
                l.incrementAndGet();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l2<Double> i(q2 q2Var, String str, double d, boolean z) {
        return new o2(q2Var, str, Double.valueOf(-3.0d), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l2<Long> j(q2 q2Var, String str, long j2, boolean z) {
        return new m2(q2Var, str, Long.valueOf(j2), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l2<String> k(q2 q2Var, String str, String str2, boolean z) {
        return new r2(q2Var, str, str2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l2<Boolean> l(q2 q2Var, String str, boolean z, boolean z2) {
        return new p2(q2Var, str, Boolean.valueOf(z), true);
    }

    static final /* synthetic */ c3 m(Context context) {
        new g2();
        return g2.b(context);
    }

    static final /* synthetic */ boolean p() {
        return true;
    }

    abstract T e(Object obj);

    public final String n() {
        return f(this.f1752a.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[Catch: all -> 0x0112, TryCatch #0 {, blocks: (B:8:0x001c, B:10:0x0020, B:14:0x0029, B:16:0x0040, B:22:0x0051, B:24:0x0057, B:26:0x0065, B:30:0x0082, B:32:0x008c, B:50:0x00df, B:52:0x00ef, B:54:0x0105, B:55:0x0108, B:56:0x010c, B:43:0x00be, B:45:0x00d4, B:49:0x00dd, B:28:0x0078, B:33:0x0091, B:35:0x009a, B:37:0x00ac, B:39:0x00b7, B:38:0x00b1, B:57:0x0110), top: B:64:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef A[Catch: all -> 0x0112, TryCatch #0 {, blocks: (B:8:0x001c, B:10:0x0020, B:14:0x0029, B:16:0x0040, B:22:0x0051, B:24:0x0057, B:26:0x0065, B:30:0x0082, B:32:0x008c, B:50:0x00df, B:52:0x00ef, B:54:0x0105, B:55:0x0108, B:56:0x010c, B:43:0x00be, B:45:0x00d4, B:49:0x00dd, B:28:0x0078, B:33:0x0091, B:35:0x009a, B:37:0x00ac, B:39:0x00b7, B:38:0x00b1, B:57:0x0110), top: B:64:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T o() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.l2.o():java.lang.Object");
    }
}
