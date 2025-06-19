package c.a.b.c.t;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.h0;
import c.a.b.c.a;

@Deprecated
/* loaded from: classes.dex */
public class a extends b.a.c.a.c {
    static final double u = Math.cos(Math.toRadians(45.0d));
    static final float v = 1.5f;
    static final float w = 0.25f;
    static final float x = 0.5f;
    static final float y = 1.0f;

    @h0
    final Paint e;

    @h0
    final Paint f;

    @h0
    final RectF g;
    float h;
    Path i;
    float j;
    float k;
    float l;
    float m;
    private boolean n;
    private final int o;
    private final int p;
    private final int q;
    private boolean r;
    private float s;
    private boolean t;

    public a(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.n = true;
        this.r = true;
        this.t = false;
        this.o = b.i.c.c.e(context, a.e.design_fab_shadow_start_color);
        this.p = b.i.c.c.e(context, a.e.design_fab_shadow_mid_color);
        this.q = b.i.c.c.e(context, a.e.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.h = Math.round(f);
        this.g = new RectF();
        Paint paint2 = new Paint(this.e);
        this.f = paint2;
        paint2.setAntiAlias(false);
        r(f2, f3);
    }

    private void c(@h0 Rect rect) {
        float f = this.k;
        float f2 = v * f;
        this.g.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        Drawable drawableA = a();
        RectF rectF = this.g;
        drawableA.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        d();
    }

    private void d() {
        float f = this.h;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.l;
        rectF2.inset(-f2, -f2);
        Path path = this.i;
        if (path == null) {
            this.i = new Path();
        } else {
            path.reset();
        }
        this.i.setFillType(Path.FillType.EVEN_ODD);
        this.i.moveTo(-this.h, 0.0f);
        this.i.rLineTo(-this.l, 0.0f);
        this.i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.i.arcTo(rectF, 270.0f, -90.0f, false);
        this.i.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.h / f3;
            this.e.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.o, this.p, this.q}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.o, this.p, this.q}, new float[]{0.0f, x, 1.0f}, Shader.TileMode.CLAMP));
        this.f.setAntiAlias(false);
    }

    public static float e(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - u) * f2)) : f;
    }

    public static float f(float f, float f2, boolean z) {
        float f3 = f * v;
        return z ? (float) (f3 + ((1.0d - u) * f2)) : f3;
    }

    private void g(@h0 Canvas canvas) {
        int r14;
        float f;
        int r16;
        float f2;
        float f3;
        float f4;
        int r8 = canvas.save();
        canvas.rotate(this.s, this.g.centerX(), this.g.centerY());
        float f5 = this.h;
        float f6 = (-f5) - this.l;
        float f7 = f5 * 2.0f;
        boolean z = this.g.width() - f7 > 0.0f;
        boolean z2 = this.g.height() - f7 > 0.0f;
        float f8 = this.m;
        float f9 = f8 - (w * f8);
        float f10 = f5 / ((f8 - (x * f8)) + f5);
        float f11 = f5 / (f9 + f5);
        float f12 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int r4 = canvas.save();
        RectF rectF = this.g;
        canvas.translate(rectF.left + f5, rectF.top + f5);
        canvas.scale(f10, f11);
        canvas.drawPath(this.i, this.e);
        if (z) {
            canvas.scale(1.0f / f10, 1.0f);
            r14 = r4;
            f = f12;
            r16 = r8;
            f2 = f11;
            canvas.drawRect(0.0f, f6, this.g.width() - f7, -this.h, this.f);
        } else {
            r14 = r4;
            f = f12;
            r16 = r8;
            f2 = f11;
        }
        canvas.restoreToCount(r14);
        int r142 = canvas.save();
        RectF rectF2 = this.g;
        canvas.translate(rectF2.right - f5, rectF2.bottom - f5);
        float f13 = f;
        canvas.scale(f10, f13);
        canvas.rotate(180.0f);
        canvas.drawPath(this.i, this.e);
        if (z) {
            canvas.scale(1.0f / f10, 1.0f);
            f3 = f2;
            f4 = f13;
            canvas.drawRect(0.0f, f6, this.g.width() - f7, (-this.h) + this.l, this.f);
        } else {
            f3 = f2;
            f4 = f13;
        }
        canvas.restoreToCount(r142);
        int r12 = canvas.save();
        RectF rectF3 = this.g;
        canvas.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas.scale(f10, f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.i, this.e);
        if (z2) {
            canvas.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.g.height() - f7, -this.h, this.f);
        }
        canvas.restoreToCount(r12);
        int r82 = canvas.save();
        RectF rectF4 = this.g;
        canvas.translate(rectF4.right - f5, rectF4.top + f5);
        float f14 = f3;
        canvas.scale(f10, f14);
        canvas.rotate(90.0f);
        canvas.drawPath(this.i, this.e);
        if (z2) {
            canvas.scale(1.0f / f14, 1.0f);
            canvas.drawRect(0.0f, f6, this.g.height() - f7, -this.h, this.f);
        }
        canvas.restoreToCount(r82);
        canvas.restoreToCount(r16);
    }

    private static int s(float f) {
        int r2 = Math.round(f);
        return r2 % 2 == 1 ? r2 - 1 : r2;
    }

    @Override // b.a.c.a.c, android.graphics.drawable.Drawable
    public void draw(@h0 Canvas canvas) {
        if (this.n) {
            c(getBounds());
            this.n = false;
        }
        g(canvas);
        super.draw(canvas);
    }

    @Override // b.a.c.a.c, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // b.a.c.a.c, android.graphics.drawable.Drawable
    public boolean getPadding(@h0 Rect rect) {
        int r0 = (int) Math.ceil(f(this.k, this.h, this.r));
        int r1 = (int) Math.ceil(e(this.k, this.h, this.r));
        rect.set(r1, r0, r1, r0);
        return true;
    }

    public float h() {
        return this.h;
    }

    public float i() {
        return this.k;
    }

    public float j() {
        float f = this.k;
        return (Math.max(f, this.h + ((f * v) / 2.0f)) * 2.0f) + (this.k * v * 2.0f);
    }

    public float k() {
        float f = this.k;
        return (Math.max(f, this.h + (f / 2.0f)) * 2.0f) + (this.k * 2.0f);
    }

    public float l() {
        return this.m;
    }

    public void m(boolean z) {
        this.r = z;
        invalidateSelf();
    }

    public void n(float f) {
        float fRound = Math.round(f);
        if (this.h == fRound) {
            return;
        }
        this.h = fRound;
        this.n = true;
        invalidateSelf();
    }

    public void o(float f) {
        r(this.m, f);
    }

    @Override // b.a.c.a.c, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.n = true;
    }

    public final void p(float f) {
        if (this.s != f) {
            this.s = f;
            invalidateSelf();
        }
    }

    public void q(float f) {
        r(f, this.k);
    }

    public void r(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float fS = s(f);
        float fS2 = s(f2);
        if (fS > fS2) {
            if (!this.t) {
                this.t = true;
            }
            fS = fS2;
        }
        if (this.m == fS && this.k == fS2) {
            return;
        }
        this.m = fS;
        this.k = fS2;
        this.l = Math.round(fS * v);
        this.j = fS2;
        this.n = true;
        invalidateSelf();
    }

    @Override // b.a.c.a.c, android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        super.setAlpha(r2);
        this.e.setAlpha(r2);
        this.f.setAlpha(r2);
    }
}
