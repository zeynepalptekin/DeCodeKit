package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.g;
import b.a.a;

/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f172a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.appcompat.view.menu.g f173b;

    /* renamed from: c, reason: collision with root package name */
    private final View f174c;
    final androidx.appcompat.view.menu.m d;
    e e;
    d f;
    private View.OnTouchListener g;

    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.h0 MenuItem menuItem) {
            e eVar = n0.this.e;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@androidx.annotation.h0 androidx.appcompat.view.menu.g gVar) {
        }
    }

    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            n0 n0Var = n0.this;
            d dVar = n0Var.f;
            if (dVar != null) {
                dVar.a(n0Var);
            }
        }
    }

    class c extends i0 {
        c(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.i0
        public androidx.appcompat.view.menu.q b() {
            return n0.this.d.e();
        }

        @Override // androidx.appcompat.widget.i0
        protected boolean c() {
            n0.this.k();
            return true;
        }

        @Override // androidx.appcompat.widget.i0
        protected boolean d() {
            n0.this.a();
            return true;
        }
    }

    public interface d {
        void a(n0 n0Var);
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public n0(@androidx.annotation.h0 Context context, @androidx.annotation.h0 View view) {
        this(context, view, 0);
    }

    public n0(@androidx.annotation.h0 Context context, @androidx.annotation.h0 View view, int r9) {
        this(context, view, r9, a.b.popupMenuStyle, 0);
    }

    public n0(@androidx.annotation.h0 Context context, @androidx.annotation.h0 View view, int r12, @androidx.annotation.f int r13, @androidx.annotation.t0 int r14) {
        this.f172a = context;
        this.f174c = view;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        this.f173b = gVar;
        gVar.X(new a());
        androidx.appcompat.view.menu.m mVar = new androidx.appcompat.view.menu.m(context, this.f173b, view, false, r13, r14);
        this.d = mVar;
        mVar.j(r12);
        this.d.k(new b());
    }

    public void a() {
        this.d.dismiss();
    }

    @androidx.annotation.h0
    public View.OnTouchListener b() {
        if (this.g == null) {
            this.g = new c(this.f174c);
        }
        return this.g;
    }

    public int c() {
        return this.d.c();
    }

    @androidx.annotation.h0
    public Menu d() {
        return this.f173b;
    }

    @androidx.annotation.h0
    public MenuInflater e() {
        return new b.a.f.g(this.f172a);
    }

    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    ListView f() {
        if (this.d.f()) {
            return this.d.d();
        }
        return null;
    }

    public void g(@androidx.annotation.f0 int r3) {
        e().inflate(r3, this.f173b);
    }

    public void h(int r2) {
        this.d.j(r2);
    }

    public void i(@androidx.annotation.i0 d dVar) {
        this.f = dVar;
    }

    public void j(@androidx.annotation.i0 e eVar) {
        this.e = eVar;
    }

    public void k() {
        this.d.l();
    }
}
