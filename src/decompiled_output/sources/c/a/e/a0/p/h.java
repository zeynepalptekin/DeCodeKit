package c.a.e.a0.p;

import c.a.e.x;
import c.a.e.y;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends x<Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final y f2260b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final c.a.e.f f2261a;

    static class a implements y {
        a() {
        }

        @Override // c.a.e.y
        public <T> x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            if (aVar.f() == Object.class) {
                return new h(fVar);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2262a;

        static {
            int[] r0 = new int[c.a.e.c0.c.values().length];
            f2262a = r0;
            try {
                r0[c.a.e.c0.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2262a[c.a.e.c0.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2262a[c.a.e.c0.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2262a[c.a.e.c0.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2262a[c.a.e.c0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2262a[c.a.e.c0.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    h(c.a.e.f fVar) {
        this.f2261a = fVar;
    }

    @Override // c.a.e.x
    public Object e(c.a.e.c0.a aVar) throws IOException {
        switch (b.f2262a[aVar.z().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.l()) {
                    arrayList.add(e(aVar));
                }
                aVar.h();
                return arrayList;
            case 2:
                c.a.e.a0.j jVar = new c.a.e.a0.j();
                aVar.b();
                while (aVar.l()) {
                    jVar.put(aVar.t(), e(aVar));
                }
                aVar.i();
                return jVar;
            case 3:
                return aVar.x();
            case 4:
                return Double.valueOf(aVar.q());
            case 5:
                return Boolean.valueOf(aVar.p());
            case 6:
                aVar.v();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // c.a.e.x
    public void i(c.a.e.c0.d dVar, Object obj) throws IOException {
        if (obj == null) {
            dVar.p();
            return;
        }
        x xVarQ = this.f2261a.q(obj.getClass());
        if (!(xVarQ instanceof h)) {
            xVarQ.i(dVar, obj);
        } else {
            dVar.f();
            dVar.i();
        }
    }
}
