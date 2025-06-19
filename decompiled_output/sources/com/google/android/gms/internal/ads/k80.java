package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class k80 implements pe2<ch0<bb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final i80 f4065a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<s80> f4066b;

    private k80(i80 i80Var, ze2<s80> ze2Var) {
        this.f4065a = i80Var;
        this.f4066b = ze2Var;
    }

    public static k80 a(i80 i80Var, ze2<s80> ze2Var) {
        return new k80(i80Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f4066b.get(), cs.f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
