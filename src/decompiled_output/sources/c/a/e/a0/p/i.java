package c.a.e.a0.p;

import c.a.e.v;
import c.a.e.x;
import c.a.e.y;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i implements y {
    private final c.a.e.a0.c d;
    private final c.a.e.e e;
    private final c.a.e.a0.d f;
    private final d g;
    private final c.a.e.a0.q.b h = c.a.e.a0.q.b.a();

    class a extends c {
        final /* synthetic */ Field d;
        final /* synthetic */ boolean e;
        final /* synthetic */ x f;
        final /* synthetic */ c.a.e.f g;
        final /* synthetic */ c.a.e.b0.a h;
        final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z, boolean z2, Field field, boolean z3, x xVar, c.a.e.f fVar, c.a.e.b0.a aVar, boolean z4) {
            super(str, z, z2);
            this.d = field;
            this.e = z3;
            this.f = xVar;
            this.g = fVar;
            this.h = aVar;
            this.i = z4;
        }

        @Override // c.a.e.a0.p.i.c
        void a(c.a.e.c0.a aVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
            Object objE = this.f.e(aVar);
            if (objE == null && this.i) {
                return;
            }
            this.d.set(obj, objE);
        }

        @Override // c.a.e.a0.p.i.c
        void b(c.a.e.c0.d dVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
            (this.e ? this.f : new m(this.g, this.f, this.h.h())).i(dVar, this.d.get(obj));
        }

        @Override // c.a.e.a0.p.i.c
        public boolean c(Object obj) throws IllegalAccessException, IOException {
            return this.f2266b && this.d.get(obj) != obj;
        }
    }

    public static final class b<T> extends x<T> {

        /* renamed from: a, reason: collision with root package name */
        private final c.a.e.a0.k<T> f2263a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, c> f2264b;

        b(c.a.e.a0.k<T> kVar, Map<String, c> map) {
            this.f2263a = kVar;
            this.f2264b = map;
        }

        @Override // c.a.e.x
        public T e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            T tA = this.f2263a.a();
            try {
                aVar.b();
                while (aVar.l()) {
                    c cVar = this.f2264b.get(aVar.t());
                    if (cVar == null || !cVar.f2267c) {
                        aVar.J();
                    } else {
                        cVar.a(aVar, tA);
                    }
                }
                aVar.i();
                return tA;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new v(e2);
            }
        }

        @Override // c.a.e.x
        public void i(c.a.e.c0.d dVar, T t) throws IOException {
            if (t == null) {
                dVar.p();
                return;
            }
            dVar.f();
            try {
                for (c cVar : this.f2264b.values()) {
                    if (cVar.c(t)) {
                        dVar.n(cVar.f2265a);
                        cVar.b(dVar, t);
                    }
                }
                dVar.i();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final String f2265a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f2266b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f2267c;

        protected c(String str, boolean z, boolean z2) {
            this.f2265a = str;
            this.f2266b = z;
            this.f2267c = z2;
        }

        abstract void a(c.a.e.c0.a aVar, Object obj) throws IllegalAccessException, IOException;

        abstract void b(c.a.e.c0.d dVar, Object obj) throws IllegalAccessException, IOException;

        abstract boolean c(Object obj) throws IllegalAccessException, IOException;
    }

    public i(c.a.e.a0.c cVar, c.a.e.e eVar, c.a.e.a0.d dVar, d dVar2) {
        this.d = cVar;
        this.e = eVar;
        this.f = dVar;
        this.g = dVar2;
    }

    private c a(c.a.e.f fVar, Field field, String str, c.a.e.b0.a<?> aVar, boolean z, boolean z2) {
        boolean zB = c.a.e.a0.m.b(aVar.f());
        c.a.e.z.b bVar = (c.a.e.z.b) field.getAnnotation(c.a.e.z.b.class);
        x<?> xVarA = bVar != null ? this.g.a(this.d, fVar, aVar, bVar) : null;
        boolean z3 = xVarA != null;
        if (xVarA == null) {
            xVarA = fVar.p(aVar);
        }
        return new a(str, z, z2, field, z3, xVarA, fVar, aVar, zB);
    }

    static boolean d(Field field, boolean z, c.a.e.a0.d dVar) {
        return (dVar.e(field.getType(), z) || dVar.h(field, z)) ? false : true;
    }

    private Map<String, c> e(c.a.e.f fVar, c.a.e.b0.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type typeH = aVar.h();
        c.a.e.b0.a<?> aVarC = aVar;
        Class<?> clsF = cls;
        while (clsF != Object.class) {
            Field[] declaredFields = clsF.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int r15 = 0;
            while (r15 < length) {
                Field field = declaredFields[r15];
                boolean zC = c(field, true);
                boolean zC2 = c(field, z);
                if (zC || zC2) {
                    this.h.b(field);
                    Type typeP = c.a.e.a0.b.p(aVarC.h(), clsF, field.getGenericType());
                    List<String> listF = f(field);
                    int size = listF.size();
                    c cVar = null;
                    int r2 = 0;
                    while (r2 < size) {
                        String str = listF.get(r2);
                        boolean z2 = r2 != 0 ? false : zC;
                        int r20 = r2;
                        c cVar2 = cVar;
                        int r21 = size;
                        List<String> list = listF;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, a(fVar, field, str, c.a.e.b0.a.c(typeP), z2, zC2)) : cVar2;
                        r2 = r20 + 1;
                        zC = z2;
                        listF = list;
                        size = r21;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(typeH + " declares multiple JSON fields named " + cVar3.f2265a);
                    }
                }
                r15++;
                z = false;
            }
            aVarC = c.a.e.b0.a.c(c.a.e.a0.b.p(aVarC.h(), clsF, clsF.getGenericSuperclass()));
            clsF = aVarC.f();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        c.a.e.z.c cVar = (c.a.e.z.c) field.getAnnotation(c.a.e.z.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.e.e(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // c.a.e.y
    public <T> x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
        Class<? super T> clsF = aVar.f();
        if (Object.class.isAssignableFrom(clsF)) {
            return new b(this.d.a(aVar), e(fVar, aVar, clsF));
        }
        return null;
    }

    public boolean c(Field field, boolean z) {
        return d(field, z, this.f);
    }
}
