package c.a.e.a0.p;

import c.a.e.x;
import c.a.e.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements y {
    private final c.a.e.a0.c d;

    private static final class a<E> extends x<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        private final x<E> f2253a;

        /* renamed from: b, reason: collision with root package name */
        private final c.a.e.a0.k<? extends Collection<E>> f2254b;

        public a(c.a.e.f fVar, Type type, x<E> xVar, c.a.e.a0.k<? extends Collection<E>> kVar) {
            this.f2253a = new m(fVar, xVar, type);
            this.f2254b = kVar;
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Collection<E> e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            Collection<E> collectionA = this.f2254b.a();
            aVar.a();
            while (aVar.l()) {
                collectionA.add(this.f2253a.e(aVar));
            }
            aVar.h();
            return collectionA;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                dVar.p();
                return;
            }
            dVar.e();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f2253a.i(dVar, it.next());
            }
            dVar.h();
        }
    }

    public b(c.a.e.a0.c cVar) {
        this.d = cVar;
    }

    @Override // c.a.e.y
    public <T> x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
        Type typeH = aVar.h();
        Class<? super T> clsF = aVar.f();
        if (!Collection.class.isAssignableFrom(clsF)) {
            return null;
        }
        Type typeH2 = c.a.e.a0.b.h(typeH, clsF);
        return new a(fVar, typeH2, fVar.p(c.a.e.b0.a.c(typeH2)), this.d.a(aVar));
    }
}
