package b.w;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: c, reason: collision with root package name */
    private static final String f1464c = "TransitionManager";
    private static g0 d = new c();
    private static ThreadLocal<WeakReference<b.f.a<ViewGroup, ArrayList<g0>>>> e = new ThreadLocal<>();
    static ArrayList<ViewGroup> f = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    private b.f.a<c0, g0> f1465a = new b.f.a<>();

    /* renamed from: b, reason: collision with root package name */
    private b.f.a<c0, b.f.a<c0, g0>> f1466b = new b.f.a<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        g0 d;
        ViewGroup e;

        /* renamed from: b.w.j0$a$a, reason: collision with other inner class name */
        class C0108a extends i0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.f.a f1467a;

            C0108a(b.f.a aVar) {
                this.f1467a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // b.w.i0, b.w.g0.h
            public void e(@androidx.annotation.h0 g0 g0Var) {
                ((ArrayList) this.f1467a.get(a.this.e)).remove(g0Var);
                g0Var.s0(this);
            }
        }

        a(g0 g0Var, ViewGroup viewGroup) {
            this.d = g0Var;
            this.e = viewGroup;
        }

        private void a() {
            this.e.getViewTreeObserver().removeOnPreDrawListener(this);
            this.e.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!j0.f.remove(this.e)) {
                return true;
            }
            b.f.a<ViewGroup, ArrayList<g0>> aVarE = j0.e();
            ArrayList<g0> arrayList = aVarE.get(this.e);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarE.put(this.e, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.d);
            this.d.b(new C0108a(aVarE));
            this.d.r(this.e, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((g0) it.next()).x0(this.e);
                }
            }
            this.d.r0(this.e);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            j0.f.remove(this.e);
            ArrayList<g0> arrayList = j0.e().get(this.e);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<g0> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().x0(this.e);
                }
            }
            this.d.s(true);
        }
    }

    public static void a(@androidx.annotation.h0 ViewGroup viewGroup) {
        b(viewGroup, null);
    }

    public static void b(@androidx.annotation.h0 ViewGroup viewGroup, @androidx.annotation.i0 g0 g0Var) {
        if (f.contains(viewGroup) || !b.i.p.f0.P0(viewGroup)) {
            return;
        }
        f.add(viewGroup);
        if (g0Var == null) {
            g0Var = d;
        }
        g0 g0VarClone = g0Var.clone();
        j(viewGroup, g0VarClone);
        c0.g(viewGroup, null);
        i(viewGroup, g0VarClone);
    }

    private static void c(c0 c0Var, g0 g0Var) {
        ViewGroup viewGroupE = c0Var.e();
        if (f.contains(viewGroupE)) {
            return;
        }
        c0 c0VarC = c0.c(viewGroupE);
        if (g0Var == null) {
            if (c0VarC != null) {
                c0VarC.b();
            }
            c0Var.a();
            return;
        }
        f.add(viewGroupE);
        g0 g0VarClone = g0Var.clone();
        g0VarClone.H0(viewGroupE);
        if (c0VarC != null && c0VarC.f()) {
            g0VarClone.A0(true);
        }
        j(viewGroupE, g0VarClone);
        c0Var.a();
        i(viewGroupE, g0VarClone);
    }

    public static void d(ViewGroup viewGroup) {
        f.remove(viewGroup);
        ArrayList<g0> arrayList = e().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((g0) arrayList2.get(size)).N(viewGroup);
        }
    }

    static b.f.a<ViewGroup, ArrayList<g0>> e() {
        b.f.a<ViewGroup, ArrayList<g0>> aVar;
        WeakReference<b.f.a<ViewGroup, ArrayList<g0>>> weakReference = e.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        b.f.a<ViewGroup, ArrayList<g0>> aVar2 = new b.f.a<>();
        e.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private g0 f(c0 c0Var) {
        c0 c0VarC;
        b.f.a<c0, g0> aVar;
        g0 g0Var;
        ViewGroup viewGroupE = c0Var.e();
        if (viewGroupE != null && (c0VarC = c0.c(viewGroupE)) != null && (aVar = this.f1466b.get(c0Var)) != null && (g0Var = aVar.get(c0VarC)) != null) {
            return g0Var;
        }
        g0 g0Var2 = this.f1465a.get(c0Var);
        return g0Var2 != null ? g0Var2 : d;
    }

    public static void g(@androidx.annotation.h0 c0 c0Var) {
        c(c0Var, d);
    }

    public static void h(@androidx.annotation.h0 c0 c0Var, @androidx.annotation.i0 g0 g0Var) {
        c(c0Var, g0Var);
    }

    private static void i(ViewGroup viewGroup, g0 g0Var) {
        if (g0Var == null || viewGroup == null) {
            return;
        }
        a aVar = new a(g0Var, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void j(ViewGroup viewGroup, g0 g0Var) {
        ArrayList<g0> arrayList = e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<g0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().q0(viewGroup);
            }
        }
        if (g0Var != null) {
            g0Var.r(viewGroup, true);
        }
        c0 c0VarC = c0.c(viewGroup);
        if (c0VarC != null) {
            c0VarC.b();
        }
    }

    public void k(@androidx.annotation.h0 c0 c0Var, @androidx.annotation.h0 c0 c0Var2, @androidx.annotation.i0 g0 g0Var) {
        b.f.a<c0, g0> aVar = this.f1466b.get(c0Var2);
        if (aVar == null) {
            aVar = new b.f.a<>();
            this.f1466b.put(c0Var2, aVar);
        }
        aVar.put(c0Var, g0Var);
    }

    public void l(@androidx.annotation.h0 c0 c0Var, @androidx.annotation.i0 g0 g0Var) {
        this.f1465a.put(c0Var, g0Var);
    }

    public void m(@androidx.annotation.h0 c0 c0Var) {
        c(c0Var, f(c0Var));
    }
}
