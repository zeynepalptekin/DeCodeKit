package c.a.e;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private c.a.e.a0.d f2312a;

    /* renamed from: b, reason: collision with root package name */
    private w f2313b;

    /* renamed from: c, reason: collision with root package name */
    private e f2314c;
    private final Map<Type, h<?>> d;
    private final List<y> e;
    private final List<y> f;
    private boolean g;
    private String h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public g() {
        this.f2312a = c.a.e.a0.d.k;
        this.f2313b = w.d;
        this.f2314c = d.d;
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = false;
        this.i = 2;
        this.j = 2;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
    }

    g(f fVar) {
        this.f2312a = c.a.e.a0.d.k;
        this.f2313b = w.d;
        this.f2314c = d.d;
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = false;
        this.i = 2;
        this.j = 2;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.f2312a = fVar.f;
        this.f2314c = fVar.g;
        this.d.putAll(fVar.h);
        this.g = fVar.i;
        this.k = fVar.j;
        this.o = fVar.k;
        this.m = fVar.l;
        this.n = fVar.m;
        this.p = fVar.n;
        this.l = fVar.o;
        this.f2313b = fVar.s;
        this.h = fVar.p;
        this.i = fVar.q;
        this.j = fVar.r;
        this.e.addAll(fVar.t);
        this.f.addAll(fVar.u);
    }

    private void c(String str, int r5, int r6, List<y> list) {
        a aVar;
        a aVar2;
        a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar = new a((Class<? extends Date>) Date.class, str);
            aVar2 = new a((Class<? extends Date>) Timestamp.class, str);
            aVar3 = new a((Class<? extends Date>) java.sql.Date.class, str);
        } else {
            if (r5 == 2 || r6 == 2) {
                return;
            }
            a aVar4 = new a(Date.class, r5, r6);
            a aVar5 = new a(Timestamp.class, r5, r6);
            a aVar6 = new a(java.sql.Date.class, r5, r6);
            aVar = aVar4;
            aVar2 = aVar5;
            aVar3 = aVar6;
        }
        list.add(c.a.e.a0.p.n.b(Date.class, aVar));
        list.add(c.a.e.a0.p.n.b(Timestamp.class, aVar2));
        list.add(c.a.e.a0.p.n.b(java.sql.Date.class, aVar3));
    }

    public g a(b bVar) {
        this.f2312a = this.f2312a.r(bVar, false, true);
        return this;
    }

    public g b(b bVar) {
        this.f2312a = this.f2312a.r(bVar, true, false);
        return this;
    }

    public f d() {
        List<y> arrayList = new ArrayList<>(this.e.size() + this.f.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        c(this.h, this.i, this.j, arrayList);
        return new f(this.f2312a, this.f2314c, this.d, this.g, this.k, this.o, this.m, this.n, this.p, this.l, this.f2313b, this.h, this.i, this.j, this.e, this.f, arrayList);
    }

    public g e() {
        this.m = false;
        return this;
    }

    public g f() {
        this.f2312a = this.f2312a.d();
        return this;
    }

    public g g() {
        this.k = true;
        return this;
    }

    public g h(int... r2) {
        this.f2312a = this.f2312a.s(r2);
        return this;
    }

    public g i() {
        this.f2312a = this.f2312a.k();
        return this;
    }

    public g j() {
        this.o = true;
        return this;
    }

    public g k(Type type, Object obj) {
        boolean z = obj instanceof t;
        c.a.e.a0.a.a(z || (obj instanceof k) || (obj instanceof h) || (obj instanceof x));
        if (obj instanceof h) {
            this.d.put(type, (h) obj);
        }
        if (z || (obj instanceof k)) {
            this.e.add(c.a.e.a0.p.l.l(c.a.e.b0.a.c(type), obj));
        }
        if (obj instanceof x) {
            this.e.add(c.a.e.a0.p.n.a(c.a.e.b0.a.c(type), (x) obj));
        }
        return this;
    }

    public g l(y yVar) {
        this.e.add(yVar);
        return this;
    }

    public g m(Class<?> cls, Object obj) {
        boolean z = obj instanceof t;
        c.a.e.a0.a.a(z || (obj instanceof k) || (obj instanceof x));
        if ((obj instanceof k) || z) {
            this.f.add(c.a.e.a0.p.l.m(cls, obj));
        }
        if (obj instanceof x) {
            this.e.add(c.a.e.a0.p.n.e(cls, (x) obj));
        }
        return this;
    }

    public g n() {
        this.g = true;
        return this;
    }

    public g o() {
        this.l = true;
        return this;
    }

    public g p(int r1) {
        this.i = r1;
        this.h = null;
        return this;
    }

    public g q(int r1, int r2) {
        this.i = r1;
        this.j = r2;
        this.h = null;
        return this;
    }

    public g r(String str) {
        this.h = str;
        return this;
    }

    public g s(b... bVarArr) {
        for (b bVar : bVarArr) {
            this.f2312a = this.f2312a.r(bVar, true, true);
        }
        return this;
    }

    public g t(d dVar) {
        this.f2314c = dVar;
        return this;
    }

    public g u(e eVar) {
        this.f2314c = eVar;
        return this;
    }

    public g v() {
        this.p = true;
        return this;
    }

    public g w(w wVar) {
        this.f2313b = wVar;
        return this;
    }

    public g x() {
        this.n = true;
        return this;
    }

    public g y(double d) {
        this.f2312a = this.f2312a.t(d);
        return this;
    }
}
