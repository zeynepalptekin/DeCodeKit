package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
import b.a.a;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b1 implements e0 {
    private static final String s = "ToolbarWidgetWrapper";
    private static final int t = 3;
    private static final long u = 200;

    /* renamed from: a, reason: collision with root package name */
    Toolbar f129a;

    /* renamed from: b, reason: collision with root package name */
    private int f130b;

    /* renamed from: c, reason: collision with root package name */
    private View f131c;
    private Spinner d;
    private View e;
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private boolean i;
    CharSequence j;
    private CharSequence k;
    private CharSequence l;
    Window.Callback m;
    boolean n;
    private c o;
    private int p;
    private int q;
    private Drawable r;

    class a implements View.OnClickListener {
        final androidx.appcompat.view.menu.a d;

        a() {
            this.d = new androidx.appcompat.view.menu.a(b1.this.f129a.getContext(), 0, R.id.home, 0, 0, b1.this.j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b1 b1Var = b1.this;
            Window.Callback callback = b1Var.m;
            if (callback == null || !b1Var.n) {
                return;
            }
            callback.onMenuItemSelected(0, this.d);
        }
    }

    class b extends b.i.p.l0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f132a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f133b;

        b(int r2) {
            this.f133b = r2;
        }

        @Override // b.i.p.l0, b.i.p.k0
        public void a(View view) {
            this.f132a = true;
        }

        @Override // b.i.p.l0, b.i.p.k0
        public void b(View view) {
            if (this.f132a) {
                return;
            }
            b1.this.f129a.setVisibility(this.f133b);
        }

        @Override // b.i.p.l0, b.i.p.k0
        public void c(View view) {
            b1.this.f129a.setVisibility(0);
        }
    }

    public b1(Toolbar toolbar, boolean z) {
        this(toolbar, z, a.k.abc_action_bar_up_description, a.f.abc_ic_ab_back_material);
    }

    public b1(Toolbar toolbar, boolean z, int r6, int r7) {
        Drawable drawable;
        this.p = 0;
        this.q = 0;
        this.f129a = toolbar;
        this.j = toolbar.getTitle();
        this.k = toolbar.getSubtitle();
        this.i = this.j != null;
        this.h = toolbar.getNavigationIcon();
        a1 a1VarG = a1.G(toolbar.getContext(), null, a.m.ActionBar, a.b.actionBarStyle, 0);
        this.r = a1VarG.h(a.m.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceX = a1VarG.x(a.m.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceX)) {
                setTitle(charSequenceX);
            }
            CharSequence charSequenceX2 = a1VarG.x(a.m.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceX2)) {
                A(charSequenceX2);
            }
            Drawable drawableH = a1VarG.h(a.m.ActionBar_logo);
            if (drawableH != null) {
                r(drawableH);
            }
            Drawable drawableH2 = a1VarG.h(a.m.ActionBar_icon);
            if (drawableH2 != null) {
                setIcon(drawableH2);
            }
            if (this.h == null && (drawable = this.r) != null) {
                R(drawable);
            }
            x(a1VarG.o(a.m.ActionBar_displayOptions, 0));
            int r5 = a1VarG.u(a.m.ActionBar_customNavigationLayout, 0);
            if (r5 != 0) {
                K(LayoutInflater.from(this.f129a.getContext()).inflate(r5, (ViewGroup) this.f129a, false));
                x(this.f130b | 16);
            }
            int r52 = a1VarG.q(a.m.ActionBar_height, 0);
            if (r52 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f129a.getLayoutParams();
                layoutParams.height = r52;
                this.f129a.setLayoutParams(layoutParams);
            }
            int r53 = a1VarG.f(a.m.ActionBar_contentInsetStart, -1);
            int r0 = a1VarG.f(a.m.ActionBar_contentInsetEnd, -1);
            if (r53 >= 0 || r0 >= 0) {
                this.f129a.J(Math.max(r53, 0), Math.max(r0, 0));
            }
            int r54 = a1VarG.u(a.m.ActionBar_titleTextStyle, 0);
            if (r54 != 0) {
                Toolbar toolbar2 = this.f129a;
                toolbar2.O(toolbar2.getContext(), r54);
            }
            int r55 = a1VarG.u(a.m.ActionBar_subtitleTextStyle, 0);
            if (r55 != 0) {
                Toolbar toolbar3 = this.f129a;
                toolbar3.M(toolbar3.getContext(), r55);
            }
            int r56 = a1VarG.u(a.m.ActionBar_popupTheme, 0);
            if (r56 != 0) {
                this.f129a.setPopupTheme(r56);
            }
        } else {
            this.f130b = U();
        }
        a1VarG.I();
        k(r6);
        this.l = this.f129a.getNavigationContentDescription();
        this.f129a.setNavigationOnClickListener(new a());
    }

    private int U() {
        if (this.f129a.getNavigationIcon() == null) {
            return 11;
        }
        this.r = this.f129a.getNavigationIcon();
        return 15;
    }

    private void V() {
        if (this.d == null) {
            this.d = new x(getContext(), null, a.b.actionDropDownStyle);
            this.d.setLayoutParams(new Toolbar.e(-2, -2, 8388627));
        }
    }

    private void W(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f130b & 8) != 0) {
            this.f129a.setTitle(charSequence);
        }
    }

    private void X() {
        if ((this.f130b & 4) != 0) {
            if (TextUtils.isEmpty(this.l)) {
                this.f129a.setNavigationContentDescription(this.q);
            } else {
                this.f129a.setNavigationContentDescription(this.l);
            }
        }
    }

    private void Y() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f130b & 4) != 0) {
            toolbar = this.f129a;
            drawable = this.h;
            if (drawable == null) {
                drawable = this.r;
            }
        } else {
            toolbar = this.f129a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void Z() {
        Drawable drawable;
        int r0 = this.f130b;
        if ((r0 & 2) == 0) {
            drawable = null;
        } else if ((r0 & 1) == 0 || (drawable = this.g) == null) {
            drawable = this.f;
        }
        this.f129a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.e0
    public void A(CharSequence charSequence) {
        this.k = charSequence;
        if ((this.f130b & 8) != 0) {
            this.f129a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.e0
    public int B() {
        return this.f130b;
    }

    @Override // androidx.appcompat.widget.e0
    public int C() {
        Spinner spinner = this.d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.e0
    public void D(Drawable drawable) {
        if (this.r != drawable) {
            this.r = drawable;
            Y();
        }
    }

    @Override // androidx.appcompat.widget.e0
    public void E(SparseArray<Parcelable> sparseArray) {
        this.f129a.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.e0
    public void F(int r2) {
        Spinner spinner = this.d;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(r2);
    }

    @Override // androidx.appcompat.widget.e0
    public Menu G() {
        return this.f129a.getMenu();
    }

    @Override // androidx.appcompat.widget.e0
    public void H(int r2) {
        z(r2 == 0 ? null : getContext().getString(r2));
    }

    @Override // androidx.appcompat.widget.e0
    public boolean I() {
        return this.f131c != null;
    }

    @Override // androidx.appcompat.widget.e0
    public int J() {
        return this.p;
    }

    @Override // androidx.appcompat.widget.e0
    public void K(View view) {
        View view2 = this.e;
        if (view2 != null && (this.f130b & 16) != 0) {
            this.f129a.removeView(view2);
        }
        this.e = view;
        if (view == null || (this.f130b & 16) == 0) {
            return;
        }
        this.f129a.addView(view);
    }

    @Override // androidx.appcompat.widget.e0
    public void L(int r3) {
        b.i.p.j0 j0VarM = M(r3, u);
        if (j0VarM != null) {
            j0VarM.w();
        }
    }

    @Override // androidx.appcompat.widget.e0
    public b.i.p.j0 M(int r3, long j) {
        return b.i.p.f0.f(this.f129a).a(r3 == 0 ? 1.0f : 0.0f).q(j).s(new b(r3));
    }

    @Override // androidx.appcompat.widget.e0
    public void N(int r5) {
        Toolbar toolbar;
        View view;
        View view2;
        int r0 = this.p;
        if (r5 != r0) {
            if (r0 == 1) {
                Spinner spinner = this.d;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    toolbar = this.f129a;
                    if (parent == toolbar) {
                        view = this.d;
                        toolbar.removeView(view);
                    }
                }
            } else if (r0 == 2 && (view2 = this.f131c) != null) {
                ViewParent parent2 = view2.getParent();
                toolbar = this.f129a;
                if (parent2 == toolbar) {
                    view = this.f131c;
                    toolbar.removeView(view);
                }
            }
            this.p = r5;
            if (r5 != 0) {
                if (r5 == 1) {
                    V();
                    this.f129a.addView(this.d, 0);
                    return;
                }
                if (r5 != 2) {
                    throw new IllegalArgumentException("Invalid navigation mode " + r5);
                }
                View view3 = this.f131c;
                if (view3 != null) {
                    this.f129a.addView(view3, 0);
                    Toolbar.e eVar = (Toolbar.e) this.f131c.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) eVar).width = -2;
                    ((ViewGroup.MarginLayoutParams) eVar).height = -2;
                    eVar.f36a = c.a.b.c.c.a.w;
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.e0
    public void O() {
        Log.i(s, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.e0
    public int P() {
        Spinner spinner = this.d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.e0
    public void Q() {
        Log.i(s, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.e0
    public void R(Drawable drawable) {
        this.h = drawable;
        Y();
    }

    @Override // androidx.appcompat.widget.e0
    public void S(boolean z) {
        this.f129a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.e0
    public void T(int r2) {
        R(r2 != 0 ? b.a.b.a.a.d(getContext(), r2) : null);
    }

    @Override // androidx.appcompat.widget.e0
    public void a(Drawable drawable) {
        b.i.p.f0.B1(this.f129a, drawable);
    }

    @Override // androidx.appcompat.widget.e0
    public void b(Menu menu, n.a aVar) {
        if (this.o == null) {
            c cVar = new c(this.f129a.getContext());
            this.o = cVar;
            cVar.i(a.g.action_menu_presenter);
        }
        this.o.T(aVar);
        this.f129a.K((androidx.appcompat.view.menu.g) menu, this.o);
    }

    @Override // androidx.appcompat.widget.e0
    public boolean c() {
        return this.f129a.A();
    }

    @Override // androidx.appcompat.widget.e0
    public void collapseActionView() {
        this.f129a.e();
    }

    @Override // androidx.appcompat.widget.e0
    public void d() {
        this.n = true;
    }

    @Override // androidx.appcompat.widget.e0
    public boolean e() {
        return this.g != null;
    }

    @Override // androidx.appcompat.widget.e0
    public boolean f() {
        return this.f129a.z();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean g() {
        return this.f129a.w();
    }

    @Override // androidx.appcompat.widget.e0
    public Context getContext() {
        return this.f129a.getContext();
    }

    @Override // androidx.appcompat.widget.e0
    public int getHeight() {
        return this.f129a.getHeight();
    }

    @Override // androidx.appcompat.widget.e0
    public CharSequence getTitle() {
        return this.f129a.getTitle();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean h() {
        return this.f129a.R();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean i() {
        return this.f != null;
    }

    @Override // androidx.appcompat.widget.e0
    public boolean j() {
        return this.f129a.d();
    }

    @Override // androidx.appcompat.widget.e0
    public void k(int r2) {
        if (r2 == this.q) {
            return;
        }
        this.q = r2;
        if (TextUtils.isEmpty(this.f129a.getNavigationContentDescription())) {
            H(this.q);
        }
    }

    @Override // androidx.appcompat.widget.e0
    public void l() {
        this.f129a.f();
    }

    @Override // androidx.appcompat.widget.e0
    public void m(n.a aVar, g.a aVar2) {
        this.f129a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.e0
    public View n() {
        return this.e;
    }

    @Override // androidx.appcompat.widget.e0
    public void o(r0 r0Var) {
        View view = this.f131c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f129a;
            if (parent == toolbar) {
                toolbar.removeView(this.f131c);
            }
        }
        this.f131c = r0Var;
        if (r0Var == null || this.p != 2) {
            return;
        }
        this.f129a.addView(r0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f131c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f36a = c.a.b.c.c.a.w;
        r0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.e0
    public ViewGroup p() {
        return this.f129a;
    }

    @Override // androidx.appcompat.widget.e0
    public void q(boolean z) {
    }

    @Override // androidx.appcompat.widget.e0
    public void r(Drawable drawable) {
        this.g = drawable;
        Z();
    }

    @Override // androidx.appcompat.widget.e0
    public int s() {
        return this.f129a.getVisibility();
    }

    @Override // androidx.appcompat.widget.e0
    public void setIcon(int r2) {
        setIcon(r2 != 0 ? b.a.b.a.a.d(getContext(), r2) : null);
    }

    @Override // androidx.appcompat.widget.e0
    public void setIcon(Drawable drawable) {
        this.f = drawable;
        Z();
    }

    @Override // androidx.appcompat.widget.e0
    public void setLogo(int r2) {
        r(r2 != 0 ? b.a.b.a.a.d(getContext(), r2) : null);
    }

    @Override // androidx.appcompat.widget.e0
    public void setTitle(CharSequence charSequence) {
        this.i = true;
        W(charSequence);
    }

    @Override // androidx.appcompat.widget.e0
    public void setVisibility(int r2) {
        this.f129a.setVisibility(r2);
    }

    @Override // androidx.appcompat.widget.e0
    public void setWindowCallback(Window.Callback callback) {
        this.m = callback;
    }

    @Override // androidx.appcompat.widget.e0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.i) {
            return;
        }
        W(charSequence);
    }

    @Override // androidx.appcompat.widget.e0
    public void t(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        V();
        this.d.setAdapter(spinnerAdapter);
        this.d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.e0
    public void u(SparseArray<Parcelable> sparseArray) {
        this.f129a.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.e0
    public boolean v() {
        return this.f129a.v();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean w() {
        return this.f129a.B();
    }

    @Override // androidx.appcompat.widget.e0
    public void x(int r4) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int r0 = this.f130b ^ r4;
        this.f130b = r4;
        if (r0 != 0) {
            if ((r0 & 4) != 0) {
                if ((r4 & 4) != 0) {
                    X();
                }
                Y();
            }
            if ((r0 & 3) != 0) {
                Z();
            }
            if ((r0 & 8) != 0) {
                if ((r4 & 8) != 0) {
                    this.f129a.setTitle(this.j);
                    toolbar = this.f129a;
                    charSequence = this.k;
                } else {
                    charSequence = null;
                    this.f129a.setTitle((CharSequence) null);
                    toolbar = this.f129a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((r0 & 16) == 0 || (view = this.e) == null) {
                return;
            }
            if ((r4 & 16) != 0) {
                this.f129a.addView(view);
            } else {
                this.f129a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.e0
    public CharSequence y() {
        return this.f129a.getSubtitle();
    }

    @Override // androidx.appcompat.widget.e0
    public void z(CharSequence charSequence) {
        this.l = charSequence;
        X();
    }
}
