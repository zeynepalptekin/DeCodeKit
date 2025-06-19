package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class l12 implements tz1<az1> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f4179a = Logger.getLogger(l12.class.getName());

    static class a implements az1 {

        /* renamed from: a, reason: collision with root package name */
        private final rz1<az1> f4180a;

        public a(rz1<az1> rz1Var) {
            this.f4180a = rz1Var;
        }
    }

    l12() {
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final Class<az1> a() {
        return az1.class;
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final /* synthetic */ az1 b(rz1<az1> rz1Var) throws GeneralSecurityException {
        return new a(rz1Var);
    }
}
