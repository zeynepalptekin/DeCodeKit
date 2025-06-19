package c.a.b.c.y;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.f;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.p0;
import androidx.annotation.s0;
import androidx.annotation.t0;
import b.i.e.e;
import c.a.b.c.a;
import c.a.b.c.r.c;
import c.a.b.c.r.d;
import c.a.b.c.u.g;
import c.a.b.c.u.i;
import c.a.b.c.u.j;
import c.a.b.c.u.l;
import com.google.android.material.internal.q;
import com.google.android.material.internal.s;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class a extends j implements q.b {

    @t0
    private static final int S = a.n.Widget_MaterialComponents_Tooltip;

    @f
    private static final int T = a.c.tooltipStyle;

    @i0
    private CharSequence G;

    @h0
    private final Context H;

    @i0
    private final Paint.FontMetrics I;

    @h0
    private final q J;

    @h0
    private final View.OnLayoutChangeListener K;

    @h0
    private final Rect L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;

    /* renamed from: c.a.b.c.y.a$a, reason: collision with other inner class name */
    class ViewOnLayoutChangeListenerC0147a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0147a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            a.this.p1(view);
        }
    }

    private a(@h0 Context context, AttributeSet attributeSet, @f int r3, @t0 int r4) {
        super(context, attributeSet, r3, r4);
        this.I = new Paint.FontMetrics();
        this.J = new q(this);
        this.K = new ViewOnLayoutChangeListenerC0147a();
        this.L = new Rect();
        this.H = context;
        this.J.e().density = context.getResources().getDisplayMetrics().density;
        this.J.e().setTextAlign(Paint.Align.CENTER);
    }

    private float P0() {
        int r0;
        if (((this.L.right - getBounds().right) - this.R) - this.P < 0) {
            r0 = ((this.L.right - getBounds().right) - this.R) - this.P;
        } else {
            if (((this.L.left - getBounds().left) - this.R) + this.P <= 0) {
                return 0.0f;
            }
            r0 = ((this.L.left - getBounds().left) - this.R) + this.P;
        }
        return r0;
    }

    private float Q0() {
        this.J.e().getFontMetrics(this.I);
        Paint.FontMetrics fontMetrics = this.I;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float R0(@h0 Rect rect) {
        return rect.centerY() - Q0();
    }

    @h0
    public static a S0(@h0 Context context) {
        return U0(context, null, T, S);
    }

    @h0
    public static a T0(@h0 Context context, @i0 AttributeSet attributeSet) {
        return U0(context, attributeSet, T, S);
    }

    @h0
    public static a U0(@h0 Context context, @i0 AttributeSet attributeSet, @f int r3, @t0 int r4) {
        a aVar = new a(context, attributeSet, r3, r4);
        aVar.f1(attributeSet, r3, r4);
        return aVar;
    }

    private g V0() {
        float f = -P0();
        float fWidth = ((float) (getBounds().width() - (this.Q * Math.sqrt(2.0d)))) / 2.0f;
        return new l(new i(this.Q), Math.min(Math.max(f, -fWidth), fWidth));
    }

    private void X0(@h0 Canvas canvas) {
        if (this.G == null) {
            return;
        }
        int r1 = (int) R0(getBounds());
        if (this.J.d() != null) {
            this.J.e().drawableState = getState();
            this.J.k(this.H);
        }
        CharSequence charSequence = this.G;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), r1, this.J.e());
    }

    private float e1() {
        CharSequence charSequence = this.G;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.J.f(charSequence.toString());
    }

    private void f1(@i0 AttributeSet attributeSet, @f int r9, @t0 int r10) {
        TypedArray typedArrayJ = s.j(this.H, attributeSet, a.o.Tooltip, r9, r10, new int[0]);
        this.Q = this.H.getResources().getDimensionPixelSize(a.f.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(getShapeAppearanceModel().v().t(V0()).m());
        k1(typedArrayJ.getText(a.o.Tooltip_android_text));
        l1(c.f(this.H, typedArrayJ, a.o.Tooltip_android_textAppearance));
        n0(ColorStateList.valueOf(typedArrayJ.getColor(a.o.Tooltip_backgroundTint, c.a.b.c.i.a.f(e.B(c.a.b.c.i.a.c(this.H, R.attr.colorBackground, a.class.getCanonicalName()), 229), e.B(c.a.b.c.i.a.c(this.H, a.c.colorOnBackground, a.class.getCanonicalName()), 153)))));
        E0(ColorStateList.valueOf(c.a.b.c.i.a.c(this.H, a.c.colorSurface, a.class.getCanonicalName())));
        this.M = typedArrayJ.getDimensionPixelSize(a.o.Tooltip_android_padding, 0);
        this.N = typedArrayJ.getDimensionPixelSize(a.o.Tooltip_android_minWidth, 0);
        this.O = typedArrayJ.getDimensionPixelSize(a.o.Tooltip_android_minHeight, 0);
        this.P = typedArrayJ.getDimensionPixelSize(a.o.Tooltip_android_layout_margin, 0);
        typedArrayJ.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p1(@h0 View view) {
        int[] r0 = new int[2];
        view.getLocationOnScreen(r0);
        this.R = r0[0];
        view.getWindowVisibleDisplayFrame(this.L);
    }

    public void W0(@i0 View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.K);
    }

    public int Y0() {
        return this.P;
    }

    public int Z0() {
        return this.O;
    }

    @Override // com.google.android.material.internal.q.b
    public void a() {
        invalidateSelf();
    }

    public int a1() {
        return this.N;
    }

    @i0
    public CharSequence b1() {
        return this.G;
    }

    @i0
    public d c1() {
        return this.J.d();
    }

    public int d1() {
        return this.M;
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
    public void draw(@h0 Canvas canvas) {
        canvas.save();
        canvas.translate(P0(), (float) (-((this.Q * Math.sqrt(2.0d)) - this.Q)));
        super.draw(canvas);
        X0(canvas);
        canvas.restore();
    }

    public void g1(@k0 int r1) {
        this.P = r1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.J.e().getTextSize(), this.O);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.M * 2) + e1(), this.N);
    }

    public void h1(@k0 int r1) {
        this.O = r1;
        invalidateSelf();
    }

    public void i1(@k0 int r1) {
        this.N = r1;
        invalidateSelf();
    }

    public void j1(@i0 View view) {
        if (view == null) {
            return;
        }
        p1(view);
        view.addOnLayoutChangeListener(this.K);
    }

    public void k1(@i0 CharSequence charSequence) {
        if (TextUtils.equals(this.G, charSequence)) {
            return;
        }
        this.G = charSequence;
        this.J.j(true);
        invalidateSelf();
    }

    public void l1(@i0 d dVar) {
        this.J.i(dVar, this.H);
    }

    public void m1(@t0 int r3) {
        l1(new d(this.H, r3));
    }

    public void n1(@k0 int r1) {
        this.M = r1;
        invalidateSelf();
    }

    public void o1(@s0 int r2) {
        k1(this.H.getResources().getString(r2));
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().v().t(V0()).m());
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r1) {
        return super.onStateChange(r1);
    }
}
