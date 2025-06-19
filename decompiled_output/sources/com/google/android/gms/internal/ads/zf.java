package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.f0.a;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zf extends eg {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f6254c;
    private final Context d;

    public zf(rw rwVar, Map<String, String> map) {
        super(rwVar, "storePicture");
        this.f6254c = map;
        this.d = rwVar.a();
    }

    public final void h() throws JSONException {
        if (this.d == null) {
            e("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.p.c();
        if (!to.y(this.d).d()) {
            e("Feature is not supported by the device.");
            return;
        }
        String str = this.f6254c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            e("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            String strValueOf = String.valueOf(str);
            e(strValueOf.length() != 0 ? "Invalid image url: ".concat(strValueOf) : new String("Invalid image url: "));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.p.c();
        if (!to.W(lastPathSegment)) {
            String strValueOf2 = String.valueOf(lastPathSegment);
            e(strValueOf2.length() != 0 ? "Image type not recognized: ".concat(strValueOf2) : new String("Image type not recognized: "));
            return;
        }
        Resources resourcesB = com.google.android.gms.ads.internal.p.g().b();
        com.google.android.gms.ads.internal.p.c();
        AlertDialog.Builder builderX = to.x(this.d);
        builderX.setTitle(resourcesB != null ? resourcesB.getString(a.C0161a.s1) : "Save image");
        builderX.setMessage(resourcesB != null ? resourcesB.getString(a.C0161a.s2) : "Allow Ad to store image in Picture gallery?");
        builderX.setPositiveButton(resourcesB != null ? resourcesB.getString(a.C0161a.s3) : "Accept", new yf(this, str, lastPathSegment));
        builderX.setNegativeButton(resourcesB != null ? resourcesB.getString(a.C0161a.s4) : "Decline", new bg(this));
        builderX.create().show();
    }
}
