package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class lz1<PrimitiveT, KeyT> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<PrimitiveT> f4320a;

    public lz1(Class<PrimitiveT> cls) {
        this.f4320a = cls;
    }

    public abstract PrimitiveT a(KeyT keyt) throws GeneralSecurityException;

    final Class<PrimitiveT> b() {
        return this.f4320a;
    }
}
