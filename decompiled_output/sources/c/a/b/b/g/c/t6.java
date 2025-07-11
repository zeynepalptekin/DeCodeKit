package c.a.b.b.g.c;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class t6 extends s5<Double> implements r7<Double>, d9, RandomAccess {
    private static final t6 g;
    private double[] e;
    private int f;

    static {
        t6 t6Var = new t6(new double[0], 0);
        g = t6Var;
        t6Var.b();
    }

    t6() {
        this(new double[10], 0);
    }

    private t6(double[] dArr, int r2) {
        this.e = dArr;
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
    public final /* synthetic */ void add(int r6, Object obj) {
        int r7;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (r6 < 0 || r6 > (r7 = this.f)) {
            throw new IndexOutOfBoundsException(j(r6));
        }
        double[] dArr = this.e;
        if (r7 < dArr.length) {
            System.arraycopy(dArr, r6, dArr, r6 + 1, r7 - r6);
        } else {
            double[] dArr2 = new double[((r7 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, r6);
            System.arraycopy(this.e, r6, dArr2, r6 + 1, this.f - r6);
            this.e = dArr2;
        }
        this.e[r6] = dDoubleValue;
        this.f++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        l7.d(collection);
        if (!(collection instanceof t6)) {
            return super.addAll(collection);
        }
        t6 t6Var = (t6) collection;
        int r0 = t6Var.f;
        if (r0 == 0) {
            return false;
        }
        int r3 = this.f;
        if (ActivityChooserView.f.j - r3 < r0) {
            throw new OutOfMemoryError();
        }
        int r32 = r3 + r0;
        double[] dArr = this.e;
        if (r32 > dArr.length) {
            this.e = Arrays.copyOf(dArr, r32);
        }
        System.arraycopy(t6Var.e, 0, this.e, this.f, t6Var.f);
        this.f = r32;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // c.a.b.b.g.c.r7
    public final /* synthetic */ r7<Double> e(int r3) {
        if (r3 >= this.f) {
            return new t6(Arrays.copyOf(this.e, r3), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return super.equals(obj);
        }
        t6 t6Var = (t6) obj;
        if (this.f != t6Var.f) {
            return false;
        }
        double[] dArr = t6Var.e;
        for (int r1 = 0; r1 < this.f; r1++) {
            if (Double.doubleToLongBits(this.e[r1]) != Double.doubleToLongBits(dArr[r1])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r4) {
        i(r4);
        return Double.valueOf(this.e[r4]);
    }

    public final void h(double d) {
        c();
        int r0 = this.f;
        double[] dArr = this.e;
        if (r0 == dArr.length) {
            double[] dArr2 = new double[((r0 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, r0);
            this.e = dArr2;
        }
        double[] dArr3 = this.e;
        int r1 = this.f;
        this.f = r1 + 1;
        dArr3[r1] = d;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r0 = 1;
        for (int r1 = 0; r1 < this.f; r1++) {
            r0 = (r0 * 31) + l7.b(Double.doubleToLongBits(this.e[r1]));
        }
        return r0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int r0 = 0; r0 < size; r0++) {
            if (this.e[r0] == dDoubleValue) {
                return r0;
            }
        }
        return -1;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int r6) {
        c();
        i(r6);
        double[] dArr = this.e;
        double d = dArr[r6];
        if (r6 < this.f - 1) {
            System.arraycopy(dArr, r6 + 1, dArr, r6, (r3 - r6) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r3, int r4) {
        c();
        if (r4 < r3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.e;
        System.arraycopy(dArr, r4, dArr, r3, this.f - r4);
        this.f -= r4 - r3;
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int r5, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        i(r5);
        double[] dArr = this.e;
        double d = dArr[r5];
        dArr[r5] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
