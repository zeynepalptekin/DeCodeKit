package b.i.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1227a = "MenuItemCompat";

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f1228b = 0;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f1229c = 1;

    @Deprecated
    public static final int d = 2;

    @Deprecated
    public static final int e = 4;

    @Deprecated
    public static final int f = 8;

    class a implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f1230a;

        a(b bVar) {
            this.f1230a = bVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1230a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1230a.onMenuItemActionExpand(menuItem);
        }
    }

    @Deprecated
    public interface b {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private o() {
    }

    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    public static b.i.p.b c(MenuItem menuItem) {
        if (menuItem instanceof b.i.g.b.b) {
            return ((b.i.g.b.b) menuItem).b();
        }
        Log.w(f1227a, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(MenuItem menuItem) {
        if (menuItem instanceof b.i.g.b.b) {
            return ((b.i.g.b.b) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getAlphabeticModifiers();
        }
        return 0;
    }

    public static CharSequence f(MenuItem menuItem) {
        if (menuItem instanceof b.i.g.b.b) {
            return ((b.i.g.b.b) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getContentDescription();
        }
        return null;
    }

    public static ColorStateList g(MenuItem menuItem) {
        if (menuItem instanceof b.i.g.b.b) {
            return ((b.i.g.b.b) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintList();
        }
        return null;
    }

    public static PorterDuff.Mode h(MenuItem menuItem) {
        if (menuItem instanceof b.i.g.b.b) {
            return ((b.i.g.b.b) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintMode();
        }
        return null;
    }

    public static int i(MenuItem menuItem) {
        if (menuItem instanceof b.i.g.b.b) {
            return ((b.i.g.b.b) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getNumericModifiers();
        }
        return 0;
    }

    public static CharSequence j(MenuItem menuItem) {
        if (menuItem instanceof b.i.g.b.b) {
            return ((b.i.g.b.b) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getTooltipText();
        }
        return null;
    }

    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    public static MenuItem l(MenuItem menuItem, b.i.p.b bVar) {
        if (menuItem instanceof b.i.g.b.b) {
            return ((b.i.g.b.b) menuItem).a(bVar);
        }
        Log.w(f1227a, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    public static MenuItem m(MenuItem menuItem, int r1) {
        return menuItem.setActionView(r1);
    }

    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(MenuItem menuItem, char c2, int r4) {
        if (menuItem instanceof b.i.g.b.b) {
            ((b.i.g.b.b) menuItem).setAlphabeticShortcut(c2, r4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c2, r4);
        }
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof b.i.g.b.b) {
            ((b.i.g.b.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void q(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof b.i.g.b.b) {
            ((b.i.g.b.b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static void r(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof b.i.g.b.b) {
            ((b.i.g.b.b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    public static void s(MenuItem menuItem, char c2, int r4) {
        if (menuItem instanceof b.i.g.b.b) {
            ((b.i.g.b.b) menuItem).setNumericShortcut(c2, r4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c2, r4);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, b bVar) {
        return menuItem.setOnActionExpandListener(new a(bVar));
    }

    public static void u(MenuItem menuItem, char c2, char c3, int r5, int r6) {
        if (menuItem instanceof b.i.g.b.b) {
            ((b.i.g.b.b) menuItem).setShortcut(c2, c3, r5, r6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setShortcut(c2, c3, r5, r6);
        }
    }

    @Deprecated
    public static void v(MenuItem menuItem, int r1) {
        menuItem.setShowAsAction(r1);
    }

    public static void w(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof b.i.g.b.b) {
            ((b.i.g.b.b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
