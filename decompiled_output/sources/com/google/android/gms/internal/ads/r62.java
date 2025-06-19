package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class r62 implements o62<Mac> {
    @Override // com.google.android.gms.internal.ads.o62
    public final /* synthetic */ Mac a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
