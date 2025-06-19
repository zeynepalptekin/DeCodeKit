package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class vw implements Runnable {
    private final /* synthetic */ View d;
    private final /* synthetic */ im e;
    private final /* synthetic */ int f;
    private final /* synthetic */ qw g;

    vw(qw qwVar, View view, im imVar, int r4) {
        this.g = qwVar;
        this.d = view;
        this.e = imVar;
        this.f = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.r(this.d, this.e, this.f - 1);
    }
}
