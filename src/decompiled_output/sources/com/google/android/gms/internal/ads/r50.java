package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class r50 implements pe2<e50> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f5101a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<g50> f5102b;

    public r50(h50 h50Var, ze2<g50> ze2Var) {
        this.f5101a = h50Var;
        this.f5102b = ze2Var;
    }

    public static e50 a(h50 h50Var, Object obj) {
        return (e50) we2.b((g50) obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f5101a, this.f5102b.get());
    }
}
