package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@TargetApi(28)
/* loaded from: classes.dex */
public final class kp extends lp {
    static /* synthetic */ WindowInsets w(Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.p.g().r().E() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                qo qoVarR = com.google.android.gms.ads.internal.p.g().r();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = String.valueOf(strConcat).concat("|");
                    }
                    String strValueOf = String.valueOf(strConcat);
                    String strValueOf2 = String.valueOf(str);
                    strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                }
                qoVarR.r(strConcat);
            } else {
                com.google.android.gms.ads.internal.p.g().r().r("");
            }
        }
        x(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static void x(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int r1 = attributes.layoutInDisplayCutoutMode;
        int r2 = z ? 1 : 2;
        if (r2 != r1) {
            attributes.layoutInDisplayCutoutMode = r2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final void p(final Activity activity) {
        if (((Boolean) qx2.e().c(e0.F0)).booleanValue() && com.google.android.gms.ads.internal.p.g().r().E() == null && !activity.isInMultiWindowMode()) {
            x(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this, activity) { // from class: com.google.android.gms.internal.ads.np

                /* renamed from: a, reason: collision with root package name */
                private final kp f4582a;

                /* renamed from: b, reason: collision with root package name */
                private final Activity f4583b;

                {
                    this.f4582a = this;
                    this.f4583b = activity;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return kp.w(this.f4583b, view, windowInsets);
                }
            });
        }
    }
}
