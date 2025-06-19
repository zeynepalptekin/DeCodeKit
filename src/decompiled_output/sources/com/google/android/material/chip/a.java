package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.f;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.k0;
import androidx.annotation.m;
import androidx.annotation.o;
import androidx.annotation.s0;
import androidx.annotation.t0;
import androidx.annotation.z0;
import androidx.core.graphics.drawable.e;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.b.h;
import c.a.b.c.r.d;
import c.a.b.c.s.b;
import c.a.b.c.u.j;
import com.google.android.material.internal.q;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a extends j implements e, Drawable.Callback, q.b {
    private static final boolean Q0 = false;
    private static final String S0 = "http://schemas.android.com/apk/res-auto";

    @k
    private int A0;
    private boolean B0;

    @k
    private int C0;
    private int D0;

    @i0
    private ColorFilter E0;

    @i0
    private PorterDuffColorFilter F0;

    @i0
    private ColorStateList G;

    @i0
    private ColorStateList G0;

    @i0
    private ColorStateList H;

    @i0
    private PorterDuff.Mode H0;
    private float I;
    private int[] I0;
    private float J;
    private boolean J0;

    @i0
    private ColorStateList K;

    @i0
    private ColorStateList K0;
    private float L;

    @h0
    private WeakReference<InterfaceC0195a> L0;

    @i0
    private ColorStateList M;
    private TextUtils.TruncateAt M0;

    @i0
    private CharSequence N;
    private boolean N0;
    private boolean O;
    private int O0;

    @i0
    private Drawable P;
    private boolean P0;

    @i0
    private ColorStateList Q;
    private float R;
    private boolean S;
    private boolean T;

    @i0
    private Drawable U;

    @i0
    private Drawable V;

    @i0
    private ColorStateList W;
    private float X;

    @i0
    private CharSequence Y;
    private boolean Z;
    private boolean a0;

    @i0
    private Drawable b0;

    @i0
    private ColorStateList c0;

    @i0
    private h d0;

    @i0
    private h e0;
    private float f0;
    private float g0;
    private float h0;
    private float i0;
    private float j0;
    private float k0;
    private float l0;
    private float m0;

    @h0
    private final Context n0;
    private final Paint o0;

    @i0
    private final Paint p0;
    private final Paint.FontMetrics q0;
    private final RectF r0;
    private final PointF s0;
    private final Path t0;

    @h0
    private final q u0;

    @k
    private int v0;

    @k
    private int w0;

    @k
    private int x0;

    @k
    private int y0;

    @k
    private int z0;
    private static final int[] R0 = {R.attr.state_enabled};
    private static final ShapeDrawable T0 = new ShapeDrawable(new OvalShape());

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0195a {
        void a();
    }

    private a(@h0 Context context, AttributeSet attributeSet, @f int r4, @t0 int r5) {
        super(context, attributeSet, r4, r5);
        this.J = -1.0f;
        this.o0 = new Paint(1);
        this.q0 = new Paint.FontMetrics();
        this.r0 = new RectF();
        this.s0 = new PointF();
        this.t0 = new Path();
        this.D0 = 255;
        this.H0 = PorterDuff.Mode.SRC_IN;
        Paint paint = null;
        this.L0 = new WeakReference<>(null);
        Y(context);
        this.n0 = context;
        q qVar = new q(this);
        this.u0 = qVar;
        this.N = "";
        qVar.e().density = context.getResources().getDisplayMetrics().density;
        this.p0 = null;
        if (0 != 0) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(R0);
        c3(R0);
        this.N0 = true;
        if (b.f1999a) {
            T0.setTint(-1);
        }
    }

    private boolean F3() {
        return this.a0 && this.b0 != null && this.B0;
    }

    private boolean G3() {
        return this.O && this.P != null;
    }

    private boolean H3() {
        return this.T && this.U != null;
    }

    private void I3(@i0 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void J3() {
        this.K0 = this.J0 ? b.d(this.M) : null;
    }

    @TargetApi(21)
    private void K3() {
        this.V = new RippleDrawable(b.d(K1()), this.U, T0);
    }

    private void O0(@i0 Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.U) {
            if (drawable.isStateful()) {
                drawable.setState(C1());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.W);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.P;
        if (drawable == drawable2 && this.S) {
            androidx.core.graphics.drawable.a.o(drawable2, this.Q);
        }
    }

    private void P0(@h0 Rect rect, @h0 RectF rectF) {
        rectF.setEmpty();
        if (G3() || F3()) {
            float f = this.f0 + this.g0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + this.R;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - this.R;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.R;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    @i0
    private ColorFilter Q1() {
        ColorFilter colorFilter = this.E0;
        return colorFilter != null ? colorFilter : this.F0;
    }

    private void Q2(@i0 ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            onStateChange(getState());
        }
    }

    private void R0(@h0 Rect rect, @h0 RectF rectF) {
        rectF.set(rect);
        if (H3()) {
            float f = this.m0 + this.l0 + this.X + this.k0 + this.j0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    private void S0(@h0 Rect rect, @h0 RectF rectF) {
        rectF.setEmpty();
        if (H3()) {
            float f = this.m0 + this.l0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.X;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.X;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.X;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private static boolean S1(@i0 int[] r4, @f int r5) {
        if (r4 == null) {
            return false;
        }
        for (int r0 : r4) {
            if (r0 == r5) {
                return true;
            }
        }
        return false;
    }

    private void T0(@h0 Rect rect, @h0 RectF rectF) {
        rectF.setEmpty();
        if (H3()) {
            float f = this.m0 + this.l0 + this.X + this.k0 + this.j0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int r1 = rect.left;
                rectF.left = r1;
                rectF.right = r1 + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void V0(@h0 Rect rect, @h0 RectF rectF) {
        rectF.setEmpty();
        if (this.N != null) {
            float fQ0 = this.f0 + Q0() + this.i0;
            float fU0 = this.m0 + U0() + this.j0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + fQ0;
                rectF.right = rect.right - fU0;
            } else {
                rectF.left = rect.left + fU0;
                rectF.right = rect.right - fQ0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float W0() {
        this.u0.e().getFontMetrics(this.q0);
        Paint.FontMetrics fontMetrics = this.q0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean Y0() {
        return this.a0 && this.b0 != null && this.Z;
    }

    @h0
    public static a Z0(@h0 Context context, @i0 AttributeSet attributeSet, @f int r3, @t0 int r4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a aVar = new a(context, attributeSet, r3, r4);
        aVar.f2(attributeSet, r3, r4);
        return aVar;
    }

    @h0
    public static a a1(@h0 Context context, @z0 int r3) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSetA = c.a.b.c.k.a.a(context, r3, "chip");
        int styleAttribute = attributeSetA.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = a.n.Widget_MaterialComponents_Chip_Entry;
        }
        return Z0(context, attributeSetA, a.c.chipStandaloneStyle, styleAttribute);
    }

    private void b1(@h0 Canvas canvas, @h0 Rect rect) {
        if (F3()) {
            P0(rect, this.r0);
            RectF rectF = this.r0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.b0.setBounds(0, 0, (int) this.r0.width(), (int) this.r0.height());
            this.b0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void c1(@h0 Canvas canvas, @h0 Rect rect) {
        if (this.P0) {
            return;
        }
        this.o0.setColor(this.w0);
        this.o0.setStyle(Paint.Style.FILL);
        this.o0.setColorFilter(Q1());
        this.r0.set(rect);
        canvas.drawRoundRect(this.r0, n1(), n1(), this.o0);
    }

    private static boolean c2(@i0 ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void d1(@h0 Canvas canvas, @h0 Rect rect) {
        if (G3()) {
            P0(rect, this.r0);
            RectF rectF = this.r0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.P.setBounds(0, 0, (int) this.r0.width(), (int) this.r0.height());
            this.P.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private static boolean d2(@i0 Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private void e1(@h0 Canvas canvas, @h0 Rect rect) {
        if (this.L <= 0.0f || this.P0) {
            return;
        }
        this.o0.setColor(this.y0);
        this.o0.setStyle(Paint.Style.STROKE);
        if (!this.P0) {
            this.o0.setColorFilter(Q1());
        }
        RectF rectF = this.r0;
        float f = rect.left;
        float f2 = this.L;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.J - (this.L / 2.0f);
        canvas.drawRoundRect(this.r0, f3, f3, this.o0);
    }

    private static boolean e2(@i0 d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.f1989b) == null || !colorStateList.isStateful()) ? false : true;
    }

    private void f1(@h0 Canvas canvas, @h0 Rect rect) {
        if (this.P0) {
            return;
        }
        this.o0.setColor(this.v0);
        this.o0.setStyle(Paint.Style.FILL);
        this.r0.set(rect);
        canvas.drawRoundRect(this.r0, n1(), n1(), this.o0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f2(@androidx.annotation.i0 android.util.AttributeSet r8, @androidx.annotation.f int r9, @androidx.annotation.t0 int r10) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.f2(android.util.AttributeSet, int, int):void");
    }

    private void g1(@h0 Canvas canvas, @h0 Rect rect) {
        Drawable drawable;
        if (H3()) {
            S0(rect, this.r0);
            RectF rectF = this.r0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.U.setBounds(0, 0, (int) this.r0.width(), (int) this.r0.height());
            if (b.f1999a) {
                this.V.setBounds(this.U.getBounds());
                this.V.jumpToCurrentState();
                drawable = this.V;
            } else {
                drawable = this.U;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void h1(@h0 Canvas canvas, @h0 Rect rect) {
        this.o0.setColor(this.z0);
        this.o0.setStyle(Paint.Style.FILL);
        this.r0.set(rect);
        if (!this.P0) {
            canvas.drawRoundRect(this.r0, n1(), n1(), this.o0);
        } else {
            h(new RectF(rect), this.t0);
            super.q(canvas, this.o0, this.t0, v());
        }
    }

    private boolean h2(@h0 int[] r7, @h0 int[] r8) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(r7);
        ColorStateList colorStateList = this.G;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(r7, this.v0) : 0;
        boolean state = true;
        if (this.v0 != colorForState) {
            this.v0 = colorForState;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.H;
        int colorForState2 = colorStateList2 != null ? colorStateList2.getColorForState(r7, this.w0) : 0;
        if (this.w0 != colorForState2) {
            this.w0 = colorForState2;
            zOnStateChange = true;
        }
        int r1 = c.a.b.c.i.a.f(colorForState, colorForState2);
        if ((this.x0 != r1) | (y() == null)) {
            this.x0 = r1;
            n0(ColorStateList.valueOf(r1));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.K;
        int colorForState3 = colorStateList3 != null ? colorStateList3.getColorForState(r7, this.y0) : 0;
        if (this.y0 != colorForState3) {
            this.y0 = colorForState3;
            zOnStateChange = true;
        }
        int colorForState4 = (this.K0 == null || !b.e(r7)) ? 0 : this.K0.getColorForState(r7, this.z0);
        if (this.z0 != colorForState4) {
            this.z0 = colorForState4;
            if (this.J0) {
                zOnStateChange = true;
            }
        }
        int colorForState5 = (this.u0.d() == null || this.u0.d().f1989b == null) ? 0 : this.u0.d().f1989b.getColorForState(r7, this.A0);
        if (this.A0 != colorForState5) {
            this.A0 = colorForState5;
            zOnStateChange = true;
        }
        boolean z2 = S1(getState(), R.attr.state_checked) && this.Z;
        if (this.B0 == z2 || this.b0 == null) {
            z = false;
        } else {
            float fQ0 = Q0();
            this.B0 = z2;
            if (fQ0 != Q0()) {
                zOnStateChange = true;
                z = true;
            } else {
                zOnStateChange = true;
                z = false;
            }
        }
        ColorStateList colorStateList4 = this.G0;
        int colorForState6 = colorStateList4 != null ? colorStateList4.getColorForState(r7, this.C0) : 0;
        if (this.C0 != colorForState6) {
            this.C0 = colorForState6;
            this.F0 = c.a.b.c.k.a.c(this, this.G0, this.H0);
        } else {
            state = zOnStateChange;
        }
        if (d2(this.P)) {
            state |= this.P.setState(r7);
        }
        if (d2(this.b0)) {
            state |= this.b0.setState(r7);
        }
        if (d2(this.U)) {
            int[] r0 = new int[r7.length + r8.length];
            System.arraycopy(r7, 0, r0, 0, r7.length);
            System.arraycopy(r8, 0, r0, r7.length, r8.length);
            state |= this.U.setState(r0);
        }
        if (b.f1999a && d2(this.V)) {
            state |= this.V.setState(r8);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            g2();
        }
        return state;
    }

    private void i1(@h0 Canvas canvas, @h0 Rect rect) {
        Paint paint = this.p0;
        if (paint != null) {
            paint.setColor(b.i.e.e.B(f0.t, 127));
            canvas.drawRect(rect, this.p0);
            if (G3() || F3()) {
                P0(rect, this.r0);
                canvas.drawRect(this.r0, this.p0);
            }
            if (this.N != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.p0);
            }
            if (H3()) {
                S0(rect, this.r0);
                canvas.drawRect(this.r0, this.p0);
            }
            this.p0.setColor(b.i.e.e.B(b.i.g.b.a.f1048c, 127));
            R0(rect, this.r0);
            canvas.drawRect(this.r0, this.p0);
            this.p0.setColor(b.i.e.e.B(-16711936, 127));
            T0(rect, this.r0);
            canvas.drawRect(this.r0, this.p0);
        }
    }

    private void j1(@h0 Canvas canvas, @h0 Rect rect) {
        if (this.N != null) {
            Paint.Align alignX0 = X0(rect, this.s0);
            V0(rect, this.r0);
            if (this.u0.d() != null) {
                this.u0.e().drawableState = getState();
                this.u0.k(this.n0);
            }
            this.u0.e().setTextAlign(alignX0);
            int r1 = 0;
            boolean z = Math.round(this.u0.f(M1().toString())) > Math.round(this.r0.width());
            if (z) {
                r1 = canvas.save();
                canvas.clipRect(this.r0);
            }
            CharSequence charSequenceEllipsize = this.N;
            if (z && this.M0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.u0.e(), this.r0.width(), this.M0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.s0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.u0.e());
            if (z) {
                canvas.restoreToCount(r1);
            }
        }
    }

    public float A1() {
        return this.X;
    }

    @Deprecated
    public void A2(@androidx.annotation.h int r1) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        G2(r1);
    }

    public void A3(@s0 int r2) {
        v3(this.n0.getResources().getString(r2));
    }

    public float B1() {
        return this.k0;
    }

    public void B2(@androidx.annotation.q int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y2(b.a.b.a.a.d(this.n0, r2));
    }

    public void B3(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            invalidateSelf();
            g2();
        }
    }

    @h0
    public int[] C1() {
        return this.I0;
    }

    public void C2(float f) {
        if (this.R != f) {
            float fQ0 = Q0();
            this.R = f;
            float fQ02 = Q0();
            invalidateSelf();
            if (fQ0 != fQ02) {
                g2();
            }
        }
    }

    public void C3(@o int r2) {
        B3(this.n0.getResources().getDimension(r2));
    }

    @i0
    public ColorStateList D1() {
        return this.W;
    }

    public void D2(@o int r2) {
        C2(this.n0.getResources().getDimension(r2));
    }

    public void D3(boolean z) {
        if (this.J0 != z) {
            this.J0 = z;
            J3();
            onStateChange(getState());
        }
    }

    public void E1(@h0 RectF rectF) {
        T0(getBounds(), rectF);
    }

    public void E2(@i0 ColorStateList colorStateList) {
        this.S = true;
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (G3()) {
                androidx.core.graphics.drawable.a.o(this.P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    boolean E3() {
        return this.N0;
    }

    public TextUtils.TruncateAt F1() {
        return this.M0;
    }

    public void F2(@m int r2) {
        E2(b.a.b.a.a.c(this.n0, r2));
    }

    @i0
    public h G1() {
        return this.e0;
    }

    public void G2(@androidx.annotation.h int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H2(this.n0.getResources().getBoolean(r2));
    }

    public float H1() {
        return this.h0;
    }

    public void H2(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.O != z) {
            boolean zG3 = G3();
            this.O = z;
            boolean zG32 = G3();
            if (zG3 != zG32) {
                if (zG32) {
                    O0(this.P);
                } else {
                    I3(this.P);
                }
                invalidateSelf();
                g2();
            }
        }
    }

    public float I1() {
        return this.g0;
    }

    public void I2(float f) {
        if (this.I != f) {
            this.I = f;
            invalidateSelf();
            g2();
        }
    }

    @k0
    public int J1() {
        return this.O0;
    }

    public void J2(@o int r2) {
        I2(this.n0.getResources().getDimension(r2));
    }

    @i0
    public ColorStateList K1() {
        return this.M;
    }

    public void K2(float f) {
        if (this.f0 != f) {
            this.f0 = f;
            invalidateSelf();
            g2();
        }
    }

    @i0
    public h L1() {
        return this.d0;
    }

    public void L2(@o int r2) {
        K2(this.n0.getResources().getDimension(r2));
    }

    @i0
    public CharSequence M1() {
        return this.N;
    }

    public void M2(@i0 ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            if (this.P0) {
                E0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @i0
    public d N1() {
        return this.u0.d();
    }

    public void N2(@m int r2) {
        M2(b.a.b.a.a.c(this.n0, r2));
    }

    public float O1() {
        return this.j0;
    }

    public void O2(float f) {
        if (this.L != f) {
            this.L = f;
            this.o0.setStrokeWidth(f);
            if (this.P0) {
                super.H0(f);
            }
            invalidateSelf();
        }
    }

    public float P1() {
        return this.i0;
    }

    public void P2(@o int r2) {
        O2(this.n0.getResources().getDimension(r2));
    }

    float Q0() {
        if (G3() || F3()) {
            return this.g0 + this.R + this.h0;
        }
        return 0.0f;
    }

    public boolean R1() {
        return this.J0;
    }

    public void R2(@i0 Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawableX1 = x1();
        if (drawableX1 != drawable) {
            float fU0 = U0();
            this.U = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (b.f1999a) {
                K3();
            }
            float fU02 = U0();
            I3(drawableX1);
            if (H3()) {
                O0(this.U);
            }
            invalidateSelf();
            if (fU0 != fU02) {
                g2();
            }
        }
    }

    public void S2(@i0 CharSequence charSequence) {
        if (this.Y != charSequence) {
            this.Y = b.i.n.a.c().m(charSequence);
            invalidateSelf();
        }
    }

    public boolean T1() {
        return this.Z;
    }

    @Deprecated
    public void T2(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        g3(z);
    }

    float U0() {
        if (H3()) {
            return this.k0 + this.X + this.l0;
        }
        return 0.0f;
    }

    @Deprecated
    public boolean U1() {
        return V1();
    }

    @Deprecated
    public void U2(@androidx.annotation.h int r1) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f3(r1);
    }

    public boolean V1() {
        return this.a0;
    }

    public void V2(float f) {
        if (this.l0 != f) {
            this.l0 = f;
            invalidateSelf();
            if (H3()) {
                g2();
            }
        }
    }

    @Deprecated
    public boolean W1() {
        return X1();
    }

    public void W2(@o int r2) {
        V2(this.n0.getResources().getDimension(r2));
    }

    @h0
    Paint.Align X0(@h0 Rect rect, @h0 PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.N != null) {
            float fQ0 = this.f0 + Q0() + this.i0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + fQ0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fQ0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - W0();
        }
        return align;
    }

    public boolean X1() {
        return this.O;
    }

    public void X2(@androidx.annotation.q int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        R2(b.a.b.a.a.d(this.n0, r2));
    }

    @Deprecated
    public boolean Y1() {
        return a2();
    }

    public void Y2(float f) {
        if (this.X != f) {
            this.X = f;
            invalidateSelf();
            if (H3()) {
                g2();
            }
        }
    }

    public boolean Z1() {
        return d2(this.U);
    }

    public void Z2(@o int r2) {
        Y2(this.n0.getResources().getDimension(r2));
    }

    @Override // com.google.android.material.internal.q.b
    public void a() {
        g2();
        invalidateSelf();
    }

    public boolean a2() {
        return this.T;
    }

    public void a3(float f) {
        if (this.k0 != f) {
            this.k0 = f;
            invalidateSelf();
            if (H3()) {
                g2();
            }
        }
    }

    boolean b2() {
        return this.P0;
    }

    public void b3(@o int r2) {
        a3(this.n0.getResources().getDimension(r2));
    }

    public boolean c3(@h0 int[] r2) {
        if (Arrays.equals(this.I0, r2)) {
            return false;
        }
        this.I0 = r2;
        if (H3()) {
            return h2(getState(), r2);
        }
        return false;
    }

    public void d3(@i0 ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            if (H3()) {
                androidx.core.graphics.drawable.a.o(this.U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
    public void draw(@h0 Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int r7 = this.D0;
        int r1 = r7 < 255 ? c.a.b.c.e.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, r7) : 0;
        f1(canvas, bounds);
        c1(canvas, bounds);
        if (this.P0) {
            super.draw(canvas);
        }
        e1(canvas, bounds);
        h1(canvas, bounds);
        d1(canvas, bounds);
        b1(canvas, bounds);
        if (this.N0) {
            j1(canvas, bounds);
        }
        g1(canvas, bounds);
        i1(canvas, bounds);
        if (this.D0 < 255) {
            canvas.restoreToCount(r1);
        }
    }

    public void e3(@m int r2) {
        d3(b.a.b.a.a.c(this.n0, r2));
    }

    public void f3(@androidx.annotation.h int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        g3(this.n0.getResources().getBoolean(r2));
    }

    protected void g2() {
        InterfaceC0195a interfaceC0195a = this.L0.get();
        if (interfaceC0195a != null) {
            interfaceC0195a.a();
        }
    }

    public void g3(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.T != z) {
            boolean zH3 = H3();
            this.T = z;
            boolean zH32 = H3();
            if (zH3 != zH32) {
                if (zH32) {
                    O0(this.U);
                } else {
                    I3(this.U);
                }
                invalidateSelf();
                g2();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.D0;
    }

    @Override // android.graphics.drawable.Drawable
    @i0
    public ColorFilter getColorFilter() {
        return this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.I;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f0 + Q0() + this.i0 + this.u0.f(M1().toString()) + this.j0 + U0() + this.m0), this.O0);
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@h0 Outline outline) {
        if (this.P0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.J);
        } else {
            outline.setRoundRect(bounds, this.J);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public void h3(@i0 InterfaceC0195a interfaceC0195a) {
        this.L0 = new WeakReference<>(interfaceC0195a);
    }

    public void i2(boolean z) {
        if (this.Z != z) {
            this.Z = z;
            float fQ0 = Q0();
            if (!z && this.B0) {
                this.B0 = false;
            }
            float fQ02 = Q0();
            invalidateSelf();
            if (fQ0 != fQ02) {
                g2();
            }
        }
    }

    public void i3(@i0 TextUtils.TruncateAt truncateAt) {
        this.M0 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@h0 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return c2(this.G) || c2(this.H) || c2(this.K) || (this.J0 && c2(this.K0)) || e2(this.u0.d()) || Y0() || d2(this.P) || d2(this.b0) || c2(this.G0);
    }

    public void j2(@androidx.annotation.h int r2) {
        i2(this.n0.getResources().getBoolean(r2));
    }

    public void j3(@i0 h hVar) {
        this.e0 = hVar;
    }

    @i0
    public Drawable k1() {
        return this.b0;
    }

    public void k2(@i0 Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.b0 != drawable) {
            float fQ0 = Q0();
            this.b0 = drawable;
            float fQ02 = Q0();
            I3(this.b0);
            O0(this.b0);
            invalidateSelf();
            if (fQ0 != fQ02) {
                g2();
            }
        }
    }

    public void k3(@androidx.annotation.b int r2) {
        j3(h.d(this.n0, r2));
    }

    @i0
    public ColorStateList l1() {
        return this.c0;
    }

    @Deprecated
    public void l2(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        r2(z);
    }

    public void l3(float f) {
        if (this.h0 != f) {
            float fQ0 = Q0();
            this.h0 = f;
            float fQ02 = Q0();
            invalidateSelf();
            if (fQ0 != fQ02) {
                g2();
            }
        }
    }

    @i0
    public ColorStateList m1() {
        return this.H;
    }

    @Deprecated
    public void m2(@androidx.annotation.h int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        r2(this.n0.getResources().getBoolean(r2));
    }

    public void m3(@o int r2) {
        l3(this.n0.getResources().getDimension(r2));
    }

    public float n1() {
        return this.P0 ? R() : this.J;
    }

    public void n2(@androidx.annotation.q int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        k2(b.a.b.a.a.d(this.n0, r2));
    }

    public void n3(float f) {
        if (this.g0 != f) {
            float fQ0 = Q0();
            this.g0 = f;
            float fQ02 = Q0();
            invalidateSelf();
            if (fQ0 != fQ02) {
                g2();
            }
        }
    }

    public float o1() {
        return this.m0;
    }

    public void o2(@i0 ColorStateList colorStateList) {
        if (this.c0 != colorStateList) {
            this.c0 = colorStateList;
            if (Y0()) {
                androidx.core.graphics.drawable.a.o(this.b0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void o3(@o int r2) {
        n3(this.n0.getResources().getDimension(r2));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r3) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(r3);
        if (G3()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.P, r3);
        }
        if (F3()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.b0, r3);
        }
        if (H3()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.U, r3);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r3) {
        boolean zOnLevelChange = super.onLevelChange(r3);
        if (G3()) {
            zOnLevelChange |= this.P.setLevel(r3);
        }
        if (F3()) {
            zOnLevelChange |= this.b0.setLevel(r3);
        }
        if (H3()) {
            zOnLevelChange |= this.U.setLevel(r3);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
    public boolean onStateChange(@h0 int[] r2) {
        if (this.P0) {
            super.onStateChange(r2);
        }
        return h2(r2, C1());
    }

    @i0
    public Drawable p1() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void p2(@m int r2) {
        o2(b.a.b.a.a.c(this.n0, r2));
    }

    public void p3(@k0 int r1) {
        this.O0 = r1;
    }

    public float q1() {
        return this.R;
    }

    public void q2(@androidx.annotation.h int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        r2(this.n0.getResources().getBoolean(r2));
    }

    public void q3(@i0 ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            J3();
            onStateChange(getState());
        }
    }

    @i0
    public ColorStateList r1() {
        return this.Q;
    }

    public void r2(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.a0 != z) {
            boolean zF3 = F3();
            this.a0 = z;
            boolean zF32 = F3();
            if (zF3 != zF32) {
                if (zF32) {
                    O0(this.b0);
                } else {
                    I3(this.b0);
                }
                invalidateSelf();
                g2();
            }
        }
    }

    public void r3(@m int r2) {
        q3(b.a.b.a.a.c(this.n0, r2));
    }

    public float s1() {
        return this.I;
    }

    public void s2(@i0 ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            onStateChange(getState());
        }
    }

    void s3(boolean z) {
        this.N0 = z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@h0 Drawable drawable, @h0 Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        if (this.D0 != r2) {
            this.D0 = r2;
            invalidateSelf();
        }
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
    public void setColorFilter(@i0 ColorFilter colorFilter) {
        if (this.E0 != colorFilter) {
            this.E0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintList(@i0 ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintMode(@h0 PorterDuff.Mode mode) {
        if (this.H0 != mode) {
            this.H0 = mode;
            this.F0 = c.a.b.c.k.a.c(this, this.G0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (G3()) {
            visible |= this.P.setVisible(z, z2);
        }
        if (F3()) {
            visible |= this.b0.setVisible(z, z2);
        }
        if (H3()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t1() {
        return this.f0;
    }

    public void t2(@m int r2) {
        s2(b.a.b.a.a.c(this.n0, r2));
    }

    public void t3(@i0 h hVar) {
        this.d0 = hVar;
    }

    @i0
    public ColorStateList u1() {
        return this.K;
    }

    @Deprecated
    public void u2(float f) {
        if (this.J != f) {
            this.J = f;
            setShapeAppearanceModel(getShapeAppearanceModel().w(f));
        }
    }

    public void u3(@androidx.annotation.b int r2) {
        t3(h.d(this.n0, r2));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@h0 Drawable drawable, @h0 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v1() {
        return this.L;
    }

    @Deprecated
    public void v2(@o int r2) {
        u2(this.n0.getResources().getDimension(r2));
    }

    public void v3(@i0 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.N, charSequence)) {
            return;
        }
        this.N = charSequence;
        this.u0.j(true);
        invalidateSelf();
        g2();
    }

    public void w1(@h0 RectF rectF) {
        R0(getBounds(), rectF);
    }

    public void w2(float f) {
        if (this.m0 != f) {
            this.m0 = f;
            invalidateSelf();
            g2();
        }
    }

    public void w3(@i0 d dVar) {
        this.u0.i(dVar, this.n0);
    }

    @i0
    public Drawable x1() {
        Drawable drawable = this.U;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void x2(@o int r2) {
        w2(this.n0.getResources().getDimension(r2));
    }

    public void x3(@t0 int r3) {
        w3(new d(this.n0, r3));
    }

    @i0
    public CharSequence y1() {
        return this.Y;
    }

    public void y2(@i0 Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawableP1 = p1();
        if (drawableP1 != drawable) {
            float fQ0 = Q0();
            this.P = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float fQ02 = Q0();
            I3(drawableP1);
            if (G3()) {
                O0(this.P);
            }
            invalidateSelf();
            if (fQ0 != fQ02) {
                g2();
            }
        }
    }

    public void y3(float f) {
        if (this.j0 != f) {
            this.j0 = f;
            invalidateSelf();
            g2();
        }
    }

    public float z1() {
        return this.l0;
    }

    @Deprecated
    public void z2(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        H2(z);
    }

    public void z3(@o int r2) {
        y3(this.n0.getResources().getDimension(r2));
    }
}
