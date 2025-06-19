package com.google.firebase.analytics;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class b implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAnalytics f6890a;

    b(FirebaseAnalytics firebaseAnalytics) {
        this.f6890a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return this.f6890a.f6871a.f0();
    }
}
