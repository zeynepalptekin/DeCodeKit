package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.e0;
import b.i.p.f0;
import java.util.ArrayList;

/* loaded from: classes.dex */
class n extends androidx.appcompat.app.a {
    e0 i;
    boolean j;
    Window.Callback k;
    private boolean l;
    private boolean m;
    private ArrayList<a.d> n = new ArrayList<>();
    private final Runnable o = new a();
    private final Toolbar.f p = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.F0();
        }
    }

    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return n.this.k.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements n.a {
        private boolean d;

        c() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(@h0 androidx.appcompat.view.menu.g gVar, boolean z) {
            if (this.d) {
                return;
            }
            this.d = true;
            n.this.i.l();
            Window.Callback callback = n.this.k;
            if (callback != null) {
                callback.onPanelClosed(108, gVar);
            }
            this.d = false;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean b(@h0 androidx.appcompat.view.menu.g gVar) {
            Window.Callback callback = n.this.k;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    private final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@h0 androidx.appcompat.view.menu.g gVar, @h0 MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@h0 androidx.appcompat.view.menu.g gVar) {
            n nVar = n.this;
            if (nVar.k != null) {
                if (nVar.i.c()) {
                    n.this.k.onPanelClosed(108, gVar);
                } else if (n.this.k.onPreparePanel(0, null, gVar)) {
                    n.this.k.onMenuOpened(108, gVar);
                }
            }
        }
    }

    private class e extends b.a.f.i {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // b.a.f.i, android.view.Window.Callback
        public View onCreatePanelView(int r2) {
            return r2 == 0 ? new View(n.this.i.getContext()) : super.onCreatePanelView(r2);
        }

        @Override // b.a.f.i, android.view.Window.Callback
        public boolean onPreparePanel(int r1, View view, Menu menu) {
            boolean zOnPreparePanel = super.onPreparePanel(r1, view, menu);
            if (zOnPreparePanel) {
                n nVar = n.this;
                if (!nVar.j) {
                    nVar.i.d();
                    n.this.j = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    n(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.i = new b1(toolbar, false);
        e eVar = new e(callback);
        this.k = eVar;
        this.i.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(this.p);
        this.i.setWindowTitle(charSequence);
    }

    private Menu D0() {
        if (!this.l) {
            this.i.m(new c(), new d());
            this.l = true;
        }
        return this.i.G();
    }

    @Override // androidx.appcompat.app.a
    public CharSequence A() {
        return this.i.getTitle();
    }

    @Override // androidx.appcompat.app.a
    public void A0(CharSequence charSequence) {
        this.i.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void B() {
        this.i.setVisibility(8);
    }

    @Override // androidx.appcompat.app.a
    public void B0() {
        this.i.setVisibility(0);
    }

    @Override // androidx.appcompat.app.a
    public boolean C() {
        this.i.p().removeCallbacks(this.o);
        f0.i1(this.i.p(), this.o);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean E() {
        return this.i.s() == 0;
    }

    public Window.Callback E0() {
        return this.k;
    }

    @Override // androidx.appcompat.app.a
    public boolean F() {
        return super.F();
    }

    void F0() {
        Menu menuD0 = D0();
        androidx.appcompat.view.menu.g gVar = menuD0 instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menuD0 : null;
        if (gVar != null) {
            gVar.m0();
        }
        try {
            menuD0.clear();
            if (!this.k.onCreatePanelMenu(0, menuD0) || !this.k.onPreparePanel(0, null, menuD0)) {
                menuD0.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.l0();
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public a.f G() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void H(Configuration configuration) {
        super.H(configuration);
    }

    @Override // androidx.appcompat.app.a
    void I() {
        this.i.p().removeCallbacks(this.o);
    }

    @Override // androidx.appcompat.app.a
    public boolean J(int r5, KeyEvent keyEvent) {
        Menu menuD0 = D0();
        if (menuD0 == null) {
            return false;
        }
        menuD0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuD0.performShortcut(r5, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean K(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            L();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean L() {
        return this.i.h();
    }

    @Override // androidx.appcompat.app.a
    public void M() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void N(a.d dVar) {
        this.n.remove(dVar);
    }

    @Override // androidx.appcompat.app.a
    public void O(a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void P(int r2) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public boolean Q() {
        ViewGroup viewGroupP = this.i.p();
        if (viewGroupP == null || viewGroupP.hasFocus()) {
            return false;
        }
        viewGroupP.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void R(a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void S(@i0 Drawable drawable) {
        this.i.a(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void T(int r4) {
        U(LayoutInflater.from(this.i.getContext()).inflate(r4, this.i.p(), false));
    }

    @Override // androidx.appcompat.app.a
    public void U(View view) {
        V(view, new a.b(-2, -2));
    }

    @Override // androidx.appcompat.app.a
    public void V(View view, a.b bVar) {
        if (view != null) {
            view.setLayoutParams(bVar);
        }
        this.i.K(view);
    }

    @Override // androidx.appcompat.app.a
    public void W(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void X(boolean z) {
        Z(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    @SuppressLint({"WrongConstant"})
    public void Y(int r2) {
        Z(r2, -1);
    }

    @Override // androidx.appcompat.app.a
    public void Z(int r3, int r4) {
        this.i.x((r3 & r4) | ((~r4) & this.i.B()));
    }

    @Override // androidx.appcompat.app.a
    public void a0(boolean z) {
        Z(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void b0(boolean z) {
        Z(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void c0(boolean z) {
        Z(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void d0(boolean z) {
        Z(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.a
    public void e0(float f) {
        f0.G1(this.i.p(), f);
    }

    @Override // androidx.appcompat.app.a
    public void f(a.d dVar) {
        this.n.add(dVar);
    }

    @Override // androidx.appcompat.app.a
    public void g(a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void h(a.f fVar, int r2) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void h0(int r2) {
        this.i.H(r2);
    }

    @Override // androidx.appcompat.app.a
    public void i(a.f fVar, int r2, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void i0(CharSequence charSequence) {
        this.i.z(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void j(a.f fVar, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void j0(int r2) {
        this.i.T(r2);
    }

    @Override // androidx.appcompat.app.a
    public boolean k() {
        return this.i.g();
    }

    @Override // androidx.appcompat.app.a
    public void k0(Drawable drawable) {
        this.i.R(drawable);
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        if (!this.i.v()) {
            return false;
        }
        this.i.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void l0(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void m(boolean z) {
        if (z == this.m) {
            return;
        }
        this.m = z;
        int size = this.n.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.n.get(r1).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public void m0(int r2) {
        this.i.setIcon(r2);
    }

    @Override // androidx.appcompat.app.a
    public View n() {
        return this.i.n();
    }

    @Override // androidx.appcompat.app.a
    public void n0(Drawable drawable) {
        this.i.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public int o() {
        return this.i.B();
    }

    @Override // androidx.appcompat.app.a
    public void o0(SpinnerAdapter spinnerAdapter, a.e eVar) {
        this.i.t(spinnerAdapter, new l(eVar));
    }

    @Override // androidx.appcompat.app.a
    public float p() {
        return f0.P(this.i.p());
    }

    @Override // androidx.appcompat.app.a
    public void p0(int r2) {
        this.i.setLogo(r2);
    }

    @Override // androidx.appcompat.app.a
    public int q() {
        return this.i.getHeight();
    }

    @Override // androidx.appcompat.app.a
    public void q0(Drawable drawable) {
        this.i.r(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void r0(int r2) {
        if (r2 == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.i.N(r2);
    }

    @Override // androidx.appcompat.app.a
    public int s() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public void s0(int r3) {
        if (this.i.J() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.i.F(r3);
    }

    @Override // androidx.appcompat.app.a
    public int t() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public void t0(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public int u() {
        return -1;
    }

    @Override // androidx.appcompat.app.a
    public void u0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public a.f v() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void v0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public CharSequence w() {
        return this.i.y();
    }

    @Override // androidx.appcompat.app.a
    public void w0(int r3) {
        e0 e0Var = this.i;
        e0Var.A(r3 != 0 ? e0Var.getContext().getText(r3) : null);
    }

    @Override // androidx.appcompat.app.a
    public a.f x(int r2) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void x0(CharSequence charSequence) {
        this.i.A(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public int y() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public void y0(int r3) {
        e0 e0Var = this.i;
        e0Var.setTitle(r3 != 0 ? e0Var.getContext().getText(r3) : null);
    }

    @Override // androidx.appcompat.app.a
    public Context z() {
        return this.i.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void z0(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }
}
