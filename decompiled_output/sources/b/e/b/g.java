package b.e.b;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.i0;
import androidx.annotation.m0;

@m0(21)
/* loaded from: classes.dex */
class g extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f879a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f881c;
    private final Rect d;
    private float e;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private boolean f = false;
    private boolean g = true;
    private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f880b = new Paint(5);

    g(ColorStateList colorStateList, float f) {
        this.f879a = f;
        e(colorStateList);
        this.f881c = new RectF();
        this.d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.h = colorStateList;
        this.f880b.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f881c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.d.set(rect);
        if (this.f) {
            this.d.inset((int) Math.ceil(h.c(this.e, this.f879a, this.g)), (int) Math.ceil(h.d(this.e, this.f879a, this.g)));
            this.f881c.set(this.d);
        }
    }

    public ColorStateList b() {
        return this.h;
    }

    float c() {
        return this.e;
    }

    public float d() {
        return this.f879a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f880b;
        if (this.i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.i);
            z = true;
        }
        RectF rectF = this.f881c;
        float f = this.f879a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public void f(@i0 ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f, boolean z, boolean z2) {
        if (f == this.e && this.f == z && this.g == z2) {
            return;
        }
        this.e = f;
        this.f = z;
        this.g = z2;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.f879a);
    }

    void h(float f) {
        if (f == this.f879a) {
            return;
        }
        this.f879a = f;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r4) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(r4, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f880b.getColor();
        if (z) {
            this.f880b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.f880b.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f880b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = a(colorStateList, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = a(this.j, mode);
        invalidateSelf();
    }
}
