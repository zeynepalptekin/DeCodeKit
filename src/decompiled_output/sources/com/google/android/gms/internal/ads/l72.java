package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class l72 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<j72, List<Throwable>> f4212a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f4213b = new ReferenceQueue<>();

    l72() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> referencePoll = this.f4213b.poll();
            if (referencePoll == null) {
                break;
            }
            this.f4212a.remove(referencePoll);
        }
        List<Throwable> list = this.f4212a.get(new j72(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f4212a.putIfAbsent(new j72(th, this.f4213b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
