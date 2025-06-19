package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.h0;
import androidx.annotation.i;
import androidx.annotation.i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f6851b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6852c = 1;
    private static final int d = 2;

    /* renamed from: a, reason: collision with root package name */
    private int f6853a;

    class a implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ View d;
        final /* synthetic */ int e;
        final /* synthetic */ c.a.b.c.m.b f;

        a(View view, int r3, c.a.b.c.m.b bVar) {
            this.d = view;
            this.e = r3;
            this.f = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.d.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f6853a == this.e) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                c.a.b.c.m.b bVar = this.f;
                expandableBehavior.K((View) bVar, this.d, bVar.b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f6853a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6853a = 0;
    }

    private boolean H(boolean z) {
        if (!z) {
            return this.f6853a == 1;
        }
        int r4 = this.f6853a;
        return r4 == 0 || r4 == 2;
    }

    @i0
    public static <T extends ExpandableBehavior> T J(@h0 View view, @h0 Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) layoutParams).f();
        if (cVarF instanceof ExpandableBehavior) {
            return cls.cast(cVarF);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i0
    protected c.a.b.c.m.b I(@h0 CoordinatorLayout coordinatorLayout, @h0 View view) {
        List<View> listW = coordinatorLayout.w(view);
        int size = listW.size();
        for (int r2 = 0; r2 < size; r2++) {
            View view2 = listW.get(r2);
            if (f(coordinatorLayout, view, view2)) {
                return (c.a.b.c.m.b) view2;
            }
        }
        return null;
    }

    protected abstract boolean K(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean f(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @i
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        c.a.b.c.m.b bVar = (c.a.b.c.m.b) view2;
        if (!H(bVar.b())) {
            return false;
        }
        this.f6853a = bVar.b() ? 1 : 2;
        return K((View) bVar, view, bVar.b(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @i
    public boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 View view, int r5) {
        c.a.b.c.m.b bVarI;
        if (f0.P0(view) || (bVarI = I(coordinatorLayout, view)) == null || !H(bVarI.b())) {
            return false;
        }
        int r52 = bVarI.b() ? 1 : 2;
        this.f6853a = r52;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, r52, bVarI));
        return false;
    }
}
