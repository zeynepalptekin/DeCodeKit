package b.w;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

@androidx.annotation.m0(23)
/* loaded from: classes.dex */
class c1 extends b1 {
    private static boolean m = true;

    c1() {
    }

    @Override // b.w.e1
    @SuppressLint({"NewApi"})
    public void h(@androidx.annotation.h0 View view, int r4) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, r4);
        } else if (m) {
            try {
                view.setTransitionVisibility(r4);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }
}
