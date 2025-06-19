package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.c0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.s0;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.c1;
import androidx.viewpager.widget.ViewPager;
import b.a.a;
import b.i.o.h;
import b.i.p.a0;
import b.i.p.f0;
import b.i.p.p0.d;
import c.a.b.c.a;
import com.google.android.material.internal.s;
import com.google.android.material.internal.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.e
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    @p(unit = 0)
    private static final int S = 72;

    @p(unit = 0)
    static final int T = 8;

    @p(unit = 0)
    private static final int U = 48;

    @p(unit = 0)
    private static final int V = 56;

    @p(unit = 0)
    private static final int W = 24;

    @p(unit = 0)
    static final int a0 = 16;
    private static final int b0 = -1;
    private static final int c0 = 300;
    private static final String e0 = "TabLayout";
    public static final int f0 = 0;
    public static final int g0 = 1;
    public static final int h0 = 2;
    public static final int i0 = 0;
    public static final int j0 = 1;
    public static final int k0 = 0;
    public static final int l0 = 1;
    public static final int m0 = 2;
    public static final int n0 = 0;
    public static final int o0 = 1;
    public static final int p0 = 2;
    public static final int q0 = 3;
    int A;
    int B;
    int C;
    boolean D;
    boolean E;
    boolean F;

    @i0
    private c G;
    private final ArrayList<c> H;

    @i0
    private c I;
    private ValueAnimator J;

    @i0
    ViewPager K;

    @i0
    private androidx.viewpager.widget.a L;
    private DataSetObserver M;
    private l N;
    private b O;
    private boolean P;
    private final h.a<m> Q;
    private final ArrayList<i> d;

    @i0
    private i e;
    private final RectF f;

    @h0
    final h g;
    int h;
    int i;
    int j;
    int k;
    int l;
    ColorStateList m;
    ColorStateList n;
    ColorStateList o;

    @i0
    Drawable p;
    PorterDuff.Mode q;
    float r;
    float s;
    final int t;
    int u;
    private final int v;
    private final int w;
    private final int x;
    private int y;
    int z;
    private static final int R = a.n.Widget_Design_TabLayout;
    private static final h.a<i> d0 = new h.c(16);

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6800a;

        b() {
        }

        void a(boolean z) {
            this.f6800a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(@h0 ViewPager viewPager, @i0 androidx.viewpager.widget.a aVar, @i0 androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.K == viewPager) {
                tabLayout.N(aVar2, this.f6800a);
            }
        }
    }

    @Deprecated
    public interface c<T extends i> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface e {
    }

    public interface f extends c<i> {
    }

    private class g extends DataSetObserver {
        g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.D();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.D();
        }
    }

    class h extends LinearLayout {
        private int d;

        @h0
        private final Paint e;

        @h0
        private final GradientDrawable f;
        int g;
        float h;
        private int i;
        int j;
        int k;
        ValueAnimator l;
        private int m;
        private int n;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f6803a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f6804b;

            a(int r2, int r3) {
                this.f6803a = r2;
                this.f6804b = r3;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                h hVar = h.this;
                hVar.g(c.a.b.c.b.a.b(hVar.m, this.f6803a, animatedFraction), c.a.b.c.b.a.b(h.this.n, this.f6804b, animatedFraction));
            }
        }

        class b extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f6806a;

            b(int r2) {
                this.f6806a = r2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                h hVar = h.this;
                hVar.g = this.f6806a;
                hVar.h = 0.0f;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                h.this.g = this.f6806a;
            }
        }

        h(Context context) {
            super(context);
            this.g = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.m = -1;
            this.n = -1;
            setWillNotDraw(false);
            this.e = new Paint();
            this.f = new GradientDrawable();
        }

        private void d(@h0 m mVar, @h0 RectF rectF) {
            int contentWidth = mVar.getContentWidth();
            int r1 = (int) z.d(getContext(), 24);
            if (contentWidth < r1) {
                contentWidth = r1;
            }
            int left = (mVar.getLeft() + mVar.getRight()) / 2;
            int r0 = contentWidth / 2;
            rectF.set(left - r0, 0.0f, left + r0, 0.0f);
        }

        private void k() {
            int left;
            int right;
            View childAt = getChildAt(this.g);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft();
                right = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.E && (childAt instanceof m)) {
                    d((m) childAt, tabLayout.f);
                    left = (int) TabLayout.this.f.left;
                    right = (int) TabLayout.this.f.right;
                }
                if (this.h > 0.0f && this.g < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.g + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.E && (childAt2 instanceof m)) {
                        d((m) childAt2, tabLayout2.f);
                        left2 = (int) TabLayout.this.f.left;
                        right2 = (int) TabLayout.this.f.right;
                    }
                    float f = this.h;
                    left = (int) ((left2 * f) + ((1.0f - f) * left));
                    right = (int) ((right2 * f) + ((1.0f - f) * right));
                }
            }
            g(left, right);
        }

        private void l(boolean z, int r7, int r8) {
            View childAt = getChildAt(r7);
            if (childAt == null) {
                k();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.E && (childAt instanceof m)) {
                d((m) childAt, tabLayout.f);
                left = (int) TabLayout.this.f.left;
                right = (int) TabLayout.this.f.right;
            }
            int r0 = this.j;
            int r3 = this.k;
            if (r0 == left && r3 == right) {
                return;
            }
            if (z) {
                this.m = r0;
                this.n = r3;
            }
            a aVar = new a(left, right);
            if (!z) {
                this.l.removeAllUpdateListeners();
                this.l.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.l = valueAnimator;
            valueAnimator.setInterpolator(c.a.b.c.b.a.f1936b);
            valueAnimator.setDuration(r8);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(r7));
            valueAnimator.start();
        }

        void c(int r2, int r3) {
            ValueAnimator valueAnimator = this.l;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.l.cancel();
            }
            l(true, r2, r3);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void draw(@androidx.annotation.h0 android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.p
                r1 = 0
                if (r0 == 0) goto Lc
                int r0 = r0.getIntrinsicHeight()
                goto Ld
            Lc:
                r0 = 0
            Ld:
                int r2 = r5.d
                if (r2 < 0) goto L12
                r0 = r2
            L12:
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.B
                if (r2 == 0) goto L31
                r3 = 1
                r4 = 2
                if (r2 == r3) goto L23
                if (r2 == r4) goto L3a
                r0 = 3
                if (r2 == r0) goto L36
                r0 = 0
                goto L3a
            L23:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r1 = r1 / r4
                int r2 = r5.getHeight()
                int r2 = r2 + r0
                int r0 = r2 / 2
                goto L3a
            L31:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
            L36:
                int r0 = r5.getHeight()
            L3a:
                int r2 = r5.j
                if (r2 < 0) goto L74
                int r3 = r5.k
                if (r3 <= r2) goto L74
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r2 = r2.p
                if (r2 == 0) goto L49
                goto L4b
            L49:
                android.graphics.drawable.GradientDrawable r2 = r5.f
            L4b:
                android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.a.r(r2)
                android.graphics.drawable.Drawable r2 = r2.mutate()
                int r3 = r5.j
                int r4 = r5.k
                r2.setBounds(r3, r1, r4, r0)
                android.graphics.Paint r0 = r5.e
                if (r0 == 0) goto L71
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                int r0 = r0.getColor()
                if (r1 != r3) goto L6e
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
                r2.setColorFilter(r0, r1)
                goto L71
            L6e:
                androidx.core.graphics.drawable.a.n(r2, r0)
            L71:
                r2.draw(r6)
            L74:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h.draw(android.graphics.Canvas):void");
        }

        boolean e() {
            int childCount = getChildCount();
            for (int r2 = 0; r2 < childCount; r2++) {
                if (getChildAt(r2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        float f() {
            return this.g + this.h;
        }

        void g(int r2, int r3) {
            if (r2 == this.j && r3 == this.k) {
                return;
            }
            this.j = r2;
            this.k = r3;
            f0.g1(this);
        }

        void h(int r2, float f) {
            ValueAnimator valueAnimator = this.l;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.l.cancel();
            }
            this.g = r2;
            this.h = f;
            k();
        }

        void i(int r2) {
            if (this.e.getColor() != r2) {
                this.e.setColor(r2);
                f0.g1(this);
            }
        }

        void j(int r2) {
            if (this.d != r2) {
                this.d = r2;
                f0.g1(this);
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int r2, int r3, int r4, int r5) {
            super.onLayout(z, r2, r3, r4, r5);
            ValueAnimator valueAnimator = this.l;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                k();
            } else {
                l(false, this.g, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int r9, int r10) {
            super.onMeasure(r9, r10);
            if (View.MeasureSpec.getMode(r9) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.z == 1 || tabLayout.C == 2) {
                int childCount = getChildCount();
                int r5 = 0;
                for (int r4 = 0; r4 < childCount; r4++) {
                    View childAt = getChildAt(r4);
                    if (childAt.getVisibility() == 0) {
                        r5 = Math.max(r5, childAt.getMeasuredWidth());
                    }
                }
                if (r5 <= 0) {
                    return;
                }
                if (r5 * childCount <= getMeasuredWidth() - (((int) z.d(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int r1 = 0; r1 < childCount; r1++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(r1).getLayoutParams();
                        if (layoutParams.width != r5 || layoutParams.weight != 0.0f) {
                            layoutParams.width = r5;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.z = 0;
                    tabLayout2.V(false);
                }
                if (z) {
                    super.onMeasure(r9, r10);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int r3) {
            super.onRtlPropertiesChanged(r3);
            if (Build.VERSION.SDK_INT >= 23 || this.i == r3) {
                return;
            }
            requestLayout();
            this.i = r3;
        }
    }

    public static class i {
        public static final int j = -1;

        /* renamed from: a, reason: collision with root package name */
        @i0
        private Object f6808a;

        /* renamed from: b, reason: collision with root package name */
        @i0
        private Drawable f6809b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        private CharSequence f6810c;

        @i0
        private CharSequence d;

        @i0
        private View f;

        @i0
        public TabLayout h;

        @h0
        public m i;
        private int e = -1;

        @d
        private int g = 1;

        @h0
        public i A(@i0 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                this.i.setContentDescription(charSequence);
            }
            this.f6810c = charSequence;
            B();
            return this;
        }

        void B() {
            m mVar = this.i;
            if (mVar != null) {
                mVar.y();
            }
        }

        @i0
        public c.a.b.c.c.a d() {
            return this.i.getBadge();
        }

        @i0
        public CharSequence e() {
            m mVar = this.i;
            if (mVar == null) {
                return null;
            }
            return mVar.getContentDescription();
        }

        @i0
        public View f() {
            return this.f;
        }

        @i0
        public Drawable g() {
            return this.f6809b;
        }

        @h0
        public c.a.b.c.c.a h() {
            return this.i.getOrCreateBadge();
        }

        public int i() {
            return this.e;
        }

        @d
        public int j() {
            return this.g;
        }

        @i0
        public Object k() {
            return this.f6808a;
        }

        @i0
        public CharSequence l() {
            return this.f6810c;
        }

        public boolean m() {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void n() {
            this.i.s();
        }

        void o() {
            this.h = null;
            this.i = null;
            this.f6808a = null;
            this.f6809b = null;
            this.f6810c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }

        public void p() {
            TabLayout tabLayout = this.h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.L(this);
        }

        @h0
        public i q(@s0 int r2) {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                return r(tabLayout.getResources().getText(r2));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @h0
        public i r(@i0 CharSequence charSequence) {
            this.d = charSequence;
            B();
            return this;
        }

        @h0
        public i s(@c0 int r4) {
            return t(LayoutInflater.from(this.i.getContext()).inflate(r4, (ViewGroup) this.i, false));
        }

        @h0
        public i t(@i0 View view) {
            this.f = view;
            B();
            return this;
        }

        @h0
        public i u(@q int r2) {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                return v(b.a.b.a.a.d(tabLayout.getContext(), r2));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @h0
        public i v(@i0 Drawable drawable) {
            this.f6809b = drawable;
            TabLayout tabLayout = this.h;
            if (tabLayout.z == 1 || tabLayout.C == 2) {
                this.h.V(true);
            }
            B();
            if (c.a.b.c.c.b.f1955a && this.i.p() && this.i.h.isVisible()) {
                this.i.invalidate();
            }
            return this;
        }

        void w(int r1) {
            this.e = r1;
        }

        @h0
        public i x(@d int r3) {
            this.g = r3;
            TabLayout tabLayout = this.h;
            if (tabLayout.z == 1 || tabLayout.C == 2) {
                this.h.V(true);
            }
            B();
            if (c.a.b.c.c.b.f1955a && this.i.p() && this.i.h.isVisible()) {
                this.i.invalidate();
            }
            return this;
        }

        @h0
        public i y(@i0 Object obj) {
            this.f6808a = obj;
            return this;
        }

        @h0
        public i z(@s0 int r2) {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                return A(tabLayout.getResources().getText(r2));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface j {
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface k {
    }

    public static class l implements ViewPager.j {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final WeakReference<TabLayout> f6811a;

        /* renamed from: b, reason: collision with root package name */
        private int f6812b;

        /* renamed from: c, reason: collision with root package name */
        private int f6813c;

        public l(TabLayout tabLayout) {
            this.f6811a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int r6, float f, int r8) {
            TabLayout tabLayout = this.f6811a.get();
            if (tabLayout != null) {
                tabLayout.P(r6, f, this.f6813c != 2 || this.f6812b == 1, (this.f6813c == 2 && this.f6812b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int r2) {
            this.f6812b = this.f6813c;
            this.f6813c = r2;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int r4) {
            TabLayout tabLayout = this.f6811a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == r4 || r4 >= tabLayout.getTabCount()) {
                return;
            }
            int r1 = this.f6813c;
            tabLayout.M(tabLayout.y(r4), r1 == 0 || (r1 == 2 && this.f6812b == 0));
        }

        void d() {
            this.f6813c = 0;
            this.f6812b = 0;
        }
    }

    public final class m extends LinearLayout {
        private i d;
        private TextView e;
        private ImageView f;

        @i0
        private View g;

        @i0
        private c.a.b.c.c.a h;

        @i0
        private View i;

        @i0
        private TextView j;

        @i0
        private ImageView k;

        @i0
        private Drawable l;
        private int m;

        class a implements View.OnLayoutChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f6814a;

            a(View view) {
                this.f6814a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                if (this.f6814a.getVisibility() == 0) {
                    m.this.x(this.f6814a);
                }
            }
        }

        public m(@h0 Context context) {
            super(context);
            this.m = 2;
            z(context);
            f0.V1(this, TabLayout.this.h, TabLayout.this.i, TabLayout.this.j, TabLayout.this.k);
            setGravity(17);
            setOrientation(!TabLayout.this.D ? 1 : 0);
            setClickable(true);
            f0.Y1(this, a0.c(getContext(), a0.e));
        }

        private void B(@i0 TextView textView, @i0 ImageView imageView) {
            i iVar = this.d;
            Drawable drawableMutate = (iVar == null || iVar.g() == null) ? null : androidx.core.graphics.drawable.a.r(this.d.g()).mutate();
            i iVar2 = this.d;
            CharSequence charSequenceL = iVar2 != null ? iVar2.l() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceL);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequenceL);
                    if (this.d.g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int r2 = (z && imageView.getVisibility() == 0) ? (int) z.d(getContext(), 8) : 0;
                if (TabLayout.this.D) {
                    if (r2 != b.i.p.m.b(marginLayoutParams)) {
                        b.i.p.m.g(marginLayoutParams, r2);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (r2 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = r2;
                    b.i.p.m.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            i iVar3 = this.d;
            c1.a(this, z ? null : iVar3 != null ? iVar3.d : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @i0
        public c.a.b.c.c.a getBadge() {
            return this.h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.e, this.f, this.i};
            int r2 = 0;
            int r5 = 0;
            boolean z = false;
            for (int r3 = 0; r3 < 3; r3++) {
                View view = viewArr[r3];
                if (view != null && view.getVisibility() == 0) {
                    r5 = z ? Math.min(r5, view.getLeft()) : view.getLeft();
                    r2 = z ? Math.max(r2, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return r2 - r5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @h0
        public c.a.b.c.c.a getOrCreateBadge() {
            if (this.h == null) {
                this.h = c.a.b.c.c.a.d(getContext());
            }
            w();
            c.a.b.c.c.a aVar = this.h;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private void j(@i0 View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float k(@h0 Layout layout, int r2, float f) {
            return layout.getLineWidth(r2) * (f / layout.getPaint().getTextSize());
        }

        private void l(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        @h0
        private FrameLayout m() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(@h0 Canvas canvas) {
            Drawable drawable = this.l;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.l.draw(canvas);
            }
        }

        @i0
        private FrameLayout o(@h0 View view) {
            if ((view == this.f || view == this.e) && c.a.b.c.c.b.f1955a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p() {
            return this.h != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void q() {
            FrameLayout frameLayoutM;
            if (c.a.b.c.c.b.f1955a) {
                frameLayoutM = m();
                addView(frameLayoutM, 0);
            } else {
                frameLayoutM = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(a.k.design_layout_tab_icon, (ViewGroup) frameLayoutM, false);
            this.f = imageView;
            frameLayoutM.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void r() {
            FrameLayout frameLayoutM;
            if (c.a.b.c.c.b.f1955a) {
                frameLayoutM = m();
                addView(frameLayoutM);
            } else {
                frameLayoutM = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(a.k.design_layout_tab_text, (ViewGroup) frameLayoutM, false);
            this.e = textView;
            frameLayoutM.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s() {
            if (this.g != null) {
                v();
            }
            this.h = null;
        }

        private void u(@i0 View view) {
            if (p() && view != null) {
                l(false);
                c.a.b.c.c.b.a(this.h, view, o(view));
                this.g = view;
            }
        }

        private void v() {
            if (p()) {
                l(true);
                View view = this.g;
                if (view != null) {
                    c.a.b.c.c.b.d(this.h, view, o(view));
                    this.g = null;
                }
            }
        }

        private void w() {
            i iVar;
            View view;
            View view2;
            i iVar2;
            if (p()) {
                if (this.i == null) {
                    if (this.f != null && (iVar2 = this.d) != null && iVar2.g() != null) {
                        View view3 = this.g;
                        view = this.f;
                        if (view3 != view) {
                            v();
                            view2 = this.f;
                            u(view2);
                            return;
                        }
                        x(view);
                        return;
                    }
                    if (this.e != null && (iVar = this.d) != null && iVar.j() == 1) {
                        View view4 = this.g;
                        view = this.e;
                        if (view4 != view) {
                            v();
                            view2 = this.e;
                            u(view2);
                            return;
                        }
                        x(view);
                        return;
                    }
                }
                v();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x(@h0 View view) {
            if (p() && view == this.g) {
                c.a.b.c.c.b.e(this.h, view, o(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        public void z(Context context) {
            int r0 = TabLayout.this.t;
            if (r0 != 0) {
                Drawable drawableD = b.a.b.a.a.d(context, r0);
                this.l = drawableD;
                if (drawableD != null && drawableD.isStateful()) {
                    this.l.setState(getDrawableState());
                }
            } else {
                this.l = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.o != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = c.a.b.c.s.b.a(TabLayout.this.o);
                if (Build.VERSION.SDK_INT >= 21) {
                    if (TabLayout.this.F) {
                        gradientDrawable = null;
                    }
                    gradientDrawable = new RippleDrawable(colorStateListA, gradientDrawable, TabLayout.this.F ? null : gradientDrawable2);
                } else {
                    Drawable drawableR = androidx.core.graphics.drawable.a.r(gradientDrawable2);
                    androidx.core.graphics.drawable.a.o(drawableR, colorStateListA);
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, drawableR});
                }
            }
            f0.B1(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        final void A() {
            TextView textView;
            ImageView imageView;
            setOrientation(!TabLayout.this.D ? 1 : 0);
            if (this.j == null && this.k == null) {
                textView = this.e;
                imageView = this.f;
            } else {
                textView = this.j;
                imageView = this.k;
            }
            B(textView, imageView);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.l;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.l.setState(drawableState);
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        @i0
        public i getTab() {
            return this.d;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@h0 AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            c.a.b.c.c.a aVar = this.h;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.h.m()));
            }
            b.i.p.p0.d dVarT1 = b.i.p.p0.d.T1(accessibilityNodeInfo);
            dVarT1.W0(d.c.h(0, 1, this.d.i(), 1, false, isSelected()));
            if (isSelected()) {
                dVarT1.U0(false);
                dVarT1.I0(d.a.j);
            }
            dVarT1.A1("Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r8, int r9) {
            Layout layout;
            int size = View.MeasureSpec.getSize(r8);
            int mode = View.MeasureSpec.getMode(r8);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                r8 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.u, Integer.MIN_VALUE);
            }
            super.onMeasure(r8, r9);
            if (this.e != null) {
                float f = TabLayout.this.r;
                int r1 = this.m;
                ImageView imageView = this.f;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.e;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.s;
                    }
                } else {
                    r1 = 1;
                }
                float textSize = this.e.getTextSize();
                int lineCount = this.e.getLineCount();
                int r5 = androidx.core.widget.m.k(this.e);
                if (f != textSize || (r5 >= 0 && r1 != r5)) {
                    if (TabLayout.this.C == 1 && f > textSize && lineCount == 1 && ((layout = this.e.getLayout()) == null || k(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.e.setTextSize(0, f);
                        this.e.setMaxLines(r1);
                        super.onMeasure(r8, r9);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.d == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.d.p();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.e;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.i;
            if (view != null) {
                view.setSelected(z);
            }
        }

        void setTab(@i0 i iVar) {
            if (iVar != this.d) {
                this.d = iVar;
                y();
            }
        }

        void t() {
            setTab(null);
            setSelected(false);
        }

        final void y() {
            i iVar = this.d;
            Drawable drawableMutate = null;
            View viewF = iVar != null ? iVar.f() : null;
            if (viewF != null) {
                ViewParent parent = viewF.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewF);
                    }
                    addView(viewF);
                }
                this.i = viewF;
                TextView textView = this.e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewF.findViewById(R.id.text1);
                this.j = textView2;
                if (textView2 != null) {
                    this.m = androidx.core.widget.m.k(textView2);
                }
                this.k = (ImageView) viewF.findViewById(R.id.icon);
            } else {
                View view = this.i;
                if (view != null) {
                    removeView(view);
                    this.i = null;
                }
                this.j = null;
                this.k = null;
            }
            if (this.i == null) {
                if (this.f == null) {
                    q();
                }
                if (iVar != null && iVar.g() != null) {
                    drawableMutate = androidx.core.graphics.drawable.a.r(iVar.g()).mutate();
                }
                if (drawableMutate != null) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, TabLayout.this.n);
                    PorterDuff.Mode mode = TabLayout.this.q;
                    if (mode != null) {
                        androidx.core.graphics.drawable.a.p(drawableMutate, mode);
                    }
                }
                if (this.e == null) {
                    r();
                    this.m = androidx.core.widget.m.k(this.e);
                }
                androidx.core.widget.m.E(this.e, TabLayout.this.l);
                ColorStateList colorStateList = TabLayout.this.m;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
                B(this.e, this.f);
                w();
                j(this.f);
                j(this.e);
            } else if (this.j != null || this.k != null) {
                B(this.j, this.k);
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.d)) {
                setContentDescription(iVar.d);
            }
            setSelected(iVar != null && iVar.m());
        }
    }

    public static class n implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager f6816a;

        public n(ViewPager viewPager) {
            this.f6816a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@h0 i iVar) throws Resources.NotFoundException {
            this.f6816a.setCurrentItem(iVar.i());
        }
    }

    public TabLayout(@h0 Context context) {
        this(context, null);
    }

    public TabLayout(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.tabStyle);
    }

    public TabLayout(@h0 Context context, @i0 AttributeSet attributeSet, int r12) throws Resources.NotFoundException {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r12, R), attributeSet, r12);
        this.d = new ArrayList<>();
        this.f = new RectF();
        this.u = ActivityChooserView.f.j;
        this.H = new ArrayList<>();
        this.Q = new h.b(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        h hVar = new h(context2);
        this.g = hVar;
        super.addView(hVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayJ = s.j(context2, attributeSet, a.o.TabLayout, r12, R, a.o.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            c.a.b.c.u.j jVar = new c.a.b.c.u.j();
            jVar.n0(ColorStateList.valueOf(colorDrawable.getColor()));
            jVar.Y(context2);
            jVar.m0(f0.P(this));
            f0.B1(this, jVar);
        }
        this.g.j(typedArrayJ.getDimensionPixelSize(a.o.TabLayout_tabIndicatorHeight, -1));
        this.g.i(typedArrayJ.getColor(a.o.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(c.a.b.c.r.c.d(context2, typedArrayJ, a.o.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(typedArrayJ.getInt(a.o.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(typedArrayJ.getBoolean(a.o.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayJ.getDimensionPixelSize(a.o.TabLayout_tabPadding, 0);
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.h = typedArrayJ.getDimensionPixelSize(a.o.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.i = typedArrayJ.getDimensionPixelSize(a.o.TabLayout_tabPaddingTop, this.i);
        this.j = typedArrayJ.getDimensionPixelSize(a.o.TabLayout_tabPaddingEnd, this.j);
        this.k = typedArrayJ.getDimensionPixelSize(a.o.TabLayout_tabPaddingBottom, this.k);
        int resourceId = typedArrayJ.getResourceId(a.o.TabLayout_tabTextAppearance, a.n.TextAppearance_Design_Tab);
        this.l = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, a.m.TextAppearance);
        try {
            this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.m.TextAppearance_android_textSize, 0);
            this.m = c.a.b.c.r.c.a(context2, typedArrayObtainStyledAttributes, a.m.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayJ.hasValue(a.o.TabLayout_tabTextColor)) {
                this.m = c.a.b.c.r.c.a(context2, typedArrayJ, a.o.TabLayout_tabTextColor);
            }
            if (typedArrayJ.hasValue(a.o.TabLayout_tabSelectedTextColor)) {
                this.m = q(this.m.getDefaultColor(), typedArrayJ.getColor(a.o.TabLayout_tabSelectedTextColor, 0));
            }
            this.n = c.a.b.c.r.c.a(context2, typedArrayJ, a.o.TabLayout_tabIconTint);
            this.q = z.j(typedArrayJ.getInt(a.o.TabLayout_tabIconTintMode, -1), null);
            this.o = c.a.b.c.r.c.a(context2, typedArrayJ, a.o.TabLayout_tabRippleColor);
            this.A = typedArrayJ.getInt(a.o.TabLayout_tabIndicatorAnimationDuration, c0);
            this.v = typedArrayJ.getDimensionPixelSize(a.o.TabLayout_tabMinWidth, -1);
            this.w = typedArrayJ.getDimensionPixelSize(a.o.TabLayout_tabMaxWidth, -1);
            this.t = typedArrayJ.getResourceId(a.o.TabLayout_tabBackground, 0);
            this.y = typedArrayJ.getDimensionPixelSize(a.o.TabLayout_tabContentStart, 0);
            this.C = typedArrayJ.getInt(a.o.TabLayout_tabMode, 1);
            this.z = typedArrayJ.getInt(a.o.TabLayout_tabGravity, 0);
            this.D = typedArrayJ.getBoolean(a.o.TabLayout_tabInlineLabel, false);
            this.F = typedArrayJ.getBoolean(a.o.TabLayout_tabUnboundedRipple, false);
            typedArrayJ.recycle();
            Resources resources = getResources();
            this.s = resources.getDimensionPixelSize(a.f.design_tab_text_size_2line);
            this.x = resources.getDimensionPixelSize(a.f.design_tab_scrollable_min_width);
            m();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void K(int r3) {
        m mVar = (m) this.g.getChildAt(r3);
        this.g.removeViewAt(r3);
        if (mVar != null) {
            mVar.t();
            this.Q.a(mVar);
        }
        requestLayout();
    }

    private void S(@i0 ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.K;
        if (viewPager2 != null) {
            l lVar = this.N;
            if (lVar != null) {
                viewPager2.O(lVar);
            }
            b bVar = this.O;
            if (bVar != null) {
                this.K.N(bVar);
            }
        }
        c cVar = this.I;
        if (cVar != null) {
            G(cVar);
            this.I = null;
        }
        if (viewPager != null) {
            this.K = viewPager;
            if (this.N == null) {
                this.N = new l(this);
            }
            this.N.d();
            viewPager.c(this.N);
            n nVar = new n(viewPager);
            this.I = nVar;
            b(nVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                N(adapter, z);
            }
            if (this.O == null) {
                this.O = new b();
            }
            this.O.a(z);
            viewPager.b(this.O);
            O(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.K = null;
            N(null, false);
        }
        this.P = z2;
    }

    private void T() {
        int size = this.d.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.d.get(r1).B();
        }
    }

    private void U(@h0 LinearLayout.LayoutParams layoutParams) {
        float f2;
        if (this.C == 1 && this.z == 0) {
            layoutParams.width = 0;
            f2 = 1.0f;
        } else {
            layoutParams.width = -2;
            f2 = 0.0f;
        }
        layoutParams.weight = f2;
    }

    @p(unit = 0)
    private int getDefaultHeight() {
        int size = this.d.size();
        boolean z = false;
        int r2 = 0;
        while (true) {
            if (r2 < size) {
                i iVar = this.d.get(r2);
                if (iVar != null && iVar.g() != null && !TextUtils.isEmpty(iVar.l())) {
                    z = true;
                    break;
                }
                r2++;
            } else {
                break;
            }
        }
        return (!z || this.D) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int r0 = this.v;
        if (r0 != -1) {
            return r0;
        }
        int r02 = this.C;
        if (r02 == 0 || r02 == 2) {
            return this.x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.g.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h(@h0 com.google.android.material.tabs.a aVar) {
        i iVarC = C();
        CharSequence charSequence = aVar.d;
        if (charSequence != null) {
            iVarC.A(charSequence);
        }
        Drawable drawable = aVar.e;
        if (drawable != null) {
            iVarC.v(drawable);
        }
        int r1 = aVar.f;
        if (r1 != 0) {
            iVarC.s(r1);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            iVarC.r(aVar.getContentDescription());
        }
        d(iVarC);
    }

    private void i(@h0 i iVar) {
        m mVar = iVar.i;
        mVar.setSelected(false);
        mVar.setActivated(false);
        this.g.addView(mVar, iVar.i(), r());
    }

    private void j(View view) {
        if (!(view instanceof com.google.android.material.tabs.a)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        h((com.google.android.material.tabs.a) view);
    }

    private void k(int r7) {
        if (r7 == -1) {
            return;
        }
        if (getWindowToken() == null || !f0.P0(this) || this.g.e()) {
            O(r7, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int r2 = n(r7, 0.0f);
        if (scrollX != r2) {
            x();
            this.J.setIntValues(scrollX, r2);
            this.J.start();
        }
        this.g.c(r7, this.A);
    }

    private void l(int r2) {
        h hVar;
        int r0;
        if (r2 != 0) {
            r0 = 1;
            if (r2 == 1) {
                hVar = this.g;
                hVar.setGravity(r0);
            } else if (r2 != 2) {
                return;
            }
        } else {
            Log.w(e0, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        hVar = this.g;
        r0 = b.i.p.h.f1198b;
        hVar.setGravity(r0);
    }

    private void m() {
        int r0 = this.C;
        f0.V1(this.g, (r0 == 0 || r0 == 2) ? Math.max(0, this.y - this.h) : 0, 0, 0, 0);
        int r02 = this.C;
        if (r02 == 0) {
            l(this.z);
        } else if (r02 == 1 || r02 == 2) {
            if (this.z == 2) {
                Log.w(e0, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.g.setGravity(1);
        }
        V(true);
    }

    private int n(int r5, float f2) {
        int r0 = this.C;
        if (r0 != 0 && r0 != 2) {
            return 0;
        }
        View childAt = this.g.getChildAt(r5);
        int r52 = r5 + 1;
        View childAt2 = r52 < this.g.getChildCount() ? this.g.getChildAt(r52) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int r6 = (int) ((width + width2) * 0.5f * f2);
        return f0.W(this) == 0 ? left + r6 : left - r6;
    }

    private void p(@h0 i iVar, int r3) {
        iVar.w(r3);
        this.d.add(r3, iVar);
        int size = this.d.size();
        while (true) {
            r3++;
            if (r3 >= size) {
                return;
            } else {
                this.d.get(r3).w(r3);
            }
        }
    }

    @h0
    private static ColorStateList q(int r4, int r5) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{r5, r4});
    }

    @h0
    private LinearLayout.LayoutParams r() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        U(layoutParams);
        return layoutParams;
    }

    private void setSelectedTabView(int r7) {
        int childCount = this.g.getChildCount();
        if (r7 < childCount) {
            int r2 = 0;
            while (r2 < childCount) {
                View childAt = this.g.getChildAt(r2);
                boolean z = true;
                childAt.setSelected(r2 == r7);
                if (r2 != r7) {
                    z = false;
                }
                childAt.setActivated(z);
                r2++;
            }
        }
    }

    @h0
    private m t(@h0 i iVar) {
        h.a<m> aVar = this.Q;
        m mVarB = aVar != null ? aVar.b() : null;
        if (mVarB == null) {
            mVarB = new m(getContext());
        }
        mVarB.setTab(iVar);
        mVarB.setFocusable(true);
        mVarB.setMinimumWidth(getTabMinWidth());
        mVarB.setContentDescription(TextUtils.isEmpty(iVar.d) ? iVar.f6810c : iVar.d);
        return mVarB;
    }

    private void u(@h0 i iVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).a(iVar);
        }
    }

    private void v(@h0 i iVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).c(iVar);
        }
    }

    private void w(@h0 i iVar) {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).b(iVar);
        }
    }

    private void x() {
        if (this.J == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.J = valueAnimator;
            valueAnimator.setInterpolator(c.a.b.c.b.a.f1936b);
            this.J.setDuration(this.A);
            this.J.addUpdateListener(new a());
        }
    }

    public boolean A() {
        return this.D;
    }

    public boolean B() {
        return this.E;
    }

    @h0
    public i C() {
        i iVarS = s();
        iVarS.h = this;
        iVarS.i = t(iVarS);
        return iVarS;
    }

    void D() {
        int currentItem;
        F();
        androidx.viewpager.widget.a aVar = this.L;
        if (aVar != null) {
            int r0 = aVar.e();
            for (int r2 = 0; r2 < r0; r2++) {
                g(C().A(this.L.g(r2)), false);
            }
            ViewPager viewPager = this.K;
            if (viewPager == null || r0 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            L(y(currentItem));
        }
    }

    protected boolean E(i iVar) {
        return d0.a(iVar);
    }

    public void F() {
        for (int childCount = this.g.getChildCount() - 1; childCount >= 0; childCount--) {
            K(childCount);
        }
        Iterator<i> it = this.d.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.o();
            E(next);
        }
        this.e = null;
    }

    @Deprecated
    public void G(@i0 c cVar) {
        this.H.remove(cVar);
    }

    public void H(@h0 f fVar) {
        G(fVar);
    }

    public void I(@h0 i iVar) {
        if (iVar.h != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        J(iVar.i());
    }

    public void J(int r6) {
        i iVar = this.e;
        int i2 = iVar != null ? iVar.i() : 0;
        K(r6);
        i iVarRemove = this.d.remove(r6);
        if (iVarRemove != null) {
            iVarRemove.o();
            E(iVarRemove);
        }
        int size = this.d.size();
        for (int r3 = r6; r3 < size; r3++) {
            this.d.get(r3).w(r3);
        }
        if (i2 == r6) {
            L(this.d.isEmpty() ? null : this.d.get(Math.max(0, r6 - 1)));
        }
    }

    public void L(@i0 i iVar) {
        M(iVar, true);
    }

    public void M(@i0 i iVar, boolean z) {
        i iVar2 = this.e;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                u(iVar);
                k(iVar.i());
                return;
            }
            return;
        }
        int i2 = iVar != null ? iVar.i() : -1;
        if (z) {
            if ((iVar2 == null || iVar2.i() == -1) && i2 != -1) {
                O(i2, 0.0f, true);
            } else {
                k(i2);
            }
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
        }
        this.e = iVar;
        if (iVar2 != null) {
            w(iVar2);
        }
        if (iVar != null) {
            v(iVar);
        }
    }

    void N(@i0 androidx.viewpager.widget.a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.L;
        if (aVar2 != null && (dataSetObserver = this.M) != null) {
            aVar2.u(dataSetObserver);
        }
        this.L = aVar;
        if (z && aVar != null) {
            if (this.M == null) {
                this.M = new g();
            }
            aVar.m(this.M);
        }
        D();
    }

    public void O(int r2, float f2, boolean z) {
        P(r2, f2, z, true);
    }

    public void P(int r3, float f2, boolean z, boolean z2) {
        int r0 = Math.round(r3 + f2);
        if (r0 < 0 || r0 >= this.g.getChildCount()) {
            return;
        }
        if (z2) {
            this.g.h(r3, f2);
        }
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.J.cancel();
        }
        scrollTo(n(r3, f2), 0);
        if (z) {
            setSelectedTabView(r0);
        }
    }

    public void Q(int r1, int r2) {
        setTabTextColors(q(r1, r2));
    }

    public void R(@i0 ViewPager viewPager, boolean z) {
        S(viewPager, z, false);
    }

    void V(boolean z) {
        for (int r0 = 0; r0 < this.g.getChildCount(); r0++) {
            View childAt = this.g.getChildAt(r0);
            childAt.setMinimumWidth(getTabMinWidth());
            U((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int r2) {
        j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int r2, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        j(view);
    }

    @Deprecated
    public void b(@i0 c cVar) {
        if (this.H.contains(cVar)) {
            return;
        }
        this.H.add(cVar);
    }

    public void c(@h0 f fVar) {
        b(fVar);
    }

    public void d(@h0 i iVar) {
        g(iVar, this.d.isEmpty());
    }

    public void e(@h0 i iVar, int r3) {
        f(iVar, r3, this.d.isEmpty());
    }

    public void f(@h0 i iVar, int r3, boolean z) {
        if (iVar.h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        p(iVar, r3);
        i(iVar);
        if (z) {
            iVar.p();
        }
    }

    public void g(@h0 i iVar, boolean z) {
        f(iVar, this.d.size(), z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        i iVar = this.e;
        if (iVar != null) {
            return iVar.i();
        }
        return -1;
    }

    public int getTabCount() {
        return this.d.size();
    }

    public int getTabGravity() {
        return this.z;
    }

    @i0
    public ColorStateList getTabIconTint() {
        return this.n;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    int getTabMaxWidth() {
        return this.u;
    }

    public int getTabMode() {
        return this.C;
    }

    @i0
    public ColorStateList getTabRippleColor() {
        return this.o;
    }

    @i0
    public Drawable getTabSelectedIndicator() {
        return this.p;
    }

    @i0
    public ColorStateList getTabTextColors() {
        return this.m;
    }

    public void o() {
        this.H.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.a.b.c.u.k.e(this);
        if (this.K == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                S((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P) {
            setupWithViewPager(null);
            this.P = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(@h0 Canvas canvas) {
        for (int r0 = 0; r0 < this.g.getChildCount(); r0++) {
            View childAt = this.g.getChildAt(r0);
            if (childAt instanceof m) {
                ((m) childAt).n(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        b.i.p.p0.d.T1(accessibilityNodeInfo).V0(d.b.f(1, getTabCount(), false, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.z.d(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.w
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.z.d(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.u = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.C
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = 1
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    protected i s() {
        i iVarB = d0.b();
        return iVarB == null ? new i() : iVarB;
    }

    @Override // android.view.View
    @m0(21)
    public void setElevation(float f2) {
        super.setElevation(f2);
        c.a.b.c.u.k.d(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.D != z) {
            this.D = z;
            for (int r3 = 0; r3 < this.g.getChildCount(); r3++) {
                View childAt = this.g.getChildAt(r3);
                if (childAt instanceof m) {
                    ((m) childAt).A();
                }
            }
            m();
        }
    }

    public void setInlineLabelResource(@androidx.annotation.h int r2) {
        setInlineLabel(getResources().getBoolean(r2));
    }

    @Deprecated
    public void setOnTabSelectedListener(@i0 c cVar) {
        c cVar2 = this.G;
        if (cVar2 != null) {
            G(cVar2);
        }
        this.G = cVar;
        if (cVar != null) {
            b(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@i0 f fVar) {
        setOnTabSelectedListener((c) fVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        x();
        this.J.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@q int r2) {
        setSelectedTabIndicator(r2 != 0 ? b.a.b.a.a.d(getContext(), r2) : null);
    }

    public void setSelectedTabIndicator(@i0 Drawable drawable) {
        if (this.p != drawable) {
            this.p = drawable;
            f0.g1(this.g);
        }
    }

    public void setSelectedTabIndicatorColor(@androidx.annotation.k int r2) {
        this.g.i(r2);
    }

    public void setSelectedTabIndicatorGravity(int r2) {
        if (this.B != r2) {
            this.B = r2;
            f0.g1(this.g);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int r2) {
        this.g.j(r2);
    }

    public void setTabGravity(int r2) {
        if (this.z != r2) {
            this.z = r2;
            m();
        }
    }

    public void setTabIconTint(@i0 ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            T();
        }
    }

    public void setTabIconTintResource(@androidx.annotation.m int r2) {
        setTabIconTint(b.a.b.a.a.c(getContext(), r2));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.E = z;
        f0.g1(this.g);
    }

    public void setTabMode(int r2) {
        if (r2 != this.C) {
            this.C = r2;
            m();
        }
    }

    public void setTabRippleColor(@i0 ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            for (int r3 = 0; r3 < this.g.getChildCount(); r3++) {
                View childAt = this.g.getChildAt(r3);
                if (childAt instanceof m) {
                    ((m) childAt).z(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@androidx.annotation.m int r2) {
        setTabRippleColor(b.a.b.a.a.c(getContext(), r2));
    }

    public void setTabTextColors(@i0 ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            T();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@i0 androidx.viewpager.widget.a aVar) {
        N(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.F != z) {
            this.F = z;
            for (int r3 = 0; r3 < this.g.getChildCount(); r3++) {
                View childAt = this.g.getChildAt(r3);
                if (childAt instanceof m) {
                    ((m) childAt).z(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@androidx.annotation.h int r2) {
        setUnboundedRipple(getResources().getBoolean(r2));
    }

    public void setupWithViewPager(@i0 ViewPager viewPager) {
        R(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @i0
    public i y(int r2) {
        if (r2 < 0 || r2 >= getTabCount()) {
            return null;
        }
        return this.d.get(r2);
    }

    public boolean z() {
        return this.F;
    }
}
