package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class v50 implements pe2<ch0<nc0>> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f5631a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<t60> f5632b;

    public v50(h50 h50Var, ze2<t60> ze2Var) {
        this.f5631a = h50Var;
        this.f5632b = ze2Var;
    }

    public static ch0<nc0> a(h50 h50Var, t60 t60Var) {
        return (ch0) we2.b(new ch0(t60Var, cs.e), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f5631a, this.f5632b.get());
    }
}
