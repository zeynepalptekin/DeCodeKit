package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.p0;
import b.a.a;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    private boolean d;
    private View e;
    private View f;
    private View g;
    Drawable h;
    Drawable i;
    Drawable j;
    boolean k;
    boolean l;
    private int m;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b.i.p.f0.B1(this, new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.ActionBar);
        this.h = typedArrayObtainStyledAttributes.getDrawable(a.m.ActionBar_background);
        this.i = typedArrayObtainStyledAttributes.getDrawable(a.m.ActionBar_backgroundStacked);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.m.ActionBar_height, -1);
        boolean z = true;
        if (getId() == a.g.split_action_bar) {
            this.k = true;
            this.j = typedArrayObtainStyledAttributes.getDrawable(a.m.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.k ? this.h != null || this.i != null : this.j != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.h;
        if (drawable != null && drawable.isStateful()) {
            this.h.setState(getDrawableState());
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null && drawable2.isStateful()) {
            this.i.setState(getDrawableState());
        }
        Drawable drawable3 = this.j;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.j.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.j;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f = findViewById(a.g.action_bar);
        this.g = findViewById(a.g.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.d || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int r6, int r7, int r8, int r9) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, r6, r7, r8, r9);
        View view2 = this.e;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int r2 = layoutParams.bottomMargin;
            view2.layout(r6, measuredHeight2 - r2, r8, measuredHeight - r2);
        }
        if (this.k) {
            Drawable drawable3 = this.j;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.h != null) {
                if (this.f.getVisibility() == 0) {
                    drawable2 = this.h;
                    left = this.f.getLeft();
                    top = this.f.getTop();
                    right = this.f.getRight();
                    view = this.f;
                } else {
                    View view3 = this.g;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.h.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.h;
                        left = this.g.getLeft();
                        top = this.g.getTop();
                        right = this.g.getRight();
                        view = this.g;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.l = z4;
            if (!z4 || (drawable = this.i) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.m
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.e
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.g
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.g
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.e
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.h);
        }
        this.h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f;
            if (view != null) {
                this.h.setBounds(view.getLeft(), this.f.getTop(), this.f.getRight(), this.f.getBottom());
            }
        }
        boolean z = true;
        if (!this.k ? this.h != null || this.i != null : this.j != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.j);
        }
        this.j = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.k && (drawable2 = this.j) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.k ? !(this.h != null || this.i != null) : this.j == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.i);
        }
        this.i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.l && (drawable2 = this.i) != null) {
                drawable2.setBounds(this.e.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom());
            }
        }
        boolean z = true;
        if (!this.k ? this.h != null || this.i != null : this.j != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(r0 r0Var) {
        View view = this.e;
        if (view != null) {
            removeView(view);
        }
        this.e = r0Var;
        if (r0Var != null) {
            addView(r0Var);
            ViewGroup.LayoutParams layoutParams = r0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            r0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.d = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
        super.setVisibility(r3);
        boolean z = r3 == 0;
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.j;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int r3) {
        if (r3 != 0) {
            return super.startActionModeForChild(view, callback, r3);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.h && !this.k) || (drawable == this.i && this.l) || ((drawable == this.j && this.k) || super.verifyDrawable(drawable));
    }
}
