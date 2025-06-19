package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class re2 implements df2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Activity f5130a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f5131b;

    re2(l82 l82Var, Activity activity, Bundle bundle) {
        this.f5130a = activity;
        this.f5131b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.df2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f5130a, this.f5131b);
    }
}
