package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* loaded from: classes.dex */
public final class p9 extends u9 {
    private final AlarmManager d;
    private final k e;
    private Integer f;

    protected p9(t9 t9Var) {
        super(t9Var);
        this.d = (AlarmManager) F().getSystemService(androidx.core.app.p.k0);
        this.e = new s9(this, t9Var.m0(), t9Var);
    }

    @TargetApi(24)
    private final void v() {
        ((JobScheduler) F().getSystemService("jobscheduler")).cancel(w());
    }

    private final int w() {
        if (this.f == null) {
            String strValueOf = String.valueOf(F().getPackageName());
            this.f = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.f.intValue();
    }

    private final PendingIntent y() {
        Context contextF = F();
        return PendingIntent.getBroadcast(contextF, 0, new Intent().setClassName(contextF, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ m d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ wa e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ u3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ ha h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ j4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ xa j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ da k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ y8 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ na m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ d n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ v4 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.u9
    protected final boolean s() {
        this.d.cancel(y());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        v();
        return false;
    }

    public final void t(long j) {
        q();
        Context contextF = F();
        if (!t4.b(contextF)) {
            B().M().a("Receiver not registered/enabled");
        }
        if (!ha.Z(contextF, false)) {
            B().M().a("Service not registered/enabled");
        }
        u();
        B().N().b("Scheduling upload, millis", Long.valueOf(j));
        long jC = z().c() + j;
        if (j < Math.max(0L, u.y.a(null).longValue()) && !this.e.d()) {
            this.e.c(j);
        }
        if (Build.VERSION.SDK_INT < 24) {
            this.d.setInexactRepeating(2, jC, Math.max(u.t.a(null).longValue(), j), y());
            return;
        }
        Context contextF2 = F();
        ComponentName componentName = new ComponentName(contextF2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int r2 = w();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        c.a.b.b.g.c.h6.b(contextF2, new JobInfo.Builder(r2, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void u() {
        q();
        B().N().a("Unscheduling upload");
        this.d.cancel(y());
        this.e.e();
        if (Build.VERSION.SDK_INT >= 24) {
            v();
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}
