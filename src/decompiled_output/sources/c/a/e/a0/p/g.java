package c.a.e.a0.p;

import c.a.e.r;
import c.a.e.v;
import c.a.e.x;
import c.a.e.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements y {
    private final c.a.e.a0.c d;
    final boolean e;

    private final class a<K, V> extends x<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private final x<K> f2257a;

        /* renamed from: b, reason: collision with root package name */
        private final x<V> f2258b;

        /* renamed from: c, reason: collision with root package name */
        private final c.a.e.a0.k<? extends Map<K, V>> f2259c;

        public a(c.a.e.f fVar, Type type, x<K> xVar, Type type2, x<V> xVar2, c.a.e.a0.k<? extends Map<K, V>> kVar) {
            this.f2257a = new m(fVar, xVar, type);
            this.f2258b = new m(fVar, xVar2, type2);
            this.f2259c = kVar;
        }

        private String j(c.a.e.l lVar) {
            if (!lVar.H()) {
                if (lVar.F()) {
                    return "null";
                }
                throw new AssertionError();
            }
            r rVarY = lVar.y();
            if (rVarY.P()) {
                return String.valueOf(rVarY.B());
            }
            if (rVarY.K()) {
                return Boolean.toString(rVarY.j());
            }
            if (rVarY.S()) {
                return rVarY.D();
            }
            throw new AssertionError();
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<K, V> e(c.a.e.c0.a aVar) throws IOException {
            c.a.e.c0.c cVarZ = aVar.z();
            if (cVarZ == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            Map<K, V> mapA = this.f2259c.a();
            if (cVarZ == c.a.e.c0.c.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.l()) {
                    aVar.a();
                    K kE = this.f2257a.e(aVar);
                    if (mapA.put(kE, this.f2258b.e(aVar)) != null) {
                        throw new v("duplicate key: " + kE);
                    }
                    aVar.h();
                }
                aVar.h();
            } else {
                aVar.b();
                while (aVar.l()) {
                    c.a.e.a0.g.f2238a.a(aVar);
                    K kE2 = this.f2257a.e(aVar);
                    if (mapA.put(kE2, this.f2258b.e(aVar)) != null) {
                        throw new v("duplicate key: " + kE2);
                    }
                }
                aVar.i();
            }
            return mapA;
        }

        @Override // c.a.e.x
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Map<K, V> map) throws IOException {
            if (map == null) {
                dVar.p();
                return;
            }
            if (!g.this.e) {
                dVar.f();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    dVar.n(String.valueOf(entry.getKey()));
                    this.f2258b.i(dVar, entry.getValue());
                }
                dVar.i();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int r2 = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                c.a.e.l lVarH = this.f2257a.h(entry2.getKey());
                arrayList.add(lVarH);
                arrayList2.add(entry2.getValue());
                z |= lVarH.E() || lVarH.G();
            }
            if (!z) {
                dVar.f();
                int size = arrayList.size();
                while (r2 < size) {
                    dVar.n(j((c.a.e.l) arrayList.get(r2)));
                    this.f2258b.i(dVar, arrayList2.get(r2));
                    r2++;
                }
                dVar.i();
                return;
            }
            dVar.e();
            int size2 = arrayList.size();
            while (r2 < size2) {
                dVar.e();
                c.a.e.a0.n.b((c.a.e.l) arrayList.get(r2), dVar);
                this.f2258b.i(dVar, arrayList2.get(r2));
                dVar.h();
                r2++;
            }
            dVar.h();
        }
    }

    public g(c.a.e.a0.c cVar, boolean z) {
        this.d = cVar;
        this.e = z;
    }

    private x<?> a(c.a.e.f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f : fVar.p(c.a.e.b0.a.c(type));
    }

    @Override // c.a.e.y
    public <T> x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) throws NoSuchMethodException, SecurityException {
        Type typeH = aVar.h();
        if (!Map.class.isAssignableFrom(aVar.f())) {
            return null;
        }
        Type[] typeArrJ = c.a.e.a0.b.j(typeH, c.a.e.a0.b.k(typeH));
        return new a(fVar, typeArrJ[0], a(fVar, typeArrJ[0]), typeArrJ[1], fVar.p(c.a.e.b0.a.c(typeArrJ[1])), this.d.a(aVar));
    }
}
