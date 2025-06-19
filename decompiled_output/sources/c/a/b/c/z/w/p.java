package c.a.b.c.z.w;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.i0;
import androidx.annotation.m0;

@m0(21)
/* loaded from: classes.dex */
public final class p extends r<e> {
    private static final float f = 0.92f;

    public p() {
        super(f(), g());
    }

    private static e f() {
        return new e();
    }

    private static w g() {
        s sVar = new s();
        sVar.o(false);
        sVar.l(f);
        return sVar;
    }

    @Override // c.a.b.c.z.w.r
    @i0
    public /* bridge */ /* synthetic */ w d() {
        return super.d();
    }

    @Override // c.a.b.c.z.w.r
    public /* bridge */ /* synthetic */ void e(@i0 w wVar) {
        super.e(wVar);
    }

    @Override // c.a.b.c.z.w.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // c.a.b.c.z.w.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }
}
