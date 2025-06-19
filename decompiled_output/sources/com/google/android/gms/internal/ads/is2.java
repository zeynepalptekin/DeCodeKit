package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class is2 implements Runnable {
    private final /* synthetic */ View d;
    private final /* synthetic */ js2 e;

    is2(js2 js2Var, View view) {
        this.e = js2Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.d(this.d);
    }
}
