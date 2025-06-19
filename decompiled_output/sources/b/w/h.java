package b.w;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class h extends g0 {
    private static final String Z = "android:changeScroll:x";
    private static final String a0 = "android:changeScroll:y";
    private static final String[] b0 = {Z, a0};

    public h() {
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void L0(n0 n0Var) {
        n0Var.f1493a.put(Z, Integer.valueOf(n0Var.f1494b.getScrollX()));
        n0Var.f1493a.put(a0, Integer.valueOf(n0Var.f1494b.getScrollY()));
    }

    @Override // b.w.g0
    @androidx.annotation.i0
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
    @androidx.annotation.i0
    public Animator u(@androidx.annotation.h0 ViewGroup viewGroup, @androidx.annotation.i0 n0 n0Var, @androidx.annotation.i0 n0 n0Var2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (n0Var == null || n0Var2 == null) {
            return null;
        }
        View view = n0Var2.f1494b;
        int r1 = ((Integer) n0Var.f1493a.get(Z)).intValue();
        int r2 = ((Integer) n0Var2.f1493a.get(Z)).intValue();
        int r9 = ((Integer) n0Var.f1493a.get(a0)).intValue();
        int r10 = ((Integer) n0Var2.f1493a.get(a0)).intValue();
        if (r1 != r2) {
            view.setScrollX(r1);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", r1, r2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (r9 != r10) {
            view.setScrollY(r9);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", r9, r10);
        }
        return m0.c(objectAnimatorOfInt, objectAnimatorOfInt2);
    }
}
