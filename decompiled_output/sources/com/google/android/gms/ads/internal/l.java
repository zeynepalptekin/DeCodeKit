package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
final class l implements View.OnTouchListener {
    private final /* synthetic */ j d;

    l(j jVar) {
        this.d = jVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.d.l == null) {
            return false;
        }
        this.d.l.d(motionEvent);
        return false;
    }
}
