package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    OverScroller f409a;

    l(Context context, Interpolator interpolator) {
        this.f409a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    public static l c(Context context) {
        return d(context, null);
    }

    @Deprecated
    public static l d(Context context, Interpolator interpolator) {
        return new l(context, interpolator);
    }

    @Deprecated
    public void a() {
        this.f409a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.f409a.computeScrollOffset();
    }

    @Deprecated
    public void e(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18) {
        this.f409a.fling(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    @Deprecated
    public void f(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22) {
        this.f409a.fling(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    @Deprecated
    public float g() {
        return this.f409a.getCurrVelocity();
    }

    @Deprecated
    public int h() {
        return this.f409a.getCurrX();
    }

    @Deprecated
    public int i() {
        return this.f409a.getCurrY();
    }

    @Deprecated
    public int j() {
        return this.f409a.getFinalX();
    }

    @Deprecated
    public int k() {
        return this.f409a.getFinalY();
    }

    @Deprecated
    public boolean l() {
        return this.f409a.isFinished();
    }

    @Deprecated
    public boolean m() {
        return this.f409a.isOverScrolled();
    }

    @Deprecated
    public void n(int r2, int r3, int r4) {
        this.f409a.notifyHorizontalEdgeReached(r2, r3, r4);
    }

    @Deprecated
    public void o(int r2, int r3, int r4) {
        this.f409a.notifyVerticalEdgeReached(r2, r3, r4);
    }

    @Deprecated
    public boolean p(int r8, int r9, int r10, int r11, int r12, int r13) {
        return this.f409a.springBack(r8, r9, r10, r11, r12, r13);
    }

    @Deprecated
    public void q(int r2, int r3, int r4, int r5) {
        this.f409a.startScroll(r2, r3, r4, r5);
    }

    @Deprecated
    public void r(int r7, int r8, int r9, int r10, int r11) {
        this.f409a.startScroll(r7, r8, r9, r10, r11);
    }
}
