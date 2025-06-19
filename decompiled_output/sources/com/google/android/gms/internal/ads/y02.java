package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class y02 extends lz1<wy1, z42> {
    y02(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.lz1
    public final /* synthetic */ wy1 a(z42 z42Var) throws GeneralSecurityException {
        z42 z42Var2 = z42Var;
        String strH = z42Var2.M().H();
        return new w02(z42Var2.M().I(), mz1.a(strH).b(strH));
    }
}
