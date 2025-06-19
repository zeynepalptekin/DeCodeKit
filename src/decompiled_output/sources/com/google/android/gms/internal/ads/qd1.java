package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class qd1 implements pe2<od1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f4987a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f4988b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Set<String>> f4989c;

    private qd1(ze2<cy1> ze2Var, ze2<Context> ze2Var2, ze2<Set<String>> ze2Var3) {
        this.f4987a = ze2Var;
        this.f4988b = ze2Var2;
        this.f4989c = ze2Var3;
    }

    public static qd1 a(ze2<cy1> ze2Var, ze2<Context> ze2Var2, ze2<Set<String>> ze2Var3) {
        return new qd1(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new od1(this.f4987a.get(), this.f4988b.get(), this.f4989c.get());
    }
}
