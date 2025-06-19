package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    final b5 f6477a;

    o4(b5 b5Var) {
        this.f6477a = b5Var;
    }

    @com.google.android.gms.common.util.d0
    private final boolean c() {
        try {
            c.a.b.b.d.s.b bVarA = c.a.b.b.d.s.c.a(this.f6477a.F());
            if (bVarA != null) {
                return bVarA.e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f6477a.B().N().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f6477a.B().N().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    @androidx.annotation.i0
    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    final Bundle a(String str, c.a.b.b.g.c.d2 d2Var) {
        this.f6477a.x().c();
        if (d2Var == null) {
            this.f6477a.B().I().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundleS0 = d2Var.s0(bundle);
            if (bundleS0 != null) {
                return bundleS0;
            }
            this.f6477a.B().E().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f6477a.B().E().b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    @androidx.annotation.y0
    protected final void b(String str) {
        if (str == null || str.isEmpty()) {
            this.f6477a.B().J().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f6477a.x().c();
        if (!c()) {
            this.f6477a.B().L().a("Install Referrer Reporter is not available");
            return;
        }
        r4 r4Var = new r4(this, str);
        this.f6477a.x().c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f6477a.F().getPackageManager();
        if (packageManager == null) {
            this.f6477a.B().J().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            this.f6477a.B().L().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !c()) {
                this.f6477a.B().I().a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.f6477a.B().N().b("Install Referrer Service is", com.google.android.gms.common.stats.a.b().a(this.f6477a.F(), new Intent(intent), r4Var, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.f6477a.B().E().b("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }
}
