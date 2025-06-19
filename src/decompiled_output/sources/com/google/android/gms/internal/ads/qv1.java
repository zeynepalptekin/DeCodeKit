package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class qv1<E> extends iv1<E> implements Set<E> {

    @NullableDecl
    private transient nv1<E> e;

    qv1() {
    }

    public static <E> tv1<E> A(int r1) {
        hv1.b(r1, "expectedSize");
        return new tv1<>(r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean B(int r1, int r2) {
        return r1 < (r2 >> 1) + (r2 >> 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> qv1<E> r(int r13, Object... objArr) {
        while (r13 != 0) {
            if (r13 == 1) {
                return t(objArr[0]);
            }
            int r2 = y(r13);
            Object[] objArr2 = new Object[r2];
            int r7 = r2 - 1;
            int r5 = 0;
            int r8 = 0;
            for (int r3 = 0; r3 < r13; r3++) {
                Object objA = uv1.a(objArr[r3], r3);
                int r9 = objA.hashCode();
                int r10 = jv1.a(r9);
                while (true) {
                    int r11 = r10 & r7;
                    Object obj = objArr2[r11];
                    if (obj == null) {
                        objArr[r8] = objA;
                        objArr2[r11] = objA;
                        r5 += r9;
                        r8++;
                        break;
                    }
                    if (!obj.equals(objA)) {
                        r10++;
                    }
                }
            }
            Arrays.fill(objArr, r8, r13, (Object) null);
            if (r8 == 1) {
                return new gw1(objArr[0], r5);
            }
            if (y(r8) >= r2 / 2) {
                if (B(r8, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, r8);
                }
                return new ew1(objArr, r5, objArr2, r7, r8);
            }
            r13 = r8;
        }
        return ew1.k;
    }

    @SafeVarargs
    public static <E> qv1<E> s(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        bv1.a(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return r(length, objArr);
    }

    public static <E> qv1<E> t(E e) {
        return new gw1(e);
    }

    static int y(int r6) {
        int r62 = Math.max(r6, 2);
        if (r62 >= 751619276) {
            bv1.a(r62 < 1073741824, "collection too large");
            return 1073741824;
        }
        int r0 = Integer.highestOneBit(r62 - 1) << 1;
        while (r0 * 0.7d < r62) {
            r0 <<= 1;
        }
        return r0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof qv1) && u() && ((qv1) obj).u() && hashCode() != obj.hashCode()) {
            return false;
        }
        return dw1.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return dw1.b(this);
    }

    @Override // com.google.android.gms.internal.ads.iv1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.ads.iv1
    public nv1<E> n() {
        nv1<E> nv1Var = this.e;
        if (nv1Var != null) {
            return nv1Var;
        }
        nv1<E> nv1VarV = v();
        this.e = nv1VarV;
        return nv1VarV;
    }

    boolean u() {
        return false;
    }

    nv1<E> v() {
        return nv1.x(toArray());
    }
}
