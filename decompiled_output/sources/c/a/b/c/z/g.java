package c.a.b.c.z;

import android.graphics.RectF;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private static final f f2076a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final f f2077b = new b();

    static class a implements f {
        a() {
        }

        @Override // c.a.b.c.z.f
        public h a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fL = u.l(f4, f6, f2, f3, f);
            float f8 = fL / f4;
            float f9 = fL / f6;
            return new h(f8, f9, fL, f5 * f8, fL, f7 * f9);
        }

        @Override // c.a.b.c.z.f
        public void b(RectF rectF, float f, h hVar) {
            rectF.bottom -= Math.abs(hVar.f - hVar.d) * f;
        }

        @Override // c.a.b.c.z.f
        public boolean c(h hVar) {
            return hVar.d > hVar.f;
        }
    }

    static class b implements f {
        b() {
        }

        @Override // c.a.b.c.z.f
        public h a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fL = u.l(f5, f7, f2, f3, f);
            float f8 = fL / f5;
            float f9 = fL / f7;
            return new h(f8, f9, f4 * f8, fL, f6 * f9, fL);
        }

        @Override // c.a.b.c.z.f
        public void b(RectF rectF, float f, h hVar) {
            float fAbs = (Math.abs(hVar.e - hVar.f2080c) / 2.0f) * f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }

        @Override // c.a.b.c.z.f
        public boolean c(h hVar) {
            return hVar.f2080c > hVar.e;
        }
    }

    private g() {
    }

    static f a(int r0, boolean z, RectF rectF, RectF rectF2) {
        if (r0 == 0) {
            return b(z, rectF, rectF2) ? f2076a : f2077b;
        }
        if (r0 == 1) {
            return f2076a;
        }
        if (r0 == 2) {
            return f2077b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + r0);
    }

    private static boolean b(boolean z, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        float f = (fHeight2 * fWidth) / fWidth2;
        float f2 = (fWidth2 * fHeight) / fWidth;
        if (z) {
            if (f >= fHeight) {
                return true;
            }
        } else if (f2 >= fHeight2) {
            return true;
        }
        return false;
    }
}
