package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class ob2 implements df2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Activity f4673a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f4674b;

    ob2(l82 l82Var, Activity activity, Bundle bundle) {
        this.f4673a = activity;
        this.f4674b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.df2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f4673a, this.f4674b);
    }
}
