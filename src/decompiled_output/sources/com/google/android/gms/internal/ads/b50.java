package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class b50 implements pe2<gd0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<ScheduledExecutorService> f2792a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<com.google.android.gms.common.util.g> f2793b;

    public b50(ze2<ScheduledExecutorService> ze2Var, ze2<com.google.android.gms.common.util.g> ze2Var2) {
        this.f2792a = ze2Var;
        this.f2793b = ze2Var2;
    }

    public static gd0 a(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.g gVar) {
        return (gd0) we2.b(new gd0(scheduledExecutorService, gVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f2792a.get(), this.f2793b.get());
    }
}
