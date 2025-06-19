package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class be implements yd {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Long> f1665a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Long> f1666b;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1665a = q2Var.b("measurement.id.max_bundles_per_iteration", 0L);
        f1666b = q2Var.b("measurement.max_bundles_per_iteration", 2L);
    }

    @Override // c.a.b.b.g.c.yd
    public final long a() {
        return f1666b.o().longValue();
    }
}
