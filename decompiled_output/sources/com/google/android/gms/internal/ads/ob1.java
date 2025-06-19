package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ob1 implements ff1<lb1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f4671a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4672b;

    public ob1(cy1 cy1Var, Context context) {
        this.f4671a = cy1Var;
        this.f4672b = context;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<lb1> a() {
        return this.f4671a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.nb1

            /* renamed from: a, reason: collision with root package name */
            private final ob1 f4517a;

            {
                this.f4517a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4517a.b();
            }
        });
    }

    final /* synthetic */ lb1 b() throws Exception {
        double intExtra;
        Intent intentRegisterReceiver = this.f4672b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver != null) {
            int intExtra2 = intentRegisterReceiver.getIntExtra(androidx.core.app.p.t0, -1);
            intExtra = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.b.u, -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            if (intExtra2 == 2 || intExtra2 == 5) {
                z = true;
            }
        } else {
            intExtra = -1.0d;
        }
        return new lb1(intExtra, z);
    }
}
