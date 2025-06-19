package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class m50 implements pe2<mc0> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f4346a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Set<ch0<nc0>>> f4347b;

    public m50(h50 h50Var, ze2<Set<ch0<nc0>>> ze2Var) {
        this.f4346a = h50Var;
        this.f4347b = ze2Var;
    }

    public static mc0 a(h50 h50Var, Set<ch0<nc0>> set) {
        return (mc0) we2.b(h50Var.a(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4346a, this.f4347b.get());
    }
}
