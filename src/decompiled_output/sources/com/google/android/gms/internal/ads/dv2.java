package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class dv2 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3181a;

    /* renamed from: b, reason: collision with root package name */
    private int f3182b;

    /* renamed from: c, reason: collision with root package name */
    private int f3183c;
    private final /* synthetic */ yu2 d;

    private dv2(yu2 yu2Var, byte[] bArr) {
        this.d = yu2Var;
        this.f3181a = bArr;
    }

    public final dv2 a(int r1) {
        this.f3182b = r1;
        return this;
    }

    public final dv2 b(int r1) {
        this.f3183c = r1;
        return this;
    }

    public final synchronized void c() {
        try {
            if (this.d.f6183b) {
                this.d.f6182a.h2(this.f3181a);
                this.d.f6182a.F5(this.f3182b);
                this.d.f6182a.i7(this.f3183c);
                this.d.f6182a.Q6(null);
                this.d.f6182a.V7();
            }
        } catch (RemoteException e) {
            tr.b("Clearcut log failed", e);
        }
    }
}
