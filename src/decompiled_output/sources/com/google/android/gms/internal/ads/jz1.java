package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import com.google.android.gms.internal.ads.xa2;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class jz1<KeyProtoT extends xa2> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyProtoT> f4032a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, lz1<?, KeyProtoT>> f4033b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<?> f4034c;

    @SafeVarargs
    protected jz1(Class<KeyProtoT> cls, lz1<?, KeyProtoT>... lz1VarArr) {
        this.f4032a = cls;
        HashMap map = new HashMap();
        for (lz1<?, KeyProtoT> lz1Var : lz1VarArr) {
            if (map.containsKey(lz1Var.b())) {
                String strValueOf = String.valueOf(lz1Var.b().getCanonicalName());
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map.put(lz1Var.b(), lz1Var);
        }
        this.f4034c = lz1VarArr.length > 0 ? lz1VarArr[0].b() : Void.class;
        this.f4033b = Collections.unmodifiableMap(map);
    }

    public abstract String a();

    public final <P> P b(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        lz1<?, KeyProtoT> lz1Var = this.f4033b.get(cls);
        if (lz1Var != null) {
            return (P) lz1Var.a(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final Class<KeyProtoT> c() {
        return this.f4032a;
    }

    public abstract j42.a d();

    public final Set<Class<?>> e() {
        return this.f4033b.keySet();
    }

    final Class<?> f() {
        return this.f4034c;
    }

    public iz1<?, KeyProtoT> g() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract void h(KeyProtoT keyprotot) throws GeneralSecurityException;

    public abstract KeyProtoT i(a82 a82Var) throws w92;
}
