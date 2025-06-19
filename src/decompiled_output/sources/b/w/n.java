package b.w;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.p0;
import b.w.g0;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class n extends androidx.fragment.app.u {

    class a extends g0.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f1483a;

        a(Rect rect) {
            this.f1483a = rect;
        }

        @Override // b.w.g0.f
        public Rect a(@androidx.annotation.h0 g0 g0Var) {
            return this.f1483a;
        }
    }

    class b implements g0.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1485a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f1486b;

        b(View view, ArrayList arrayList) {
            this.f1485a = view;
            this.f1486b = arrayList;
        }

        @Override // b.w.g0.h
        public void a(@androidx.annotation.h0 g0 g0Var) {
        }

        @Override // b.w.g0.h
        public void b(@androidx.annotation.h0 g0 g0Var) {
        }

        @Override // b.w.g0.h
        public void c(@androidx.annotation.h0 g0 g0Var) {
        }

        @Override // b.w.g0.h
        public void d(@androidx.annotation.h0 g0 g0Var) {
        }

        @Override // b.w.g0.h
        public void e(@androidx.annotation.h0 g0 g0Var) {
            g0Var.s0(this);
            this.f1485a.setVisibility(8);
            int size = this.f1486b.size();
            for (int r1 = 0; r1 < size; r1++) {
                ((View) this.f1486b.get(r1)).setVisibility(0);
            }
        }
    }

    class c extends i0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f1488a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f1489b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f1490c;
        final /* synthetic */ ArrayList d;
        final /* synthetic */ Object e;
        final /* synthetic */ ArrayList f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1488a = obj;
            this.f1489b = arrayList;
            this.f1490c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // b.w.i0, b.w.g0.h
        public void a(@androidx.annotation.h0 g0 g0Var) {
            Object obj = this.f1488a;
            if (obj != null) {
                n.this.q(obj, this.f1489b, null);
            }
            Object obj2 = this.f1490c;
            if (obj2 != null) {
                n.this.q(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                n.this.q(obj3, this.f, null);
            }
        }

        @Override // b.w.i0, b.w.g0.h
        public void e(@androidx.annotation.h0 g0 g0Var) {
            g0Var.s0(this);
        }
    }

    class d extends g0.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f1491a;

        d(Rect rect) {
            this.f1491a = rect;
        }

        @Override // b.w.g0.f
        public Rect a(@androidx.annotation.h0 g0 g0Var) {
            Rect rect = this.f1491a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f1491a;
        }
    }

    private static boolean B(g0 g0Var) {
        return (androidx.fragment.app.u.l(g0Var.a0()) && androidx.fragment.app.u.l(g0Var.b0()) && androidx.fragment.app.u.l(g0Var.c0())) ? false : true;
    }

    @Override // androidx.fragment.app.u
    public Object A(Object obj) {
        if (obj == null) {
            return null;
        }
        l0 l0Var = new l0();
        l0Var.Q0((g0) obj);
        return l0Var;
    }

    @Override // androidx.fragment.app.u
    public void a(Object obj, View view) {
        if (obj != null) {
            ((g0) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.u
    public void b(Object obj, ArrayList<View> arrayList) {
        g0 g0Var = (g0) obj;
        if (g0Var == null) {
            return;
        }
        int r1 = 0;
        if (g0Var instanceof l0) {
            l0 l0Var = (l0) g0Var;
            int r0 = l0Var.U0();
            while (r1 < r0) {
                b(l0Var.T0(r1), arrayList);
                r1++;
            }
            return;
        }
        if (B(g0Var) || !androidx.fragment.app.u.l(g0Var.d0())) {
            return;
        }
        int size = arrayList.size();
        while (r1 < size) {
            g0Var.d(arrayList.get(r1));
            r1++;
        }
    }

    @Override // androidx.fragment.app.u
    public void c(ViewGroup viewGroup, Object obj) {
        j0.b(viewGroup, (g0) obj);
    }

    @Override // androidx.fragment.app.u
    public boolean e(Object obj) {
        return obj instanceof g0;
    }

    @Override // androidx.fragment.app.u
    public Object g(Object obj) {
        if (obj != null) {
            return ((g0) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.u
    public Object m(Object obj, Object obj2, Object obj3) {
        g0 g0VarD1 = (g0) obj;
        g0 g0Var = (g0) obj2;
        g0 g0Var2 = (g0) obj3;
        if (g0VarD1 != null && g0Var != null) {
            g0VarD1 = new l0().Q0(g0VarD1).Q0(g0Var).d1(1);
        } else if (g0VarD1 == null) {
            g0VarD1 = g0Var != null ? g0Var : null;
        }
        if (g0Var2 == null) {
            return g0VarD1;
        }
        l0 l0Var = new l0();
        if (g0VarD1 != null) {
            l0Var.Q0(g0VarD1);
        }
        l0Var.Q0(g0Var2);
        return l0Var;
    }

    @Override // androidx.fragment.app.u
    public Object n(Object obj, Object obj2, Object obj3) {
        l0 l0Var = new l0();
        if (obj != null) {
            l0Var.Q0((g0) obj);
        }
        if (obj2 != null) {
            l0Var.Q0((g0) obj2);
        }
        if (obj3 != null) {
            l0Var.Q0((g0) obj3);
        }
        return l0Var;
    }

    @Override // androidx.fragment.app.u
    public void p(Object obj, View view) {
        if (obj != null) {
            ((g0) obj).u0(view);
        }
    }

    @Override // androidx.fragment.app.u
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        g0 g0Var = (g0) obj;
        int r1 = 0;
        if (g0Var instanceof l0) {
            l0 l0Var = (l0) g0Var;
            int r0 = l0Var.U0();
            while (r1 < r0) {
                q(l0Var.T0(r1), arrayList, arrayList2);
                r1++;
            }
            return;
        }
        if (B(g0Var)) {
            return;
        }
        List<View> listD0 = g0Var.d0();
        if (listD0.size() == arrayList.size() && listD0.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (r1 < size) {
                g0Var.d(arrayList2.get(r1));
                r1++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                g0Var.u0(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.u
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((g0) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.u
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((g0) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.u
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((g0) obj).C0(new d(rect));
        }
    }

    @Override // androidx.fragment.app.u
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((g0) obj).C0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.u
    public void y(Object obj, View view, ArrayList<View> arrayList) {
        l0 l0Var = (l0) obj;
        List<View> listD0 = l0Var.d0();
        listD0.clear();
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            androidx.fragment.app.u.d(listD0, arrayList.get(r2));
        }
        listD0.add(view);
        arrayList.add(view);
        b(l0Var, arrayList);
    }

    @Override // androidx.fragment.app.u
    public void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        l0 l0Var = (l0) obj;
        if (l0Var != null) {
            l0Var.d0().clear();
            l0Var.d0().addAll(arrayList2);
            q(l0Var, arrayList, arrayList2);
        }
    }
}
