package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.xa2;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class hz1<PrimitiveT, KeyProtoT extends xa2> implements ez1<PrimitiveT> {

    /* renamed from: a, reason: collision with root package name */
    private final jz1<KeyProtoT> f3737a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f3738b;

    public hz1(jz1<KeyProtoT> jz1Var, Class<PrimitiveT> cls) {
        if (!jz1Var.e().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", jz1Var.toString(), cls.getName()));
        }
        this.f3737a = jz1Var;
        this.f3738b = cls;
    }

    private final gz1<?, KeyProtoT> g() {
        return new gz1<>(this.f3737a.g());
    }

    private final PrimitiveT h(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.f3738b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f3737a.h(keyprotot);
        return (PrimitiveT) this.f3737a.b(keyprotot, this.f3738b);
    }

    @Override // com.google.android.gms.internal.ads.ez1
    public final Class<PrimitiveT> a() {
        return this.f3738b;
    }

    @Override // com.google.android.gms.internal.ads.ez1
    public final j42 b(a82 a82Var) throws GeneralSecurityException {
        try {
            return (j42) ((l92) j42.Q().x(this.f3737a.a()).v(g().a(a82Var).h()).w(this.f3737a.d()).P());
        } catch (w92 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ez1
    public final PrimitiveT c(xa2 xa2Var) throws GeneralSecurityException {
        String strValueOf = String.valueOf(this.f3737a.c().getName());
        String strConcat = strValueOf.length() != 0 ? "Expected proto of type ".concat(strValueOf) : new String("Expected proto of type ");
        if (this.f3737a.c().isInstance(xa2Var)) {
            return h(xa2Var);
        }
        throw new GeneralSecurityException(strConcat);
    }

    @Override // com.google.android.gms.internal.ads.ez1
    public final xa2 d(a82 a82Var) throws GeneralSecurityException {
        try {
            return g().a(a82Var);
        } catch (w92 e) {
            String strValueOf = String.valueOf(this.f3737a.g().a().getName());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "Failures parsing proto of type ".concat(strValueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ez1
    public final String e() {
        return this.f3737a.a();
    }

    @Override // com.google.android.gms.internal.ads.ez1
    public final PrimitiveT f(a82 a82Var) throws GeneralSecurityException {
        try {
            return h(this.f3737a.i(a82Var));
        } catch (w92 e) {
            String strValueOf = String.valueOf(this.f3737a.c().getName());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "Failures parsing proto of type ".concat(strValueOf) : new String("Failures parsing proto of type "), e);
        }
    }
}
