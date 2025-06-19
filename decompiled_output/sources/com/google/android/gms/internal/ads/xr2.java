package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class xr2 implements as2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Activity f6031a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f6032b;

    xr2(rr2 rr2Var, Activity activity, Bundle bundle) {
        this.f6031a = activity;
        this.f6032b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.as2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f6031a, this.f6032b);
    }
}
