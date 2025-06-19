package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class wd implements xd {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1853a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1854b;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1853a = q2Var.d("measurement.sdk.screen.manual_screen_view_logging", true);
        f1854b = q2Var.d("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    @Override // c.a.b.b.g.c.xd
    public final boolean a() {
        return true;
    }

    @Override // c.a.b.b.g.c.xd
    public final boolean b() {
        return f1853a.o().booleanValue();
    }

    @Override // c.a.b.b.g.c.xd
    public final boolean c() {
        return f1854b.o().booleanValue();
    }
}
