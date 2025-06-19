package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class z72 extends b82 {
    private int d = 0;
    private final int e;
    private final /* synthetic */ a82 f;

    z72(a82 a82Var) {
        this.f = a82Var;
        this.e = this.f.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e;
    }

    @Override // com.google.android.gms.internal.ads.f82
    public final byte nextByte() {
        int r0 = this.d;
        if (r0 >= this.e) {
            throw new NoSuchElementException();
        }
        this.d = r0 + 1;
        return this.f.E(r0);
    }
}
