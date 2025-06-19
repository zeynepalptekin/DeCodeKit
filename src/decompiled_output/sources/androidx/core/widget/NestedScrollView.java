package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.m;
import b.i.p.c0;
import b.i.p.f0;
import b.i.p.p0.d;
import b.i.p.r;
import b.i.p.t;
import b.i.p.v;
import b.i.p.x;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements v, r, c0 {
    static final int D = 250;
    static final float E = 0.5f;
    private static final String F = "NestedScrollView";
    private static final int G = 250;
    private static final int H = -1;
    private static final a I = new a();
    private static final int[] J = {R.attr.fillViewport};
    private final t A;
    private float B;
    private b C;
    private long d;
    private final Rect e;
    private OverScroller f;
    private EdgeEffect g;
    private EdgeEffect h;
    private int i;
    private boolean j;
    private boolean k;
    private View l;
    private boolean m;
    private VelocityTracker n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final int[] u;
    private final int[] v;
    private int w;
    private int x;
    private c y;
    private final x z;

    static class a extends b.i.p.a {
        a() {
        }

        @Override // b.i.p.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            b.i.p.p0.f.N(accessibilityEvent, nestedScrollView.getScrollX());
            b.i.p.p0.f.P(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // b.i.p.a
        public void g(View view, b.i.p.p0.d dVar) {
            int scrollRange;
            super.g(view, dVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.T0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            dVar.C1(true);
            if (nestedScrollView.getScrollY() > 0) {
                dVar.b(d.a.s);
                dVar.b(d.a.D);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                dVar.b(d.a.r);
                dVar.b(d.a.F);
            }
        }

        @Override // b.i.p.a
        public boolean j(View view, int r4, Bundle bundle) {
            if (super.j(view, r4, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (r4 != 4096) {
                if (r4 == 8192 || r4 == 16908344) {
                    int r42 = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (r42 == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, r42, true);
                    return true;
                }
                if (r4 != 16908346) {
                    return false;
                }
            }
            int r43 = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (r43 == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, r43, true);
            return true;
        }
    }

    public interface b {
        void a(NestedScrollView nestedScrollView, int r2, int r3, int r4, int r5);
    }

    static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public int d;

        class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int r1) {
                return new c[r1];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.d = parcel.readInt();
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        @h0
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.d + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r2) {
            super.writeToParcel(parcel, r2);
            parcel.writeInt(this.d);
        }
    }

    public NestedScrollView(@h0 Context context) {
        this(context, null);
    }

    public NestedScrollView(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(@h0 Context context, @i0 AttributeSet attributeSet, int r7) {
        super(context, attributeSet, r7);
        this.e = new Rect();
        this.j = true;
        this.k = false;
        this.l = null;
        this.m = false;
        this.p = true;
        this.t = -1;
        this.u = new int[2];
        this.v = new int[2];
        A();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J, r7, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.z = new x(this);
        this.A = new t(this);
        setNestedScrollingEnabled(true);
        f0.u1(this, I);
    }

    private void A() {
        this.f = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.q = viewConfiguration.getScaledTouchSlop();
        this.r = viewConfiguration.getScaledMinimumFlingVelocity();
        this.s = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
    }

    private boolean D(View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private boolean G(View view, int r3, int r4) {
        view.getDrawingRect(this.e);
        offsetDescendantRectToMyCoords(view, this.e);
        return this.e.bottom + r3 >= getScrollY() && this.e.top - r3 <= getScrollY() + r4;
    }

    private void H(int r11, int r12, @i0 int[] r13) {
        int scrollY = getScrollY();
        scrollBy(0, r11);
        int scrollY2 = getScrollY() - scrollY;
        if (r13 != null) {
            r13[1] = r13[1] + scrollY2;
        }
        this.A.e(0, scrollY2, 0, r11 - scrollY2, null, r12, r13);
    }

    private void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.t) {
            int r0 = actionIndex == 0 ? 1 : 0;
            this.i = (int) motionEvent.getY(r0);
            this.t = motionEvent.getPointerId(r0);
            VelocityTracker velocityTracker = this.n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void L() {
        VelocityTracker velocityTracker = this.n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.n = null;
        }
    }

    private void M(boolean z) {
        if (z) {
            e(2, 1);
        } else {
            g(1);
        }
        this.x = getScrollY();
        f0.g1(this);
    }

    private boolean N(int r7, int r8, int r9) {
        int height = getHeight();
        int scrollY = getScrollY();
        int r0 = height + scrollY;
        boolean z = false;
        boolean z2 = r7 == 33;
        View viewV = v(z2, r8, r9);
        if (viewV == null) {
            viewV = this;
        }
        if (r8 < scrollY || r9 > r0) {
            o(z2 ? r8 - scrollY : r9 - r0);
            z = true;
        }
        if (viewV != findFocus()) {
            viewV.requestFocus(r7);
        }
        return z;
    }

    private void O(View view) {
        view.getDrawingRect(this.e);
        offsetDescendantRectToMyCoords(view, this.e);
        int r2 = n(this.e);
        if (r2 != 0) {
            scrollBy(0, r2);
        }
    }

    private boolean P(Rect rect, boolean z) {
        int r3 = n(rect);
        boolean z2 = r3 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, r3);
            } else {
                Q(0, r3);
            }
        }
        return z2;
    }

    private void S(int r9, int r10, int r11, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.d > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(r10 + scrollY, Math.max(0, height - height2))) - scrollY, r11);
            M(z);
        } else {
            if (!this.f.isFinished()) {
                c();
            }
            scrollBy(r9, r10);
        }
        this.d = AnimationUtils.currentAnimationTimeMillis();
    }

    private void c() {
        this.f.abortAnimation();
        g(1);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.B == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.B = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.B;
    }

    private boolean i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int j(int r1, int r2, int r3) {
        if (r2 >= r3 || r1 < 0) {
            return 0;
        }
        return r2 + r1 > r3 ? r3 - r2 : r1;
    }

    private void o(int r3) {
        if (r3 != 0) {
            if (this.p) {
                Q(0, r3);
            } else {
                scrollBy(0, r3);
            }
        }
    }

    private void p() {
        this.m = false;
        L();
        g(0);
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.h.onRelease();
        }
    }

    private void q() {
        if (getOverScrollMode() == 2) {
            this.g = null;
            this.h = null;
        } else if (this.g == null) {
            Context context = getContext();
            this.g = new EdgeEffect(context);
            this.h = new EdgeEffect(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View v(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            r9 = 1
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            if (r3 != 0) goto L2e
            r3 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r3.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r3.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = 1
            goto L41
        L40:
            r7 = 0
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r3 = r6
            r5 = 1
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r3 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.v(boolean, int, int):android.view.View");
    }

    private boolean y(int r5, int r6) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return r6 >= childAt.getTop() - scrollY && r6 < childAt.getBottom() - scrollY && r5 >= childAt.getLeft() && r5 < childAt.getRight();
    }

    private void z() {
        VelocityTracker velocityTracker = this.n;
        if (velocityTracker == null) {
            this.n = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public boolean C() {
        return this.o;
    }

    public boolean E() {
        return this.p;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean J(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.b(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.J(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean K(int r5) {
        boolean z = r5 == 130;
        int height = getHeight();
        if (z) {
            this.e.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.e;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.e.top = getScrollY() - height;
            Rect rect2 = this.e;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.e;
        int r1 = rect3.top;
        int r3 = height + r1;
        rect3.bottom = r3;
        return N(r5, r1, r3);
    }

    public final void Q(int r3, int r4) {
        S(r3, r4, m.f.f720c, false);
    }

    public final void R(int r2, int r3, int r4) {
        S(r2, r3, r4, false);
    }

    public final void T(int r3, int r4) {
        V(r3, r4, m.f.f720c, false);
    }

    public final void U(int r2, int r3, int r4) {
        V(r2, r3, r4, false);
    }

    void V(int r2, int r3, int r4, boolean z) {
        S(r2 - getScrollX(), r3 - getScrollY(), r4, z);
    }

    void W(int r2, int r3, boolean z) {
        V(r2, r3, m.f.f720c, z);
    }

    @Override // b.i.p.q
    public boolean a(int r8, int r9, int r10, int r11, int[] r12, int r13) {
        return this.A.g(r8, r9, r10, r11, r12, r13);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int r3) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, r3);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int r3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, r3, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // b.i.p.q
    public boolean b(int r2) {
        return this.A.l(r2);
    }

    @Override // android.view.View, b.i.p.c0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, b.i.p.c0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, b.i.p.c0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f.isFinished()) {
            return;
        }
        this.f.computeScrollOffset();
        int currY = this.f.getCurrY();
        int r6 = currY - this.x;
        this.x = currY;
        int[] r3 = this.v;
        boolean z = false;
        r3[1] = 0;
        d(0, r6, r3, null, 1);
        int r13 = r6 - this.v[1];
        int scrollRange = getScrollRange();
        if (r13 != 0) {
            int scrollY = getScrollY();
            J(0, r13, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int r132 = r13 - scrollY2;
            int[] r7 = this.v;
            r7[1] = 0;
            f(0, scrollY2, 0, r132, this.u, 1, r7);
            r13 = r132 - this.v[1];
        }
        if (r13 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                q();
                if (r13 < 0) {
                    if (this.g.isFinished()) {
                        edgeEffect = this.g;
                        edgeEffect.onAbsorb((int) this.f.getCurrVelocity());
                    }
                } else if (this.h.isFinished()) {
                    edgeEffect = this.h;
                    edgeEffect.onAbsorb((int) this.f.getCurrVelocity());
                }
            }
            c();
        }
        if (this.f.isFinished()) {
            g(1);
        } else {
            f0.g1(this);
        }
    }

    @Override // android.view.View, b.i.p.c0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, b.i.p.c0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, b.i.p.c0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int r0 = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > r0 ? bottom + (scrollY - r0) : bottom;
    }

    @Override // b.i.p.q
    public boolean d(int r7, int r8, int[] r9, int[] r10, int r11) {
        return this.A.d(r7, r8, r9, r10, r11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || u(keyEvent);
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A.a(f, f2, z);
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A.b(f, f2);
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return d(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View, b.i.p.s
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
        return this.A.f(r7, r8, r9, r10, r11);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.g != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.g.isFinished()) {
                int r1 = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int paddingTop = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    paddingTop += getPaddingTop();
                }
                canvas.translate(paddingLeft, paddingTop);
                this.g.setSize(width, height);
                if (this.g.draw(canvas)) {
                    f0.g1(this);
                }
                canvas.restoreToCount(r1);
            }
            if (this.h.isFinished()) {
                return;
            }
            int r12 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int paddingBottom = Math.max(getScrollRange(), scrollY) + height2;
            if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                paddingBottom -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, paddingBottom);
            canvas.rotate(180.0f, width2, 0.0f);
            this.h.setSize(width2, height2);
            if (this.h.draw(canvas)) {
                f0.g1(this);
            }
            canvas.restoreToCount(r12);
        }
    }

    @Override // b.i.p.q
    public boolean e(int r2, int r3) {
        return this.A.s(r2, r3);
    }

    @Override // b.i.p.r
    public void f(int r9, int r10, int r11, int r12, @i0 int[] r13, int r14, @h0 int[] r15) {
        this.A.e(r9, r10, r11, r12, r13, r14, r15);
    }

    @Override // b.i.p.q
    public void g(int r2) {
        this.A.u(r2);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * E);
    }

    @Override // android.view.ViewGroup, b.i.p.w
    public int getNestedScrollAxes() {
        return this.z.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public boolean h(int r8) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, r8);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (r8 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (r8 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (r8 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            o(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.e);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.e);
            o(n(this.e));
            viewFindNextFocus.requestFocus(r8);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !D(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View, b.i.p.s
    public boolean hasNestedScrollingParent() {
        return b(0);
    }

    @Override // android.view.View, b.i.p.s
    public boolean isNestedScrollingEnabled() {
        return this.A.m();
    }

    @Override // b.i.p.u
    public void k(@h0 View view, @h0 View view2, int r4, int r5) {
        this.z.c(view, view2, r4, r5);
        e(2, r5);
    }

    @Override // b.i.p.u
    public void l(@h0 View view, int r3) {
        this.z.e(view, r3);
        g(r3);
    }

    @Override // b.i.p.u
    public void m(@h0 View view, int r8, int r9, @h0 int[] r10, int r11) {
        d(r8, r9, r10, null, r11);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int r4, int r5) {
        view.measure(FrameLayout.getChildMeasureSpec(r4, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int r3, int r4, int r5, int r6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(r3, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + r4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    protected int n(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int r3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int r4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? r3 - verticalFadingEdgeLength : r3;
        if (rect.bottom > r4 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - r4) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - r3);
        }
        if (rect.top >= scrollY || rect.bottom >= r4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (r4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.m) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int r4 = scrollY - verticalScrollFactorCompat;
                if (r4 < 0) {
                    scrollRange = 0;
                } else if (r4 <= scrollRange) {
                    scrollRange = r4;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto Ld
            boolean r3 = r11.m
            if (r3 == 0) goto Ld
            return r2
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto La2
            r4 = -1
            if (r0 == r2) goto L7d
            if (r0 == r1) goto L24
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 6
            if (r0 == r1) goto L1f
            goto Ld9
        L1f:
            r11.I(r12)
            goto Ld9
        L24:
            int r0 = r11.t
            if (r0 != r4) goto L2a
            goto Ld9
        L2a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L4d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto Ld9
        L4d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.i
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.q
            if (r4 <= r5) goto Ld9
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto Ld9
            r11.m = r2
            r11.i = r0
            r11.B()
            android.view.VelocityTracker r0 = r11.n
            r0.addMovement(r12)
            r11.w = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto Ld9
            r12.requestDisallowInterceptTouchEvent(r2)
            goto Ld9
        L7d:
            r11.m = r3
            r11.t = r4
            r11.L()
            android.widget.OverScroller r4 = r11.f
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L9e
            b.i.p.f0.g1(r11)
        L9e:
            r11.g(r3)
            goto Ld9
        La2:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            boolean r4 = r11.y(r4, r0)
            if (r4 != 0) goto Lb8
            r11.m = r3
            r11.L()
            goto Ld9
        Lb8:
            r11.i = r0
            int r0 = r12.getPointerId(r3)
            r11.t = r0
            r11.z()
            android.view.VelocityTracker r0 = r11.n
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.f
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.f
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.m = r12
            r11.e(r1, r3)
        Ld9:
            boolean r12 = r11.m
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r3, int r4, int r5, int r6) {
        super.onLayout(z, r3, r4, r5, r6);
        int measuredHeight = 0;
        this.j = false;
        View view = this.l;
        if (view != null && F(view, this)) {
            O(this.l);
        }
        this.l = null;
        if (!this.k) {
            if (this.y != null) {
                scrollTo(getScrollX(), this.y.d);
                this.y = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((r6 - r4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int r2 = j(scrollY, paddingTop, measuredHeight);
            if (r2 != scrollY) {
                scrollTo(getScrollX(), r2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.k = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r5, int r6) {
        super.onMeasure(r5, r6);
        if (this.o && View.MeasureSpec.getMode(r6) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(r5, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onNestedFling(@h0 View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        w((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onNestedPreFling(@h0 View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedPreScroll(@h0 View view, int r8, int r9, @h0 int[] r10) {
        m(view, r8, r9, r10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedScroll(@h0 View view, int r2, int r3, int r4, int r5) {
        H(r5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onNestedScrollAccepted(@h0 View view, @h0 View view2, int r4) {
        k(view, view2, r4, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int r1, int r2, boolean z, boolean z2) {
        super.scrollTo(r1, r2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r4, Rect rect) {
        if (r4 == 2) {
            r4 = 130;
        } else if (r4 == 1) {
            r4 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, r4) : focusFinder.findNextFocusFromRect(this, rect, r4);
        if (viewFindNextFocus == null || D(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(r4, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.y = cVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.d = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int r7, int r8, int r9, int r10) {
        super.onScrollChanged(r7, r8, r9, r10);
        b bVar = this.C;
        if (bVar != null) {
            bVar.a(this, r7, r8, r9, r10);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !G(viewFindFocus, 0, r4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.e);
        offsetDescendantRectToMyCoords(viewFindFocus, this.e);
        o(n(this.e));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public boolean onStartNestedScroll(@h0 View view, @h0 View view2, int r4) {
        return t(view, view2, r4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.i.p.w
    public void onStopNestedScroll(@h0 View view) {
        l(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // b.i.p.v
    public void r(@h0 View view, int r2, int r3, int r4, int r5, int r6, @h0 int[] r7) {
        H(r5, r6, r7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.j) {
            this.l = view2;
        } else {
            O(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return P(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.j = true;
        super.requestLayout();
    }

    @Override // b.i.p.u
    public void s(@h0 View view, int r2, int r3, int r4, int r5, int r6) {
        H(r5, r6, null);
    }

    @Override // android.view.View
    public void scrollTo(int r7, int r8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int r72 = j(r7, width, width2);
            int r82 = j(r8, height, height2);
            if (r72 == getScrollX() && r82 == getScrollY()) {
                return;
            }
            super.scrollTo(r72, r82);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.o) {
            this.o = z;
            requestLayout();
        }
    }

    @Override // android.view.View, b.i.p.s
    public void setNestedScrollingEnabled(boolean z) {
        this.A.p(z);
    }

    public void setOnScrollChangeListener(@i0 b bVar) {
        this.C = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.p = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View, b.i.p.s
    public boolean startNestedScroll(int r2) {
        return e(r2, 0);
    }

    @Override // android.view.View, b.i.p.s
    public void stopNestedScroll() {
        g(0);
    }

    @Override // b.i.p.u
    public boolean t(@h0 View view, @h0 View view2, int r3, int r4) {
        return (r3 & 2) != 0;
    }

    public boolean u(@h0 KeyEvent keyEvent) {
        this.e.setEmpty();
        if (!i()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? h(33) : x(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? h(130) : x(130);
        }
        if (keyCode != 62) {
            return false;
        }
        K(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    public void w(int r13) {
        if (getChildCount() > 0) {
            this.f.fling(getScrollX(), getScrollY(), 0, r13, 0, 0, Integer.MIN_VALUE, ActivityChooserView.f.j, 0, 0);
            M(true);
        }
    }

    public boolean x(int r6) {
        int childCount;
        boolean z = r6 == 130;
        int height = getHeight();
        Rect rect = this.e;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.e.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.e;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.e;
        return N(r6, rect3.top, rect3.bottom);
    }
}
