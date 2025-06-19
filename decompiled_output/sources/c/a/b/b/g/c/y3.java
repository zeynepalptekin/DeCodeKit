package c.a.b.b.g.c;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class y3<T> implements Iterator<T> {
    private int d;
    private int e;
    private int f;
    private final /* synthetic */ r3 g;

    private y3(r3 r3Var) {
        this.g = r3Var;
        this.d = this.g.h;
        this.e = this.g.p();
        this.f = -1;
    }

    /* synthetic */ y3(r3 r3Var, u3 u3Var) {
        this(r3Var);
    }

    private final void c() {
        if (this.g.h != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    abstract T b(int r1);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.e >= 0;
    }

    @Override // java.util.Iterator
    public T next() {
        c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int r0 = this.e;
        this.f = r0;
        T tB = b(r0);
        this.e = this.g.a(this.e);
        return tB;
    }

    @Override // java.util.Iterator
    public void remove() {
        c();
        g3.h(this.f >= 0, "no calls to next() since the last call to remove()");
        this.d += 32;
        r3 r3Var = this.g;
        r3Var.remove(r3Var.f[this.f]);
        this.e = r3.h(this.e, this.f);
        this.f = -1;
    }
}
