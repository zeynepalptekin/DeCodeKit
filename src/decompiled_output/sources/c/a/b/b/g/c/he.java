package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class he implements ee {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1718a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Double> f1719b;

    /* renamed from: c, reason: collision with root package name */
    private static final l2<Long> f1720c;
    private static final l2<Long> d;
    private static final l2<String> e;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1718a = q2Var.d("measurement.test.boolean_flag", false);
        f1719b = q2Var.a("measurement.test.double_flag", -3.0d);
        f1720c = q2Var.b("measurement.test.int_flag", -2L);
        d = q2Var.b("measurement.test.long_flag", -1L);
        e = q2Var.c("measurement.test.string_flag", "---");
    }

    @Override // c.a.b.b.g.c.ee
    public final boolean a() {
        return f1718a.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.ee
    public final double b() {
        return f1719b.o().doubleValue();
    }

    @Override // c.a.b.b.g.c.ee
    public final long c() {
        return f1720c.o().longValue();
    }

    @Override // c.a.b.b.g.c.ee
    public final long d() {
        return d.o().longValue();
    }

    @Override // c.a.b.b.g.c.ee
    public final String f() {
        return e.o();
    }
}
