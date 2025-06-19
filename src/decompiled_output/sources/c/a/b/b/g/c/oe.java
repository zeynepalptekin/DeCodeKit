package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class oe implements qe {

    /* renamed from: a, reason: collision with root package name */
    private static final l2<Boolean> f1785a;

    /* renamed from: b, reason: collision with root package name */
    private static final l2<Long> f1786b;

    static {
        q2 q2Var = new q2(i2.a("com.google.android.gms.measurement"));
        f1785a = q2Var.d("measurement.service.ssaid_removal", true);
        f1786b = q2Var.b("measurement.id.ssaid_removal", 0L);
    }

    @Override // c.a.b.b.g.c.qe
    public final boolean a() {
        return true;
    }

    @Override // c.a.b.b.g.c.qe
    public final boolean b() {
        return f1785a.o().booleanValue();
    }
}
