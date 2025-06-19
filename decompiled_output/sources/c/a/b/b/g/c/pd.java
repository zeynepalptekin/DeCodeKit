package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class pd implements ld {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1790a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1791b;

    /* renamed from: c, reason: collision with root package name */
    private static final l2<Boolean> f1792c;
    private static final l2<Long> d;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1790a = q2Var.d("measurement.client.global_params", true);
        f1791b = q2Var.d("measurement.service.global_params_in_payload", true);
        f1792c = q2Var.d("measurement.service.global_params", true);
        d = q2Var.b("measurement.id.service.global_params", 0L);
    }

    @Override // c.a.b.b.g.c.ld
    public final boolean a() {
        return true;
    }

    @Override // c.a.b.b.g.c.ld
    public final boolean b() {
        return f1790a.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.ld
    public final boolean c() {
        return f1791b.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.ld
    public final boolean d() {
        return f1792c.o().booleanValue();
    }
}
