package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes.dex */
public class rs<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ks<T> f5180a = new ks<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f5181b = new AtomicInteger(0);

    public rs() {
        qx1.f(this.f5180a, new qs(this), cs.f);
    }

    @Deprecated
    public final int a() {
        return this.f5181b.get();
    }

    @Deprecated
    public final void b() {
        this.f5180a.b(new Exception());
    }

    @Deprecated
    public final void d(os<T> osVar, ms msVar) {
        qx1.f(this.f5180a, new ts(this, osVar, msVar), cs.f);
    }

    @Deprecated
    public final void e(T t) {
        this.f5180a.a(t);
    }
}
