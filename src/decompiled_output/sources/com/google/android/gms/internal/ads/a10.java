package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class a10 implements bm1 {

    /* renamed from: a, reason: collision with root package name */
    private Context f2616a;

    /* renamed from: b, reason: collision with root package name */
    private String f2617b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ e00 f2618c;

    private a10(e00 e00Var) {
        this.f2618c = e00Var;
    }

    @Override // com.google.android.gms.internal.ads.bm1
    public final /* synthetic */ bm1 a(Context context) {
        this.f2616a = (Context) we2.a(context);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bm1
    public final cm1 b() {
        we2.c(this.f2616a, Context.class);
        return new d10(this.f2618c, this.f2616a, this.f2617b);
    }

    @Override // com.google.android.gms.internal.ads.bm1
    public final /* synthetic */ bm1 c(String str) {
        this.f2617b = str;
        return this;
    }
}
