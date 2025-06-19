package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class xf implements View.OnClickListener {
    private final /* synthetic */ uf d;

    xf(uf ufVar) {
        this.d = ufVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.i(true);
    }
}
