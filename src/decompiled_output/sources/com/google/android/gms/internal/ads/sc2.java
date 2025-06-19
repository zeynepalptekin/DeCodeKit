package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class sc2 extends AbstractList<String> implements ha2, RandomAccess {
    private final ha2 d;

    public sc2(ha2 ha2Var) {
        this.d = ha2Var;
    }

    @Override // com.google.android.gms.internal.ads.ha2
    public final void M(a82 a82Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.ha2
    public final List<?> R() {
        return this.d.R();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r2) {
        return (String) this.d.get(r2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new uc2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int r2) {
        return new rc2(this, r2);
    }

    @Override // com.google.android.gms.internal.ads.ha2
    public final ha2 p() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.size();
    }

    @Override // com.google.android.gms.internal.ads.ha2
    public final Object z(int r2) {
        return this.d.z(r2);
    }
}
