package b.a.f;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.ActionBarContextView;
import b.a.f.b;
import java.lang.ref.WeakReference;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e extends b implements g.a {
    private Context f;
    private ActionBarContextView g;
    private b.a h;
    private WeakReference<View> i;
    private boolean j;
    private boolean k;
    private androidx.appcompat.view.menu.g l;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f = context;
        this.g = actionBarContextView;
        this.h = aVar;
        androidx.appcompat.view.menu.g gVarZ = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).Z(1);
        this.l = gVarZ;
        gVarZ.X(this);
        this.k = z;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(@h0 androidx.appcompat.view.menu.g gVar, @h0 MenuItem menuItem) {
        return this.h.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(@h0 androidx.appcompat.view.menu.g gVar) {
        k();
        this.g.o();
    }

    @Override // b.a.f.b
    public void c() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g.sendAccessibilityEvent(32);
        this.h.b(this);
    }

    @Override // b.a.f.b
    public View d() {
        WeakReference<View> weakReference = this.i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // b.a.f.b
    public Menu e() {
        return this.l;
    }

    @Override // b.a.f.b
    public MenuInflater f() {
        return new g(this.g.getContext());
    }

    @Override // b.a.f.b
    public CharSequence g() {
        return this.g.getSubtitle();
    }

    @Override // b.a.f.b
    public CharSequence i() {
        return this.g.getTitle();
    }

    @Override // b.a.f.b
    public void k() {
        this.h.a(this, this.l);
    }

    @Override // b.a.f.b
    public boolean l() {
        return this.g.s();
    }

    @Override // b.a.f.b
    public boolean m() {
        return this.k;
    }

    @Override // b.a.f.b
    public void n(View view) {
        this.g.setCustomView(view);
        this.i = view != null ? new WeakReference<>(view) : null;
    }

    @Override // b.a.f.b
    public void o(int r2) {
        p(this.f.getString(r2));
    }

    @Override // b.a.f.b
    public void p(CharSequence charSequence) {
        this.g.setSubtitle(charSequence);
    }

    @Override // b.a.f.b
    public void r(int r2) {
        s(this.f.getString(r2));
    }

    @Override // b.a.f.b
    public void s(CharSequence charSequence) {
        this.g.setTitle(charSequence);
    }

    @Override // b.a.f.b
    public void t(boolean z) {
        super.t(z);
        this.g.setTitleOptional(z);
    }

    public void u(androidx.appcompat.view.menu.g gVar, boolean z) {
    }

    public void v(s sVar) {
    }

    public boolean w(s sVar) {
        if (!sVar.hasVisibleItems()) {
            return true;
        }
        new m(this.g.getContext(), sVar).l();
        return true;
    }
}
