package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cf1;

/* loaded from: classes.dex */
final class tb1<S extends cf1<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final dy1<S> f5378a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5379b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f5380c;

    public tb1(dy1<S> dy1Var, long j, com.google.android.gms.common.util.g gVar) {
        this.f5378a = dy1Var;
        this.f5380c = gVar;
        this.f5379b = gVar.c() + j;
    }

    public final boolean a() {
        return this.f5379b < this.f5380c.c();
    }
}
