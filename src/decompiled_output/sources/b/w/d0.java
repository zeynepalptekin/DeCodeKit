package b.w;

import android.graphics.Rect;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class d0 extends g1 {
    private float d = 3.0f;
    private int e = 80;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int h(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.e
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L19
            int r7 = b.i.p.f0.W(r7)
            if (r7 != r4) goto L12
            goto L13
        L12:
            r4 = 0
        L13:
            if (r4 == 0) goto L17
        L15:
            r0 = 5
            goto L29
        L17:
            r0 = 3
            goto L29
        L19:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L29
            int r7 = b.i.p.f0.W(r7)
            if (r7 != r4) goto L25
            goto L26
        L25:
            r4 = 0
        L26:
            if (r4 == 0) goto L15
            goto L17
        L29:
            if (r0 == r2) goto L51
            if (r0 == r1) goto L48
            r7 = 48
            if (r0 == r7) goto L3f
            r7 = 80
            if (r0 == r7) goto L36
            goto L59
        L36:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L59
        L3f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L59
        L48:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L59
        L51:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.w.d0.h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int i(ViewGroup viewGroup) {
        int r0 = this.e;
        return (r0 == 3 || r0 == 5 || r0 == 8388611 || r0 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // b.w.k0
    public long c(ViewGroup viewGroup, g0 g0Var, n0 n0Var, n0 n0Var2) {
        int r13;
        int r5;
        int r15;
        n0 n0Var3 = n0Var;
        if (n0Var3 == null && n0Var2 == null) {
            return 0L;
        }
        Rect rectQ = g0Var.Q();
        if (n0Var2 == null || e(n0Var3) == 0) {
            r13 = -1;
        } else {
            n0Var3 = n0Var2;
            r13 = 1;
        }
        int r3 = f(n0Var3);
        int r4 = g(n0Var3);
        int[] r52 = new int[2];
        viewGroup.getLocationOnScreen(r52);
        int r6 = r52[0] + Math.round(viewGroup.getTranslationX());
        int r7 = r52[1] + Math.round(viewGroup.getTranslationY());
        int width = r6 + viewGroup.getWidth();
        int height = r7 + viewGroup.getHeight();
        if (rectQ != null) {
            r5 = rectQ.centerX();
            r15 = rectQ.centerY();
        } else {
            r5 = (r6 + width) / 2;
            r15 = (r7 + height) / 2;
        }
        float fH = h(viewGroup, r3, r4, r5, r15, r6, r7, width, height) / i(viewGroup);
        long jO = g0Var.O();
        if (jO < 0) {
            jO = 300;
        }
        return Math.round(((jO * r13) / this.d) * fH);
    }

    public void j(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.d = f;
    }

    public void k(int r1) {
        this.e = r1;
    }
}
