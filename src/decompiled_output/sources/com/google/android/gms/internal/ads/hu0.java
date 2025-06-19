package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hu0 {

    /* renamed from: a, reason: collision with root package name */
    private final mu0 f3722a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3723b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f3724c;

    public hu0(mu0 mu0Var, Executor executor) {
        this.f3722a = mu0Var;
        this.f3724c = mu0Var.a();
        this.f3723b = executor;
    }

    public final gu0 b() {
        return new gu0(this).b();
    }
}
