package c.a.e.a0.p;

import c.a.e.x;
import c.a.e.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a<E> extends x<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final y f2250c = new C0154a();

    /* renamed from: a, reason: collision with root package name */
    private final Class<E> f2251a;

    /* renamed from: b, reason: collision with root package name */
    private final x<E> f2252b;

    /* renamed from: c.a.e.a0.p.a$a, reason: collision with other inner class name */
    static class C0154a implements y {
        C0154a() {
        }

        @Override // c.a.e.y
        public <T> x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            Type typeH = aVar.h();
            if (!(typeH instanceof GenericArrayType) && (!(typeH instanceof Class) || !((Class) typeH).isArray())) {
                return null;
            }
            Type typeG = c.a.e.a0.b.g(typeH);
            return new a(fVar, fVar.p(c.a.e.b0.a.c(typeG)), c.a.e.a0.b.k(typeG));
        }
    }

    public a(c.a.e.f fVar, x<E> xVar, Class<E> cls) {
        this.f2252b = new m(fVar, xVar, cls);
        this.f2251a = cls;
    }

    @Override // c.a.e.x
    public Object e(c.a.e.c0.a aVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (aVar.z() == c.a.e.c0.c.NULL) {
            aVar.v();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.l()) {
            arrayList.add(this.f2252b.e(aVar));
        }
        aVar.h();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f2251a, size);
        for (int r2 = 0; r2 < size; r2++) {
            Array.set(objNewInstance, r2, arrayList.get(r2));
        }
        return objNewInstance;
    }

    @Override // c.a.e.x
    public void i(c.a.e.c0.d dVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            dVar.p();
            return;
        }
        dVar.e();
        int length = Array.getLength(obj);
        for (int r0 = 0; r0 < length; r0++) {
            this.f2252b.i(dVar, Array.get(obj, r0));
        }
        dVar.h();
    }
}
