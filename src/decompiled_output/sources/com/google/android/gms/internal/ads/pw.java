package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: classes.dex */
final class pw implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult d;
    private final /* synthetic */ EditText e;

    pw(JsPromptResult jsPromptResult, EditText editText) {
        this.d = jsPromptResult;
        this.e = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r2) {
        this.d.confirm(this.e.getText().toString());
    }
}
