package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.j0;
import b.a.a;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class r0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final String o = "ScrollingTabContainerView";
    private static final Interpolator p = new DecelerateInterpolator();
    private static final int q = 200;
    Runnable d;
    private c e;
    j0 f;
    private Spinner g;
    private boolean h;
    int i;
    int j;
    private int k;
    private int l;
    protected ViewPropertyAnimator m;
    protected final e n;

    class a implements Runnable {
        final /* synthetic */ View d;

        a(View view) {
            this.d = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.smoothScrollTo(this.d.getLeft() - ((r0.this.getWidth() - this.d.getWidth()) / 2), 0);
            r0.this.d = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return r0.this.f.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int r2) {
            return ((d) r0.this.f.getChildAt(r2)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
            return r3;
        }

        @Override // android.widget.Adapter
        public View getView(int r1, View view, ViewGroup viewGroup) {
            if (view == null) {
                return r0.this.g((a.f) getItem(r1), true);
            }
            ((d) view).a((a.f) getItem(r1));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().g();
            int childCount = r0.this.f.getChildCount();
            for (int r2 = 0; r2 < childCount; r2++) {
                View childAt = r0.this.f.getChildAt(r2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {
        private static final String j = "androidx.appcompat.app.ActionBar$Tab";
        private final int[] d;
        private a.f e;
        private TextView f;
        private ImageView g;
        private View h;

        public d(Context context, a.f fVar, boolean z) {
            super(context, null, a.b.actionBarTabStyle);
            int[] r4 = {R.attr.background};
            this.d = r4;
            this.e = fVar;
            a1 a1VarG = a1.G(context, null, r4, a.b.actionBarTabStyle, 0);
            if (a1VarG.C(0)) {
                setBackgroundDrawable(a1VarG.h(0));
            }
            a1VarG.I();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.f fVar) {
            this.e = fVar;
            c();
        }

        public a.f b() {
            return this.e;
        }

        public void c() {
            a.f fVar = this.e;
            View viewB = fVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.h = viewB;
                TextView textView = this.f;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.g;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.g.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.h;
            if (view != null) {
                removeView(view);
                this.h = null;
            }
            Drawable drawableC = fVar.c();
            CharSequence charSequenceF = fVar.f();
            if (drawableC != null) {
                if (this.g == null) {
                    p pVar = new p(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    pVar.setLayoutParams(layoutParams);
                    addView(pVar, 0);
                    this.g = pVar;
                }
                this.g.setImageDrawable(drawableC);
                this.g.setVisibility(0);
            } else {
                ImageView imageView2 = this.g;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.g.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceF);
            if (z) {
                if (this.f == null) {
                    a0 a0Var = new a0(getContext(), null, a.b.actionBarTabTextStyle);
                    a0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    a0Var.setLayoutParams(layoutParams2);
                    addView(a0Var);
                    this.f = a0Var;
                }
                this.f.setText(charSequenceF);
                this.f.setVisibility(0);
            } else {
                TextView textView2 = this.f;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.g;
            if (imageView3 != null) {
                imageView3.setContentDescription(fVar.a());
            }
            c1.a(this, z ? null : fVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(j);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(j);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r2, int r3) {
            super.onMeasure(r2, r3);
            if (r0.this.i > 0) {
                int measuredWidth = getMeasuredWidth();
                int r0 = r0.this.i;
                if (measuredWidth > r0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(r0, 1073741824), r3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    protected class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f187a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f188b;

        protected e() {
        }

        public e a(ViewPropertyAnimator viewPropertyAnimator, int r2) {
            this.f188b = r2;
            r0.this.m = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f187a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f187a) {
                return;
            }
            r0 r0Var = r0.this;
            r0Var.m = null;
            r0Var.setVisibility(this.f188b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            r0.this.setVisibility(0);
            this.f187a = false;
        }
    }

    public r0(@androidx.annotation.h0 Context context) {
        super(context);
        this.n = new e();
        setHorizontalScrollBarEnabled(false);
        b.a.f.a aVarB = b.a.f.a.b(context);
        setContentHeight(aVarB.f());
        this.j = aVarB.e();
        j0 j0VarF = f();
        this.f = j0VarF;
        addView(j0VarF, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner e() {
        x xVar = new x(getContext(), null, a.b.actionDropDownStyle);
        xVar.setLayoutParams(new j0.b(-2, -1));
        xVar.setOnItemSelectedListener(this);
        return xVar;
    }

    private j0 f() {
        j0 j0Var = new j0(getContext(), null, a.b.actionBarTabBarStyle);
        j0Var.setMeasureWithLargestChildEnabled(true);
        j0Var.setGravity(17);
        j0Var.setLayoutParams(new j0.b(-2, -1));
        return j0Var;
    }

    private boolean h() {
        Spinner spinner = this.g;
        return spinner != null && spinner.getParent() == this;
    }

    private void i() {
        if (h()) {
            return;
        }
        if (this.g == null) {
            this.g = e();
        }
        removeView(this.f);
        addView(this.g, new ViewGroup.LayoutParams(-2, -1));
        if (this.g.getAdapter() == null) {
            this.g.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.d = null;
        }
        this.g.setSelection(this.l);
    }

    private boolean j() {
        if (!h()) {
            return false;
        }
        removeView(this.g);
        addView(this.f, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.g.getSelectedItemPosition());
        return false;
    }

    public void a(a.f fVar, int r7, boolean z) {
        d dVarG = g(fVar, false);
        this.f.addView(dVarG, r7, new j0.b(0, -1, 1.0f));
        Spinner spinner = this.g;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            dVarG.setSelected(true);
        }
        if (this.h) {
            requestLayout();
        }
    }

    public void b(a.f fVar, boolean z) {
        d dVarG = g(fVar, false);
        this.f.addView(dVarG, new j0.b(0, -1, 1.0f));
        Spinner spinner = this.g;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            dVarG.setSelected(true);
        }
        if (this.h) {
            requestLayout();
        }
    }

    public void c(int r2) {
        View childAt = this.f.getChildAt(r2);
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.d = aVar;
        post(aVar);
    }

    public void d(int r5) {
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator viewPropertyAnimator = this.m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (r5 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            viewPropertyAnimatorAlpha = animate().alpha(1.0f);
        } else {
            viewPropertyAnimatorAlpha = animate().alpha(0.0f);
        }
        viewPropertyAnimatorAlpha.setDuration(200L);
        viewPropertyAnimatorAlpha.setInterpolator(p);
        viewPropertyAnimatorAlpha.setListener(this.n.a(viewPropertyAnimatorAlpha, r5));
        viewPropertyAnimatorAlpha.start();
    }

    d g(a.f fVar, boolean z) {
        d dVar = new d(getContext(), fVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.k));
        } else {
            dVar.setFocusable(true);
            if (this.e == null) {
                this.e = new c();
            }
            dVar.setOnClickListener(this.e);
        }
        return dVar;
    }

    public void k() {
        this.f.removeAllViews();
        Spinner spinner = this.g;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.h) {
            requestLayout();
        }
    }

    public void l(int r2) {
        this.f.removeViewAt(r2);
        Spinner spinner = this.g;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.h) {
            requestLayout();
        }
    }

    public void m(int r2) {
        ((d) this.f.getChildAt(r2)).c();
        Spinner spinner = this.g;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.h) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.d;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.a.f.a aVarB = b.a.f.a.b(getContext());
        setContentHeight(aVarB.f());
        this.j = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int r3, long j) {
        ((d) view).b().g();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r8 != r2) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r6.setFillViewport(r3)
            androidx.appcompat.widget.j0 r4 = r6.f
            int r4 = r4.getChildCount()
            if (r4 <= r0) goto L3f
            if (r8 == r2) goto L1e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r5) goto L3f
        L1e:
            r8 = 2
            if (r4 <= r8) goto L2f
            int r8 = android.view.View.MeasureSpec.getSize(r7)
            float r8 = (float) r8
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r4
            int r8 = (int) r8
            r6.i = r8
            goto L36
        L2f:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r4 / r8
            r6.i = r4
        L36:
            int r8 = r6.i
            int r4 = r6.j
            int r8 = java.lang.Math.min(r8, r4)
            goto L40
        L3f:
            r8 = -1
        L40:
            r6.i = r8
            int r8 = r6.k
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            if (r3 != 0) goto L4f
            boolean r2 = r6.h
            if (r2 == 0) goto L4f
            goto L50
        L4f:
            r0 = 0
        L50:
            if (r0 == 0) goto L67
            androidx.appcompat.widget.j0 r0 = r6.f
            r0.measure(r1, r8)
            androidx.appcompat.widget.j0 r0 = r6.f
            int r0 = r0.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 <= r1) goto L67
            r6.i()
            goto L6a
        L67:
            r6.j()
        L6a:
            int r0 = r6.getMeasuredWidth()
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredWidth()
            if (r3 == 0) goto L7e
            if (r0 == r7) goto L7e
            int r7 = r6.l
            r6.setTabSelected(r7)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.onMeasure(int, int):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.h = z;
    }

    public void setContentHeight(int r1) {
        this.k = r1;
        requestLayout();
    }

    public void setTabSelected(int r6) {
        this.l = r6;
        int childCount = this.f.getChildCount();
        int r2 = 0;
        while (r2 < childCount) {
            View childAt = this.f.getChildAt(r2);
            boolean z = r2 == r6;
            childAt.setSelected(z);
            if (z) {
                c(r6);
            }
            r2++;
        }
        Spinner spinner = this.g;
        if (spinner == null || r6 < 0) {
            return;
        }
        spinner.setSelection(r6);
    }
}
