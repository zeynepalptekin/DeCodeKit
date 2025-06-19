package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
final class lw implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsResult d;

    lw(JsResult jsResult) {
        this.d = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r2) {
        this.d.cancel();
    }
}
