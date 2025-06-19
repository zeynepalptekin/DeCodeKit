package b.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class f extends g0 {
    private static final String a0 = "android:clipBounds:bounds";
    private static final String Z = "android:clipBounds:clip";
    private static final String[] b0 = {Z};

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1404a;

        a(View view) {
            this.f1404a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.i.p.f0.F1(this.f1404a, null);
        }
    }

    public f() {
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void L0(n0 n0Var) {
        View view = n0Var.f1494b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rectN = b.i.p.f0.N(view);
        n0Var.f1493a.put(Z, rectN);
        if (rectN == null) {
            n0Var.f1493a.put(a0, new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // b.w.g0
    public String[] e0() {
        return b0;
    }

    @Override // b.w.g0
    public void n(@androidx.annotation.h0 n0 n0Var) {
        L0(n0Var);
    }

    @Override // b.w.g0
    public void q(@androidx.annotation.h0 n0 n0Var) {
        L0(n0Var);
    }

    @Override // b.w.g0
    public Animator u(@androidx.annotation.h0 ViewGroup viewGroup, n0 n0Var, n0 n0Var2) {
        ObjectAnimator objectAnimatorOfObject = null;
        if (n0Var != null && n0Var2 != null && n0Var.f1493a.containsKey(Z) && n0Var2.f1493a.containsKey(Z)) {
            Rect rect = (Rect) n0Var.f1493a.get(Z);
            Rect rect2 = (Rect) n0Var2.f1493a.get(Z);
            boolean z = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) n0Var.f1493a.get(a0);
            } else if (rect2 == null) {
                rect2 = (Rect) n0Var2.f1493a.get(a0);
            }
            if (rect.equals(rect2)) {
                return null;
            }
            b.i.p.f0.F1(n0Var2.f1494b, rect);
            objectAnimatorOfObject = ObjectAnimator.ofObject(n0Var2.f1494b, (Property<View, V>) y0.d, (TypeEvaluator) new b0(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z) {
                objectAnimatorOfObject.addListener(new a(n0Var2.f1494b));
            }
        }
        return objectAnimatorOfObject;
    }
}
