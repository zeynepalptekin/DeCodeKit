package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final /* synthetic */ class z91 implements ax1 {

    /* renamed from: a, reason: collision with root package name */
    static final ax1 f6237a = new z91();

    private z91() {
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public final dy1 a(Object obj) {
        final String str = (String) obj;
        return qx1.g(new cf1(str) { // from class: com.google.android.gms.internal.ads.ca1

            /* renamed from: a, reason: collision with root package name */
            private final String f2952a;

            {
                this.f2952a = str;
            }

            @Override // com.google.android.gms.internal.ads.cf1
            public final void b(Object obj2) {
                ((Bundle) obj2).putString("ms", this.f2952a);
            }
        });
    }
}
