package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class qp2 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f5047a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f5048b;

    public final synchronized Map<String, String> a() {
        if (this.f5048b == null) {
            this.f5048b = Collections.unmodifiableMap(new HashMap(this.f5047a));
        }
        return this.f5048b;
    }
}
