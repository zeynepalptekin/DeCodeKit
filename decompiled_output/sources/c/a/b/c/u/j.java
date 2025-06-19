package c.a.b.c.u;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.z;
import c.a.b.c.a;
import c.a.b.c.u.o;
import c.a.b.c.u.p;
import c.a.b.c.u.q;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* loaded from: classes.dex */
public class j extends Drawable implements androidx.core.graphics.drawable.e, s {
    private static final float A = 0.75f;
    private static final float B = 0.25f;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    private d d;
    private final q.i[] e;
    private final q.i[] f;
    private final BitSet g;
    private boolean h;
    private final Matrix i;
    private final Path j;
    private final Path k;
    private final RectF l;
    private final RectF m;
    private final Region n;
    private final Region o;
    private o p;
    private final Paint q;
    private final Paint r;
    private final c.a.b.c.t.b s;

    @h0
    private final p.a t;
    private final p u;

    @i0
    private PorterDuffColorFilter v;

    @i0
    private PorterDuffColorFilter w;

    @h0
    private final RectF x;
    private boolean y;
    private static final String z = j.class.getSimpleName();
    private static final Paint F = new Paint(1);

    class a implements p.a {
        a() {
        }

        @Override // c.a.b.c.u.p.a
        public void a(@h0 q qVar, Matrix matrix, int r6) {
            j.this.g.set(r6 + 4, qVar.e());
            j.this.f[r6] = qVar.f(matrix);
        }

        @Override // c.a.b.c.u.p.a
        public void b(@h0 q qVar, Matrix matrix, int r5) {
            j.this.g.set(r5, qVar.e());
            j.this.e[r5] = qVar.f(matrix);
        }
    }

    class b implements o.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f2014a;

        b(float f) {
            this.f2014a = f;
        }

