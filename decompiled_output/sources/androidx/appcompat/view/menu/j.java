package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.o;
import b.a.a;
import b.i.p.b;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class j implements b.i.g.b.b {
    private static final String Q = "MenuItemImpl";
    private static final int R = 3;
    private static final int S = 1;
    private static final int T = 2;
    private static final int U = 4;
    private static final int V = 8;
    private static final int W = 16;
    private static final int X = 32;
    static final int Y = 0;
    private Runnable A;
    private MenuItem.OnMenuItemClickListener B;
    private CharSequence C;
    private CharSequence D;
    private int K;
    private View L;
    private b.i.p.b M;
    private MenuItem.OnActionExpandListener N;
    private ContextMenu.ContextMenuInfo P;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private CharSequence p;
    private CharSequence q;
    private Intent r;
    private char s;
    private char u;
    private Drawable w;
    g y;
    private s z;
    private int t = 4096;
    private int v = 4096;
    private int x = 0;
    private ColorStateList E = null;
    private PorterDuff.Mode F = null;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private int J = 16;
    private boolean O = false;

    class a implements b.InterfaceC0071b {
        a() {
        }

        @Override // b.i.p.b.InterfaceC0071b
        public void onActionProviderVisibilityChanged(boolean z) {
            j jVar = j.this;
            jVar.y.M(jVar);
        }
    }

    j(g gVar, int r4, int r5, int r6, int r7, CharSequence charSequence, int r9) {
        this.K = 0;
        this.y = gVar;
        this.l = r5;
        this.m = r4;
        this.n = r6;
        this.o = r7;
        this.p = charSequence;
        this.K = r9;
    }

    private static void f(StringBuilder sb, int r1, int r2, String str) {
        if ((r1 & r2) == r2) {
            sb.append(str);
        }
    }

    private Drawable g(Drawable drawable) {
        if (drawable != null && this.I && (this.G || this.H)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.G) {
                androidx.core.graphics.drawable.a.o(drawable, this.E);
            }
            if (this.H) {
                androidx.core.graphics.drawable.a.p(drawable, this.F);
            }
            this.I = false;
        }
        return drawable;
    }

    public void A(s sVar) {
        this.z = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    boolean B(boolean z) {
        int r0 = this.J;
        int r4 = (z ? 0 : 8) | (r0 & (-9));
        this.J = r4;
        return r0 != r4;
    }

    public boolean C() {
        return this.y.D();
    }

    boolean D() {
        return this.y.K() && j() != 0;
    }

    public boolean E() {
        return (this.K & 4) == 4;
    }

    @Override // b.i.g.b.b
    public b.i.g.b.b a(b.i.p.b bVar) {
        b.i.p.b bVar2 = this.M;
        if (bVar2 != null) {
            bVar2.j();
        }
        this.L = null;
        this.M = bVar;
        this.y.N(true);
        b.i.p.b bVar3 = this.M;
        if (bVar3 != null) {
            bVar3.l(new a());
        }
        return this;
    }

    @Override // b.i.g.b.b
    public b.i.p.b b() {
        return this.M;
    }

    @Override // b.i.g.b.b
    public boolean c() {
        return (d() || q()) ? false : true;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.y.g(this);
        }
        return false;
    }

    @Override // b.i.g.b.b
    public boolean d() {
        return (this.K & 2) == 2;
    }

    public void e() {
        this.y.L(this);
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.y.n(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public View getActionView() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        b.i.p.b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        View viewE = bVar.e(this);
        this.L = viewE;
        return viewE;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.v;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.u;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.w;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.x == 0) {
            return null;
        }
        Drawable drawableD = b.a.b.a.a.d(this.y.x(), this.x);
        this.x = 0;
        this.w = drawableD;
        return g(drawableD);
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.E;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.F;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.P;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.s;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.z;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.q;
        if (charSequence == null) {
            charSequence = this.p;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.D;
    }

    Runnable h() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.z != null;
    }

    public int i() {
        return this.o;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.O;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.J & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.J & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.J & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        b.i.p.b bVar = this.M;
        return (bVar == null || !bVar.h()) ? (this.J & 8) == 0 : (this.J & 8) == 0 && this.M.c();
    }

    char j() {
        return this.y.J() ? this.u : this.s;
    }

    String k() {
        int r0;
        char cJ = j();
        if (cJ == 0) {
            return "";
        }
        Resources resources = this.y.x().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.y.x()).hasPermanentMenuKey()) {
            sb.append(resources.getString(a.k.abc_prepend_shortcut_label));
        }
        int r3 = this.y.J() ? this.v : this.t;
        f(sb, r3, 65536, resources.getString(a.k.abc_menu_meta_shortcut_label));
        f(sb, r3, 4096, resources.getString(a.k.abc_menu_ctrl_shortcut_label));
        f(sb, r3, 2, resources.getString(a.k.abc_menu_alt_shortcut_label));
        f(sb, r3, 1, resources.getString(a.k.abc_menu_shift_shortcut_label));
        f(sb, r3, 4, resources.getString(a.k.abc_menu_sym_shortcut_label));
        f(sb, r3, 8, resources.getString(a.k.abc_menu_function_shortcut_label));
        if (cJ == '\b') {
            r0 = a.k.abc_menu_delete_shortcut_label;
        } else if (cJ == '\n') {
            r0 = a.k.abc_menu_enter_shortcut_label;
        } else {
            if (cJ != ' ') {
                sb.append(cJ);
                return sb.toString();
            }
            r0 = a.k.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(r0));
        return sb.toString();
    }

    CharSequence l(o.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    public boolean m() {
        b.i.p.b bVar;
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null && (bVar = this.M) != null) {
            this.L = bVar.e(this);
        }
        return this.L != null;
    }

    public boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.B;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.y;
        if (gVar.i(gVar, this)) {
            return true;
        }
        Runnable runnable = this.A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.r != null) {
            try {
                this.y.x().startActivity(this.r);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e(Q, "Can't find activity to handle intent; ignoring", e);
            }
        }
        b.i.p.b bVar = this.M;
        return bVar != null && bVar.f();
    }

    public boolean o() {
        return (this.J & 32) == 32;
    }

    public boolean p() {
        return (this.J & 4) != 0;
    }

    public boolean q() {
        return (this.K & 1) == 1;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public b.i.g.b.b setActionView(int r4) {
        Context contextX = this.y.x();
        setActionView(LayoutInflater.from(contextX).inflate(r4, (ViewGroup) new LinearLayout(contextX), false));
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public b.i.g.b.b setActionView(View view) {
        int r0;
        this.L = view;
        this.M = null;
        if (view != null && view.getId() == -1 && (r0 = this.l) > 0) {
            view.setId(r0);
        }
        this.y.L(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.u == c2) {
            return this;
        }
        this.u = Character.toLowerCase(c2);
        this.y.N(false);
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int r3) {
        if (this.u == c2 && this.v == r3) {
            return this;
        }
        this.u = Character.toLowerCase(c2);
        this.v = KeyEvent.normalizeMetaState(r3);
        this.y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int r0 = this.J;
        int r3 = (z ? 1 : 0) | (r0 & (-2));
        this.J = r3;
        if (r0 != r3) {
            this.y.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.J & 4) != 0) {
            this.y.a0(this);
        } else {
            v(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public b.i.g.b.b setContentDescription(CharSequence charSequence) {
        this.C = charSequence;
        this.y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.J = z ? this.J | 16 : this.J & (-17);
        this.y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int r2) {
        this.w = null;
        this.x = r2;
        this.I = true;
        this.y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.x = 0;
        this.w = drawable;
        this.I = true;
        this.y.N(false);
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public MenuItem setIconTintList(@i0 ColorStateList colorStateList) {
        this.E = colorStateList;
        this.G = true;
        this.I = true;
        this.y.N(false);
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.F = mode;
        this.H = true;
        this.I = true;
        this.y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.s == c2) {
            return this;
        }
        this.s = c2;
        this.y.N(false);
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int r3) {
        if (this.s == c2 && this.t == r3) {
            return this;
        }
        this.s = c2;
        this.t = KeyEvent.normalizeMetaState(r3);
        this.y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.N = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.B = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.s = c2;
        this.u = Character.toLowerCase(c3);
        this.y.N(false);
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int r3, int r4) {
        this.s = c2;
        this.t = KeyEvent.normalizeMetaState(r3);
        this.u = Character.toLowerCase(c3);
        this.v = KeyEvent.normalizeMetaState(r4);
        this.y.N(false);
        return this;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    public void setShowAsAction(int r3) {
        int r0 = r3 & 3;
        if (r0 != 0 && r0 != 1 && r0 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.K = r3;
        this.y.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int r2) {
        return setTitle(this.y.x().getString(r2));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.p = charSequence;
        this.y.N(false);
        s sVar = this.z;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.q = charSequence;
        this.y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public b.i.g.b.b setTooltipText(CharSequence charSequence) {
        this.D = charSequence;
        this.y.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (B(z)) {
            this.y.M(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.O = z;
        this.y.N(false);
    }

    public String toString() {
        CharSequence charSequence = this.p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.A = runnable;
        return this;
    }

    void v(boolean z) {
        int r0 = this.J;
        int r4 = (z ? 2 : 0) | (r0 & (-3));
        this.J = r4;
        if (r0 != r4) {
            this.y.N(false);
        }
    }

    public void w(boolean z) {
        this.J = (z ? 4 : 0) | (this.J & (-5));
    }

    public void x(boolean z) {
        this.J = z ? this.J | 32 : this.J & (-33);
    }

    void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.P = contextMenuInfo;
    }

    @Override // b.i.g.b.b, android.view.MenuItem
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public b.i.g.b.b setShowAsActionFlags(int r1) {
        setShowAsAction(r1);
        return this;
    }
}
