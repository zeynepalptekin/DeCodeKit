package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;

@TargetApi(16)
/* loaded from: classes.dex */
public class dp {
    private dp() {
    }

    public static boolean j(rw rwVar) {
        if (rwVar == null) {
            return false;
        }
        rwVar.onPause();
        return true;
    }

    public static boolean l(rw rwVar) {
        if (rwVar == null) {
            return false;
        }
        rwVar.onResume();
        return true;
    }

    public static dp o(int r1) {
        return r1 >= 28 ? new kp() : r1 >= 26 ? new lp() : r1 >= 24 ? new ip() : r1 >= 21 ? new jp() : r1 >= 19 ? new gp() : r1 >= 18 ? new hp() : r1 >= 17 ? new ep() : new dp();
    }

    public static boolean s() {
        int r0 = Process.myUid();
        return r0 == 0 || r0 == 1000;
    }

    public String a(Context context) {
        return "";
    }

    public boolean b(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public int c(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public Drawable d(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public WebResourceResponse e(String str, String str2, int r3, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public qw f(rw rwVar, tu2 tu2Var, boolean z) {
        return new tx(rwVar, tu2Var, z);
    }

    public mv2 g(Context context, TelephonyManager telephonyManager) {
        return mv2.ENUM_UNKNOWN;
    }

    public boolean h(Activity activity, Configuration configuration) {
        return false;
    }

    public boolean i(final Context context, final WebSettings webSettings) {
        ar.a(context, new Callable(context, webSettings) { // from class: com.google.android.gms.internal.ads.cp

            /* renamed from: a, reason: collision with root package name */
            private final Context f3010a;

            /* renamed from: b, reason: collision with root package name */
            private final WebSettings f3011b;

            {
                this.f3010a = context;
                this.f3011b = webSettings;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.f3010a;
                WebSettings webSettings2 = this.f3011b;
                if (context2.getCacheDir() != null) {
                    webSettings2.setAppCachePath(context2.getCacheDir().getAbsolutePath());
                    webSettings2.setAppCacheMaxSize(0L);
                    webSettings2.setAppCacheEnabled(true);
                }
                webSettings2.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public int k(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public void m(Context context) {
    }

    public CookieManager n(Context context) {
        if (s()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            tr.c("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.p.g().e(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public void p(Activity activity) {
    }

    public int q() {
        return 5;
    }

    public ViewGroup.LayoutParams r() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public int t() {
        return 1;
    }

    public long u() {
        return -1L;
    }
}
