package com.google.firebase.components;

import java.util.Set;

/* loaded from: classes.dex */
final /* synthetic */ class l implements c.a.d.s.a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f6922a;

    private l(Set set) {
        this.f6922a = set;
    }

    public static c.a.d.s.a a(Set set) {
        return new l(set);
    }

    @Override // c.a.d.s.a
    public Object get() {
        return n.g(this.f6922a);
    }
}
