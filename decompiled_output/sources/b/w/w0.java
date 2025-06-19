package b.w;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

@androidx.annotation.m0(18)
/* loaded from: classes.dex */
class w0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f1514a;

    w0(@androidx.annotation.h0 View view) {
        this.f1514a = view.getOverlay();
    }

    @Override // b.w.x0
    public void b(@androidx.annotation.h0 Drawable drawable) {
        this.f1514a.add(drawable);
    }

    @Override // b.w.x0
    public void d(@androidx.annotation.h0 Drawable drawable) {
        this.f1514a.remove(drawable);
    }
}
