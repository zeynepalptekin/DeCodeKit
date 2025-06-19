package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o80 implements pe2<un> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<com.google.android.gms.common.util.g> f4652a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ho> f4653b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<an1> f4654c;

    private o80(ze2<com.google.android.gms.common.util.g> ze2Var, ze2<ho> ze2Var2, ze2<an1> ze2Var3) {
        this.f4652a = ze2Var;
        this.f4653b = ze2Var2;
        this.f4654c = ze2Var3;
    }

    public static o80 a(ze2<com.google.android.gms.common.util.g> ze2Var, ze2<ho> ze2Var2, ze2<an1> ze2Var3) {
        return new o80(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (un) we2.b(this.f4653b.get().c(this.f4652a.get(), this.f4654c.get().f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
