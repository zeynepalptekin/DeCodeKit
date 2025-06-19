package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class xb implements ub {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1861a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1862b;

    /* renamed from: c, reason: collision with root package name */
    private static final l2<Long> f1863c;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1861a = q2Var.d("measurement.service.configurable_service_limits", true);
        f1862b = q2Var.d("measurement.client.configurable_service_limits", true);
        f1863c = q2Var.b("measurement.id.service.configurable_service_limits", 0L);
    }

    @Override // c.a.b.b.g.c.ub
    public final boolean a() {
        return true;
    }

    @Override // c.a.b.b.g.c.ub
    public final boolean b() {
        return f1861a.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.ub
    public final boolean c() {
        return f1862b.o().booleanValue();
    }
}
