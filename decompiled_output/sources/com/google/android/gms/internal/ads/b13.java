package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b13 extends az2 {
    private d8 e;

    @Override // com.google.android.gms.internal.ads.xy2
    public final void E0() throws RemoteException {
        tr.g("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        jr.f4014b.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.a13
            private final b13 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.y8();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void F6(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void G4(d8 d8Var) throws RemoteException {
        this.e = d8Var;
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void L4(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final float M2() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final boolean R7() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void S1(qc qcVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void T1(c.a.b.b.e.c cVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void b5(float f) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void c4() {
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final List<a8> g6() throws RemoteException {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final String i8() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void t7(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void u8(String str, c.a.b.b.e.c cVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void w2(g gVar) throws RemoteException {
    }

    final /* synthetic */ void y8() {
        d8 d8Var = this.e;
        if (d8Var != null) {
            try {
                d8Var.p1(Collections.emptyList());
            } catch (RemoteException e) {
                tr.d("Could not notify onComplete event.", e);
            }
        }
    }
}
