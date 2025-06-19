package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.e0;
import com.google.android.gms.measurement.internal.b9;
import com.google.android.gms.measurement.internal.f9;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements f9 {
    private b9<AppMeasurementService> d;

    private final b9<AppMeasurementService> b() {
        if (this.d == null) {
            this.d = new b9<>(this);
        }
        return this.d;
    }

    @Override // com.google.android.gms.measurement.internal.f9
    public final void G0(Intent intent) {
        b.p.b.a.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.f9
    public final void a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.f9
    public final boolean e(int r1) {
        return stopSelfResult(r1);
    }

    @Override // android.app.Service
    @e0
    public final IBinder onBind(Intent intent) {
        return b().b(intent);
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

    @Override // android.app.Service
    @e0
    public final int onStartCommand(Intent intent, int r3, int r4) {
        return b().a(intent, r3, r4);
    }

    @Override // android.app.Service
    @e0
    public final boolean onUnbind(Intent intent) {
        return b().i(intent);
    }
}
