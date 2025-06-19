package b.i.d;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class a {
    private a() {
    }

    @h0
    public static CursorWindow a(@i0 String str, long j) {
        int r0 = Build.VERSION.SDK_INT;
        return r0 >= 28 ? new CursorWindow(str, j) : r0 >= 15 ? new CursorWindow(str) : new CursorWindow(false);
    }
}
