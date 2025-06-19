package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.p;
import androidx.annotation.p0;
import androidx.annotation.s0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.a.b.c.a;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] L;
    private static final int[] M;

    @i0
    private final AccessibilityManager I;
    private boolean J;

    @i0
    private BaseTransientBottomBar.s<Snackbar> K;

    @p0({p0.a.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.y {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int r6, int r7) {
            super.onMeasure(r6, r7);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int r0 = 0; r0 < childCount; r0++) {
                View childAt = getChildAt(r0);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.y, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@i0 Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.y, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@i0 Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.y, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@i0 ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.y, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@i0 PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.y, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@i0 View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    class a implements View.OnClickListener {
        final /* synthetic */ View.OnClickListener d;

        a(View.OnClickListener onClickListener) {
            this.d = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.d.onClick(view);
            Snackbar.this.u(1);
        }
    }

    public static class b extends BaseTransientBottomBar.s<Snackbar> {
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;
        public static final int j = 4;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int r2) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int r2 = a.c.snackbarButtonStyle;
        L = new int[]{r2};
        M = new int[]{r2, a.c.snackbarTextViewStyle};
    }

    private Snackbar(@h0 ViewGroup viewGroup, @h0 View view, @h0 com.google.android.material.snackbar.a aVar) {
        super(viewGroup, view, aVar);
        this.I = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @i0
    private static ViewGroup i0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @Deprecated
    protected static boolean j0(@h0 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(L);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    private static boolean k0(@h0 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(M);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    @h0
    public static Snackbar l0(@h0 View view, @s0 int r2, int r3) {
        return m0(view, view.getResources().getText(r2), r3);
    }

    @h0
    public static Snackbar m0(@h0 View view, @h0 CharSequence charSequence, int r5) {
        ViewGroup viewGroupI0 = i0(view);
        if (viewGroupI0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(viewGroupI0.getContext()).inflate(k0(viewGroupI0.getContext()) ? a.k.mtrl_layout_snackbar_include : a.k.design_layout_snackbar_include, viewGroupI0, false);
        Snackbar snackbar = new Snackbar(viewGroupI0, snackbarContentLayout, snackbarContentLayout);
        snackbar.x0(charSequence);
        snackbar.V(r5);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int A() {
        int r0 = super.A();
        if (r0 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.I.getRecommendedTimeoutMillis(r0, (this.J ? 4 : 0) | 1 | 2);
        }
        if (this.J && this.I.isTouchExplorationEnabled()) {
            return -2;
        }
        return r0;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean L() {
        return super.L();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void a0() {
        super.a0();
    }

    @h0
    public Snackbar n0(@s0 int r2, View.OnClickListener onClickListener) {
        return o0(z().getText(r2), onClickListener);
    }

    @h0
    public Snackbar o0(@i0 CharSequence charSequence, @i0 View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f6770c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.J = false;
        } else {
            this.J = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new a(onClickListener));
        }
        return this;
    }

    @h0
    public Snackbar p0(@k int r3) {
        ((SnackbarContentLayout) this.f6770c.getChildAt(0)).getActionView().setTextColor(r3);
        return this;
    }

    @h0
    public Snackbar q0(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.f6770c.getChildAt(0)).getActionView().setTextColor(colorStateList);
        return this;
    }

    @h0
    public Snackbar r0(@k int r1) {
        return s0(ColorStateList.valueOf(r1));
    }

    @h0
    public Snackbar s0(@i0 ColorStateList colorStateList) {
        this.f6770c.setBackgroundTintList(colorStateList);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void t() {
        super.t();
    }

    @h0
    public Snackbar t0(@i0 PorterDuff.Mode mode) {
        this.f6770c.setBackgroundTintMode(mode);
        return this;
    }

    @h0
    @Deprecated
    public Snackbar u0(@i0 b bVar) {
        BaseTransientBottomBar.s<Snackbar> sVar = this.K;
        if (sVar != null) {
            Q(sVar);
        }
        if (bVar != null) {
            p(bVar);
        }
        this.K = bVar;
        return this;
    }

    @h0
    public Snackbar v0(@p int r3) {
        ((SnackbarContentLayout) this.f6770c.getChildAt(0)).setMaxInlineActionWidth(r3);
        return this;
    }

    @h0
    public Snackbar w0(@s0 int r2) {
        return x0(z().getText(r2));
    }

    @h0
    public Snackbar x0(@h0 CharSequence charSequence) {
        ((SnackbarContentLayout) this.f6770c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    @h0
    public Snackbar y0(@k int r3) {
        ((SnackbarContentLayout) this.f6770c.getChildAt(0)).getMessageView().setTextColor(r3);
        return this;
    }

    @h0
    public Snackbar z0(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.f6770c.getChildAt(0)).getMessageView().setTextColor(colorStateList);
        return this;
    }
}
