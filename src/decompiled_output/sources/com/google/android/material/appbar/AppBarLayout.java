package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.w;
import androidx.annotation.x0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;
import b.i.p.o0;
import b.i.p.p0.d;
import b.i.p.p0.g;
import b.i.p.s;
import b.i.p.y;
import c.a.b.c.a;
import c.a.b.c.u.j;
import c.a.b.c.u.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int A = -1;
    static final int u = 0;
    static final int v = 1;
    static final int w = 2;
    static final int x = 4;
    static final int y = 8;
    private static final int z = a.n.Widget_Design_AppBarLayout;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private int i;

    @i0
    private o0 j;
    private List<c> k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    @w
    private int p;

    @i0
    private WeakReference<View> q;

    @i0
    private ValueAnimator r;
    private int[] s;

    @i0
    private Drawable t;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.b<T> {
        private static final int t = 600;
        private static final int u = -1;
        private int l;
        private int m;
        private ValueAnimator n;
        private int o;
        private boolean p;
        private float q;

        @i0
        private WeakReference<View> r;
        private d s;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f6584a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f6585b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f6584a = coordinatorLayout;
                this.f6585b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
                BaseBehavior.this.X(this.f6584a, this.f6585b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b implements g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f6587a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f6588b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f6589c;
            final /* synthetic */ int d;

            b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int r5) {
                this.f6587a = coordinatorLayout;
                this.f6588b = appBarLayout;
                this.f6589c = view;
                this.d = r5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // b.i.p.p0.g
            public boolean a(@h0 View view, @i0 g.a aVar) throws Resources.NotFoundException {
                BaseBehavior.this.r(this.f6587a, this.f6588b, this.f6589c, 0, this.d, new int[]{0, 0}, 1);
                return true;
            }
        }

        class c implements g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f6590a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f6591b;

            c(AppBarLayout appBarLayout, boolean z) {
                this.f6590a = appBarLayout;
                this.f6591b = z;
            }

            @Override // b.i.p.p0.g
            public boolean a(@h0 View view, @i0 g.a aVar) {
                this.f6590a.setExpanded(this.f6591b);
                return true;
            }
        }

        public static abstract class d<T extends AppBarLayout> {
            public abstract boolean a(@h0 T t);
        }

        protected static class e extends b.k.b.a {
            public static final Parcelable.Creator<e> CREATOR = new a();
            int f;
            float g;
            boolean h;

            static class a implements Parcelable.ClassLoaderCreator<e> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                @i0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(@h0 Parcel parcel) {
                    return new e(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                @h0
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(@h0 Parcel parcel, ClassLoader classLoader) {
                    return new e(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @h0
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public e[] newArray(int r1) {
                    return new e[r1];
                }
            }

            public e(@h0 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f = parcel.readInt();
                this.g = parcel.readFloat();
                this.h = parcel.readByte() != 0;
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // b.k.b.a, android.os.Parcelable
            public void writeToParcel(@h0 Parcel parcel, int r2) {
                super.writeToParcel(parcel, r2);
                parcel.writeInt(this.f);
                parcel.writeFloat(this.g);
                parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.o = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.o = -1;
        }

        private void A0(CoordinatorLayout coordinatorLayout, @h0 T t2) {
            int r0 = U();
            int r1 = j0(t2, r0);
            if (r1 >= 0) {
                View childAt = t2.getChildAt(r1);
                d dVar = (d) childAt.getLayoutParams();
                int r4 = dVar.a();
                if ((r4 & 17) == 17) {
                    int r5 = -childAt.getTop();
                    int topInset = -childAt.getBottom();
                    if (r1 == t2.getChildCount() - 1) {
                        topInset += t2.getTopInset();
                    }
                    if (g0(r4, 2)) {
                        topInset += f0.b0(childAt);
                    } else if (g0(r4, 5)) {
                        int r2 = f0.b0(childAt) + topInset;
                        if (r0 < r2) {
                            r5 = r2;
                        } else {
                            topInset = r2;
                        }
                    }
                    if (g0(r4, 32)) {
                        r5 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        topInset -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    if (r0 < (topInset + r5) / 2) {
                        r5 = topInset;
                    }
                    c0(coordinatorLayout, t2, b.i.i.a.c(r5, -t2.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void B0(CoordinatorLayout coordinatorLayout, @h0 T t2) {
            f0.k1(coordinatorLayout, d.a.r.b());
            f0.k1(coordinatorLayout, d.a.s.b());
            View viewH0 = h0(coordinatorLayout);
            if (viewH0 == null || t2.getTotalScrollRange() == 0 || !(((CoordinatorLayout.g) viewH0.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                return;
            }
            a0(coordinatorLayout, t2, viewH0);
        }

        private void C0(@h0 CoordinatorLayout coordinatorLayout, @h0 T t2, int r8, int r9, boolean z) throws NoSuchFieldException, Resources.NotFoundException {
            View viewI0 = i0(t2, r8);
            if (viewI0 != null) {
                int r1 = ((d) viewI0.getLayoutParams()).a();
                boolean zY = false;
                if ((r1 & 1) != 0) {
                    int r2 = f0.b0(viewI0);
                    if (r9 <= 0 || (r1 & 12) == 0 ? !((r1 & 2) == 0 || (-r8) < (viewI0.getBottom() - r2) - t2.getTopInset()) : (-r8) >= (viewI0.getBottom() - r2) - t2.getTopInset()) {
                        zY = true;
                    }
                }
                if (t2.l()) {
                    zY = t2.y(h0(coordinatorLayout));
                }
                boolean zW = t2.w(zY);
                if (z || (zW && z0(coordinatorLayout, t2))) {
                    t2.jumpDrawablesToCurrentState();
                }
            }
        }

        private void a0(CoordinatorLayout coordinatorLayout, @h0 T t2, @h0 View view) {
            if (U() != (-t2.getTotalScrollRange()) && view.canScrollVertically(1)) {
                b0(coordinatorLayout, t2, d.a.r, false);
            }
            if (U() != 0) {
                if (!view.canScrollVertically(-1)) {
                    b0(coordinatorLayout, t2, d.a.s, true);
                    return;
                }
                int r6 = -t2.getDownNestedPreScrollRange();
                if (r6 != 0) {
                    f0.n1(coordinatorLayout, d.a.s, null, new b(coordinatorLayout, t2, view, r6));
                }
            }
        }

        private void b0(CoordinatorLayout coordinatorLayout, @h0 T t2, @h0 d.a aVar, boolean z) {
            f0.n1(coordinatorLayout, aVar, null, new c(t2, z));
        }

        private void c0(CoordinatorLayout coordinatorLayout, @h0 T t2, int r5, float f) {
            int r0 = Math.abs(U() - r5);
            float fAbs = Math.abs(f);
            d0(coordinatorLayout, t2, r5, fAbs > 0.0f ? Math.round((r0 / fAbs) * 1000.0f) * 3 : (int) (((r0 / t2.getHeight()) + 1.0f) * 150.0f));
        }

        private void d0(CoordinatorLayout coordinatorLayout, T t2, int r6, int r7) {
            int r0 = U();
            if (r0 == r6) {
                ValueAnimator valueAnimator = this.n;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.n.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.n;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.n = valueAnimator3;
                valueAnimator3.setInterpolator(c.a.b.c.b.a.e);
                this.n.addUpdateListener(new a(coordinatorLayout, t2));
            } else {
                valueAnimator2.cancel();
            }
            this.n.setDuration(Math.min(r7, t));
            this.n.setIntValues(r0, r6);
            this.n.start();
        }

        private boolean f0(@h0 CoordinatorLayout coordinatorLayout, @h0 T t2, @h0 View view) {
            return t2.j() && coordinatorLayout.getHeight() - view.getHeight() <= t2.getHeight();
        }

        private static boolean g0(int r0, int r1) {
            return (r0 & r1) == r1;
        }

        @i0
        private View h0(@h0 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int r1 = 0; r1 < childCount; r1++) {
                View childAt = coordinatorLayout.getChildAt(r1);
                if ((childAt instanceof s) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @i0
        private static View i0(@h0 AppBarLayout appBarLayout, int r5) {
            int r52 = Math.abs(r5);
            int childCount = appBarLayout.getChildCount();
            for (int r1 = 0; r1 < childCount; r1++) {
                View childAt = appBarLayout.getChildAt(r1);
                if (r52 >= childAt.getTop() && r52 <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int j0(@h0 T t2, int r9) {
            int childCount = t2.getChildCount();
            for (int r1 = 0; r1 < childCount; r1++) {
                View childAt = t2.getChildAt(r1);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (g0(dVar.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int r2 = -r9;
                if (top <= r2 && bottom >= r2) {
                    return r1;
                }
            }
            return -1;
        }

        private int m0(@h0 T t2, int r10) {
            int r0 = Math.abs(r10);
            int childCount = t2.getChildCount();
            int topInset = 0;
            int r3 = 0;
            while (true) {
                if (r3 >= childCount) {
                    break;
                }
                View childAt = t2.getChildAt(r3);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator interpolatorB = dVar.b();
                if (r0 < childAt.getTop() || r0 > childAt.getBottom()) {
                    r3++;
                } else if (interpolatorB != null) {
                    int r1 = dVar.a();
                    if ((r1 & 1) != 0) {
                        topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((r1 & 2) != 0) {
                            topInset -= f0.b0(childAt);
                        }
                    }
                    if (f0.R(childAt)) {
                        topInset -= t2.getTopInset();
                    }
                    if (topInset > 0) {
                        float f = topInset;
                        return Integer.signum(r10) * (childAt.getTop() + Math.round(f * interpolatorB.getInterpolation((r0 - childAt.getTop()) / f)));
                    }
                }
            }
            return r10;
        }

        private boolean z0(@h0 CoordinatorLayout coordinatorLayout, @h0 T t2) {
            List<View> listX = coordinatorLayout.x(t2);
            int size = listX.size();
            for (int r1 = 0; r1 < size; r1++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) listX.get(r1).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).S() != 0;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.b
        int U() {
            return H() + this.l;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public boolean P(T t2) {
            d dVar = this.s;
            if (dVar != null) {
                return dVar.a(t2);
            }
            WeakReference<View> weakReference = this.r;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int S(@h0 T t2) {
            return -t2.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int T(@h0 T t2) {
            return t2.getTotalScrollRange();
        }

        @x0
        boolean n0() {
            ValueAnimator valueAnimator = this.n;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void V(@h0 CoordinatorLayout coordinatorLayout, @h0 T t2) throws Resources.NotFoundException {
            A0(coordinatorLayout, t2);
            if (t2.l()) {
                t2.w(t2.y(h0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 T t2, int r10) throws NoSuchFieldException, Resources.NotFoundException {
            boolean zM = super.m(coordinatorLayout, t2, r10);
            int pendingAction = t2.getPendingAction();
            int r1 = this.o;
            if (r1 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t2.getChildAt(r1);
                X(coordinatorLayout, t2, (-childAt.getBottom()) + (this.p ? f0.b0(childAt) + t2.getTopInset() : Math.round(childAt.getHeight() * this.q)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int r0 = -t2.getUpNestedPreScrollRange();
                    if (z) {
                        c0(coordinatorLayout, t2, r0, 0.0f);
                    } else {
                        X(coordinatorLayout, t2, r0);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        c0(coordinatorLayout, t2, 0, 0.0f);
                    } else {
                        X(coordinatorLayout, t2, 0);
                    }
                }
            }
            t2.q();
            this.o = -1;
            N(b.i.i.a.c(H(), -t2.getTotalScrollRange(), 0));
            C0(coordinatorLayout, t2, H(), 0, true);
            t2.m(H());
            B0(coordinatorLayout, t2);
            return zM;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean n(@h0 CoordinatorLayout coordinatorLayout, @h0 T t2, int r9, int r10, int r11, int r12) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) t2.getLayoutParams())).height != -2) {
                return super.n(coordinatorLayout, t2, r9, r10, r11, r12);
            }
            coordinatorLayout.O(t2, r9, r10, View.MeasureSpec.makeMeasureSpec(0, 0), r12);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void r(CoordinatorLayout coordinatorLayout, @h0 T t2, View view, int r10, int r11, int[] r12, int r13) throws Resources.NotFoundException {
            int r4;
            int downNestedPreScrollRange;
            if (r11 != 0) {
                if (r11 < 0) {
                    int r102 = -t2.getTotalScrollRange();
                    r4 = r102;
                    downNestedPreScrollRange = t2.getDownNestedPreScrollRange() + r102;
                } else {
                    r4 = -t2.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (r4 != downNestedPreScrollRange) {
                    r12[1] = W(coordinatorLayout, t2, r11, r4, downNestedPreScrollRange);
                }
            }
            if (t2.l()) {
                t2.w(t2.y(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void u(CoordinatorLayout coordinatorLayout, @h0 T t2, View view, int r10, int r11, int r12, int r13, int r14, int[] r15) {
            if (r13 < 0) {
                r15[1] = W(coordinatorLayout, t2, r13, -t2.getDownNestedScrollRange(), 0);
            }
            if (r13 == 0) {
                B0(coordinatorLayout, t2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public void y(@h0 CoordinatorLayout coordinatorLayout, @h0 T t2, Parcelable parcelable) {
            if (!(parcelable instanceof e)) {
                super.y(coordinatorLayout, t2, parcelable);
                this.o = -1;
                return;
            }
            e eVar = (e) parcelable;
            super.y(coordinatorLayout, t2, eVar.a());
            this.o = eVar.f;
            this.q = eVar.g;
            this.p = eVar.h;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public Parcelable z(@h0 CoordinatorLayout coordinatorLayout, @h0 T t2) {
            Parcelable parcelableZ = super.z(coordinatorLayout, t2);
            int r0 = H();
            int childCount = t2.getChildCount();
            for (int r3 = 0; r3 < childCount; r3++) {
                View childAt = t2.getChildAt(r3);
                int bottom = childAt.getBottom() + r0;
                if (childAt.getTop() + r0 <= 0 && bottom >= 0) {
                    e eVar = new e(parcelableZ);
                    eVar.f = r3;
                    eVar.h = bottom == f0.b0(childAt) + t2.getTopInset();
                    eVar.g = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return parcelableZ;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public boolean B(@h0 CoordinatorLayout coordinatorLayout, @h0 T t2, @h0 View view, View view2, int r5, int r6) {
            ValueAnimator valueAnimator;
            boolean z = (r5 & 2) != 0 && (t2.l() || f0(coordinatorLayout, t2, view));
            if (z && (valueAnimator = this.n) != null) {
                valueAnimator.cancel();
            }
            this.r = null;
            this.m = r6;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: w0, reason: merged with bridge method [inline-methods] */
        public void D(CoordinatorLayout coordinatorLayout, @h0 T t2, View view, int r5) throws Resources.NotFoundException {
            if (this.m == 0 || r5 == 1) {
                A0(coordinatorLayout, t2);
                if (t2.l()) {
                    t2.w(t2.y(view));
                }
            }
            this.r = new WeakReference<>(view);
        }

        public void x0(@i0 d dVar) {
            this.s = dVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int Y(@h0 CoordinatorLayout coordinatorLayout, @h0 T t2, int r11, int r12, int r13) throws NoSuchFieldException, Resources.NotFoundException {
            int r0 = U();
            int r1 = 0;
            if (r12 == 0 || r0 < r12 || r0 > r13) {
                this.l = 0;
            } else {
                int r5 = b.i.i.a.c(r11, r12, r13);
                if (r0 != r5) {
                    int r112 = t2.h() ? m0(t2, r5) : r5;
                    boolean zN = N(r112);
                    r1 = r0 - r5;
                    this.l = r5 - r112;
                    if (!zN && t2.h()) {
                        coordinatorLayout.j(t2);
                    }
                    t2.m(H());
                    C0(coordinatorLayout, t2, r5, r5 < r0 ? -1 : 1, false);
                }
            }
            B0(coordinatorLayout, t2);
            return r1;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class a extends BaseBehavior.d<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int G() {
            return super.G();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int H() {
            return super.H();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean J() {
            return super.J();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void L(boolean z) {
            super.L(z);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean M(int r1) {
            return super.M(r1);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean N(int r1) {
            return super.N(r1);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void O(boolean z) {
            super.O(z);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 AppBarLayout appBarLayout, int r3) {
            return super.m(coordinatorLayout, appBarLayout, r3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean n(@h0 CoordinatorLayout coordinatorLayout, @h0 AppBarLayout appBarLayout, int r3, int r4, int r5, int r6) {
            return super.n(coordinatorLayout, appBarLayout, r3, r4, r5, r6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void r(CoordinatorLayout coordinatorLayout, @h0 AppBarLayout appBarLayout, View view, int r4, int r5, int[] r6, int r7) throws Resources.NotFoundException {
            super.r(coordinatorLayout, appBarLayout, view, r4, r5, r6, r7);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: s0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, @h0 AppBarLayout appBarLayout, View view, int r4, int r5, int r6, int r7, int r8, int[] r9) {
            super.u(coordinatorLayout, appBarLayout, view, r4, r5, r6, r7, r8, r9);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ void y(@h0 CoordinatorLayout coordinatorLayout, @h0 AppBarLayout appBarLayout, Parcelable parcelable) {
            super.y(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ Parcelable z(@h0 CoordinatorLayout coordinatorLayout, @h0 AppBarLayout appBarLayout) {
            return super.z(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ boolean B(@h0 CoordinatorLayout coordinatorLayout, @h0 AppBarLayout appBarLayout, @h0 View view, View view2, int r5, int r6) {
            return super.B(coordinatorLayout, appBarLayout, view, view2, r5, r6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: w0 */
        public /* bridge */ /* synthetic */ void D(CoordinatorLayout coordinatorLayout, @h0 AppBarLayout appBarLayout, View view, int r4) throws Resources.NotFoundException {
            super.D(coordinatorLayout, appBarLayout, view, r4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void x0(@i0 BaseBehavior.d dVar) {
            super.x0(dVar);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.c {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ScrollingViewBehavior_Layout);
            W(typedArrayObtainStyledAttributes.getDimensionPixelSize(a.o.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        private static int Z(@h0 AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).U();
            }
            return 0;
        }

        private void a0(@h0 View view, @h0 View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                f0.Z0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).l) + U()) - Q(view2));
            }
        }

        private void b0(View view, View view2) throws Resources.NotFoundException {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.w(appBarLayout.y(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int G() {
            return super.G();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int H() {
            return super.H();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean J() {
            return super.J();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void L(boolean z) {
            super.L(z);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean M(int r1) {
            return super.M(r1);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean N(int r1) {
            return super.N(r1);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ void O(boolean z) {
            super.O(z);
        }

        @Override // com.google.android.material.appbar.c
        float R(View view) throws NoSuchFieldException {
            int r0;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int r5 = Z(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + r5 > downNestedPreScrollRange) && (r0 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (r5 / r0) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.c
        int T(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.T(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        @i0
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public AppBarLayout P(@h0 List<View> list) {
            int size = list.size();
            for (int r1 = 0; r1 < size; r1++) {
                View view = list.get(r1);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(@h0 CoordinatorLayout coordinatorLayout, @h0 View view, @h0 View view2) throws Resources.NotFoundException {
            a0(view, view2);
            b0(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void j(@h0 CoordinatorLayout coordinatorLayout, @h0 View view, @h0 View view2) {
            if (view2 instanceof AppBarLayout) {
                f0.k1(coordinatorLayout, d.a.r.b());
                f0.k1(coordinatorLayout, d.a.s.b());
            }
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 View view, int r3) {
            return super.m(coordinatorLayout, view, r3);
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean n(@h0 CoordinatorLayout coordinatorLayout, @h0 View view, int r3, int r4, int r5, int r6) {
            return super.n(coordinatorLayout, view, r3, r4, r5, r6);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean x(@h0 CoordinatorLayout coordinatorLayout, @h0 View view, @h0 Rect rect, boolean z) {
            AppBarLayout appBarLayoutP = P(coordinatorLayout.w(view));
            if (appBarLayoutP != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutP.r(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    class a implements y {
        a() {
        }

        @Override // b.i.p.y
        public o0 a(View view, o0 o0Var) {
            return AppBarLayout.this.n(o0Var);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f6594a;

        b(j jVar) {
            this.f6594a = jVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            this.f6594a.m0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface c<T extends AppBarLayout> {
        void a(T t, int r2);
    }

    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: c, reason: collision with root package name */
        public static final int f6596c = 0;
        public static final int d = 1;
        public static final int e = 2;
        public static final int f = 4;
        public static final int g = 8;
        public static final int h = 16;
        public static final int i = 32;
        static final int j = 5;
        static final int k = 17;
        static final int l = 10;

        /* renamed from: a, reason: collision with root package name */
        int f6597a;

        /* renamed from: b, reason: collision with root package name */
        Interpolator f6598b;

        @Retention(RetentionPolicy.SOURCE)
        @p0({p0.a.LIBRARY_GROUP})
        public @interface a {
        }

        public d(int r1, int r2) {
            super(r1, r2);
            this.f6597a = 1;
        }

        public d(int r1, int r2, float f2) {
            super(r1, r2, f2);
            this.f6597a = 1;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6597a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.AppBarLayout_Layout);
            this.f6597a = typedArrayObtainStyledAttributes.getInt(a.o.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (typedArrayObtainStyledAttributes.hasValue(a.o.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f6598b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(a.o.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6597a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6597a = 1;
        }

        @m0(19)
        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6597a = 1;
        }

        @m0(19)
        public d(@h0 d dVar) {
            super((LinearLayout.LayoutParams) dVar);
            this.f6597a = 1;
            this.f6597a = dVar.f6597a;
            this.f6598b = dVar.f6598b;
        }

        public int a() {
            return this.f6597a;
        }

        public Interpolator b() {
            return this.f6598b;
        }

        boolean c() {
            int r0 = this.f6597a;
            return (r0 & 1) == 1 && (r0 & 10) != 0;
        }

        public void d(int r1) {
            this.f6597a = r1;
        }

        public void e(Interpolator interpolator) {
            this.f6598b = interpolator;
        }
    }

    public interface e extends c<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.c
        void a(AppBarLayout appBarLayout, int r2);
    }

    public AppBarLayout(@h0 Context context) {
        this(context, null);
    }

    public AppBarLayout(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.appBarLayoutStyle);
    }

    public AppBarLayout(@h0 Context context, @i0 AttributeSet attributeSet, int r12) throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r12, z), attributeSet, r12);
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.i = 0;
        Context context2 = getContext();
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            f.a(this);
            f.c(this, attributeSet, r12, z);
        }
        TypedArray typedArrayJ = com.google.android.material.internal.s.j(context2, attributeSet, a.o.AppBarLayout, r12, z, new int[0]);
        f0.B1(this, typedArrayJ.getDrawable(a.o.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            j jVar = new j();
            jVar.n0(ColorStateList.valueOf(colorDrawable.getColor()));
            jVar.Y(context2);
            f0.B1(this, jVar);
        }
        if (typedArrayJ.hasValue(a.o.AppBarLayout_expanded)) {
            s(typedArrayJ.getBoolean(a.o.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && typedArrayJ.hasValue(a.o.AppBarLayout_elevation)) {
            f.b(this, typedArrayJ.getDimensionPixelSize(a.o.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (typedArrayJ.hasValue(a.o.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(typedArrayJ.getBoolean(a.o.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (typedArrayJ.hasValue(a.o.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(typedArrayJ.getBoolean(a.o.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.o = typedArrayJ.getBoolean(a.o.AppBarLayout_liftOnScroll, false);
        this.p = typedArrayJ.getResourceId(a.o.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayJ.getDrawable(a.o.AppBarLayout_statusBarForeground));
        typedArrayJ.recycle();
        f0.T1(this, new a());
    }

    private void A(@h0 j jVar, boolean z2) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(a.f.design_appbar_elevation);
        float f = z2 ? 0.0f : dimension;
        if (!z2) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
        this.r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(a.i.app_bar_elevation_anim_duration));
        this.r.setInterpolator(c.a.b.c.b.a.f1935a);
        this.r.addUpdateListener(new b(jVar));
        this.r.start();
    }

    private void B() {
        setWillNotDraw(!x());
    }

    private void c() {
        WeakReference<View> weakReference = this.q;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.q = null;
    }

    @i0
    private View d(@i0 View view) {
        int r0;
        if (this.q == null && (r0 = this.p) != -1) {
            View viewFindViewById = view != null ? view.findViewById(r0) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.p);
            }
            if (viewFindViewById != null) {
                this.q = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.q;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int r2 = 0; r2 < childCount; r2++) {
            if (((d) getChildAt(r2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        this.e = -1;
        this.f = -1;
        this.g = -1;
    }

    private void s(boolean z2, boolean z3, boolean z4) {
        this.i = (z2 ? 1 : 2) | (z3 ? 4 : 0) | (z4 ? 8 : 0);
        requestLayout();
    }

    private boolean u(boolean z2) {
        if (this.m == z2) {
            return false;
        }
        this.m = z2;
        refreshDrawableState();
        return true;
    }

    private boolean x() {
        return this.t != null && getTopInset() > 0;
    }

    private boolean z() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || f0.R(childAt)) ? false : true;
    }

    public void a(@i0 c cVar) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (cVar == null || this.k.contains(cVar)) {
            return;
        }
        this.k.add(cVar);
    }

    public void b(e eVar) {
        a(eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.View
    public void draw(@h0 Canvas canvas) {
        super.draw(canvas);
        if (x()) {
            int r0 = canvas.save();
            canvas.translate(0.0f, -this.d);
            this.t.draw(canvas);
            canvas.restoreToCount(r0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.t;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams) : new d((LinearLayout.LayoutParams) layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @h0
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    int getDownNestedPreScrollRange() throws NoSuchFieldException {
        int r7;
        int r4;
        int r0 = this.f;
        if (r0 != -1) {
            return r0;
        }
        int r2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int r6 = dVar.f6597a;
            if ((r6 & 5) != 5) {
                if (r2 > 0) {
                    break;
                }
            } else {
                int r72 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if ((r6 & 8) != 0) {
                    r4 = f0.b0(childAt);
                } else if ((r6 & 2) != 0) {
                    r4 = measuredHeight - f0.b0(childAt);
                } else {
                    r7 = r72 + measuredHeight;
                    if (childCount == 0 && f0.R(childAt)) {
                        r7 = Math.min(r7, measuredHeight - getTopInset());
                    }
                    r2 += r7;
                }
                r7 = r72 + r4;
                if (childCount == 0) {
                    r7 = Math.min(r7, measuredHeight - getTopInset());
                }
                r2 += r7;
            }
        }
        int r02 = Math.max(0, r2);
        this.f = r02;
        return r02;
    }

    int getDownNestedScrollRange() {
        int r0 = this.g;
        if (r0 != -1) {
            return r0;
        }
        int childCount = getChildCount();
        int r2 = 0;
        int r3 = 0;
        while (true) {
            if (r2 >= childCount) {
                break;
            }
            View childAt = getChildAt(r2);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            int r5 = dVar.f6597a;
            if ((r5 & 1) == 0) {
                break;
            }
            r3 += measuredHeight;
            if ((r5 & 2) != 0) {
                r3 -= f0.b0(childAt);
                break;
            }
            r2++;
        }
        int r02 = Math.max(0, r3);
        this.g = r02;
        return r02;
    }

    @w
    public int getLiftOnScrollTargetViewId() {
        return this.p;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() throws NoSuchFieldException {
        int topInset = getTopInset();
        int r1 = f0.b0(this);
        if (r1 == 0) {
            int childCount = getChildCount();
            r1 = childCount >= 1 ? f0.b0(getChildAt(childCount - 1)) : 0;
            if (r1 == 0) {
                return getHeight() / 3;
            }
        }
        return (r1 * 2) + topInset;
    }

    int getPendingAction() {
        return this.i;
    }

    @i0
    public Drawable getStatusBarForeground() {
        return this.t;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @x0
    final int getTopInset() {
        o0 o0Var = this.j;
        if (o0Var != null) {
            return o0Var.o();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int r0 = this.e;
        if (r0 != -1) {
            return r0;
        }
        int childCount = getChildCount();
        int r2 = 0;
        int topInset = 0;
        while (true) {
            if (r2 >= childCount) {
                break;
            }
            View childAt = getChildAt(r2);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int r7 = dVar.f6597a;
            if ((r7 & 1) == 0) {
                break;
            }
            topInset += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            if (r2 == 0 && f0.R(childAt)) {
                topInset -= getTopInset();
            }
            if ((r7 & 2) != 0) {
                topInset -= f0.b0(childAt);
                break;
            }
            r2++;
        }
        int r02 = Math.max(0, topInset);
        this.e = r02;
        return r02;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean h() {
        return this.h;
    }

    boolean j() {
        return getTotalScrollRange() != 0;
    }

    public boolean l() {
        return this.o;
    }

    void m(int r4) {
        this.d = r4;
        if (!willNotDraw()) {
            f0.g1(this);
        }
        List<c> list = this.k;
        if (list != null) {
            int size = list.size();
            for (int r1 = 0; r1 < size; r1++) {
                c cVar = this.k.get(r1);
                if (cVar != null) {
                    cVar.a(this, r4);
                }
            }
        }
    }

    o0 n(o0 o0Var) {
        o0 o0Var2 = f0.R(this) ? o0Var : null;
        if (!b.i.o.e.a(this.j, o0Var2)) {
            this.j = o0Var2;
            B();
            requestLayout();
        }
        return o0Var;
    }

    public void o(@i0 c cVar) {
        List<c> list = this.k;
        if (list == null || cVar == null) {
            return;
        }
        list.remove(cVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int r4) {
        if (this.s == null) {
            this.s = new int[4];
        }
        int[] r0 = this.s;
        int[] r42 = super.onCreateDrawableState(r4 + r0.length);
        r0[0] = this.m ? a.c.state_liftable : -a.c.state_liftable;
        r0[1] = (this.m && this.n) ? a.c.state_lifted : -a.c.state_lifted;
        r0[2] = this.m ? a.c.state_collapsible : -a.c.state_collapsible;
        r0[3] = (this.m && this.n) ? a.c.state_collapsed : -a.c.state_collapsed;
        return LinearLayout.mergeDrawableStates(r42, r0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int r2, int r3, int r4, int r5) {
        super.onLayout(z2, r2, r3, r4, r5);
        boolean z3 = true;
        if (f0.R(this) && z()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                f0.Z0(getChildAt(childCount), topInset);
            }
        }
        k();
        this.h = false;
        int childCount2 = getChildCount();
        int r42 = 0;
        while (true) {
            if (r42 >= childCount2) {
                break;
            }
            if (((d) getChildAt(r42).getLayoutParams()).b() != null) {
                this.h = true;
                break;
            }
            r42++;
        }
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.l) {
            return;
        }
        if (!this.o && !i()) {
            z3 = false;
        }
        u(z3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r3, int r4) {
        super.onMeasure(r3, r4);
        int mode = View.MeasureSpec.getMode(r4);
        if (mode != 1073741824 && f0.R(this) && z()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = b.i.i.a.c(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(r4));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(e eVar) {
        o(eVar);
    }

    void q() {
        this.i = 0;
    }

    public void r(boolean z2, boolean z3) {
        s(z2, z3, true);
    }

    @Override // android.view.View
    @m0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        k.d(this, f);
    }

    public void setExpanded(boolean z2) {
        r(z2, f0.P0(this));
    }

    public void setLiftOnScroll(boolean z2) {
        this.o = z2;
    }

    public void setLiftOnScrollTargetViewId(@w int r1) {
        this.p = r1;
        c();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int r2) {
        if (r2 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(r2);
    }

    public void setStatusBarForeground(@i0 Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.t = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.t.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.t, f0.W(this));
                this.t.setVisible(getVisibility() == 0, false);
                this.t.setCallback(this);
            }
            B();
            f0.g1(this);
        }
    }

    public void setStatusBarForegroundColor(@androidx.annotation.k int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarForeground(new ColorDrawable(r2));
    }

    public void setStatusBarForegroundResource(@q int r2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarForeground(b.a.b.a.a.d(getContext(), r2));
    }

    @Deprecated
    public void setTargetElevation(float f) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            f.b(this, f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
        super.setVisibility(r3);
        boolean z2 = r3 == 0;
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
    }

    public boolean t(boolean z2) {
        this.l = true;
        return u(z2);
    }

    public boolean v(boolean z2) {
        return w(z2);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@h0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t;
    }

    boolean w(boolean z2) throws Resources.NotFoundException {
        if (this.n == z2) {
            return false;
        }
        this.n = z2;
        refreshDrawableState();
        if (!this.o || !(getBackground() instanceof j)) {
            return true;
        }
        A((j) getBackground(), z2);
        return true;
    }

    boolean y(@i0 View view) {
        View viewD = d(view);
        if (viewD != null) {
            view = viewD;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }
}
