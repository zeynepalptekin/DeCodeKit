package c.a.b.b.g.c;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class i9<E> extends s5<E> implements RandomAccess {
    private static final i9<Object> g;
    private E[] e;
    private int f;

    static {
        i9<Object> i9Var = new i9<>(new Object[0], 0);
        g = i9Var;
        i9Var.b();
    }

    i9() {
        this(new Object[10], 0);
    }

    private i9(E[] eArr, int r2) {
        this.e = eArr;
        this.f = r2;
    }

    private final void h(int r2) {
        if (r2 < 0 || r2 >= this.f) {
            throw new IndexOutOfBoundsException(i(r2));
        }
    }

    private final String i(int r4) {
        int r0 = this.f;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(r4);
        sb.append(", Size:");
        sb.append(r0);
        return sb.toString();
    }

    public static <E> i9<E> j() {
        return (i9<E>) g;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final void add(int r5, E e) {
        int r0;
        c();
        if (r5 < 0 || r5 > (r0 = this.f)) {
            throw new IndexOutOfBoundsException(i(r5));
        }
        E[] eArr = this.e;
        if (r0 < eArr.length) {
            System.arraycopy(eArr, r5, eArr, r5 + 1, r0 - r5);
        } else {
            E[] eArr2 = (E[]) new Object[((r0 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, r5);
            System.arraycopy(this.e, r5, eArr2, r5 + 1, this.f - r5);
            this.e = eArr2;
        }
        this.e[r5] = e;
        this.f++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        c();
        int r0 = this.f;
        E[] eArr = this.e;
        if (r0 == eArr.length) {
            this.e = (E[]) Arrays.copyOf(eArr, ((r0 * 3) / 2) + 1);
        }
        E[] eArr2 = this.e;
        int r1 = this.f;
        this.f = r1 + 1;
        eArr2[r1] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // c.a.b.b.g.c.r7
    public final /* synthetic */ r7 e(int r3) {
        if (r3 >= this.f) {
            return new i9(Arrays.copyOf(this.e, r3), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int r2) {
        h(r2);
        return this.e[r2];
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final E remove(int r5) {
        c();
        h(r5);
        E[] eArr = this.e;
        E e = eArr[r5];
        if (r5 < this.f - 1) {
            System.arraycopy(eArr, r5 + 1, eArr, r5, (r2 - r5) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final E set(int r3, E e) {
        c();
        h(r3);
        E[] eArr = this.e;
        E e2 = eArr[r3];
        eArr[r3] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
