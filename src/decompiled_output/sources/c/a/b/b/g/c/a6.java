package c.a.b.b.g.c;

import java.util.Comparator;

/* loaded from: classes.dex */
final class a6 implements Comparator<y5> {
    a6() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(y5 y5Var, y5 y5Var2) {
        y5 y5Var3 = y5Var;
        y5 y5Var4 = y5Var2;
        d6 d6Var = (d6) y5Var3.iterator();
        d6 d6Var2 = (d6) y5Var4.iterator();
        while (d6Var.hasNext() && d6Var2.hasNext()) {
            int r2 = Integer.compare(y5.v(d6Var.a()), y5.v(d6Var2.a()));
            if (r2 != 0) {
                return r2;
            }
        }
        return Integer.compare(y5Var3.h(), y5Var4.h());
    }
}
