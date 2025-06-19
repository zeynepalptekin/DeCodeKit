package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import b.i.o.i;
import c.a.b.c.a;
import c.a.b.c.u.j;
import c.a.b.c.u.o;
import java.util.ArrayList;

@m0(21)
/* loaded from: classes.dex */
class e extends d {

    static class a extends j {
        a(o oVar) {
            super(oVar);
        }

        @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    e(FloatingActionButton floatingActionButton, c.a.b.c.t.c cVar) {
        super(floatingActionButton, cVar);
    }

    @h0
    private Animator m0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(d.F);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void A() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void C() {
        i0();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void E(int[] r3) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.y.isEnabled()) {
                this.y.setElevation(this.h);
                if (this.y.isPressed()) {
                    floatingActionButton = this.y;
                    f = this.j;
                } else if (this.y.isFocused() || this.y.isHovered()) {
                    floatingActionButton = this.y;
                    f = this.i;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.y.setElevation(0.0f);
            floatingActionButton = this.y;
            floatingActionButton.setTranslationZ(f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void F(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.S, m0(f, f3));
            stateListAnimator.addState(d.T, m0(f, f2));
            stateListAnimator.addState(d.U, m0(f, f2));
            stateListAnimator.addState(d.V, m0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, "elevation", f).setDuration(0L));
            int r9 = Build.VERSION.SDK_INT;
            if (r9 >= 22 && r9 <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.F);
            stateListAnimator.addState(d.W, animatorSet);
            stateListAnimator.addState(d.X, m0(0.0f, 0.0f));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (c0()) {
            i0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean N() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void Y(@i0 ColorStateList colorStateList) {
        Drawable drawable = this.f6711c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(c.a.b.c.s.b.d(colorStateList));
        } else {
            super.Y(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    boolean c0() {
        return this.z.c() || !e0();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void g0() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    @h0
    j j() {
        return new a((o) i.f(this.f6709a));
    }

    @h0
    c l0(int r7, ColorStateList colorStateList) {
        Context context = this.y.getContext();
        c cVar = new c((o) i.f(this.f6709a));
        cVar.f(b.i.c.c.e(context, a.e.design_fab_stroke_top_outer_color), b.i.c.c.e(context, a.e.design_fab_stroke_top_inner_color), b.i.c.c.e(context, a.e.design_fab_stroke_end_inner_color), b.i.c.c.e(context, a.e.design_fab_stroke_end_outer_color));
        cVar.e(r7);
        cVar.d(colorStateList);
        return cVar;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public float n() {
        return this.y.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void s(@h0 Rect rect) {
        if (this.z.c()) {
            super.s(rect);
        } else {
            int sizeDimension = !e0() ? (this.k - this.y.getSizeDimension()) / 2 : 0;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    void x(ColorStateList colorStateList, @i0 PorterDuff.Mode mode, ColorStateList colorStateList2, int r6) {
        Drawable layerDrawable;
        j jVarJ = j();
        this.f6710b = jVarJ;
        jVarJ.setTintList(colorStateList);
        if (mode != null) {
            this.f6710b.setTintMode(mode);
        }
        this.f6710b.Y(this.y.getContext());
        if (r6 > 0) {
            this.d = l0(r6, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) i.f(this.d), (Drawable) i.f(this.f6710b)});
        } else {
            this.d = null;
            layerDrawable = this.f6710b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(c.a.b.c.s.b.d(colorStateList2), layerDrawable, null);
        this.f6711c = rippleDrawable;
        this.e = rippleDrawable;
    }
}
