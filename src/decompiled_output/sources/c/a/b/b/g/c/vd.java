package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class vd implements sd {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Long> f1844a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1845b;

    /* renamed from: c, reason: collision with root package name */
    private static final l2<Boolean> f1846c;
    private static final l2<Boolean> d;
    private static final l2<Long> e;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1844a = q2Var.b("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f1845b = q2Var.d("measurement.lifecycle.app_backgrounded_engagement", false);
        f1846c = q2Var.d("measurement.lifecycle.app_backgrounded_tracking", true);
        d = q2Var.d("measurement.lifecycle.app_in_background_parameter", false);
        e = q2Var.b("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // c.a.b.b.g.c.sd
    public final boolean a() {
        return f1845b.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.sd
    public final boolean b() {
        return d.o().booleanValue();
    }
}
