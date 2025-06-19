package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i;
import androidx.annotation.i0;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    @i0
    private AnimatorSet e;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.e = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @i
    protected boolean K(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.e != null;
        if (z3) {
            this.e.cancel();
        }
        AnimatorSet animatorSetM = M(view, view2, z, z3);
        this.e = animatorSetM;
        animatorSetM.addListener(new a());
        this.e.start();
        if (!z2) {
            this.e.end();
        }
        return true;
    }

    @h0
    protected abstract AnimatorSet M(View view, View view2, boolean z, boolean z2);
}
