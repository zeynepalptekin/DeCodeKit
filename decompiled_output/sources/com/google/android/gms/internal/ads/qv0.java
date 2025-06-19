package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
import org.json.JSONException;

/* loaded from: classes.dex */
final class qv0 implements rx1<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iv0 f5065a;

    qv0(iv0 iv0Var) {
        this.f5065a = iv0Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        synchronized (this) {
            iv0.i(this.f5065a, true);
            this.f5065a.h("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.p.j().c() - this.f5065a.f3876c));
            this.f5065a.d.b(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(@Nullable String str) {
        final String str2 = str;
        synchronized (this) {
            iv0.i(this.f5065a, true);
            this.f5065a.h("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.p.j().c() - this.f5065a.f3876c));
            this.f5065a.h.execute(new Runnable(this, str2) { // from class: com.google.android.gms.internal.ads.tv0
                private final qv0 d;
                private final String e;

                {
                    this.d = this;
                    this.e = str2;
                }

                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    qv0 qv0Var = this.d;
                    qv0Var.f5065a.u(this.e);
                }
            });
        }
    }
}
