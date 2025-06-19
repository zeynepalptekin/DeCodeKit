package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class la implements z6<cb> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ i52 f4228a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ u9 f4229b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ br f4230c;
    private final /* synthetic */ da d;

    la(da daVar, i52 i52Var, u9 u9Var, br brVar) {
        this.d = daVar;
        this.f4228a = i52Var;
        this.f4229b = u9Var;
        this.f4230c = brVar;
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(cb cbVar, Map map) {
        synchronized (this.d.f3097a) {
            tr.h("JS Engine is requesting an update");
            if (this.d.h == 0) {
                tr.h("Starting reload.");
                this.d.h = 2;
                this.d.c(this.f4228a);
            }
            this.f4229b.j("/requestReload", (z6) this.f4230c.a());
        }
    }
}
