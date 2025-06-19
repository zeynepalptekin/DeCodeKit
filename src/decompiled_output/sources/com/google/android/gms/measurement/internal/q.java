package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
final class q implements Iterator<String> {
    private Iterator<String> d;
    private final /* synthetic */ n e;

    q(n nVar) {
        this.e = nVar;
        this.d = this.e.d.keySet().iterator();
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
        throw new UnsupportedOperationException("Remove not supported");
    }
}
