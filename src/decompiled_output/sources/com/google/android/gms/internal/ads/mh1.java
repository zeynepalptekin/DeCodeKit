package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mh1 implements pe2<String> {

    /* renamed from: a, reason: collision with root package name */
    private final ih1 f4416a;

    public mh1(ih1 ih1Var) {
        this.f4416a = ih1Var;
    }

    public static String a(ih1 ih1Var) {
        return (String) we2.b(ih1Var.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4416a);
    }
}
