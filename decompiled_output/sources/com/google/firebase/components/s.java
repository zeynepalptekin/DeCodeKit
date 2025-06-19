package com.google.firebase.components;

import java.util.Map;

/* loaded from: classes.dex */
final /* synthetic */ class s implements Runnable {
    private final Map.Entry d;
    private final c.a.d.o.a e;

    private s(Map.Entry entry, c.a.d.o.a aVar) {
        this.d = entry;
        this.e = aVar;
    }

    public static Runnable a(Map.Entry entry, c.a.d.o.a aVar) {
        return new s(entry, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((c.a.d.o.b) this.d.getKey()).a(this.e);
    }
}
