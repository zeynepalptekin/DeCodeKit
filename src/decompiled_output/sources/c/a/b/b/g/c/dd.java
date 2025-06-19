package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class dd implements ed {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1674a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1675b;

    /* renamed from: c, reason: collision with root package name */
    private static final l2<Long> f1676c;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1674a = q2Var.d("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f1675b = q2Var.d("measurement.collection.redundant_engagement_removal_enabled", false);
        f1676c = q2Var.b("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // c.a.b.b.g.c.ed
    public final boolean a() {
        return f1674a.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.ed
    public final boolean b() {
        return f1675b.o().booleanValue();
    }
}
