package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.f9;

/* loaded from: classes.dex */
public final class b9<T extends Context & f9> {

    /* renamed from: a, reason: collision with root package name */
    private final T f6359a;

    public b9(T t) {
        com.google.android.gms.common.internal.r.k(t);
        this.f6359a = t;
    }

    private final void f(Runnable runnable) throws IllegalStateException {
        t9 t9VarF = t9.f(this.f6359a);
        t9VarF.x().v(new c9(this, t9VarF, runnable));
    }

    private final w3 j() {
        return b5.a(this.f6359a, null, null).B();
    }

    @androidx.annotation.e0
    public final int a(final Intent intent, int r7, final int r8) throws IllegalStateException {
        final w3 w3VarB = b5.a(this.f6359a, null, null).B();
        if (intent == null) {
            w3VarB.I().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        w3VarB.N().c("Local AppMeasurementService called. startId, action", Integer.valueOf(r8), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable(this, r8, w3VarB, intent) { // from class: com.google.android.gms.measurement.internal.a9
                private final b9 d;
                private final int e;
                private final w3 f;
                private final Intent g;

                {
                    this.d = this;
                    this.e = r8;
                    this.f = w3VarB;
                    this.g = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(this.e, this.f, this.g);
                }
            });
        }
        return 2;
    }

    @androidx.annotation.e0
    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().E().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new c5(t9.f(this.f6359a));
        }
        j().I().b("onBind received unknown action", action);
        return null;
    }

    @androidx.annotation.e0
    public final void c() {
        b5.a(this.f6359a, null, null).B().N().a("Local AppMeasurementService is starting up");
    }

    final /* synthetic */ void d(int r2, w3 w3Var, Intent intent) {
        if (this.f6359a.e(r2)) {
            w3Var.N().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(r2));
            j().N().a("Completed wakeful intent.");
            this.f6359a.G0(intent);
        }
    }

    final /* synthetic */ void e(w3 w3Var, JobParameters jobParameters) {
        w3Var.N().a("AppMeasurementJobService processed last upload request.");
        this.f6359a.a(jobParameters, false);
    }

    @TargetApi(24)
    @androidx.annotation.e0
    public final boolean g(final JobParameters jobParameters) throws IllegalStateException {
        final w3 w3VarB = b5.a(this.f6359a, null, null).B();
        String string = jobParameters.getExtras().getString("action");
        w3VarB.N().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new Runnable(this, w3VarB, jobParameters) { // from class: com.google.android.gms.measurement.internal.d9
            private final b9 d;
            private final w3 e;
            private final JobParameters f;

            {
                this.d = this;
                this.e = w3VarB;
                this.f = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(this.e, this.f);
            }
        });
        return true;
    }

    @androidx.annotation.e0
    public final void h() {
        b5.a(this.f6359a, null, null).B().N().a("Local AppMeasurementService is shutting down");
    }

    @androidx.annotation.e0
    public final boolean i(Intent intent) {
        if (intent == null) {
            j().E().a("onUnbind called with null intent");
            return true;
        }
        j().N().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @androidx.annotation.e0
    public final void k(Intent intent) {
        if (intent == null) {
            j().E().a("onRebind called with null intent");
        } else {
            j().N().b("onRebind called. action", intent.getAction());
        }
    }
}
