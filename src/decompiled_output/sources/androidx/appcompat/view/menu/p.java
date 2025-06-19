package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class p extends c implements Menu {
    private final b.i.g.b.a o;

    public p(Context context, b.i.g.b.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.o = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int r2) {
        return e(this.o.add(r2));
    }

    @Override // android.view.Menu
    public MenuItem add(int r2, int r3, int r4, int r5) {
        return e(this.o.add(r2, r3, r4, r5));
    }

    @Override // android.view.Menu
    public MenuItem add(int r2, int r3, int r4, CharSequence charSequence) {
        return e(this.o.add(r2, r3, r4, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return e(this.o.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r13, int r14, int r15, ComponentName componentName, Intent[] intentArr, Intent intent, int r19, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int r3 = this.o.addIntentOptions(r13, r14, r15, componentName, intentArr, intent, r19, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int r4 = 0; r4 < length; r4++) {
                menuItemArr[r4] = e(menuItemArr2[r4]);
            }
        }
        return r3;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r2) {
        return f(this.o.addSubMenu(r2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
        return f(this.o.addSubMenu(r2, r3, r4, r5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int r2, int r3, int r4, CharSequence charSequence) {
        return f(this.o.addSubMenu(r2, r3, r4, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return f(this.o.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        g();
        this.o.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.o.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int r2) {
        return e(this.o.findItem(r2));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int r2) {
        return e(this.o.getItem(r2));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r2, KeyEvent keyEvent) {
        return this.o.isShortcutKey(r2, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r2, int r3) {
        return this.o.performIdentifierAction(r2, r3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r2, KeyEvent keyEvent, int r4) {
        return this.o.performShortcut(r2, keyEvent, r4);
    }

    @Override // android.view.Menu
    public void removeGroup(int r2) {
        h(r2);
        this.o.removeGroup(r2);
    }

    @Override // android.view.Menu
    public void removeItem(int r2) {
        i(r2);
        this.o.removeItem(r2);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r2, boolean z, boolean z2) {
        this.o.setGroupCheckable(r2, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r2, boolean z) {
        this.o.setGroupEnabled(r2, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r2, boolean z) {
        this.o.setGroupVisible(r2, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.o.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.o.size();
    }
}
