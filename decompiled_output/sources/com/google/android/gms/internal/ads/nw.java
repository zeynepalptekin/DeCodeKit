package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes.dex */
final class nw implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsPromptResult d;

    nw(JsPromptResult jsPromptResult) {
        this.d = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.d.cancel();
    }
}
