package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.h0;
import androidx.annotation.p0;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.r0;
import androidx.fragment.app.r;
import b.a.a;
import b.a.f.b;
import b.i.p.f0;
import b.i.p.j0;
import b.i.p.k0;
import b.i.p.l0;
import b.i.p.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class q extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final String N = "WindowDecorActionBar";
    private static final Interpolator O = new AccelerateInterpolator();
    private static final Interpolator P = new DecelerateInterpolator();
    private static final int Q = -1;
    private static final long R = 100;
    private static final long S = 200;
    private boolean A;
    boolean D;
    boolean E;
    private boolean F;
    b.a.f.h H;
    private boolean I;
    boolean J;
    Context i;
    private Context j;
    private Activity k;
    ActionBarOverlayLayout l;
    ActionBarContainer m;
    e0 n;
    ActionBarContextView o;
    View p;
    r0 q;
    private e s;
    private boolean u;
    d v;
    b.a.f.b w;
    b.a x;
    private boolean y;
    private ArrayList<e> r = new ArrayList<>();
    private int t = -1;
    private ArrayList<a.d> z = new ArrayList<>();
    private int B = 0;
    boolean C = true;
    private boolean G = true;
    final k0 K = new a();
    final k0 L = new b();
    final m0 M = new c();

    class a extends l0 {
        a() {
        }

        @Override // b.i.p.l0, b.i.p.k0
        public void b(View view) {
            View view2;
            q qVar = q.this;
            if (qVar.C && (view2 = qVar.p) != null) {
                view2.setTranslationY(0.0f);
                q.this.m.setTranslationY(0.0f);
            }
            q.this.m.setVisibility(8);
            q.this.m.setTransitioning(false);
            q qVar2 = q.this;
            qVar2.H = null;
            qVar2.G0();
            ActionBarOverlayLayout actionBarOverlayLayout = q.this.l;
            if (actionBarOverlayLayout != null) {
                f0.o1(actionBarOverlayLayout);
            }
        }
    }

    class b extends l0 {
        b() {
        }

        @Override // b.i.p.l0, b.i.p.k0
        public void b(View view) {
            q qVar = q.this;
            qVar.H = null;
            qVar.m.requestLayout();
        }
    }

    class c implements m0 {
        c() {
        }

        @Override // b.i.p.m0
        public void a(View view) {
            ((View) q.this.m.getParent()).invalidate();
        }
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public class d extends b.a.f.b implements g.a {
        private final Context f;
        private final androidx.appcompat.view.menu.g g;
        private b.a h;
        private WeakReference<View> i;

        public d(Context context, b.a aVar) {
            this.f = context;
            this.h = aVar;
            androidx.appcompat.view.menu.g gVarZ = new androidx.appcompat.view.menu.g(context).Z(1);
            this.g = gVarZ;
            gVarZ.X(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@h0 androidx.appcompat.view.menu.g gVar, @h0 MenuItem menuItem) {
            b.a aVar = this.h;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@h0 androidx.appcompat.view.menu.g gVar) {
            if (this.h == null) {
                return;
            }
            k();
            q.this.o.o();
        }

        @Override // b.a.f.b
        public void c() {
            q qVar = q.this;
            if (qVar.v != this) {
                return;
            }
            if (q.E0(qVar.D, qVar.E, false)) {
                this.h.b(this);
            } else {
                q qVar2 = q.this;
                qVar2.w = this;
                qVar2.x = this.h;
            }
            this.h = null;
            q.this.D0(false);
            q.this.o.p();
            q.this.n.p().sendAccessibilityEvent(32);
            q qVar3 = q.this;
            qVar3.l.setHideOnContentScrollEnabled(qVar3.J);
            q.this.v = null;
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
            return this.g;
        }

        @Override // b.a.f.b
        public MenuInflater f() {
            return new b.a.f.g(this.f);
        }

        @Override // b.a.f.b
        public CharSequence g() {
            return q.this.o.getSubtitle();
        }

        @Override // b.a.f.b
        public CharSequence i() {
            return q.this.o.getTitle();
        }

        @Override // b.a.f.b
        public void k() {
            if (q.this.v != this) {
                return;
            }
            this.g.m0();
            try {
                this.h.a(this, this.g);
            } finally {
                this.g.l0();
            }
        }

        @Override // b.a.f.b
        public boolean l() {
            return q.this.o.s();
        }

        @Override // b.a.f.b
        public void n(View view) {
            q.this.o.setCustomView(view);
            this.i = new WeakReference<>(view);
        }

        @Override // b.a.f.b
        public void o(int r2) {
            p(q.this.i.getResources().getString(r2));
        }

        @Override // b.a.f.b
        public void p(CharSequence charSequence) {
            q.this.o.setSubtitle(charSequence);
        }

        @Override // b.a.f.b
        public void r(int r2) {
            s(q.this.i.getResources().getString(r2));
        }

        @Override // b.a.f.b
        public void s(CharSequence charSequence) {
            q.this.o.setTitle(charSequence);
        }

        @Override // b.a.f.b
        public void t(boolean z) {
            super.t(z);
            q.this.o.setTitleOptional(z);
        }

        public boolean u() {
            this.g.m0();
            try {
                return this.h.d(this, this.g);
            } finally {
                this.g.l0();
            }
        }

        public void v(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        public void w(s sVar) {
        }

        public boolean x(s sVar) {
            if (this.h == null) {
                return false;
            }
            if (!sVar.hasVisibleItems()) {
                return true;
            }
            new androidx.appcompat.view.menu.m(q.this.z(), sVar).l();
            return true;
        }
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public class e extends a.f {

        /* renamed from: b, reason: collision with root package name */
        private a.g f90b;

        /* renamed from: c, reason: collision with root package name */
        private Object f91c;
        private Drawable d;
        private CharSequence e;
        private CharSequence f;
        private int g = -1;
        private View h;

        public e() {
        }

        @Override // androidx.appcompat.app.a.f
        public CharSequence a() {
            return this.f;
        }

        @Override // androidx.appcompat.app.a.f
        public View b() {
            return this.h;
        }

        @Override // androidx.appcompat.app.a.f
        public Drawable c() {
            return this.d;
        }

        @Override // androidx.appcompat.app.a.f
        public int d() {
            return this.g;
        }

        @Override // androidx.appcompat.app.a.f
        public Object e() {
            return this.f91c;
        }

        @Override // androidx.appcompat.app.a.f
        public CharSequence f() {
            return this.e;
        }

        @Override // androidx.appcompat.app.a.f
        public void g() {
            q.this.R(this);
        }

        @Override // androidx.appcompat.app.a.f
        public a.f h(int r2) {
            return i(q.this.i.getResources().getText(r2));
        }

        @Override // androidx.appcompat.app.a.f
        public a.f i(CharSequence charSequence) {
            this.f = charSequence;
            int r2 = this.g;
            if (r2 >= 0) {
                q.this.q.m(r2);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public a.f j(int r3) {
            return k(LayoutInflater.from(q.this.z()).inflate(r3, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.a.f
        public a.f k(View view) {
            this.h = view;
            int r2 = this.g;
            if (r2 >= 0) {
                q.this.q.m(r2);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public a.f l(int r2) {
            return m(b.a.b.a.a.d(q.this.i, r2));
        }

        @Override // androidx.appcompat.app.a.f
        public a.f m(Drawable drawable) {
            this.d = drawable;
            int r2 = this.g;
            if (r2 >= 0) {
                q.this.q.m(r2);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public a.f n(a.g gVar) {
            this.f90b = gVar;
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public a.f o(Object obj) {
            this.f91c = obj;
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public a.f p(int r2) {
            return q(q.this.i.getResources().getText(r2));
        }

        @Override // androidx.appcompat.app.a.f
        public a.f q(CharSequence charSequence) {
            this.e = charSequence;
            int r2 = this.g;
            if (r2 >= 0) {
                q.this.q.m(r2);
            }
            return this;
        }

        public a.g r() {
            return this.f90b;
        }

        public void s(int r1) {
            this.g = r1;
        }
    }

    public q(Activity activity, boolean z) {
        this.k = activity;
        View decorView = activity.getWindow().getDecorView();
        P0(decorView);
        if (z) {
            return;
        }
        this.p = decorView.findViewById(R.id.content);
    }

    public q(Dialog dialog) {
        P0(dialog.getWindow().getDecorView());
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public q(View view) {
        P0(view);
    }

    static boolean E0(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private void F0() {
        if (this.s != null) {
            R(null);
        }
        this.r.clear();
        r0 r0Var = this.q;
        if (r0Var != null) {
            r0Var.k();
        }
        this.t = -1;
    }

    private void H0(a.f fVar, int r3) {
        e eVar = (e) fVar;
        if (eVar.r() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        eVar.s(r3);
        this.r.add(r3, eVar);
        int size = this.r.size();
        while (true) {
            r3++;
            if (r3 >= size) {
                return;
            } else {
                this.r.get(r3).s(r3);
            }
        }
    }

    private void K0() {
        if (this.q != null) {
            return;
        }
        r0 r0Var = new r0(this.i);
        if (this.A) {
            r0Var.setVisibility(0);
            this.n.o(r0Var);
        } else {
            if (t() == 2) {
                r0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.l;
                if (actionBarOverlayLayout != null) {
                    f0.o1(actionBarOverlayLayout);
                }
            } else {
                r0Var.setVisibility(8);
            }
            this.m.setTabContainer(r0Var);
        }
        this.q = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e0 L0(View view) {
        if (view instanceof e0) {
            return (e0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void O0() {
        if (this.F) {
            this.F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            T0(false);
        }
    }

    private void P0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(a.g.decor_content_parent);
        this.l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.n = L0(view.findViewById(a.g.action_bar));
        this.o = (ActionBarContextView) view.findViewById(a.g.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(a.g.action_bar_container);
        this.m = actionBarContainer;
        e0 e0Var = this.n;
        if (e0Var == null || this.o == null || actionBarContainer == null) {
            throw new IllegalStateException(q.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.i = e0Var.getContext();
        boolean z = (this.n.B() & 4) != 0;
        if (z) {
            this.u = true;
        }
        b.a.f.a aVarB = b.a.f.a.b(this.i);
        l0(aVarB.a() || z);
        Q0(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.i.obtainStyledAttributes(null, a.m.ActionBar, a.b.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(a.m.ActionBar_hideOnContentScroll, false)) {
            g0(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.m.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            e0(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void Q0(boolean z) {
        this.A = z;
        if (z) {
            this.m.setTabContainer(null);
            this.n.o(this.q);
        } else {
            this.n.o(null);
            this.m.setTabContainer(this.q);
        }
        boolean z2 = t() == 2;
        r0 r0Var = this.q;
        if (r0Var != null) {
            if (z2) {
                r0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.l;
                if (actionBarOverlayLayout != null) {
                    f0.o1(actionBarOverlayLayout);
                }
            } else {
                r0Var.setVisibility(8);
            }
        }
        this.n.S(!this.A && z2);
        this.l.setHasNonEmbeddedTabs(!this.A && z2);
    }

    private boolean R0() {
        return f0.P0(this.m);
    }

    private void S0() {
        if (this.F) {
            return;
        }
        this.F = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.l;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        T0(false);
    }

    private void T0(boolean z) {
        if (E0(this.D, this.E, this.F)) {
            if (this.G) {
                return;
            }
            this.G = true;
            J0(z);
            return;
        }
        if (this.G) {
            this.G = false;
            I0(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public CharSequence A() {
        return this.n.getTitle();
    }

    @Override // androidx.appcompat.app.a
    public void A0(CharSequence charSequence) {
        this.n.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void B() {
        if (this.D) {
            return;
        }
        this.D = true;
        T0(false);
    }

    @Override // androidx.appcompat.app.a
    public void B0() {
        if (this.D) {
            this.D = false;
            T0(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public b.a.f.b C0(b.a aVar) {
        d dVar = this.v;
        if (dVar != null) {
            dVar.c();
        }
        this.l.setHideOnContentScrollEnabled(false);
        this.o.t();
        d dVar2 = new d(this.o.getContext(), aVar);
        if (!dVar2.u()) {
            return null;
        }
        this.v = dVar2;
        dVar2.k();
        this.o.q(dVar2);
        D0(true);
        this.o.sendAccessibilityEvent(32);
        return dVar2;
    }

    @Override // androidx.appcompat.app.a
    public boolean D() {
        return this.l.A();
    }

    public void D0(boolean z) {
        j0 j0VarM;
        j0 j0VarN;
        if (z) {
            S0();
        } else {
            O0();
        }
        if (!R0()) {
            if (z) {
                this.n.setVisibility(4);
                this.o.setVisibility(0);
                return;
            } else {
                this.n.setVisibility(0);
                this.o.setVisibility(8);
                return;
            }
        }
        if (z) {
            j0VarN = this.n.M(4, R);
            j0VarM = this.o.n(0, S);
        } else {
            j0VarM = this.n.M(0, S);
            j0VarN = this.o.n(8, R);
        }
        b.a.f.h hVar = new b.a.f.h();
        hVar.d(j0VarN, j0VarM);
        hVar.h();
    }

    @Override // androidx.appcompat.app.a
    public boolean E() {
        int r0 = q();
        return this.G && (r0 == 0 || r() < r0);
    }

    @Override // androidx.appcompat.app.a
    public boolean F() {
        e0 e0Var = this.n;
        return e0Var != null && e0Var.w();
    }

    @Override // androidx.appcompat.app.a
    public a.f G() {
        return new e();
    }

    void G0() {
        b.a aVar = this.x;
        if (aVar != null) {
            aVar.b(this.w);
            this.w = null;
            this.x = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void H(Configuration configuration) {
        Q0(b.a.f.a.b(this.i).g());
    }

    public void I0(boolean z) {
        View view;
        b.a.f.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
        }
        if (this.B != 0 || (!this.I && !z)) {
            this.K.b(null);
            return;
        }
        this.m.setAlpha(1.0f);
        this.m.setTransitioning(true);
        b.a.f.h hVar2 = new b.a.f.h();
        float f = -this.m.getHeight();
        if (z) {
            this.m.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        j0 j0VarZ = f0.f(this.m).z(f);
        j0VarZ.v(this.M);
        hVar2.c(j0VarZ);
        if (this.C && (view = this.p) != null) {
            hVar2.c(f0.f(view).z(f));
        }
        hVar2.f(O);
        hVar2.e(250L);
        hVar2.g(this.K);
        this.H = hVar2;
        hVar2.h();
    }

    @Override // androidx.appcompat.app.a
    public boolean J(int r5, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.v;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(r5, keyEvent, 0);
    }

    public void J0(boolean z) {
        View view;
        View view2;
        b.a.f.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
        }
        this.m.setVisibility(0);
        if (this.B == 0 && (this.I || z)) {
            this.m.setTranslationY(0.0f);
            float f = -this.m.getHeight();
            if (z) {
                this.m.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.m.setTranslationY(f);
            b.a.f.h hVar2 = new b.a.f.h();
            j0 j0VarZ = f0.f(this.m).z(0.0f);
            j0VarZ.v(this.M);
            hVar2.c(j0VarZ);
            if (this.C && (view2 = this.p) != null) {
                view2.setTranslationY(f);
                hVar2.c(f0.f(this.p).z(0.0f));
            }
            hVar2.f(P);
            hVar2.e(250L);
            hVar2.g(this.L);
            this.H = hVar2;
            hVar2.h();
        } else {
            this.m.setAlpha(1.0f);
            this.m.setTranslationY(0.0f);
            if (this.C && (view = this.p) != null) {
                view.setTranslationY(0.0f);
            }
            this.L.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.l;
        if (actionBarOverlayLayout != null) {
            f0.o1(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.a
    public void M() {
        F0();
    }

    public boolean M0() {
        return this.n.i();
    }

    @Override // androidx.appcompat.app.a
    public void N(a.d dVar) {
        this.z.remove(dVar);
    }

    public boolean N0() {
        return this.n.e();
    }

    @Override // androidx.appcompat.app.a
    public void O(a.f fVar) {
        P(fVar.d());
    }

    @Override // androidx.appcompat.app.a
    public void P(int r5) {
        if (this.q == null) {
            return;
        }
        e eVar = this.s;
        int r0 = eVar != null ? eVar.d() : this.t;
        this.q.l(r5);
        e eVarRemove = this.r.remove(r5);
        if (eVarRemove != null) {
            eVarRemove.s(-1);
        }
        int size = this.r.size();
        for (int r2 = r5; r2 < size; r2++) {
            this.r.get(r2).s(r2);
        }
        if (r0 == r5) {
            R(this.r.isEmpty() ? null : this.r.get(Math.max(0, r5 - 1)));
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean Q() {
        ViewGroup viewGroupP = this.n.p();
        if (viewGroupP == null || viewGroupP.hasFocus()) {
            return false;
        }
        viewGroupP.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void R(a.f fVar) {
        if (t() != 2) {
            this.t = fVar != null ? fVar.d() : -1;
            return;
        }
        r rVarS = (!(this.k instanceof androidx.fragment.app.d) || this.n.p().isInEditMode()) ? null : ((androidx.fragment.app.d) this.k).t().b().s();
        e eVar = this.s;
        if (eVar != fVar) {
            this.q.setTabSelected(fVar != null ? fVar.d() : -1);
            e eVar2 = this.s;
            if (eVar2 != null) {
                eVar2.r().a(this.s, rVarS);
            }
            e eVar3 = (e) fVar;
            this.s = eVar3;
            if (eVar3 != null) {
                eVar3.r().c(this.s, rVarS);
            }
        } else if (eVar != null) {
            eVar.r().b(this.s, rVarS);
            this.q.c(fVar.d());
        }
        if (rVarS == null || rVarS.w()) {
            return;
        }
        rVarS.n();
    }

    @Override // androidx.appcompat.app.a
    public void S(Drawable drawable) {
        this.m.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void T(int r4) {
        U(LayoutInflater.from(z()).inflate(r4, this.n.p(), false));
    }

    @Override // androidx.appcompat.app.a
    public void U(View view) {
        this.n.K(view);
    }

    @Override // androidx.appcompat.app.a
    public void V(View view, a.b bVar) {
        view.setLayoutParams(bVar);
        this.n.K(view);
    }

    @Override // androidx.appcompat.app.a
    public void W(boolean z) {
        if (this.u) {
            return;
        }
        X(z);
    }

    @Override // androidx.appcompat.app.a
    public void X(boolean z) {
        Z(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void Y(int r2) {
        if ((r2 & 4) != 0) {
            this.u = true;
        }
        this.n.x(r2);
    }

    @Override // androidx.appcompat.app.a
    public void Z(int r3, int r4) {
        int r0 = this.n.B();
        if ((r4 & 4) != 0) {
            this.u = true;
        }
        this.n.x((r3 & r4) | ((~r4) & r0));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.E) {
            this.E = false;
            T0(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public void a0(boolean z) {
        Z(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        b.a.f.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
            this.H = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void b0(boolean z) {
        Z(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
    }

    @Override // androidx.appcompat.app.a
    public void c0(boolean z) {
        Z(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(boolean z) {
        this.C = z;
    }

    @Override // androidx.appcompat.app.a
    public void d0(boolean z) {
        Z(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.E) {
            return;
        }
        this.E = true;
        T0(true);
    }

    @Override // androidx.appcompat.app.a
    public void e0(float f) {
        f0.G1(this.m, f);
    }

    @Override // androidx.appcompat.app.a
    public void f(a.d dVar) {
        this.z.add(dVar);
    }

    @Override // androidx.appcompat.app.a
    public void f0(int r2) {
        if (r2 != 0 && !this.l.B()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.l.setActionBarHideOffset(r2);
    }

    @Override // androidx.appcompat.app.a
    public void g(a.f fVar) {
        j(fVar, this.r.isEmpty());
    }

    @Override // androidx.appcompat.app.a
    public void g0(boolean z) {
        if (z && !this.l.B()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.J = z;
        this.l.setHideOnContentScrollEnabled(z);
    }

    @Override // androidx.appcompat.app.a
    public void h(a.f fVar, int r3) {
        i(fVar, r3, this.r.isEmpty());
    }

    @Override // androidx.appcompat.app.a
    public void h0(int r2) {
        this.n.H(r2);
    }

    @Override // androidx.appcompat.app.a
    public void i(a.f fVar, int r3, boolean z) {
        K0();
        this.q.a(fVar, r3, z);
        H0(fVar, r3);
        if (z) {
            R(fVar);
        }
    }

    @Override // androidx.appcompat.app.a
    public void i0(CharSequence charSequence) {
        this.n.z(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void j(a.f fVar, boolean z) {
        K0();
        this.q.b(fVar, z);
        H0(fVar, this.r.size());
        if (z) {
            R(fVar);
        }
    }

    @Override // androidx.appcompat.app.a
    public void j0(int r2) {
        this.n.T(r2);
    }

    @Override // androidx.appcompat.app.a
    public void k0(Drawable drawable) {
        this.n.R(drawable);
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        e0 e0Var = this.n;
        if (e0Var == null || !e0Var.v()) {
            return false;
        }
        this.n.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void l0(boolean z) {
        this.n.q(z);
    }

    @Override // androidx.appcompat.app.a
    public void m(boolean z) {
        if (z == this.y) {
            return;
        }
        this.y = z;
        int size = this.z.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.z.get(r1).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public void m0(int r2) {
        this.n.setIcon(r2);
    }

    @Override // androidx.appcompat.app.a
    public View n() {
        return this.n.n();
    }

    @Override // androidx.appcompat.app.a
    public void n0(Drawable drawable) {
        this.n.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public int o() {
        return this.n.B();
    }

    @Override // androidx.appcompat.app.a
    public void o0(SpinnerAdapter spinnerAdapter, a.e eVar) {
        this.n.t(spinnerAdapter, new l(eVar));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int r1) {
        this.B = r1;
    }

    @Override // androidx.appcompat.app.a
    public float p() {
        return f0.P(this.m);
    }

    @Override // androidx.appcompat.app.a
    public void p0(int r2) {
        this.n.setLogo(r2);
    }

    @Override // androidx.appcompat.app.a
    public int q() {
        return this.m.getHeight();
    }

    @Override // androidx.appcompat.app.a
    public void q0(Drawable drawable) {
        this.n.r(drawable);
    }

    @Override // androidx.appcompat.app.a
    public int r() {
        return this.l.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.a
    public void r0(int r6) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int r0 = this.n.J();
        if (r0 == 2) {
            this.t = u();
            R(null);
            this.q.setVisibility(8);
        }
        if (r0 != r6 && !this.A && (actionBarOverlayLayout = this.l) != null) {
            f0.o1(actionBarOverlayLayout);
        }
        this.n.N(r6);
        boolean z = false;
        if (r6 == 2) {
            K0();
            this.q.setVisibility(0);
            int r2 = this.t;
            if (r2 != -1) {
                s0(r2);
                this.t = -1;
            }
        }
        this.n.S(r6 == 2 && !this.A);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.l;
        if (r6 == 2 && !this.A) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    @Override // androidx.appcompat.app.a
    public int s() {
        int r0 = this.n.J();
        if (r0 == 1) {
            return this.n.P();
        }
        if (r0 != 2) {
            return 0;
        }
        return this.r.size();
    }

    @Override // androidx.appcompat.app.a
    public void s0(int r3) {
        int r0 = this.n.J();
        if (r0 == 1) {
            this.n.F(r3);
        } else {
            if (r0 != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            R(this.r.get(r3));
        }
    }

    @Override // androidx.appcompat.app.a
    public int t() {
        return this.n.J();
    }

    @Override // androidx.appcompat.app.a
    public void t0(boolean z) {
        b.a.f.h hVar;
        this.I = z;
        if (z || (hVar = this.H) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public int u() {
        e eVar;
        int r0 = this.n.J();
        if (r0 == 1) {
            return this.n.C();
        }
        if (r0 == 2 && (eVar = this.s) != null) {
            return eVar.d();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.a
    public void u0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public a.f v() {
        return this.s;
    }

    @Override // androidx.appcompat.app.a
    public void v0(Drawable drawable) {
        this.m.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public CharSequence w() {
        return this.n.y();
    }

    @Override // androidx.appcompat.app.a
    public void w0(int r2) {
        x0(this.i.getString(r2));
    }

    @Override // androidx.appcompat.app.a
    public a.f x(int r2) {
        return this.r.get(r2);
    }

    @Override // androidx.appcompat.app.a
    public void x0(CharSequence charSequence) {
        this.n.A(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public int y() {
        return this.r.size();
    }

    @Override // androidx.appcompat.app.a
    public void y0(int r2) {
        z0(this.i.getString(r2));
    }

    @Override // androidx.appcompat.app.a
    public Context z() {
        if (this.j == null) {
            TypedValue typedValue = new TypedValue();
            this.i.getTheme().resolveAttribute(a.b.actionBarWidgetTheme, typedValue, true);
            int r0 = typedValue.resourceId;
            if (r0 != 0) {
                this.j = new ContextThemeWrapper(this.i, r0);
            } else {
                this.j = this.i;
            }
        }
        return this.j;
    }

    @Override // androidx.appcompat.app.a
    public void z0(CharSequence charSequence) {
        this.n.setTitle(charSequence);
    }
}
