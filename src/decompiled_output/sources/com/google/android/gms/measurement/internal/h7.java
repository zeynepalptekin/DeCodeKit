package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

@TargetApi(14)
@androidx.annotation.e0
/* loaded from: classes.dex */
final class h7 implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ f6 d;

    private h7(f6 f6Var) {
        this.d = f6Var;
    }

    /* synthetic */ h7(f6 f6Var, l6 l6Var) {
        this(f6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void b(boolean z, Uri uri, String str, String str2) {
        Bundle bundleY;
        Bundle bundleY2;
        this.d.c();
        try {
            if (this.d.j().p(u.f0) || this.d.j().p(u.h0) || this.d.j().p(u.g0)) {
                ha haVarH = this.d.h();
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium")) {
                        String strValueOf = String.valueOf(str2);
                        bundleY = haVarH.y(Uri.parse(strValueOf.length() != 0 ? "https://google.com/search?".concat(strValueOf) : new String("https://google.com/search?")));
                        if (bundleY != null) {
                            bundleY.putString("_cis", "referrer");
                        }
                    } else {
                        haVarH.B().M().a("Activity created with data 'referrer' without required params");
                    }
                }
                bundleY = null;
            } else {
                bundleY = null;
            }
            boolean z2 = false;
            if (z) {
                bundleY2 = this.d.h().y(uri);
                if (bundleY2 != null) {
                    bundleY2.putString("_cis", "intent");
                    if (this.d.j().p(u.f0) && !bundleY2.containsKey("gclid") && bundleY != null && bundleY.containsKey("gclid")) {
                        bundleY2.putString("_cer", String.format("gclid=%s", bundleY.getString("gclid")));
                    }
                    this.d.Z(str, "_cmp", bundleY2);
                    if (this.d.j().p(u.F0)) {
                        this.d.n.b(str, bundleY2);
                    }
                }
            } else {
                bundleY2 = null;
            }
            if (this.d.j().p(u.h0) && !this.d.j().p(u.g0) && bundleY != null && bundleY.containsKey("gclid") && (bundleY2 == null || !bundleY2.containsKey("gclid"))) {
                this.d.d0("auto", "_lgclid", bundleY.getString("gclid"), true);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.d.B().M().b("Activity created with referrer", str2);
            if (this.d.j().p(u.g0)) {
                if (bundleY != null) {
                    this.d.Z(str, "_cmp", bundleY);
                    if (this.d.j().p(u.F0)) {
                        this.d.n.b(str, bundleY);
                    }
                } else {
                    this.d.B().M().b("Referrer does not contain valid parameters", str2);
                }
                this.d.d0("auto", "_ldl", null, true);
                return;
            }
            if (str2.contains("gclid") && (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                z2 = true;
            }
            if (!z2) {
                this.d.B().M().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                this.d.d0("auto", "_ldl", str2, true);
            }
        } catch (Exception e) {
            this.d.B().E().b("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            try {
                this.d.B().N().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    this.d.h();
                    this.d.x().v(new g7(this, bundle == null, data, ha.a0(intent) ? "gs" : "auto", data.getQueryParameter("referrer")));
                }
            } catch (Exception e) {
                this.d.B().E().b("Throwable caught in onActivityCreated", e);
            }
        } finally {
            this.d.o().G(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.d.o().V(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @androidx.annotation.e0
    public final void onActivityPaused(Activity activity) throws IllegalStateException {
        this.d.o().T(activity);
        e9 e9VarQ = this.d.q();
        e9VarQ.x().v(new g9(e9VarQ, e9VarQ.z().c()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @androidx.annotation.e0
    public final void onActivityResumed(Activity activity) throws IllegalStateException {
        e9 e9VarQ = this.d.q();
        e9VarQ.x().v(new h9(e9VarQ, e9VarQ.z().c()));
        this.d.o().E(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.d.o().U(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
