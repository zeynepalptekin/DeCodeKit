package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.c0;
import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.s0;
import androidx.core.app.z;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.g;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.j, androidx.lifecycle.x, androidx.savedstate.c {
    static final Object a0 = new Object();
    static final int b0 = 0;
    static final int c0 = 1;
    static final int d0 = 2;
    static final int e0 = 3;
    static final int f0 = 4;
    String A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    private boolean H;
    ViewGroup I;
    View J;
    View K;
    boolean L;
    boolean M;
    d N;
    Runnable O;
    boolean P;
    boolean Q;
    float R;
    LayoutInflater S;
    boolean T;
    g.b U;
    androidx.lifecycle.k V;

    @i0
    v W;
    androidx.lifecycle.o<androidx.lifecycle.j> X;
    androidx.savedstate.b Y;

    @c0
    private int Z;
    int d;
    Bundle e;
    SparseArray<Parcelable> f;

    @i0
    Boolean g;

    @h0
    String h;
    Bundle i;
    Fragment j;
    String k;
    int l;
    private Boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    int t;
    j u;
    h v;

    @h0
    j w;
    Fragment x;
    int y;
    int z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m2();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.i();
        }
    }

    class c extends androidx.fragment.app.e {
        c() {
        }

        @Override // androidx.fragment.app.e
        @i0
        public View c(int r3) {
            View view = Fragment.this.J;
            if (view != null) {
                return view.findViewById(r3);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean f() {
            return Fragment.this.J != null;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        View f425a;

        /* renamed from: b, reason: collision with root package name */
        Animator f426b;

        /* renamed from: c, reason: collision with root package name */
        int f427c;
        int d;
        int e;
        int f;
        Object g = null;
        Object h;
        Object i;
        Object j;
        Object k;
        Object l;
        Boolean m;
        Boolean n;
        z o;
        z p;
        boolean q;
        f r;
        boolean s;

        d() {
            Object obj = Fragment.a0;
            this.h = obj;
            this.i = null;
            this.j = obj;
            this.k = null;
            this.l = obj;
            this.o = null;
            this.p = null;
        }
    }

    public static class e extends RuntimeException {
        public e(@h0 String str, @i0 Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class g implements Parcelable {

        @h0
        public static final Parcelable.Creator<g> CREATOR = new a();
        final Bundle d;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int r1) {
                return new g[r1];
            }
        }

        g(Bundle bundle) {
            this.d = bundle;
        }

        g(@h0 Parcel parcel, @i0 ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.d = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@h0 Parcel parcel, int r2) {
            parcel.writeBundle(this.d);
        }
    }

    public Fragment() {
        this.d = 0;
        this.h = UUID.randomUUID().toString();
        this.k = null;
        this.m = null;
        this.w = new j();
        this.G = true;
        this.M = true;
        this.O = new a();
        this.U = g.b.RESUMED;
        this.X = new androidx.lifecycle.o<>();
        b0();
    }

    @androidx.annotation.n
    public Fragment(@c0 int r1) {
        this();
        this.Z = r1;
    }

    private void b0() {
        this.V = new androidx.lifecycle.k(this);
        this.Y = androidx.savedstate.b.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.V.a(new androidx.lifecycle.h() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.h
                public void d(@h0 androidx.lifecycle.j jVar, @h0 g.a aVar) {
                    View view;
                    if (aVar != g.a.ON_STOP || (view = Fragment.this.J) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    @h0
    @Deprecated
    public static Fragment d0(@h0 Context context, @h0 String str) {
        return e0(context, str, null);
    }

    @h0
    @Deprecated
    public static Fragment e0(@h0 Context context, @h0 String str, @i0 Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = androidx.fragment.app.g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.N1(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e2) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private d l() {
        if (this.N == null) {
            this.N = new d();
        }
        return this.N;
    }

    @i0
    public final Object A() {
        h hVar = this.v;
        if (hVar == null) {
            return null;
        }
        return hVar.m();
    }

    @i0
    public Animator A0(int r1, boolean z, int r3) {
        return null;
    }

    @h0
    public final androidx.fragment.app.d A1() {
        androidx.fragment.app.d dVarN = n();
        if (dVarN != null) {
            return dVarN;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final int B() {
        return this.y;
    }

    public void B0(@h0 Menu menu, @h0 MenuInflater menuInflater) {
    }

    @h0
    public final Bundle B1() {
        Bundle bundleS = s();
        if (bundleS != null) {
            return bundleS;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @h0
    public final LayoutInflater C() {
        LayoutInflater layoutInflater = this.S;
        return layoutInflater == null ? j1(null) : layoutInflater;
    }

    @i0
    public View C0(@h0 LayoutInflater layoutInflater, @i0 ViewGroup viewGroup, @i0 Bundle bundle) {
        int r4 = this.Z;
        if (r4 != 0) {
            return layoutInflater.inflate(r4, viewGroup, false);
        }
        return null;
    }

    @h0
    public final Context C1() {
        Context contextU = u();
        if (contextU != null) {
            return contextU;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @h0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater D(@i0 Bundle bundle) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        h hVar = this.v;
        if (hVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterN = hVar.n();
        b.i.p.k.d(layoutInflaterN, this.w.R0());
        return layoutInflaterN;
    }

    @androidx.annotation.i
    public void D0() {
        this.H = true;
    }

    @h0
    public final i D1() {
        i iVarZ = z();
        if (iVarZ != null) {
            return iVarZ;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @h0
    @Deprecated
    public b.q.b.a E() {
        return b.q.b.a.d(this);
    }

    public void E0() {
    }

    @h0
    public final Object E1() {
        Object objA = A();
        if (objA != null) {
            return objA;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    int F() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.d;
    }

    @androidx.annotation.i
    public void F0() {
        this.H = true;
    }

    @h0
    public final Fragment F1() {
        Fragment fragmentI = I();
        if (fragmentI != null) {
            return fragmentI;
        }
        if (u() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + u());
    }

    int G() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.e;
    }

    @androidx.annotation.i
    public void G0() {
        this.H = true;
    }

    @h0
    public final View G1() {
        View viewX = X();
        if (viewX != null) {
            return viewX;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    int H() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f;
    }

    @h0
    public LayoutInflater H0(@i0 Bundle bundle) {
        return D(bundle);
    }

    void H1(@i0 Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.w.s1(parcelable);
        this.w.U();
    }

    @i0
    public final Fragment I() {
        return this.x;
    }

    public void I0(boolean z) {
    }

    final void I1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f;
        if (sparseArray != null) {
            this.K.restoreHierarchyState(sparseArray);
            this.f = null;
        }
        this.H = false;
        Y0(bundle);
        if (this.H) {
            if (this.J != null) {
                this.W.a(g.a.ON_CREATE);
            }
        } else {
            throw new x("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    @i0
    public Object J() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.j;
        return obj == a0 ? x() : obj;
    }

    @androidx.annotation.i
    @Deprecated
    public void J0(@h0 Activity activity, @h0 AttributeSet attributeSet, @i0 Bundle bundle) {
        this.H = true;
    }

    public void J1(boolean z) {
        l().n = Boolean.valueOf(z);
    }

    @h0
    public final Resources K() {
        return C1().getResources();
    }

    @androidx.annotation.i
    public void K0(@h0 Context context, @h0 AttributeSet attributeSet, @i0 Bundle bundle) {
        this.H = true;
        h hVar = this.v;
        Activity activityG = hVar == null ? null : hVar.g();
        if (activityG != null) {
            this.H = false;
            J0(activityG, attributeSet, bundle);
        }
    }

    public void K1(boolean z) {
        l().m = Boolean.valueOf(z);
    }

    public final boolean L() {
        return this.D;
    }

    public void L0(boolean z) {
    }

    void L1(View view) {
        l().f425a = view;
    }

    @i0
    public Object M() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.h;
        return obj == a0 ? v() : obj;
    }

    public boolean M0(@h0 MenuItem menuItem) {
        return false;
    }

    void M1(Animator animator) {
        l().f426b = animator;
    }

    @i0
    public Object N() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.k;
    }

    public void N0(@h0 Menu menu) {
    }

    public void N1(@i0 Bundle bundle) {
        if (this.u != null && p0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.i = bundle;
    }

    @i0
    public Object O() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.l;
        return obj == a0 ? N() : obj;
    }

    @androidx.annotation.i
    public void O0() {
        this.H = true;
    }

    public void O1(@i0 z zVar) {
        l().o = zVar;
    }

    int P() {
        d dVar = this.N;
        if (dVar == null) {
            return 0;
        }
        return dVar.f427c;
    }

    public void P0(boolean z) {
    }

    public void P1(@i0 Object obj) {
        l().g = obj;
    }

    @h0
    public final String Q(@s0 int r2) {
        return K().getString(r2);
    }

    public void Q0(@h0 Menu menu) {
    }

    public void Q1(@i0 z zVar) {
        l().p = zVar;
    }

    @h0
    public final String R(@s0 int r2, @i0 Object... objArr) {
        return K().getString(r2, objArr);
    }

    public void R0(boolean z) {
    }

    public void R1(@i0 Object obj) {
        l().i = obj;
    }

    @i0
    public final String S() {
        return this.A;
    }

    public void S0(int r1, @h0 String[] strArr, @h0 int[] r3) {
    }

    public void S1(boolean z) {
        if (this.F != z) {
            this.F = z;
            if (!f0() || h0()) {
                return;
            }
            this.v.w();
        }
    }

    @i0
    public final Fragment T() {
        String str;
        Fragment fragment = this.j;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.u;
        if (jVar == null || (str = this.k) == null) {
            return null;
        }
        return jVar.k.get(str);
    }

    @androidx.annotation.i
    public void T0() {
        this.H = true;
    }

    void T1(boolean z) {
        l().s = z;
    }

    public final int U() {
        return this.l;
    }

    public void U0(@h0 Bundle bundle) {
    }

    public void U1(@i0 g gVar) {
        Bundle bundle;
        if (this.u != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (gVar == null || (bundle = gVar.d) == null) {
            bundle = null;
        }
        this.e = bundle;
    }

    @h0
    public final CharSequence V(@s0 int r2) {
        return K().getText(r2);
    }

    @androidx.annotation.i
    public void V0() {
        this.H = true;
    }

    public void V1(boolean z) {
        if (this.G != z) {
            this.G = z;
            if (this.F && f0() && !h0()) {
                this.v.w();
            }
        }
    }

    @Deprecated
    public boolean W() {
        return this.M;
    }

    @androidx.annotation.i
    public void W0() {
        this.H = true;
    }

    void W1(int r2) {
        if (this.N == null && r2 == 0) {
            return;
        }
        l().d = r2;
    }

    @i0
    public View X() {
        return this.J;
    }

    public void X0(@h0 View view, @i0 Bundle bundle) {
    }

    void X1(int r2, int r3) {
        if (this.N == null && r2 == 0 && r3 == 0) {
            return;
        }
        l();
        d dVar = this.N;
        dVar.e = r2;
        dVar.f = r3;
    }

    @e0
    @h0
    public androidx.lifecycle.j Y() {
        v vVar = this.W;
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @androidx.annotation.i
    public void Y0(@i0 Bundle bundle) {
        this.H = true;
    }

    void Y1(f fVar) {
        l();
        f fVar2 = this.N.r;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        d dVar = this.N;
        if (dVar.q) {
            dVar.r = fVar;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    @h0
    public LiveData<androidx.lifecycle.j> Z() {
        return this.X;
    }

    void Z0(Bundle bundle) {
        this.w.i1();
        this.d = 2;
        this.H = false;
        s0(bundle);
        if (this.H) {
            this.w.R();
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void Z1(@i0 Object obj) {
        l().j = obj;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public final boolean a0() {
        return this.F;
    }

    void a1() {
        this.w.I(this.v, new c(), this);
        this.H = false;
        v0(this.v.h());
        if (this.H) {
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void a2(boolean z) {
        this.D = z;
        j jVar = this.u;
        if (jVar == null) {
            this.E = true;
        } else if (z) {
            jVar.F(this);
        } else {
            jVar.p1(this);
        }
    }

    @Override // androidx.lifecycle.j
    @h0
    public androidx.lifecycle.g b() {
        return this.V;
    }

    void b1(@h0 Configuration configuration) {
        onConfigurationChanged(configuration);
        this.w.S(configuration);
    }

    public void b2(@i0 Object obj) {
        l().h = obj;
    }

    void c0() {
        b0();
        this.h = UUID.randomUUID().toString();
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.t = 0;
        this.u = null;
        this.w = new j();
        this.v = null;
        this.y = 0;
        this.z = 0;
        this.A = null;
        this.B = false;
        this.C = false;
    }

    boolean c1(@h0 MenuItem menuItem) {
        if (this.B) {
            return false;
        }
        return x0(menuItem) || this.w.T(menuItem);
    }

    public void c2(@i0 Object obj) {
        l().k = obj;
    }

    void d1(Bundle bundle) {
        this.w.i1();
        this.d = 1;
        this.H = false;
        this.Y.c(bundle);
        y0(bundle);
        this.T = true;
        if (this.H) {
            this.V.j(g.a.ON_CREATE);
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onCreate()");
    }

    public void d2(@i0 Object obj) {
        l().l = obj;
    }

    @Override // androidx.savedstate.c
    @h0
    public final SavedStateRegistry e() {
        return this.Y.b();
    }

    boolean e1(@h0 Menu menu, @h0 MenuInflater menuInflater) {
        boolean z = false;
        if (this.B) {
            return false;
        }
        if (this.F && this.G) {
            z = true;
            B0(menu, menuInflater);
        }
        return z | this.w.V(menu, menuInflater);
    }

    void e2(int r2) {
        l().f427c = r2;
    }

    public final boolean equals(@i0 Object obj) {
        return super.equals(obj);
    }

    public final boolean f0() {
        return this.v != null && this.n;
    }

    void f1(@h0 LayoutInflater layoutInflater, @i0 ViewGroup viewGroup, @i0 Bundle bundle) {
        this.w.i1();
        this.s = true;
        this.W = new v();
        View viewC0 = C0(layoutInflater, viewGroup, bundle);
        this.J = viewC0;
        if (viewC0 != null) {
            this.W.c();
            this.X.p(this.W);
        } else {
            if (this.W.f()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.W = null;
        }
    }

    public void f2(@i0 Fragment fragment, int r5) {
        i iVarZ = z();
        i iVarZ2 = fragment != null ? fragment.z() : null;
        if (iVarZ != null && iVarZ2 != null && iVarZ != iVarZ2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragmentT = fragment; fragmentT != null; fragmentT = fragmentT.T()) {
            if (fragmentT == this) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.k = null;
        } else {
            if (this.u == null || fragment.u == null) {
                this.k = null;
                this.j = fragment;
                this.l = r5;
            }
            this.k = fragment.h;
        }
        this.j = null;
        this.l = r5;
    }

    public final boolean g0() {
        return this.C;
    }

    void g1() {
        this.w.W();
        this.V.j(g.a.ON_DESTROY);
        this.d = 0;
        this.H = false;
        this.T = false;
        D0();
        if (this.H) {
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onDestroy()");
    }

    @Deprecated
    public void g2(boolean z) {
        if (!this.M && z && this.d < 3 && this.u != null && f0() && this.T) {
            this.u.j1(this);
        }
        this.M = z;
        this.L = this.d < 3 && !z;
        if (this.e != null) {
            this.g = Boolean.valueOf(z);
        }
    }

    public final boolean h0() {
        return this.B;
    }

    void h1() {
        this.w.X();
        if (this.J != null) {
            this.W.a(g.a.ON_DESTROY);
        }
        this.d = 1;
        this.H = false;
        F0();
        if (this.H) {
            b.q.b.a.d(this).h();
            this.s = false;
        } else {
            throw new x("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public boolean h2(@h0 String str) {
        h hVar = this.v;
        if (hVar != null) {
            return hVar.s(str);
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void i() {
        d dVar = this.N;
        f fVar = null;
        if (dVar != null) {
            dVar.q = false;
            f fVar2 = dVar.r;
            dVar.r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    boolean i0() {
        d dVar = this.N;
        if (dVar == null) {
            return false;
        }
        return dVar.s;
    }

    void i1() {
        this.H = false;
        G0();
        this.S = null;
        if (this.H) {
            if (this.w.n()) {
                return;
            }
            this.w.W();
            this.w = new j();
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onDetach()");
    }

    public void i2(@SuppressLint({"UnknownNullness"}) Intent intent) {
        j2(intent, null);
    }

    @Override // androidx.lifecycle.x
    @h0
    public androidx.lifecycle.w j() {
        j jVar = this.u;
        if (jVar != null) {
            return jVar.S0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    final boolean j0() {
        return this.t > 0;
    }

    @h0
    LayoutInflater j1(@i0 Bundle bundle) {
        LayoutInflater layoutInflaterH0 = H0(bundle);
        this.S = layoutInflaterH0;
        return layoutInflaterH0;
    }

    public void j2(@SuppressLint({"UnknownNullness"}) Intent intent, @i0 Bundle bundle) {
        h hVar = this.v;
        if (hVar != null) {
            hVar.u(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void k(@h0 String str, @i0 FileDescriptor fileDescriptor, @h0 PrintWriter printWriter, @i0 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mTag=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.d);
        printWriter.print(" mWho=");
        printWriter.print(this.h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.n);
        printWriter.print(" mRemoving=");
        printWriter.print(this.o);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.p);
        printWriter.print(" mInLayout=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.B);
        printWriter.print(" mDetached=");
        printWriter.print(this.C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.G);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.D);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.M);
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.u);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.v);
        }
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.x);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.i);
        }
        if (this.e != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.e);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f);
        }
        Fragment fragmentT = T();
        if (fragmentT != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentT);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.l);
        }
        if (F() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(F());
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.J);
        }
        if (q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(q());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(P());
        }
        if (u() != null) {
            b.q.b.a.d(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.w + ":");
        this.w.c(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean k0() {
        return this.q;
    }

    void k1() {
        onLowMemory();
        this.w.Y();
    }

    public void k2(@SuppressLint({"UnknownNullness"}) Intent intent, int r3, @i0 Bundle bundle) {
        h hVar = this.v;
        if (hVar != null) {
            hVar.u(this, intent, r3, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public final boolean l0() {
        return this.G;
    }

    void l1(boolean z) {
        L0(z);
        this.w.Z(z);
    }

    public void l2(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int r12, @i0 Intent intent, int r14, int r15, int r16, @i0 Bundle bundle) throws IntentSender.SendIntentException {
        h hVar = this.v;
        if (hVar != null) {
            hVar.v(this, intentSender, r12, intent, r14, r15, r16, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @i0
    Fragment m(@h0 String str) {
        return str.equals(this.h) ? this : this.w.J0(str);
    }

    boolean m0() {
        d dVar = this.N;
        if (dVar == null) {
            return false;
        }
        return dVar.q;
    }

    boolean m1(@h0 MenuItem menuItem) {
        if (this.B) {
            return false;
        }
        return (this.F && this.G && M0(menuItem)) || this.w.o0(menuItem);
    }

    public void m2() {
        j jVar = this.u;
        if (jVar == null || jVar.u == null) {
            l().q = false;
        } else if (Looper.myLooper() != this.u.u.i().getLooper()) {
            this.u.u.i().postAtFrontOfQueue(new b());
        } else {
            i();
        }
    }

    @i0
    public final androidx.fragment.app.d n() {
        h hVar = this.v;
        if (hVar == null) {
            return null;
        }
        return (androidx.fragment.app.d) hVar.g();
    }

    public final boolean n0() {
        return this.o;
    }

    void n1(@h0 Menu menu) {
        if (this.B) {
            return;
        }
        if (this.F && this.G) {
            N0(menu);
        }
        this.w.p0(menu);
    }

    public void n2(@h0 View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public boolean o() {
        Boolean bool;
        d dVar = this.N;
        if (dVar == null || (bool = dVar.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean o0() {
        return this.d >= 4;
    }

    void o1() {
        this.w.r0();
        if (this.J != null) {
            this.W.a(g.a.ON_PAUSE);
        }
        this.V.j(g.a.ON_PAUSE);
        this.d = 3;
        this.H = false;
        O0();
        if (this.H) {
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onPause()");
    }

    @Override // android.content.ComponentCallbacks
    @androidx.annotation.i
    public void onConfigurationChanged(@h0 Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@h0 ContextMenu contextMenu, @h0 View view, @i0 ContextMenu.ContextMenuInfo contextMenuInfo) {
        A1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    @androidx.annotation.i
    public void onLowMemory() {
        this.H = true;
    }

    public boolean p() {
        Boolean bool;
        d dVar = this.N;
        if (dVar == null || (bool = dVar.m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean p0() {
        j jVar = this.u;
        if (jVar == null) {
            return false;
        }
        return jVar.o();
    }

    void p1(boolean z) {
        P0(z);
        this.w.s0(z);
    }

    View q() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.f425a;
    }

    public final boolean q0() {
        View view;
        return (!f0() || h0() || (view = this.J) == null || view.getWindowToken() == null || this.J.getVisibility() != 0) ? false : true;
    }

    boolean q1(@h0 Menu menu) {
        boolean z = false;
        if (this.B) {
            return false;
        }
        if (this.F && this.G) {
            z = true;
            Q0(menu);
        }
        return z | this.w.t0(menu);
    }

    Animator r() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.f426b;
    }

    void r0() {
        this.w.i1();
    }

    void r1() {
        boolean zW0 = this.u.W0(this);
        Boolean bool = this.m;
        if (bool == null || bool.booleanValue() != zW0) {
            this.m = Boolean.valueOf(zW0);
            R0(zW0);
            this.w.u0();
        }
    }

    @i0
    public final Bundle s() {
        return this.i;
    }

    @androidx.annotation.i
    public void s0(@i0 Bundle bundle) {
        this.H = true;
    }

    void s1() {
        this.w.i1();
        this.w.E0();
        this.d = 4;
        this.H = false;
        T0();
        if (!this.H) {
            throw new x("Fragment " + this + " did not call through to super.onResume()");
        }
        this.V.j(g.a.ON_RESUME);
        if (this.J != null) {
            this.W.a(g.a.ON_RESUME);
        }
        this.w.v0();
        this.w.E0();
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int r3) {
        k2(intent, r3, null);
    }

    @h0
    public final i t() {
        if (this.v != null) {
            return this.w;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void t0(int r1, int r2, @i0 Intent intent) {
    }

    void t1(Bundle bundle) {
        U0(bundle);
        this.Y.d(bundle);
        Parcelable parcelableV1 = this.w.v1();
        if (parcelableV1 != null) {
            bundle.putParcelable("android:support:fragments", parcelableV1);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        b.i.o.c.a(this, sb);
        sb.append(" (");
        sb.append(this.h);
        sb.append(")");
        if (this.y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.y));
        }
        if (this.A != null) {
            sb.append(" ");
            sb.append(this.A);
        }
        sb.append('}');
        return sb.toString();
    }

    @i0
    public Context u() {
        h hVar = this.v;
        if (hVar == null) {
            return null;
        }
        return hVar.h();
    }

    @androidx.annotation.i
    @Deprecated
    public void u0(@h0 Activity activity) {
        this.H = true;
    }

    void u1() {
        this.w.i1();
        this.w.E0();
        this.d = 3;
        this.H = false;
        V0();
        if (this.H) {
            this.V.j(g.a.ON_START);
            if (this.J != null) {
                this.W.a(g.a.ON_START);
            }
            this.w.w0();
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onStart()");
    }

    @i0
    public Object v() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.g;
    }

    @androidx.annotation.i
    public void v0(@h0 Context context) {
        this.H = true;
        h hVar = this.v;
        Activity activityG = hVar == null ? null : hVar.g();
        if (activityG != null) {
            this.H = false;
            u0(activityG);
        }
    }

    void v1() {
        this.w.y0();
        if (this.J != null) {
            this.W.a(g.a.ON_STOP);
        }
        this.V.j(g.a.ON_STOP);
        this.d = 2;
        this.H = false;
        W0();
        if (this.H) {
            return;
        }
        throw new x("Fragment " + this + " did not call through to super.onStop()");
    }

    z w() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    public void w0(@h0 Fragment fragment) {
    }

    public void w1() {
        l().q = true;
    }

    @i0
    public Object x() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.i;
    }

    public boolean x0(@h0 MenuItem menuItem) {
        return false;
    }

    public final void x1(long j, @h0 TimeUnit timeUnit) {
        l().q = true;
        j jVar = this.u;
        Handler handlerI = jVar != null ? jVar.u.i() : new Handler(Looper.getMainLooper());
        handlerI.removeCallbacks(this.O);
        handlerI.postDelayed(this.O, timeUnit.toMillis(j));
    }

    z y() {
        d dVar = this.N;
        if (dVar == null) {
            return null;
        }
        return dVar.p;
    }

    @androidx.annotation.i
    public void y0(@i0 Bundle bundle) {
        this.H = true;
        H1(bundle);
        if (this.w.X0(1)) {
            return;
        }
        this.w.U();
    }

    public void y1(@h0 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @i0
    public final i z() {
        return this.u;
    }

    @i0
    public Animation z0(int r1, boolean z, int r3) {
        return null;
    }

    public final void z1(@h0 String[] strArr, int r3) {
        h hVar = this.v;
        if (hVar != null) {
            hVar.q(this, strArr, r3);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
}
