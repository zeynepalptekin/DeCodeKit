package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
public final class c7 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2935a;

    /* renamed from: b, reason: collision with root package name */
    private final i52 f2936b;

    /* renamed from: c, reason: collision with root package name */
    private final View f2937c;

    public c7(Context context, i52 i52Var, View view) {
        this.f2935a = context;
        this.f2936b = i52Var;
        this.f2937c = view;
    }

    private static Intent a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    @com.google.android.gms.common.util.d0
    private final ResolveInfo b(Intent intent, ArrayList<ResolveInfo> arrayList) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = this.f2935a.getPackageManager();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.p.g().e(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            int r1 = 0;
            while (true) {
                if (r1 >= listQueryIntentActivities.size()) {
                    break;
                }
                ResolveInfo resolveInfo2 = listQueryIntentActivities.get(r1);
                if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                    resolveInfo = resolveInfoResolveActivity;
                    break;
                }
                r1++;
            }
        }
        arrayList.addAll(listQueryIntentActivities);
        return resolveInfo;
    }

    @com.google.android.gms.common.util.d0
    private final ResolveInfo c(Intent intent) {
        return b(intent, new ArrayList<>());
    }

    private static Intent e(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    @com.google.android.gms.common.util.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent d(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c7.d(java.util.Map):android.content.Intent");
    }
}
