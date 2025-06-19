package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class gq1 implements pe2<ThreadFactory> {
    public static gq1 a() {
        return jq1.f4013a;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ThreadFactory) we2.b(new rp1(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
