package b.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import b.w.a0;
import java.lang.reflect.InvocationTargetException;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class i extends g0 {
    private static final String e0 = "android:changeTransform:parent";
    private static final String g0 = "android:changeTransform:intermediateParentMatrix";
    private static final String h0 = "android:changeTransform:intermediateMatrix";
    private static final boolean l0;
    boolean Z;
    private boolean a0;
    private Matrix b0;
    private static final String c0 = "android:changeTransform:matrix";
    private static final String d0 = "android:changeTransform:transforms";
    private static final String f0 = "android:changeTransform:parentMatrix";
    private static final String[] i0 = {c0, d0, f0};
    private static final Property<e, float[]> j0 = new a(float[].class, "nonTranslations");
    private static final Property<e, PointF> k0 = new b(PointF.class, "translations");

    static class a extends Property<e, float[]> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    static class b extends Property<e, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1452a;

        /* renamed from: b, reason: collision with root package name */
        private Matrix f1453b = new Matrix();

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1454c;
        final /* synthetic */ Matrix d;
        final /* synthetic */ View e;
        final /* synthetic */ f f;
        final /* synthetic */ e g;

        c(boolean z, Matrix matrix, View view, f fVar, e eVar) {
            this.f1454c = z;
            this.d = matrix;
            this.e = view;
            this.f = fVar;
            this.g = eVar;
        }

        private void a(Matrix matrix) {
            this.f1453b.set(matrix);
            this.e.setTag(a0.e.transition_transform, this.f1453b);
            this.f.a(this.e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1452a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f1452a) {
                if (this.f1454c && i.this.Z) {
                    a(this.d);
                } else {
                    this.e.setTag(a0.e.transition_transform, null);
                    this.e.setTag(a0.e.parent_matrix, null);
                }
            }
            y0.f(this.e, null);
            this.f.a(this.e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.g.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            i.R0(this.e);
        }
    }

    private static class d extends i0 {

        /* renamed from: a, reason: collision with root package name */
        private View f1455a;

        /* renamed from: b, reason: collision with root package name */
        private o f1456b;

        d(View view, o oVar) {
            this.f1455a = view;
            this.f1456b = oVar;
        }

        @Override // b.w.i0, b.w.g0.h
        public void c(@androidx.annotation.h0 g0 g0Var) {
            this.f1456b.setVisibility(4);
        }

        @Override // b.w.i0, b.w.g0.h
        public void d(@androidx.annotation.h0 g0 g0Var) {
            this.f1456b.setVisibility(0);
        }

        @Override // b.w.i0, b.w.g0.h
        public void e(@androidx.annotation.h0 g0 g0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            g0Var.s0(this);
            s.b(this.f1455a);
            this.f1455a.setTag(a0.e.transition_transform, null);
            this.f1455a.setTag(a0.e.parent_matrix, null);
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Matrix f1457a = new Matrix();

        /* renamed from: b, reason: collision with root package name */
        private final View f1458b;

        /* renamed from: c, reason: collision with root package name */
        private final float[] f1459c;
        private float d;
        private float e;

        e(View view, float[] fArr) {
            this.f1458b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f1459c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.f1459c;
            fArr[2] = this.d;
            fArr[5] = this.e;
            this.f1457a.setValues(fArr);
            y0.f(this.f1458b, this.f1457a);
        }

        Matrix a() {
            return this.f1457a;
        }

        void c(PointF pointF) {
            this.d = pointF.x;
            this.e = pointF.y;
            b();
        }

        void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f1459c, 0, fArr.length);
            b();
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        final float f1460a;

        /* renamed from: b, reason: collision with root package name */
        final float f1461b;

        /* renamed from: c, reason: collision with root package name */
        final float f1462c;
        final float d;
        final float e;
        final float f;
        final float g;
        final float h;

        f(View view) {
            this.f1460a = view.getTranslationX();
            this.f1461b = view.getTranslationY();
            this.f1462c = b.i.p.f0.w0(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public void a(View view) {
            i.V0(view, this.f1460a, this.f1461b, this.f1462c, this.d, this.e, this.f, this.g, this.h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.f1460a == this.f1460a && fVar.f1461b == this.f1461b && fVar.f1462c == this.f1462c && fVar.d == this.d && fVar.e == this.e && fVar.f == this.f && fVar.g == this.g && fVar.h == this.h;
        }

        public int hashCode() {
            float f = this.f1460a;
            int r0 = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f1461b;
            int r02 = (r0 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f1462c;
            int r03 = (r02 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.d;
            int r04 = (r03 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.e;
            int r05 = (r04 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f;
            int r06 = (r05 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.g;
            int r07 = (r06 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.h;
            return r07 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }
    }

    static {
        l0 = Build.VERSION.SDK_INT >= 21;
    }

    public i() {
        this.Z = true;
        this.a0 = true;
        this.b0 = new Matrix();
    }

    @SuppressLint({"RestrictedApi"})
    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Z = true;
        this.a0 = true;
        this.b0 = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.Z = b.i.c.j.h.e(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.a0 = b.i.c.j.h.e(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void L0(n0 n0Var) {
        View view = n0Var.f1494b;
        if (view.getVisibility() == 8) {
            return;
        }
        n0Var.f1493a.put(e0, view.getParent());
        n0Var.f1493a.put(d0, new f(view));
        Matrix matrix = view.getMatrix();
        n0Var.f1493a.put(c0, (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.a0) {
            Matrix matrix2 = new Matrix();
            y0.j((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            n0Var.f1493a.put(f0, matrix2);
            n0Var.f1493a.put(h0, view.getTag(a0.e.transition_transform));
            n0Var.f1493a.put(g0, view.getTag(a0.e.parent_matrix));
        }
    }

    private void M0(ViewGroup viewGroup, n0 n0Var, n0 n0Var2) {
        View view = n0Var2.f1494b;
        Matrix matrix = new Matrix((Matrix) n0Var2.f1493a.get(f0));
        y0.k(viewGroup, matrix);
        o oVarA = s.a(view, viewGroup, matrix);
        if (oVarA == null) {
            return;
        }
        oVarA.a((ViewGroup) n0Var.f1493a.get(e0), n0Var.f1494b);
        g0 g0Var = this;
        while (true) {
            g0 g0Var2 = g0Var.u;
            if (g0Var2 == null) {
                break;
            } else {
                g0Var = g0Var2;
            }
        }
        g0Var.b(new d(view, oVarA));
        if (l0) {
            View view2 = n0Var.f1494b;
            if (view2 != n0Var2.f1494b) {
                y0.h(view2, 0.0f);
            }
            y0.h(view, 1.0f);
        }
    }

    private ObjectAnimator N0(n0 n0Var, n0 n0Var2, boolean z) {
        Matrix matrix = (Matrix) n0Var.f1493a.get(c0);
        Matrix matrix2 = (Matrix) n0Var2.f1493a.get(c0);
        if (matrix == null) {
            matrix = u.f1509a;
        }
        if (matrix2 == null) {
            matrix2 = u.f1509a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) n0Var2.f1493a.get(d0);
        View view = n0Var2.f1494b;
        R0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(j0, new m(new float[9]), fArr, fArr2), z.a(k0, W().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        c cVar = new c(z, matrix3, view, fVar, eVar);
        objectAnimatorOfPropertyValuesHolder.addListener(cVar);
        b.w.a.a(objectAnimatorOfPropertyValuesHolder, cVar);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean Q0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.i0(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r3.i0(r5)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            b.w.n0 r4 = r3.T(r4, r1)
            if (r4 == 0) goto L1f
            android.view.View r4 = r4.f1494b
            if (r5 != r4) goto L1d
            goto L1e
        L1a:
            if (r4 != r5) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r2 = r1
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.w.i.Q0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    static void R0(View view) {
        V0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private void S0(n0 n0Var, n0 n0Var2) {
        Matrix matrix = (Matrix) n0Var2.f1493a.get(f0);
        n0Var2.f1494b.setTag(a0.e.parent_matrix, matrix);
        Matrix matrix2 = this.b0;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) n0Var.f1493a.get(c0);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            n0Var.f1493a.put(c0, matrix3);
        }
        matrix3.postConcat((Matrix) n0Var.f1493a.get(f0));
        matrix3.postConcat(matrix2);
    }

    static void V0(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        view.setTranslationX(f2);
        view.setTranslationY(f3);
        b.i.p.f0.n2(view, f4);
        view.setScaleX(f5);
        view.setScaleY(f6);
        view.setRotationX(f7);
        view.setRotationY(f8);
        view.setRotation(f9);
    }

    public boolean O0() {
        return this.a0;
    }

    public boolean P0() {
        return this.Z;
    }

    public void T0(boolean z) {
        this.a0 = z;
    }

    public void U0(boolean z) {
        this.Z = z;
    }

    @Override // b.w.g0
    public String[] e0() {
        return i0;
    }

    @Override // b.w.g0
    public void n(@androidx.annotation.h0 n0 n0Var) {
        L0(n0Var);
    }

    @Override // b.w.g0
    public void q(@androidx.annotation.h0 n0 n0Var) {
        L0(n0Var);
        if (l0) {
            return;
        }
        ((ViewGroup) n0Var.f1494b.getParent()).startViewTransition(n0Var.f1494b);
    }

    @Override // b.w.g0
    public Animator u(@androidx.annotation.h0 ViewGroup viewGroup, n0 n0Var, n0 n0Var2) {
        if (n0Var == null || n0Var2 == null || !n0Var.f1493a.containsKey(e0) || !n0Var2.f1493a.containsKey(e0)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) n0Var.f1493a.get(e0);
        boolean z = this.a0 && !Q0(viewGroup2, (ViewGroup) n0Var2.f1493a.get(e0));
        Matrix matrix = (Matrix) n0Var.f1493a.get(h0);
        if (matrix != null) {
            n0Var.f1493a.put(c0, matrix);
        }
        Matrix matrix2 = (Matrix) n0Var.f1493a.get(g0);
        if (matrix2 != null) {
            n0Var.f1493a.put(f0, matrix2);
        }
        if (z) {
            S0(n0Var, n0Var2);
        }
        ObjectAnimator objectAnimatorN0 = N0(n0Var, n0Var2, z);
        if (z && objectAnimatorN0 != null && this.Z) {
            M0(viewGroup, n0Var, n0Var2);
        } else if (!l0) {
            viewGroup2.endViewTransition(n0Var.f1494b);
        }
        return objectAnimatorN0;
    }
}
