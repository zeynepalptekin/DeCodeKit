package b.w;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

@androidx.annotation.m0(18)
/* loaded from: classes.dex */
class r0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f1502a;

    r0(@androidx.annotation.h0 ViewGroup viewGroup) {
        this.f1502a = viewGroup.getOverlay();
    }

    @Override // b.w.s0
    public void a(@androidx.annotation.h0 View view) {
        this.f1502a.add(view);
    }

    @Override // b.w.x0
    public void b(@androidx.annotation.h0 Drawable drawable) {
        this.f1502a.add(drawable);
    }

    @Override // b.w.s0
    public void c(@androidx.annotation.h0 View view) {
        this.f1502a.remove(view);
    }

    @Override // b.w.x0
    public void d(@androidx.annotation.h0 Drawable drawable) {
        this.f1502a.remove(drawable);
    }
}
