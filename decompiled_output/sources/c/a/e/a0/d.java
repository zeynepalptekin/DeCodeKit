package c.a.e.a0;

import c.a.e.x;
import c.a.e.y;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements y, Cloneable {
    private static final double j = -1.0d;
    public static final d k = new d();
    private boolean g;
    private double d = j;
    private int e = 136;
    private boolean f = true;
    private List<c.a.e.b> h = Collections.emptyList();
    private List<c.a.e.b> i = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends x<T> {

        /* renamed from: a, reason: collision with root package name */
        private x<T> f2233a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f2234b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2235c;
        final /* synthetic */ c.a.e.f d;
        final /* synthetic */ c.a.e.b0.a e;

        a(boolean z, boolean z2, c.a.e.f fVar, c.a.e.b0.a aVar) {
            this.f2234b = z;
            this.f2235c = z2;
            this.d = fVar;
            this.e = aVar;
        }

        private x<T> j() {
            x<T> xVar = this.f2233a;
            if (xVar != null) {
                return xVar;
            }
            x<T> xVarR = this.d.r(d.this, this.e);
            this.f2233a = xVarR;
            return xVarR;
        }

        @Override // c.a.e.x
        public T e(c.a.e.c0.a aVar) throws IOException {
            if (!this.f2234b) {
                return j().e(aVar);
            }
            aVar.J();
            return null;
        }

        @Override // c.a.e.x
        public void i(c.a.e.c0.d dVar, T t) throws IOException {
            if (this.f2235c) {
                dVar.p();
            } else {
                j().i(dVar, t);
            }
        }
    }

    private boolean f(Class<?> cls) {
        if (this.d == j || q((c.a.e.z.d) cls.getAnnotation(c.a.e.z.d.class), (c.a.e.z.e) cls.getAnnotation(c.a.e.z.e.class))) {
            return (!this.f && m(cls)) || l(cls);
        }
        return true;
    }

    private boolean g(Class<?> cls, boolean z) {
        Iterator<c.a.e.b> it = (z ? this.h : this.i).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean l(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean m(Class<?> cls) {
        return cls.isMemberClass() && !n(cls);
    }

    private boolean n(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean o(c.a.e.z.d dVar) {
        return dVar == null || dVar.value() <= this.d;
    }

    private boolean p(c.a.e.z.e eVar) {
        return eVar == null || eVar.value() > this.d;
    }

    private boolean q(c.a.e.z.d dVar, c.a.e.z.e eVar) {
        return o(dVar) && p(eVar);
    }

    @Override // c.a.e.y
    public <T> x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
        Class<? super T> clsF = aVar.f();
        boolean zF = f(clsF);
        boolean z = zF || g(clsF, true);
        boolean z2 = zF || g(clsF, false);
        if (z || z2) {
            return new a(z2, z, fVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public d d() {
        d dVarClone = clone();
        dVarClone.f = false;
        return dVarClone;
    }

    public boolean e(Class<?> cls, boolean z) {
        return f(cls) || g(cls, z);
    }

    public boolean h(Field field, boolean z) {
        c.a.e.z.a aVar;
        if ((this.e & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.d != j && !q((c.a.e.z.d) field.getAnnotation(c.a.e.z.d.class), (c.a.e.z.e) field.getAnnotation(c.a.e.z.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.g && ((aVar = (c.a.e.z.a) field.getAnnotation(c.a.e.z.a.class)) == null || (!z ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f && m(field.getType())) || l(field.getType())) {
            return true;
        }
        List<c.a.e.b> list = z ? this.h : this.i;
        if (list.isEmpty()) {
            return false;
        }
        c.a.e.c cVar = new c.a.e.c(field);
        Iterator<c.a.e.b> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(cVar)) {
                return true;
            }
        }
        return false;
    }

    public d k() {
        d dVarClone = clone();
        dVarClone.g = true;
        return dVarClone;
    }

    public d r(c.a.e.b bVar, boolean z, boolean z2) {
        d dVarClone = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.h);
            dVarClone.h = arrayList;
            arrayList.add(bVar);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.i);
            dVarClone.i = arrayList2;
            arrayList2.add(bVar);
        }
        return dVarClone;
    }

    public d s(int... r6) {
        d dVarClone = clone();
        dVarClone.e = 0;
        for (int r0 : r6) {
            dVarClone.e = r0 | dVarClone.e;
        }
        return dVarClone;
    }

    public d t(double d) {
        d dVarClone = clone();
        dVarClone.d = d;
        return dVarClone;
    }
}
