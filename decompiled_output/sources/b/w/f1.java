package b.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.p0;
import b.w.a;
import b.w.a0;
import b.w.g0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class f1 extends g0 {
    private static final String c0 = "android:visibility:screenLocation";
    public static final int d0 = 1;
    public static final int e0 = 2;
    private int Z;
    static final String a0 = "android:visibility:visibility";
    private static final String b0 = "android:visibility:parent";
    private static final String[] f0 = {a0, b0};

    class a extends i0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1429a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1430b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1431c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f1429a = viewGroup;
            this.f1430b = view;
            this.f1431c = view2;
        }

        @Override // b.w.i0, b.w.g0.h
        public void c(@androidx.annotation.h0 g0 g0Var) {
            t0.b(this.f1429a).c(this.f1430b);
        }

        @Override // b.w.i0, b.w.g0.h
        public void d(@androidx.annotation.h0 g0 g0Var) {
            if (this.f1430b.getParent() == null) {
                t0.b(this.f1429a).a(this.f1430b);
            } else {
                f1.this.m();
            }
        }

        @Override // b.w.i0, b.w.g0.h
        public void e(@androidx.annotation.h0 g0 g0Var) {
            this.f1431c.setTag(a0.e.save_overlay_view, null);
            t0.b(this.f1429a).c(this.f1430b);
            g0Var.s0(this);
        }
    }

    private static class b extends AnimatorListenerAdapter implements g0.h, a.InterfaceC0106a {

        /* renamed from: a, reason: collision with root package name */
        private final View f1432a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1433b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f1434c;
        private final boolean d;
        private boolean e;
        boolean f = false;

        b(View view, int r3, boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f1432a = view;
            this.f1433b = r3;
            this.f1434c = (ViewGroup) view.getParent();
            this.d = z;
            g(true);
        }

        private void f() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!this.f) {
                y0.i(this.f1432a, this.f1433b);
                ViewGroup viewGroup = this.f1434c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.f1434c) == null) {
                return;
            }
            this.e = z;
            t0.d(viewGroup, z);
        }

        @Override // b.w.g0.h
        public void a(@androidx.annotation.h0 g0 g0Var) {
        }

        @Override // b.w.g0.h
        public void b(@androidx.annotation.h0 g0 g0Var) {
        }

        @Override // b.w.g0.h
        public void c(@androidx.annotation.h0 g0 g0Var) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            g(false);
        }

        @Override // b.w.g0.h
        public void d(@androidx.annotation.h0 g0 g0Var) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            g(true);
        }

        @Override // b.w.g0.h
        public void e(@androidx.annotation.h0 g0 g0Var) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            f();
            g0Var.s0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, b.w.a.InterfaceC0106a
        public void onAnimationPause(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f) {
                return;
            }
            y0.i(this.f1432a, this.f1433b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, b.w.a.InterfaceC0106a
        public void onAnimationResume(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f) {
                return;
            }
            y0.i(this.f1432a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        boolean f1435a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1436b;

        /* renamed from: c, reason: collision with root package name */
        int f1437c;
        int d;
        ViewGroup e;
        ViewGroup f;

        d() {
        }
    }

    public f1() {
        this.Z = 3;
    }

    @SuppressLint({"RestrictedApi"})
    public f1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Z = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.e);
        int r4 = b.i.c.j.h.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (r4 != 0) {
            T0(r4);
        }
    }

    private void L0(n0 n0Var) {
        n0Var.f1493a.put(a0, Integer.valueOf(n0Var.f1494b.getVisibility()));
        n0Var.f1493a.put(b0, n0Var.f1494b.getParent());
        int[] r0 = new int[2];
        n0Var.f1494b.getLocationOnScreen(r0);
        n0Var.f1493a.put(c0, r0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r9 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r0.e == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r0.f1437c == 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b.w.f1.d N0(b.w.n0 r8, b.w.n0 r9) {
        /*
            r7 = this;
            b.w.f1$d r0 = new b.w.f1$d
            r0.<init>()
            r1 = 0
            r0.f1435a = r1
            r0.f1436b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1493a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1493a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f1437c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1493a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.f1437c = r4
            r0.e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f1493a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1493a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1493a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L5e
        L5a:
            r0.d = r4
            r0.f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L86
            if (r9 == 0) goto L86
            int r8 = r0.f1437c
            int r9 = r0.d
            if (r8 != r9) goto L70
            android.view.ViewGroup r8 = r0.e
            android.view.ViewGroup r9 = r0.f
            if (r8 != r9) goto L70
            return r0
        L70:
            int r8 = r0.f1437c
            int r9 = r0.d
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L79
            goto L97
        L79:
            if (r9 != 0) goto L9a
            goto L8c
        L7c:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            goto L97
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9a
            goto L8c
        L86:
            if (r8 != 0) goto L91
            int r8 = r0.d
            if (r8 != 0) goto L91
        L8c:
            r0.f1436b = r2
        L8e:
            r0.f1435a = r2
            goto L9a
        L91:
            if (r9 != 0) goto L9a
            int r8 = r0.f1437c
            if (r8 != 0) goto L9a
        L97:
            r0.f1436b = r1
            goto L8e
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.w.f1.N0(b.w.n0, b.w.n0):b.w.f1$d");
    }

    public int M0() {
        return this.Z;
    }

    public boolean O0(n0 n0Var) {
        if (n0Var == null) {
            return false;
        }
        return ((Integer) n0Var.f1493a.get(a0)).intValue() == 0 && ((View) n0Var.f1493a.get(b0)) != null;
    }

    public Animator P0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        return null;
    }

    public Animator Q0(ViewGroup viewGroup, n0 n0Var, int r5, n0 n0Var2, int r7) {
        if ((this.Z & 1) != 1 || n0Var2 == null) {
            return null;
        }
        if (n0Var == null) {
            View view = (View) n0Var2.f1494b.getParent();
            if (N0(T(view, false), f0(view, false)).f1435a) {
                return null;
            }
        }
        return P0(viewGroup, n0Var2.f1494b, n0Var, n0Var2);
    }

    public Animator R0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085 A[PHI: r2
  0x0085: PHI (r2v3 android.view.View) = 
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v6 android.view.View)
 binds: [B:26:0x003e, B:31:0x004d, B:36:0x0072, B:38:0x0075, B:40:0x007b, B:42:0x007f, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator S0(android.view.ViewGroup r11, b.w.n0 r12, int r13, b.w.n0 r14, int r15) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.w.f1.S0(android.view.ViewGroup, b.w.n0, int, b.w.n0, int):android.animation.Animator");
    }

    public void T0(int r2) {
        if ((r2 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.Z = r2;
    }

    @Override // b.w.g0
    @androidx.annotation.i0
    public String[] e0() {
        return f0;
    }

    @Override // b.w.g0
    public boolean g0(n0 n0Var, n0 n0Var2) {
        if (n0Var == null && n0Var2 == null) {
            return false;
        }
        if (n0Var != null && n0Var2 != null && n0Var2.f1493a.containsKey(a0) != n0Var.f1493a.containsKey(a0)) {
            return false;
        }
        d dVarN0 = N0(n0Var, n0Var2);
        if (dVarN0.f1435a) {
            return dVarN0.f1437c == 0 || dVarN0.d == 0;
        }
        return false;
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
    public Animator u(@androidx.annotation.h0 ViewGroup viewGroup, @androidx.annotation.i0 n0 n0Var, @androidx.annotation.i0 n0 n0Var2) {
        d dVarN0 = N0(n0Var, n0Var2);
        if (!dVarN0.f1435a) {
            return null;
        }
        if (dVarN0.e == null && dVarN0.f == null) {
            return null;
        }
        return dVarN0.f1436b ? Q0(viewGroup, n0Var, dVarN0.f1437c, n0Var2, dVarN0.d) : S0(viewGroup, n0Var, dVarN0.f1437c, n0Var2, dVarN0.d);
    }
}
