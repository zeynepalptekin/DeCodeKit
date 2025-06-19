package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class m5 implements Callable<List<va>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ma f6461a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f6462b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f6463c;
    private final /* synthetic */ c5 d;

    m5(c5 c5Var, ma maVar, String str, String str2) {
        this.d = c5Var;
        this.f6461a = maVar;
        this.f6462b = str;
        this.f6463c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<va> call() throws Exception {
        this.d.e.k0();
        return this.d.e.a0().n0(this.f6461a.d, this.f6462b, this.f6463c);
    }
}
