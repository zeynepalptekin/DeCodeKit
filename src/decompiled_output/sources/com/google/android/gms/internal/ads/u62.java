package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes.dex */
public final class u62 implements o62<MessageDigest> {
    @Override // com.google.android.gms.internal.ads.o62
    public final /* synthetic */ MessageDigest a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
