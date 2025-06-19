package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.d0.c;

/* loaded from: classes.dex */
public final class l3 extends c.b {

    /* renamed from: a, reason: collision with root package name */
    private final k3 f4188a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f4189b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f4190c;
    private final double d;
    private final int e;
    private final int f;

    public l3(k3 k3Var) {
        int width;
        c.a.b.b.e.c cVarJ6;
        this.f4188a = k3Var;
        Uri uriS1 = null;
        try {
            cVarJ6 = k3Var.J6();
        } catch (RemoteException e) {
            tr.c("", e);
        }
        Drawable drawable = cVarJ6 != null ? (Drawable) c.a.b.b.e.e.e2(cVarJ6) : null;
        this.f4189b = drawable;
        try {
            uriS1 = this.f4188a.s1();
        } catch (RemoteException e2) {
            tr.c("", e2);
        }
        this.f4190c = uriS1;
        double dQ1 = 1.0d;
        try {
            dQ1 = this.f4188a.Q1();
        } catch (RemoteException e3) {
            tr.c("", e3);
        }
        this.d = dQ1;
        int height = -1;
        try {
            width = this.f4188a.getWidth();
        } catch (RemoteException e4) {
            tr.c("", e4);
            width = -1;
        }
        this.e = width;
        try {
            height = this.f4188a.getHeight();
        } catch (RemoteException e5) {
            tr.c("", e5);
        }
        this.f = height;
    }

    @Override // com.google.android.gms.ads.d0.c.b
    public final Drawable a() {
        return this.f4189b;
    }

    @Override // com.google.android.gms.ads.d0.c.b
    public final int b() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.d0.c.b
    public final double c() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.d0.c.b
    public final Uri d() {
        return this.f4190c;
    }

    @Override // com.google.android.gms.ads.d0.c.b
    public final int e() {
        return this.e;
    }
}
