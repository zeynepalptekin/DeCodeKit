package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class zr2 implements as2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Activity f6309a;

    zr2(rr2 rr2Var, Activity activity) {
        this.f6309a = activity;
    }

    @Override // com.google.android.gms.internal.ads.as2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f6309a);
    }
}
