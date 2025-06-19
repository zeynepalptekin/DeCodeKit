package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* loaded from: classes.dex */
public final class t62 implements o62<Signature> {
    @Override // com.google.android.gms.internal.ads.o62
    public final /* synthetic */ Signature a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
