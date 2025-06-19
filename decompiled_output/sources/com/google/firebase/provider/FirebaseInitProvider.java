package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.x0;
import c.a.d.e;
import com.google.android.gms.common.internal.r;

/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {
    private static final String d = "FirebaseInitProvider";

    @x0
    static final String e = "com.google.firebase.firebaseinitprovider";

    private static void a(@h0 ProviderInfo providerInfo) {
        r.l(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (e.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@h0 Context context, @h0 ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@h0 Uri uri, @i0 String str, @i0 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @i0
    public String getType(@h0 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @i0
    public Uri insert(@h0 Uri uri, @i0 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Log.i(d, e.u(getContext()) == null ? "FirebaseApp initialization unsuccessful" : "FirebaseApp initialization successful");
        return false;
    }

    @Override // android.content.ContentProvider
    @i0
    public Cursor query(@h0 Uri uri, @i0 String[] strArr, @i0 String str, @i0 String[] strArr2, @i0 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@h0 Uri uri, @i0 ContentValues contentValues, @i0 String str, @i0 String[] strArr) {
        return 0;
    }
}
