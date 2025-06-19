package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class uc2 implements Iterator<String> {
    private Iterator<String> d;
    private final /* synthetic */ sc2 e;

    uc2(sc2 sc2Var) {
        this.e = sc2Var;
        this.d = this.e.d.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
