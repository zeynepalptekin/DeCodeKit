package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes.dex */
public final class s62 implements o62<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.ads.o62
    public final /* synthetic */ KeyPairGenerator a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
