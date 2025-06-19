package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class k90 implements pe2<ch0<com.google.android.gms.ads.internal.overlay.p>> {

    /* renamed from: a, reason: collision with root package name */
    private final b90 f4070a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<y70> f4071b;

    private k90(b90 b90Var, ze2<y70> ze2Var) {
        this.f4070a = b90Var;
        this.f4071b = ze2Var;
    }

    public static k90 a(b90 b90Var, ze2<y70> ze2Var) {
        return new k90(b90Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f4071b.get(), cs.f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
