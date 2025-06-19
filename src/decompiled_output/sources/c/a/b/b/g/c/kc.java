package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class kc implements lc {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1746a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1747b;

    /* renamed from: c, reason: collision with root package name */
    private static final l2<Boolean> f1748c;
    private static final l2<Boolean> d;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1746a = q2Var.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f1747b = q2Var.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f1748c = q2Var.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = q2Var.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // c.a.b.b.g.c.lc
    public final boolean a() {
        return true;
    }

    @Override // c.a.b.b.g.c.lc
    public final boolean b() {
        return f1747b.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.lc
    public final boolean c() {
        return f1748c.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.lc
    public final boolean d() {
        return d.o().booleanValue();
    }
}
