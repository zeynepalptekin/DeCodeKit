package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class i52 {
    private static final String[] f = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    private String f3772a = "googleads.g.doubleclick.net";

    /* renamed from: b, reason: collision with root package name */
    private String f3773b = "/pagead/ads";

    /* renamed from: c, reason: collision with root package name */
    private String f3774c = "ad.doubleclick.net";
    private String[] d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private xu1 e;

    public i52(xu1 xu1Var) {
        this.e = xu1Var;
    }

    private final Uri c(Uri uri, String str) throws h42 {
        try {
            boolean zE = e(uri);
            if (zE) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new h42("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new h42("Query parameter already exists: ms");
            }
            if (!zE) {
                String string = uri.toString();
                int r5 = string.indexOf("&adurl");
                if (r5 == -1) {
                    r5 = string.indexOf("?adurl");
                }
                if (r5 == -1) {
                    return uri.buildUpon().appendQueryParameter("ms", str).build();
                }
                int r52 = r5 + 1;
                return Uri.parse(string.substring(0, r52) + "ms=" + str + "&" + string.substring(r52));
            }
            String string2 = uri.toString();
            int r53 = string2.indexOf(";adurl");
            if (r53 != -1) {
                int r54 = r53 + 1;
                return Uri.parse(string2.substring(0, r54) + "dc_ms=" + str + ";" + string2.substring(r54));
            }
            String encodedPath = uri.getEncodedPath();
            int r4 = string2.indexOf(encodedPath);
            return Uri.parse(string2.substring(0, encodedPath.length() + r4) + ";dc_ms=" + str + ";" + string2.substring(r4 + encodedPath.length()));
        } catch (UnsupportedOperationException unused) {
            throw new h42("Provided Uri is not in a valid state");
        }
    }

    private final boolean e(Uri uri) {
        if (uri == null) {
            throw null;
        }
        try {
            return uri.getHost().equals(this.f3774c);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public final Uri a(Uri uri, Context context) throws h42 {
        return c(uri, this.e.c(context));
    }

    public final Uri b(Uri uri, Context context, View view, Activity activity) throws h42 {
        try {
            return c(uri, this.e.g(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new h42("Provided Uri is not in a valid state");
        }
    }

    public final void d(MotionEvent motionEvent) {
        this.e.f(motionEvent);
    }

    public final boolean f(Uri uri) {
        if (uri == null) {
            throw null;
        }
        try {
            String host = uri.getHost();
            for (String str : this.d) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final boolean g(Uri uri) {
        if (f(uri)) {
            for (String str : f) {
                if (uri.getPath().endsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final xu1 h() {
        return this.e;
    }
}
