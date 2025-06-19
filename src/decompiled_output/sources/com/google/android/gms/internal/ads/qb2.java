package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class qb2 extends b82 {
    private final sb2 d;
    private f82 e = b();
    private final /* synthetic */ rb2 f;

    qb2(rb2 rb2Var) {
        this.f = rb2Var;
        this.d = new sb2(this.f, null);
    }

    private final f82 b() {
        if (this.d.hasNext()) {
            return (f82) ((h82) this.d.next()).iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // com.google.android.gms.internal.ads.f82
    public final byte nextByte() {
        f82 f82Var = this.e;
        if (f82Var == null) {
            throw new NoSuchElementException();
        }
        byte bNextByte = f82Var.nextByte();
        if (!this.e.hasNext()) {
            this.e = b();
        }
        return bNextByte;
    }
}
