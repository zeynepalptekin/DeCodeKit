package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class kb implements hb {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1744a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1745b;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1744a = q2Var.d("measurement.androidId.delete_feature", true);
        f1745b = q2Var.d("measurement.log_androidId_enabled", false);
    }

    @Override // c.a.b.b.g.c.hb
    public final boolean a() {
        return f1744a.o().booleanValue();
    }
}
