package c.a.e;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class f {
    static final boolean A = false;
    static final boolean B = false;
    private static final c.a.e.b0.a<?> C = c.a.e.b0.a.b(Object.class);
    private static final String D = ")]}'\n";
    static final boolean v = false;
    static final boolean w = false;
    static final boolean x = false;
    static final boolean y = true;
    static final boolean z = false;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Map<c.a.e.b0.a<?>, C0158f<?>>> f2304a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<c.a.e.b0.a<?>, x<?>> f2305b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a.e.a0.c f2306c;
    private final c.a.e.a0.p.d d;
    final List<y> e;
    final c.a.e.a0.d f;
    final c.a.e.e g;
    final Map<Type, h<?>> h;
    final boolean i;
    final boolean j;
    final boolean k;
    final boolean l;
    final boolean m;
    final boolean n;
    final boolean o;
    final String p;
    final int q;
    final int r;
    final w s;
    final List<y> t;
    final List<y> u;

    class a extends x<Number> {
        a() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Double e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return Double.valueOf(aVar.q());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.p();
            } else {
                f.d(number.doubleValue());
                dVar.C(number);
            }
        }
    }

    class b extends x<Number> {
        b() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return Float.valueOf((float) aVar.q());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.p();
            } else {
                f.d(number.floatValue());
                dVar.C(number);
            }
        }
    }

    static class c extends x<Number> {
        c() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return Long.valueOf(aVar.s());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Number number) throws IOException {
            if (number == null) {
                dVar.p();
            } else {
                dVar.D(number.toString());
            }
        }
    }

    static class d extends x<AtomicLong> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f2309a;

        d(x xVar) {
            this.f2309a = xVar;
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicLong e(c.a.e.c0.a aVar) throws IOException {
            return new AtomicLong(((Number) this.f2309a.e(aVar)).longValue());
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, AtomicLong atomicLong) throws IOException {
            this.f2309a.i(dVar, Long.valueOf(atomicLong.get()));
        }
    }

    static class e extends x<AtomicLongArray> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f2310a;

        e(x xVar) {
            this.f2310a = xVar;
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray e(c.a.e.c0.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.l()) {
                arrayList.add(Long.valueOf(((Number) this.f2310a.e(aVar)).longValue()));
            }
            aVar.h();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int r2 = 0; r2 < size; r2++) {
                atomicLongArray.set(r2, ((Long) arrayList.get(r2)).longValue());
            }
            return atomicLongArray;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, AtomicLongArray atomicLongArray) throws IOException {
            dVar.e();
            int length = atomicLongArray.length();
            for (int r1 = 0; r1 < length; r1++) {
                this.f2310a.i(dVar, Long.valueOf(atomicLongArray.get(r1)));
            }
            dVar.h();
        }
    }

    /* renamed from: c.a.e.f$f, reason: collision with other inner class name */
    static class C0158f<T> extends x<T> {

        /* renamed from: a, reason: collision with root package name */
        private x<T> f2311a;

        C0158f() {
        }

        @Override // c.a.e.x
        public T e(c.a.e.c0.a aVar) throws IOException {
            x<T> xVar = this.f2311a;
            if (xVar != null) {
                return xVar.e(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // c.a.e.x
        public void i(c.a.e.c0.d dVar, T t) throws IOException {
            x<T> xVar = this.f2311a;
            if (xVar == null) {
                throw new IllegalStateException();
            }
            xVar.i(dVar, t);
        }

        public void j(x<T> xVar) {
            if (this.f2311a != null) {
                throw new AssertionError();
            }
            this.f2311a = xVar;
        }
    }

    public f() {
        this(c.a.e.a0.d.k, c.a.e.d.d, Collections.emptyMap(), false, false, false, y, false, false, false, w.d, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    f(c.a.e.a0.d dVar, c.a.e.e eVar, Map<Type, h<?>> map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, w wVar, String str, int r23, int r24, List<y> list, List<y> list2, List<y> list3) {
        this.f2304a = new ThreadLocal<>();
        this.f2305b = new ConcurrentHashMap();
        this.f = dVar;
        this.g = eVar;
        this.h = map;
        this.f2306c = new c.a.e.a0.c(map);
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.s = wVar;
        this.p = str;
        this.q = r23;
        this.r = r24;
        this.t = list;
        this.u = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.a.e.a0.p.n.Y);
        arrayList.add(c.a.e.a0.p.h.f2260b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(c.a.e.a0.p.n.D);
        arrayList.add(c.a.e.a0.p.n.m);
        arrayList.add(c.a.e.a0.p.n.g);
        arrayList.add(c.a.e.a0.p.n.i);
        arrayList.add(c.a.e.a0.p.n.k);
        x<Number> xVarT = t(wVar);
        arrayList.add(c.a.e.a0.p.n.c(Long.TYPE, Long.class, xVarT));
        arrayList.add(c.a.e.a0.p.n.c(Double.TYPE, Double.class, e(z8)));
        arrayList.add(c.a.e.a0.p.n.c(Float.TYPE, Float.class, h(z8)));
        arrayList.add(c.a.e.a0.p.n.x);
        arrayList.add(c.a.e.a0.p.n.o);
        arrayList.add(c.a.e.a0.p.n.q);
        arrayList.add(c.a.e.a0.p.n.b(AtomicLong.class, b(xVarT)));
        arrayList.add(c.a.e.a0.p.n.b(AtomicLongArray.class, c(xVarT)));
        arrayList.add(c.a.e.a0.p.n.s);
        arrayList.add(c.a.e.a0.p.n.z);
        arrayList.add(c.a.e.a0.p.n.F);
        arrayList.add(c.a.e.a0.p.n.H);
        arrayList.add(c.a.e.a0.p.n.b(BigDecimal.class, c.a.e.a0.p.n.B));
        arrayList.add(c.a.e.a0.p.n.b(BigInteger.class, c.a.e.a0.p.n.C));
        arrayList.add(c.a.e.a0.p.n.J);
        arrayList.add(c.a.e.a0.p.n.L);
        arrayList.add(c.a.e.a0.p.n.P);
        arrayList.add(c.a.e.a0.p.n.R);
        arrayList.add(c.a.e.a0.p.n.W);
        arrayList.add(c.a.e.a0.p.n.N);
        arrayList.add(c.a.e.a0.p.n.d);
        arrayList.add(c.a.e.a0.p.c.f2255b);
        arrayList.add(c.a.e.a0.p.n.U);
        arrayList.add(c.a.e.a0.p.k.f2270b);
        arrayList.add(c.a.e.a0.p.j.f2268b);
        arrayList.add(c.a.e.a0.p.n.S);
        arrayList.add(c.a.e.a0.p.a.f2250c);
        arrayList.add(c.a.e.a0.p.n.f2280b);
        arrayList.add(new c.a.e.a0.p.b(this.f2306c));
        arrayList.add(new c.a.e.a0.p.g(this.f2306c, z3));
        c.a.e.a0.p.d dVar2 = new c.a.e.a0.p.d(this.f2306c);
        this.d = dVar2;
        arrayList.add(dVar2);
        arrayList.add(c.a.e.a0.p.n.Z);
        arrayList.add(new c.a.e.a0.p.i(this.f2306c, eVar, dVar, this.d));
        this.e = Collections.unmodifiableList(arrayList);
    }

    private static void a(Object obj, c.a.e.c0.a aVar) {
        if (obj != null) {
            try {
                if (aVar.z() == c.a.e.c0.c.END_DOCUMENT) {
                } else {
                    throw new m("JSON document was not fully consumed.");
                }
            } catch (c.a.e.c0.e e2) {
                throw new v(e2);
            } catch (IOException e3) {
                throw new m(e3);
            }
        }
    }

    private static x<AtomicLong> b(x<Number> xVar) {
        return new d(xVar).d();
    }

    private static x<AtomicLongArray> c(x<Number> xVar) {
        return new e(xVar).d();
    }

    static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private x<Number> e(boolean z2) {
        return z2 ? c.a.e.a0.p.n.v : new a();
    }

    private x<Number> h(boolean z2) {
        return z2 ? c.a.e.a0.p.n.u : new b();
    }

    private static x<Number> t(w wVar) {
        return wVar == w.d ? c.a.e.a0.p.n.t : new c();
    }

    public String A(Object obj, Type type) throws m {
        StringWriter stringWriter = new StringWriter();
        F(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void B(l lVar, c.a.e.c0.d dVar) throws m {
        boolean zL = dVar.l();
        dVar.w(y);
        boolean zK = dVar.k();
        dVar.u(this.l);
        boolean zJ = dVar.j();
        dVar.x(this.i);
        try {
            try {
                c.a.e.a0.n.b(lVar, dVar);
            } catch (IOException e2) {
                throw new m(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage(), e3);
            }
        } finally {
            dVar.w(zL);
            dVar.u(zK);
            dVar.x(zJ);
        }
    }

    public void C(l lVar, Appendable appendable) throws m {
        try {
            B(lVar, w(c.a.e.a0.n.c(appendable)));
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public void D(Object obj, Appendable appendable) throws m {
        if (obj != null) {
            F(obj, obj.getClass(), appendable);
        } else {
            C(n.f2315a, appendable);
        }
    }

    public void E(Object obj, Type type, c.a.e.c0.d dVar) throws m {
        x xVarP = p(c.a.e.b0.a.c(type));
        boolean zL = dVar.l();
        dVar.w(y);
        boolean zK = dVar.k();
        dVar.u(this.l);
        boolean zJ = dVar.j();
        dVar.x(this.i);
        try {
            try {
                xVarP.i(dVar, obj);
            } catch (IOException e2) {
                throw new m(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage(), e3);
            }
        } finally {
            dVar.w(zL);
            dVar.u(zK);
            dVar.x(zJ);
        }
    }

    public void F(Object obj, Type type, Appendable appendable) throws m {
        try {
            E(obj, type, w(c.a.e.a0.n.c(appendable)));
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public l G(Object obj) {
        return obj == null ? n.f2315a : H(obj, obj.getClass());
    }

    public l H(Object obj, Type type) throws m {
        c.a.e.a0.p.f fVar = new c.a.e.a0.p.f();
        E(obj, type, fVar);
        return fVar.G();
    }

    public c.a.e.a0.d f() {
        return this.f;
    }

    public c.a.e.e g() {
        return this.g;
    }

    public <T> T i(l lVar, Class<T> cls) throws v {
        return (T) c.a.e.a0.m.e(cls).cast(j(lVar, cls));
    }

    public <T> T j(l lVar, Type type) throws v {
        if (lVar == null) {
            return null;
        }
        return (T) k(new c.a.e.a0.p.e(lVar), type);
    }

    public <T> T k(c.a.e.c0.a aVar, Type type) throws v, m {
        boolean zM = aVar.m();
        boolean z2 = y;
        aVar.E(y);
        try {
            try {
                try {
                    aVar.z();
                    z2 = false;
                    T tE = p(c.a.e.b0.a.c(type)).e(aVar);
                    aVar.E(zM);
                    return tE;
                } catch (IOException e2) {
                    throw new v(e2);
                } catch (IllegalStateException e3) {
                    throw new v(e3);
                }
            } catch (EOFException e4) {
                if (!z2) {
                    throw new v(e4);
                }
                aVar.E(zM);
                return null;
            } catch (AssertionError e5) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e5.getMessage(), e5);
            }
        } catch (Throwable th) {
            aVar.E(zM);
            throw th;
        }
    }

    public <T> T l(Reader reader, Class<T> cls) throws v, m {
        c.a.e.c0.a aVarV = v(reader);
        Object objK = k(aVarV, cls);
        a(objK, aVarV);
        return (T) c.a.e.a0.m.e(cls).cast(objK);
    }

    public <T> T m(Reader reader, Type type) throws v, m {
        c.a.e.c0.a aVarV = v(reader);
        T t = (T) k(aVarV, type);
        a(t, aVarV);
        return t;
    }

    public <T> T n(String str, Class<T> cls) throws v {
        return (T) c.a.e.a0.m.e(cls).cast(o(str, cls));
    }

    public <T> T o(String str, Type type) throws v {
        if (str == null) {
            return null;
        }
        return (T) m(new StringReader(str), type);
    }

    public <T> x<T> p(c.a.e.b0.a<T> aVar) {
        x<T> xVar = (x) this.f2305b.get(aVar == null ? C : aVar);
        if (xVar != null) {
            return xVar;
        }
        Map<c.a.e.b0.a<?>, C0158f<?>> map = this.f2304a.get();
        boolean z2 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f2304a.set(map);
            z2 = y;
        }
        C0158f<?> c0158f = map.get(aVar);
        if (c0158f != null) {
            return c0158f;
        }
        try {
            C0158f<?> c0158f2 = new C0158f<>();
            map.put(aVar, c0158f2);
            Iterator<y> it = this.e.iterator();
            while (it.hasNext()) {
                x<T> xVarB = it.next().b(this, aVar);
                if (xVarB != null) {
                    c0158f2.j(xVarB);
                    this.f2305b.put(aVar, xVarB);
                    return xVarB;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z2) {
                this.f2304a.remove();
            }
        }
    }

    public <T> x<T> q(Class<T> cls) {
        return p(c.a.e.b0.a.b(cls));
    }

    public <T> x<T> r(y yVar, c.a.e.b0.a<T> aVar) {
        if (!this.e.contains(yVar)) {
            yVar = this.d;
        }
        boolean z2 = false;
        for (y yVar2 : this.e) {
            if (z2) {
                x<T> xVarB = yVar2.b(this, aVar);
                if (xVarB != null) {
                    return xVarB;
                }
            } else if (yVar2 == yVar) {
                z2 = y;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public boolean s() {
        return this.l;
    }

    public String toString() {
        return "{serializeNulls:" + this.i + ",factories:" + this.e + ",instanceCreators:" + this.f2306c + "}";
    }

    public g u() {
        return new g(this);
    }

    public c.a.e.c0.a v(Reader reader) {
        c.a.e.c0.a aVar = new c.a.e.c0.a(reader);
        aVar.E(this.n);
        return aVar;
    }

    public c.a.e.c0.d w(Writer writer) throws IOException {
        if (this.k) {
            writer.write(D);
        }
        c.a.e.c0.d dVar = new c.a.e.c0.d(writer);
        if (this.m) {
            dVar.v("  ");
        }
        dVar.x(this.i);
        return dVar;
    }

    public boolean x() {
        return this.i;
    }

    public String y(l lVar) throws m {
        StringWriter stringWriter = new StringWriter();
        C(lVar, stringWriter);
        return stringWriter.toString();
    }

    public String z(Object obj) {
        return obj == null ? y(n.f2315a) : A(obj, obj.getClass());
    }
}
