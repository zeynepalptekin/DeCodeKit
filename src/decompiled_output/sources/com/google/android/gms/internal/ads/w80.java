package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w80 implements pe2<ch0<bb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<t20> f5804a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f5805b;

    private w80(ze2<t20> ze2Var, ze2<Executor> ze2Var2) {
        this.f5804a = ze2Var;
        this.f5805b = ze2Var2;
    }

    public static w80 a(ze2<t20> ze2Var, ze2<Executor> ze2Var2) {
        return new w80(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5804a.get(), this.f5805b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
