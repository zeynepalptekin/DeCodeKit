package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import org.json.JSONException;

/* loaded from: classes.dex */
final class yf implements DialogInterface.OnClickListener {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ zf f;

    yf(zf zfVar, String str, String str2) {
        this.f = zfVar;
        this.d = str;
        this.e = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r4) throws JSONException {
        DownloadManager downloadManager = (DownloadManager) this.f.d.getSystemService("download");
        try {
            String str = this.d;
            String str2 = this.e;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.p.e();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f.e("Could not store picture.");
        }
    }
}
