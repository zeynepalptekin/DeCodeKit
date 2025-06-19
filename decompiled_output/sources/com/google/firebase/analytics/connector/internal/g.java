package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.a.a;
import java.util.Set;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private a.b f6900a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.measurement.c.a f6901b;

    /* renamed from: c, reason: collision with root package name */
    private f f6902c;

    public g(com.google.android.gms.measurement.c.a aVar, a.b bVar) {
        this.f6900a = bVar;
        this.f6901b = aVar;
        f fVar = new f(this);
        this.f6902c = fVar;
        this.f6901b.s(fVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final a.b a() {
        return this.f6900a;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void b() {
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void c(Set<String> set) {
    }
}
