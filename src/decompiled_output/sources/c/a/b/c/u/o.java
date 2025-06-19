package c.a.b.c.u;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.h0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import c.a.b.c.a;

/* loaded from: classes.dex */
public class o {
    public static final d m = new m(0.5f);

    /* renamed from: a, reason: collision with root package name */
    e f2023a;

    /* renamed from: b, reason: collision with root package name */
    e f2024b;

    /* renamed from: c, reason: collision with root package name */
    e f2025c;
    e d;
    d e;
    d f;
    d g;
    d h;
    g i;
    g j;
    g k;
    g l;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private e f2026a;

        /* renamed from: b, reason: collision with root package name */
        @h0
        private e f2027b;

        /* renamed from: c, reason: collision with root package name */
        @h0
        private e f2028c;

        @h0
        private e d;

        @h0
        private d e;

        @h0
        private d f;

        @h0
        private d g;

        @h0
        private d h;

        @h0
        private g i;

        @h0
        private g j;

        @h0
        private g k;

        @h0
        private g l;

        public b() {
            this.f2026a = k.b();
            this.f2027b = k.b();
            this.f2028c = k.b();
            this.d = k.b();
            this.e = new c.a.b.c.u.a(0.0f);
            this.f = new c.a.b.c.u.a(0.0f);
            this.g = new c.a.b.c.u.a(0.0f);
            this.h = new c.a.b.c.u.a(0.0f);
            this.i = k.c();
            this.j = k.c();
            this.k = k.c();
            this.l = k.c();
        }

        public b(@h0 o oVar) {
            this.f2026a = k.b();
            this.f2027b = k.b();
            this.f2028c = k.b();
            this.d = k.b();
            this.e = new c.a.b.c.u.a(0.0f);
            this.f = new c.a.b.c.u.a(0.0f);
            this.g = new c.a.b.c.u.a(0.0f);
            this.h = new c.a.b.c.u.a(0.0f);
            this.i = k.c();
            this.j = k.c();
            this.k = k.c();
            this.l = k.c();
            this.f2026a = oVar.f2023a;
            this.f2027b = oVar.f2024b;
            this.f2028c = oVar.f2025c;
            this.d = oVar.d;
            this.e = oVar.e;
            this.f = oVar.f;
            this.g = oVar.g;
            this.h = oVar.h;
            this.i = oVar.i;
            this.j = oVar.j;
            this.k = oVar.k;
            this.l = oVar.l;
        }

        private static float n(e eVar) {
            if (eVar instanceof n) {
                return ((n) eVar).f2022a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f2008a;
            }
            return -1.0f;
        }

        @h0
        public b A(int r1, @h0 d dVar) {
            return B(k.a(r1)).D(dVar);
        }

