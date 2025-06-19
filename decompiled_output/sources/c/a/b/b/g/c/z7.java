package c.a.b.b.g.c;

/* loaded from: classes.dex */
public class z7 {
    private static final u6 d = u6.a();

    /* renamed from: a, reason: collision with root package name */
    private y5 f1876a;

    /* renamed from: b, reason: collision with root package name */
    private volatile r8 f1877b;

    /* renamed from: c, reason: collision with root package name */
    private volatile y5 f1878c;

    private final r8 c(r8 r8Var) {
        if (this.f1877b == null) {
            synchronized (this) {
                if (this.f1877b == null) {
                    try {
                        this.f1877b = r8Var;
                        this.f1878c = y5.e;
                    } catch (q7 unused) {
                        this.f1877b = r8Var;
                        this.f1878c = y5.e;
                    }
                }
            }
        }
        return this.f1877b;
    }

    public final r8 a(r8 r8Var) {
        r8 r8Var2 = this.f1877b;
        this.f1876a = null;
        this.f1878c = null;
        this.f1877b = r8Var;
        return r8Var2;
    }

    public final int b() {
        if (this.f1878c != null) {
            return this.f1878c.h();
        }
        if (this.f1877b != null) {
            return this.f1877b.b();
        }
        return 0;
    }

    public final y5 d() {
        if (this.f1878c != null) {
            return this.f1878c;
        }
        synchronized (this) {
            if (this.f1878c != null) {
                return this.f1878c;
            }
            this.f1878c = this.f1877b == null ? y5.e : this.f1877b.e();
            return this.f1878c;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        r8 r8Var = this.f1877b;
        r8 r8Var2 = z7Var.f1877b;
        return (r8Var == null && r8Var2 == null) ? d().equals(z7Var.d()) : (r8Var == null || r8Var2 == null) ? r8Var != null ? r8Var.equals(z7Var.c(r8Var.g())) : c(r8Var2.g()).equals(r8Var2) : r8Var.equals(r8Var2);
    }

    public int hashCode() {
        return 1;
    }
}
