package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class c30 implements z6<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x20 f2917a;

    c30(x20 x20Var) {
        this.f2917a = x20Var;
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final void a(Object obj, Map<String, String> map) {
        if (this.f2917a.h(map)) {
            this.f2917a.f5922c.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.b30
                private final c30 d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.f2917a.d.s();
                }
            });
        }
    }
}
