package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class l30 implements pe2<yb> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<pb> f4191a;

    private l30(ze2<pb> ze2Var) {
        this.f4191a = ze2Var;
    }

    public static l30 a(ze2<pb> ze2Var) {
        return new l30(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (yb) we2.b(this.f4191a.get().b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
