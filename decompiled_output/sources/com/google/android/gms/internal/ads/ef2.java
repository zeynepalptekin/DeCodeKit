package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class ef2 implements df2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Activity f3265a;

    ef2(l82 l82Var, Activity activity) {
        this.f3265a = activity;
    }

    @Override // com.google.android.gms.internal.ads.df2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f3265a);
    }
}
