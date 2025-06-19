package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class v90 implements pe2<ch0<od0>> {

    /* renamed from: a, reason: collision with root package name */
    private final r90 f5650a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<p90> f5651b;

    private v90(r90 r90Var, ze2<p90> ze2Var) {
        this.f5650a = r90Var;
        this.f5651b = ze2Var;
    }

    public static v90 a(r90 r90Var, ze2<p90> ze2Var) {
        return new v90(r90Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5651b.get(), cs.f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
