package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import com.google.android.gms.internal.ads.r42;
import com.google.android.gms.internal.ads.u42;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class b02 {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f2768a = Charset.forName("UTF-8");

    public static u42 a(r42 r42Var) {
        u42.b bVarW = u42.K().w(r42Var.H());
        for (r42.b bVar : r42Var.I()) {
            bVarW.v((u42.a) ((l92) u42.a.N().z(bVar.K().M()).v(bVar.H()).w(bVar.I()).x(bVar.L()).P()));
        }
        return (u42) ((l92) bVarW.P());
    }

    public static void b(r42 r42Var) throws GeneralSecurityException {
        int r0 = r42Var.H();
        int r3 = 0;
        boolean z = false;
        boolean z2 = true;
        for (r42.b bVar : r42Var.I()) {
            if (bVar.H() == k42.ENABLED) {
                if (!bVar.J()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(bVar.L())));
                }
                if (bVar.I() == d52.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(bVar.L())));
                }
                if (bVar.H() == k42.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(bVar.L())));
                }
                if (bVar.L() == r0) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (bVar.K().O() != j42.a.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                r3++;
            }
        }
        if (r3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
