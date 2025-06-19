package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.z;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vn0 implements pe2<ch0<z.a>> {

    /* renamed from: a, reason: collision with root package name */
    private final mn0 f5711a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<mq0> f5712b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f5713c;

    public vn0(mn0 mn0Var, ze2<mq0> ze2Var, ze2<Executor> ze2Var2) {
        this.f5711a = mn0Var;
        this.f5712b = ze2Var;
        this.f5713c = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5712b.get(), this.f5713c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
