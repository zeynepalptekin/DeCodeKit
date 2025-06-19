package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class u12 extends jz1<a42> {
    public u12() {
        super(a42.class, new x12(pz1.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(f42 f42Var) throws GeneralSecurityException {
        if (f42Var.H() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int r0 = z12.f6211a[f42Var.I().ordinal()];
        if (r0 == 1) {
            if (f42Var.H() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (r0 == 2) {
            if (f42Var.H() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (r0 != 3) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (f42Var.H() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final j42.a d() {
        return j42.a.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final iz1<e42, a42> g() {
        return new w12(this, e42.class);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ void h(xa2 xa2Var) throws GeneralSecurityException {
        a42 a42Var = (a42) xa2Var;
        d72.b(a42Var.H(), 0);
        if (a42Var.M().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        j(a42Var.N());
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ xa2 i(a82 a82Var) throws w92 {
        return a42.T(a82Var, y82.b());
    }
}
