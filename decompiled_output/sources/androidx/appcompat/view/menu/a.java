package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.i0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a implements b.i.g.b.b {
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 4;
    private static final int I = 8;
    private static final int J = 16;
    private final int l;
    private final int m;
    private final int n;
    private CharSequence o;
    private CharSequence p;
    private Intent q;
    private char r;
    private char t;
    private Drawable v;
    private Context w;
    private MenuItem.OnMenuItemClickListener x;
    private CharSequence y;
    private CharSequence z;
    private int s = 4096;
    private int u = 4096;
    private ColorStateList A = null;
    private PorterDuff.Mode B = null;
    private boolean C = false;
    private boolean D = false;
    private int E = 16;

    public a(Context context, int r2, int r3, int r4, int r5, CharSequence charSequence) {
        this.w = context;
        this.l = r3;
        this.m = r2;
        this.n = r5;
        this.o = charSequence;
    }

    private void e() {
        if (this.v != null) {
            if (this.C || this.D) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(this.v);
                this.v = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.v = drawableMutate;
                if (this.C) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.A);
                }
                if (this.D) {
                    androidx.core.graphics.drawable.a.p(this.v, this.B);
                }
            }
        }
    }

    @Override // b.i.g.b.b
    public b.i.g.b.b a(b.i.p.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // b.i.g.b.b
    public b.i.p.b b() {
        return null;
    }

    @Override // b.i.g.b.b
    public boolean c() {
        return false;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // b.i.g.b.b
    public boolean d() {
        return true;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.q;
        if (intent == null) {
            return false;
        }
        this.w.startActivity(intent);
        return true;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b.i.g.b.b setActionView(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.t;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.y;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.v;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.A;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.s;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.p;
        return charSequence != null ? charSequence : this.o;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.z;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b.i.g.b.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public a i(boolean z) {
        this.E = (z ? 4 : 0) | (this.E & (-5));
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.E & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.E & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.E & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.E & 8) == 0;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b.i.g.b.b setShowAsActionFlags(int r1) {
        setShowAsAction(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.t = Character.toLowerCase(c2);
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int r2) {
        this.t = Character.toLowerCase(c2);
        this.u = KeyEvent.normalizeMetaState(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.E = (z ? 1 : 0) | (this.E & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.E = (z ? 2 : 0) | (this.E & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public b.i.g.b.b setContentDescription(CharSequence charSequence) {
        this.y = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.E = (z ? 16 : 0) | (this.E & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int r2) {
        this.v = b.i.c.c.h(this.w, r2);
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.v = drawable;
        e();
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public MenuItem setIconTintList(@i0 ColorStateList colorStateList) {
        this.A = colorStateList;
        this.C = true;
        e();
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.B = mode;
        this.D = true;
        e();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.q = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.r = c2;
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int r2) {
        this.r = c2;
        this.s = KeyEvent.normalizeMetaState(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.x = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.r = c2;
        this.t = Character.toLowerCase(c3);
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int r3, int r4) {
        this.r = c2;
        this.s = KeyEvent.normalizeMetaState(r3);
        this.t = Character.toLowerCase(c3);
        this.u = KeyEvent.normalizeMetaState(r4);
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public void setShowAsAction(int r1) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int r2) {
        this.o = this.w.getResources().getString(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public b.i.g.b.b setTooltipText(CharSequence charSequence) {
        this.z = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.E = (this.E & 8) | (z ? 0 : 8);
        return this;
    }
}
