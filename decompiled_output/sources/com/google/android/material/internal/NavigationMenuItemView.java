package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.j0;
import b.a.a;
import b.i.p.f0;
import c.a.b.c.a;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements o.a {
    private static final int[] U = {R.attr.state_checked};
    private int K;
    private boolean L;
    boolean M;
    private final CheckedTextView N;
    private FrameLayout O;
    private androidx.appcompat.view.menu.j P;
    private ColorStateList Q;
    private boolean R;
    private Drawable S;
    private final b.i.p.a T;

    class a extends b.i.p.a {
        a() {
        }

        @Override // b.i.p.a
        public void g(View view, @h0 b.i.p.p0.d dVar) {
            super.g(view, dVar);
            dVar.R0(NavigationMenuItemView.this.M);
        }
    }

    public NavigationMenuItemView(@h0 Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@h0 Context context, @i0 AttributeSet attributeSet, int r4) {
        super(context, attributeSet, r4);
        this.T = new a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(a.k.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(a.f.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(a.h.design_menu_item_text);
        this.N = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        f0.u1(this.N, this.T);
    }

    private void F() {
        j0.b bVar;
        int r1;
        if (I()) {
            this.N.setVisibility(8);
            FrameLayout frameLayout = this.O;
            if (frameLayout == null) {
                return;
            }
            bVar = (j0.b) frameLayout.getLayoutParams();
            r1 = -1;
        } else {
            this.N.setVisibility(0);
            FrameLayout frameLayout2 = this.O;
            if (frameLayout2 == null) {
                return;
            }
            bVar = (j0.b) frameLayout2.getLayoutParams();
            r1 = -2;
        }
        ((ViewGroup.MarginLayoutParams) bVar).width = r1;
        this.O.setLayoutParams(bVar);
    }

    @i0
    private StateListDrawable G() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.b.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(U, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean I() {
        return this.P.getTitle() == null && this.P.getIcon() == null && this.P.getActionView() != null;
    }

    private void setActionView(@i0 View view) {
        if (view != null) {
            if (this.O == null) {
                this.O = (FrameLayout) ((ViewStub) findViewById(a.h.design_menu_item_action_area_stub)).inflate();
            }
            this.O.removeAllViews();
            this.O.addView(view);
        }
    }

    public void H() {
        FrameLayout frameLayout = this.O;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.N.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean e() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void f(boolean z, char c2) {
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void g(@h0 androidx.appcompat.view.menu.j jVar, int r2) throws Resources.NotFoundException {
        this.P = jVar;
        if (jVar.getItemId() > 0) {
            setId(jVar.getItemId());
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            f0.B1(this, G());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        c1.a(this, jVar.getTooltipText());
        F();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public androidx.appcompat.view.menu.j getItemData() {
        return this.P;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 1);
        androidx.appcompat.view.menu.j jVar = this.P;
        if (jVar != null && jVar.isCheckable() && this.P.isChecked()) {
            ViewGroup.mergeDrawableStates(r22, U);
        }
        return r22;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.M != z) {
            this.M = z;
            this.T.l(this.N, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setChecked(boolean z) {
        refreshDrawableState();
        this.N.setChecked(z);
    }

    public void setHorizontalPadding(int r2) {
        setPadding(r2, 0, r2, 0);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setIcon(@i0 Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.R) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.Q);
            }
            int r1 = this.K;
            drawable.setBounds(0, 0, r1, r1);
        } else if (this.L) {
            if (this.S == null) {
                Drawable drawableC = b.i.c.j.g.c(getResources(), a.g.navigation_empty_icon, getContext().getTheme());
                this.S = drawableC;
                if (drawableC != null) {
                    int r12 = this.K;
                    drawableC.setBounds(0, 0, r12, r12);
                }
            }
            drawable = this.S;
        }
        androidx.core.widget.m.w(this.N, drawable, null, null, null);
    }

    public void setIconPadding(int r2) {
        this.N.setCompoundDrawablePadding(r2);
    }

    public void setIconSize(@androidx.annotation.p int r1) {
        this.K = r1;
    }

    void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.Q = colorStateList;
        this.R = colorStateList != null;
        androidx.appcompat.view.menu.j jVar = this.P;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int r2) {
        this.N.setMaxLines(r2);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.L = z;
    }

    public void setTextAppearance(int r2) {
        androidx.core.widget.m.E(this.N, r2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.N.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void setTitle(CharSequence charSequence) {
        this.N.setText(charSequence);
    }
}
