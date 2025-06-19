package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class lb implements nb {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1765a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Long> f1766b;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1765a = q2Var.d("measurement.service.directly_maybe_log_error_events", false);
        f1766b = q2Var.b("measurement.id.service.directly_maybe_log_error_events", 0L);
    }

    @Override // c.a.b.b.g.c.nb
    public final boolean a() {
        return true;
    }

    @Override // c.a.b.b.g.c.nb
    public final boolean b() {
        return f1765a.o().booleanValue();
    }
}
