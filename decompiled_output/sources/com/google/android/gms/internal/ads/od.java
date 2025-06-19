package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class od implements com.google.android.gms.ads.mediation.e<com.google.android.gms.ads.mediation.u, com.google.android.gms.ads.mediation.v> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ wc f4678a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ md f4679b;

    od(md mdVar, wc wcVar) {
        this.f4679b = mdVar;
        this.f4678a = wcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.mediation.v b(com.google.android.gms.ads.mediation.u uVar) {
        try {
            this.f4679b.i = uVar;
            this.f4678a.u();
        } catch (RemoteException e) {
            tr.c("", e);
        }
        return new rl(this.f4678a);
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void S(String str) {
        try {
            String canonicalName = this.f4679b.e.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            tr.f(sb.toString());
            this.f4678a.l6(0, str);
            this.f4678a.E(0);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void T(com.google.android.gms.ads.a aVar) {
        try {
            String canonicalName = this.f4679b.e.getClass().getCanonicalName();
            int r1 = aVar.b();
            String strD = aVar.d();
            String strC = aVar.c();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 87 + String.valueOf(strD).length() + String.valueOf(strC).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ErrorCode = ");
            sb.append(r1);
            sb.append(". ErrorMessage = ");
            sb.append(strD);
            sb.append(". ErrorDomain = ");
            sb.append(strC);
            tr.f(sb.toString());
            this.f4678a.q1(aVar.e());
            this.f4678a.l6(aVar.b(), aVar.d());
            this.f4678a.E(aVar.b());
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
