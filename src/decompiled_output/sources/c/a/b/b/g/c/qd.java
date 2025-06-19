package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class qd implements rd {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1802a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1803b;

    /* renamed from: c, reason: collision with root package name */
    private static final l2<Boolean> f1804c;
    private static final l2<Boolean> d;
    private static final l2<Long> e;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1802a = q2Var.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f1803b = q2Var.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f1804c = q2Var.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = q2Var.d("measurement.sdk.collection.last_gclid_from_referrer2", false);
        e = q2Var.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // c.a.b.b.g.c.rd
    public final boolean a() {
        return f1802a.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.rd
    public final boolean b() {
        return f1803b.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.rd
    public final boolean c() {
        return f1804c.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.rd
    public final boolean d() {
        return d.o().booleanValue();
    }
}
