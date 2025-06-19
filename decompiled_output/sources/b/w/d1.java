package b.w;

import android.graphics.Matrix;
import android.view.View;

@androidx.annotation.m0(29)
/* loaded from: classes.dex */
class d1 extends c1 {
    d1() {
    }

    @Override // b.w.z0, b.w.e1
    public float c(@androidx.annotation.h0 View view) {
        return view.getTransitionAlpha();
    }

    @Override // b.w.a1, b.w.e1
    public void e(@androidx.annotation.h0 View view, @androidx.annotation.i0 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // b.w.b1, b.w.e1
    public void f(@androidx.annotation.h0 View view, int r2, int r3, int r4, int r5) {
        view.setLeftTopRightBottom(r2, r3, r4, r5);
    }

    @Override // b.w.z0, b.w.e1
    public void g(@androidx.annotation.h0 View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // b.w.c1, b.w.e1
    public void h(@androidx.annotation.h0 View view, int r2) {
        view.setTransitionVisibility(r2);
    }

    @Override // b.w.a1, b.w.e1
    public void i(@androidx.annotation.h0 View view, @androidx.annotation.h0 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // b.w.a1, b.w.e1
    public void j(@androidx.annotation.h0 View view, @androidx.annotation.h0 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
