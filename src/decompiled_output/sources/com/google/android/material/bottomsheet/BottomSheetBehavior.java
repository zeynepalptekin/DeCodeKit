package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.x0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;
import b.i.p.o0;
import b.i.p.p0.d;
import b.i.p.p0.g;
import b.k.c.c;
import c.a.b.c.a;
import c.a.b.c.u.o;
import com.google.android.material.internal.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int Q = 1;
    public static final int R = 2;
    public static final int S = 3;
    public static final int T = 4;
    public static final int U = 5;
    public static final int V = 6;
    public static final int W = -1;
    public static final int X = 1;
    public static final int Y = 2;
    public static final int Z = 4;
    public static final int a0 = 8;
    public static final int b0 = -1;
    public static final int c0 = 0;
    private static final String d0 = "BottomSheetBehavior";
    private static final int e0 = 500;
    private static final float f0 = 0.5f;
    private static final float g0 = 0.1f;
    private static final int h0 = 500;
    private static final int i0 = a.n.Widget_Design_BottomSheet_Modal;

    @i0
    b.k.c.c A;
    private boolean B;
    private int C;
    private boolean D;
    private int E;
    int F;
    int G;

    @i0
    WeakReference<V> H;

    @i0
    WeakReference<View> I;

    @h0
    private final ArrayList<f> J;

    @i0
    private VelocityTracker K;
    int L;
    private int M;
    boolean N;

    @i0
    private Map<View, Integer> O;
    private final c.AbstractC0082c P;

    /* renamed from: a, reason: collision with root package name */
    private int f6636a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6637b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6638c;
    private float d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private c.a.b.c.u.j j;
    private int k;
    private boolean l;
    private o m;
    private boolean n;
    private BottomSheetBehavior<V>.i o;

    @i0
    private ValueAnimator p;
    int q;
    int r;
    int s;
    float t;
    int u;
    float v;
    boolean w;
    private boolean x;
    private boolean y;
    int z;

    class a implements Runnable {
        final /* synthetic */ View d;
        final /* synthetic */ int e;

        a(View view, int r3) {
            this.d = view;
            this.e = r3;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.D0(this.d, this.e);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.j != null) {
                BottomSheetBehavior.this.j.o0(fFloatValue);
            }
        }
    }

    class c implements z.e {
        c() {
        }

        @Override // com.google.android.material.internal.z.e
        public o0 a(View view, o0 o0Var, z.f fVar) {
            BottomSheetBehavior.this.k = o0Var.e().d;
            BottomSheetBehavior.this.K0(false);
            return o0Var;
        }
    }

    class d extends c.AbstractC0082c {
        d() {
        }

        private boolean n(@h0 View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.G + bottomSheetBehavior.Z()) / 2;
        }

        @Override // b.k.c.c.AbstractC0082c
        public int a(@h0 View view, int r2, int r3) {
            return view.getLeft();
        }

        @Override // b.k.c.c.AbstractC0082c
        public int b(@h0 View view, int r3, int r4) {
            int r2 = BottomSheetBehavior.this.Z();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return b.i.i.a.c(r3, r2, bottomSheetBehavior.w ? bottomSheetBehavior.G : bottomSheetBehavior.u);
        }

        @Override // b.k.c.c.AbstractC0082c
        public int e(@h0 View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.w ? bottomSheetBehavior.G : bottomSheetBehavior.u;
        }

        @Override // b.k.c.c.AbstractC0082c
        public void j(int r2) {
            if (r2 == 1 && BottomSheetBehavior.this.y) {
                BottomSheetBehavior.this.A0(1);
            }
        }

        @Override // b.k.c.c.AbstractC0082c
        public void k(@h0 View view, int r2, int r3, int r4, int r5) {
            BottomSheetBehavior.this.W(r3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        
            if (java.lang.Math.abs(r7.getTop() - r6.f6641a.q) < java.lang.Math.abs(r7.getTop() - r6.f6641a.s)) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
        
            r8 = r6.f6641a.q;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
        
            if (java.lang.Math.abs(r8 - r6.f6641a.s) < java.lang.Math.abs(r8 - r6.f6641a.u)) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
        
            if (java.lang.Math.abs(r8 - r6.f6641a.r) < java.lang.Math.abs(r8 - r6.f6641a.u)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ea, code lost:
        
            if (r8 < java.lang.Math.abs(r8 - r9.u)) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
        
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.f6641a.u)) goto L39;
         */
        @Override // b.k.c.c.AbstractC0082c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(@androidx.annotation.h0 android.view.View r7, float r8, float r9) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // b.k.c.c.AbstractC0082c
        public boolean m(@h0 View view, int r7) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int r1 = bottomSheetBehavior.z;
            if (r1 == 1 || bottomSheetBehavior.N) {
                return false;
            }
            if (r1 == 3 && bottomSheetBehavior.L == r7) {
                WeakReference<View> weakReference = bottomSheetBehavior.I;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.H;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements b.i.p.p0.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6642a;

        e(int r2) {
            this.f6642a = r2;
        }

        @Override // b.i.p.p0.g
        public boolean a(@h0 View view, @i0 g.a aVar) {
            BottomSheetBehavior.this.z0(this.f6642a);
            return true;
        }
    }

    public static abstract class f {
        public abstract void a(@h0 View view, float f);

        public abstract void b(@h0 View view, int r2);
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface g {
    }

    protected static class h extends b.k.b.a {
        public static final Parcelable.Creator<h> CREATOR = new a();
        final int f;
        int g;
        boolean h;
        boolean i;
        boolean j;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @i0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@h0 Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @h0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@h0 Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int r1) {
                return new h[r1];
            }
        }

        public h(@h0 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public h(@h0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
        }

        @Deprecated
        public h(Parcelable parcelable, int r2) {
            super(parcelable);
            this.f = r2;
        }

        public h(Parcelable parcelable, @h0 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f = bottomSheetBehavior.z;
            this.g = ((BottomSheetBehavior) bottomSheetBehavior).e;
            this.h = ((BottomSheetBehavior) bottomSheetBehavior).f6637b;
            this.i = bottomSheetBehavior.w;
            this.j = ((BottomSheetBehavior) bottomSheetBehavior).x;
        }

        @Override // b.k.b.a, android.os.Parcelable
        public void writeToParcel(@h0 Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
        }
    }

    private class i implements Runnable {
        private final View d;
        private boolean e;
        int f;

        i(View view, int r3) {
            this.d = view;
            this.f = r3;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.k.c.c cVar = BottomSheetBehavior.this.A;
            if (cVar == null || !cVar.o(true)) {
                BottomSheetBehavior.this.A0(this.f);
            } else {
                f0.i1(this.d, this);
            }
            this.e = false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface j {
    }

    public BottomSheetBehavior() {
        this.f6636a = 0;
        this.f6637b = true;
        this.f6638c = false;
        this.o = null;
        this.t = f0;
        this.v = -1.0f;
        this.y = true;
        this.z = 4;
        this.J = new ArrayList<>();
        this.P = new d();
    }

    public BottomSheetBehavior(@h0 Context context, @i0 AttributeSet attributeSet) {
        int r9;
        super(context, attributeSet);
        this.f6636a = 0;
        this.f6637b = true;
        this.f6638c = false;
        this.o = null;
        this.t = f0;
        this.v = -1.0f;
        this.y = true;
        this.z = 4;
        this.J = new ArrayList<>();
        this.P = new d();
        this.h = context.getResources().getDimensionPixelSize(a.f.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.BottomSheetBehavior_Layout);
        this.i = typedArrayObtainStyledAttributes.hasValue(a.o.BottomSheetBehavior_Layout_shapeAppearance);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(a.o.BottomSheetBehavior_Layout_backgroundTint);
        if (zHasValue) {
            T(context, attributeSet, zHasValue, c.a.b.c.r.c.a(context, typedArrayObtainStyledAttributes, a.o.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            S(context, attributeSet, zHasValue);
        }
        U();
        if (Build.VERSION.SDK_INT >= 21) {
            this.v = typedArrayObtainStyledAttributes.getDimension(a.o.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(a.o.BottomSheetBehavior_Layout_behavior_peekHeight);
        v0((typedValuePeekValue == null || (r9 = typedValuePeekValue.data) != -1) ? typedArrayObtainStyledAttributes.getDimensionPixelSize(a.o.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : r9);
        u0(typedArrayObtainStyledAttributes.getBoolean(a.o.BottomSheetBehavior_Layout_behavior_hideable, false));
        s0(typedArrayObtainStyledAttributes.getBoolean(a.o.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        r0(typedArrayObtainStyledAttributes.getBoolean(a.o.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        y0(typedArrayObtainStyledAttributes.getBoolean(a.o.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        p0(typedArrayObtainStyledAttributes.getBoolean(a.o.BottomSheetBehavior_Layout_behavior_draggable, true));
        x0(typedArrayObtainStyledAttributes.getInt(a.o.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        t0(typedArrayObtainStyledAttributes.getFloat(a.o.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, f0));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(a.o.BottomSheetBehavior_Layout_behavior_expandedOffset);
        q0((typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.o.BottomSheetBehavior_Layout_behavior_expandedOffset, 0) : typedValuePeekValue2.data);
        typedArrayObtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void B0(@h0 View view) {
        if (Build.VERSION.SDK_INT < 29 || j0() || this.f) {
            return;
        }
        z.c(view, new c());
    }

    private void E0(int r3) {
        V v = this.H.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && f0.J0(v)) {
            v.post(new a(v, r3));
        } else {
            D0(v, r3);
        }
    }

    private void H0() {
        V v;
        int r2;
        d.a aVar;
        WeakReference<V> weakReference = this.H;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        f0.k1(v, 524288);
        f0.k1(v, 262144);
        f0.k1(v, 1048576);
        if (this.w && this.z != 5) {
            N(v, d.a.z, 5);
        }
        int r1 = this.z;
        if (r1 == 3) {
            r2 = this.f6637b ? 4 : 6;
            aVar = d.a.y;
        } else {
            if (r1 != 4) {
                if (r1 != 6) {
                    return;
                }
                N(v, d.a.y, 4);
                N(v, d.a.x, 3);
                return;
            }
            r2 = this.f6637b ? 3 : 6;
            aVar = d.a.x;
        }
        N(v, aVar, r2);
    }

    private void I0(int r6) {
        ValueAnimator valueAnimator;
        if (r6 == 2) {
            return;
        }
        boolean z = r6 == 3;
        if (this.n != z) {
            this.n = z;
            if (this.j == null || (valueAnimator = this.p) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.p.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.p.setFloatValues(1.0f - f2, f2);
            this.p.start();
        }
    }

    private void J0(boolean z) {
        Map<View, Integer> map;
        int r5;
        WeakReference<V> weakReference = this.H;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.O != null) {
                    return;
                } else {
                    this.O = new HashMap(childCount);
                }
            }
            for (int r2 = 0; r2 < childCount; r2++) {
                View childAt = coordinatorLayout.getChildAt(r2);
                if (childAt != this.H.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f6638c) {
                            r5 = 4;
                            f0.K1(childAt, r5);
                        }
                    } else if (this.f6638c && (map = this.O) != null && map.containsKey(childAt)) {
                        r5 = this.O.get(childAt).intValue();
                        f0.K1(childAt, r5);
                    }
                }
            }
            if (z) {
                return;
            }
            this.O = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(boolean z) {
        V v;
        if (this.H != null) {
            P();
            if (this.z != 4 || (v = this.H.get()) == null) {
                return;
            }
            if (z) {
                E0(this.z);
            } else {
                v.requestLayout();
            }
        }
    }

    private void N(V v, d.a aVar, int r4) {
        f0.n1(v, aVar, null, new e(r4));
    }

    private void P() {
        int r0 = R();
        if (this.f6637b) {
            this.u = Math.max(this.G - r0, this.r);
        } else {
            this.u = this.G - r0;
        }
    }

    private void Q() {
        this.s = (int) (this.G * (1.0f - this.t));
    }

    private int R() {
        int r0;
        return this.f ? Math.min(Math.max(this.g, this.G - ((this.F * 9) / 16)), this.E) : (this.l || (r0 = this.k) <= 0) ? this.e : Math.max(this.e, r0 + this.h);
    }

    private void S(@h0 Context context, AttributeSet attributeSet, boolean z) {
        T(context, attributeSet, z, null);
    }

    private void T(@h0 Context context, AttributeSet attributeSet, boolean z, @i0 ColorStateList colorStateList) {
        if (this.i) {
            this.m = o.e(context, attributeSet, a.c.bottomSheetStyle, i0).m();
            c.a.b.c.u.j jVar = new c.a.b.c.u.j(this.m);
            this.j = jVar;
            jVar.Y(context);
            if (z && colorStateList != null) {
                this.j.n0(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.j.setTint(typedValue.data);
        }
    }

    private void U() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.p.addUpdateListener(new b());
    }

    @h0
    public static <V extends View> BottomSheetBehavior<V> Y(@h0 V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) layoutParams).f();
        if (cVarF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private float g0() {
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.d);
        return this.K.getYVelocity(this.L);
    }

    private void m0() {
        this.L = -1;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
    }

    private void n0(@h0 h hVar) {
        int r0 = this.f6636a;
        if (r0 == 0) {
            return;
        }
        if (r0 == -1 || (r0 & 1) == 1) {
            this.e = hVar.g;
        }
        int r02 = this.f6636a;
        if (r02 == -1 || (r02 & 2) == 2) {
            this.f6637b = hVar.h;
        }
        int r03 = this.f6636a;
        if (r03 == -1 || (r03 & 4) == 4) {
            this.w = hVar.i;
        }
        int r04 = this.f6636a;
        if (r04 == -1 || (r04 & 8) == 8) {
            this.x = hVar.j;
        }
    }

    void A0(int r4) {
        V v;
        if (this.z == r4) {
            return;
        }
        this.z = r4;
        WeakReference<V> weakReference = this.H;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (r4 == 3) {
            J0(true);
        } else if (r4 == 6 || r4 == 5 || r4 == 4) {
            J0(false);
        }
        I0(r4);
        for (int r2 = 0; r2 < this.J.size(); r2++) {
            this.J.get(r2).b(v, r4);
        }
        H0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean B(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, @h0 View view2, int r5, int r6) {
        this.C = 0;
        this.D = false;
        return (r5 & 2) != 0;
    }

    public void C0(boolean z) {
        this.f6638c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.u)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.u)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        if (java.lang.Math.abs(r3 - r2.s) < java.lang.Math.abs(r3 - r2.u)) goto L47;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(@androidx.annotation.h0 androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.h0 V r4, @androidx.annotation.h0 android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.Z()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.A0(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.I
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb1
            boolean r3 = r2.D
            if (r3 != 0) goto L1f
            goto Lb1
        L1f:
            int r3 = r2.C
            r5 = 4
            r6 = 6
            if (r3 <= 0) goto L3c
            boolean r3 = r2.f6637b
            if (r3 == 0) goto L2d
        L29:
            int r3 = r2.r
            goto Lab
        L2d:
            int r3 = r4.getTop()
            int r5 = r2.s
            if (r3 <= r5) goto L38
            r3 = r5
            goto Laa
        L38:
            int r3 = r2.q
            goto Lab
        L3c:
            boolean r3 = r2.w
            if (r3 == 0) goto L4e
            float r3 = r2.g0()
            boolean r3 = r2.F0(r4, r3)
            if (r3 == 0) goto L4e
            int r3 = r2.G
            r0 = 5
            goto Lab
        L4e:
            int r3 = r2.C
            if (r3 != 0) goto L8b
            int r3 = r4.getTop()
            boolean r1 = r2.f6637b
            if (r1 == 0) goto L6c
            int r6 = r2.r
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r1 = r2.u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L8f
            goto L29
        L6c:
            int r1 = r2.s
            if (r3 >= r1) goto L7b
            int r5 = r2.u
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r3 >= r5) goto La8
            goto L38
        L7b:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L8f
            goto La8
        L8b:
            boolean r3 = r2.f6637b
            if (r3 == 0) goto L93
        L8f:
            int r3 = r2.u
            r0 = 4
            goto Lab
        L93:
            int r3 = r4.getTop()
            int r0 = r2.s
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.u
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L8f
        La8:
            int r3 = r2.s
        Laa:
            r0 = 6
        Lab:
            r5 = 0
            r2.G0(r4, r0, r3, r5)
            r2.D = r5
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    void D0(@h0 View view, int r5) {
        int r0;
        int r2;
        if (r5 == 4) {
            r0 = this.u;
        } else if (r5 == 6) {
            int r1 = this.s;
            if (!this.f6637b || r1 > (r2 = this.r)) {
                r0 = r1;
            } else {
                r0 = r2;
                r5 = 3;
            }
        } else if (r5 == 3) {
            r0 = Z();
        } else {
            if (!this.w || r5 != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + r5);
            }
            r0 = this.G;
        }
        G0(view, r5, r0, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.z == 1 && actionMasked == 0) {
            return true;
        }
        b.k.c.c cVar = this.A;
        if (cVar != null) {
            cVar.L(motionEvent);
        }
        if (actionMasked == 0) {
            m0();
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        if (this.A != null && actionMasked == 2 && !this.B && Math.abs(this.M - motionEvent.getY()) > this.A.D()) {
            this.A.d(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.B;
    }

    boolean F0(@h0 View view, float f2) {
        if (this.x) {
            return true;
        }
        if (view.getTop() < this.u) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * g0)) - ((float) this.u)) / ((float) R()) > f0;
    }

    void G0(View view, int r4, int r5, boolean z) {
        b.k.c.c cVar = this.A;
        if (!(cVar != null && (!z ? !cVar.V(view, view.getLeft(), r5) : !cVar.T(view.getLeft(), r5)))) {
            A0(r4);
            return;
        }
        A0(2);
        I0(r4);
        if (this.o == null) {
            this.o = new i(view, r4);
        }
        if (((i) this.o).e) {
            this.o.f = r4;
            return;
        }
        BottomSheetBehavior<V>.i iVar = this.o;
        iVar.f = r4;
        f0.i1(view, iVar);
        ((i) this.o).e = true;
    }

    public void O(@h0 f fVar) {
        if (this.J.contains(fVar)) {
            return;
        }
        this.J.add(fVar);
    }

    @p0({p0.a.LIBRARY_GROUP})
    @x0
    public void V() {
        this.p = null;
    }

    void W(int r4) {
        float f2;
        float fZ;
        V v = this.H.get();
        if (v == null || this.J.isEmpty()) {
            return;
        }
        int r1 = this.u;
        if (r4 > r1 || r1 == Z()) {
            int r12 = this.u;
            f2 = r12 - r4;
            fZ = this.G - r12;
        } else {
            int r13 = this.u;
            f2 = r13 - r4;
            fZ = r13 - Z();
        }
        float f3 = f2 / fZ;
        for (int r14 = 0; r14 < this.J.size(); r14++) {
            this.J.get(r14).a(v, f3);
        }
    }

    @i0
    @x0
    View X(View view) {
        if (f0.R0(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int r0 = 0; r0 < childCount; r0++) {
            View viewX = X(viewGroup.getChildAt(r0));
            if (viewX != null) {
                return viewX;
            }
        }
        return null;
    }

    public int Z() {
        return this.f6637b ? this.r : this.q;
    }

    @r(from = 0.0d, to = 1.0d)
    public float a0() {
        return this.t;
    }

    public int b0() {
        if (this.f) {
            return -1;
        }
        return this.e;
    }

    @x0
    int c0() {
        return this.g;
    }

    public int d0() {
        return this.f6636a;
    }

    public boolean e0() {
        return this.x;
    }

    public int f0() {
        return this.z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void h(@h0 CoordinatorLayout.g gVar) {
        super.h(gVar);
        this.H = null;
        this.A = null;
    }

    public boolean h0() {
        return this.y;
    }

    public boolean i0() {
        return this.f6637b;
    }

    public boolean j0() {
        return this.l;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k() {
        super.k();
        this.H = null;
        this.A = null;
    }

    public boolean k0() {
        return this.w;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 MotionEvent motionEvent) {
        b.k.c.c cVar;
        if (!v.isShown() || !this.y) {
            this.B = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m0();
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.M = (int) motionEvent.getY();
            if (this.z != 2) {
                WeakReference<View> weakReference = this.I;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.G(view, x, this.M)) {
                    this.L = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.N = true;
                }
            }
            this.B = this.L == -1 && !coordinatorLayout.G(v, x, this.M);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.N = false;
            this.L = -1;
            if (this.B) {
                this.B = false;
                return false;
            }
        }
        if (!this.B && (cVar = this.A) != null && cVar.U(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.I;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.B || this.z == 1 || coordinatorLayout.G(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.A == null || Math.abs(((float) this.M) - motionEvent.getY()) <= ((float) this.A.D())) ? false : true;
    }

    public void l0(@h0 f fVar) {
        this.J.remove(fVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, int r9) {
        int r7;
        c.a.b.c.u.j jVar;
        if (f0.R(coordinatorLayout) && !f0.R(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.H == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(a.f.design_bottom_sheet_peek_height_min);
            B0(v);
            this.H = new WeakReference<>(v);
            if (this.i && (jVar = this.j) != null) {
                f0.B1(v, jVar);
            }
            c.a.b.c.u.j jVar2 = this.j;
            if (jVar2 != null) {
                float fP = this.v;
                if (fP == -1.0f) {
                    fP = f0.P(v);
                }
                jVar2.m0(fP);
                boolean z = this.z == 3;
                this.n = z;
                this.j.o0(z ? 0.0f : 1.0f);
            }
            H0();
            if (f0.S(v) == 0) {
                f0.K1(v, 1);
            }
        }
        if (this.A == null) {
            this.A = b.k.c.c.q(coordinatorLayout, this.P);
        }
        int top = v.getTop();
        coordinatorLayout.N(v, r9);
        this.F = coordinatorLayout.getWidth();
        this.G = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.E = height;
        this.r = Math.max(0, this.G - height);
        Q();
        P();
        int r72 = this.z;
        if (r72 == 3) {
            r7 = Z();
        } else if (r72 == 6) {
            r7 = this.s;
        } else if (this.w && r72 == 5) {
            r7 = this.G;
        } else {
            int r73 = this.z;
            if (r73 != 4) {
                if (r73 == 1 || r73 == 2) {
                    f0.Z0(v, top - v.getTop());
                }
                this.I = new WeakReference<>(X(v));
                return true;
            }
            r7 = this.u;
        }
        f0.Z0(v, r7);
        this.I = new WeakReference<>(X(v));
        return true;
    }

    @Deprecated
    public void o0(f fVar) {
        Log.w(d0, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.J.clear();
        if (fVar != null) {
            this.J.add(fVar);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, float f2, float f3) {
        WeakReference<View> weakReference = this.I;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.z != 3 || super.p(coordinatorLayout, v, view, f2, f3);
    }

    public void p0(boolean z) {
        this.y = z;
    }

    public void q0(int r2) {
        if (r2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.q = r2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, int r5, int r6, @h0 int[] r7, int r8) {
        int r4;
        if (r8 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.I;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int r82 = top - r6;
        if (r6 > 0) {
            if (r82 < Z()) {
                r7[1] = top - Z();
                f0.Z0(v, -r7[1]);
                r4 = 3;
                A0(r4);
            } else {
                if (!this.y) {
                    return;
                }
                r7[1] = r6;
                f0.Z0(v, -r6);
                A0(1);
            }
        } else if (r6 < 0 && !view.canScrollVertically(-1)) {
            int r42 = this.u;
            if (r82 > r42 && !this.w) {
                r7[1] = top - r42;
                f0.Z0(v, -r7[1]);
                r4 = 4;
                A0(r4);
            } else {
                if (!this.y) {
                    return;
                }
                r7[1] = r6;
                f0.Z0(v, -r6);
                A0(1);
            }
        }
        W(v.getTop());
        this.C = r6;
        this.D = true;
    }

    public void r0(boolean z) {
        if (this.f6637b == z) {
            return;
        }
        this.f6637b = z;
        if (this.H != null) {
            P();
        }
        A0((this.f6637b && this.z == 6) ? 3 : this.z);
        H0();
    }

    public void s0(boolean z) {
        this.l = z;
    }

    public void t0(@r(from = 0.0d, to = 1.0d) float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.t = f2;
        if (this.H != null) {
            Q();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, int r4, int r5, int r6, int r7, int r8, @h0 int[] r9) {
    }

    public void u0(boolean z) {
        if (this.w != z) {
            this.w = z;
            if (!z && this.z == 5) {
                z0(4);
            }
            H0();
        }
    }

    public void v0(int r2) {
        w0(r2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto Lc
            boolean r4 = r3.f
            if (r4 != 0) goto L15
            r3.f = r0
            goto L1f
        Lc:
            boolean r2 = r3.f
            if (r2 != 0) goto L17
            int r2 = r3.e
            if (r2 == r4) goto L15
            goto L17
        L15:
            r0 = 0
            goto L1f
        L17:
            r3.f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.e = r4
        L1f:
            if (r0 == 0) goto L24
            r3.K0(r5)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.w0(int, boolean):void");
    }

    public void x0(int r1) {
        this.f6636a = r1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void y(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.y(coordinatorLayout, v, hVar.a());
        n0(hVar);
        int r2 = hVar.f;
        if (r2 == 1 || r2 == 2) {
            r2 = 4;
        }
        this.z = r2;
    }

    public void y0(boolean z) {
        this.x = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @h0
    public Parcelable z(@h0 CoordinatorLayout coordinatorLayout, @h0 V v) {
        return new h(super.z(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public void z0(int r2) {
        if (r2 == this.z) {
            return;
        }
        if (this.H != null) {
            E0(r2);
            return;
        }
        if (r2 == 4 || r2 == 3 || r2 == 6 || (this.w && r2 == 5)) {
            this.z = r2;
        }
    }
}
