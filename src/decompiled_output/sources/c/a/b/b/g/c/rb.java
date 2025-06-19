package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class rb implements ob {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1809a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Long> f1810b;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1809a = q2Var.d("measurement.sdk.attribution.cache", true);
        f1810b = q2Var.b("measurement.sdk.attribution.cache.ttl", 604800000L);
    }

    @Override // c.a.b.b.g.c.ob
    public final boolean a() {
        return f1809a.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.ob
    public final long b() {
        return f1810b.o().longValue();
    }
}
