package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zq extends ko {
    private final xr d;
    private final String e;

    public zq(Context context, String str, String str2) {
        this(str2, com.google.android.gms.ads.internal.p.c().m0(context, str));
    }

    private zq(String str, String str2) {
        this.d = new xr(str2);
        this.e = str;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final void b() {
        this.d.a(this.e);
    }
}
