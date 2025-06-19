package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import b.a.a;
import java.util.ArrayList;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e implements n, AdapterView.OnItemClickListener {
    private static final String n = "ListMenuPresenter";
    public static final String o = "android:menu:list";
    Context d;
    LayoutInflater e;
    g f;
    ExpandedMenuView g;
    int h;
    int i;
    int j;
    private n.a k;
    a l;
    private int m;

    private class a extends BaseAdapter {
        private int d = -1;

        public a() {
            a();
        }

        void a() {
            j jVarY = e.this.f.y();
            if (jVarY != null) {
                ArrayList<j> arrayListC = e.this.f.C();
                int size = arrayListC.size();
                for (int r3 = 0; r3 < size; r3++) {
                    if (arrayListC.get(r3) == jVarY) {
                        this.d = r3;
                        return;
                    }
                }
            }
            this.d = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j getItem(int r3) {
            ArrayList<j> arrayListC = e.this.f.C();
            int r32 = r3 + e.this.h;
            int r1 = this.d;
            if (r1 >= 0 && r32 >= r1) {
                r32++;
            }
            return arrayListC.get(r32);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f.C().size() - e.this.h;
            return this.d < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
            return r3;
        }

        @Override // android.widget.Adapter
        public View getView(int r3, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.e.inflate(eVar.j, viewGroup, false);
            }
            ((o.a) view).g(getItem(r3), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int r1, int r2) {
        this.j = r1;
        this.i = r2;
    }

    public e(Context context, int r3) {
        this(r3, 0);
        this.d = context;
        this.e = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.n
    public int J() {
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.i
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.i
            r0.<init>(r3, r1)
            r2.d = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.e = r3
            goto L23
        L14:
            android.content.Context r0 = r2.d
            if (r0 == 0) goto L23
            r2.d = r3
            android.view.LayoutInflater r0 = r2.e
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f = r4
            androidx.appcompat.view.menu.e$a r3 = r2.l
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.K(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    @Override // androidx.appcompat.view.menu.n
    public void L(Parcelable parcelable) {
        d((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean M(s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        new h(sVar).e(null);
        n.a aVar = this.k;
        if (aVar == null) {
            return true;
        }
        aVar.b(sVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public void N(boolean z) {
        a aVar = this.l;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public o O(ViewGroup viewGroup) {
        if (this.g == null) {
            this.g = (ExpandedMenuView) this.e.inflate(a.j.abc_expanded_menu_layout, viewGroup, false);
            if (this.l == null) {
                this.l = new a();
            }
            this.g.setAdapter((ListAdapter) this.l);
            this.g.setOnItemClickListener(this);
        }
        return this.g;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean P() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable Q() {
        if (this.g == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        e(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean R(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean S(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void T(n.a aVar) {
        this.k = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z) {
        n.a aVar = this.k;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public ListAdapter b() {
        if (this.l == null) {
            this.l = new a();
        }
        return this.l;
    }

    int c() {
        return this.h;
    }

    public void d(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(o);
        if (sparseParcelableArray != null) {
            this.g.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void e(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.g;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(o, sparseArray);
    }

    public void f(int r1) {
        this.m = r1;
    }

    public void g(int r1) {
        this.h = r1;
        if (this.g != null) {
            N(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int r3, long j) {
        this.f.P(this.l.getItem(r3), this, 0);
    }
}
