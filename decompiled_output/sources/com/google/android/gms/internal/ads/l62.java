package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.o62;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class l62<T_WRAPPER extends o62<T_ENGINE>, T_ENGINE> {
    private static final Logger d = Logger.getLogger(l62.class.getName());
    private static final List<Provider> e;
    public static final l62<n62, Cipher> f;
    public static final l62<r62, Mac> g;
    private static final l62<t62, Signature> h;
    private static final l62<u62, MessageDigest> i;
    public static final l62<q62, KeyAgreement> j;
    public static final l62<s62, KeyPairGenerator> k;
    public static final l62<p62, KeyFactory> l;

    /* renamed from: a, reason: collision with root package name */
    private T_WRAPPER f4206a;

    /* renamed from: b, reason: collision with root package name */
    private List<Provider> f4207b = e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4208c = true;

    static {
        if (e72.a()) {
            String[] strArr = {c.a.b.b.i.a.d, "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int r3 = 0; r3 < 2; r3++) {
                String str = strArr[r3];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    d.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            e = arrayList;
        } else {
            e = new ArrayList();
        }
        f = new l62<>(new n62());
        g = new l62<>(new r62());
        h = new l62<>(new t62());
        i = new l62<>(new u62());
        j = new l62<>(new q62());
        k = new l62<>(new s62());
        l = new l62<>(new p62());
    }

    private l62(T_WRAPPER t_wrapper) {
        this.f4206a = t_wrapper;
    }

    public final T_ENGINE a(String str) throws GeneralSecurityException {
        Iterator<Provider> it = this.f4207b.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return (T_ENGINE) this.f4206a.a(str, it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (this.f4208c) {
            return (T_ENGINE) this.f4206a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
