package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o91 implements ax1<wi, p91> {

    /* renamed from: a, reason: collision with root package name */
    private Executor f4657a;

    /* renamed from: b, reason: collision with root package name */
    private sw0 f4658b;

    public o91(Executor executor, sw0 sw0Var) {
        this.f4657a = executor;
        this.f4658b = sw0Var;
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public final /* synthetic */ dy1<p91> a(wi wiVar) throws Exception {
        final wi wiVar2 = wiVar;
        return qx1.j(this.f4658b.b(wiVar2), new ax1(wiVar2) { // from class: com.google.android.gms.internal.ads.n91

            /* renamed from: a, reason: collision with root package name */
            private final wi f4508a;

            {
                this.f4508a = wiVar2;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return qx1.g(new p91(new JsonReader(new InputStreamReader((InputStream) obj))).a(this.f4508a.d));
            }
        }, this.f4657a);
    }
}
