package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class za1 implements ff1<Object> {
    private static final Object f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f6240a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6241b;

    /* renamed from: c, reason: collision with root package name */
    private final s80 f6242c;
    private final ao1 d;
    private final an1 e;

    public za1(String str, String str2, s80 s80Var, ao1 ao1Var, an1 an1Var) {
        this.f6240a = str;
        this.f6241b = str2;
        this.f6242c = s80Var;
        this.d = ao1Var;
        this.e = an1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<Object> a() {
        final Bundle bundle = new Bundle();
        if (((Boolean) qx2.e().c(e0.M3)).booleanValue()) {
            this.f6242c.a(this.e.d);
            bundle.putAll(this.d.b());
        }
        return qx1.g(new cf1(this, bundle) { // from class: com.google.android.gms.internal.ads.ya1

            /* renamed from: a, reason: collision with root package name */
            private final za1 f6113a;

            /* renamed from: b, reason: collision with root package name */
            private final Bundle f6114b;

            {
                this.f6113a = this;
                this.f6114b = bundle;
            }

            @Override // com.google.android.gms.internal.ads.cf1
            public final void b(Object obj) {
                this.f6113a.b(this.f6114b, (Bundle) obj);
            }
        });
    }

    final /* synthetic */ void b(Bundle bundle, Bundle bundle2) {
        if (((Boolean) qx2.e().c(e0.M3)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) qx2.e().c(e0.L3)).booleanValue()) {
                synchronized (f) {
                    this.f6242c.a(this.e.d);
                    bundle2.putBundle("quality_signals", this.d.b());
                }
            } else {
                this.f6242c.a(this.e.d);
                bundle2.putBundle("quality_signals", this.d.b());
            }
        }
        bundle2.putString("seq_num", this.f6240a);
        bundle2.putString("session_id", this.f6241b);
    }
}
