package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
class lv1<E> extends kv1<E> {

    /* renamed from: a, reason: collision with root package name */
    Object[] f4311a;

    /* renamed from: b, reason: collision with root package name */
    int f4312b;

    /* renamed from: c, reason: collision with root package name */
    boolean f4313c;

    lv1(int r2) {
        hv1.b(r2, "initialCapacity");
        this.f4311a = new Object[r2];
        this.f4312b = 0;
    }

    private final void e(int r5) {
        Object[] objArr = this.f4311a;
        if (objArr.length >= r5) {
            if (this.f4313c) {
                this.f4311a = (Object[]) objArr.clone();
                this.f4313c = false;
                return;
            }
            return;
        }
        int length = objArr.length;
        if (r5 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int r1 = length + (length >> 1) + 1;
        if (r1 < r5) {
            r1 = Integer.highestOneBit(r5 - 1) << 1;
        }
        if (r1 < 0) {
            r1 = ActivityChooserView.f.j;
        }
        this.f4311a = Arrays.copyOf(objArr, r1);
        this.f4313c = false;
    }

    @Override // com.google.android.gms.internal.ads.kv1
    public kv1<E> c(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(this.f4312b + collection.size());
            if (collection instanceof iv1) {
                this.f4312b = ((iv1) collection).c(this.f4311a, this.f4312b);
                return this;
            }
        }
        super.c(iterable);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kv1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public lv1<E> b(E e) {
        bv1.b(e);
        e(this.f4312b + 1);
        Object[] objArr = this.f4311a;
        int r1 = this.f4312b;
        this.f4312b = r1 + 1;
        objArr[r1] = e;
        return this;
    }
}
