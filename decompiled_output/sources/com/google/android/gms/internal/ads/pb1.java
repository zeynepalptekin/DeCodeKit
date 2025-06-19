package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class pb1 implements ff1<cf1<Bundle>> {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    private final sj1 f4794a;

    pb1(@androidx.annotation.i0 sj1 sj1Var) {
        this.f4794a = sj1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<cf1<Bundle>> a() {
        sj1 sj1Var = this.f4794a;
        return qx1.g((sj1Var == null || sj1Var.a() == null || this.f4794a.a().isEmpty()) ? null : new cf1(this) { // from class: com.google.android.gms.internal.ads.sb1

            /* renamed from: a, reason: collision with root package name */
            private final pb1 f5240a;

            {
                this.f5240a = this;
            }

            @Override // com.google.android.gms.internal.ads.cf1
            public final void b(Object obj) {
                this.f5240a.b((Bundle) obj);
            }
        });
    }

    final /* synthetic */ void b(Bundle bundle) {
        bundle.putString("key_schema", this.f4794a.a());
    }
}
