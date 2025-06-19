package c.a.b.c.z;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    private float f2068a = 1.0f;

    static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2069a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f2070b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f2071c;
        final /* synthetic */ float d;
        final /* synthetic */ float e;

        a(View view, float f, float f2, float f3, float f4) {
            this.f2069a = view;
            this.f2070b = f;
            this.f2071c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2069a.setAlpha(u.l(this.f2070b, this.f2071c, this.d, this.e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    private static Animator c(View view, float f, float f2, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f3, @androidx.annotation.r(from = 0.0d, to = 1.0d) float f4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(view, f, f2, f3, f4));
        return valueAnimatorOfFloat;
    }

    @Override // c.a.b.c.z.v
    @i0
    public Animator a(@h0 ViewGroup viewGroup, @h0 View view) {
        return c(view, 0.0f, 1.0f, 0.0f, this.f2068a);
    }

    @Override // c.a.b.c.z.v
    @i0
    public Animator b(@h0 ViewGroup viewGroup, @h0 View view) {
        return c(view, 1.0f, 0.0f, 0.0f, 1.0f);
    }

    public float d() {
        return this.f2068a;
    }

    public void e(float f) {
        this.f2068a = f;
    }
}
