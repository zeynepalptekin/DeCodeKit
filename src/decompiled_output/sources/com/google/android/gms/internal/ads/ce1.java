package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class ce1 implements ff1<cf1<Bundle>> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2960a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2961b;

    ce1(Context context, @androidx.annotation.i0 String str) {
        this.f2960a = context;
        this.f2961b = str;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<cf1<Bundle>> a() {
        return qx1.g(this.f2961b == null ? null : new cf1(this) { // from class: com.google.android.gms.internal.ads.be1

            /* renamed from: a, reason: collision with root package name */
            private final ce1 f2827a;

            {
                this.f2827a = this;
            }

            @Override // com.google.android.gms.internal.ads.cf1
            public final void b(Object obj) {
                this.f2827a.b((Bundle) obj);
            }
        });
    }

    final /* synthetic */ void b(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.f2960a.getPackageName());
    }
}
