package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes.dex */
final class mw implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult d;

    mw(JsPromptResult jsPromptResult) {
        this.d = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r2) {
        this.d.cancel();
    }
}
