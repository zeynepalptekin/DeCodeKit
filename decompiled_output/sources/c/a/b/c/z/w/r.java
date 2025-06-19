package c.a.b.c.z.w;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import c.a.b.c.z.w.w;
import java.util.ArrayList;

@m0(21)
/* loaded from: classes.dex */
abstract class r<P extends w> extends Visibility {
    private final P d;

    @i0
    private w e;

    protected r(P p, @i0 w wVar) {
        this.d = p;
        this.e = wVar;
        setInterpolator(c.a.b.c.b.a.f1936b);
    }

    private Animator b(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        P p = this.d;
        Animator animatorA = z ? p.a(viewGroup, view) : p.b(viewGroup, view);
        if (animatorA != null) {
            arrayList.add(animatorA);
        }
        w wVar = this.e;
        if (wVar != null) {
            Animator animatorA2 = z ? wVar.a(viewGroup, view) : wVar.b(viewGroup, view);
            if (animatorA2 != null) {
                arrayList.add(animatorA2);
            }
        }
        c.a.b.c.b.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    @h0
    public P c() {
        return this.d;
    }

    @i0
    public w d() {
        return this.e;
    }

    public void e(@i0 w wVar) {
        this.e = wVar;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(viewGroup, view, false);
    }
}
