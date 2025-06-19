package c.a.e.a0.p;

import c.a.e.p;
import c.a.e.s;
import c.a.e.t;
import c.a.e.x;
import c.a.e.y;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class l<T> extends x<T> {

    /* renamed from: a, reason: collision with root package name */
    private final t<T> f2272a;

    /* renamed from: b, reason: collision with root package name */
    private final c.a.e.k<T> f2273b;

    /* renamed from: c, reason: collision with root package name */
    final c.a.e.f f2274c;
    private final c.a.e.b0.a<T> d;
    private final y e;
    private final l<T>.b f = new b();
    private x<T> g;

    private final class b implements s, c.a.e.j {
        private b() {
        }

        @Override // c.a.e.j
        public <R> R a(c.a.e.l lVar, Type type) throws p {
            return (R) l.this.f2274c.j(lVar, type);
        }

        @Override // c.a.e.s
        public c.a.e.l b(Object obj, Type type) {
            return l.this.f2274c.H(obj, type);
        }

        @Override // c.a.e.s
        public c.a.e.l c(Object obj) {
            return l.this.f2274c.G(obj);
        }
    }

    private static final class c implements y {
        private final c.a.e.b0.a<?> d;
        private final boolean e;
        private final Class<?> f;
        private final t<?> g;
        private final c.a.e.k<?> h;

        c(Object obj, c.a.e.b0.a<?> aVar, boolean z, Class<?> cls) {
            this.g = obj instanceof t ? (t) obj : null;
            c.a.e.k<?> kVar = obj instanceof c.a.e.k ? (c.a.e.k) obj : null;
            this.h = kVar;
            c.a.e.a0.a.a((this.g == null && kVar == null) ? false : true);
            this.d = aVar;
            this.e = z;
            this.f = cls;
        }

        @Override // c.a.e.y
        public <T> x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            c.a.e.b0.a<?> aVar2 = this.d;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.e && this.d.h() == aVar.f()) : this.f.isAssignableFrom(aVar.f())) {
                return new l(this.g, this.h, fVar, aVar, this);
            }
            return null;
        }
    }

    public l(t<T> tVar, c.a.e.k<T> kVar, c.a.e.f fVar, c.a.e.b0.a<T> aVar, y yVar) {
        this.f2272a = tVar;
        this.f2273b = kVar;
        this.f2274c = fVar;
        this.d = aVar;
        this.e = yVar;
    }

    private x<T> j() {
        x<T> xVar = this.g;
        if (xVar != null) {
            return xVar;
        }
        x<T> xVarR = this.f2274c.r(this.e, this.d);
        this.g = xVarR;
        return xVarR;
    }

    public static y k(c.a.e.b0.a<?> aVar, Object obj) {
        return new c(obj, aVar, false, null);
    }

    public static y l(c.a.e.b0.a<?> aVar, Object obj) {
        return new c(obj, aVar, aVar.h() == aVar.f(), null);
    }

    public static y m(Class<?> cls, Object obj) {
        return new c(obj, null, false, cls);
    }

    @Override // c.a.e.x
    public T e(c.a.e.c0.a aVar) throws p, IOException {
        if (this.f2273b == null) {
            return j().e(aVar);
        }
        c.a.e.l lVarA = c.a.e.a0.n.a(aVar);
        if (lVarA.F()) {
            return null;
        }
        return this.f2273b.a(lVarA, this.d.h(), this.f);
    }

    @Override // c.a.e.x
    public void i(c.a.e.c0.d dVar, T t) throws IOException {
        t<T> tVar = this.f2272a;
        if (tVar == null) {
            j().i(dVar, t);
        } else if (t == null) {
            dVar.p();
        } else {
            c.a.e.a0.n.b(tVar.a(t, this.d.h(), this.f), dVar);
        }
    }
}
