package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.appcompat.widget.j0;
import c.a.b.c.a;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class f extends j0 {

    @i0
    private Drawable E;
    private final Rect F;
    private final Rect G;
    private int H;
    protected boolean I;
    boolean J;

    public f(@h0 Context context) {
        this(context, null);
    }

    public f(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f(@h0 Context context, @i0 AttributeSet attributeSet, int r11) {
        super(context, attributeSet, r11);
        this.F = new Rect();
        this.G = new Rect();
        this.H = 119;
        this.I = true;
        this.J = false;
        TypedArray typedArrayJ = s.j(context, attributeSet, a.o.ForegroundLinearLayout, r11, 0, new int[0]);
        this.H = typedArrayJ.getInt(a.o.ForegroundLinearLayout_android_foregroundGravity, this.H);
        Drawable drawable = typedArrayJ.getDrawable(a.o.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.I = typedArrayJ.getBoolean(a.o.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayJ.recycle();
    }

    @Override // android.view.View
    public void draw(@h0 Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.E;
        if (drawable != null) {
            if (this.J) {
                this.J = false;
                Rect rect = this.F;
                Rect rect2 = this.G;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.I) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.H, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @m0(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.E;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.E.setState(getDrawableState());
    }

    @Override // android.view.View
    @i0
    public Drawable getForeground() {
        return this.E;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.H;
    }

    @Override // android.view.ViewGroup, android.view.View
    @m0(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.j0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r2, int r3, int r4, int r5) {
        super.onLayout(z, r2, r3, r4, r5);
        this.J = z | this.J;
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.J = true;
    }

    @Override // android.view.View
    public void setForeground(@i0 Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.E);
            }
            this.E = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.H == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int r2) {
        if (this.H != r2) {
            if ((8388615 & r2) == 0) {
                r2 |= b.i.p.h.f1198b;
            }
            if ((r2 & 112) == 0) {
                r2 |= 48;
            }
            this.H = r2;
            if (r2 == 119 && this.E != null) {
                this.E.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.E;
    }
}
