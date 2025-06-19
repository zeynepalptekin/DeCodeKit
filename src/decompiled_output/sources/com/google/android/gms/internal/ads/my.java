package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class my implements View.OnAttachStateChangeListener {
    private final /* synthetic */ im d;
    private final /* synthetic */ ly e;

    my(ly lyVar, im imVar) {
        this.e = lyVar;
        this.d = imVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.e.w(view, this.d, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
