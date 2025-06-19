package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
class b22 implements tz1<pz1> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f2783a = Logger.getLogger(b22.class.getName());

    static class a implements pz1 {

        /* renamed from: a, reason: collision with root package name */
        private final rz1<pz1> f2784a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f2785b;

        private a(rz1<pz1> rz1Var) {
            this.f2785b = new byte[]{0};
            this.f2784a = rz1Var;
        }

        @Override // com.google.android.gms.internal.ads.pz1
        public final byte[] a(byte[] bArr) throws GeneralSecurityException {
            return this.f2784a.e().c().equals(d52.LEGACY) ? u52.c(this.f2784a.e().d(), this.f2784a.e().a().a(u52.c(bArr, this.f2785b))) : u52.c(this.f2784a.e().d(), this.f2784a.e().a().a(bArr));
        }
    }

    b22() {
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final Class<pz1> a() {
        return pz1.class;
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final /* synthetic */ pz1 b(rz1<pz1> rz1Var) throws GeneralSecurityException {
        return new a(rz1Var);
    }
}
