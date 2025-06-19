package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.f22;
import com.google.android.gms.internal.ads.i52;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class o implements Callable<i52> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ j f2411a;

    o(j jVar) {
        this.f2411a = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ i52 call() throws Exception {
        return new i52(f22.y(this.f2411a.e.d, this.f2411a.h, false));
    }
}
