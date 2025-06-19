package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes.dex */
final class wp implements DialogInterface.OnClickListener {
    private final /* synthetic */ xp d;

    wp(xp xpVar) {
        this.d = xpVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r2) {
        com.google.android.gms.ads.internal.p.c();
        to.j(this.d.d, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
