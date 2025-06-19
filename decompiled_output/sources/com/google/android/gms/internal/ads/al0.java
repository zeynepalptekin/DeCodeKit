package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class al0 implements pe2<q30> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<mr2> f2702a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f2703b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Context> f2704c;
    private final ze2<com.google.android.gms.common.util.g> d;

    public al0(ze2<mr2> ze2Var, ze2<Executor> ze2Var2, ze2<Context> ze2Var3, ze2<com.google.android.gms.common.util.g> ze2Var4) {
        this.f2702a = ze2Var;
        this.f2703b = ze2Var2;
        this.f2704c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        mr2 mr2Var = this.f2702a.get();
        Executor executor = this.f2703b.get();
        Context context = this.f2704c.get();
        return (q30) we2.b(new q30(executor, new e30(context, mr2Var), this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
