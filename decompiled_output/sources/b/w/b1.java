package b.w;

import android.annotation.SuppressLint;
import android.view.View;

@androidx.annotation.m0(22)
/* loaded from: classes.dex */
class b1 extends a1 {
    private static boolean l = true;

    b1() {
    }

    @Override // b.w.e1
    @SuppressLint({"NewApi"})
    public void f(@androidx.annotation.h0 View view, int r3, int r4, int r5, int r6) {
        if (l) {
            try {
                view.setLeftTopRightBottom(r3, r4, r5, r6);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }
}
