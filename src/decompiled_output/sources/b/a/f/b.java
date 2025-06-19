package b.a.f;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.p0;

/* loaded from: classes.dex */
public abstract class b {
    private Object d;
    private boolean e;

    public interface a {
        boolean a(b bVar, Menu menu);

        void b(b bVar);

        boolean c(b bVar, MenuItem menuItem);

        boolean d(b bVar, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.d;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.e;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean m() {
        return true;
    }

    public abstract void n(View view);

    public abstract void o(int r1);

    public abstract void p(CharSequence charSequence);

    public void q(Object obj) {
        this.d = obj;
    }

    public abstract void r(int r1);

    public abstract void s(CharSequence charSequence);

    public void t(boolean z) {
        this.e = z;
    }
}
