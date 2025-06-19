package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class j {
    private j() {
    }

    @i0
    public static View.OnTouchListener a(@h0 Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            return ((PopupMenu) obj).getDragToOpenListener();
        }
        return null;
    }
}
