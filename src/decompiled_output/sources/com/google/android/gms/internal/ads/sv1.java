package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class sv1<T> extends fw1<T> {
    private boolean d;
    private final /* synthetic */ Object e;

    sv1(Object obj) {
        this.e = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.d;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.d) {
            throw new NoSuchElementException();
        }
        this.d = true;
        return (T) this.e;
    }
}
