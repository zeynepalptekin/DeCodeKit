package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
final class iw implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsResult d;

    iw(JsResult jsResult) {
        this.d = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.d.cancel();
    }
}
