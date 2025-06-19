package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class jf implements com.google.android.gms.ads.mediation.e<com.google.android.gms.ads.mediation.n, com.google.android.gms.ads.mediation.o> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ re f3951a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ wc f3952b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ hf f3953c;

    jf(hf hfVar, re reVar, wc wcVar) {
        this.f3953c = hfVar;
        this.f3951a = reVar;
        this.f3952b = wcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.mediation.o b(com.google.android.gms.ads.mediation.n nVar) {
        if (nVar != null) {
            try {
                this.f3953c.f = nVar;
                this.f3951a.w1();
            } catch (RemoteException e) {
                tr.c("", e);
            }
            return new nf(this.f3952b);
        }
        tr.i("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.f3951a.w("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            tr.c("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void S(String str) {
        try {
            this.f3951a.w(str);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void T(com.google.android.gms.ads.a aVar) {
        try {
            this.f3951a.P(aVar.e());
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
