package androidx.lifecycle;

import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class m<T> extends o<T> {
    private b.b.a.c.b<LiveData<?>, a<?>> l = new b.b.a.c.b<>();

    private static class a<V> implements p<V> {

        /* renamed from: a, reason: collision with root package name */
        final LiveData<V> f519a;

        /* renamed from: b, reason: collision with root package name */
        final p<? super V> f520b;

        /* renamed from: c, reason: collision with root package name */
        int f521c = -1;

        a(LiveData<V> liveData, p<? super V> pVar) {
            this.f519a = liveData;
            this.f520b = pVar;
        }

        @Override // androidx.lifecycle.p
        public void a(@i0 V v) {
            if (this.f521c != this.f519a.f()) {
                this.f521c = this.f519a.f();
                this.f520b.a(v);
            }
        }

        void b() {
            this.f519a.j(this);
        }

        void c() {
            this.f519a.n(this);
        }
    }

    @Override // androidx.lifecycle.LiveData
    @androidx.annotation.i
    protected void k() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @androidx.annotation.i
    protected void l() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    @e0
    public <S> void q(@h0 LiveData<S> liveData, @h0 p<? super S> pVar) {
        a<?> aVar = new a<>(liveData, pVar);
        a<?> aVarO = this.l.o(liveData, aVar);
        if (aVarO != null && aVarO.f520b != pVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarO == null && g()) {
            aVar.b();
        }
    }

    @e0
    public <S> void r(@h0 LiveData<S> liveData) {
        a<?> aVarR = this.l.r(liveData);
        if (aVarR != null) {
            aVarR.c();
        }
    }
}
