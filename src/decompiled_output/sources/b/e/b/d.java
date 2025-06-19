package b.e.b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.i0;
import b.e.b.h;

/* loaded from: classes.dex */
class d implements f {

    /* renamed from: a, reason: collision with root package name */
    final RectF f877a = new RectF();

    class a implements h.a {
        a() {
        }

        @Override // b.e.b.h.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float fWidth = (rectF.width() - f2) - 1.0f;
            float fHeight = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                d.this.f877a.set(f4, f4, f3, f3);
                int r13 = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(d.this.f877a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f877a, 180.0f, 90.0f, true, paint);
                canvas.translate(fHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f877a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f877a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(r13);
                float f5 = (rectF.left + f3) - 1.0f;
                float f6 = rectF.top;
                canvas.drawRect(f5, f6, (rectF.right - f3) + 1.0f, f6 + f3, paint);
                float f7 = (rectF.left + f3) - 1.0f;
                float f8 = rectF.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF.right - f3) + 1.0f, f8, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    d() {
    }

    private h p(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new h(context.getResources(), colorStateList, f, f2, f3);
    }

    private h q(e eVar) {
        return (h) eVar.h();
    }

    @Override // b.e.b.f
    public float a(e eVar) {
        return q(eVar).i();
    }

    @Override // b.e.b.f
    public ColorStateList b(e eVar) {
        return q(eVar).f();
    }

    @Override // b.e.b.f
    public void c(e eVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        h hVarP = p(context, colorStateList, f, f2, f3);
        hVarP.m(eVar.f());
        eVar.e(hVarP);
        f(eVar);
    }

    @Override // b.e.b.f
    public void d(e eVar, float f) {
        q(eVar).p(f);
        f(eVar);
    }

    @Override // b.e.b.f
    public float e(e eVar) {
        return q(eVar).l();
    }

    @Override // b.e.b.f
    public void f(e eVar) {
        Rect rect = new Rect();
        q(eVar).h(rect);
        eVar.d((int) Math.ceil(j(eVar)), (int) Math.ceil(i(eVar)));
        eVar.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // b.e.b.f
    public void g() {
        h.s = new a();
    }

    @Override // b.e.b.f
    public float h(e eVar) {
        return q(eVar).g();
    }

    @Override // b.e.b.f
    public float i(e eVar) {
        return q(eVar).j();
    }

    @Override // b.e.b.f
    public float j(e eVar) {
        return q(eVar).k();
    }

    @Override // b.e.b.f
    public void k(e eVar) {
    }

    @Override // b.e.b.f
    public void l(e eVar, float f) {
        q(eVar).r(f);
    }

    @Override // b.e.b.f
    public void m(e eVar) {
        q(eVar).m(eVar.f());
        f(eVar);
    }

    @Override // b.e.b.f
    public void n(e eVar, @i0 ColorStateList colorStateList) {
        q(eVar).o(colorStateList);
    }

    @Override // b.e.b.f
    public void o(e eVar, float f) {
        q(eVar).q(f);
        f(eVar);
    }
}
