package b.i.p;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.p0;

/* loaded from: classes.dex */
public abstract class b {
    private static final String d = "ActionProvider(support)";

    /* renamed from: a, reason: collision with root package name */
    private final Context f1165a;

    /* renamed from: b, reason: collision with root package name */
    private a f1166b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0071b f1167c;

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        void b(boolean z);
    }

    /* renamed from: b.i.p.b$b, reason: collision with other inner class name */
    public interface InterfaceC0071b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
        this.f1165a = context;
    }

    public Context a() {
        return this.f1165a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public abstract View d();

    public View e(MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.f1167c == null || !h()) {
            return;
        }
        this.f1167c.onActionProviderVisibilityChanged(c());
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void j() {
        this.f1167c = null;
        this.f1166b = null;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void k(a aVar) {
        this.f1166b = aVar;
    }

    public void l(InterfaceC0071b interfaceC0071b) {
        if (this.f1167c != null && interfaceC0071b != null) {
            Log.w(d, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1167c = interfaceC0071b;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void m(boolean z) {
        a aVar = this.f1166b;
        if (aVar != null) {
            aVar.b(z);
        }
    }
}
