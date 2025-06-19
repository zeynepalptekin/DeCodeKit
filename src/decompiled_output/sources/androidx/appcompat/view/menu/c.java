package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
abstract class c {
    final Context l;
    private b.f.i<b.i.g.b.b, MenuItem> m;
    private b.f.i<b.i.g.b.c, SubMenu> n;

    c(Context context) {
        this.l = context;
    }

    final MenuItem e(MenuItem menuItem) {
        if (!(menuItem instanceof b.i.g.b.b)) {
            return menuItem;
        }
        b.i.g.b.b bVar = (b.i.g.b.b) menuItem;
        if (this.m == null) {
            this.m = new b.f.i<>();
        }
        MenuItem menuItem2 = this.m.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k kVar = new k(this.l, bVar);
        this.m.put(bVar, kVar);
        return kVar;
    }

    final SubMenu f(SubMenu subMenu) {
        if (!(subMenu instanceof b.i.g.b.c)) {
            return subMenu;
        }
        b.i.g.b.c cVar = (b.i.g.b.c) subMenu;
        if (this.n == null) {
            this.n = new b.f.i<>();
        }
        SubMenu subMenu2 = this.n.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        t tVar = new t(this.l, cVar);
        this.n.put(cVar, tVar);
        return tVar;
    }

    final void g() {
        b.f.i<b.i.g.b.b, MenuItem> iVar = this.m;
        if (iVar != null) {
            iVar.clear();
        }
        b.f.i<b.i.g.b.c, SubMenu> iVar2 = this.n;
        if (iVar2 != null) {
            iVar2.clear();
        }
    }

    final void h(int r3) {
        if (this.m == null) {
            return;
        }
        int r0 = 0;
        while (r0 < this.m.size()) {
            if (this.m.i(r0).getGroupId() == r3) {
                this.m.k(r0);
                r0--;
            }
            r0++;
        }
    }

    final void i(int r3) {
        if (this.m == null) {
            return;
        }
        for (int r0 = 0; r0 < this.m.size(); r0++) {
            if (this.m.i(r0).getItemId() == r3) {
                this.m.k(r0);
                return;
            }
        }
    }
}
