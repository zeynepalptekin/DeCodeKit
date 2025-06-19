package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.m0;
import androidx.annotation.p0;
import b.i.p.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class k extends androidx.appcompat.view.menu.c implements MenuItem {
    static final String q = "MenuItemWrapper";
    private final b.i.g.b.b o;
    private Method p;

    private class a extends b.i.p.b {
        final ActionProvider e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.e = actionProvider;
        }

        @Override // b.i.p.b
        public boolean b() {
            return this.e.hasSubMenu();
        }

        @Override // b.i.p.b
        public View d() {
            return this.e.onCreateActionView();
        }

        @Override // b.i.p.b
        public boolean f() {
            return this.e.onPerformDefaultAction();
        }

        @Override // b.i.p.b
        public void g(SubMenu subMenu) {
            this.e.onPrepareSubMenu(k.this.f(subMenu));
        }
    }

    @m0(16)
    private class b extends a implements ActionProvider.VisibilityListener {
        private b.InterfaceC0071b g;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // b.i.p.b
        public boolean c() {
            return this.e.isVisible();
        }

        @Override // b.i.p.b
        public View e(MenuItem menuItem) {
            return this.e.onCreateActionView(menuItem);
        }

        @Override // b.i.p.b
        public boolean h() {
            return this.e.overridesItemVisibility();
        }

        @Override // b.i.p.b
        public void i() {
            this.e.refreshVisibility();
        }

        @Override // b.i.p.b
        public void l(b.InterfaceC0071b interfaceC0071b) {
            this.g = interfaceC0071b;
            this.e.setVisibilityListener(interfaceC0071b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            b.InterfaceC0071b interfaceC0071b = this.g;
            if (interfaceC0071b != null) {
                interfaceC0071b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    static class c extends FrameLayout implements b.a.f.c {
        final CollapsibleActionView d;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.d = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.d;
        }

        @Override // b.a.f.c
        public void b() {
            this.d.onActionViewExpanded();
        }

        @Override // b.a.f.c
        public void h() {
            this.d.onActionViewCollapsed();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f96a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f96a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f96a.onMenuItemActionCollapse(k.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f96a.onMenuItemActionExpand(k.this.e(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f98a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f98a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f98a.onMenuItemClick(k.this.e(menuItem));
        }
    }

    public k(Context context, b.i.g.b.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.o = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        b.i.p.b bVarB = this.o.b();
        if (bVarB instanceof a) {
            return ((a) bVarB).e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.o.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.o.isVisible();
    }

    public void j(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.p == null) {
                this.p = this.o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.p.invoke(this.o, Boolean.valueOf(z));
        } catch (Exception e2) {
            Log.w(q, "Error while calling setExclusiveCheckable", e2);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b.i.p.b bVar = Build.VERSION.SDK_INT >= 16 ? new b(this.l, actionProvider) : new a(this.l, actionProvider);
        b.i.g.b.b bVar2 = this.o;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int r3) {
        this.o.setActionView(r3);
        View actionView = this.o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.o.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.o.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int r3) {
        this.o.setAlphabeticShortcut(c2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.o.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.o.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.o.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int r2) {
        this.o.setIcon(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.o.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int r3) {
        this.o.setNumericShortcut(c2, r3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.o.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.o.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int r4, int r5) {
        this.o.setShortcut(c2, c3, r4, r5);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int r2) {
        this.o.setShowAsAction(r2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int r2) {
        this.o.setShowAsActionFlags(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int r2) {
        this.o.setTitle(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.o.setVisible(z);
    }
}
