package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class l5 implements Callable<List<va>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6447a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f6448b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f6449c;
    private final /* synthetic */ c5 d;

    l5(c5 c5Var, String str, String str2, String str3) {
        this.d = c5Var;
        this.f6447a = str;
        this.f6448b = str2;
        this.f6449c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<va> call() throws Exception {
        this.d.e.k0();
        return this.d.e.a0().n0(this.f6447a, this.f6448b, this.f6449c);
    }
}
