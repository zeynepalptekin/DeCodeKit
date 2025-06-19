package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.c0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.n;
import androidx.recyclerview.widget.RecyclerView;
import b.i.p.f0;
import b.i.p.o0;
import b.i.p.p0.d;
import c.a.b.c.a;
import java.util.ArrayList;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class i implements androidx.appcompat.view.menu.n {
    private static final String A = "android:menu:adapter";
    private static final String B = "android:menu:header";
    private static final String z = "android:menu:list";
    private NavigationMenuView d;
    LinearLayout e;
    private n.a f;
    androidx.appcompat.view.menu.g g;
    private int h;
    c i;
    LayoutInflater j;
    int k;
    boolean l;
    ColorStateList m;
    ColorStateList n;
    Drawable o;
    int p;
    int q;
    int r;
    boolean s;
    private int u;
    private int v;
    int w;
    boolean t = true;
    private int x = -1;
    final View.OnClickListener y = new a();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            i.this.C(true);
            androidx.appcompat.view.menu.j itemData = ((NavigationMenuItemView) view).getItemData();
            i iVar = i.this;
            boolean zP = iVar.g.P(itemData, iVar, 0);
            if (itemData != null && itemData.isCheckable() && zP) {
                i.this.i.O(itemData);
            } else {
                z = false;
            }
            i.this.C(false);
            if (z) {
                i.this.N(false);
            }
        }
    }

    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    private class c extends RecyclerView.g<l> {
        private static final String g = "android:menu:checked";
        private static final String h = "android:menu:action_views";
        private static final int i = 0;
        private static final int j = 1;
        private static final int k = 2;
        private static final int l = 3;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<e> f6733c = new ArrayList<>();
        private androidx.appcompat.view.menu.j d;
        private boolean e;

        c() {
            M();
        }

        private void F(int r3, int r4) {
            while (r3 < r4) {
                ((g) this.f6733c.get(r3)).f6737b = true;
                r3++;
            }
        }

        private void M() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.f6733c.clear();
            this.f6733c.add(new d());
            int r2 = -1;
            int size = i.this.g.H().size();
            boolean z = false;
            int size2 = 0;
            for (int r5 = 0; r5 < size; r5++) {
                androidx.appcompat.view.menu.j jVar = i.this.g.H().get(r5);
                if (jVar.isChecked()) {
                    O(jVar);
                }
                if (jVar.isCheckable()) {
                    jVar.w(false);
                }
                if (jVar.hasSubMenu()) {
                    SubMenu subMenu = jVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (r5 != 0) {
                            this.f6733c.add(new f(i.this.w, 0));
                        }
                        this.f6733c.add(new g(jVar));
                        int size3 = this.f6733c.size();
                        int size4 = subMenu.size();
                        boolean z2 = false;
                        for (int r12 = 0; r12 < size4; r12++) {
                            androidx.appcompat.view.menu.j jVar2 = (androidx.appcompat.view.menu.j) subMenu.getItem(r12);
                            if (jVar2.isVisible()) {
                                if (!z2 && jVar2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (jVar2.isCheckable()) {
                                    jVar2.w(false);
                                }
                                if (jVar.isChecked()) {
                                    O(jVar);
                                }
                                this.f6733c.add(new g(jVar2));
                            }
                        }
                        if (z2) {
                            F(size3, this.f6733c.size());
                        }
                    }
                } else {
                    int groupId = jVar.getGroupId();
                    if (groupId != r2) {
                        size2 = this.f6733c.size();
                        z = jVar.getIcon() != null;
                        if (r5 != 0) {
                            size2++;
                            ArrayList<e> arrayList = this.f6733c;
                            int r10 = i.this.w;
                            arrayList.add(new f(r10, r10));
                        }
                    } else if (!z && jVar.getIcon() != null) {
                        F(size2, this.f6733c.size());
                        z = true;
                    }
                    g gVar = new g(jVar);
                    gVar.f6737b = z;
                    this.f6733c.add(gVar);
                    r2 = groupId;
                }
            }
            this.e = false;
        }

        @h0
        public Bundle G() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.j jVar = this.d;
            if (jVar != null) {
                bundle.putInt(g, jVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f6733c.size();
            for (int r2 = 0; r2 < size; r2++) {
                e eVar = this.f6733c.get(r2);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.j jVarA = ((g) eVar).a();
                    View actionView = jVarA != null ? jVarA.getActionView() : null;
                    if (actionView != null) {
                        com.google.android.material.internal.k kVar = new com.google.android.material.internal.k();
                        actionView.saveHierarchyState(kVar);
                        sparseArray.put(jVarA.getItemId(), kVar);
                    }
                }
            }
            bundle.putSparseParcelableArray(h, sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.j H() {
            return this.d;
        }

        int I() {
            int r0 = i.this.e.getChildCount() == 0 ? 0 : 1;
            for (int r1 = 0; r1 < i.this.i.e(); r1++) {
                if (i.this.i.g(r1) == 0) {
                    r0++;
                }
            }
            return r0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public void u(@h0 l lVar, int r5) throws Resources.NotFoundException {
            int r0 = g(r5);
            if (r0 != 0) {
                if (r0 == 1) {
                    ((TextView) lVar.f561a).setText(((g) this.f6733c.get(r5)).a().getTitle());
                    return;
                } else {
                    if (r0 != 2) {
                        return;
                    }
                    f fVar = (f) this.f6733c.get(r5);
                    lVar.f561a.setPadding(0, fVar.b(), 0, fVar.a());
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f561a;
            navigationMenuItemView.setIconTintList(i.this.n);
            i iVar = i.this;
            if (iVar.l) {
                navigationMenuItemView.setTextAppearance(iVar.k);
            }
            ColorStateList colorStateList = i.this.m;
            if (colorStateList != null) {
                navigationMenuItemView.setTextColor(colorStateList);
            }
            Drawable drawable = i.this.o;
            f0.B1(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            g gVar = (g) this.f6733c.get(r5);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f6737b);
            navigationMenuItemView.setHorizontalPadding(i.this.p);
            navigationMenuItemView.setIconPadding(i.this.q);
            i iVar2 = i.this;
            if (iVar2.s) {
                navigationMenuItemView.setIconSize(iVar2.r);
            }
            navigationMenuItemView.setMaxLines(i.this.u);
            navigationMenuItemView.g(gVar.a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        @i0
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public l w(ViewGroup viewGroup, int r4) {
            if (r4 == 0) {
                i iVar = i.this;
                return new C0200i(iVar.j, viewGroup, iVar.y);
            }
            if (r4 == 1) {
                return new k(i.this.j, viewGroup);
            }
            if (r4 == 2) {
                return new j(i.this.j, viewGroup);
            }
            if (r4 != 3) {
                return null;
            }
            return new b(i.this.e);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public void B(l lVar) {
            if (lVar instanceof C0200i) {
                ((NavigationMenuItemView) lVar.f561a).H();
            }
        }

        public void N(@h0 Bundle bundle) {
            androidx.appcompat.view.menu.j jVarA;
            View actionView;
            com.google.android.material.internal.k kVar;
            androidx.appcompat.view.menu.j jVarA2;
            int r0 = bundle.getInt(g, 0);
            if (r0 != 0) {
                this.e = true;
                int size = this.f6733c.size();
                int r3 = 0;
                while (true) {
                    if (r3 >= size) {
                        break;
                    }
                    e eVar = this.f6733c.get(r3);
                    if ((eVar instanceof g) && (jVarA2 = ((g) eVar).a()) != null && jVarA2.getItemId() == r0) {
                        O(jVarA2);
                        break;
                    }
                    r3++;
                }
                this.e = false;
                M();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(h);
            if (sparseParcelableArray != null) {
                int size2 = this.f6733c.size();
                for (int r1 = 0; r1 < size2; r1++) {
                    e eVar2 = this.f6733c.get(r1);
                    if ((eVar2 instanceof g) && (jVarA = ((g) eVar2).a()) != null && (actionView = jVarA.getActionView()) != null && (kVar = (com.google.android.material.internal.k) sparseParcelableArray.get(jVarA.getItemId())) != null) {
                        actionView.restoreHierarchyState(kVar);
                    }
                }
            }
        }

        public void O(@h0 androidx.appcompat.view.menu.j jVar) {
            if (this.d == jVar || !jVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.j jVar2 = this.d;
            if (jVar2 != null) {
                jVar2.setChecked(false);
            }
            this.d = jVar;
            jVar.setChecked(true);
        }

        public void P(boolean z) {
            this.e = z;
        }

        public void Q() {
            M();
            j();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int e() {
            return this.f6733c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public long f(int r3) {
            return r3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int g(int r2) {
            e eVar = this.f6733c.get(r2);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    private static class d implements e {
        d() {
        }
    }

    private interface e {
    }

    private static class f implements e {

        /* renamed from: a, reason: collision with root package name */
        private final int f6734a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6735b;

        public f(int r1, int r2) {
            this.f6734a = r1;
            this.f6735b = r2;
        }

        public int a() {
            return this.f6735b;
        }

        public int b() {
            return this.f6734a;
        }
    }

    private static class g implements e {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.appcompat.view.menu.j f6736a;

        /* renamed from: b, reason: collision with root package name */
        boolean f6737b;

        g(androidx.appcompat.view.menu.j jVar) {
            this.f6736a = jVar;
        }

        public androidx.appcompat.view.menu.j a() {
            return this.f6736a;
        }
    }

    private class h extends androidx.recyclerview.widget.y {
        h(@h0 RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.y, b.i.p.a
        public void g(View view, @h0 b.i.p.p0.d dVar) {
            super.g(view, dVar);
            dVar.V0(d.b.e(i.this.i.I(), 0, false));
        }
    }

    /* renamed from: com.google.android.material.internal.i$i, reason: collision with other inner class name */
    private static class C0200i extends l {
        public C0200i(@h0 LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(a.k.design_navigation_item, viewGroup, false));
            this.f561a.setOnClickListener(onClickListener);
        }
    }

    private static class j extends l {
        public j(@h0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a.k.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class k extends l {
        public k(@h0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a.k.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static abstract class l extends RecyclerView.f0 {
        public l(View view) {
            super(view);
        }
    }

    private void D() {
        int r0 = (this.e.getChildCount() == 0 && this.t) ? this.v : 0;
        NavigationMenuView navigationMenuView = this.d;
        navigationMenuView.setPadding(0, r0, 0, navigationMenuView.getPaddingBottom());
    }

    public void A(@i0 ColorStateList colorStateList) {
        this.m = colorStateList;
        N(false);
    }

    public void B(int r2) {
        this.x = r2;
        NavigationMenuView navigationMenuView = this.d;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(r2);
        }
    }

    public void C(boolean z2) {
        c cVar = this.i;
        if (cVar != null) {
            cVar.P(z2);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public int J() {
        return this.h;
    }

    @Override // androidx.appcompat.view.menu.n
    public void K(@h0 Context context, @h0 androidx.appcompat.view.menu.g gVar) {
        this.j = LayoutInflater.from(context);
        this.g = gVar;
        this.w = context.getResources().getDimensionPixelOffset(a.f.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.n
    public void L(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.d.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(A);
            if (bundle2 != null) {
                this.i.N(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray(B);
            if (sparseParcelableArray2 != null) {
                this.e.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean M(androidx.appcompat.view.menu.s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void N(boolean z2) {
        c cVar = this.i;
        if (cVar != null) {
            cVar.Q();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public androidx.appcompat.view.menu.o O(ViewGroup viewGroup) {
        if (this.d == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.j.inflate(a.k.design_navigation_menu, viewGroup, false);
            this.d = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.d));
            if (this.i == null) {
                this.i = new c();
            }
            int r4 = this.x;
            if (r4 != -1) {
                this.d.setOverScrollMode(r4);
            }
            this.e = (LinearLayout) this.j.inflate(a.k.design_navigation_item_header, (ViewGroup) this.d, false);
            this.d.setAdapter(this.i);
        }
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean P() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    @h0
    public Parcelable Q() {
        Bundle bundle = new Bundle();
        if (this.d != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.d.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.i;
        if (cVar != null) {
            bundle.putBundle(A, cVar.G());
        }
        if (this.e != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.e.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(B, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean R(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean S(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void T(n.a aVar) {
        this.f = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(androidx.appcompat.view.menu.g gVar, boolean z2) {
        n.a aVar = this.f;
        if (aVar != null) {
            aVar.a(gVar, z2);
        }
    }

    public void c(@h0 View view) {
        this.e.addView(view);
        NavigationMenuView navigationMenuView = this.d;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void d(@h0 o0 o0Var) {
        int r0 = o0Var.o();
        if (this.v != r0) {
            this.v = r0;
            D();
        }
        NavigationMenuView navigationMenuView = this.d;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, o0Var.l());
        f0.o(this.e, o0Var);
    }

    @i0
    public androidx.appcompat.view.menu.j e() {
        return this.i.H();
    }

    public int f() {
        return this.e.getChildCount();
    }

    public View g(int r2) {
        return this.e.getChildAt(r2);
    }

    @i0
    public Drawable h() {
        return this.o;
    }

    public int i() {
        return this.p;
    }

    public int j() {
        return this.q;
    }

    public int k() {
        return this.u;
    }

    @i0
    public ColorStateList l() {
        return this.m;
    }

    @i0
    public ColorStateList m() {
        return this.n;
    }

    public View n(@c0 int r4) {
        View viewInflate = this.j.inflate(r4, (ViewGroup) this.e, false);
        c(viewInflate);
        return viewInflate;
    }

    public boolean o() {
        return this.t;
    }

    public void p(@h0 View view) {
        this.e.removeView(view);
        if (this.e.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.d;
            navigationMenuView.setPadding(0, this.v, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void q(boolean z2) {
        if (this.t != z2) {
            this.t = z2;
            D();
        }
    }

    public void r(@h0 androidx.appcompat.view.menu.j jVar) {
        this.i.O(jVar);
    }

    public void s(int r1) {
        this.h = r1;
    }

    public void t(@i0 Drawable drawable) {
        this.o = drawable;
        N(false);
    }

    public void u(int r1) {
        this.p = r1;
        N(false);
    }

    public void v(int r1) {
        this.q = r1;
        N(false);
    }

    public void w(@androidx.annotation.p int r2) {
        if (this.r != r2) {
            this.r = r2;
            this.s = true;
            N(false);
        }
    }

    public void x(@i0 ColorStateList colorStateList) {
        this.n = colorStateList;
        N(false);
    }

    public void y(int r1) {
        this.u = r1;
        N(false);
    }

    public void z(@t0 int r1) {
        this.k = r1;
        this.l = true;
        N(false);
    }
}
