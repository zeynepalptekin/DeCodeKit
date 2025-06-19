package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* loaded from: classes.dex */
final class bg implements DialogInterface.OnClickListener {
    private final /* synthetic */ zf d;

    bg(zf zfVar) {
        this.d = zfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r2) throws JSONException {
        this.d.e("User canceled the download.");
    }
}
