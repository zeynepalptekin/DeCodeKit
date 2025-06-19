package c.a.b.b.g.c;

/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1832a;

    public u2(x2 x2Var) {
        g3.c(x2Var, "BuildInfo must be non-null");
        this.f1832a = !x2Var.a();
    }

    public final boolean a(String str) {
        g3.c(str, "flagName must not be null");
        if (this.f1832a) {
            return w2.f1851a.a().b(str);
        }
        return true;
    }
}
