package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class k5 implements Callable<List<ea>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ma f6432a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f6433b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f6434c;
    private final /* synthetic */ c5 d;

    k5(c5 c5Var, ma maVar, String str, String str2) {
        this.d = c5Var;
        this.f6432a = maVar;
        this.f6433b = str;
        this.f6434c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<ea> call() throws Exception {
        this.d.e.k0();
        return this.d.e.a0().N(this.f6432a.d, this.f6433b, this.f6434c);
    }
}
