package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vp1 implements pe2<Executor> {
    public static vp1 a() {
        return up1.f5579a;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Executor) we2.b(cs.e, "Cannot return null from a non-@Nullable @Provides method");
    }
}
