package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* loaded from: classes.dex */
final class vf implements DialogInterface.OnClickListener {
    private final /* synthetic */ tf d;

    vf(tf tfVar) {
        this.d = tfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r2) throws JSONException {
        this.d.e("Operation denied by user.");
    }
}
