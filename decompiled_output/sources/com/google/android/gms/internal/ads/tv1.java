package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class tv1<E> extends lv1<E> {

    @NullableDecl
    private Object[] d;
    private int e;

    public tv1() {
        super(4);
    }

    tv1(int r1) {
        super(r1);
        this.d = new Object[qv1.y(r1)];
    }

    @Override // com.google.android.gms.internal.ads.kv1
    public final /* synthetic */ kv1 a(Iterator it) {
        bv1.b(it);
        while (it.hasNext()) {
            b(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.lv1, com.google.android.gms.internal.ads.kv1
    public final /* synthetic */ kv1 b(Object obj) {
        bv1.b(obj);
        if (this.d != null) {
            int r0 = qv1.y(this.f4312b);
            Object[] objArr = this.d;
            if (r0 <= objArr.length) {
                int length = objArr.length - 1;
                int r1 = obj.hashCode();
                int r2 = jv1.a(r1);
                while (true) {
                    int r22 = r2 & length;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[r22];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        r2 = r22 + 1;
                    } else {
                        objArr2[r22] = obj;
                        this.e += r1;
                        super.b(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.d = null;
        super.b(obj);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.lv1, com.google.android.gms.internal.ads.kv1
    public final /* synthetic */ kv1 c(Iterable iterable) {
        bv1.b(iterable);
        if (this.d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            super.c(iterable);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.lv1
    /* renamed from: d */
    public final /* synthetic */ lv1 b(Object obj) {
        return (tv1) b(obj);
    }

    public final qv1<E> f() {
        qv1<E> qv1VarR;
        int r0 = this.f4312b;
        if (r0 == 0) {
            return ew1.k;
        }
        if (r0 == 1) {
            return qv1.t(this.f4311a[0]);
        }
        if (this.d == null || qv1.y(r0) != this.d.length) {
            qv1VarR = qv1.r(this.f4312b, this.f4311a);
            this.f4312b = qv1VarR.size();
        } else {
            Object[] objArrCopyOf = qv1.B(this.f4312b, this.f4311a.length) ? Arrays.copyOf(this.f4311a, this.f4312b) : this.f4311a;
            qv1VarR = new ew1<>(objArrCopyOf, this.e, this.d, r5.length - 1, this.f4312b);
        }
        this.f4313c = true;
        this.d = null;
        return qv1VarR;
    }
}
