package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class uw implements View.OnAttachStateChangeListener {
    private final /* synthetic */ im d;
    private final /* synthetic */ qw e;

    uw(qw qwVar, im imVar) {
        this.e = qwVar;
        this.d = imVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.e.r(view, this.d, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
