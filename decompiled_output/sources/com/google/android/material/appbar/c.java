package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;
import b.i.p.h;
import b.i.p.o0;
import java.util.List;

/* loaded from: classes.dex */
abstract class c extends d<View> {
    final Rect d;
    final Rect e;
    private int f;
    private int g;

    public c() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    private static int V(int r0) {
        return r0 == 0 ? c.a.b.c.c.a.u : r0;
    }

    @Override // com.google.android.material.appbar.d
    protected void K(@h0 CoordinatorLayout coordinatorLayout, @h0 View view, int r11) {
        int bottom;
        View viewP = P(coordinatorLayout.w(view));
        if (viewP != null) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
            Rect rect = this.d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, viewP.getBottom() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, ((coordinatorLayout.getHeight() + viewP.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
            o0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && f0.R(coordinatorLayout) && !f0.R(view)) {
                rect.left += lastWindowInsets.m();
                rect.right -= lastWindowInsets.n();
            }
            Rect rect2 = this.e;
            h.b(V(gVar.f249c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, r11);
            int r112 = Q(viewP);
            view.layout(rect2.left, rect2.top - r112, rect2.right, rect2.bottom - r112);
            bottom = rect2.top - viewP.getBottom();
        } else {
            super.K(coordinatorLayout, view, r11);
            bottom = 0;
        }
        this.f = bottom;
    }

    @i0
    abstract View P(List<View> list);

    final int Q(View view) {
        if (this.g == 0) {
            return 0;
        }
        float fR = R(view);
        int r0 = this.g;
        return b.i.i.a.c((int) (fR * r0), 0, r0);
    }

    float R(View view) {
        return 1.0f;
    }

    public final int S() {
        return this.g;
    }

    int T(@h0 View view) {
        return view.getMeasuredHeight();
    }

    final int U() {
        return this.f;
    }

    public final void W(int r1) {
        this.g = r1;
    }

    protected boolean X() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(@h0 CoordinatorLayout coordinatorLayout, @h0 View view, int r10, int r11, int r12, int r13) {
        View viewP;
        o0 lastWindowInsets;
        int r0 = view.getLayoutParams().height;
        if ((r0 != -1 && r0 != -2) || (viewP = P(coordinatorLayout.w(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(r12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (f0.R(viewP) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.o() + lastWindowInsets.l();
        }
        int r122 = size + T(viewP);
        int measuredHeight = viewP.getMeasuredHeight();
        if (X()) {
            view.setTranslationY(-measuredHeight);
        } else {
            r122 -= measuredHeight;
        }
        coordinatorLayout.O(view, r10, r11, View.MeasureSpec.makeMeasureSpec(r122, r0 == -1 ? 1073741824 : Integer.MIN_VALUE), r13);
        return true;
    }
}
