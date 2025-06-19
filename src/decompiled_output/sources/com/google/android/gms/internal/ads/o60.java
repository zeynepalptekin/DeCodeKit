package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o60 implements pe2<Runnable> {

    /* renamed from: a, reason: collision with root package name */
    private final q60 f4650a;

    public o60(q60 q60Var) {
        this.f4650a = q60Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Runnable) we2.b(this.f4650a.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