        @h0
        public b B(@h0 e eVar) {
            this.f2028c = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                C(fN);
            }
            return this;
        }

        @h0
        public b C(@androidx.annotation.p float f) {
            this.g = new c.a.b.c.u.a(f);
            return this;
        }

        @h0
        public b D(@h0 d dVar) {
            this.g = dVar;
            return this;
        }

        @h0
        public b E(@h0 g gVar) {
            this.l = gVar;
            return this;
        }

        @h0
        public b F(@h0 g gVar) {
            this.j = gVar;
            return this;
        }

        @h0
        public b G(@h0 g gVar) {
            this.i = gVar;
            return this;
        }

        @h0
        public b H(int r1, @androidx.annotation.p float f) {
            return J(k.a(r1)).K(f);
        }

        @h0
        public b I(int r1, @h0 d dVar) {
            return J(k.a(r1)).L(dVar);
        }

        @h0
        public b J(@h0 e eVar) {
            this.f2026a = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                K(fN);
            }
            return this;
        }

        @h0
        public b K(@androidx.annotation.p float f) {
            this.e = new c.a.b.c.u.a(f);
            return this;
        }

        @h0
        public b L(@h0 d dVar) {
            this.e = dVar;
            return this;
        }

        @h0
        public b M(int r1, @androidx.annotation.p float f) {
            return O(k.a(r1)).P(f);
        }

        @h0
        public b N(int r1, @h0 d dVar) {
            return O(k.a(r1)).Q(dVar);
        }

        @h0
        public b O(@h0 e eVar) {
            this.f2027b = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                P(fN);
            }
            return this;
        }

        @h0
        public b P(@androidx.annotation.p float f) {
            this.f = new c.a.b.c.u.a(f);
            return this;
        }

        @h0
        public b Q(@h0 d dVar) {
            this.f = dVar;
            return this;
        }

        @h0
        public o m() {
            return new o(this);
        }

        @h0
        public b o(@androidx.annotation.p float f) {
            return K(f).P(f).C(f).x(f);
        }

        @h0
        public b p(@h0 d dVar) {
            return L(dVar).Q(dVar).D(dVar).y(dVar);
        }

        @h0
        public b q(int r1, @androidx.annotation.p float f) {
            return r(k.a(r1)).o(f);
        }

        @h0
        public b r(@h0 e eVar) {
            return J(eVar).O(eVar).B(eVar).w(eVar);
        }

        @h0
        public b s(@h0 g gVar) {
            return E(gVar).G(gVar).F(gVar).t(gVar);
        }

        @h0
        public b t(@h0 g gVar) {
            this.k = gVar;
            return this;
        }

        @h0
        public b u(int r1, @androidx.annotation.p float f) {
            return w(k.a(r1)).x(f);
        }

        @h0
        public b v(int r1, @h0 d dVar) {
            return w(k.a(r1)).y(dVar);
        }

        @h0
        public b w(@h0 e eVar) {
            this.d = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                x(fN);
            }
            return this;
        }

        @h0
        public b x(@androidx.annotation.p float f) {
            this.h = new c.a.b.c.u.a(f);
            return this;
        }

        @h0
        public b y(@h0 d dVar) {
            this.h = dVar;
            return this;
        }

        @h0
        public b z(int r1, @androidx.annotation.p float f) {
            return B(k.a(r1)).C(f);
        }
    }

    @p0({p0.a.LIBRARY_GROUP})
    public interface c {
        @h0
        d a(@h0 d dVar);
    }

    public o() {
        this.f2023a = k.b();
        this.f2024b = k.b();
        this.f2025c = k.b();
        this.d = k.b();
        this.e = new c.a.b.c.u.a(0.0f);
        this.f = new c.a.b.c.u.a(0.0f);
        this.g = new c.a.b.c.u.a(0.0f);
        this.h = new c.a.b.c.u.a(0.0f);
        this.i = k.c();
        this.j = k.c();
        this.k = k.c();
        this.l = k.c();
    }

    private o(@h0 b bVar) {
        this.f2023a = bVar.f2026a;
        this.f2024b = bVar.f2027b;
        this.f2025c = bVar.f2028c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    @h0
    public static b a() {
        return new b();
    }

    @h0
    public static b b(Context context, @t0 int r2, @t0 int r3) {
        return c(context, r2, r3, 0);
    }

    @h0
    private static b c(Context context, @t0 int r2, @t0 int r3, int r4) {
        return d(context, r2, r3, new c.a.b.c.u.a(r4));
    }

    @h0
    private static b d(Context context, @t0 int r7, @t0 int r8, @h0 d dVar) throws Resources.NotFoundException {
        if (r8 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, r7);
            r7 = r8;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(r7, a.o.ShapeAppearance);
        try {
            int r72 = typedArrayObtainStyledAttributes.getInt(a.o.ShapeAppearance_cornerFamily, 0);
            int r82 = typedArrayObtainStyledAttributes.getInt(a.o.ShapeAppearance_cornerFamilyTopLeft, r72);
            int r0 = typedArrayObtainStyledAttributes.getInt(a.o.ShapeAppearance_cornerFamilyTopRight, r72);
            int r1 = typedArrayObtainStyledAttributes.getInt(a.o.ShapeAppearance_cornerFamilyBottomRight, r72);
            int r73 = typedArrayObtainStyledAttributes.getInt(a.o.ShapeAppearance_cornerFamilyBottomLeft, r72);
            d dVarM = m(typedArrayObtainStyledAttributes, a.o.ShapeAppearance_cornerSize, dVar);
            d dVarM2 = m(typedArrayObtainStyledAttributes, a.o.ShapeAppearance_cornerSizeTopLeft, dVarM);
            d dVarM3 = m(typedArrayObtainStyledAttributes, a.o.ShapeAppearance_cornerSizeTopRight, dVarM);
            d dVarM4 = m(typedArrayObtainStyledAttributes, a.o.ShapeAppearance_cornerSizeBottomRight, dVarM);
            return new b().I(r82, dVarM2).N(r0, dVarM3).A(r1, dVarM4).v(r73, m(typedArrayObtainStyledAttributes, a.o.ShapeAppearance_cornerSizeBottomLeft, dVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @h0
    public static b e(@h0 Context context, AttributeSet attributeSet, @androidx.annotation.f int r3, @t0 int r4) {
        return f(context, attributeSet, r3, r4, 0);
    }

    @h0
    public static b f(@h0 Context context, AttributeSet attributeSet, @androidx.annotation.f int r3, @t0 int r4, int r5) {
        return g(context, attributeSet, r3, r4, new c.a.b.c.u.a(r5));
    }

    @h0
    public static b g(@h0 Context context, AttributeSet attributeSet, @androidx.annotation.f int r3, @t0 int r4, @h0 d dVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.MaterialShape, r3, r4);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    @h0
    private static d m(TypedArray typedArray, int r3, @h0 d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(r3);
        if (typedValuePeekValue == null) {
            return dVar;
        }
        int r0 = typedValuePeekValue.type;
        return r0 == 5 ? new c.a.b.c.u.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : r0 == 6 ? new m(typedValuePeekValue.getFraction(1.0f, 1.0f)) : dVar;
    }

    @h0
    public g h() {
        return this.k;
    }

    @h0
    public e i() {
        return this.d;
    }

    @h0
    public d j() {
        return this.h;
    }

    @h0
    public e k() {
        return this.f2025c;
    }

    @h0
    public d l() {
        return this.g;
    }

    @h0
    public g n() {
        return this.l;
    }

    @h0
    public g o() {
        return this.j;
    }

    @h0
    public g p() {
        return this.i;
    }

    @h0
    public e q() {
        return this.f2023a;
    }

    @h0
    public d r() {
        return this.e;
    }

    @h0
    public e s() {
        return this.f2024b;
    }

    @h0
    public d t() {
        return this.f;
    }

    @p0({p0.a.LIBRARY_GROUP})
    public boolean u(@h0 RectF rectF) {
        boolean z = this.l.getClass().equals(g.class) && this.j.getClass().equals(g.class) && this.i.getClass().equals(g.class) && this.k.getClass().equals(g.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f2024b instanceof n) && (this.f2023a instanceof n) && (this.f2025c instanceof n) && (this.d instanceof n));
    }

    @h0
    public b v() {
        return new b(this);
    }

    @h0
    public o w(float f) {
        return v().o(f).m();
    }

    @h0
    public o x(@h0 d dVar) {
        return v().p(dVar).m();
    }

    @h0
    @p0({p0.a.LIBRARY_GROUP})
    public o y(@h0 c cVar) {
        return v().L(cVar.a(r())).Q(cVar.a(t())).y(cVar.a(j())).D(cVar.a(l())).m();
    }
}
