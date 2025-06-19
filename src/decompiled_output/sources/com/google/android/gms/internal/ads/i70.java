package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class i70<AdT> implements f70<AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, u01<AdT>> f3778a;

    i70(Map<String, u01<AdT>> map) {
        this.f3778a = map;
    }

    @Override // com.google.android.gms.internal.ads.f70
    @androidx.annotation.i0
    public final u01<AdT> a(int r1, String str) {
        return this.f3778a.get(str);
    }
}
