package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class kf implements com.google.android.gms.ads.mediation.e<com.google.android.gms.ads.mediation.u, com.google.android.gms.ads.mediation.v> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ xe f4082a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ wc f4083b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ hf f4084c;

    kf(hf hfVar, xe xeVar, wc wcVar) {
        this.f4084c = hfVar;
        this.f4082a = xeVar;
        this.f4083b = wcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.mediation.v b(com.google.android.gms.ads.mediation.u uVar) {
        if (uVar != null) {
            try {
                this.f4084c.g = uVar;
                this.f4082a.w1();
            } catch (RemoteException e) {
                tr.c("", e);
            }
            return new nf(this.f4083b);
        }
        tr.i("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f4082a.w("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            tr.c("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void S(String str) {
        try {
            this.f4082a.w(str);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void T(com.google.android.gms.ads.a aVar) {
        try {
            this.f4082a.P(aVar.e());
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
