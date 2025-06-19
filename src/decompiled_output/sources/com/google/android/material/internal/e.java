package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.appcompat.widget.ActivityChooserView;
import b.i.p.f0;
import c.a.b.c.a;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class e extends ViewGroup {
    private int d;
    private int e;
    private boolean f;
    private int g;

    public e(@h0 Context context) {
        this(context, null);
    }

    public e(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(@h0 Context context, @i0 AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.f = false;
        d(context, attributeSet);
    }

    @TargetApi(21)
    public e(@h0 Context context, @i0 AttributeSet attributeSet, int r3, int r4) {
        super(context, attributeSet, r3, r4);
        this.f = false;
        d(context, attributeSet);
    }

    private static int a(int r1, int r2, int r3) {
        return r2 != Integer.MIN_VALUE ? r2 != 1073741824 ? r3 : r1 : Math.min(r3, r1);
    }

    private void d(@h0 Context context, @i0 AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.o.FlowLayout, 0, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.o.FlowLayout_lineSpacing, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.o.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int b(@h0 View view) {
        Object tag = view.getTag(a.h.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f;
    }

    protected int getItemSpacing() {
        return this.e;
    }

    protected int getLineSpacing() {
        return this.d;
    }

    protected int getRowCount() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r11, int r12, int r13, int r14) {
        int r5;
        int r6;
        if (getChildCount() == 0) {
            this.g = 0;
            return;
        }
        this.g = 1;
        boolean z2 = f0.W(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int r132 = (r13 - r11) - paddingLeft;
        int measuredWidth = paddingRight;
        int r112 = paddingTop;
        for (int r1 = 0; r1 < getChildCount(); r1++) {
            View childAt = getChildAt(r1);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(a.h.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    r6 = b.i.p.m.c(marginLayoutParams);
                    r5 = b.i.p.m.b(marginLayoutParams);
                } else {
                    r5 = 0;
                    r6 = 0;
                }
                int measuredWidth2 = measuredWidth + r6 + childAt.getMeasuredWidth();
                if (!this.f && measuredWidth2 > r132) {
                    r112 = this.d + paddingTop;
                    this.g++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(a.h.row_index_key, Integer.valueOf(this.g - 1));
                int r2 = measuredWidth + r6;
                int measuredWidth3 = childAt.getMeasuredWidth() + r2;
                int measuredHeight = childAt.getMeasuredHeight() + r112;
                if (z2) {
                    r2 = r132 - measuredWidth3;
                    measuredWidth3 = (r132 - measuredWidth) - r6;
                }
                childAt.layout(r2, r112, measuredWidth3, measuredHeight);
                measuredWidth += r6 + r5 + childAt.getMeasuredWidth() + this.e;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int r21, int r22) {
        int r8;
        int r15;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(r21);
        int mode = View.MeasureSpec.getMode(r21);
        int size2 = View.MeasureSpec.getSize(r22);
        int mode2 = View.MeasureSpec.getMode(r22);
        int r5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : ActivityChooserView.f.j;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = r5 - getPaddingRight();
        int r9 = paddingTop;
        int r11 = 0;
        for (int r10 = 0; r10 < getChildCount(); r10++) {
            View childAt = getChildAt(r10);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, r21, r22);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    r8 = marginLayoutParams.leftMargin + 0;
                    r15 = marginLayoutParams.rightMargin + 0;
                } else {
                    r8 = 0;
                    r15 = 0;
                }
                int r19 = paddingLeft2;
                if (paddingLeft2 + r8 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = r19;
                } else {
                    paddingLeft = getPaddingLeft();
                    r9 = this.d + paddingTop;
                }
                int measuredWidth = paddingLeft + r8 + childAt.getMeasuredWidth();
                int measuredHeight = r9 + childAt.getMeasuredHeight();
                if (measuredWidth > r11) {
                    r11 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + r8 + r15 + childAt.getMeasuredWidth() + this.e;
                if (r10 == getChildCount() - 1) {
                    r11 += r15;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, r11 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int r1) {
        this.e = r1;
    }

    protected void setLineSpacing(int r1) {
        this.d = r1;
    }

    public void setSingleLine(boolean z) {
        this.f = z;
    }
}
