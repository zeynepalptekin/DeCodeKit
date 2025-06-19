package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class y11 implements pe2<w11> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f6073a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<as> f6074b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<b60> f6075c;
    private final ze2<Executor> d;

    public y11(ze2<Context> ze2Var, ze2<as> ze2Var2, ze2<b60> ze2Var3, ze2<Executor> ze2Var4) {
        this.f6073a = ze2Var;
        this.f6074b = ze2Var2;
        this.f6075c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new w11(this.f6073a.get(), this.f6074b.get(), this.f6075c.get(), this.d.get());
    }
}
