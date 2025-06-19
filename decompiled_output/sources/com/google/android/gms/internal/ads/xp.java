package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes.dex */
final class xp implements Runnable {
    final /* synthetic */ Context d;
    private final /* synthetic */ String e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ boolean g;

    xp(up upVar, Context context, String str, boolean z, boolean z2) {
        this.d = context;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.d);
        builder.setMessage(this.e);
        builder.setTitle(this.f ? "Error" : "Info");
        if (this.g) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new wp(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
