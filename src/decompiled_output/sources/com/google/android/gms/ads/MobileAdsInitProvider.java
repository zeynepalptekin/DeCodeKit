package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.h0;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.p03;

@com.google.android.gms.common.annotation.c
/* loaded from: classes.dex */
public class MobileAdsInitProvider extends ContentProvider {
    private final p03 d = new p03();

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.d.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@h0 Uri uri, String str, String[] strArr) {
        return this.d.delete(uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    @i0
    public String getType(@h0 Uri uri) {
        return this.d.getType(uri);
    }

    @Override // android.content.ContentProvider
    @i0
    public Uri insert(@h0 Uri uri, ContentValues contentValues) {
        return this.d.insert(uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return this.d.onCreate();
    }

    @Override // android.content.ContentProvider
    @i0
    public Cursor query(@h0 Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.d.query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public int update(@h0 Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.d.update(uri, contentValues, str, strArr);
    }
}
