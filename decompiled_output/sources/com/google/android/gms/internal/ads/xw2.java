package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.w;

/* loaded from: classes.dex */
public final class xw2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.ads.f[] f6053a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6054b;

    public xw2(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, w.c.AdsAttrs);
        String string = typedArrayObtainAttributes.getString(w.c.AdsAttrs_adSize);
        String string2 = typedArrayObtainAttributes.getString(w.c.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.f6053a = b(string);
        } else {
            if (z || !z2) {
                if (!z) {
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f6053a = b(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(w.c.AdsAttrs_adUnitId);
        this.f6054b = string3;
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static com.google.android.gms.ads.f[] b(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        com.google.android.gms.ads.f[] fVarArr = new com.google.android.gms.ads.f[length];
        for (int r4 = 0; r4 < strArrSplit.length; r4++) {
            String strTrim = strArrSplit[r4].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    fVarArr[r4] = new com.google.android.gms.ads.f("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    String strValueOf = String.valueOf(strTrim);
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strValueOf) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(strTrim)) {
                fVarArr[r4] = com.google.android.gms.ads.f.i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                fVarArr[r4] = com.google.android.gms.ads.f.k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                fVarArr[r4] = com.google.android.gms.ads.f.j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                fVarArr[r4] = com.google.android.gms.ads.f.l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                fVarArr[r4] = com.google.android.gms.ads.f.m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                fVarArr[r4] = com.google.android.gms.ads.f.o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                fVarArr[r4] = com.google.android.gms.ads.f.n;
            } else if ("FLUID".equals(strTrim)) {
                fVarArr[r4] = com.google.android.gms.ads.f.p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    String strValueOf2 = String.valueOf(strTrim);
                    throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strValueOf2) : new String("Could not parse XML attribute \"adSize\": "));
                }
                fVarArr[r4] = com.google.android.gms.ads.f.r;
            }
        }
        if (length != 0) {
            return fVarArr;
        }
        String strValueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf3.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strValueOf3) : new String("Could not parse XML attribute \"adSize\": "));
    }

    public final String a() {
        return this.f6054b;
    }

    public final com.google.android.gms.ads.f[] c(boolean z) {
        if (z || this.f6053a.length == 1) {
            return this.f6053a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
