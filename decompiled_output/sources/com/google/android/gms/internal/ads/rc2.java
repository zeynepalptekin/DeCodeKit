package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes.dex */
final class rc2 implements ListIterator<String> {
    private ListIterator<String> d;
    private final /* synthetic */ int e;
    private final /* synthetic */ sc2 f;

    rc2(sc2 sc2Var, int r2) {
        this.f = sc2Var;
        this.e = r2;
        this.d = this.f.d.listIterator(this.e);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.d.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.d.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.d.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.d.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.d.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
