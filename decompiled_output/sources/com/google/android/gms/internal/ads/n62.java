package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class n62 implements o62<Cipher> {
    @Override // com.google.android.gms.internal.ads.o62
    public final /* synthetic */ Cipher a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
