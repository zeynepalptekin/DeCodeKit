package c.a.b.b.g.c;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class d7 extends s5<Float> implements r7<Float>, d9, RandomAccess {
    private static final d7 g;
    private float[] e;
    private int f;

    static {
        d7 d7Var = new d7(new float[0], 0);
        g = d7Var;
        d7Var.b();
    }

    d7() {
        this(new float[10], 0);
    }

    private d7(float[] fArr, int r2) {
        this.e = fArr;
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
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (r5 < 0 || r5 > (r0 = this.f)) {
            throw new IndexOutOfBoundsException(j(r5));
        }
        float[] fArr = this.e;
        if (r0 < fArr.length) {
            System.arraycopy(fArr, r5, fArr, r5 + 1, r0 - r5);
        } else {
            float[] fArr2 = new float[((r0 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, r5);
            System.arraycopy(this.e, r5, fArr2, r5 + 1, this.f - r5);
            this.e = fArr2;
        }
        this.e[r5] = fFloatValue;
        this.f++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        l7.d(collection);
        if (!(collection instanceof d7)) {
            return super.addAll(collection);
        }
        d7 d7Var = (d7) collection;
        int r0 = d7Var.f;
        if (r0 == 0) {
            return false;
        }
        int r3 = this.f;
        if (ActivityChooserView.f.j - r3 < r0) {
            throw new OutOfMemoryError();
        }
        int r32 = r3 + r0;
        float[] fArr = this.e;
        if (r32 > fArr.length) {
            this.e = Arrays.copyOf(fArr, r32);
        }
        System.arraycopy(d7Var.e, 0, this.e, this.f, d7Var.f);
        this.f = r32;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // c.a.b.b.g.c.r7
    public final /* synthetic */ r7<Float> e(int r3) {
        if (r3 >= this.f) {
            return new d7(Arrays.copyOf(this.e, r3), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return super.equals(obj);
        }
        d7 d7Var = (d7) obj;
        if (this.f != d7Var.f) {
            return false;
        }
        float[] fArr = d7Var.e;
        for (int r1 = 0; r1 < this.f; r1++) {
            if (Float.floatToIntBits(this.e[r1]) != Float.floatToIntBits(fArr[r1])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r2) {
        i(r2);
        return Float.valueOf(this.e[r2]);
    }

    public final void h(float f) {
        c();
        int r0 = this.f;
        float[] fArr = this.e;
        if (r0 == fArr.length) {
            float[] fArr2 = new float[((r0 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, r0);
            this.e = fArr2;
        }
        float[] fArr3 = this.e;
        int r1 = this.f;
        this.f = r1 + 1;
        fArr3[r1] = f;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r0 = 1;
        for (int r1 = 0; r1 < this.f; r1++) {
            r0 = (r0 * 31) + Float.floatToIntBits(this.e[r1]);
        }
        return r0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int r2 = 0; r2 < size; r2++) {
            if (this.e[r2] == fFloatValue) {
                return r2;
            }
        }
        return -1;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int r5) {
        c();
        i(r5);
        float[] fArr = this.e;
        float f = fArr[r5];
        if (r5 < this.f - 1) {
            System.arraycopy(fArr, r5 + 1, fArr, r5, (r2 - r5) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r3, int r4) {
        c();
        if (r4 < r3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.e;
        System.arraycopy(fArr, r4, fArr, r3, this.f - r4);
        this.f -= r4 - r3;
        ((AbstractList) this).modCount++;
    }

    @Override // c.a.b.b.g.c.s5, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int r3, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        i(r3);
        float[] fArr = this.e;
        float f = fArr[r3];
        fArr[r3] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
