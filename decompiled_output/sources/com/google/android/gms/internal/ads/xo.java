package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class xo implements or {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Context f6013a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f6014b;

    xo(to toVar, Context context, String str) {
        this.f6013a = context;
        this.f6014b = str;
    }

    @Override // com.google.android.gms.internal.ads.or
    public final void a(String str) {
        com.google.android.gms.ads.internal.p.c();
        to.G(this.f6013a, this.f6014b, str);
    }
}
