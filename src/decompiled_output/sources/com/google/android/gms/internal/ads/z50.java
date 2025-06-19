package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class z50 implements pe2<ch0<we0>> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f6223a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<gd0> f6224b;

    public z50(h50 h50Var, ze2<gd0> ze2Var) {
        this.f6223a = h50Var;
        this.f6224b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        final gd0 gd0Var = this.f6224b.get();
        return (ch0) we2.b(new ch0(new we0(gd0Var) { // from class: com.google.android.gms.internal.ads.j50
            private final gd0 d;

            {
                this.d = gd0Var;
            }

            @Override // com.google.android.gms.internal.ads.we0
            public final void s() {
                this.d.I0();
            }
        }, cs.f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
