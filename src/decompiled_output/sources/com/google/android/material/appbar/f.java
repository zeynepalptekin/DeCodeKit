package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.h0;
import androidx.annotation.m0;
import c.a.b.c.a;
import com.google.android.material.internal.s;

@m0(21)
/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6611a = {R.attr.stateListAnimator};

    f() {
    }

    static void a(@h0 View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void b(@h0 View view, float f) throws Resources.NotFoundException {
        int integer = view.getResources().getInteger(a.i.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, a.c.state_liftable, -a.c.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    static void c(@h0 View view, AttributeSet attributeSet, int r10, int r11) {
        Context context = view.getContext();
        TypedArray typedArrayJ = s.j(context, attributeSet, f6611a, r10, r11, new int[0]);
        try {
            if (typedArrayJ.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayJ.getResourceId(0, 0)));
            }
        } finally {
            typedArrayJ.recycle();
        }
    }
}
