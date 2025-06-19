package b.w;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

@androidx.annotation.m0(21)
/* loaded from: classes.dex */
class a1 extends z0 {
    private static boolean i = true;
    private static boolean j = true;
    private static boolean k = true;

    a1() {
    }

    @Override // b.w.e1
    @SuppressLint({"NewApi"})
    public void e(@androidx.annotation.h0 View view, @androidx.annotation.i0 Matrix matrix) {
        if (i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    @Override // b.w.e1
    @SuppressLint({"NewApi"})
    public void i(@androidx.annotation.h0 View view, @androidx.annotation.h0 Matrix matrix) {
        if (j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    @Override // b.w.e1
    @SuppressLint({"NewApi"})
    public void j(@androidx.annotation.h0 View view, @androidx.annotation.h0 Matrix matrix) {
        if (k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}
