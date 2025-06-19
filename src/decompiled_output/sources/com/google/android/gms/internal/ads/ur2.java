package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class ur2 implements as2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Activity f5588a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f5589b;

    ur2(rr2 rr2Var, Activity activity, Bundle bundle) {
        this.f5588a = activity;
        this.f5589b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.as2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f5588a, this.f5589b);
    }
}
