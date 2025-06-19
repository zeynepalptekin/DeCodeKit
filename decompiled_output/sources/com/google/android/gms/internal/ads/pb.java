package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class pb {

    /* renamed from: b, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private static final fq<u9> f4791b = new sb();

    /* renamed from: c, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private static final fq<u9> f4792c = new rb();

    /* renamed from: a, reason: collision with root package name */
    private final da f4793a;

    public pb(Context context, as asVar, String str) {
        this.f4793a = new da(context, asVar, str, f4791b, f4792c);
    }

    public final <I, O> gb<I, O> a(String str, lb<I> lbVar, ib<O> ibVar) {
        return new ub(this.f4793a, str, lbVar, ibVar);
    }

    public final yb b() {
        return new yb(this.f4793a);
    }
}
