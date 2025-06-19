package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.p0;
import b.a.a;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    private CharSequence m;
    private CharSequence n;
    private View o;
    private View p;
    private LinearLayout q;
    private TextView r;
    private TextView s;
    private int t;
    private int u;
    private boolean v;
    private int w;

    class a implements View.OnClickListener {
        final /* synthetic */ b.a.f.b d;

        a(b.a.f.b bVar) {
            this.d = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.d.c();
        }
    }

    public ActionBarContextView(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public ActionBarContextView(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.actionModeStyle);
    }

    public ActionBarContextView(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r5) {
        super(context, attributeSet, r5);
        a1 a1VarG = a1.G(context, attributeSet, a.m.ActionMode, r5, 0);
        b.i.p.f0.B1(this, a1VarG.h(a.m.ActionMode_background));
        this.t = a1VarG.u(a.m.ActionMode_titleTextStyle, 0);
        this.u = a1VarG.u(a.m.ActionMode_subtitleTextStyle, 0);
        this.h = a1VarG.q(a.m.ActionMode_height, 0);
        this.w = a1VarG.u(a.m.ActionMode_closeItemLayout, a.j.abc_action_mode_close_item_material);
        a1VarG.I();
    }

    private void r() {
        if (this.q == null) {
            LayoutInflater.from(getContext()).inflate(a.j.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.q = linearLayout;
            this.r = (TextView) linearLayout.findViewById(a.g.action_bar_title);
            this.s = (TextView) this.q.findViewById(a.g.action_bar_subtitle);
            if (this.t != 0) {
                this.r.setTextAppearance(getContext(), this.t);
            }
            if (this.u != 0) {
                this.s.setTextAppearance(getContext(), this.u);
            }
        }
        this.r.setText(this.m);
        this.s.setText(this.n);
        boolean z = !TextUtils.isEmpty(this.m);
        boolean z2 = !TextUtils.isEmpty(this.n);
        int r3 = 0;
        this.s.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.q;
        if (!z && !z2) {
            r3 = 8;
        }
        linearLayout2.setVisibility(r3);
        if (this.q.getParent() == null) {
            addView(this.q);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void c(int r1) {
        super.c(r1);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // androidx.appcompat.widget.a
    public boolean f() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.u();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.n;
    }

    public CharSequence getTitle() {
        return this.m;
    }

    @Override // androidx.appcompat.widget.a
    public boolean h() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.x();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ b.i.p.j0 n(int r1, long j) {
        return super.n(r1, j);
    }

    @Override // androidx.appcompat.widget.a
    public boolean o() {
        c cVar = this.g;
        if (cVar != null) {
            return cVar.G();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.g;
        if (cVar != null) {
            cVar.u();
            this.g.v();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(ActionBarContextView.class.getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.m);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r11, int r12, int r13, int r14) {
        boolean zB = g1.b(this);
        int paddingRight = zB ? (r13 - r11) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((r14 - r12) - getPaddingTop()) - getPaddingBottom();
        View view = this.o;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            int r1 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int r142 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int r8 = androidx.appcompat.widget.a.k(paddingRight, r1, zB);
            paddingRight = androidx.appcompat.widget.a.k(r8 + l(this.o, r8, paddingTop, paddingTop2, zB), r142, zB);
        }
        int r143 = paddingRight;
        LinearLayout linearLayout = this.q;
        if (linearLayout != null && this.p == null && linearLayout.getVisibility() != 8) {
            r143 += l(this.q, r143, paddingTop, paddingTop2, zB);
        }
        int r2 = r143;
        View view2 = this.p;
        if (view2 != null) {
            l(view2, r2, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (r13 - r11) - getPaddingRight();
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView != null) {
            l(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int r11, int r12) {
        if (View.MeasureSpec.getMode(r11) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(r12) == 0) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(r11);
        int size2 = this.h;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(r12);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int r3 = size2 - paddingTop;
        int r5 = View.MeasureSpec.makeMeasureSpec(r3, Integer.MIN_VALUE);
        View view = this.o;
        if (view != null) {
            int r2 = j(view, paddingLeft, r5, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            paddingLeft = r2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = j(this.f, paddingLeft, r5, 0);
        }
        LinearLayout linearLayout = this.q;
        if (linearLayout != null && this.p == null) {
            if (this.v) {
                this.q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), r5);
                int measuredWidth = this.q.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.q.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = j(linearLayout, paddingLeft, r5, 0);
            }
        }
        View view2 = this.p;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int r6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            int r9 = layoutParams.width;
            if (r9 >= 0) {
                paddingLeft = Math.min(r9, paddingLeft);
            }
            int r1 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            int r4 = layoutParams.height;
            if (r4 >= 0) {
                r3 = Math.min(r4, r3);
            }
            this.p.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, r6), View.MeasureSpec.makeMeasureSpec(r3, r1));
        }
        if (this.h > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int r13 = 0;
        for (int r7 = 0; r7 < childCount; r7++) {
            int measuredHeight = getChildAt(r7).getMeasuredHeight() + paddingTop;
            if (measuredHeight > r13) {
                r13 = measuredHeight;
            }
        }
        setMeasuredDimension(size, r13);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        if (this.o == null) {
            t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(b.a.f.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.o
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.w
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.o = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.o
            goto L15
        L22:
            android.view.View r0 = r3.o
            int r1 = b.a.a.g.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.g) r4
            androidx.appcompat.widget.c r0 = r3.g
            if (r0 == 0) goto L3f
            r0.r()
        L3f:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.g = r0
            r1 = 1
            r0.E(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.g
            android.content.Context r2 = r3.e
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.g
            androidx.appcompat.view.menu.o r4 = r4.O(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f = r4
            r1 = 0
            b.i.p.f0.B1(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.q(b.a.f.b):void");
    }

    public boolean s() {
        return this.v;
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int r1) {
        this.h = r1;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.p;
        if (view2 != null) {
            removeView(view2);
        }
        this.p = view;
        if (view != null && (linearLayout = this.q) != null) {
            removeView(linearLayout);
            this.q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.n = charSequence;
        r();
    }

    public void setTitle(CharSequence charSequence) {
        this.m = charSequence;
        r();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.v) {
            requestLayout();
        }
        this.v = z;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
        super.setVisibility(r1);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t() {
        removeAllViews();
        this.p = null;
        this.f = null;
    }
}
