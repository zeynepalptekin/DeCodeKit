package c.a.b.b.g.c;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class x5 extends z5 {
    private int d = 0;
    private final int e;
    private final /* synthetic */ y5 f;

    x5(y5 y5Var) {
        this.f = y5Var;
        this.e = this.f.h();
    }

    @Override // c.a.b.b.g.c.d6
    public final byte a() {
        int r0 = this.d;
        if (r0 >= this.e) {
            throw new NoSuchElementException();
        }
        this.d = r0 + 1;
        return this.f.u(r0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e;
    }
}
