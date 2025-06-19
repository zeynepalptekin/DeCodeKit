package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.internal.ads.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo {

    @com.google.android.gms.common.util.d0
    private final String g;
    private final qo h;

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private long f3144a = -1;

    /* renamed from: b, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private long f3145b = -1;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    @com.google.android.gms.common.util.d0
    private int f3146c = -1;

    @com.google.android.gms.common.util.d0
    int d = -1;

    @com.google.android.gms.common.util.d0
    private long e = 0;
    private final Object f = new Object();

    @GuardedBy("lock")
    @com.google.android.gms.common.util.d0
    private int i = 0;

    @GuardedBy("lock")
    @com.google.android.gms.common.util.d0
    private int j = 0;

    public Cdo(String str, qo qoVar) {
        this.g = str;
        this.h = qoVar;
    }

    private static boolean b(Context context) {
        Context contextC = rj.c(context);
        int identifier = contextC.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            tr.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == contextC.getPackageManager().getActivityInfo(new ComponentName(contextC.getPackageName(), AdActivity.e), 0).theme) {
                return true;
            }
            tr.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            tr.i("Fail to fetch AdActivity theme");
            tr.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public final void a(jw2 jw2Var, long j) {
        synchronized (this.f) {
            long jN = this.h.n();
            long jA = com.google.android.gms.ads.internal.p.j().a();
            if (this.f3145b == -1) {
                if (jA - jN > ((Long) qx2.e().c(e0.x0)).longValue()) {
                    this.d = -1;
                } else {
                    this.d = this.h.H();
                }
                this.f3145b = j;
            }
            this.f3144a = j;
            if (jw2Var == null || jw2Var.f == null || jw2Var.f.getInt("gw", 2) != 1) {
                this.f3146c++;
                int r11 = this.d + 1;
                this.d = r11;
                if (r11 == 0) {
                    this.e = 0L;
                    this.h.G(jA);
                } else {
                    this.e = jA - this.h.A();
                }
            }
        }
    }

    public final Bundle c(Context context, String str) {
        Bundle bundle;
        synchronized (this.f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.g);
            bundle.putLong("basets", this.f3145b);
            bundle.putLong("currts", this.f3144a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f3146c);
            bundle.putInt("preqs_in_session", this.d);
            bundle.putLong("time_in_session", this.e);
            bundle.putInt("pclick", this.i);
            bundle.putInt("pimp", this.j);
            bundle.putBoolean("support_transparent_background", b(context));
        }
        return bundle;
    }

    public final void d() {
        synchronized (this.f) {
            this.j++;
        }
    }

    public final void e() {
        synchronized (this.f) {
            this.i++;
        }
    }
}
