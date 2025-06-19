package com.google.firebase.installations;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements com.google.firebase.components.j {
    static /* synthetic */ j lambda$getComponents$0(com.google.firebase.components.g gVar) {
        return new i((c.a.d.e) gVar.a(c.a.d.e.class), (c.a.d.w.h) gVar.a(c.a.d.w.h.class), (c.a.d.r.c) gVar.a(c.a.d.r.c.class));
    }

    @Override // com.google.firebase.components.j
    public List<com.google.firebase.components.f<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.f.a(j.class).b(com.google.firebase.components.p.g(c.a.d.e.class)).b(com.google.firebase.components.p.g(c.a.d.r.c.class)).b(com.google.firebase.components.p.g(c.a.d.w.h.class)).f(l.b()).d(), c.a.d.w.g.a("fire-installations", c.f));
    }
}
