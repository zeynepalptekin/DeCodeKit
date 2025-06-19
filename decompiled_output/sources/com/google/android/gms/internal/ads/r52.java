package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class r52 extends ThreadLocal<Cipher> {
    r52() {
    }

    private static Cipher a() {
        try {
            return l62.f.a("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return a();
    }
}
