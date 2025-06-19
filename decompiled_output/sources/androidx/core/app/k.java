package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class k {
    private k() {
    }

    @h0
    public static View a(@h0 Dialog dialog, int r3) {
        if (Build.VERSION.SDK_INT >= 28) {
            return dialog.requireViewById(r3);
        }
        View viewFindViewById = dialog.findViewById(r3);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
