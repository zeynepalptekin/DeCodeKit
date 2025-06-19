package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.s0;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes.dex */
public class b implements DrawerLayout.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0012b f38a;

    /* renamed from: b, reason: collision with root package name */
    private final DrawerLayout f39b;

    /* renamed from: c, reason: collision with root package name */
    private b.a.c.a.d f40c;
    private boolean d;
    private Drawable e;
    boolean f;
    private boolean g;
    private final int h;
    private final int i;
    View.OnClickListener j;
    private boolean k;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f) {
                bVar.v();
                return;
            }
            View.OnClickListener onClickListener = bVar.j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b, reason: collision with other inner class name */
    public interface InterfaceC0012b {
        void a(Drawable drawable, @s0 int r2);

        Drawable b();

        void c(@s0 int r1);

        boolean d();

        Context e();
    }

    public interface c {
        @i0
        InterfaceC0012b a();
    }

    private static class d implements InterfaceC0012b {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f41a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f42b;

        d(Activity activity) {
            this.f41a = activity;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public void a(Drawable drawable, int r5) {
            ActionBar actionBar = this.f41a.getActionBar();
            if (actionBar != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    actionBar.setHomeAsUpIndicator(drawable);
                    actionBar.setHomeActionContentDescription(r5);
                } else {
                    actionBar.setDisplayShowHomeEnabled(true);
                    this.f42b = androidx.appcompat.app.c.c(this.f41a, drawable, r5);
                    actionBar.setDisplayShowHomeEnabled(false);
                }
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public Drawable b() {
            if (Build.VERSION.SDK_INT < 18) {
                return androidx.appcompat.app.c.a(this.f41a);
            }
            TypedArray typedArrayObtainStyledAttributes = e().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public void c(int r3) {
            if (Build.VERSION.SDK_INT < 18) {
                this.f42b = androidx.appcompat.app.c.b(this.f42b, this.f41a, r3);
                return;
            }
            ActionBar actionBar = this.f41a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(r3);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public boolean d() {
            ActionBar actionBar = this.f41a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public Context e() {
            ActionBar actionBar = this.f41a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f41a;
        }
    }

    static class e implements InterfaceC0012b {

        /* renamed from: a, reason: collision with root package name */
        final Toolbar f43a;

        /* renamed from: b, reason: collision with root package name */
        final Drawable f44b;

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f45c;

        e(Toolbar toolbar) {
            this.f43a = toolbar;
            this.f44b = toolbar.getNavigationIcon();
            this.f45c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public void a(Drawable drawable, @s0 int r3) {
            this.f43a.setNavigationIcon(drawable);
            c(r3);
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public Drawable b() {
            return this.f44b;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public void c(@s0 int r2) {
            if (r2 == 0) {
                this.f43a.setNavigationContentDescription(this.f45c);
            } else {
                this.f43a.setNavigationContentDescription(r2);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public boolean d() {
            return true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0012b
        public Context e() {
            return this.f43a.getContext();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, b.a.c.a.d dVar, @s0 int r6, @s0 int r7) {
        this.d = true;
        this.f = true;
        this.k = false;
        if (toolbar != null) {
            this.f38a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f38a = ((c) activity).a();
        } else {
            this.f38a = new d(activity);
        }
        this.f39b = drawerLayout;
        this.h = r6;
        this.i = r7;
        if (dVar == null) {
            this.f40c = new b.a.c.a.d(this.f38a.e());
        } else {
            this.f40c = dVar;
        }
        this.e = f();
    }

    public b(Activity activity, DrawerLayout drawerLayout, @s0 int r10, @s0 int r11) {
        this(activity, null, drawerLayout, null, r10, r11);
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @s0 int r11, @s0 int r12) {
        this(activity, toolbar, drawerLayout, null, r11, r12);
    }

    private void s(float f) {
        b.a.c.a.d dVar;
        boolean z;
        if (f != 1.0f) {
            if (f == 0.0f) {
                dVar = this.f40c;
                z = false;
            }
            this.f40c.s(f);
        }
        dVar = this.f40c;
        z = true;
        dVar.u(z);
        this.f40c.s(f);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void a(int r1) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void b(View view, float f) {
        if (this.d) {
            s(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            s(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void c(View view) {
        s(1.0f);
        if (this.f) {
            l(this.i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void d(View view) {
        s(0.0f);
        if (this.f) {
            l(this.h);
        }
    }

    @h0
    public b.a.c.a.d e() {
        return this.f40c;
    }

    Drawable f() {
        return this.f38a.b();
    }

    public View.OnClickListener g() {
        return this.j;
    }

    public boolean h() {
        return this.f;
    }

    public boolean i() {
        return this.d;
    }

    public void j(Configuration configuration) {
        if (!this.g) {
            this.e = f();
        }
        u();
    }

    public boolean k(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f) {
            return false;
        }
        v();
        return true;
    }

    void l(int r2) {
        this.f38a.c(r2);
    }

    void m(Drawable drawable, int r4) {
        if (!this.k && !this.f38a.d()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.k = true;
        }
        this.f38a.a(drawable, r4);
    }

    public void n(@h0 b.a.c.a.d dVar) {
        this.f40c = dVar;
        u();
    }

    public void o(boolean z) {
        Drawable drawable;
        int r1;
        if (z != this.f) {
            if (z) {
                drawable = this.f40c;
                r1 = this.f39b.C(b.i.p.h.f1198b) ? this.i : this.h;
            } else {
                drawable = this.e;
                r1 = 0;
            }
            m(drawable, r1);
            this.f = z;
        }
    }

    public void p(boolean z) {
        this.d = z;
        if (z) {
            return;
        }
        s(0.0f);
    }

    public void q(int r2) {
        r(r2 != 0 ? this.f39b.getResources().getDrawable(r2) : null);
    }

    public void r(Drawable drawable) {
        if (drawable == null) {
            this.e = f();
            this.g = false;
        } else {
            this.e = drawable;
            this.g = true;
        }
        if (this.f) {
            return;
        }
        m(this.e, 0);
    }

    public void t(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    public void u() {
        s(this.f39b.C(b.i.p.h.f1198b) ? 1.0f : 0.0f);
        if (this.f) {
            m(this.f40c, this.f39b.C(b.i.p.h.f1198b) ? this.i : this.h);
        }
    }

    void v() {
        int r0 = this.f39b.q(b.i.p.h.f1198b);
        if (this.f39b.F(b.i.p.h.f1198b) && r0 != 2) {
            this.f39b.d(b.i.p.h.f1198b);
        } else if (r0 != 1) {
            this.f39b.K(b.i.p.h.f1198b);
        }
    }
}
