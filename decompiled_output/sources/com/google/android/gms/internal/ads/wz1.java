package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.uz1;
import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes.dex */
final class wz1 implements uz1.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ jz1 f5902a;

    wz1(jz1 jz1Var) {
        this.f5902a = jz1Var;
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final <Q> ez1<Q> b(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new hz1(this.f5902a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final Class<?> c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final Set<Class<?>> d() {
        return this.f5902a.e();
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final ez1<?> e() {
        jz1 jz1Var = this.f5902a;
        return new hz1(jz1Var, jz1Var.f());
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final Class<?> f() {
        return this.f5902a.getClass();
    }
}
