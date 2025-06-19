package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class j5 implements Callable<List<ea>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6416a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f6417b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f6418c;
    private final /* synthetic */ c5 d;

    j5(c5 c5Var, String str, String str2, String str3) {
        this.d = c5Var;
        this.f6416a = str;
        this.f6417b = str2;
        this.f6418c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<ea> call() throws Exception {
        this.d.e.k0();
        return this.d.e.a0().N(this.f6416a, this.f6417b, this.f6418c);
    }
}
