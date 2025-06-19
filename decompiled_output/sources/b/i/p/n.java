package b.i.p;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes.dex */
public final class n {
    private n() {
    }

    @SuppressLint({"NewApi"})
    public static void a(Menu menu, boolean z) {
        if (menu instanceof b.i.g.b.a) {
            ((b.i.g.b.a) menu).setGroupDividerEnabled(z);
        } else if (Build.VERSION.SDK_INT >= 28) {
            menu.setGroupDividerEnabled(z);
        }
    }

    @Deprecated
    public static void b(MenuItem menuItem, int r1) {
        menuItem.setShowAsAction(r1);
    }
}
