package c.a.b.b.g.c;

import android.content.Context;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class t1 extends t2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1821a;

    /* renamed from: b, reason: collision with root package name */
    private final h3<c3<h2>> f1822b;

    t1(Context context, @Nullable h3<c3<h2>> h3Var) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f1821a = context;
        this.f1822b = h3Var;
    }

    @Override // c.a.b.b.g.c.t2
    final Context a() {
        return this.f1821a;
    }

    @Override // c.a.b.b.g.c.t2
    @Nullable
    final h3<c3<h2>> b() {
        return this.f1822b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t2) {
            t2 t2Var = (t2) obj;
            if (this.f1821a.equals(t2Var.a())) {
                h3<c3<h2>> h3Var = this.f1822b;
                h3<c3<h2>> h3VarB = t2Var.b();
                if (h3Var != null ? h3Var.equals(h3VarB) : h3VarB == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int r0 = (this.f1821a.hashCode() ^ 1000003) * 1000003;
        h3<c3<h2>> h3Var = this.f1822b;
        return r0 ^ (h3Var == null ? 0 : h3Var.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f1821a);
        String strValueOf2 = String.valueOf(this.f1822b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 46 + String.valueOf(strValueOf2).length());
        sb.append("FlagsContext{context=");
        sb.append(strValueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
