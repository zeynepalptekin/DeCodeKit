package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class pf0<ListenerT> {

    @GuardedBy("this")
    private final Map<ListenerT, Executor> d = new HashMap();

    protected pf0(Set<ch0<ListenerT>> set) {
        G0(set);
    }

    private final synchronized void G0(Set<ch0<ListenerT>> set) {
        Iterator<ch0<ListenerT>> it = set.iterator();
        while (it.hasNext()) {
            D0(it.next());
        }
    }

    protected final synchronized void A0(final rf0<ListenerT> rf0Var) {
        for (Map.Entry<ListenerT, Executor> entry : this.d.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable(rf0Var, key) { // from class: com.google.android.gms.internal.ads.of0
                private final rf0 d;
                private final Object e;

                {
                    this.d = rf0Var;
                    this.e = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.d.a(this.e);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.p.g().h(th, "EventEmitter.notify");
                        oo.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    public final synchronized void D0(ch0<ListenerT> ch0Var) {
        F0(ch0Var.f2971a, ch0Var.f2972b);
    }

    public final synchronized void F0(ListenerT listenert, Executor executor) {
        this.d.put(listenert, executor);
    }
}
