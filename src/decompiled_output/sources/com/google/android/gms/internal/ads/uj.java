package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class uj implements ey2 {
    private static final boolean d = qf.f4995b;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    private final fu f5526a;

    /* renamed from: b, reason: collision with root package name */
    private final rg f5527b;

    /* renamed from: c, reason: collision with root package name */
    private final ti f5528c;

    public uj(rg rgVar) {
        this(rgVar, new ti(4096));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private uj(rg rgVar, ti tiVar) {
        this.f5527b = rgVar;
        this.f5526a = rgVar;
        this.f5528c = tiVar;
    }

    private static void b(String str, b<?> bVar, pd pdVar) throws pd {
        oc ocVarI = bVar.I();
        int r1 = bVar.H();
        try {
            ocVarI.a(pdVar);
            bVar.s(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(r1)));
        } catch (pd e) {
            bVar.s(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(r1)));
            throw e;
        }
    }

    private final byte[] c(InputStream inputStream, int r7) throws nb, IOException {
        jy jyVar = new jy(this.f5528c, r7);
        try {
            if (inputStream == null) {
                throw new nb();
            }
            byte[] bArrB = this.f5528c.b(1024);
            while (true) {
                int r3 = inputStream.read(bArrB);
                if (r3 == -1) {
                    break;
                }
                jyVar.write(bArrB, 0, r3);
            }
            byte[] byteArray = jyVar.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    qf.c("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f5528c.a(bArrB);
            jyVar.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    qf.c("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f5528c.a(null);
            jyVar.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    @Override // com.google.android.gms.internal.ads.ey2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.fz2 a(com.google.android.gms.internal.ads.b<?> r22) throws com.google.android.gms.internal.ads.pd, java.io.IOException {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uj.a(com.google.android.gms.internal.ads.b):com.google.android.gms.internal.ads.fz2");
    }
}