        @Override // c.a.b.c.u.o.c
        @h0
        public c.a.b.c.u.d a(@h0 c.a.b.c.u.d dVar) {
            return dVar instanceof m ? dVar : new c.a.b.c.u.b(this.f2014a, dVar);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    static final class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @h0
        public o f2016a;

        /* renamed from: b, reason: collision with root package name */
        @i0
        public c.a.b.c.l.a f2017b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        public ColorFilter f2018c;

        @i0
        public ColorStateList d;

        @i0
        public ColorStateList e;

        @i0
        public ColorStateList f;

        @i0
        public ColorStateList g;

        @i0
        public PorterDuff.Mode h;

        @i0
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public d(@h0 d dVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f2016a = dVar.f2016a;
            this.f2017b = dVar.f2017b;
            this.l = dVar.l;
            this.f2018c = dVar.f2018c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.h = dVar.h;
            this.g = dVar.g;
            this.m = dVar.m;
            this.j = dVar.j;
            this.s = dVar.s;
            this.q = dVar.q;
            this.u = dVar.u;
            this.k = dVar.k;
            this.n = dVar.n;
            this.o = dVar.o;
            this.p = dVar.p;
            this.r = dVar.r;
            this.t = dVar.t;
            this.f = dVar.f;
            this.v = dVar.v;
            if (dVar.i != null) {
                this.i = new Rect(dVar.i);
            }
        }

        public d(o oVar, c.a.b.c.l.a aVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f2016a = oVar;
            this.f2017b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @h0
        public Drawable newDrawable() {
            j jVar = new j(this, null);
            jVar.h = true;
            return jVar;
        }
    }

    public j() {
        this(new o());
    }

    public j(@h0 Context context, @i0 AttributeSet attributeSet, @androidx.annotation.f int r3, @t0 int r4) {
        this(o.e(context, attributeSet, r3, r4).m());
    }

    private j(@h0 d dVar) {
        this.e = new q.i[4];
        this.f = new q.i[4];
        this.g = new BitSet(8);
        this.i = new Matrix();
        this.j = new Path();
        this.k = new Path();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Region();
        this.o = new Region();
        this.q = new Paint(1);
        this.r = new Paint(1);
        this.s = new c.a.b.c.t.b();
        this.u = new p();
        this.x = new RectF();
        this.y = true;
        this.d = dVar;
        this.r.setStyle(Paint.Style.STROKE);
        this.q.setStyle(Paint.Style.FILL);
        F.setColor(-1);
        F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        M0();
        L0(getState());
        this.t = new a();
    }

    /* synthetic */ j(d dVar, a aVar) {
        this(dVar);
    }

    public j(@h0 o oVar) {
        this(new d(oVar, null));
    }

    @Deprecated
    public j(@h0 r rVar) {
        this((o) rVar);
    }

    private boolean L0(int[] r5) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.d.d == null || color2 == (colorForState2 = this.d.d.getColorForState(r5, (color2 = this.q.getColor())))) {
            z2 = false;
        } else {
            this.q.setColor(colorForState2);
            z2 = true;
        }
        if (this.d.e == null || color == (colorForState = this.d.e.getColorForState(r5, (color = this.r.getColor())))) {
            return z2;
        }
        this.r.setColor(colorForState);
        return true;
    }

    private boolean M0() {
        PorterDuffColorFilter porterDuffColorFilter = this.v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.w;
        d dVar = this.d;
        this.v = k(dVar.g, dVar.h, this.q, true);
        d dVar2 = this.d;
        this.w = k(dVar2.f, dVar2.h, this.r, false);
        d dVar3 = this.d;
        if (dVar3.u) {
            this.s.d(dVar3.g.getColorForState(getState(), 0));
        }
        return (b.i.o.e.a(porterDuffColorFilter, this.v) && b.i.o.e.a(porterDuffColorFilter2, this.w)) ? false : true;
    }

    private float N() {
        if (X()) {
            return this.r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void N0() {
        float fU = U();
        this.d.r = (int) Math.ceil(A * fU);
        this.d.s = (int) Math.ceil(fU * B);
        M0();
        Z();
    }

    private boolean V() {
        d dVar = this.d;
        int r1 = dVar.q;
        return r1 != 1 && dVar.r > 0 && (r1 == 2 || i0());
    }

    private boolean W() {
        Paint.Style style = this.d.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean X() {
        Paint.Style style = this.d.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.r.getStrokeWidth() > 0.0f;
    }

    private void Z() {
        super.invalidateSelf();
    }

    @i0
    private PorterDuffColorFilter f(@h0 Paint paint, boolean z2) {
        int color;
        int r3;
        if (!z2 || (r3 = l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(r3, PorterDuff.Mode.SRC_IN);
    }

    private void f0(@h0 Canvas canvas) {
        if (V()) {
            canvas.save();
            h0(canvas);
            if (this.y) {
                int r0 = (int) (this.x.width() - getBounds().width());
                int r1 = (int) (this.x.height() - getBounds().height());
                if (r0 < 0 || r1 < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.x.width()) + (this.d.r * 2) + r0, ((int) this.x.height()) + (this.d.r * 2) + r1, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f = (getBounds().left - this.d.r) - r0;
                float f2 = (getBounds().top - this.d.r) - r1;
                canvas2.translate(-f, -f2);
                o(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                bitmapCreateBitmap.recycle();
            } else {
                o(canvas);
            }
            canvas.restore();
        }
    }

    private void g(@h0 RectF rectF, @h0 Path path) {
        h(rectF, path);
        if (this.d.j != 1.0f) {
            this.i.reset();
            Matrix matrix = this.i;
            float f = this.d.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.i);
        }
        path.computeBounds(this.x, true);
    }

    private static int g0(int r1, int r2) {
        return (r1 * (r2 + (r2 >>> 7))) >>> 8;
    }

    private void h0(@h0 Canvas canvas) {
        int r0 = H();
        int I = I();
        if (Build.VERSION.SDK_INT < 21 && this.y) {
            Rect clipBounds = canvas.getClipBounds();
            int r3 = this.d.r;
            clipBounds.inset(-r3, -r3);
            clipBounds.offset(r0, I);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(r0, I);
    }

    private void i() {
        o oVarY = getShapeAppearanceModel().y(new b(-N()));
        this.p = oVarY;
        this.u.d(oVarY, this.d.k, w(), this.k);
    }

    @h0
    private PorterDuffColorFilter j(@h0 ColorStateList colorStateList, @h0 PorterDuff.Mode mode, boolean z2) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @h0
    private PorterDuffColorFilter k(@i0 ColorStateList colorStateList, @i0 PorterDuff.Mode mode, @h0 Paint paint, boolean z2) {
        return (colorStateList == null || mode == null) ? f(paint, z2) : j(colorStateList, mode, z2);
    }

    @androidx.annotation.k
    private int l(@androidx.annotation.k int r3) {
        float fU = U() + B();
        c.a.b.c.l.a aVar = this.d.f2017b;
        return aVar != null ? aVar.e(r3, fU) : r3;
    }

    @h0
    public static j m(Context context) {
        return n(context, 0.0f);
    }

    @h0
    public static j n(Context context, float f) {
        int r0 = c.a.b.c.i.a.c(context, a.c.colorSurface, j.class.getSimpleName());
        j jVar = new j();
        jVar.Y(context);
        jVar.n0(ColorStateList.valueOf(r0));
        jVar.m0(f);
        return jVar;
    }

    private void o(@h0 Canvas canvas) {
        if (this.g.cardinality() > 0) {
            Log.w(z, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.d.s != 0) {
            canvas.drawPath(this.j, this.s.c());
        }
        for (int r0 = 0; r0 < 4; r0++) {
            this.e[r0].b(this.s, this.d.r, canvas);
            this.f[r0].b(this.s, this.d.r, canvas);
        }
        if (this.y) {
            int r02 = H();
            int I = I();
            canvas.translate(-r02, -I);
            canvas.drawPath(this.j, F);
            canvas.translate(r02, I);
        }
    }

    private void p(@h0 Canvas canvas) {
        r(canvas, this.q, this.j, this.d.f2016a, v());
    }

    private void r(@h0 Canvas canvas, @h0 Paint paint, @h0 Path path, @h0 o oVar, @h0 RectF rectF) {
        if (!oVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = oVar.t().a(rectF) * this.d.k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private void s(@h0 Canvas canvas) {
        r(canvas, this.r, this.k, this.p, w());
    }

    @h0
    private RectF w() {
        this.m.set(v());
        float fN = N();
        this.m.inset(fN, fN);
        return this.m;
    }

    public Paint.Style A() {
        return this.d.v;
    }

    @p0({p0.a.LIBRARY_GROUP})
    public void A0(int r3) {
        d dVar = this.d;
        if (dVar.s != r3) {
            dVar.s = r3;
            Z();
        }
    }

    public float B() {
        return this.d.n;
    }

    @Deprecated
    public void B0(@h0 r rVar) {
        setShapeAppearanceModel(rVar);
    }

    @Deprecated
    public void C(int r3, int r4, @h0 Path path) {
        h(new RectF(0.0f, 0.0f, r3, r4), path);
    }

    public void C0(float f, @androidx.annotation.k int r2) {
        H0(f);
        E0(ColorStateList.valueOf(r2));
    }

    public float D() {
        return this.d.j;
    }

    public void D0(float f, @i0 ColorStateList colorStateList) {
        H0(f);
        E0(colorStateList);
    }

    public int E() {
        return this.d.t;
    }

    public void E0(@i0 ColorStateList colorStateList) {
        d dVar = this.d;
        if (dVar.e != colorStateList) {
            dVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public int F() {
        return this.d.q;
    }

    public void F0(@androidx.annotation.k int r1) {
        G0(ColorStateList.valueOf(r1));
    }

    @Deprecated
    public int G() {
        return (int) x();
    }

    public void G0(ColorStateList colorStateList) {
        this.d.f = colorStateList;
        M0();
        Z();
    }

    public int H() {
        d dVar = this.d;
        return (int) (dVar.s * Math.sin(Math.toRadians(dVar.t)));
    }

    public void H0(float f) {
        this.d.l = f;
        invalidateSelf();
    }

    public int I() {
        d dVar = this.d;
        return (int) (dVar.s * Math.cos(Math.toRadians(dVar.t)));
    }

    public void I0(float f) {
        d dVar = this.d;
        if (dVar.p != f) {
            dVar.p = f;
            N0();
        }
    }

    public int J() {
        return this.d.r;
    }

    public void J0(boolean z2) {
        d dVar = this.d;
        if (dVar.u != z2) {
            dVar.u = z2;
            invalidateSelf();
        }
    }

    @p0({p0.a.LIBRARY_GROUP})
    public int K() {
        return this.d.s;
    }

    public void K0(float f) {
        I0(f - x());
    }

    @i0
    @Deprecated
    public r L() {
        o shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof r) {
            return (r) shapeAppearanceModel;
        }
        return null;
    }

    @i0
    public ColorStateList M() {
        return this.d.e;
    }

    @i0
    public ColorStateList O() {
        return this.d.f;
    }

    public float P() {
        return this.d.l;
    }

    @i0
    public ColorStateList Q() {
        return this.d.g;
    }

    public float R() {
        return this.d.f2016a.r().a(v());
    }

    public float S() {
        return this.d.f2016a.t().a(v());
    }

    public float T() {
        return this.d.p;
    }

    public float U() {
        return x() + T();
    }

    public void Y(Context context) {
        this.d.f2017b = new c.a.b.c.l.a(context);
        N0();
    }

    public boolean a0() {
        c.a.b.c.l.a aVar = this.d.f2017b;
        return aVar != null && aVar.l();
    }

    public boolean b0() {
        return this.d.f2017b != null;
    }

    public boolean c0(int r2, int r3) {
        return getTransparentRegion().contains(r2, r3);
    }

    @p0({p0.a.LIBRARY_GROUP})
    public boolean d0() {
        return this.d.f2016a.u(v());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@h0 Canvas canvas) {
        this.q.setColorFilter(this.v);
        int alpha = this.q.getAlpha();
        this.q.setAlpha(g0(alpha, this.d.m));
        this.r.setColorFilter(this.w);
        this.r.setStrokeWidth(this.d.l);
        int alpha2 = this.r.getAlpha();
        this.r.setAlpha(g0(alpha2, this.d.m));
        if (this.h) {
            i();
            g(v(), this.j);
            this.h = false;
        }
        f0(canvas);
        if (W()) {
            p(canvas);
        }
        if (X()) {
            s(canvas);
        }
        this.q.setAlpha(alpha);
        this.r.setAlpha(alpha2);
    }

    @Deprecated
    public boolean e0() {
        int r0 = this.d.q;
        return r0 == 0 || r0 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    @i0
    public Drawable.ConstantState getConstantState() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@h0 Outline outline) {
        if (this.d.q == 2) {
            return;
        }
        if (d0()) {
            outline.setRoundRect(getBounds(), R() * this.d.k);
            return;
        }
        g(v(), this.j);
        if (this.j.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.j);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@h0 Rect rect) {
        Rect rect2 = this.d.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // c.a.b.c.u.s
    @h0
    public o getShapeAppearanceModel() {
        return this.d.f2016a;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.n.set(getBounds());
        g(v(), this.j);
        this.o.setPath(this.j, this.n);
        this.n.op(this.o, Region.Op.DIFFERENCE);
        return this.n;
    }

    @p0({p0.a.LIBRARY_GROUP})
    protected final void h(@h0 RectF rectF, @h0 Path path) {
        p pVar = this.u;
        d dVar = this.d;
        pVar.e(dVar.f2016a, dVar.k, rectF, this.t, path);
    }

    public boolean i0() {
        return Build.VERSION.SDK_INT < 21 || !(d0() || this.j.isConvex() || Build.VERSION.SDK_INT >= 29);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.h = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.d.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.d.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.d.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.d.d) != null && colorStateList4.isStateful())));
    }

    public void j0(float f) {
        setShapeAppearanceModel(this.d.f2016a.w(f));
    }

    public void k0(@h0 c.a.b.c.u.d dVar) {
        setShapeAppearanceModel(this.d.f2016a.x(dVar));
    }

    @p0({p0.a.LIBRARY_GROUP})
    public void l0(boolean z2) {
        this.u.m(z2);
    }

    public void m0(float f) {
        d dVar = this.d;
        if (dVar.o != f) {
            dVar.o = f;
            N0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    @h0
    public Drawable mutate() {
        this.d = new d(this.d);
        return this;
    }

    public void n0(@i0 ColorStateList colorStateList) {
        d dVar = this.d;
        if (dVar.d != colorStateList) {
            dVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void o0(float f) {
        d dVar = this.d;
        if (dVar.k != f) {
            dVar.k = f;
            this.h = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.h = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r2) {
        boolean z2 = L0(r2) || M0();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public void p0(int r3, int r4, int r5, int r6) {
        d dVar = this.d;
        if (dVar.i == null) {
            dVar.i = new Rect();
        }
        this.d.i.set(r3, r4, r5, r6);
        invalidateSelf();
    }

    @p0({p0.a.LIBRARY_GROUP})
    protected void q(@h0 Canvas canvas, @h0 Paint paint, @h0 Path path, @h0 RectF rectF) {
        r(canvas, paint, path, this.d.f2016a, rectF);
    }

    public void q0(Paint.Style style) {
        this.d.v = style;
        Z();
    }

    public void r0(float f) {
        d dVar = this.d;
        if (dVar.n != f) {
            dVar.n = f;
            N0();
        }
    }

    public void s0(float f) {
        d dVar = this.d;
        if (dVar.j != f) {
            dVar.j = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@z(from = FabTransformationScrimBehavior.j, to = 255) int r3) {
        d dVar = this.d;
        if (dVar.m != r3) {
            dVar.m = r3;
            Z();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@i0 ColorFilter colorFilter) {
        this.d.f2018c = colorFilter;
        Z();
    }

    @Override // c.a.b.c.u.s
    public void setShapeAppearanceModel(@h0 o oVar) {
        this.d.f2016a = oVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTint(@androidx.annotation.k int r1) {
        setTintList(ColorStateList.valueOf(r1));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintList(@i0 ColorStateList colorStateList) {
        this.d.g = colorStateList;
        M0();
        Z();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintMode(@i0 PorterDuff.Mode mode) {
        d dVar = this.d;
        if (dVar.h != mode) {
            dVar.h = mode;
            M0();
            Z();
        }
    }

    public float t() {
        return this.d.f2016a.j().a(v());
    }

    @p0({p0.a.LIBRARY_GROUP})
    public void t0(boolean z2) {
        this.y = z2;
    }

    public float u() {
        return this.d.f2016a.l().a(v());
    }

    public void u0(int r2) {
        this.s.d(r2);
        this.d.u = false;
        Z();
    }

    @h0
    protected RectF v() {
        this.l.set(getBounds());
        return this.l;
    }

    public void v0(int r3) {
        d dVar = this.d;
        if (dVar.t != r3) {
            dVar.t = r3;
            Z();
        }
    }

    public void w0(int r3) {
        d dVar = this.d;
        if (dVar.q != r3) {
            dVar.q = r3;
            Z();
        }
    }

    public float x() {
        return this.d.o;
    }

    @Deprecated
    public void x0(int r1) {
        m0(r1);
    }

    @i0
    public ColorStateList y() {
        return this.d.d;
    }

    @Deprecated
    public void y0(boolean z2) {
        w0(!z2 ? 1 : 0);
    }

    public float z() {
        return this.d.k;
    }

    @Deprecated
    public void z0(int r2) {
        this.d.r = r2;
    }
}
