package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class fh1 implements pe2<dh1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<gc> f3409a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ScheduledExecutorService> f3410b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Boolean> f3411c;
    private final ze2<ApplicationInfo> d;

    public fh1(ze2<gc> ze2Var, ze2<ScheduledExecutorService> ze2Var2, ze2<Boolean> ze2Var3, ze2<ApplicationInfo> ze2Var4) {
        this.f3409a = ze2Var;
        this.f3410b = ze2Var2;
        this.f3411c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new dh1(this.f3409a.get(), this.f3410b.get(), this.f3411c.get().booleanValue(), this.d.get());
    }
}
