package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bf2 {

    /* renamed from: a, reason: collision with root package name */
    private static String f2830a;

    public static String a(Context context) {
        String str;
        String str2 = f2830a;
        if (str2 != null) {
            return str2;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        String str3 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction(b.d.b.d.f);
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f2830a = null;
        } else {
            if (arrayList.size() == 1) {
                str = (String) arrayList.get(0);
            } else if (TextUtils.isEmpty(str3) || b(context, intent) || !arrayList.contains(str3)) {
                str = "com.android.chrome";
                if (!arrayList.contains("com.android.chrome")) {
                    str = "com.chrome.beta";
                    if (!arrayList.contains("com.chrome.beta")) {
                        str = "com.chrome.dev";
                        if (!arrayList.contains("com.chrome.dev")) {
                            str = "com.google.android.apps.chrome";
                            if (arrayList.contains("com.google.android.apps.chrome")) {
                            }
                        }
                    }
                }
            } else {
                f2830a = str3;
            }
            f2830a = str;
        }
        return f2830a;
    }

    private static boolean b(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities;
        try {
            listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (listQueryIntentActivities != null && listQueryIntentActivities.size() != 0) {
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
