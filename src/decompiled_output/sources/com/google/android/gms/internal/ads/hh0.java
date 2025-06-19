package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class hh0 implements pe2<fh0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3671a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Set<ch0<sr2>>> f3672b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<km1> f3673c;

    private hh0(ze2<Context> ze2Var, ze2<Set<ch0<sr2>>> ze2Var2, ze2<km1> ze2Var3) {
        this.f3671a = ze2Var;
        this.f3672b = ze2Var2;
        this.f3673c = ze2Var3;
    }

    public static hh0 a(ze2<Context> ze2Var, ze2<Set<ch0<sr2>>> ze2Var2, ze2<km1> ze2Var3) {
        return new hh0(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new fh0(this.f3671a.get(), this.f3672b.get(), this.f3673c.get());
    }
}
