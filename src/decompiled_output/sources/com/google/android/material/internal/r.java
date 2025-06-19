package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.w.g0;
import b.w.n0;
import java.util.Map;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class r extends g0 {
    private static final String Z = "android:textscale:scale";

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f6752a;

        a(TextView textView) {
            this.f6752a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@h0 ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f6752a.setScaleX(fFloatValue);
            this.f6752a.setScaleY(fFloatValue);
        }
    }

    private void L0(@h0 n0 n0Var) {
        View view = n0Var.f1494b;
        if (view instanceof TextView) {
            n0Var.f1493a.put(Z, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // b.w.g0
    public void n(@h0 n0 n0Var) {
        L0(n0Var);
    }

    @Override // b.w.g0
    public void q(@h0 n0 n0Var) {
        L0(n0Var);
    }

    @Override // b.w.g0
    public Animator u(@h0 ViewGroup viewGroup, @i0 n0 n0Var, @i0 n0 n0Var2) {
        if (n0Var == null || n0Var2 == null || !(n0Var.f1494b instanceof TextView)) {
            return null;
        }
        View view = n0Var2.f1494b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = n0Var.f1493a;
        Map<String, Object> map2 = n0Var2.f1493a;
        float fFloatValue = map.get(Z) != null ? ((Float) map.get(Z)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(Z) != null ? ((Float) map2.get(Z)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
