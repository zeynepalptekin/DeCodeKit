package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.i.p.f0;
import b.i.p.o0;
import c.a.b.c.a;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class n extends FrameLayout {

    @i0
    Drawable d;
    Rect e;
    private Rect f;
    private boolean g;
    private boolean h;

    class a implements b.i.p.y {
        a() {
        }

        @Override // b.i.p.y
        public o0 a(View view, @h0 o0 o0Var) {
            n nVar = n.this;
            if (nVar.e == null) {
                nVar.e = new Rect();
            }
            n.this.e.set(o0Var.m(), o0Var.o(), o0Var.n(), o0Var.l());
            n.this.a(o0Var);
            n.this.setWillNotDraw(!o0Var.t() || n.this.d == null);
            f0.g1(n.this);
            return o0Var.c();
        }
    }

    public n(@h0 Context context) {
        this(context, null);
    }

    public n(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public n(@h0 Context context, @i0 AttributeSet attributeSet, int r10) {
        super(context, attributeSet, r10);
        this.f = new Rect();
        this.g = true;
        this.h = true;
        TypedArray typedArrayJ = s.j(context, attributeSet, a.o.ScrimInsetsFrameLayout, r10, a.n.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.d = typedArrayJ.getDrawable(a.o.ScrimInsetsFrameLayout_insetForeground);
        typedArrayJ.recycle();
        setWillNotDraw(true);
        f0.T1(this, new a());
    }

    protected void a(o0 o0Var) {
    }

    @Override // android.view.View
    public void draw(@h0 Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.e == null || this.d == null) {
            return;
        }
        int r2 = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.g) {
            this.f.set(0, 0, width, this.e.top);
            this.d.setBounds(this.f);
            this.d.draw(canvas);
        }
        if (this.h) {
            this.f.set(0, height - this.e.bottom, width, height);
            this.d.setBounds(this.f);
            this.d.draw(canvas);
        }
        Rect rect = this.f;
        Rect rect2 = this.e;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.d.setBounds(this.f);
        this.d.draw(canvas);
        Rect rect3 = this.f;
        Rect rect4 = this.e;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.d.setBounds(this.f);
        this.d.draw(canvas);
        canvas.restoreToCount(r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.h = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.g = z;
    }

    public void setScrimInsetForeground(@i0 Drawable drawable) {
        this.d = drawable;
    }
}
