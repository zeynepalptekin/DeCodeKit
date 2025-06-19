package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class e02 implements tz1<wy1> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f3196a = Logger.getLogger(e02.class.getName());

    static class a implements wy1 {

        /* renamed from: a, reason: collision with root package name */
        private final rz1<wy1> f3197a;

        private a(rz1<wy1> rz1Var) {
            this.f3197a = rz1Var;
        }

        @Override // com.google.android.gms.internal.ads.wy1
        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return u52.c(this.f3197a.e().d(), this.f3197a.e().a().a(bArr, bArr2));
        }
    }

    e02() {
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final Class<wy1> a() {
        return wy1.class;
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final /* synthetic */ wy1 b(rz1<wy1> rz1Var) throws GeneralSecurityException {
        return new a(rz1Var);
    }
}
