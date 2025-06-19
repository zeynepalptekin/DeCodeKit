package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class g {
    private g() {
    }

    @i0
    public static View.OnTouchListener a(@h0 ListPopupWindow listPopupWindow, @h0 View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return listPopupWindow.createDragToOpenListener(view);
        }
        return null;
    }

    @Deprecated
    public static View.OnTouchListener b(Object obj, View view) {
        return a((ListPopupWindow) obj, view);
    }
}
