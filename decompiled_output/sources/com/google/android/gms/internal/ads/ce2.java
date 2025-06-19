package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class ce2 extends he2 {

    /* renamed from: a, reason: collision with root package name */
    private Logger f2962a;

    public ce2(String str) {
        this.f2962a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.he2
    public final void a(String str) {
        this.f2962a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
