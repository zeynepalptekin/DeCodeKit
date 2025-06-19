package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.p;
import androidx.annotation.p0;
import androidx.annotation.z;
import c.a.b.c.u.o;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
class c extends Drawable {
    private static final float q = 1.3333f;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final Paint f6706b;

    @p
    float h;

    @k
    private int i;

    @k
    private int j;

    @k
    private int k;

    @k
    private int l;

    @k
    private int m;
    private o o;

    @i0
    private ColorStateList p;

    /* renamed from: a, reason: collision with root package name */
    private final c.a.b.c.u.p f6705a = new c.a.b.c.u.p();

    /* renamed from: c, reason: collision with root package name */
    private final Path f6707c = new Path();
    private final Rect d = new Rect();
    private final RectF e = new RectF();
    private final RectF f = new RectF();
    private final b g = new b();
    private boolean n = true;

    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @h0
        public Drawable newDrawable() {
            return c.this;
        }
    }

    c(o oVar) {
        this.o = oVar;
        Paint paint = new Paint(1);
        this.f6706b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @h0
    private Shader a() {
        copyBounds(this.d);
        float fHeight = this.h / r0.height();
        return new LinearGradient(0.0f, r0.top, 0.0f, r0.bottom, new int[]{b.i.e.e.t(this.i, this.m), b.i.e.e.t(this.j, this.m), b.i.e.e.t(b.i.e.e.B(this.j, 0), this.m), b.i.e.e.t(b.i.e.e.B(this.l, 0), this.m), b.i.e.e.t(this.l, this.m), b.i.e.e.t(this.k, this.m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @h0
    protected RectF b() {
        this.f.set(getBounds());
        return this.f;
    }

    public o c() {
        return this.o;
    }

    void d(@i0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.m = colorStateList.getColorForState(getState(), this.m);
        }
        this.p = colorStateList;
        this.n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@h0 Canvas canvas) {
        if (this.n) {
            this.f6706b.setShader(a());
            this.n = false;
        }
        float strokeWidth = this.f6706b.getStrokeWidth() / 2.0f;
        copyBounds(this.d);
        this.e.set(this.d);
        float fMin = Math.min(this.o.r().a(b()), this.e.width() / 2.0f);
        if (this.o.u(b())) {
            this.e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.e, fMin, fMin, this.f6706b);
        }
    }

    public void e(@p float f) {
        if (this.h != f) {
            this.h = f;
            this.f6706b.setStrokeWidth(f * q);
            this.n = true;
            invalidateSelf();
        }
    }

    void f(@k int r1, @k int r2, @k int r3, @k int r4) {
        this.i = r1;
        this.j = r2;
        this.k = r3;
        this.l = r4;
    }

    public void g(o oVar) {
        this.o = oVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @i0
    public Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@h0 Outline outline) {
        if (this.o.u(b())) {
            outline.setRoundRect(getBounds(), this.o.r().a(b()));
            return;
        }
        copyBounds(this.d);
        this.e.set(this.d);
        this.f6705a.d(this.o, 1.0f, this.e, this.f6707c);
        if (this.f6707c.isConvex()) {
            outline.setConvexPath(this.f6707c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@h0 Rect rect) {
        if (!this.o.u(b())) {
            return true;
        }
        int r0 = Math.round(this.h);
        rect.set(r0, r0, r0, r0);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(r3, this.m)) != this.m) {
            this.n = true;
            this.m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@z(from = FabTransformationScrimBehavior.j, to = 255) int r2) {
        this.f6706b.setAlpha(r2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@i0 ColorFilter colorFilter) {
        this.f6706b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
