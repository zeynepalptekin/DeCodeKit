package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zp1 implements pe2<cy1> {
    public static zp1 a() {
        return yp1.f6161a;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        cy1 cy1Var;
        if (((Boolean) qx2.e().c(e0.P3)).booleanValue()) {
            cy1Var = cs.f3025c;
        } else {
            cy1Var = ((Boolean) qx2.e().c(e0.O3)).booleanValue() ? cs.f3023a : cs.e;
        }
        return (cy1) we2.b(cy1Var, "Cannot return null from a non-@Nullable @Provides method");
    }
}
