package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class yb implements zb {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1872a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1873b;

    /* renamed from: c, reason: collision with root package name */
    private static final l2<Boolean> f1874c;
    private static final l2<Long> d;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1872a = q2Var.d("measurement.client.consent_state_v1", false);
        f1873b = q2Var.d("measurement.client.3p_consent_state_v1", false);
        f1874c = q2Var.d("measurement.service.consent_state_v1_W36", false);
        d = q2Var.b("measurement.service.storage_consent_support_version", 203590L);
    }

    @Override // c.a.b.b.g.c.zb
    public final boolean a() {
        return true;
    }

    @Override // c.a.b.b.g.c.zb
    public final boolean b() {
        return f1872a.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.zb
    public final boolean c() {
        return f1873b.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.zb
    public final boolean d() {
        return f1874c.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.zb
    public final long f() {
        return d.o().longValue();
    }
}
