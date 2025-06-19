package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.a.a;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    Set<String> f6896a;

    /* renamed from: b, reason: collision with root package name */
    private a.b f6897b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.gms.measurement.c.a f6898c;
    private d d;

    public e(com.google.android.gms.measurement.c.a aVar, a.b bVar) {
        this.f6897b = bVar;
        this.f6898c = aVar;
        d dVar = new d(this);
        this.d = dVar;
        this.f6898c.s(dVar);
        this.f6896a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final a.b a() {
        return this.f6897b;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void b() {
        this.f6896a.clear();
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void c(Set<String> set) {
        this.f6896a.clear();
        Set<String> set2 = this.f6896a;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            } else if (b.k(str) && b.j(str)) {
                hashSet.add(b.m(str));
            }
        }
        set2.addAll(hashSet);
    }
}
