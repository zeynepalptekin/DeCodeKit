package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class io1 implements pe2<eo1> {

    /* renamed from: a, reason: collision with root package name */
    private final go1 f3846a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<co1> f3847b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<String> f3848c;

    private io1(go1 go1Var, ze2<co1> ze2Var, ze2<String> ze2Var2) {
        this.f3846a = go1Var;
        this.f3847b = ze2Var;
        this.f3848c = ze2Var2;
    }

    public static io1 a(go1 go1Var, ze2<co1> ze2Var, ze2<String> ze2Var2) {
        return new io1(go1Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (eo1) we2.b(this.f3847b.get().b(this.f3848c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
