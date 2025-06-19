package c.a.b.c.z.w;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@m0(21)
/* loaded from: classes.dex */
public final class q extends r<w> {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    private final int f;
    private final boolean g;

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface a {
    }

    public q(int r3, boolean z) {
        super(f(r3, z), g());
        this.f = r3;
        this.g = z;
    }

    private static w f(int r2, boolean z) {
        if (r2 == 0) {
            return new t(z ? b.i.p.h.f1199c : b.i.p.h.f1198b);
        }
        if (r2 == 1) {
            return new t(z ? 80 : 48);
        }
        if (r2 == 2) {
            return new s(z);
        }
        throw new IllegalArgumentException("Invalid axis: " + r2);
    }

    private static w g() {
        return new e();
    }

    @Override // c.a.b.c.z.w.r
    @h0
    public /* bridge */ /* synthetic */ w c() {
        return super.c();
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

    public int h() {
        return this.f;
    }

    public boolean k() {
        return this.g;
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
