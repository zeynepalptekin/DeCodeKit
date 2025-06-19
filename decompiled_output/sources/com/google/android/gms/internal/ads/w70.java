package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class w70 implements pe2<lm1> {

    /* renamed from: a, reason: collision with root package name */
    private final v70 f5800a;

    private w70(v70 v70Var) {
        this.f5800a = v70Var;
    }

    public static w70 a(v70 v70Var) {
        return new w70(v70Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (lm1) we2.b(this.f5800a.c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
