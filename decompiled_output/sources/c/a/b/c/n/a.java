package c.a.b.c.n;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m;
import androidx.appcompat.widget.p;
import c.a.b.c.a;
import c.a.b.c.r.c;
import c.a.b.c.u.j;
import c.a.b.c.u.o;
import c.a.b.c.u.s;

/* loaded from: classes.dex */
public class a extends p implements s {
    private static final int q = a.n.Widget_MaterialComponents_ShapeableImageView;
    private final c.a.b.c.u.p f;
    private final RectF g;
    private final RectF h;
    private final Paint i;
    private final Paint j;
    private final Path k;
    private ColorStateList l;
    private o m;

    @androidx.annotation.p
    private float n;
    private Path o;
    private final j p;

    @TargetApi(21)
    /* renamed from: c.a.b.c.n.a$a, reason: collision with other inner class name */
    class C0140a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f1982a = new Rect();

        C0140a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (a.this.m == null) {
                return;
            }
            a.this.g.round(this.f1982a);
            a.this.p.setBounds(this.f1982a);
            a.this.p.getOutline(outline);
        }
    }

    public a(Context context) {
        this(context, null, 0);
    }

    public a(Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, @i0 AttributeSet attributeSet, int r7) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r7, q), attributeSet, r7);
        this.f = new c.a.b.c.u.p();
        this.k = new Path();
        Context context2 = getContext();
        Paint paint = new Paint();
        this.j = paint;
        paint.setAntiAlias(true);
        this.j.setColor(-1);
        this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.g = new RectF();
        this.h = new RectF();
        this.o = new Path();
        this.l = c.a(context2, context2.obtainStyledAttributes(attributeSet, a.o.ShapeableImageView, r7, q), a.o.ShapeableImageView_strokeColor);
        this.n = r0.getDimensionPixelSize(a.o.ShapeableImageView_strokeWidth, 0);
        Paint paint2 = new Paint();
        this.i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.i.setAntiAlias(true);
        this.m = o.e(context2, attributeSet, r7, q).m();
        this.p = new j(this.m);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C0140a());
        }
    }

    private void f(Canvas canvas) {
        if (this.l == null) {
            return;
        }
        this.i.setStrokeWidth(this.n);
        int colorForState = this.l.getColorForState(getDrawableState(), this.l.getDefaultColor());
        if (this.n <= 0.0f || colorForState == 0) {
            return;
        }
        this.i.setColor(colorForState);
        canvas.drawPath(this.k, this.i);
    }

    private void g(int r6, int r7) {
        this.g.set(getPaddingLeft(), getPaddingTop(), r6 - getPaddingRight(), r7 - getPaddingBottom());
        this.f.d(this.m, 1.0f, this.g, this.k);
        this.o.rewind();
        this.o.addPath(this.k);
        this.h.set(0.0f, 0.0f, r6, r7);
        this.o.addRect(this.h, Path.Direction.CCW);
    }

    @Override // c.a.b.c.u.s
    @h0
    public o getShapeAppearanceModel() {
        return this.m;
    }

    @i0
    public ColorStateList getStrokeColor() {
        return this.l;
    }

    @androidx.annotation.p
    public float getStrokeWidth() {
        return this.n;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.o, this.j);
        f(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        g(r1, r2);
    }

    @Override // c.a.b.c.u.s
    public void setShapeAppearanceModel(@h0 o oVar) {
        this.m = oVar;
        this.p.setShapeAppearanceModel(oVar);
        g(getWidth(), getHeight());
        invalidate();
    }

    public void setStrokeColor(@i0 ColorStateList colorStateList) {
        this.l = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@m int r2) {
        setStrokeColor(b.a.b.a.a.c(getContext(), r2));
    }

    public void setStrokeWidth(@androidx.annotation.p float f) {
        if (this.n != f) {
            this.n = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@androidx.annotation.o int r2) {
        setStrokeWidth(getResources().getDimensionPixelSize(r2));
    }
}
