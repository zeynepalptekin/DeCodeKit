package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.d;
import b.a.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class s0 extends b.i.p.b {
    private static final int k = 4;
    public static final String l = "share_history.xml";
    private int e;
    private final c f;
    final Context g;
    String h;
    a i;
    private d.f j;

    public interface a {
        boolean a(s0 s0Var, Intent intent);
    }

    private class b implements d.f {
        b() {
        }

        @Override // androidx.appcompat.widget.d.f
        public boolean a(d dVar, Intent intent) {
            s0 s0Var = s0.this;
            a aVar = s0Var.i;
            if (aVar == null) {
                return false;
            }
            aVar.a(s0Var, intent);
            return false;
        }
    }

    private class c implements MenuItem.OnMenuItemClickListener {
        c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            s0 s0Var = s0.this;
            Intent intentB = d.d(s0Var.g, s0Var.h).b(menuItem.getItemId());
            if (intentB == null) {
                return true;
            }
            String action = intentB.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                s0.this.r(intentB);
            }
            s0.this.g.startActivity(intentB);
            return true;
        }
    }

    public s0(Context context) {
        super(context);
        this.e = 4;
        this.f = new c();
        this.h = l;
        this.g = context;
    }

    private void n() {
        if (this.i == null) {
            return;
        }
        if (this.j == null) {
            this.j = new b();
        }
        d.d(this.g, this.h).u(this.j);
    }

    @Override // b.i.p.b
    public boolean b() {
        return true;
    }

    @Override // b.i.p.b
    public View d() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(d.d(this.g, this.h));
        }
        TypedValue typedValue = new TypedValue();
        this.g.getTheme().resolveAttribute(a.b.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(b.a.b.a.a.d(this.g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(a.k.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(a.k.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    @Override // b.i.p.b
    public void g(SubMenu subMenu) {
        subMenu.clear();
        d dVarD = d.d(this.g, this.h);
        PackageManager packageManager = this.g.getPackageManager();
        int r2 = dVarD.f();
        int r3 = Math.min(r2, this.e);
        for (int r5 = 0; r5 < r3; r5++) {
            ResolveInfo resolveInfoE = dVarD.e(r5);
            subMenu.add(0, r5, r5, resolveInfoE.loadLabel(packageManager)).setIcon(resolveInfoE.loadIcon(packageManager)).setOnMenuItemClickListener(this.f);
        }
        if (r3 < r2) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, r3, r3, this.g.getString(a.k.abc_activity_chooser_view_see_all));
            for (int r32 = 0; r32 < r2; r32++) {
                ResolveInfo resolveInfoE2 = dVarD.e(r32);
                subMenuAddSubMenu.add(0, r32, r32, resolveInfoE2.loadLabel(packageManager)).setIcon(resolveInfoE2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f);
            }
        }
    }

    public void o(a aVar) {
        this.i = aVar;
        n();
    }

    public void p(String str) {
        this.h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        d.d(this.g, this.h).t(intent);
    }

    void r(Intent intent) {
        intent.addFlags(Build.VERSION.SDK_INT >= 21 ? 134742016 : 524288);
    }
}
