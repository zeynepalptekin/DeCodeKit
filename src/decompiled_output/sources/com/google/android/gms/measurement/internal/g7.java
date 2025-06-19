package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* loaded from: classes.dex */
final class g7 implements Runnable {
    private final /* synthetic */ boolean d;
    private final /* synthetic */ Uri e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ h7 h;

    g7(h7 h7Var, boolean z, Uri uri, String str, String str2) {
        this.h = h7Var;
        this.d = z;
        this.e = uri;
        this.f = str;
        this.g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.b(this.d, this.e, this.f, this.g);
    }
}
