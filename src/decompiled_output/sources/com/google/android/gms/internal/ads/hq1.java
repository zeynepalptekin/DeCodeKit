package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class hq1 implements pe2<ScheduledExecutorService> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<ThreadFactory> f3709a;

    public hq1(ze2<ThreadFactory> ze2Var) {
        this.f3709a = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ScheduledExecutorService) we2.b(du1.a().b(1, this.f3709a.get(), iu1.f3869b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
