package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b implements t {

    @androidx.annotation.h0
    private final RecyclerView.g d;

    public b(@androidx.annotation.h0 RecyclerView.g gVar) {
        this.d = gVar;
    }

    @Override // androidx.recyclerview.widget.t
    public void a(int r2, int r3) {
        this.d.r(r2, r3);
    }

    @Override // androidx.recyclerview.widget.t
    public void b(int r2, int r3) {
        this.d.n(r2, r3);
    }

    @Override // androidx.recyclerview.widget.t
    public void c(int r2, int r3) {
        this.d.q(r2, r3);
    }

    @Override // androidx.recyclerview.widget.t
    public void d(int r2, int r3, Object obj) {
        this.d.p(r2, r3, obj);
    }
}
