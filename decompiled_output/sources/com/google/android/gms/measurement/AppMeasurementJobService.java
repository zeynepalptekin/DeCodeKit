package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.e0;
import com.google.android.gms.measurement.internal.b9;
import com.google.android.gms.measurement.internal.f9;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements f9 {
    private b9<AppMeasurementJobService> d;

    private final b9<AppMeasurementJobService> b() {
        if (this.d == null) {
            this.d = new b9<>(this);
        }
        return this.d;
    }

    @Override // com.google.android.gms.measurement.internal.f9
    public final void G0(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.f9
    @TargetApi(24)
    public final void a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.f9
    public final boolean e(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    @e0
    public final void onCreate() {
        super.onCreate();
        b().c();
    }

    @Override // android.app.Service
    @e0
    public final void onDestroy() {
        b().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    @e0
    public final void onRebind(Intent intent) {
        b().k(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return b().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @e0
    public final boolean onUnbind(Intent intent) {
        return b().i(intent);
    }
}
