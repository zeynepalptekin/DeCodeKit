package c.a.b.c.z.w;

import android.graphics.RectF;
import androidx.annotation.m0;

@m0(21)
/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private static final f f2124a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final f f2125b = new b();

    static class a implements f {
        a() {
        }

        @Override // c.a.b.c.z.w.f
        public h a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fL = v.l(f4, f6, f2, f3, f);
            float f8 = fL / f4;
            float f9 = fL / f6;
            return new h(f8, f9, fL, f5 * f8, fL, f7 * f9);
        }

        @Override // c.a.b.c.z.w.f
        public boolean b(h hVar) {
            return hVar.d > hVar.f;
        }

        @Override // c.a.b.c.z.w.f
        public void c(RectF rectF, float f, h hVar) {
            rectF.bottom -= Math.abs(hVar.f - hVar.d) * f;
        }
    }

    static class b implements f {
        b() {
        }

        @Override // c.a.b.c.z.w.f
        public h a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fL = v.l(f5, f7, f2, f3, f);
            float f8 = fL / f5;
            float f9 = fL / f7;
            return new h(f8, f9, f4 * f8, fL, f6 * f9, fL);
        }

        @Override // c.a.b.c.z.w.f
        public boolean b(h hVar) {
            return hVar.f2128c > hVar.e;
        }

        @Override // c.a.b.c.z.w.f
        public void c(RectF rectF, float f, h hVar) {
            float fAbs = (Math.abs(hVar.e - hVar.f2128c) / 2.0f) * f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }
    }

    private g() {
    }

    static f a(int r0, boolean z, RectF rectF, RectF rectF2) {
        if (r0 == 0) {
            return b(z, rectF, rectF2) ? f2124a : f2125b;
        }
        if (r0 == 1) {
            return f2124a;
        }
        if (r0 == 2) {
            return f2125b;
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
