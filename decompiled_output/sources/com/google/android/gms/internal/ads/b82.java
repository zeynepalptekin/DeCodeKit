package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class b82 implements f82 {
    b82() {
    }

    @Override // java.util.Iterator
    public /* synthetic */ Byte next() {
        return Byte.valueOf(nextByte());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
