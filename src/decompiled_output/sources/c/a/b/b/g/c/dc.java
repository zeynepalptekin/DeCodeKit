package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class dc implements ac {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1671a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1672b;

    /* renamed from: c, reason: collision with root package name */
    private static final l2<Boolean> f1673c;
    private static final l2<Long> d;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1671a = q2Var.d("measurement.sdk.dynamite.allow_remote_dynamite3", false);
        f1672b = q2Var.d("measurement.collection.init_params_control_enabled", true);
        f1673c = q2Var.d("measurement.sdk.dynamite.use_dynamite3", true);
        d = q2Var.b("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    @Override // c.a.b.b.g.c.ac
    public final boolean a() {
        return f1671a.o().booleanValue();
    }
}
