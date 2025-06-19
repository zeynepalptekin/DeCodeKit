package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class u5 implements Callable<List<ea>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ma f6533a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ c5 f6534b;

    u5(c5 c5Var, ma maVar) {
        this.f6534b = c5Var;
        this.f6533a = maVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<ea> call() throws Exception {
        this.f6534b.e.k0();
        return this.f6534b.e.a0().L(this.f6533a.d);
    }
}
