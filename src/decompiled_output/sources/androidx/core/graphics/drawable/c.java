package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public abstract class c extends Drawable {
    private static final int n = 3;

    /* renamed from: a, reason: collision with root package name */
    final Bitmap f391a;

    /* renamed from: b, reason: collision with root package name */
    private int f392b;
    private final BitmapShader e;
    private float g;
    private boolean k;
    private int l;
    private int m;

    /* renamed from: c, reason: collision with root package name */
    private int f393c = 119;
    private final Paint d = new Paint(3);
    private final Matrix f = new Matrix();
    final Rect h = new Rect();
    private final RectF i = new RectF();
    private boolean j = true;

    c(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        this.f392b = 160;
        if (resources != null) {
            this.f392b = resources.getDisplayMetrics().densityDpi;
        }
        this.f391a = bitmap;
        if (bitmap != null) {
            a();
            Bitmap bitmap2 = this.f391a;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        } else {
            this.m = -1;
            this.l = -1;
            bitmapShader = null;
        }
        this.e = bitmapShader;
    }

    private void a() {
        this.l = this.f391a.getScaledWidth(this.f392b);
        this.m = this.f391a.getScaledHeight(this.f392b);
    }

    private static boolean j(float f) {
        return f > 0.05f;
    }

    private void s() {
        this.g = Math.min(this.m, this.l) / 2;
    }

    @i0
    public final Bitmap b() {
        return this.f391a;
    }

    public float c() {
        return this.g;
    }

    public int d() {
        return this.f393c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@h0 Canvas canvas) {
        Bitmap bitmap = this.f391a;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, this.d);
            return;
        }
        RectF rectF = this.i;
        float f = this.g;
        canvas.drawRoundRect(rectF, f, f, this.d);
    }

    @h0
    public final Paint e() {
        return this.d;
    }

    void f(int r1, int r2, int r3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.d.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f393c != 119 || this.k || (bitmap = this.f391a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || j(this.g)) ? -3 : -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.k;
    }

    public void k(boolean z) {
        this.d.setAntiAlias(z);
        invalidateSelf();
    }

    public void l(boolean z) {
        this.k = z;
        this.j = true;
        if (!z) {
            m(0.0f);
            return;
        }
        s();
        this.d.setShader(this.e);
        invalidateSelf();
    }

    public void m(float f) {
        Paint paint;
        BitmapShader bitmapShader;
        if (this.g == f) {
            return;
        }
        this.k = false;
        if (j(f)) {
            paint = this.d;
            bitmapShader = this.e;
        } else {
            paint = this.d;
            bitmapShader = null;
        }
        paint.setShader(bitmapShader);
        this.g = f;
        invalidateSelf();
    }

    public void n(int r2) {
        if (this.f393c != r2) {
            this.f393c = r2;
            this.j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.k) {
            s();
        }
        this.j = true;
    }

    public void p(int r2) {
        if (this.f392b != r2) {
            if (r2 == 0) {
                r2 = 160;
            }
            this.f392b = r2;
            if (this.f391a != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(@h0 Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(@h0 DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        if (r2 != this.d.getAlpha()) {
            this.d.setAlpha(r2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.d.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.d.setFilterBitmap(z);
        invalidateSelf();
    }

    void t() {
        if (this.j) {
            if (this.k) {
                int r6 = Math.min(this.l, this.m);
                f(this.f393c, r6, r6, getBounds(), this.h);
                int r0 = Math.min(this.h.width(), this.h.height());
                this.h.inset(Math.max(0, (this.h.width() - r0) / 2), Math.max(0, (this.h.height() - r0) / 2));
                this.g = r0 * 0.5f;
            } else {
                f(this.f393c, this.l, this.m, getBounds(), this.h);
            }
            this.i.set(this.h);
            if (this.e != null) {
                Matrix matrix = this.f;
                RectF rectF = this.i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f.preScale(this.i.width() / this.f391a.getWidth(), this.i.height() / this.f391a.getHeight());
                this.e.setLocalMatrix(this.f);
                this.d.setShader(this.e);
            }
            this.j = false;
        }
    }
}
