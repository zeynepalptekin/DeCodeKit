package b.i.d.c;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class a {
    private a() {
    }

    public static void a(@h0 SQLiteCursor sQLiteCursor, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }
}
