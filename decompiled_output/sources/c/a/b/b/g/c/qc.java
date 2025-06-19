package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class qc implements mc {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1800a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Long> f1801b;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1800a = q2Var.d("measurement.sdk.referrer.delayed_install_referrer_api", false);
        f1801b = q2Var.b("measurement.id.sdk.referrer.delayed_install_referrer_api", 0L);
    }

    @Override // c.a.b.b.g.c.mc
    public final boolean a() {
        return true;
    }

    @Override // c.a.b.b.g.c.mc
    public final boolean b() {
        return f1800a.o().booleanValue();
    }
}
