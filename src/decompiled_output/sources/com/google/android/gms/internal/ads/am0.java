package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class am0 implements pe2<ch0<hd0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<n71> f2709a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f2710b;

    private am0(ze2<n71> ze2Var, ze2<Executor> ze2Var2) {
        this.f2709a = ze2Var;
        this.f2710b = ze2Var2;
    }

    public static am0 a(ze2<n71> ze2Var, ze2<Executor> ze2Var2) {
        return new am0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f2709a.get(), this.f2710b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
