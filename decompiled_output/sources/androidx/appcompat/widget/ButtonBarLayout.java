package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.p0;
import b.a.a;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    private static final int g = 16;
    private boolean d;
    private int e;
    private int f;

    public ButtonBarLayout(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = -1;
        this.f = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.ButtonBarLayout);
        b.i.p.f0.s1(this, context, a.m.ButtonBarLayout, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.d = typedArrayObtainStyledAttributes.getBoolean(a.m.ButtonBarLayout_allowStacking, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private int a(int r3) {
        int childCount = getChildCount();
        while (r3 < childCount) {
            if (getChildAt(r3).getVisibility() == 0) {
                return r3;
            }
            r3++;
        }
        return -1;
    }

    private boolean b() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View viewFindViewById = findViewById(a.g.spacer);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r6, int r7) {
        int r0;
        boolean z;
        int size = View.MeasureSpec.getSize(r6);
        int paddingBottom = 0;
        if (this.d) {
            if (size > this.e && b()) {
                setStacked(false);
            }
            this.e = size;
        }
        if (b() || View.MeasureSpec.getMode(r6) != 1073741824) {
            r0 = r6;
            z = false;
        } else {
            r0 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(r0, r7);
        if (this.d && !b()) {
            if ((getMeasuredWidthAndState() & b.i.p.f0.t) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(r6, r7);
        }
        int r62 = a(0);
        if (r62 >= 0) {
            View childAt = getChildAt(r62);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int r63 = a(r62 + 1);
                if (r63 >= 0) {
                    paddingTop += getChildAt(r63).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (b.i.p.f0.b0(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.d != z) {
            this.d = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
