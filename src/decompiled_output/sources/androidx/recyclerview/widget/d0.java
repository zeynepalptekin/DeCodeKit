package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;

/* loaded from: classes.dex */
public abstract class d0<T2> extends c0.b<T2> {
    final RecyclerView.g d;

    public d0(RecyclerView.g gVar) {
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

    @Override // androidx.recyclerview.widget.c0.b, androidx.recyclerview.widget.t
    public void d(int r2, int r3, Object obj) {
        this.d.p(r2, r3, obj);
    }

    @Override // androidx.recyclerview.widget.c0.b
    public void h(int r2, int r3) {
        this.d.o(r2, r3);
    }
}
