package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.uz1;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
final class xz1 implements uz1.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ez1 f6063a;

    xz1(ez1 ez1Var) {
        this.f6063a = ez1Var;
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final <Q> ez1<Q> b(Class<Q> cls) throws GeneralSecurityException {
        if (this.f6063a.a().equals(cls)) {
            return this.f6063a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final Class<?> c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final Set<Class<?>> d() {
        return Collections.singleton(this.f6063a.a());
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final ez1<?> e() {
        return this.f6063a;
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final Class<?> f() {
        return this.f6063a.getClass();
    }
}
