package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class vo2 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<b<?>>> f5715a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final tm2 f5716b;

    vo2(tm2 tm2Var) {
        this.f5716b = tm2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean d(b<?> bVar) {
        String strA = bVar.A();
        if (!this.f5715a.containsKey(strA)) {
            this.f5715a.put(strA, null);
            bVar.o(this);
            if (qf.f4995b) {
                qf.a("new request, sending to network %s", strA);
            }
            return false;
        }
        List<b<?>> arrayList = this.f5715a.get(strA);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        bVar.s("waiting-for-response");
        arrayList.add(bVar);
        this.f5715a.put(strA, arrayList);
        if (qf.f4995b) {
            qf.a("Request for cacheKey=%s is in flight, putting on hold.", strA);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.d1
    public final void a(b<?> bVar, k8<?> k8Var) {
        List<b<?>> listRemove;
        un2 un2Var = k8Var.f4063b;
        if (un2Var == null || un2Var.a()) {
            b(bVar);
            return;
        }
        String strA = bVar.A();
        synchronized (this) {
            listRemove = this.f5715a.remove(strA);
        }
        if (listRemove != null) {
            if (qf.f4995b) {
                qf.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), strA);
            }
            Iterator<b<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.f5716b.g.b(it.next(), k8Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d1
    public final synchronized void b(b<?> bVar) {
        String strA = bVar.A();
        List<b<?>> listRemove = this.f5715a.remove(strA);
        if (listRemove != null && !listRemove.isEmpty()) {
            if (qf.f4995b) {
                qf.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), strA);
            }
            b<?> bVarRemove = listRemove.remove(0);
            this.f5715a.put(strA, listRemove);
            bVarRemove.o(this);
            try {
                this.f5716b.e.put(bVarRemove);
            } catch (InterruptedException e) {
                qf.b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.f5716b.b();
            }
        }
    }
}
