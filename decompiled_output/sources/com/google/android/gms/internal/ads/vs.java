package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class vs extends xs implements ViewTreeObserver.OnGlobalLayoutListener {
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> e;

    public vs(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.e = new WeakReference<>(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.ads.xs
    protected final void d(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.gms.internal.ads.xs
    protected final void e(ViewTreeObserver viewTreeObserver) {
        com.google.android.gms.ads.internal.p.e();
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.e.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            b();
        }
    }
}
