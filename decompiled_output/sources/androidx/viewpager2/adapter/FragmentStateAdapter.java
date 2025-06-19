package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.r;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.recyclerview.widget.RecyclerView;
import b.f.f;
import b.i.p.f0;
import b.z.b.h;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.g<androidx.viewpager2.adapter.a> implements androidx.viewpager2.adapter.b {
    private static final String k = "f#";
    private static final String l = "s#";
    private static final long m = 10000;

    /* renamed from: c, reason: collision with root package name */
    final g f777c;
    final i d;
    final f<Fragment> e;
    private final f<Fragment.g> f;
    private final f<Integer> g;
    private FragmentMaxLifecycleEnforcer h;
    boolean i;
    private boolean j;

    class FragmentMaxLifecycleEnforcer {

        /* renamed from: a, reason: collision with root package name */
        private h.j f783a;

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView.i f784b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.lifecycle.h f785c;
        private h d;
        private long e = -1;

        class a extends h.j {
            a() {
            }

            @Override // b.z.b.h.j
            public void a(int r2) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // b.z.b.h.j
            public void c(int r2) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        class b extends d {
            b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.d, androidx.recyclerview.widget.RecyclerView.i
            public void a() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        @h0
        private h a(@h0 RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof h) {
                return (h) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(@h0 RecyclerView recyclerView) {
            this.d = a(recyclerView);
            a aVar = new a();
            this.f783a = aVar;
            this.d.n(aVar);
            b bVar = new b();
            this.f784b = bVar;
            FragmentStateAdapter.this.C(bVar);
            androidx.lifecycle.h hVar = new androidx.lifecycle.h() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.h
                public void d(@h0 j jVar, @h0 g.a aVar2) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f785c = hVar;
            FragmentStateAdapter.this.f777c.a(hVar);
        }

        void c(@h0 RecyclerView recyclerView) {
            a(recyclerView).x(this.f783a);
            FragmentStateAdapter.this.E(this.f784b);
            FragmentStateAdapter.this.f777c.c(this.f785c);
            this.d = null;
        }

        void d(boolean z) {
            int currentItem;
            Fragment fragmentK;
            if (FragmentStateAdapter.this.Y() || this.d.getScrollState() != 0 || FragmentStateAdapter.this.e.o() || FragmentStateAdapter.this.e() == 0 || (currentItem = this.d.getCurrentItem()) >= FragmentStateAdapter.this.e()) {
                return;
            }
            long jF = FragmentStateAdapter.this.f(currentItem);
            if ((jF != this.e || z) && (fragmentK = FragmentStateAdapter.this.e.k(jF)) != null && fragmentK.f0()) {
                this.e = jF;
                r rVarB = FragmentStateAdapter.this.d.b();
                Fragment fragment = null;
                for (int r2 = 0; r2 < FragmentStateAdapter.this.e.A(); r2++) {
                    long jP = FragmentStateAdapter.this.e.p(r2);
                    Fragment fragmentC = FragmentStateAdapter.this.e.C(r2);
                    if (fragmentC.f0()) {
                        if (jP != this.e) {
                            rVarB.I(fragmentC, g.b.STARTED);
                        } else {
                            fragment = fragmentC;
                        }
                        fragmentC.V1(jP == this.e);
                    }
                }
                if (fragment != null) {
                    rVarB.I(fragment, g.b.RESUMED);
                }
                if (rVarB.w()) {
                    return;
                }
                rVarB.p();
            }
        }
    }

    class a implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FrameLayout f789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.viewpager2.adapter.a f790b;

        a(FrameLayout frameLayout, androidx.viewpager2.adapter.a aVar) {
            this.f789a = frameLayout;
            this.f790b = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            if (this.f789a.getParent() != null) {
                this.f789a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.U(this.f790b);
            }
        }
    }

    class b extends i.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f792a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f793b;

        b(Fragment fragment, FrameLayout frameLayout) {
            this.f792a = fragment;
            this.f793b = frameLayout;
        }

        @Override // androidx.fragment.app.i.b
        public void m(@h0 i iVar, @h0 Fragment fragment, @h0 View view, @i0 Bundle bundle) {
            if (fragment == this.f792a) {
                iVar.B(this);
                FragmentStateAdapter.this.F(view, this.f793b);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.i = false;
            fragmentStateAdapter.K();
        }
    }

    private static abstract class d extends RecyclerView.i {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b(int r1, int r2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int r1, int r2, @i0 Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int r1, int r2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int r1, int r2, int r3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int r1, int r2) {
            a();
        }
    }

    public FragmentStateAdapter(@h0 Fragment fragment) {
        this(fragment.t(), fragment.b());
    }

    public FragmentStateAdapter(@h0 androidx.fragment.app.d dVar) {
        this(dVar.t(), dVar.b());
    }

    public FragmentStateAdapter(@h0 i iVar, @h0 g gVar) {
        this.e = new f<>();
        this.f = new f<>();
        this.g = new f<>();
        this.i = false;
        this.j = false;
        this.d = iVar;
        this.f777c = gVar;
        super.D(true);
    }

    @h0
    private static String I(@h0 String str, long j) {
        return str + j;
    }

    private void J(int r4) {
        long jF = f(r4);
        if (this.e.e(jF)) {
            return;
        }
        Fragment fragmentH = H(r4);
        fragmentH.U1(this.f.k(jF));
        this.e.q(jF, fragmentH);
    }

    private boolean L(long j) {
        View viewX;
        if (this.g.e(j)) {
            return true;
        }
        Fragment fragmentK = this.e.k(j);
        return (fragmentK == null || (viewX = fragmentK.X()) == null || viewX.getParent() == null) ? false : true;
    }

    private static boolean M(@h0 String str, @h0 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long N(int r5) {
        Long lValueOf = null;
        for (int r1 = 0; r1 < this.g.A(); r1++) {
            if (this.g.C(r1).intValue() == r5) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.g.p(r1));
            }
        }
        return lValueOf;
    }

    private static long T(@h0 String str, @h0 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void V(long j) {
        ViewParent parent;
        Fragment fragmentK = this.e.k(j);
        if (fragmentK == null) {
            return;
        }
        if (fragmentK.X() != null && (parent = fragmentK.X().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!G(j)) {
            this.f.t(j);
        }
        if (!fragmentK.f0()) {
            this.e.t(j);
            return;
        }
        if (Y()) {
            this.j = true;
            return;
        }
        if (fragmentK.f0() && G(j)) {
            this.f.q(j, this.d.z(fragmentK));
        }
        this.d.b().x(fragmentK).p();
        this.e.t(j);
    }

    private void W() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.f777c.a(new androidx.lifecycle.h() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.h
            public void d(@h0 j jVar, @h0 g.a aVar) {
                if (aVar == g.a.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    jVar.b().c(this);
                }
            }
        });
        handler.postDelayed(cVar, m);
    }

    private void X(Fragment fragment, @h0 FrameLayout frameLayout) {
        this.d.x(new b(fragment, frameLayout), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void D(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    void F(@h0 View view, @h0 FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean G(long j) {
        return j >= 0 && j < ((long) e());
    }

    @h0
    public abstract Fragment H(int r1);

    void K() {
        if (!this.j || Y()) {
            return;
        }
        b.f.b bVar = new b.f.b();
        for (int r2 = 0; r2 < this.e.A(); r2++) {
            long jP = this.e.p(r2);
            if (!G(jP)) {
                bVar.add(Long.valueOf(jP));
                this.g.t(jP);
            }
        }
        if (!this.i) {
            this.j = false;
            for (int r1 = 0; r1 < this.e.A(); r1++) {
                long jP2 = this.e.p(r1);
                if (!L(jP2)) {
                    bVar.add(Long.valueOf(jP2));
                }
            }
        }
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            V(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void u(@h0 androidx.viewpager2.adapter.a aVar, int r9) {
        long jK = aVar.k();
        int id = aVar.P().getId();
        Long lN = N(id);
        if (lN != null && lN.longValue() != jK) {
            V(lN.longValue());
            this.g.t(lN.longValue());
        }
        this.g.q(jK, Integer.valueOf(id));
        J(r9);
        FrameLayout frameLayoutP = aVar.P();
        if (f0.J0(frameLayoutP)) {
            if (frameLayoutP.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayoutP.addOnLayoutChangeListener(new a(frameLayoutP, aVar));
        }
        K();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @h0
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final androidx.viewpager2.adapter.a w(@h0 ViewGroup viewGroup, int r2) {
        return androidx.viewpager2.adapter.a.O(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final boolean y(@h0 androidx.viewpager2.adapter.a aVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void z(@h0 androidx.viewpager2.adapter.a aVar) {
        U(aVar);
        K();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void B(@h0 androidx.viewpager2.adapter.a aVar) {
        Long lN = N(aVar.P().getId());
        if (lN != null) {
            V(lN.longValue());
            this.g.t(lN.longValue());
        }
    }

    void U(@h0 final androidx.viewpager2.adapter.a aVar) {
        Fragment fragmentK = this.e.k(aVar.k());
        if (fragmentK == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutP = aVar.P();
        View viewX = fragmentK.X();
        if (!fragmentK.f0() && viewX != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentK.f0() && viewX == null) {
            X(fragmentK, frameLayoutP);
            return;
        }
        if (fragmentK.f0() && viewX.getParent() != null) {
            if (viewX.getParent() != frameLayoutP) {
                F(viewX, frameLayoutP);
                return;
            }
            return;
        }
        if (fragmentK.f0()) {
            F(viewX, frameLayoutP);
            return;
        }
        if (Y()) {
            if (this.d.n()) {
                return;
            }
            this.f777c.a(new androidx.lifecycle.h() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.h
                public void d(@h0 j jVar, @h0 g.a aVar2) {
                    if (FragmentStateAdapter.this.Y()) {
                        return;
                    }
                    jVar.b().c(this);
                    if (f0.J0(aVar.P())) {
                        FragmentStateAdapter.this.U(aVar);
                    }
                }
            });
            return;
        }
        X(fragmentK, frameLayoutP);
        this.d.b().i(fragmentK, "f" + aVar.k()).I(fragmentK, g.b.STARTED).p();
        this.h.d(false);
    }

    boolean Y() {
        return this.d.o();
    }

    @Override // androidx.viewpager2.adapter.b
    @h0
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.e.A() + this.f.A());
        for (int r2 = 0; r2 < this.e.A(); r2++) {
            long jP = this.e.p(r2);
            Fragment fragmentK = this.e.k(jP);
            if (fragmentK != null && fragmentK.f0()) {
                this.d.w(bundle, I(k, jP), fragmentK);
            }
        }
        for (int r1 = 0; r1 < this.f.A(); r1++) {
            long jP2 = this.f.p(r1);
            if (G(jP2)) {
                bundle.putParcelable(I(l, jP2), this.f.k(jP2));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.b
    public final void b(@h0 Parcelable parcelable) {
        long jT;
        Object objJ;
        f fVar;
        if (!this.f.o() || !this.e.o()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(FragmentStateAdapter.class.getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (M(str, k)) {
                jT = T(str, k);
                objJ = this.d.j(bundle, str);
                fVar = this.e;
            } else {
                if (!M(str, l)) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                jT = T(str, l);
                objJ = (Fragment.g) bundle.getParcelable(str);
                if (G(jT)) {
                    fVar = this.f;
                }
            }
            fVar.q(jT, objJ);
        }
        if (this.e.o()) {
            return;
        }
        this.j = true;
        this.i = true;
        K();
        W();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long f(int r3) {
        return r3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @androidx.annotation.i
    public void t(@h0 RecyclerView recyclerView) {
        b.i.o.i.a(this.h == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.h = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @androidx.annotation.i
    public void x(@h0 RecyclerView recyclerView) {
        this.h.c(recyclerView);
        this.h = null;
    }
}
