package b.e.b;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.i0;
import b.e.a;

/* loaded from: classes.dex */
class h extends Drawable {
    private static final double q = Math.cos(Math.toRadians(45.0d));
    private static final float r = 1.5f;
    static a s;

    /* renamed from: a, reason: collision with root package name */
    private final int f882a;

    /* renamed from: c, reason: collision with root package name */
    private Paint f884c;
    private Paint d;
    private final RectF e;
    private float f;
    private Path g;
    private float h;
    private float i;
    private float j;
    private ColorStateList k;
    private final int m;
    private final int n;
    private boolean l = true;
    private boolean o = true;
    private boolean p = false;

    /* renamed from: b, reason: collision with root package name */
    private Paint f883b = new Paint(5);

    interface a {
        void a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    h(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.m = resources.getColor(a.b.cardview_shadow_start_color);
        this.n = resources.getColor(a.b.cardview_shadow_end_color);
        this.f882a = resources.getDimensionPixelSize(a.c.cardview_compat_inset_shadow);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f884c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f = (int) (f + 0.5f);
        this.e = new RectF();
        Paint paint2 = new Paint(this.f884c);
        this.d = paint2;
        paint2.setAntiAlias(false);
        s(f2, f3);
    }

    private void a(Rect rect) {
        float f = this.h;
        float f2 = r * f;
        this.e.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        b();
    }

    private void b() {
        float f = this.f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.i;
        rectF2.inset(-f2, -f2);
        Path path = this.g;
        if (path == null) {
            this.g = new Path();
        } else {
            path.reset();
        }
        this.g.setFillType(Path.FillType.EVEN_ODD);
        this.g.moveTo(-this.f, 0.0f);
        this.g.rLineTo(-this.i, 0.0f);
        this.g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.g.arcTo(rectF, 270.0f, -90.0f, false);
        this.g.close();
        float f3 = this.f;
        float f4 = f3 / (this.i + f3);
        Paint paint = this.f884c;
        float f5 = this.f + this.i;
        int r6 = this.m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{r6, r6, this.n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.d;
        float f6 = this.f;
        float f7 = this.i;
        int r5 = this.m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{r5, r5, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.d.setAntiAlias(false);
    }

    static float c(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - q) * f2)) : f;
    }

    static float d(float f, float f2, boolean z) {
        float f3 = f * r;
        return z ? (float) (f3 + ((1.0d - q) * f2)) : f3;
    }

    private void e(Canvas canvas) {
        float f = this.f;
        float f2 = (-f) - this.i;
        float f3 = f + this.f882a + (this.j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.e.width() - f4 > 0.0f;
        boolean z2 = this.e.height() - f4 > 0.0f;
        int r11 = canvas.save();
        RectF rectF = this.e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.g, this.f884c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.e.width() - f4, -this.f, this.d);
        }
        canvas.restoreToCount(r11);
        int r112 = canvas.save();
        RectF rectF2 = this.e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.g, this.f884c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.e.width() - f4, (-this.f) + this.i, this.d);
        }
        canvas.restoreToCount(r112);
        int r2 = canvas.save();
        RectF rectF3 = this.e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.g, this.f884c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.e.height() - f4, -this.f, this.d);
        }
        canvas.restoreToCount(r2);
        int r22 = canvas.save();
        RectF rectF4 = this.e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.g, this.f884c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.e.height() - f4, -this.f, this.d);
        }
        canvas.restoreToCount(r22);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.k = colorStateList;
        this.f883b.setColor(colorStateList.getColorForState(getState(), this.k.getDefaultColor()));
    }

    private void s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        float fT = t(f);
        float fT2 = t(f2);
        if (fT > fT2) {
            if (!this.p) {
                this.p = true;
            }
            fT = fT2;
        }
        if (this.j == fT && this.h == fT2) {
            return;
        }
        this.j = fT;
        this.h = fT2;
        this.i = (int) ((fT * r) + this.f882a + 0.5f);
        this.l = true;
        invalidateSelf();
    }

    private int t(float f) {
        int r3 = (int) (f + 0.5f);
        return r3 % 2 == 1 ? r3 - 1 : r3;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.l) {
            a(getBounds());
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.j) / 2.0f);
        s.a(canvas, this.e, this.f, this.f883b);
    }

    ColorStateList f() {
        return this.k;
    }

    float g() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int r0 = (int) Math.ceil(d(this.h, this.f, this.o));
        int r1 = (int) Math.ceil(c(this.h, this.f, this.o));
        rect.set(r1, r0, r1, r0);
        return true;
    }

    void h(Rect rect) {
        getPadding(rect);
    }

    float i() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    float j() {
        float f = this.h;
        return (Math.max(f, this.f + this.f882a + ((f * r) / 2.0f)) * 2.0f) + (((this.h * r) + this.f882a) * 2.0f);
    }

    float k() {
        float f = this.h;
        return (Math.max(f, this.f + this.f882a + (f / 2.0f)) * 2.0f) + ((this.h + this.f882a) * 2.0f);
    }

    float l() {
        return this.j;
    }

    void m(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    void o(@i0 ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
        ColorStateList colorStateList = this.k;
        int colorForState = colorStateList.getColorForState(r3, colorStateList.getDefaultColor());
        if (this.f883b.getColor() == colorForState) {
            return false;
        }
        this.f883b.setColor(colorForState);
        this.l = true;
        invalidateSelf();
        return true;
    }

    void p(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.f == f2) {
            return;
        }
        this.f = f2;
        this.l = true;
        invalidateSelf();
    }

    void q(float f) {
        s(this.j, f);
    }

    void r(float f) {
        s(f, this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.f883b.setAlpha(r2);
        this.f884c.setAlpha(r2);
        this.d.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f883b.setColorFilter(colorFilter);
    }
}
