package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class va1 implements ff1<cf1<Bundle>> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f5657a;

    /* renamed from: b, reason: collision with root package name */
    private final ao f5658b;

    va1(Executor executor, ao aoVar) {
        this.f5657a = executor;
        this.f5658b = aoVar;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<cf1<Bundle>> a() {
        return ((Boolean) qx2.e().c(e0.I1)).booleanValue() ? qx1.g(null) : qx1.i(this.f5658b.s(), ua1.f5494a, this.f5657a);
    }
}
