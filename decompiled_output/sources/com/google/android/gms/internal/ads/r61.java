package com.google.android.gms.internal.ads;

import android.view.View;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class r61 implements com.google.android.gms.ads.internal.g {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    private com.google.android.gms.ads.internal.g f5106a;

    @Override // com.google.android.gms.ads.internal.g
    public final synchronized void a() {
        if (this.f5106a != null) {
            this.f5106a.a();
        }
    }

    @Override // com.google.android.gms.ads.internal.g
    public final synchronized void b(View view) {
        if (this.f5106a != null) {
            this.f5106a.b(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.g
    public final synchronized void c() {
        if (this.f5106a != null) {
            this.f5106a.c();
        }
    }

    public final synchronized void d(com.google.android.gms.ads.internal.g gVar) {
        this.f5106a = gVar;
    }
}
