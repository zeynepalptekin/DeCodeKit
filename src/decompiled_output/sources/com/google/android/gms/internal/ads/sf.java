package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* loaded from: classes.dex */
final class sf implements DialogInterface.OnClickListener {
    private final /* synthetic */ tf d;

    sf(tf tfVar) {
        this.d = tfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r2) {
        Intent intentH = this.d.h();
        com.google.android.gms.ads.internal.p.c();
        to.i(this.d.d, intentH);
    }
}
