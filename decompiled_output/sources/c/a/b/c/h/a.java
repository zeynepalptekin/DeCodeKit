package c.a.b.c.h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.h0;
import c.a.b.c.h.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c.a.b.c.h.a$a, reason: collision with other inner class name */
    static class C0139a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f1961a;

        C0139a(g gVar) {
            this.f1961a = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1961a.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1961a.c();
        }
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @h0
    public static Animator a(@h0 g gVar, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(gVar, (Property<g, V>) g.c.f1967a, (TypeEvaluator) g.b.f1965b, (Object[]) new g.e[]{new g.e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return objectAnimatorOfObject;
        }
        g.e revealInfo = gVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) gVar, (int) f, (int) f2, revealInfo.f1971c, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @h0
    public static Animator b(g gVar, float f, float f2, float f3, float f4) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(gVar, (Property<g, V>) g.c.f1967a, (TypeEvaluator) g.b.f1965b, (Object[]) new g.e[]{new g.e(f, f2, f3), new g.e(f, f2, f4)});
        if (Build.VERSION.SDK_INT < 21) {
            return objectAnimatorOfObject;
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) gVar, (int) f, (int) f2, f3, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    @h0
    public static Animator.AnimatorListener c(@h0 g gVar) {
        return new C0139a(gVar);
    }
}
