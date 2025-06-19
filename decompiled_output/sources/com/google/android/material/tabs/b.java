package com.google.android.material.tabs;

import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.recyclerview.widget.RecyclerView;
import b.z.b.h;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @h0
    private final TabLayout f6817a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final h f6818b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6819c;
    private final boolean d;
    private final InterfaceC0202b e;

    @i0
    private RecyclerView.g<?> f;
    private boolean g;

    @i0
    private c h;

    @i0
    private TabLayout.f i;

    @i0
    private RecyclerView.i j;

    private class a extends RecyclerView.i {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            b.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void b(int r1, int r2) {
            b.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int r1, int r2, @i0 Object obj) {
            b.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int r1, int r2) {
            b.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int r1, int r2, int r3) {
            b.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void f(int r1, int r2) {
            b.this.c();
        }
    }

    /* renamed from: com.google.android.material.tabs.b$b, reason: collision with other inner class name */
    public interface InterfaceC0202b {
        void a(@h0 TabLayout.i iVar, int r2);
    }

    private static class c extends h.j {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final WeakReference<TabLayout> f6821a;

        /* renamed from: b, reason: collision with root package name */
        private int f6822b;

        /* renamed from: c, reason: collision with root package name */
        private int f6823c;

        c(TabLayout tabLayout) {
            this.f6821a = new WeakReference<>(tabLayout);
            d();
        }

        @Override // b.z.b.h.j
        public void a(int r2) {
            this.f6822b = this.f6823c;
            this.f6823c = r2;
        }

        @Override // b.z.b.h.j
        public void b(int r6, float f, int r8) {
            TabLayout tabLayout = this.f6821a.get();
            if (tabLayout != null) {
                tabLayout.P(r6, f, this.f6823c != 2 || this.f6822b == 1, (this.f6823c == 2 && this.f6822b == 0) ? false : true);
            }
        }

        @Override // b.z.b.h.j
        public void c(int r4) {
            TabLayout tabLayout = this.f6821a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == r4 || r4 >= tabLayout.getTabCount()) {
                return;
            }
            int r1 = this.f6823c;
            tabLayout.M(tabLayout.y(r4), r1 == 0 || (r1 == 2 && this.f6822b == 0));
        }

        void d() {
            this.f6823c = 0;
            this.f6822b = 0;
        }
    }

    private static class d implements TabLayout.f {

        /* renamed from: a, reason: collision with root package name */
        private final h f6824a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6825b;

        d(h hVar, boolean z) {
            this.f6824a = hVar;
            this.f6825b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@h0 TabLayout.i iVar) {
            this.f6824a.s(iVar.i(), this.f6825b);
        }
    }

    public b(@h0 TabLayout tabLayout, @h0 h hVar, @h0 InterfaceC0202b interfaceC0202b) {
        this(tabLayout, hVar, true, interfaceC0202b);
    }

    public b(@h0 TabLayout tabLayout, @h0 h hVar, boolean z, @h0 InterfaceC0202b interfaceC0202b) {
        this(tabLayout, hVar, z, true, interfaceC0202b);
    }

    public b(@h0 TabLayout tabLayout, @h0 h hVar, boolean z, boolean z2, @h0 InterfaceC0202b interfaceC0202b) {
        this.f6817a = tabLayout;
        this.f6818b = hVar;
        this.f6819c = z;
        this.d = z2;
        this.e = interfaceC0202b;
    }

    public void a() {
        if (this.g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.g<?> adapter = this.f6818b.getAdapter();
        this.f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.g = true;
        c cVar = new c(this.f6817a);
        this.h = cVar;
        this.f6818b.n(cVar);
        d dVar = new d(this.f6818b, this.d);
        this.i = dVar;
        this.f6817a.c(dVar);
        if (this.f6819c) {
            a aVar = new a();
            this.j = aVar;
            this.f.C(aVar);
        }
        c();
        this.f6817a.O(this.f6818b.getCurrentItem(), 0.0f, true);
    }

    public void b() {
        RecyclerView.g<?> gVar;
        if (this.f6819c && (gVar = this.f) != null) {
            gVar.E(this.j);
            this.j = null;
        }
        this.f6817a.H(this.i);
        this.f6818b.x(this.h);
        this.i = null;
        this.h = null;
        this.f = null;
        this.g = false;
    }

    void c() {
        this.f6817a.F();
        RecyclerView.g<?> gVar = this.f;
        if (gVar != null) {
            int r0 = gVar.e();
            for (int r2 = 0; r2 < r0; r2++) {
                TabLayout.i iVarC = this.f6817a.C();
                this.e.a(iVarC, r2);
                this.f6817a.g(iVarC, false);
            }
            if (r0 > 0) {
                int r02 = Math.min(this.f6818b.getCurrentItem(), this.f6817a.getTabCount() - 1);
                if (r02 != this.f6817a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f6817a;
                    tabLayout.L(tabLayout.y(r02));
                }
            }
        }
    }
}
