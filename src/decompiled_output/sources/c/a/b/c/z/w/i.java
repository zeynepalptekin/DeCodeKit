package c.a.b.c.z.w;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;

@m0(21)
/* loaded from: classes.dex */
public final class i extends Visibility {
    @Override // android.transition.Visibility
    @h0
    public Animator onAppear(@h0 ViewGroup viewGroup, @h0 View view, @i0 TransitionValues transitionValues, @i0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @h0
    public Animator onDisappear(@h0 ViewGroup viewGroup, @h0 View view, @i0 TransitionValues transitionValues, @i0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
