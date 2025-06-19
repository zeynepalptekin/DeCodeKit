package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* loaded from: classes.dex */
public final class nd implements com.google.android.gms.ads.mediation.f {
    private final Date d;
    private final int e;
    private final Set<String> f;
    private final boolean g;
    private final Location h;
    private final int i;
    private final boolean j;
    private final int k;
    private final String l;

    public nd(@androidx.annotation.i0 Date date, int r2, @androidx.annotation.i0 Set<String> set, @androidx.annotation.i0 Location location, boolean z, int r6, boolean z2, int r8, String str) {
        this.d = date;
        this.e = r2;
        this.f = set;
        this.h = location;
        this.g = z;
        this.i = r6;
        this.j = z2;
        this.k = r8;
        this.l = str;
    }

    @Override // com.google.android.gms.ads.mediation.f
    @Deprecated
    public final boolean a() {
        return this.j;
    }

    @Override // com.google.android.gms.ads.mediation.f
    @Deprecated
    public final Date d() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final boolean e() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final Set<String> f() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final int i() {
        return this.i;
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final Location l() {
        return this.h;
    }

    @Override // com.google.android.gms.ads.mediation.f
    @Deprecated
    public final int n() {
        return this.e;
    }
}
