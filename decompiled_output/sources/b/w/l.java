package b.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class l extends f1 {
    private static final String g0 = "android:fade:transitionAlpha";
    private static final String h0 = "Fade";
    public static final int i0 = 1;
    public static final int j0 = 2;

    class a extends i0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1469a;

        a(View view) {
            this.f1469a = view;
        }

        @Override // b.w.i0, b.w.g0.h
        public void e(@androidx.annotation.h0 g0 g0Var) {
            y0.h(this.f1469a, 1.0f);
            y0.a(this.f1469a);
            g0Var.s0(this);
        }
    }

    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final View f1471a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f1472b = false;

        b(View view) {
            this.f1471a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y0.h(this.f1471a, 1.0f);
            if (this.f1472b) {
                this.f1471a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (b.i.p.f0.G0(this.f1471a) && this.f1471a.getLayerType() == 0) {
                this.f1472b = true;
                this.f1471a.setLayerType(2, null);
            }
        }
    }

    public l() {
    }

    public l(int r1) {
        T0(r1);
    }

    @SuppressLint({"RestrictedApi"})
    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f);
        T0(b.i.c.j.h.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, M0()));
        typedArrayObtainStyledAttributes.recycle();
    }

    private Animator U0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        y0.h(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, y0.f1523c, f2);
        objectAnimatorOfFloat.addListener(new b(view));
        b(new a(view));
        return objectAnimatorOfFloat;
    }

    private static float V0(n0 n0Var, float f) {
        Float f2;
        return (n0Var == null || (f2 = (Float) n0Var.f1493a.get(g0)) == null) ? f : f2.floatValue();
    }

    @Override // b.w.f1
    public Animator P0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        float fV0 = V0(n0Var, 0.0f);
        return U0(view, fV0 != 1.0f ? fV0 : 0.0f, 1.0f);
    }

    @Override // b.w.f1
    public Animator R0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        y0.e(view);
        return U0(view, V0(n0Var, 1.0f), 0.0f);
    }

    @Override // b.w.f1, b.w.g0
    public void q(@androidx.annotation.h0 n0 n0Var) {
        super.q(n0Var);
        n0Var.f1493a.put(g0, Float.valueOf(y0.c(n0Var.f1494b)));
    }
}
