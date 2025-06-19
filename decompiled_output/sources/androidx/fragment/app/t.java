package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.m0;
import java.util.ArrayList;
import java.util.List;

@m0(21)
/* loaded from: classes.dex */
class t extends u {

    class a extends Transition.EpicenterCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f474a;

        a(Rect rect) {
            this.f474a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f474a;
        }
    }

    class b implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f477b;

        b(View view, ArrayList arrayList) {
            this.f476a = view;
            this.f477b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f476a.setVisibility(8);
            int size = this.f477b.size();
            for (int r1 = 0; r1 < size; r1++) {
                ((View) this.f477b.get(r1)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    class c implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f479a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f480b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f481c;
        final /* synthetic */ ArrayList d;
        final /* synthetic */ Object e;
        final /* synthetic */ ArrayList f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f479a = obj;
            this.f480b = arrayList;
            this.f481c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f479a;
            if (obj != null) {
                t.this.q(obj, this.f480b, null);
            }
            Object obj2 = this.f481c;
            if (obj2 != null) {
                t.this.q(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                t.this.q(obj3, this.f, null);
            }
        }
    }

    class d extends Transition.EpicenterCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f482a;

        d(Rect rect) {
            this.f482a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f482a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f482a;
        }
    }

    t() {
    }

    private static boolean B(Transition transition) {
        return (u.l(transition.getTargetIds()) && u.l(transition.getTargetNames()) && u.l(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.u
    public Object A(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.u
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.u
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int r1 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (r1 < transitionCount) {
                b(transitionSet.getTransitionAt(r1), arrayList);
                r1++;
            }
            return;
        }
        if (B(transition) || !u.l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (r1 < size) {
            transition.addTarget(arrayList.get(r1));
            r1++;
        }
    }

    @Override // androidx.fragment.app.u
    public void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.u
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.u
    public Object g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.u
    public Object m(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.u
    public Object n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.u
    public void p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.u
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int r1 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (r1 < transitionCount) {
                q(transitionSet.getTransitionAt(r1), arrayList, arrayList2);
                r1++;
            }
            return;
        }
        if (B(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (r1 < size) {
            transition.addTarget(arrayList2.get(r1));
            r1++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.u
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.u
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.u
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new d(rect));
        }
    }

    @Override // androidx.fragment.app.u
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.u
    public void y(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            u.d(targets, arrayList.get(r2));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.u
    public void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            q(transitionSet, arrayList, arrayList2);
        }
    }
}
