package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class na implements z6<cb> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ za f4510a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ u9 f4511b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ da f4512c;

    na(da daVar, za zaVar, u9 u9Var) {
        this.f4512c = daVar;
        this.f4510a = zaVar;
        this.f4511b = u9Var;
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(cb cbVar, Map map) {
        synchronized (this.f4512c.f3097a) {
            if (this.f4510a.a() != -1 && this.f4510a.a() != 1) {
                this.f4512c.h = 0;
                this.f4512c.e.a(this.f4511b);
                this.f4510a.e(this.f4511b);
                this.f4512c.g = this.f4510a;
                oo.m("Successfully loaded JS Engine.");
            }
        }
    }
}
