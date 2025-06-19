package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class xc implements yc {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1864a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Boolean> f1865b;

    /* renamed from: c, reason: collision with root package name */
    private static final l2<Boolean> f1866c;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1864a = q2Var.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        f1865b = q2Var.d("measurement.client.sessions.check_on_startup", true);
        f1866c = q2Var.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // c.a.b.b.g.c.yc
    public final boolean a() {
        return true;
    }

    @Override // c.a.b.b.g.c.yc
    public final boolean b() {
        return f1864a.o().booleanValue();
    }
}
