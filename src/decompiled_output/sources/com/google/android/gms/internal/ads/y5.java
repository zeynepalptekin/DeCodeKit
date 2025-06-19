package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class y5 extends y4 {
    private final com.google.android.gms.ads.d0.l e;

    public y5(com.google.android.gms.ads.d0.l lVar) {
        this.e = lVar;
    }

    @Override // com.google.android.gms.internal.ads.z4
    public final void E7(hy2 hy2Var, c.a.b.b.e.c cVar) {
        if (hy2Var == null || cVar == null) {
            return;
        }
        com.google.android.gms.ads.c0.e eVar = new com.google.android.gms.ads.c0.e((Context) c.a.b.b.e.e.e2(cVar));
        try {
            if (hy2Var.z5() instanceof fw2) {
                fw2 fw2Var = (fw2) hy2Var.z5();
                eVar.setAdListener(fw2Var != null ? fw2Var.y8() : null);
            }
        } catch (RemoteException e) {
            tr.c("", e);
        }
        try {
            if (hy2Var.A3() instanceof ww2) {
                ww2 ww2Var = (ww2) hy2Var.A3();
                eVar.setAppEventListener(ww2Var != null ? ww2Var.z8() : null);
            }
        } catch (RemoteException e2) {
            tr.c("", e2);
        }
        jr.f4014b.post(new x5(this, eVar, hy2Var));
    }
}
