package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.i.p.f0;
import c.a.b.c.r.a;
import com.google.android.material.internal.p;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class a {
    private static final boolean Z;
    private static final String a0 = "CollapsingTextHelper";
    private static final String b0 = "…";
    private static final boolean c0 = false;

    @h0
    private static final Paint d0;
    private boolean A;

    @i0
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private int[] F;
    private boolean G;
    private TimeInterpolator J;
    private TimeInterpolator K;
    private float L;
    private float M;
    private float N;
    private ColorStateList O;
    private float P;
    private float Q;
    private float R;
    private ColorStateList S;
    private StaticLayout T;
    private float U;
    private float V;
    private float W;
    private CharSequence X;

    /* renamed from: a, reason: collision with root package name */
    private final View f6723a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6724b;

    /* renamed from: c, reason: collision with root package name */
    private float f6725c;
    private ColorStateList k;
    private ColorStateList l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private c.a.b.c.r.a v;
    private c.a.b.c.r.a w;

    @i0
    private CharSequence x;

    @i0
    private CharSequence y;
    private boolean z;
    private int g = 16;
    private int h = 16;
    private float i = 15.0f;
    private float j = 15.0f;
    private int Y = 1;

    @h0
    private final TextPaint H = new TextPaint(129);

    @h0
    private final TextPaint I = new TextPaint(this.H);

    @h0
    private final Rect e = new Rect();

    @h0
    private final Rect d = new Rect();

    @h0
    private final RectF f = new RectF();

    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0199a implements a.InterfaceC0143a {
        C0199a() {
        }

        @Override // c.a.b.c.r.a.InterfaceC0143a
        public void a(Typeface typeface) {
            a.this.W(typeface);
        }
    }

    class b implements a.InterfaceC0143a {
        b() {
        }

        @Override // c.a.b.c.r.a.InterfaceC0143a
        public void a(Typeface typeface) {
            a.this.f0(typeface);
        }
    }

    static {
        Z = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        d0 = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            d0.setColor(-65281);
        }
    }

    public a(View view) {
        this.f6723a = view;
    }

    private void F(@h0 TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
    }

    private void G(@h0 TextPaint textPaint) {
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.t);
    }

    private void H(float f) {
        this.f.left = L(this.d.left, this.e.left, f, this.J);
        this.f.top = L(this.m, this.n, f, this.J);
        this.f.right = L(this.d.right, this.e.right, f, this.J);
        this.f.bottom = L(this.d.bottom, this.e.bottom, f, this.J);
    }

    private static boolean I(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private boolean J() {
        return f0.W(this.f6723a) == 1;
    }

    private static float L(float f, float f2, float f3, @i0 TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return c.a.b.c.b.a.a(f, f2, f3);
    }

    private static boolean O(@h0 Rect rect, int r2, int r3, int r4, int r5) {
        return rect.left == r2 && rect.top == r3 && rect.right == r4 && rect.bottom == r5;
    }

    private void S(float f) {
        this.U = f;
        f0.g1(this.f6723a);
    }

    private boolean X(Typeface typeface) {
        c.a.b.c.r.a aVar = this.w;
        if (aVar != null) {
            aVar.c();
        }
        if (this.s == typeface) {
            return false;
        }
        this.s = typeface;
        return true;
    }

    private static int a(int r5, int r6, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(r5) * f2) + (Color.alpha(r6) * f)), (int) ((Color.red(r5) * f2) + (Color.red(r6) * f)), (int) ((Color.green(r5) * f2) + (Color.green(r6) * f)), (int) ((Color.blue(r5) * f2) + (Color.blue(r6) * f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() throws java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.b():void");
    }

    private void b0(float f) {
        this.V = f;
        f0.g1(this.f6723a);
    }

    private void d() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        f(this.f6725c);
    }

    private boolean e(@h0 CharSequence charSequence) {
        return (J() ? b.i.n.f.d : b.i.n.f.f1124c).b(charSequence, 0, charSequence.length());
    }

    private void f(float f) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        TextPaint textPaint;
        int r1;
        H(f);
        this.q = L(this.o, this.p, f, this.J);
        this.r = L(this.m, this.n, f, this.J);
        i0(L(this.i, this.j, f, this.K));
        S(1.0f - L(0.0f, 1.0f, 1.0f - f, c.a.b.c.b.a.f1936b));
        b0(L(1.0f, 0.0f, f, c.a.b.c.b.a.f1936b));
        if (this.l != this.k) {
            textPaint = this.H;
            r1 = a(w(), u(), f);
        } else {
            textPaint = this.H;
            r1 = u();
        }
        textPaint.setColor(r1);
        this.H.setShadowLayer(L(this.P, this.L, f, null), L(this.Q, this.M, f, null), L(this.R, this.N, f, null), a(v(this.S), v(this.O), f));
        f0.g1(this.f6723a);
    }

    private void g(float f) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        boolean z;
        float f2;
        boolean z2;
        if (this.x == null) {
            return;
        }
        float fWidth = this.e.width();
        float fWidth2 = this.d.width();
        if (I(f, this.j)) {
            f2 = this.j;
            this.D = 1.0f;
            Typeface typeface = this.u;
            Typeface typeface2 = this.s;
            if (typeface != typeface2) {
                this.u = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f3 = this.i;
            Typeface typeface3 = this.u;
            Typeface typeface4 = this.t;
            if (typeface3 != typeface4) {
                this.u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (I(f, this.i)) {
                this.D = 1.0f;
            } else {
                this.D = f / this.i;
            }
            float f4 = this.j / this.i;
            fWidth = fWidth2 * f4 > fWidth ? Math.min(fWidth / f4, fWidth2) : fWidth2;
            f2 = f3;
            z2 = z;
        }
        if (fWidth > 0.0f) {
            z2 = this.E != f2 || this.G || z2;
            this.E = f2;
            this.G = false;
        }
        if (this.y == null || z2) {
            this.H.setTextSize(this.E);
            this.H.setTypeface(this.u);
            this.H.setLinearText(this.D != 1.0f);
            this.z = e(this.x);
            StaticLayout staticLayoutI = i(p0() ? this.Y : 1, fWidth, this.z);
            this.T = staticLayoutI;
            this.y = staticLayoutI.getText();
        }
    }

    private boolean g0(Typeface typeface) {
        c.a.b.c.r.a aVar = this.v;
        if (aVar != null) {
            aVar.c();
        }
        if (this.t == typeface) {
            return false;
        }
        this.t = typeface;
        return true;
    }

    private void h() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    private StaticLayout i(int r3, float f, boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        StaticLayout staticLayoutA;
        try {
            staticLayoutA = p.c(this.x, this.H, (int) f).e(TextUtils.TruncateAt.END).h(z).d(Layout.Alignment.ALIGN_NORMAL).g(false).i(r3).a();
        } catch (p.a e) {
            Log.e(a0, e.getCause().getMessage(), e);
            staticLayoutA = null;
        }
        return (StaticLayout) b.i.o.i.f(staticLayoutA);
    }

    private void i0(float f) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        g(f);
        boolean z = Z && this.D != 1.0f;
        this.A = z;
        if (z) {
            l();
        }
        f0.g1(this.f6723a);
    }

    private void k(@h0 Canvas canvas, float f, float f2) {
        int alpha = this.H.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.H.setAlpha((int) (this.V * f3));
        this.T.draw(canvas);
        this.H.setAlpha((int) (this.U * f3));
        int lineBaseline = this.T.getLineBaseline(0);
        CharSequence charSequence = this.X;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.H);
        String strTrim = this.X.toString().trim();
        if (strTrim.endsWith(b0)) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.T.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.H);
    }

    private void l() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.B != null || this.d.isEmpty() || TextUtils.isEmpty(this.y)) {
            return;
        }
        f(0.0f);
        int width = this.T.getWidth();
        int height = this.T.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.T.draw(new Canvas(this.B));
        if (this.C == null) {
            this.C = new Paint(3);
        }
    }

    private boolean p0() {
        return (this.Y <= 1 || this.z || this.A) ? false : true;
    }

    private float q(int r3, int r4) {
        return (r4 == 17 || (r4 & 7) == 1) ? (r3 / 2.0f) - (c() / 2.0f) : ((r4 & b.i.p.h.f1199c) == 8388613 || (r4 & 5) == 5) ? this.z ? this.e.left : this.e.right - c() : this.z ? this.e.right - c() : this.e.left;
    }

    private float r(@h0 RectF rectF, int r4, int r5) {
        return (r5 == 17 || (r5 & 7) == 1) ? (r4 / 2.0f) + (c() / 2.0f) : ((r5 & b.i.p.h.f1199c) == 8388613 || (r5 & 5) == 5) ? this.z ? rectF.left + c() : this.e.right : this.z ? this.e.right : rectF.left + c();
    }

    @androidx.annotation.k
    private int v(@i0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] r1 = this.F;
        return r1 != null ? colorStateList.getColorForState(r1, 0) : colorStateList.getDefaultColor();
    }

    @androidx.annotation.k
    private int w() {
        return v(this.k);
    }

    public float A() {
        return this.i;
    }

    public Typeface B() {
        Typeface typeface = this.t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float C() {
        return this.f6725c;
    }

    public int D() {
        return this.Y;
    }

    @i0
    public CharSequence E() {
        return this.x;
    }

    public final boolean K() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.k) != null && colorStateList.isStateful());
    }

    void M() {
        this.f6724b = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
    }

    public void N() {
        if (this.f6723a.getHeight() <= 0 || this.f6723a.getWidth() <= 0) {
            return;
        }
        b();
        d();
    }

    public void P(int r2, int r3, int r4, int r5) {
        if (O(this.e, r2, r3, r4, r5)) {
            return;
        }
        this.e.set(r2, r3, r4, r5);
        this.G = true;
        M();
    }

    public void Q(@h0 Rect rect) {
        P(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void R(int r4) {
        c.a.b.c.r.d dVar = new c.a.b.c.r.d(this.f6723a.getContext(), r4);
        ColorStateList colorStateList = dVar.f1989b;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f = dVar.f1988a;
        if (f != 0.0f) {
            this.j = f;
        }
        ColorStateList colorStateList2 = dVar.i;
        if (colorStateList2 != null) {
            this.O = colorStateList2;
        }
        this.M = dVar.j;
        this.N = dVar.k;
        this.L = dVar.l;
        c.a.b.c.r.a aVar = this.w;
        if (aVar != null) {
            aVar.c();
        }
        this.w = new c.a.b.c.r.a(new C0199a(), dVar.e());
        dVar.h(this.f6723a.getContext(), this.w);
        N();
    }

    public void T(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            N();
        }
    }

    public void U(int r2) {
        if (this.h != r2) {
            this.h = r2;
            N();
        }
    }

    public void V(float f) {
        if (this.j != f) {
            this.j = f;
            N();
        }
    }

    public void W(Typeface typeface) {
        if (X(typeface)) {
            N();
        }
    }

    public void Y(int r2, int r3, int r4, int r5) {
        if (O(this.d, r2, r3, r4, r5)) {
            return;
        }
        this.d.set(r2, r3, r4, r5);
        this.G = true;
        M();
    }

    public void Z(@h0 Rect rect) {
        Y(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void a0(int r4) {
        c.a.b.c.r.d dVar = new c.a.b.c.r.d(this.f6723a.getContext(), r4);
        ColorStateList colorStateList = dVar.f1989b;
        if (colorStateList != null) {
            this.k = colorStateList;
        }
        float f = dVar.f1988a;
        if (f != 0.0f) {
            this.i = f;
        }
        ColorStateList colorStateList2 = dVar.i;
        if (colorStateList2 != null) {
            this.S = colorStateList2;
        }
        this.Q = dVar.j;
        this.R = dVar.k;
        this.P = dVar.l;
        c.a.b.c.r.a aVar = this.v;
        if (aVar != null) {
            aVar.c();
        }
        this.v = new c.a.b.c.r.a(new b(), dVar.e());
        dVar.h(this.f6723a.getContext(), this.v);
        N();
    }

    public float c() {
        if (this.x == null) {
            return 0.0f;
        }
        F(this.I);
        TextPaint textPaint = this.I;
        CharSequence charSequence = this.x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void c0(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            N();
        }
    }

    public void d0(int r2) {
        if (this.g != r2) {
            this.g = r2;
            N();
        }
    }

    public void e0(float f) {
        if (this.i != f) {
            this.i = f;
            N();
        }
    }

    public void f0(Typeface typeface) {
        if (g0(typeface)) {
            N();
        }
    }

    public void h0(float f) {
        float fB = b.i.i.a.b(f, 0.0f, 1.0f);
        if (fB != this.f6725c) {
            this.f6725c = fB;
            d();
        }
    }

    public void j(@h0 Canvas canvas) {
        int r0 = canvas.save();
        if (this.y == null || !this.f6724b) {
            return;
        }
        boolean z = false;
        float lineLeft = (this.q + this.T.getLineLeft(0)) - (this.W * 2.0f);
        this.H.setTextSize(this.E);
        float f = this.q;
        float f2 = this.r;
        if (this.A && this.B != null) {
            z = true;
        }
        float f3 = this.D;
        if (f3 != 1.0f) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.B, f, f2, this.C);
            canvas.restoreToCount(r0);
            return;
        }
        if (p0()) {
            k(canvas, lineLeft, f2);
        } else {
            canvas.translate(f, f2);
            this.T.draw(canvas);
        }
        canvas.restoreToCount(r0);
    }

    public void j0(int r2) {
        if (r2 != this.Y) {
            this.Y = r2;
            h();
            N();
        }
    }

    public void k0(TimeInterpolator timeInterpolator) {
        this.J = timeInterpolator;
        N();
    }

    public final boolean l0(int[] r1) {
        this.F = r1;
        if (!K()) {
            return false;
        }
        N();
        return true;
    }

    public void m(@h0 RectF rectF, int r3, int r4) {
        this.z = e(this.x);
        rectF.left = q(r3, r4);
        rectF.top = this.e.top;
        rectF.right = r(rectF, r3, r4);
        rectF.bottom = this.e.top + p();
    }

    public void m0(@i0 CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.y = null;
            h();
            N();
        }
    }

    public ColorStateList n() {
        return this.l;
    }

    public void n0(TimeInterpolator timeInterpolator) {
        this.K = timeInterpolator;
        N();
    }

    public int o() {
        return this.h;
    }

    public void o0(Typeface typeface) {
        boolean zX = X(typeface);
        boolean zG0 = g0(typeface);
        if (zX || zG0) {
            N();
        }
    }

    public float p() {
        F(this.I);
        return -this.I.ascent();
    }

    public float s() {
        return this.j;
    }

    public Typeface t() {
        Typeface typeface = this.s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @androidx.annotation.k
    public int u() {
        return v(this.l);
    }

    public ColorStateList x() {
        return this.k;
    }

    public int y() {
        return this.g;
    }

    public float z() {
        G(this.I);
        return -this.I.ascent();
    }
}
