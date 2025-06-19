package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.uz1;
import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes.dex */
final class zz1 implements uz1.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ vz1 f6323a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ jz1 f6324b;

    zz1(vz1 vz1Var, jz1 jz1Var) {
        this.f6323a = vz1Var;
        this.f6324b = jz1Var;
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final <Q> ez1<Q> b(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new sz1(this.f6323a, this.f6324b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final Class<?> c() {
        return this.f6324b.getClass();
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final Set<Class<?>> d() {
        return this.f6323a.e();
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final ez1<?> e() {
        vz1 vz1Var = this.f6323a;
        return new sz1(vz1Var, this.f6324b, vz1Var.f());
    }

    @Override // com.google.android.gms.internal.ads.uz1.a
    public final Class<?> f() {
        return this.f6323a.getClass();
    }
}
