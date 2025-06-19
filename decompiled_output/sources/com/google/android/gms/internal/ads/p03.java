package com.google.android.gms.internal.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class p03 extends ContentProvider {
    @androidx.annotation.i0
    private static Bundle a(Context context) {
        String str;
        try {
            return c.a.b.b.d.s.c.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            str = "Failed to load metadata: Package name not found.";
            tr.c(str, e);
            return null;
        } catch (NullPointerException e2) {
            e = e2;
            str = "Failed to load metadata: Null pointer exception.";
            tr.c(str, e);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        Bundle bundleA = a(context);
        hc hcVarG = hc.g();
        if (bundleA == null) {
            tr.g("Metadata was null.");
        } else {
            try {
                String str = (String) bundleA.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    Boolean bool = (Boolean) bundleA.get("com.google.android.gms.ads.AD_MANAGER_APP");
                    try {
                        Boolean bool2 = (Boolean) bundleA.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                        try {
                            String str2 = (String) bundleA.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                            if (str == null || str.matches("^/\\d+~.+$")) {
                                if (bool == null || !bool.booleanValue()) {
                                    if (TextUtils.isEmpty(str2)) {
                                        throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                                    }
                                    String strValueOf = String.valueOf(str2);
                                    tr.f(strValueOf.length() != 0 ? "The Google Mobile Ads SDK is integrated by ".concat(strValueOf) : new String("The Google Mobile Ads SDK is integrated by "));
                                } else if (bool2 == null || !bool2.booleanValue()) {
                                    hcVarG.d(context);
                                }
                            } else {
                                if (!str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                                    throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n******************************************************************************\n\n");
                                }
                                String strValueOf2 = String.valueOf(str);
                                tr.f(strValueOf2.length() != 0 ? "Publisher provided Google AdMob App ID in manifest: ".concat(strValueOf2) : new String("Publisher provided Google AdMob App ID in manifest: "));
                                if (bool2 == null || !bool2.booleanValue()) {
                                    hcVarG.b(context, str);
                                }
                            }
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e);
                        }
                    } catch (ClassCastException e2) {
                        throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e2);
                    }
                } catch (ClassCastException e3) {
                    throw new IllegalStateException("The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value.", e3);
                }
            } catch (ClassCastException e4) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e4);
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(@androidx.annotation.h0 Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.i0
    public final String getType(@androidx.annotation.h0 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.i0
    public final Uri insert(@androidx.annotation.h0 Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    @androidx.annotation.i0
    public final Cursor query(@androidx.annotation.h0 Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@androidx.annotation.h0 Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
