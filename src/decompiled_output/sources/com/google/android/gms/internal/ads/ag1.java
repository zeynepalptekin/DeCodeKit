package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ag1 implements ff1<xf1> {

    /* renamed from: a, reason: collision with root package name */
    private final vn f2683a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f2684b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2685c;

    @androidx.annotation.i0
    private final PackageInfo d;

    public ag1(vn vnVar, Executor executor, String str, @androidx.annotation.i0 PackageInfo packageInfo) {
        this.f2683a = vnVar;
        this.f2684b = executor;
        this.f2685c = str;
        this.d = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<xf1> a() {
        return qx1.k(qx1.i(this.f2683a.c(this.f2685c, this.d), zf1.f6256a, this.f2684b), Throwable.class, new ax1(this) { // from class: com.google.android.gms.internal.ads.cg1

            /* renamed from: a, reason: collision with root package name */
            private final ag1 f2970a;

            {
                this.f2970a = this;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f2970a.b((Throwable) obj);
            }
        }, this.f2684b);
    }

    final /* synthetic */ dy1 b(Throwable th) throws Exception {
        return qx1.g(new xf1(this.f2685c));
    }
}
