package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.g;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, Object> f2450a = new HashMap<>();

    public final Object a(String str) {
        return this.f2450a.get(str);
    }

    public final void b(String str, Object obj) {
        this.f2450a.put(str, obj);
    }
}
