package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class t extends p implements SubMenu {
    private final b.i.g.b.c p;

    t(Context context, b.i.g.b.c cVar) {
        super(context, cVar);
        this.p = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.p.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return e(this.p.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int r2) {
        this.p.setHeaderIcon(r2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.p.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int r2) {
        this.p.setHeaderTitle(r2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.p.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.p.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int r2) {
        this.p.setIcon(r2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.p.setIcon(drawable);
        return this;
    }
}
