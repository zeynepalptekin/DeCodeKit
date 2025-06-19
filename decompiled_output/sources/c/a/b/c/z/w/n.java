package c.a.b.c.z.w;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.i0;
import androidx.annotation.m0;

@m0(21)
/* loaded from: classes.dex */
public final class n extends r<s> {
    private static final float g = 0.85f;
    private final boolean f;

    public n(boolean z) {
        super(f(z), g());
        this.f = z;
    }

    private static s f(boolean z) {
        s sVar = new s(z);
        sVar.m(g);
        sVar.l(g);
        return sVar;
    }

    private static w g() {
        return new d();
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

    public boolean h() {
        return this.f;
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
