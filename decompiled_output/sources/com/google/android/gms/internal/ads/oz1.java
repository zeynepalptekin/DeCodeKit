package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import com.google.android.gms.internal.ads.r42;
import java.security.GeneralSecurityException;

@Deprecated
/* loaded from: classes.dex */
public final class oz1 {
    @Deprecated
    public static final kz1 a(byte[] bArr) throws GeneralSecurityException {
        try {
            r42 r42VarL = r42.L(bArr, y82.b());
            for (r42.b bVar : r42VarL.I()) {
                if (bVar.K().O() == j42.a.UNKNOWN_KEYMATERIAL || bVar.K().O() == j42.a.SYMMETRIC || bVar.K().O() == j42.a.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return kz1.a(r42VarL);
        } catch (w92 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
