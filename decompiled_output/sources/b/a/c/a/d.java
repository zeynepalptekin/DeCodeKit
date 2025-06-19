package b.a.c.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.k;
import androidx.annotation.p0;
import androidx.annotation.r;
import b.a.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class d extends Drawable {
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    private static final float q = (float) Math.toRadians(45.0d);

    /* renamed from: b, reason: collision with root package name */
    private float f811b;

    /* renamed from: c, reason: collision with root package name */
    private float f812c;
    private float d;
    private float e;
    private boolean f;
    private final int h;
    private float j;
    private float k;

    /* renamed from: a, reason: collision with root package name */
    private final Paint f810a = new Paint();
    private final Path g = new Path();
    private boolean i = false;
    private int l = 2;

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public d(Context context) {
        this.f810a.setStyle(Paint.Style.STROKE);
        this.f810a.setStrokeJoin(Paint.Join.MITER);
        this.f810a.setStrokeCap(Paint.Cap.BUTT);
        this.f810a.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, a.m.DrawerArrowToggle, a.b.drawerArrowStyle, a.l.Base_Widget_AppCompat_DrawerArrowToggle);
        p(typedArrayObtainStyledAttributes.getColor(a.m.DrawerArrowToggle_color, 0));
        o(typedArrayObtainStyledAttributes.getDimension(a.m.DrawerArrowToggle_thickness, 0.0f));
        t(typedArrayObtainStyledAttributes.getBoolean(a.m.DrawerArrowToggle_spinBars, true));
        r(Math.round(typedArrayObtainStyledAttributes.getDimension(a.m.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.m.DrawerArrowToggle_drawableSize, 0);
        this.f812c = Math.round(typedArrayObtainStyledAttributes.getDimension(a.m.DrawerArrowToggle_barLength, 0.0f));
        this.f811b = Math.round(typedArrayObtainStyledAttributes.getDimension(a.m.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.d = typedArrayObtainStyledAttributes.getDimension(a.m.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float k(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public float a() {
        return this.f811b;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.f812c;
    }

    public float d() {
        return this.f810a.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int r3 = this.l;
        boolean z = false;
        if (r3 != 0 && (r3 == 1 || (r3 == 3 ? androidx.core.graphics.drawable.a.f(this) == 0 : androidx.core.graphics.drawable.a.f(this) == 1))) {
            z = true;
        }
        float f = this.f811b;
        float fK = k(this.f812c, (float) Math.sqrt(f * f * 2.0f), this.j);
        float fK2 = k(this.f812c, this.d, this.j);
        float fRound = Math.round(k(0.0f, this.k, this.j));
        float fK3 = k(0.0f, q, this.j);
        float fK4 = k(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.j);
        double d = fK;
        double d2 = fK3;
        boolean z2 = z;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(d * Math.sin(d2));
        this.g.rewind();
        float fK5 = k(this.e + this.f810a.getStrokeWidth(), -this.k, this.j);
        float f2 = (-fK2) / 2.0f;
        this.g.moveTo(f2 + fRound, 0.0f);
        this.g.rLineTo(fK2 - (fRound * 2.0f), 0.0f);
        this.g.moveTo(f2, fK5);
        this.g.rLineTo(fRound2, fRound3);
        this.g.moveTo(f2, -fK5);
        this.g.rLineTo(fRound2, -fRound3);
        this.g.close();
        canvas.save();
        float strokeWidth = this.f810a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.e);
        if (this.f) {
            canvas.rotate(fK4 * (this.i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.g, this.f810a);
        canvas.restore();
    }

    @k
    public int e() {
        return this.f810a.getColor();
    }

    public int f() {
        return this.l;
    }

    public float g() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f810a;
    }

    @r(from = 0.0d, to = 1.0d)
    public float i() {
        return this.j;
    }

    public boolean j() {
        return this.f;
    }

    public void l(float f) {
        if (this.f811b != f) {
            this.f811b = f;
            invalidateSelf();
        }
    }

    public void m(float f) {
        if (this.d != f) {
            this.d = f;
            invalidateSelf();
        }
    }

    public void n(float f) {
        if (this.f812c != f) {
            this.f812c = f;
            invalidateSelf();
        }
    }

    public void o(float f) {
        if (this.f810a.getStrokeWidth() != f) {
            this.f810a.setStrokeWidth(f);
            this.k = (float) ((f / 2.0f) * Math.cos(q));
            invalidateSelf();
        }
    }

    public void p(@k int r2) {
        if (r2 != this.f810a.getColor()) {
            this.f810a.setColor(r2);
            invalidateSelf();
        }
    }

    public void q(int r2) {
        if (r2 != this.l) {
            this.l = r2;
            invalidateSelf();
        }
    }

    public void r(float f) {
        if (f != this.e) {
            this.e = f;
            invalidateSelf();
        }
    }

    public void s(@r(from = 0.0d, to = 1.0d) float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        if (r2 != this.f810a.getAlpha()) {
            this.f810a.setAlpha(r2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f810a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void t(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidateSelf();
        }
    }

    public void u(boolean z) {
        if (this.i != z) {
            this.i = z;
            invalidateSelf();
        }
    }
}
