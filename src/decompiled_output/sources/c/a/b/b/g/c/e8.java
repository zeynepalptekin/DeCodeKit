package c.a.b.b.g.c;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class e8 extends s5<Long> implements o7, d9, RandomAccess {
    private static final e8 g;
    private long[] e;
    private int f;

    static {
        e8 e8Var = new e8(new long[0], 0);
        g = e8Var;
        e8Var.b();
    }

    e8() {
        this(new long[10], 0);
    }

    private e8(long[] jArr, int r2) {
        this.e = jArr;
        this.f = r2;
    }

    public static e8 i() {
        return g;
    }

    private final void j(int r2) {
        if (r2 < 0 || r2 >= this.f) {
            throw new IndexOutOfBoundsException(l(r2));
        }
    }

    private final String l(int r4) {
        int r0 = this.f;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(r4);
        sb.append(", Size:");
        sb.append(r0);
        return sb.toString();
    }

    @Override // c.a.b.b.g.c.r7
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final o7 e(int r3) {
        if (r3 >= this.f) {
            return new e8(Arrays.copyOf(this.e, r3), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r6, Object obj) {
        int r7;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (r6 < 0 || r6 > (r7 = this.f)) {
            throw new IndexOutOfBoundsException(l(r6));
        }
        long[] jArr = this.e;
        if (r7 < jArr.length) {
            System.arraycopy(jArr, r6, jArr, r6 + 1, r7 - r6);
        } else {
            long[] jArr2 = new long[((r7 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, r6);
            System.arraycopy(this.e, r6, jArr2, r6 + 1, this.f - r6);
            this.e = jArr2;
        }
        this.e[r6] = jLongValue;
        this.f++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        l7.d(collection);
        if (!(collection instanceof e8)) {
            return super.addAll(collection);
        }
        e8 e8Var = (e8) collection;
        int r0 = e8Var.f;
        if (r0 == 0) {
            return false;
        }
        int r3 = this.f;
        if (ActivityChooserView.f.j - r3 < r0) {
            throw new OutOfMemoryError();
        }
        int r32 = r3 + r0;
        long[] jArr = this.e;
        if (r32 > jArr.length) {
            this.e = Arrays.copyOf(jArr, r32);
        }
        System.arraycopy(e8Var.e, 0, this.e, this.f, e8Var.f);
        this.f = r32;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return super.equals(obj);
        }
        e8 e8Var = (e8) obj;
        if (this.f != e8Var.f) {
            return false;
        }
        long[] jArr = e8Var.e;
        for (int r1 = 0; r1 < this.f; r1++) {
            if (this.e[r1] != jArr[r1]) {
                return false;
            }
        }
        return true;
    }

    @Override // c.a.b.b.g.c.o7
    public final long g(int r4) {
        j(r4);
        return this.e[r4];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r3) {
        return Long.valueOf(g(r3));
    }

    public final void h(long j) {
        c();
        int r0 = this.f;
        long[] jArr = this.e;
        if (r0 == jArr.length) {
            long[] jArr2 = new long[((r0 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, r0);
            this.e = jArr2;
        }
        long[] jArr3 = this.e;
        int r1 = this.f;
        this.f = r1 + 1;
        jArr3[r1] = j;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r0 = 1;
        for (int r1 = 0; r1 < this.f; r1++) {
            r0 = (r0 * 31) + l7.b(this.e[r1]);
        }
        return r0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int r0 = 0; r0 < size; r0++) {
            if (this.e[r0] == jLongValue) {
                return r0;
            }
        }
        return -1;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int r6) {
        c();
        j(r6);
        long[] jArr = this.e;
        long j = jArr[r6];
        if (r6 < this.f - 1) {
            System.arraycopy(jArr, r6 + 1, jArr, r6, (r3 - r6) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r3, int r4) {
        c();
        if (r4 < r3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.e;
        System.arraycopy(jArr, r4, jArr, r3, this.f - r4);
        this.f -= r4 - r3;
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int r5, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        j(r5);
        long[] jArr = this.e;
        long j = jArr[r5];
        jArr[r5] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
