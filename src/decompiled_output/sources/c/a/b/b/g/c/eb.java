package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class eb implements bb {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1678a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1679b;

    /* renamed from: c, reason: collision with root package name */
    private static final l2<Boolean> f1680c;
    private static final l2<Long> d;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1678a = q2Var.d("measurement.client.ad_impression", true);
        f1679b = q2Var.d("measurement.service.separate_public_internal_event_blacklisting", false);
        f1680c = q2Var.d("measurement.service.ad_impression", false);
        d = q2Var.b("measurement.id.service.ad_impression", 0L);
    }

    @Override // c.a.b.b.g.c.bb
    public final boolean a() {
        return true;
    }

    @Override // c.a.b.b.g.c.bb
    public final boolean b() {
        return f1678a.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.bb
    public final boolean c() {
        return f1679b.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.bb
    public final boolean d() {
        return f1680c.o().booleanValue();
    }
}
