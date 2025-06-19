package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h extends a0 {
    private static TimeInterpolator A = null;
    private static final boolean z = false;
    private ArrayList<RecyclerView.f0> o = new ArrayList<>();
    private ArrayList<RecyclerView.f0> p = new ArrayList<>();
    private ArrayList<j> q = new ArrayList<>();
    private ArrayList<i> r = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.f0>> s = new ArrayList<>();
    ArrayList<ArrayList<j>> t = new ArrayList<>();
    ArrayList<ArrayList<i>> u = new ArrayList<>();
    ArrayList<RecyclerView.f0> v = new ArrayList<>();
    ArrayList<RecyclerView.f0> w = new ArrayList<>();
    ArrayList<RecyclerView.f0> x = new ArrayList<>();
    ArrayList<RecyclerView.f0> y = new ArrayList<>();

    class a implements Runnable {
        final /* synthetic */ ArrayList d;

        a(ArrayList arrayList) {
            this.d = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                h.this.b0(jVar.f676a, jVar.f677b, jVar.f678c, jVar.d, jVar.e);
            }
            this.d.clear();
            h.this.t.remove(this.d);
        }
    }

    class b implements Runnable {
        final /* synthetic */ ArrayList d;

        b(ArrayList arrayList) {
            this.d = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                h.this.a0((i) it.next());
            }
            this.d.clear();
            h.this.u.remove(this.d);
        }
    }

    class c implements Runnable {
        final /* synthetic */ ArrayList d;

        c(ArrayList arrayList) {
            this.d = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                h.this.Z((RecyclerView.f0) it.next());
            }
            this.d.clear();
            h.this.s.remove(this.d);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f658a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f659b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f660c;

        d(RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f658a = f0Var;
            this.f659b = viewPropertyAnimator;
            this.f660c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f659b.setListener(null);
            this.f660c.setAlpha(1.0f);
            h.this.N(this.f658a);
            h.this.x.remove(this.f658a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.O(this.f658a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f661a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f662b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f663c;

        e(RecyclerView.f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f661a = f0Var;
            this.f662b = view;
            this.f663c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f662b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f663c.setListener(null);
            h.this.H(this.f661a);
            h.this.v.remove(this.f661a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.I(this.f661a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f664a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f665b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f666c;
        final /* synthetic */ int d;
        final /* synthetic */ ViewPropertyAnimator e;

        f(RecyclerView.f0 f0Var, int r3, View view, int r5, ViewPropertyAnimator viewPropertyAnimator) {
            this.f664a = f0Var;
            this.f665b = r3;
            this.f666c = view;
            this.d = r5;
            this.e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f665b != 0) {
                this.f666c.setTranslationX(0.0f);
            }
            if (this.d != 0) {
                this.f666c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.e.setListener(null);
            h.this.L(this.f664a);
            h.this.w.remove(this.f664a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.M(this.f664a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f667a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f668b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f669c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f667a = iVar;
            this.f668b = viewPropertyAnimator;
            this.f669c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f668b.setListener(null);
            this.f669c.setAlpha(1.0f);
            this.f669c.setTranslationX(0.0f);
            this.f669c.setTranslationY(0.0f);
            h.this.J(this.f667a.f673a, true);
            h.this.y.remove(this.f667a.f673a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.K(this.f667a.f673a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    class C0034h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f670a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f671b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f672c;

        C0034h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f670a = iVar;
            this.f671b = viewPropertyAnimator;
            this.f672c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f671b.setListener(null);
            this.f672c.setAlpha(1.0f);
            this.f672c.setTranslationX(0.0f);
            this.f672c.setTranslationY(0.0f);
            h.this.J(this.f670a.f674b, false);
            h.this.y.remove(this.f670a.f674b);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.K(this.f670a.f674b, false);
        }
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f673a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.f0 f674b;

        /* renamed from: c, reason: collision with root package name */
        public int f675c;
        public int d;
        public int e;
        public int f;

        private i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.f673a = f0Var;
            this.f674b = f0Var2;
        }

        i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int r3, int r4, int r5, int r6) {
            this(f0Var, f0Var2);
            this.f675c = r3;
            this.d = r4;
            this.e = r5;
            this.f = r6;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f673a + ", newHolder=" + this.f674b + ", fromX=" + this.f675c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }
    }

    private static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f676a;

        /* renamed from: b, reason: collision with root package name */
        public int f677b;

        /* renamed from: c, reason: collision with root package name */
        public int f678c;
        public int d;
        public int e;

        j(RecyclerView.f0 f0Var, int r2, int r3, int r4, int r5) {
            this.f676a = f0Var;
            this.f677b = r2;
            this.f678c = r3;
            this.d = r4;
            this.e = r5;
        }
    }

    private void c0(RecyclerView.f0 f0Var) {
        View view = f0Var.f561a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.x.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(p()).alpha(0.0f).setListener(new d(f0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void f0(List<i> list, RecyclerView.f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (h0(iVar, f0Var) && iVar.f673a == null && iVar.f674b == null) {
                list.remove(iVar);
            }
        }
    }

    private void g0(i iVar) {
        RecyclerView.f0 f0Var = iVar.f673a;
        if (f0Var != null) {
            h0(iVar, f0Var);
        }
        RecyclerView.f0 f0Var2 = iVar.f674b;
        if (f0Var2 != null) {
            h0(iVar, f0Var2);
        }
    }

    private boolean h0(i iVar, RecyclerView.f0 f0Var) {
        boolean z2 = false;
        if (iVar.f674b == f0Var) {
            iVar.f674b = null;
        } else {
            if (iVar.f673a != f0Var) {
                return false;
            }
            iVar.f673a = null;
            z2 = true;
        }
        f0Var.f561a.setAlpha(1.0f);
        f0Var.f561a.setTranslationX(0.0f);
        f0Var.f561a.setTranslationY(0.0f);
        J(f0Var, z2);
        return true;
    }

    private void i0(RecyclerView.f0 f0Var) {
        if (A == null) {
            A = new ValueAnimator().getInterpolator();
        }
        f0Var.f561a.animate().setInterpolator(A);
        k(f0Var);
    }

    @Override // androidx.recyclerview.widget.a0
    public boolean D(RecyclerView.f0 f0Var) {
        i0(f0Var);
        f0Var.f561a.setAlpha(0.0f);
        this.p.add(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.a0
    public boolean E(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int r12, int r13, int r14, int r15) {
        if (f0Var == f0Var2) {
            return F(f0Var, r12, r13, r14, r15);
        }
        float translationX = f0Var.f561a.getTranslationX();
        float translationY = f0Var.f561a.getTranslationY();
        float alpha = f0Var.f561a.getAlpha();
        i0(f0Var);
        int r3 = (int) ((r14 - r12) - translationX);
        int r4 = (int) ((r15 - r13) - translationY);
        f0Var.f561a.setTranslationX(translationX);
        f0Var.f561a.setTranslationY(translationY);
        f0Var.f561a.setAlpha(alpha);
        if (f0Var2 != null) {
            i0(f0Var2);
            f0Var2.f561a.setTranslationX(-r3);
            f0Var2.f561a.setTranslationY(-r4);
            f0Var2.f561a.setAlpha(0.0f);
        }
        this.r.add(new i(f0Var, f0Var2, r12, r13, r14, r15));
        return true;
    }

    @Override // androidx.recyclerview.widget.a0
    public boolean F(RecyclerView.f0 f0Var, int r10, int r11, int r12, int r13) {
        View view = f0Var.f561a;
        int translationX = r10 + ((int) view.getTranslationX());
        int translationY = r11 + ((int) f0Var.f561a.getTranslationY());
        i0(f0Var);
        int r102 = r12 - translationX;
        int r112 = r13 - translationY;
        if (r102 == 0 && r112 == 0) {
            L(f0Var);
            return false;
        }
        if (r102 != 0) {
            view.setTranslationX(-r102);
        }
        if (r112 != 0) {
            view.setTranslationY(-r112);
        }
        this.q.add(new j(f0Var, translationX, translationY, r12, r13));
        return true;
    }

    @Override // androidx.recyclerview.widget.a0
    public boolean G(RecyclerView.f0 f0Var) {
        i0(f0Var);
        this.o.add(f0Var);
        return true;
    }

    void Z(RecyclerView.f0 f0Var) {
        View view = f0Var.f561a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.v.add(f0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(m()).setListener(new e(f0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    void a0(i iVar) {
        RecyclerView.f0 f0Var = iVar.f673a;
        View view = f0Var == null ? null : f0Var.f561a;
        RecyclerView.f0 f0Var2 = iVar.f674b;
        View view2 = f0Var2 != null ? f0Var2.f561a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(n());
            this.y.add(iVar.f673a);
            duration.translationX(iVar.e - iVar.f675c);
            duration.translationY(iVar.f - iVar.d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.y.add(iVar.f674b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(n()).alpha(1.0f).setListener(new C0034h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void b0(RecyclerView.f0 f0Var, int r9, int r10, int r11, int r12) {
        View view = f0Var.f561a;
        int r3 = r11 - r9;
        int r5 = r12 - r10;
        if (r3 != 0) {
            view.animate().translationX(0.0f);
        }
        if (r5 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.w.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).setListener(new f(f0Var, r3, view, r5, viewPropertyAnimatorAnimate)).start();
    }

    void d0(List<RecyclerView.f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f561a.animate().cancel();
        }
    }

    void e0() {
        if (q()) {
            return;
        }
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(@androidx.annotation.h0 RecyclerView.f0 f0Var, @androidx.annotation.h0 List<Object> list) {
        return !list.isEmpty() || super.g(f0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k(RecyclerView.f0 f0Var) {
        View view = f0Var.f561a;
        view.animate().cancel();
        int size = this.q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.q.get(size).f676a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                L(f0Var);
                this.q.remove(size);
            }
        }
        f0(this.r, f0Var);
        if (this.o.remove(f0Var)) {
            view.setAlpha(1.0f);
            N(f0Var);
        }
        if (this.p.remove(f0Var)) {
            view.setAlpha(1.0f);
            H(f0Var);
        }
        for (int size2 = this.u.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.u.get(size2);
            f0(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.u.remove(size2);
            }
        }
        for (int size3 = this.t.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.t.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f676a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    L(f0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.t.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.s.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.f0> arrayList3 = this.s.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                H(f0Var);
                if (arrayList3.isEmpty()) {
                    this.s.remove(size5);
                }
            }
        }
        this.x.remove(f0Var);
        this.v.remove(f0Var);
        this.y.remove(f0Var);
        this.w.remove(f0Var);
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void l() {
        int size = this.q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.q.get(size);
            View view = jVar.f676a.f561a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            L(jVar.f676a);
            this.q.remove(size);
        }
        for (int size2 = this.o.size() - 1; size2 >= 0; size2--) {
            N(this.o.get(size2));
            this.o.remove(size2);
        }
        int size3 = this.p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = this.p.get(size3);
            f0Var.f561a.setAlpha(1.0f);
            H(f0Var);
            this.p.remove(size3);
        }
        for (int size4 = this.r.size() - 1; size4 >= 0; size4--) {
            g0(this.r.get(size4));
        }
        this.r.clear();
        if (q()) {
            for (int size5 = this.t.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.t.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f676a.f561a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    L(jVar2.f676a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.t.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.s.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.f0> arrayList2 = this.s.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.f0 f0Var2 = arrayList2.get(size8);
                    f0Var2.f561a.setAlpha(1.0f);
                    H(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.s.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.u.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.u.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    g0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.u.remove(arrayList3);
                    }
                }
            }
            d0(this.x);
            d0(this.w);
            d0(this.v);
            d0(this.y);
            j();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean q() {
        return (this.p.isEmpty() && this.r.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void x() {
        boolean z2 = !this.o.isEmpty();
        boolean z3 = !this.q.isEmpty();
        boolean z4 = !this.r.isEmpty();
        boolean z5 = !this.p.isEmpty();
        if (z2 || z3 || z5 || z4) {
            Iterator<RecyclerView.f0> it = this.o.iterator();
            while (it.hasNext()) {
                c0(it.next());
            }
            this.o.clear();
            if (z3) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.q);
                this.t.add(arrayList);
                this.q.clear();
                a aVar = new a(arrayList);
                if (z2) {
                    b.i.p.f0.j1(arrayList.get(0).f676a.f561a, aVar, p());
                } else {
                    aVar.run();
                }
            }
            if (z4) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.r);
                this.u.add(arrayList2);
                this.r.clear();
                b bVar = new b(arrayList2);
                if (z2) {
                    b.i.p.f0.j1(arrayList2.get(0).f673a.f561a, bVar, p());
                } else {
                    bVar.run();
                }
            }
            if (z5) {
                ArrayList<RecyclerView.f0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.p);
                this.s.add(arrayList3);
                this.p.clear();
                c cVar = new c(arrayList3);
                if (z2 || z3 || z4) {
                    b.i.p.f0.j1(arrayList3.get(0).f561a, cVar, (z2 ? p() : 0L) + Math.max(z3 ? o() : 0L, z4 ? n() : 0L));
                } else {
                    cVar.run();
                }
            }
        }
    }
}
