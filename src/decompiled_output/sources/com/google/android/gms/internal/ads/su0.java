package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class su0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.u("this")
    private List<Map<String, String>> f5308a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.u("this")
    private boolean f5309b = false;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.u("this")
    private boolean f5310c = false;
    private String d;
    private mu0 e;

    public su0(String str, mu0 mu0Var) {
        this.d = str;
        this.e = mu0Var;
    }

    private final Map<String, String> c() {
        Map<String, String> mapA = this.e.a();
        mapA.put("tms", Long.toString(com.google.android.gms.ads.internal.p.j().c(), 10));
        mapA.put("tid", this.d);
        return mapA;
    }

    public final synchronized void a() {
        if (((Boolean) qx2.e().c(e0.u1)).booleanValue()) {
            if (!this.f5309b) {
                Map<String, String> mapC = c();
                mapC.put("action", "init_started");
                this.f5308a.add(mapC);
                this.f5309b = true;
            }
        }
    }

    public final synchronized void b() {
        if (((Boolean) qx2.e().c(e0.u1)).booleanValue()) {
            if (!this.f5310c) {
                Map<String, String> mapC = c();
                mapC.put("action", "init_finished");
                this.f5308a.add(mapC);
                Iterator<Map<String, String>> it = this.f5308a.iterator();
                while (it.hasNext()) {
                    this.e.d(it.next());
                }
                this.f5310c = true;
            }
        }
    }

    public final synchronized void d(String str) {
        if (((Boolean) qx2.e().c(e0.u1)).booleanValue()) {
            Map<String, String> mapC = c();
            mapC.put("action", "adapter_init_started");
            mapC.put("ancn", str);
            this.f5308a.add(mapC);
        }
    }

    public final synchronized void e(String str) {
        if (((Boolean) qx2.e().c(e0.u1)).booleanValue()) {
            Map<String, String> mapC = c();
            mapC.put("action", "adapter_init_finished");
            mapC.put("ancn", str);
            this.f5308a.add(mapC);
        }
    }

    public final synchronized void f(String str, String str2) {
        if (((Boolean) qx2.e().c(e0.u1)).booleanValue()) {
            Map<String, String> mapC = c();
            mapC.put("action", "adapter_init_finished");
            mapC.put("ancn", str);
            mapC.put("rqe", str2);
            this.f5308a.add(mapC);
        }
    }
}
