package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
final class qd2 implements df2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Activity f4990a;

    qd2(l82 l82Var, Activity activity) {
        this.f4990a = activity;
    }

    @Override // com.google.android.gms.internal.ads.df2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f4990a);
    }
}
