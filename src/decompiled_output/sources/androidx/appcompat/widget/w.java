package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import b.a.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class w extends s {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;

    w(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    private void f() {
        if (this.e != null) {
            if (this.h || this.i) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(this.e.mutate());
                this.e = drawableR;
                if (this.h) {
                    androidx.core.graphics.drawable.a.o(drawableR, this.f);
                }
                if (this.i) {
                    androidx.core.graphics.drawable.a.p(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.s
    void c(AttributeSet attributeSet, int r10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.c(attributeSet, r10);
        a1 a1VarG = a1.G(this.d.getContext(), attributeSet, a.m.AppCompatSeekBar, r10, 0);
        SeekBar seekBar = this.d;
        b.i.p.f0.s1(seekBar, seekBar.getContext(), a.m.AppCompatSeekBar, attributeSet, a1VarG.B(), r10, 0);
        Drawable drawableI = a1VarG.i(a.m.AppCompatSeekBar_android_thumb);
        if (drawableI != null) {
            this.d.setThumb(drawableI);
        }
        m(a1VarG.h(a.m.AppCompatSeekBar_tickMark));
        if (a1VarG.C(a.m.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = f0.e(a1VarG.o(a.m.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (a1VarG.C(a.m.AppCompatSeekBar_tickMarkTint)) {
            this.f = a1VarG.d(a.m.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        a1VarG.I();
        f();
    }

    void g(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int r2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int r1 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-r2, -r1, r2, r1);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int r22 = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int r3 = 0; r3 <= max; r3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(r22);
            }
        }
    }

    void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    @androidx.annotation.i0
    Drawable i() {
        return this.e;
    }

    @androidx.annotation.i0
    ColorStateList j() {
        return this.f;
    }

    @androidx.annotation.i0
    PorterDuff.Mode k() {
        return this.g;
    }

    void l() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void m(@androidx.annotation.i0 Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            androidx.core.graphics.drawable.a.m(drawable, b.i.p.f0.W(this.d));
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            f();
        }
        this.d.invalidate();
    }

    void n(@androidx.annotation.i0 ColorStateList colorStateList) {
        this.f = colorStateList;
        this.h = true;
        f();
    }

    void o(@androidx.annotation.i0 PorterDuff.Mode mode) {
        this.g = mode;
        this.i = true;
        f();
    }
}
