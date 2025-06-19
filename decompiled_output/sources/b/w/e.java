package b.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends g0 {
    private static final String c0 = "android:changeBounds:bounds";
    private static final String d0 = "android:changeBounds:clip";
    private static final String e0 = "android:changeBounds:parent";
    private static final String f0 = "android:changeBounds:windowX";
    private static final String g0 = "android:changeBounds:windowY";
    private static final String[] h0 = {c0, d0, e0, f0, g0};
    private static final Property<Drawable, PointF> i0 = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> j0 = new c(PointF.class, "topLeft");
    private static final Property<k, PointF> k0 = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> l0 = new C0107e(PointF.class, "bottomRight");
    private static final Property<View, PointF> m0 = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> n0 = new g(PointF.class, "position");
    private static b0 o0 = new b0();
    private int[] Z;
    private boolean a0;
    private boolean b0;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1386a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f1387b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1388c;
        final /* synthetic */ float d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f1386a = viewGroup;
            this.f1387b = bitmapDrawable;
            this.f1388c = view;
            this.d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y0.b(this.f1386a).d(this.f1387b);
            y0.h(this.f1388c, this.d);
        }
    }

    static class b extends Property<Drawable, PointF> {

        /* renamed from: a, reason: collision with root package name */
        private Rect f1389a;

        b(Class cls, String str) {
            super(cls, str);
            this.f1389a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f1389a);
            Rect rect = this.f1389a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f1389a);
            this.f1389a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f1389a);
        }
    }

    static class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            kVar.c(pointF);
        }
    }

    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            kVar.a(pointF);
        }
    }

    /* renamed from: b.w.e$e, reason: collision with other inner class name */
    static class C0107e extends Property<View, PointF> {
        C0107e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            y0.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            y0.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int r0 = Math.round(pointF.x);
            int r5 = Math.round(pointF.y);
            y0.g(view, r0, r5, view.getWidth() + r0, view.getHeight() + r5);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f1390a;
        private k mViewBounds;

        h(k kVar) {
            this.f1390a = kVar;
            this.mViewBounds = this.f1390a;
        }
    }

    class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1392a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1393b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f1394c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;
        final /* synthetic */ int f;
        final /* synthetic */ int g;

        i(View view, Rect rect, int r4, int r5, int r6, int r7) {
            this.f1393b = view;
            this.f1394c = rect;
            this.d = r4;
            this.e = r5;
            this.f = r6;
            this.g = r7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1392a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (this.f1392a) {
                return;
            }
            b.i.p.f0.F1(this.f1393b, this.f1394c);
            y0.g(this.f1393b, this.d, this.e, this.f, this.g);
        }
    }

    class j extends i0 {

        /* renamed from: a, reason: collision with root package name */
        boolean f1395a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1396b;

        j(ViewGroup viewGroup) {
            this.f1396b = viewGroup;
        }

        @Override // b.w.i0, b.w.g0.h
        public void b(@androidx.annotation.h0 g0 g0Var) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            t0.d(this.f1396b, false);
            this.f1395a = true;
        }

        @Override // b.w.i0, b.w.g0.h
        public void c(@androidx.annotation.h0 g0 g0Var) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            t0.d(this.f1396b, false);
        }

        @Override // b.w.i0, b.w.g0.h
        public void d(@androidx.annotation.h0 g0 g0Var) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            t0.d(this.f1396b, true);
        }

        @Override // b.w.i0, b.w.g0.h
        public void e(@androidx.annotation.h0 g0 g0Var) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!this.f1395a) {
                t0.d(this.f1396b, false);
            }
            g0Var.s0(this);
        }
    }

    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f1398a;

        /* renamed from: b, reason: collision with root package name */
        private int f1399b;

        /* renamed from: c, reason: collision with root package name */
        private int f1400c;
        private int d;
        private View e;
        private int f;
        private int g;

        k(View view) {
            this.e = view;
        }

        private void b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            y0.g(this.e, this.f1398a, this.f1399b, this.f1400c, this.d);
            this.f = 0;
            this.g = 0;
        }

        void a(PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f1400c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int r2 = this.g + 1;
            this.g = r2;
            if (this.f == r2) {
                b();
            }
        }

        void c(PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f1398a = Math.round(pointF.x);
            this.f1399b = Math.round(pointF.y);
            int r2 = this.f + 1;
            this.f = r2;
            if (r2 == this.g) {
                b();
            }
        }
    }

    public e() {
        this.Z = new int[2];
        this.a0 = false;
        this.b0 = false;
    }

    @SuppressLint({"RestrictedApi"})
    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Z = new int[2];
        this.a0 = false;
        this.b0 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.d);
        boolean zE = b.i.c.j.h.e(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        O0(zE);
    }

    private void L0(n0 n0Var) {
        View view = n0Var.f1494b;
        if (!b.i.p.f0.P0(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        n0Var.f1493a.put(c0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        n0Var.f1493a.put(e0, n0Var.f1494b.getParent());
        if (this.b0) {
            n0Var.f1494b.getLocationInWindow(this.Z);
            n0Var.f1493a.put(f0, Integer.valueOf(this.Z[0]));
            n0Var.f1493a.put(g0, Integer.valueOf(this.Z[1]));
        }
        if (this.a0) {
            n0Var.f1493a.put(d0, b.i.p.f0.N(view));
        }
    }

    private boolean N0(View view, View view2) {
        if (!this.b0) {
            return true;
        }
        n0 n0VarT = T(view, true);
        if (n0VarT == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == n0VarT.f1494b) {
            return true;
        }
        return false;
    }

    public boolean M0() {
        return this.a0;
    }

    public void O0(boolean z) {
        this.a0 = z;
    }

    @Override // b.w.g0
    @androidx.annotation.i0
    public String[] e0() {
        return h0;
    }

    @Override // b.w.g0
    public void n(@androidx.annotation.h0 n0 n0Var) {
        L0(n0Var);
    }

    @Override // b.w.g0
    public void q(@androidx.annotation.h0 n0 n0Var) {
        L0(n0Var);
    }

    @Override // b.w.g0
    @androidx.annotation.i0
    public Animator u(@androidx.annotation.h0 ViewGroup viewGroup, @androidx.annotation.i0 n0 n0Var, @androidx.annotation.i0 n0 n0Var2) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int r1;
        View view;
        int r3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        Path pathA;
        Property<View, PointF> property;
        if (n0Var == null || n0Var2 == null) {
            return null;
        }
        Map<String, Object> map = n0Var.f1493a;
        Map<String, Object> map2 = n0Var2.f1493a;
        ViewGroup viewGroup2 = (ViewGroup) map.get(e0);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(e0);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = n0Var2.f1494b;
        if (!N0(viewGroup2, viewGroup3)) {
            int r2 = ((Integer) n0Var.f1493a.get(f0)).intValue();
            int r0 = ((Integer) n0Var.f1493a.get(g0)).intValue();
            int r32 = ((Integer) n0Var2.f1493a.get(f0)).intValue();
            int r12 = ((Integer) n0Var2.f1493a.get(g0)).intValue();
            if (r2 == r32 && r0 == r12) {
                return null;
            }
            viewGroup.getLocationInWindow(this.Z);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = y0.c(view2);
            y0.h(view2, 0.0f);
            y0.b(viewGroup).b(bitmapDrawable);
            w wVarW = W();
            int[] r10 = this.Z;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, z.a(i0, wVarW.a(r2 - r10[0], r0 - r10[1], r32 - r10[0], r12 - r10[1])));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect2 = (Rect) n0Var.f1493a.get(c0);
        Rect rect3 = (Rect) n0Var2.f1493a.get(c0);
        int r6 = rect2.left;
        int r7 = rect3.left;
        int r11 = rect2.top;
        int r122 = rect3.top;
        int r13 = rect2.right;
        int r14 = rect3.right;
        int r33 = rect2.bottom;
        int r15 = rect3.bottom;
        int r5 = r13 - r6;
        int r22 = r33 - r11;
        int r102 = r14 - r7;
        int r4 = r15 - r122;
        Rect rect4 = (Rect) n0Var.f1493a.get(d0);
        Rect rect5 = (Rect) n0Var2.f1493a.get(d0);
        if ((r5 == 0 || r22 == 0) && (r102 == 0 || r4 == 0)) {
            r1 = 0;
        } else {
            r1 = (r6 == r7 && r11 == r122) ? 0 : 1;
            if (r13 != r14 || r33 != r15) {
                r1++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            r1++;
        }
        if (r1 <= 0) {
            return null;
        }
        if (this.a0) {
            view = view2;
            y0.g(view, r6, r11, Math.max(r5, r102) + r6, Math.max(r22, r4) + r11);
            ObjectAnimator objectAnimatorA = (r6 == r7 && r11 == r122) ? null : v.a(view, n0, W().a(r6, r11, r7, r122));
            if (rect4 == null) {
                r3 = 0;
                rect = new Rect(0, 0, r5, r22);
            } else {
                r3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(r3, r3, r102, r4) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                b.i.p.f0.F1(view, rect);
                b0 b0Var = o0;
                Object[] objArr = new Object[2];
                objArr[r3] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", b0Var, objArr);
                objectAnimatorOfObject.addListener(new i(view, rect5, r7, r122, r14, r15));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = m0.c(objectAnimatorA, objectAnimator);
        } else {
            view = view2;
            y0.g(view, r6, r11, r13, r33);
            if (r1 == 2) {
                if (r5 == r102 && r22 == r4) {
                    pathA = W().a(r6, r11, r7, r122);
                    property = n0;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator objectAnimatorA2 = v.a(kVar, j0, W().a(r6, r11, r7, r122));
                    ObjectAnimator objectAnimatorA3 = v.a(kVar, k0, W().a(r13, r33, r14, r15));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                    animatorSet.addListener(new h(kVar));
                    animatorC = animatorSet;
                }
            } else if (r6 == r7 && r11 == r122) {
                pathA = W().a(r13, r33, r14, r15);
                property = l0;
            } else {
                pathA = W().a(r6, r11, r7, r122);
                property = m0;
            }
            animatorC = v.a(view, property, pathA);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            t0.d(viewGroup4, true);
            b(new j(viewGroup4));
        }
        return animatorC;
    }
}
