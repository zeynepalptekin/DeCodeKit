package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.if, reason: invalid class name */
/* loaded from: classes.dex */
final class Cif implements com.google.android.gms.ads.mediation.e<com.google.android.gms.ads.mediation.e0, com.google.android.gms.ads.mediation.r> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ se f3813a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ wc f3814b;

    Cif(hf hfVar, se seVar, wc wcVar) {
        this.f3813a = seVar;
        this.f3814b = wcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.mediation.r b(com.google.android.gms.ads.mediation.e0 e0Var) {
        if (e0Var != null) {
            try {
                this.f3813a.f8(new me(e0Var));
            } catch (RemoteException e) {
                tr.c("", e);
            }
            return new nf(this.f3814b);
        }
        tr.i("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f3813a.w("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            tr.c("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void S(String str) {
        try {
            this.f3813a.w(str);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void T(com.google.android.gms.ads.a aVar) {
        try {
            this.f3813a.P(aVar.e());
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
