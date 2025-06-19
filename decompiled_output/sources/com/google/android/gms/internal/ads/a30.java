package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class a30 implements z6<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x20 f2622a;

    a30(x20 x20Var) {
        this.f2622a = x20Var;
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final void a(Object obj, Map<String, String> map) {
        if (this.f2622a.h(map)) {
            this.f2622a.f5922c.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.z20
                private final a30 d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.f2622a.d.i();
                }
            });
        }
    }
}
