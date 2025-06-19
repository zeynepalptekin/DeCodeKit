package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    private final s4 f6518a;

    public t4(s4 s4Var) {
        com.google.android.gms.common.internal.r.k(s4Var);
        this.f6518a = s4Var;
    }

    public static boolean b(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.r.k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    @androidx.annotation.e0
    public final void a(Context context, Intent intent) {
        w3 w3VarB = b5.a(context, null, null).B();
        if (intent == null) {
            w3VarB.I().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        w3VarB.N().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                w3VarB.I().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            w3VarB.N().a("Starting wakeful intent.");
            this.f6518a.a(context, className);
        }
    }
}
