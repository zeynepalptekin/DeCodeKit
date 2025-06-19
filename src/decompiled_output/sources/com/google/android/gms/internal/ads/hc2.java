package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class hc2<K, V> implements Iterator<Map.Entry<K, V>> {
    private int d;
    private boolean e;
    private Iterator<Map.Entry<K, V>> f;
    private final /* synthetic */ zb2 g;

    private hc2(zb2 zb2Var) {
        this.g = zb2Var;
        this.d = -1;
    }

    /* synthetic */ hc2(zb2 zb2Var, yb2 yb2Var) {
        this(zb2Var);
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f == null) {
            this.f = this.g.f.entrySet().iterator();
        }
        return this.f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d + 1 < this.g.e.size() || (!this.g.f.isEmpty() && b().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.e = true;
        int r1 = this.d + 1;
        this.d = r1;
        return r1 < this.g.e.size() ? (Map.Entry<K, V>) this.g.e.get(this.d) : b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.e) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.e = false;
        this.g.k();
        if (this.d >= this.g.e.size()) {
            b().remove();
            return;
        }
        zb2 zb2Var = this.g;
        int r1 = this.d;
        this.d = r1 - 1;
        zb2Var.q(r1);
    }
}
