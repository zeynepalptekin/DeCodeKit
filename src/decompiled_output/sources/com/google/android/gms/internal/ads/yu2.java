package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class yu2 {

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    lh2 f6182a;

    /* renamed from: b, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    boolean f6183b;

    public yu2() {
    }

    public yu2(Context context) {
        e0.a(context);
        if (((Boolean) qx2.e().c(e0.e3)).booleanValue()) {
            try {
                this.f6182a = (lh2) wr.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", av2.f2759a);
                c.a.b.b.e.e.i2(context);
                this.f6182a.K3(c.a.b.b.e.e.i2(context), "GMA_SDK");
                this.f6183b = true;
            } catch (RemoteException | yr | NullPointerException unused) {
                tr.f("Cannot dynamite load clearcut");
            }
        }
    }

    public yu2(Context context, String str, String str2) {
        e0.a(context);
        try {
            this.f6182a = (lh2) wr.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", xu2.f6043a);
            c.a.b.b.e.e.i2(context);
            this.f6182a.p8(c.a.b.b.e.e.i2(context), str, null);
            this.f6183b = true;
        } catch (RemoteException | yr | NullPointerException unused) {
            tr.f("Cannot dynamite load clearcut");
        }
    }

    public final dv2 a(byte[] bArr) {
        return new dv2(this, bArr);
    }
}
