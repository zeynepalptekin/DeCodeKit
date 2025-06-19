package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class gf implements com.google.android.gms.ads.mediation.e<com.google.android.gms.ads.mediation.h, com.google.android.gms.ads.mediation.i> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ le f3529a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ wc f3530b;

    gf(hf hfVar, le leVar, wc wcVar) {
        this.f3529a = leVar;
        this.f3530b = wcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.mediation.i b(com.google.android.gms.ads.mediation.h hVar) {
        if (hVar != null) {
            try {
                this.f3529a.w7(c.a.b.b.e.e.i2(hVar.getView()));
            } catch (RemoteException e) {
                tr.c("", e);
            }
            return new nf(this.f3530b);
        }
        tr.i("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f3529a.w("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            tr.c("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void S(String str) {
        try {
            this.f3529a.w(str);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void T(com.google.android.gms.ads.a aVar) {
        try {
            this.f3529a.P(aVar.e());
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
