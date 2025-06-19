package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class s5 implements Callable<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ s f6507a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f6508b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ c5 f6509c;

    s5(c5 c5Var, s sVar, String str) {
        this.f6509c = c5Var;
        this.f6507a = sVar;
        this.f6508b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        this.f6509c.e.k0();
        return this.f6509c.e.d0().t(this.f6507a, this.f6508b);
    }
}
