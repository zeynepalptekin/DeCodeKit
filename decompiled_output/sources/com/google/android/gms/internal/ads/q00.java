package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class q00 implements ii1 {

    /* renamed from: a, reason: collision with root package name */
    private Context f4922a;

    /* renamed from: b, reason: collision with root package name */
    private String f4923b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ e00 f4924c;

    private q00(e00 e00Var) {
        this.f4924c = e00Var;
    }

    @Override // com.google.android.gms.internal.ads.ii1
    public final fi1 a() {
        we2.c(this.f4922a, Context.class);
        we2.c(this.f4923b, String.class);
        return new t00(this.f4924c, this.f4922a, this.f4923b);
    }

    @Override // com.google.android.gms.internal.ads.ii1
    public final /* synthetic */ ii1 b(String str) {
        this.f4923b = (String) we2.a(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ii1
    public final /* synthetic */ ii1 c(Context context) {
        this.f4922a = (Context) we2.a(context);
        return this;
    }
}
