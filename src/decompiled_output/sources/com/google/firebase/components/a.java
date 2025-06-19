package com.google.firebase.components;

import java.util.Set;

/* loaded from: classes.dex */
abstract class a implements g {
    a() {
    }

    @Override // com.google.firebase.components.g
    public <T> T a(Class<T> cls) {
        c.a.d.s.a<T> aVarC = c(cls);
        if (aVarC == null) {
            return null;
        }
        return aVarC.get();
    }

    @Override // com.google.firebase.components.g
    public <T> Set<T> b(Class<T> cls) {
        return d(cls).get();
    }
}
