package androidx.recyclerview.widget;

import androidx.annotation.i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s<T, VH extends RecyclerView.f0> extends RecyclerView.g<VH> {

    /* renamed from: c, reason: collision with root package name */
    final d<T> f730c;
    private final d.b<T> d = new a();

    class a implements d.b<T> {
        a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void a(@androidx.annotation.h0 List<T> list, @androidx.annotation.h0 List<T> list2) {
            s.this.H(list, list2);
        }
    }

    protected s(@androidx.annotation.h0 c<T> cVar) {
        d<T> dVar = new d<>(new b(this), cVar);
        this.f730c = dVar;
        dVar.a(this.d);
    }

    protected s(@androidx.annotation.h0 i.d<T> dVar) {
        d<T> dVar2 = new d<>(new b(this), new c.a(dVar).a());
        this.f730c = dVar2;
        dVar2.a(this.d);
    }

    @androidx.annotation.h0
    public List<T> F() {
        return this.f730c.b();
    }

    protected T G(int r2) {
        return this.f730c.b().get(r2);
    }

    public void H(@androidx.annotation.h0 List<T> list, @androidx.annotation.h0 List<T> list2) {
    }

    public void I(@i0 List<T> list) {
        this.f730c.f(list);
    }

    public void J(@i0 List<T> list, @i0 Runnable runnable) {
        this.f730c.g(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f730c.b().size();
    }
}
