package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class c1 {
    private c1() {
    }

    public static void a(@androidx.annotation.h0 View view, @androidx.annotation.i0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            d1.f(view, charSequence);
        }
    }
}
