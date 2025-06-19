package b.w;

import android.annotation.SuppressLint;
import android.view.View;

@androidx.annotation.m0(19)
/* loaded from: classes.dex */
class z0 extends e1 {
    private static boolean h = true;

    z0() {
    }

    @Override // b.w.e1
    public void a(@androidx.annotation.h0 View view) {
    }

    @Override // b.w.e1
    @SuppressLint({"NewApi"})
    public float c(@androidx.annotation.h0 View view) {
        if (h) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        return view.getAlpha();
    }

    @Override // b.w.e1
    public void d(@androidx.annotation.h0 View view) {
    }

    @Override // b.w.e1
    @SuppressLint({"NewApi"})
    public void g(@androidx.annotation.h0 View view, float f) {
        if (h) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        view.setAlpha(f);
    }
}
