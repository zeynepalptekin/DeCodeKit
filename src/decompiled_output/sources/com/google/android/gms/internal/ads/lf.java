package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class lf implements com.google.android.gms.ads.mediation.rtb.b {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ df f4250a;

    lf(hf hfVar, df dfVar) {
        this.f4250a = dfVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.b
    public final void S(String str) {
        try {
            this.f4250a.S(str);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.b
    public final void T(com.google.android.gms.ads.a aVar) {
        try {
            this.f4250a.g5(aVar.e());
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.b
    public final void a(String str) {
        try {
            this.f4250a.O4(str);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
