package c.a.b.c.d;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.h0;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class b extends g {
    public static final int Q = 5;

    public b(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.g
    protected MenuItem a(int r4, int r5, int r6, CharSequence charSequence) {
        if (size() + 1 > 5) {
            throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
        }
        m0();
        MenuItem menuItemA = super.a(r4, r5, r6, charSequence);
        if (menuItemA instanceof j) {
            ((j) menuItemA).w(true);
        }
        l0();
        return menuItemA;
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @h0
    public SubMenu addSubMenu(int r1, int r2, int r3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
