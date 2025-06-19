package androidx.fragment.app;

import androidx.annotation.h0;
import androidx.lifecycle.g;

/* loaded from: classes.dex */
class v implements androidx.lifecycle.j {
    private androidx.lifecycle.k d = null;

    v() {
    }

    void a(@h0 g.a aVar) {
        this.d.j(aVar);
    }

    @Override // androidx.lifecycle.j
    @h0
    public androidx.lifecycle.g b() {
        c();
        return this.d;
    }

    void c() {
        if (this.d == null) {
            this.d = new androidx.lifecycle.k(this);
        }
    }

    boolean f() {
        return this.d != null;
    }
}
