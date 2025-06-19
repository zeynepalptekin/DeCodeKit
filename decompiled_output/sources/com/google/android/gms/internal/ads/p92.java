package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class p92 extends u72<Integer> implements s92, jb2, RandomAccess {
    private static final p92 g;
    private int[] e;
    private int f;

    static {
        p92 p92Var = new p92(new int[0], 0);
        g = p92Var;
        p92Var.w();
    }

    p92() {
        this(new int[10], 0);
    }

    private p92(int[] r1, int r2) {
        this.e = r1;
        this.f = r2;
    }

    public static p92 i() {
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

    @Override // com.google.android.gms.internal.ads.x92
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final s92 k(int r3) {
        if (r3 >= this.f) {
            return new p92(Arrays.copyOf(this.e, r3), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.s92
    public final void U(int r5) {
        c();
        int r0 = this.f;
        int[] r1 = this.e;
        if (r0 == r1.length) {
            int[] r2 = new int[((r0 * 3) / 2) + 1];
            System.arraycopy(r1, 0, r2, 0, r0);
            this.e = r2;
        }
        int[] r02 = this.e;
        int r12 = this.f;
        this.f = r12 + 1;
        r02[r12] = r5;
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r5, Object obj) {
        int r0;
        int r6 = ((Integer) obj).intValue();
        c();
        if (r5 < 0 || r5 > (r0 = this.f)) {
            throw new IndexOutOfBoundsException(l(r5));
        }
        int[] r1 = this.e;
        if (r0 < r1.length) {
            System.arraycopy(r1, r5, r1, r5 + 1, r0 - r5);
        } else {
            int[] r02 = new int[((r0 * 3) / 2) + 1];
            System.arraycopy(r1, 0, r02, 0, r5);
            System.arraycopy(this.e, r5, r02, r5 + 1, this.f - r5);
            this.e = r02;
        }
        this.e[r5] = r6;
        this.f++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        U(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        o92.a(collection);
        if (!(collection instanceof p92)) {
            return super.addAll(collection);
        }
        p92 p92Var = (p92) collection;
        int r0 = p92Var.f;
        if (r0 == 0) {
            return false;
        }
        int r3 = this.f;
        if (ActivityChooserView.f.j - r3 < r0) {
            throw new OutOfMemoryError();
        }
        int r32 = r3 + r0;
        int[] r02 = this.e;
        if (r32 > r02.length) {
            this.e = Arrays.copyOf(r02, r32);
        }
        System.arraycopy(p92Var.e, 0, this.e, this.f, p92Var.f);
        this.f = r32;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p92)) {
            return super.equals(obj);
        }
        p92 p92Var = (p92) obj;
        if (this.f != p92Var.f) {
            return false;
        }
        int[] r6 = p92Var.e;
        for (int r1 = 0; r1 < this.f; r1++) {
            if (this.e[r1] != r6[r1]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r1) {
        return Integer.valueOf(h(r1));
    }

    public final int h(int r2) {
        j(r2);
        return this.e[r2];
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r0 = 1;
        for (int r1 = 0; r1 < this.f; r1++) {
            r0 = (r0 * 31) + this.e[r1];
        }
        return r0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int r5 = ((Integer) obj).intValue();
        int size = size();
        for (int r2 = 0; r2 < size; r2++) {
            if (this.e[r2] == r5) {
                return r2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int r5) {
        c();
        j(r5);
        int[] r0 = this.e;
        int r1 = r0[r5];
        if (r5 < this.f - 1) {
            System.arraycopy(r0, r5 + 1, r0, r5, (r2 - r5) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(r1);
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int r1 = 0; r1 < this.f; r1++) {
            if (obj.equals(Integer.valueOf(this.e[r1]))) {
                int[] r5 = this.e;
                System.arraycopy(r5, r1 + 1, r5, r1, (this.f - r1) - 1);
                this.f--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r3, int r4) {
        c();
        if (r4 < r3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] r0 = this.e;
        System.arraycopy(r0, r4, r0, r3, this.f - r4);
        this.f -= r4 - r3;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int r3, Object obj) {
        int r4 = ((Integer) obj).intValue();
        c();
        j(r3);
        int[] r0 = this.e;
        int r1 = r0[r3];
        r0[r3] = r4;
        return Integer.valueOf(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
