package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class v2 extends j3 {
    private final Drawable e;
    private final Uri f;
    private final double g;
    private final int h;
    private final int i;

    public v2(Drawable drawable, Uri uri, double d, int r5, int r6) {
        this.e = drawable;
        this.f = uri;
        this.g = d;
        this.h = r5;
        this.i = r6;
    }

    @Override // com.google.android.gms.internal.ads.k3
    public final c.a.b.b.e.c J6() throws RemoteException {
        return c.a.b.b.e.e.i2(this.e);
    }

    @Override // com.google.android.gms.internal.ads.k3
    public final double Q1() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.k3
    public final int getHeight() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.k3
    public final int getWidth() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.k3
    public final Uri s1() throws RemoteException {
        return this.f;
    }
}
