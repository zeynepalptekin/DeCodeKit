package b.w;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import b.w.a0;

/* loaded from: classes.dex */
public class k extends f1 {
    private static final TimeInterpolator h0 = new DecelerateInterpolator();
    private static final TimeInterpolator i0 = new AccelerateInterpolator();
    private static final String j0 = "android:explode:screenBounds";
    private int[] g0;

    public k() {
        this.g0 = new int[2];
        G0(new j());
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g0 = new int[2];
        G0(new j());
    }

    private void L0(n0 n0Var) {
        View view = n0Var.f1494b;
        view.getLocationOnScreen(this.g0);
        int[] r1 = this.g0;
        int r2 = r1[0];
        int r12 = r1[1];
        n0Var.f1493a.put(j0, new Rect(r2, r12, view.getWidth() + r2, view.getHeight() + r12));
    }

    private static float U0(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    private static float V0(View view, int r2, int r3) {
        return U0(Math.max(r2, view.getWidth() - r2), Math.max(r3, view.getHeight() - r3));
    }

    private void W0(View view, Rect rect, int[] r18) {
        int height;
        int width;
        view.getLocationOnScreen(this.g0);
        int[] r2 = this.g0;
        int r4 = r2[0];
        int r22 = r2[1];
        Rect rectQ = Q();
        if (rectQ == null) {
            width = (view.getWidth() / 2) + r4 + Math.round(view.getTranslationX());
            height = (view.getHeight() / 2) + r22 + Math.round(view.getTranslationY());
        } else {
            int r7 = rectQ.centerX();
            height = rectQ.centerY();
            width = r7;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - height;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fU0 = U0(fCenterX, fCenterY);
        float fV0 = V0(view, width - r4, height - r22);
        r18[0] = Math.round((fCenterX / fU0) * fV0);
        r18[1] = Math.round(fV0 * (fCenterY / fU0));
    }

    @Override // b.w.f1
    public Animator P0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        if (n0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) n0Var2.f1493a.get(j0);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        W0(viewGroup, rect, this.g0);
        int[] r11 = this.g0;
        return p0.a(view, n0Var2, rect.left, rect.top, translationX + r11[0], translationY + r11[1], translationX, translationY, h0, this);
    }

    @Override // b.w.f1
    public Animator R0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        float f;
        float f2;
        if (n0Var == null) {
            return null;
        }
        Rect rect = (Rect) n0Var.f1493a.get(j0);
        int r2 = rect.left;
        int r3 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] r0 = (int[]) n0Var.f1494b.getTag(a0.e.transition_position);
        if (r0 != null) {
            f = (r0[0] - rect.left) + translationX;
            f2 = (r0[1] - rect.top) + translationY;
            rect.offsetTo(r0[0], r0[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        W0(viewGroup, rect, this.g0);
        int[] r11 = this.g0;
        return p0.a(view, n0Var, r2, r3, translationX, translationY, f + r11[0], f2 + r11[1], i0, this);
    }

    @Override // b.w.f1, b.w.g0
    public void n(@androidx.annotation.h0 n0 n0Var) {
        super.n(n0Var);
        L0(n0Var);
    }

    @Override // b.w.f1, b.w.g0
    public void q(@androidx.annotation.h0 n0 n0Var) {
        super.q(n0Var);
        L0(n0Var);
    }
}
