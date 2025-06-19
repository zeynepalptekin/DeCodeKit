package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r42;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class uz1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f5615a = Logger.getLogger(uz1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, a> f5616b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap<String, b> f5617c = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> d = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zy1<?>> e = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, tz1<?>> f = new ConcurrentHashMap();

    interface a {
        <P> ez1<P> b(Class<P> cls) throws GeneralSecurityException;

        Class<?> c();

        Set<Class<?>> d();

        ez1<?> e();

        Class<?> f();
    }

    interface b {
    }

    private uz1() {
    }

    private static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    private static <P> ez1<P> b(String str, Class<P> cls) throws GeneralSecurityException {
        a aVarQ = q(str);
        if (cls == null) {
            return (ez1<P>) aVarQ.e();
        }
        if (aVarQ.d().contains(cls)) {
            return aVarQ.b(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(aVarQ.f());
        Set<Class<?>> setD = aVarQ.d();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : setD) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(strValueOf).length() + String.valueOf(string).length());
        sb2.append("Primitive type ");
        sb2.append(name);
        sb2.append(" not supported by key manager of type ");
        sb2.append(strValueOf);
        sb2.append(", supported primitives: ");
        sb2.append(string);
        throw new GeneralSecurityException(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <P> rz1<P> c(kz1 kz1Var, ez1<P> ez1Var, Class<P> cls) throws GeneralSecurityException {
        Class cls2 = (Class) a(cls);
        b02.b(kz1Var.b());
        rz1<P> rz1Var = (rz1<P>) rz1.b(cls2);
        for (r42.b bVar : kz1Var.b().I()) {
            if (bVar.H() == k42.ENABLED) {
                qz1 qz1VarA = rz1Var.a(g(bVar.K().M(), bVar.K().N(), cls2), bVar);
                if (bVar.L() == kz1Var.b().H()) {
                    rz1Var.c(qz1VarA);
                }
            }
        }
        return rz1Var;
    }

    private static <KeyProtoT extends xa2> a d(jz1<KeyProtoT> jz1Var) {
        return new wz1(jz1Var);
    }

    public static synchronized j42 e(m42 m42Var) throws GeneralSecurityException {
        ez1<?> ez1VarS;
        ez1VarS = s(m42Var.H());
        if (!d.get(m42Var.H()).booleanValue()) {
            String strValueOf = String.valueOf(m42Var.H());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return ez1VarS.b(m42Var.I());
    }

    public static <P> P f(rz1<P> rz1Var) throws GeneralSecurityException {
        tz1<?> tz1Var = f.get(rz1Var.d());
        if (tz1Var != null) {
            return (P) tz1Var.b(rz1Var);
        }
        String strValueOf = String.valueOf(rz1Var.d().getName());
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "No wrapper found for ".concat(strValueOf) : new String("No wrapper found for "));
    }

    private static <P> P g(String str, a82 a82Var, Class<P> cls) throws GeneralSecurityException {
        return (P) b(str, cls).f(a82Var);
    }

    public static <P> P h(String str, xa2 xa2Var, Class<P> cls) throws GeneralSecurityException {
        return (P) b(str, (Class) a(cls)).c(xa2Var);
    }

    public static <P> P i(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) g(str, a82.S(bArr), (Class) a(cls));
    }

    public static synchronized <P> void j(ez1<P> ez1Var, boolean z) throws GeneralSecurityException {
        if (ez1Var == null) {
            throw new IllegalArgumentException("key manager must be non-null.");
        }
        String strE = ez1Var.e();
        n(strE, ez1Var.getClass(), z);
        if (!f5616b.containsKey(strE)) {
            f5616b.put(strE, new xz1(ez1Var));
        }
        d.put(strE, Boolean.valueOf(z));
    }

    public static synchronized <KeyProtoT extends xa2> void k(jz1<KeyProtoT> jz1Var, boolean z) throws GeneralSecurityException {
        String strA = jz1Var.a();
        n(strA, jz1Var.getClass(), true);
        if (!f5616b.containsKey(strA)) {
            f5616b.put(strA, d(jz1Var));
            f5617c.put(strA, o(jz1Var));
        }
        d.put(strA, Boolean.TRUE);
    }

    public static synchronized <P> void l(tz1<P> tz1Var) throws GeneralSecurityException {
        if (tz1Var == null) {
            throw new IllegalArgumentException("wrapper must be non-null");
        }
        Class<P> clsA = tz1Var.a();
        if (f.containsKey(clsA)) {
            tz1<?> tz1Var2 = f.get(clsA);
            if (!tz1Var.getClass().equals(tz1Var2.getClass())) {
                Logger logger = f5615a;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(clsA.toString());
                logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", strValueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(strValueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsA.getName(), tz1Var2.getClass().getName(), tz1Var.getClass().getName()));
            }
        }
        f.put(clsA, tz1Var);
    }

    public static synchronized <KeyProtoT extends xa2, PublicKeyProtoT extends xa2> void m(vz1<KeyProtoT, PublicKeyProtoT> vz1Var, jz1<PublicKeyProtoT> jz1Var, boolean z) throws GeneralSecurityException {
        Class<?> clsC;
        String strA = vz1Var.a();
        String strA2 = jz1Var.a();
        n(strA, vz1Var.getClass(), true);
        n(strA2, jz1Var.getClass(), false);
        if (strA.equals(strA2)) {
            throw new GeneralSecurityException("Private and public key type must be different.");
        }
        if (f5616b.containsKey(strA) && (clsC = f5616b.get(strA).c()) != null && !clsC.equals(jz1Var.getClass())) {
            Logger logger = f5615a;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 96 + String.valueOf(strA2).length());
            sb.append("Attempted overwrite of a registered key manager for key type ");
            sb.append(strA);
            sb.append(" with inconsistent public key type ");
            sb.append(strA2);
            logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", vz1Var.getClass().getName(), clsC.getName(), jz1Var.getClass().getName()));
        }
        if (!f5616b.containsKey(strA) || f5616b.get(strA).c() == null) {
            f5616b.put(strA, new zz1(vz1Var, jz1Var));
            f5617c.put(strA, o(vz1Var));
        }
        d.put(strA, Boolean.TRUE);
        if (!f5616b.containsKey(strA2)) {
            f5616b.put(strA2, d(jz1Var));
        }
        d.put(strA2, Boolean.FALSE);
    }

    private static synchronized void n(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        if (f5616b.containsKey(str)) {
            a aVar = f5616b.get(str);
            if (aVar.f().equals(cls)) {
                if (!z || d.get(str).booleanValue()) {
                    return;
                }
                String strValueOf = String.valueOf(str);
                throw new GeneralSecurityException(strValueOf.length() != 0 ? "New keys are already disallowed for key type ".concat(strValueOf) : new String("New keys are already disallowed for key type "));
            }
            Logger logger = f5615a;
            Level level = Level.WARNING;
            String strValueOf2 = String.valueOf(str);
            logger.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", strValueOf2.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(strValueOf2) : new String("Attempted overwrite of a registered key manager for key type "));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, aVar.f().getName(), cls.getName()));
        }
    }

    private static <KeyProtoT extends xa2> b o(jz1<KeyProtoT> jz1Var) {
        return new yz1(jz1Var);
    }

    public static synchronized xa2 p(m42 m42Var) throws GeneralSecurityException {
        ez1<?> ez1VarS;
        ez1VarS = s(m42Var.H());
        if (!d.get(m42Var.H()).booleanValue()) {
            String strValueOf = String.valueOf(m42Var.H());
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
        }
        return ez1VarS.d(m42Var.I());
    }

    private static synchronized a q(String str) throws GeneralSecurityException {
        if (!f5616b.containsKey(str)) {
            String strValueOf = String.valueOf(str);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "No key manager found for key type ".concat(strValueOf) : new String("No key manager found for key type "));
        }
        return f5616b.get(str);
    }

    @Deprecated
    public static zy1<?> r(String str) throws GeneralSecurityException {
        String strValueOf;
        String str2;
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zy1<?> zy1Var = e.get(str.toLowerCase());
        if (zy1Var != null) {
            return zy1Var;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase().startsWith("tinkaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call DeterministicAeadConfig.register().";
        } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call StreamingAeadConfig.register().";
        } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call HybridConfig.register().";
        } else if (str.toLowerCase().startsWith("tinkmac")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call MacConfig.register().";
        } else {
            if (!str.toLowerCase().startsWith("tinkpublickeysign") && !str.toLowerCase().startsWith("tinkpublickeyverify")) {
                if (str.toLowerCase().startsWith("tink")) {
                    strValueOf = String.valueOf(strConcat);
                    str2 = "Maybe call TinkConfig.register().";
                }
                throw new GeneralSecurityException(strConcat);
            }
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call SignatureConfig.register().";
        }
        strConcat = strValueOf.concat(str2);
        throw new GeneralSecurityException(strConcat);
    }

    private static ez1<?> s(String str) throws GeneralSecurityException {
        return q(str).e();
    }
}
