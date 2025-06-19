package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class vk0 implements pe2<fh0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5695a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<km1> f5696b;

    public vk0(ze2<Context> ze2Var, ze2<km1> ze2Var2) {
        this.f5695a = ze2Var;
        this.f5696b = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (fh0) we2.b(new fh0(this.f5695a.get(), new HashSet(), this.f5696b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
