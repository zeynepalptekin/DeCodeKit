package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class il implements com.google.android.gms.ads.l0.b {

    /* renamed from: b, reason: collision with root package name */
    private final sk f3832b;

    public il(sk skVar) {
        this.f3832b = skVar;
    }

    @Override // com.google.android.gms.ads.l0.b
    public final int R() {
        sk skVar = this.f3832b;
        if (skVar == null) {
            return 0;
        }
        try {
            return skVar.R();
        } catch (RemoteException e) {
            tr.d("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.l0.b
    public final String q() {
        sk skVar = this.f3832b;
        if (skVar == null) {
            return null;
        }
        try {
            return skVar.q();
        } catch (RemoteException e) {
            tr.d("Could not forward getType to RewardItem", e);
            return null;
        }
    }
}
