package b.w;

import android.graphics.Rect;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class j extends g1 {
    private float d = 3.0f;

    private static float h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    @Override // b.w.k0
    public long c(ViewGroup viewGroup, g0 g0Var, n0 n0Var, n0 n0Var2) {
        int r12;
        int r4;
        int r2;
        if (n0Var == null && n0Var2 == null) {
            return 0L;
        }
        if (n0Var2 == null || e(n0Var) == 0) {
            r12 = -1;
        } else {
            n0Var = n0Var2;
            r12 = 1;
        }
        int r3 = f(n0Var);
        int r11 = g(n0Var);
        Rect rectQ = g0Var.Q();
        if (rectQ != null) {
            r2 = rectQ.centerX();
            r4 = rectQ.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int r6 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            r4 = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            r2 = r6;
        }
        float fH = h(r3, r11, r2, r4) / h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long jO = g0Var.O();
        if (jO < 0) {
            jO = 300;
        }
        return Math.round(((jO * r12) / this.d) * fH);
    }

    public void i(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.d = f;
    }
}
