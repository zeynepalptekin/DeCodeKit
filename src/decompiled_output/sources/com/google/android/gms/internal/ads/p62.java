package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes.dex */
public final class p62 implements o62<KeyFactory> {
    @Override // com.google.android.gms.internal.ads.o62
    public final /* synthetic */ KeyFactory a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
