package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public final class q62 implements o62<KeyAgreement> {
    @Override // com.google.android.gms.internal.ads.o62
    public final /* synthetic */ KeyAgreement a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
