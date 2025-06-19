package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class gk implements com.google.android.gms.ads.k0.b {

    /* renamed from: a, reason: collision with root package name */
    private final qj f3550a;

    public gk(qj qjVar) {
        this.f3550a = qjVar;
    }

    @Override // com.google.android.gms.ads.k0.b
    public final int R() {
        qj qjVar = this.f3550a;
        if (qjVar == null) {
            return 0;
        }
        try {
            return qjVar.R();
        } catch (RemoteException e) {
            tr.d("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.k0.b
    public final String q() {
        qj qjVar = this.f3550a;
        if (qjVar == null) {
            return null;
        }
        try {
            return qjVar.q();
        } catch (RemoteException e) {
            tr.d("Could not forward getType to RewardItem", e);
            return null;
        }
    }
}
