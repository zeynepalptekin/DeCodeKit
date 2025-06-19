package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class iw0 implements pe2<List<String>> {
    public static iw0 a() {
        return lw0.f4314a;
    }

    public static List<String> b() {
        return (List) we2.b(e0.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b();
    }
}
