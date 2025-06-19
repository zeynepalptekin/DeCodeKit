package c.a.b.b.g.c;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class w5 extends s5<Boolean> implements r7<Boolean>, d9, RandomAccess {
    private static final w5 g;
    private boolean[] e;
    private int f;

    static {
        w5 w5Var = new w5(new boolean[0], 0);
        g = w5Var;
        w5Var.b();
    }

    w5() {
        this(new boolean[10], 0);
    }

    private w5(boolean[] zArr, int r2) {
        this.e = zArr;
        this.f = r2;
    }

    private final void i(int r2) {
        if (r2 < 0 || r2 >= this.f) {
            throw new IndexOutOfBoundsException(j(r2));
        }
    }

    private final String j(int r4) {
        int r0 = this.f;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(r4);
        sb.append(", Size:");
        sb.append(r0);
        return sb.toString();
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r5, Object obj) {
        int r0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (r5 < 0 || r5 > (r0 = this.f)) {
            throw new IndexOutOfBoundsException(j(r5));
        }
        boolean[] zArr = this.e;
        if (r0 < zArr.length) {
            System.arraycopy(zArr, r5, zArr, r5 + 1, r0 - r5);
        } else {
            boolean[] zArr2 = new boolean[((r0 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, r5);
            System.arraycopy(this.e, r5, zArr2, r5 + 1, this.f - r5);
            this.e = zArr2;
        }
        this.e[r5] = zBooleanValue;
        this.f++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        h(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        l7.d(collection);
        if (!(collection instanceof w5)) {
            return super.addAll(collection);
        }
        w5 w5Var = (w5) collection;
        int r0 = w5Var.f;
        if (r0 == 0) {
            return false;
        }
        int r3 = this.f;
        if (ActivityChooserView.f.j - r3 < r0) {
            throw new OutOfMemoryError();
        }
        int r32 = r3 + r0;
        boolean[] zArr = this.e;
        if (r32 > zArr.length) {
            this.e = Arrays.copyOf(zArr, r32);
        }
        System.arraycopy(w5Var.e, 0, this.e, this.f, w5Var.f);
        this.f = r32;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // c.a.b.b.g.c.r7
    public final /* synthetic */ r7<Boolean> e(int r3) {
        if (r3 >= this.f) {
            return new w5(Arrays.copyOf(this.e, r3), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5)) {
            return super.equals(obj);
        }
        w5 w5Var = (w5) obj;
        if (this.f != w5Var.f) {
            return false;
        }
        boolean[] zArr = w5Var.e;
        for (int r1 = 0; r1 < this.f; r1++) {
            if (this.e[r1] != zArr[r1]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r2) {
        i(r2);
        return Boolean.valueOf(this.e[r2]);
    }

    public final void h(boolean z) {
        c();
        int r0 = this.f;
        boolean[] zArr = this.e;
        if (r0 == zArr.length) {
            boolean[] zArr2 = new boolean[((r0 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, r0);
            this.e = zArr2;
        }
        boolean[] zArr3 = this.e;
        int r1 = this.f;
        this.f = r1 + 1;
        zArr3[r1] = z;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r0 = 1;
        for (int r1 = 0; r1 < this.f; r1++) {
            r0 = (r0 * 31) + l7.c(this.e[r1]);
        }
        return r0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int r2 = 0; r2 < size; r2++) {
            if (this.e[r2] == zBooleanValue) {
                return r2;
            }
        }
        return -1;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int r5) {
        c();
        i(r5);
        boolean[] zArr = this.e;
        boolean z = zArr[r5];
        if (r5 < this.f - 1) {
            System.arraycopy(zArr, r5 + 1, zArr, r5, (r2 - r5) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r3, int r4) {
        c();
        if (r4 < r3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.e;
        System.arraycopy(zArr, r4, zArr, r3, this.f - r4);
        this.f -= r4 - r3;
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int r3, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        i(r3);
        boolean[] zArr = this.e;
        boolean z = zArr[r3];
        zArr[r3] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
