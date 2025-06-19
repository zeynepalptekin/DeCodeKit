package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hq0 implements Callable<up0> {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.b f3706a;

    /* renamed from: b, reason: collision with root package name */
    private final zw f3707b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3708c;
    private final Executor d;
    private final i52 e;
    private final as f;

    public hq0(Context context, Executor executor, i52 i52Var, as asVar, com.google.android.gms.ads.internal.b bVar, zw zwVar) {
        this.f3708c = context;
        this.d = executor;
        this.e = i52Var;
        this.f = asVar;
        this.f3706a = bVar;
        this.f3707b = zwVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ up0 call() throws Exception {
        up0 up0Var = new up0(this);
        up0Var.h();
        return up0Var;
    }
}
