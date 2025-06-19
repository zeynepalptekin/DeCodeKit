package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class hc {

    /* renamed from: b, reason: collision with root package name */
    private static hc f3658b;

    /* renamed from: a, reason: collision with root package name */
    private AtomicBoolean f3659a = new AtomicBoolean(false);

    @androidx.annotation.x0
    hc() {
    }

    private static void a(Context context, com.google.android.gms.measurement.c.a aVar) {
        try {
            ((cz) wr.a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", mc.f4384a)).p3(c.a.b.b.e.e.i2(context), new ic(aVar));
        } catch (RemoteException | yr | NullPointerException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    static /* synthetic */ void c(Context context, String str) {
        e0.a(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) qx2.e().c(e0.a0)).booleanValue());
        a(context, com.google.android.gms.measurement.c.a.l(context, "FA-Ads", "am", str, bundle));
    }

    private static boolean e(Context context) throws ClassNotFoundException {
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static /* synthetic */ void f(Context context) {
        e0.a(context);
        if (((Boolean) qx2.e().c(e0.f0)).booleanValue() && e(context)) {
            a(context, com.google.android.gms.measurement.c.a.k(context));
        }
    }

    public static hc g() {
        if (f3658b == null) {
            f3658b = new hc();
        }
        return f3658b;
    }

    @androidx.annotation.i0
    public final Thread b(final Context context, final String str) {
        if (!this.f3659a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this, context, str) { // from class: com.google.android.gms.internal.ads.kc
            private final hc d;
            private final Context e;
            private final String f;

            {
                this.d = this;
                this.e = context;
                this.f = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hc.c(this.e, this.f);
            }
        });
        thread.start();
        return thread;
    }

    @androidx.annotation.i0
    public final Thread d(final Context context) {
        if (!this.f3659a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this, context) { // from class: com.google.android.gms.internal.ads.jc
            private final hc d;
            private final Context e;

            {
                this.d = this;
                this.e = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hc.f(this.e);
            }
        });
        thread.start();
        return thread;
    }
}
