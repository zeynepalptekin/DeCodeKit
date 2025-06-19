package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.h0;
import androidx.annotation.i0;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.u.o;
import c.a.b.c.u.s;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class d {
    static final long G = 100;
    static final long H = 100;
    static final int I = 0;
    static final int J = 1;
    static final int K = 2;
    static final float L = 1.5f;
    private static final float M = 0.0f;
    private static final float N = 0.0f;
    private static final float O = 0.0f;
    private static final float P = 1.0f;
    private static final float Q = 1.0f;
    private static final float R = 1.0f;

    @i0
    private ViewTreeObserver.OnPreDrawListener E;

    /* renamed from: a, reason: collision with root package name */
    @i0
    o f6709a;

    /* renamed from: b, reason: collision with root package name */
    @i0
    c.a.b.c.u.j f6710b;

    /* renamed from: c, reason: collision with root package name */
    @i0
    Drawable f6711c;

    @i0
    com.google.android.material.floatingactionbutton.c d;

    @i0
    Drawable e;
    boolean f;
    float h;
    float i;
    float j;
    int k;

    @h0
    private final com.google.android.material.internal.o l;

    @i0
    private c.a.b.c.b.h m;

    @i0
    private c.a.b.c.b.h n;

    @i0
    private Animator o;

    @i0
    private c.a.b.c.b.h p;

    @i0
    private c.a.b.c.b.h q;
    private float r;
    private int t;
    private ArrayList<Animator.AnimatorListener> v;
    private ArrayList<Animator.AnimatorListener> w;
    private ArrayList<i> x;
    final FloatingActionButton y;
    final c.a.b.c.t.c z;
    static final TimeInterpolator F = c.a.b.c.b.a.f1937c;
    static final int[] S = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] T = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] U = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] V = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] W = {R.attr.state_enabled};
    static final int[] X = new int[0];
    boolean g = true;
    private float s = 1.0f;
    private int u = 0;
    private final Rect A = new Rect();
    private final RectF B = new RectF();
    private final RectF C = new RectF();
    private final Matrix D = new Matrix();

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6712a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6713b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f6714c;

        a(boolean z, j jVar) {
            this.f6713b = z;
            this.f6714c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6712a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.u = 0;
            d.this.o = null;
            if (this.f6712a) {
                return;
            }
            d.this.y.c(this.f6713b ? 8 : 4, this.f6713b);
            j jVar = this.f6714c;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.y.c(0, this.f6713b);
            d.this.u = 1;
            d.this.o = animator;
            this.f6712a = false;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6715a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f6716b;

        b(boolean z, j jVar) {
            this.f6715a = z;
            this.f6716b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.u = 0;
            d.this.o = null;
            j jVar = this.f6716b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.y.c(0, this.f6715a);
            d.this.u = 2;
            d.this.o = animator;
        }
    }

    class c extends c.a.b.c.b.g {
        c() {
        }

        @Override // c.a.b.c.b.g, android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, @h0 Matrix matrix, @h0 Matrix matrix2) {
            d.this.s = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    class C0198d implements TypeEvaluator<Float> {

        /* renamed from: a, reason: collision with root package name */
        FloatEvaluator f6718a = new FloatEvaluator();

        C0198d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f, Float f2, Float f3) {
            float fFloatValue = this.f6718a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            d.this.H();
            return true;
        }
    }

    private class f extends l {
        f() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            return 0.0f;
        }
    }

    private class g extends l {
        g() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            d dVar = d.this;
            return dVar.h + dVar.i;
        }
    }

    private class h extends l {
        h() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            d dVar = d.this;
            return dVar.h + dVar.j;
        }
    }

    interface i {
        void a();

        void b();
    }

    interface j {
        void a();

        void b();
    }

    private class k extends l {
        k() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            return d.this.h;
        }
    }

    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6720a;

        /* renamed from: b, reason: collision with root package name */
        private float f6721b;

        /* renamed from: c, reason: collision with root package name */
        private float f6722c;

        private l() {
        }

        /* synthetic */ l(d dVar, a aVar) {
            this();
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.j0((int) this.f6722c);
            this.f6720a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            if (!this.f6720a) {
                c.a.b.c.u.j jVar = d.this.f6710b;
                this.f6721b = jVar == null ? 0.0f : jVar.x();
                this.f6722c = a();
                this.f6720a = true;
            }
            d dVar = d.this;
            float f = this.f6721b;
            dVar.j0((int) (f + ((this.f6722c - f) * valueAnimator.getAnimatedFraction())));
        }
    }

    d(FloatingActionButton floatingActionButton, c.a.b.c.t.c cVar) {
        this.y = floatingActionButton;
        this.z = cVar;
        com.google.android.material.internal.o oVar = new com.google.android.material.internal.o();
        this.l = oVar;
        oVar.a(S, i(new h()));
        this.l.a(T, i(new g()));
        this.l.a(U, i(new g()));
        this.l.a(V, i(new g()));
        this.l.a(W, i(new k()));
        this.l.a(X, i(new f()));
        this.r = this.y.getRotation();
    }

    private boolean d0() {
        return f0.P0(this.y) && !this.y.isInEditMode();
    }

    private void g(float f2, @h0 Matrix matrix) {
        matrix.reset();
        if (this.y.getDrawable() == null || this.t == 0) {
            return;
        }
        RectF rectF = this.B;
        RectF rectF2 = this.C;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int r0 = this.t;
        rectF2.set(0.0f, 0.0f, r0, r0);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int r02 = this.t;
        matrix.postScale(f2, f2, r02 / 2.0f, r02 / 2.0f);
    }

    @h0
    private AnimatorSet h(@h0 c.a.b.c.b.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.y, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        hVar.h("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.y, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        hVar.h("scale").a(objectAnimatorOfFloat2);
        k0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.y, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        hVar.h("scale").a(objectAnimatorOfFloat3);
        k0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        g(f4, this.D);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.y, new c.a.b.c.b.f(), new c(), new Matrix(this.D));
        hVar.h("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        c.a.b.c.b.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    @h0
    private ValueAnimator i(@h0 l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void k0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C0198d());
    }

    private c.a.b.c.b.h l() {
        if (this.n == null) {
            this.n = c.a.b.c.b.h.d(this.y.getContext(), a.b.design_fab_hide_motion_spec);
        }
        return (c.a.b.c.b.h) b.i.o.i.f(this.n);
    }

    private c.a.b.c.b.h m() {
        if (this.m == null) {
            this.m = c.a.b.c.b.h.d(this.y.getContext(), a.b.design_fab_show_motion_spec);
        }
        return (c.a.b.c.b.h) b.i.o.i.f(this.m);
    }

    @h0
    private ViewTreeObserver.OnPreDrawListener r() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    void A() {
        this.l.c();
    }

    void B() {
        c.a.b.c.u.j jVar = this.f6710b;
        if (jVar != null) {
            c.a.b.c.u.k.f(this.y, jVar);
        }
        if (N()) {
            this.y.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    void C() {
    }

    void D() {
        ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    void E(int[] r2) {
        this.l.d(r2);
    }

    void F(float f2, float f3, float f4) {
        i0();
        j0(f2);
    }

    void G(@h0 Rect rect) {
        c.a.b.c.t.c cVar;
        Drawable insetDrawable;
        b.i.o.i.g(this.e, "Didn't initialize content background");
        if (c0()) {
            insetDrawable = new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom);
            cVar = this.z;
        } else {
            cVar = this.z;
            insetDrawable = this.e;
        }
        cVar.a(insetDrawable);
    }

    void H() {
        float rotation = this.y.getRotation();
        if (this.r != rotation) {
            this.r = rotation;
            g0();
        }
    }

    void I() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    void J() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void K(@h0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.w;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void L(@h0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void M(@h0 i iVar) {
        ArrayList<i> arrayList = this.x;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(iVar);
    }

    boolean N() {
        return true;
    }

    void O(@i0 ColorStateList colorStateList) {
        c.a.b.c.u.j jVar = this.f6710b;
        if (jVar != null) {
            jVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.d;
        if (cVar != null) {
            cVar.d(colorStateList);
        }
    }

    void P(@i0 PorterDuff.Mode mode) {
        c.a.b.c.u.j jVar = this.f6710b;
        if (jVar != null) {
            jVar.setTintMode(mode);
        }
    }

    final void Q(float f2) {
        if (this.h != f2) {
            this.h = f2;
            F(f2, this.i, this.j);
        }
    }

    void R(boolean z) {
        this.f = z;
    }

    final void S(@i0 c.a.b.c.b.h hVar) {
        this.q = hVar;
    }

    final void T(float f2) {
        if (this.i != f2) {
            this.i = f2;
            F(this.h, f2, this.j);
        }
    }

    final void U(float f2) {
        this.s = f2;
        Matrix matrix = this.D;
        g(f2, matrix);
        this.y.setImageMatrix(matrix);
    }

    final void V(int r2) {
        if (this.t != r2) {
            this.t = r2;
            h0();
        }
    }

    void W(int r1) {
        this.k = r1;
    }

    final void X(float f2) {
        if (this.j != f2) {
            this.j = f2;
            F(this.h, this.i, f2);
        }
    }

    void Y(@i0 ColorStateList colorStateList) {
        Drawable drawable = this.f6711c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, c.a.b.c.s.b.d(colorStateList));
        }
    }

    void Z(boolean z) {
        this.g = z;
        i0();
    }

    final void a0(@h0 o oVar) {
        this.f6709a = oVar;
        c.a.b.c.u.j jVar = this.f6710b;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        Object obj = this.f6711c;
        if (obj instanceof s) {
            ((s) obj).setShapeAppearanceModel(oVar);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.d;
        if (cVar != null) {
            cVar.g(oVar);
        }
    }

    final void b0(@i0 c.a.b.c.b.h hVar) {
        this.p = hVar;
    }

    boolean c0() {
        return true;
    }

    public void d(@h0 Animator.AnimatorListener animatorListener) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(animatorListener);
    }

    void e(@h0 Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    final boolean e0() {
        return !this.f || this.y.getSizeDimension() >= this.k;
    }

    void f(@h0 i iVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(iVar);
    }

    void f0(@i0 j jVar, boolean z) {
        if (z()) {
            return;
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        if (!d0()) {
            this.y.c(0, z);
            this.y.setAlpha(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setScaleX(1.0f);
            U(1.0f);
            if (jVar != null) {
                jVar.a();
                return;
            }
            return;
        }
        if (this.y.getVisibility() != 0) {
            this.y.setAlpha(0.0f);
            this.y.setScaleY(0.0f);
            this.y.setScaleX(0.0f);
            U(0.0f);
        }
        c.a.b.c.b.h hVarM = this.p;
        if (hVarM == null) {
            hVarM = m();
        }
        AnimatorSet animatorSetH = h(hVarM, 1.0f, 1.0f, 1.0f);
        animatorSetH.addListener(new b(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.v;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetH.addListener(it.next());
            }
        }
        animatorSetH.start();
    }

    void g0() {
        FloatingActionButton floatingActionButton;
        int r1;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.r % 90.0f != 0.0f) {
                r1 = 1;
                if (this.y.getLayerType() != 1) {
                    floatingActionButton = this.y;
                    floatingActionButton.setLayerType(r1, null);
                }
            } else if (this.y.getLayerType() != 0) {
                floatingActionButton = this.y;
                r1 = 0;
                floatingActionButton.setLayerType(r1, null);
            }
        }
        c.a.b.c.u.j jVar = this.f6710b;
        if (jVar != null) {
            jVar.v0((int) this.r);
        }
    }

    final void h0() {
        U(this.s);
    }

    final void i0() {
        Rect rect = this.A;
        s(rect);
        G(rect);
        this.z.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    c.a.b.c.u.j j() {
        return new c.a.b.c.u.j((o) b.i.o.i.f(this.f6709a));
    }

    void j0(float f2) {
        c.a.b.c.u.j jVar = this.f6710b;
        if (jVar != null) {
            jVar.m0(f2);
        }
    }

    @i0
    final Drawable k() {
        return this.e;
    }

    float n() {
        return this.h;
    }

    boolean o() {
        return this.f;
    }

    @i0
    final c.a.b.c.b.h p() {
        return this.q;
    }

    float q() {
        return this.i;
    }

    void s(@h0 Rect rect) {
        int sizeDimension = this.f ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        int r2 = Math.max(sizeDimension, (int) Math.ceil(this.g ? n() + this.j : 0.0f));
        int r0 = Math.max(sizeDimension, (int) Math.ceil(r1 * L));
        rect.set(r2, r0, r2, r0);
    }

    float t() {
        return this.j;
    }

    @i0
    final o u() {
        return this.f6709a;
    }

    @i0
    final c.a.b.c.b.h v() {
        return this.p;
    }

    void w(@i0 j jVar, boolean z) {
        if (y()) {
            return;
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        if (!d0()) {
            this.y.c(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.b();
                return;
            }
            return;
        }
        c.a.b.c.b.h hVarL = this.q;
        if (hVarL == null) {
            hVarL = l();
        }
        AnimatorSet animatorSetH = h(hVarL, 0.0f, 0.0f, 0.0f);
        animatorSetH.addListener(new a(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.w;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetH.addListener(it.next());
            }
        }
        animatorSetH.start();
    }

    void x(ColorStateList colorStateList, @i0 PorterDuff.Mode mode, ColorStateList colorStateList2, int r4) {
        c.a.b.c.u.j jVarJ = j();
        this.f6710b = jVarJ;
        jVarJ.setTintList(colorStateList);
        if (mode != null) {
            this.f6710b.setTintMode(mode);
        }
        this.f6710b.u0(-12303292);
        this.f6710b.Y(this.y.getContext());
        c.a.b.c.s.a aVar = new c.a.b.c.s.a(this.f6710b.getShapeAppearanceModel());
        aVar.setTintList(c.a.b.c.s.b.d(colorStateList2));
        this.f6711c = aVar;
        this.e = new LayerDrawable(new Drawable[]{(Drawable) b.i.o.i.f(this.f6710b), aVar});
    }

    boolean y() {
        return this.y.getVisibility() == 0 ? this.u == 1 : this.u != 2;
    }

    boolean z() {
        return this.y.getVisibility() != 0 ? this.u == 2 : this.u != 1;
    }
}
