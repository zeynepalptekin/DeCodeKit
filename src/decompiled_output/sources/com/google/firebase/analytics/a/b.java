package com.google.firebase.analytics.a;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.y0;
import c.a.b.b.g.c.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d0;
import com.google.firebase.analytics.a.a;
import com.google.firebase.analytics.connector.internal.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b implements com.google.firebase.analytics.a.a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile com.google.firebase.analytics.a.a f6884c;

    /* renamed from: a, reason: collision with root package name */
    @d0
    private final com.google.android.gms.measurement.c.a f6885a;

    /* renamed from: b, reason: collision with root package name */
    @d0
    final Map<String, com.google.firebase.analytics.connector.internal.a> f6886b;

    class a implements a.InterfaceC0206a {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ String f6887a;

        a(String str) {
            this.f6887a = str;
        }

        @Override // com.google.firebase.analytics.a.a.InterfaceC0206a
        public void a() {
            if (b.this.j(this.f6887a)) {
                a.b bVarA = b.this.f6886b.get(this.f6887a).a();
                if (bVarA != null) {
                    bVarA.a(0, null);
                }
                b.this.f6886b.remove(this.f6887a);
            }
        }

        @Override // com.google.firebase.analytics.a.a.InterfaceC0206a
        @com.google.android.gms.common.annotation.a
        public void b() {
            if (b.this.j(this.f6887a) && this.f6887a.equals("fiam")) {
                b.this.f6886b.get(this.f6887a).b();
            }
        }

        @Override // com.google.firebase.analytics.a.a.InterfaceC0206a
        @com.google.android.gms.common.annotation.a
        public void c(Set<String> set) {
            if (!b.this.j(this.f6887a) || !this.f6887a.equals("fiam") || set == null || set.isEmpty()) {
                return;
            }
            b.this.f6886b.get(this.f6887a).c(set);
        }
    }

    private b(com.google.android.gms.measurement.c.a aVar) {
        r.k(aVar);
        this.f6885a = aVar;
        this.f6886b = new ConcurrentHashMap();
    }

    @com.google.android.gms.common.annotation.a
    public static com.google.firebase.analytics.a.a e() {
        return f(c.a.d.e.n());
    }

    @com.google.android.gms.common.annotation.a
    public static com.google.firebase.analytics.a.a f(c.a.d.e eVar) {
        return (com.google.firebase.analytics.a.a) eVar.j(com.google.firebase.analytics.a.a.class);
    }

    @o0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @com.google.android.gms.common.annotation.a
    public static com.google.firebase.analytics.a.a g(c.a.d.e eVar, Context context, c.a.d.o.d dVar) {
        r.k(eVar);
        r.k(context);
        r.k(dVar);
        r.k(context.getApplicationContext());
        if (f6884c == null) {
            synchronized (b.class) {
                if (f6884c == null) {
                    Bundle bundle = new Bundle(1);
                    if (eVar.y()) {
                        dVar.b(c.a.d.b.class, d.d, e.f6889a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", eVar.x());
                    }
                    f6884c = new b(h.c(context, null, null, null, bundle).f());
                }
            }
        }
        return f6884c;
    }

    static final /* synthetic */ void h(c.a.d.o.a aVar) {
        boolean z = ((c.a.d.b) aVar.a()).f2170a;
        synchronized (b.class) {
            ((b) f6884c).f6885a.B(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(@h0 String str) {
        return (str.isEmpty() || !this.f6886b.containsKey(str) || this.f6886b.get(str) == null) ? false : true;
    }

    @Override // com.google.firebase.analytics.a.a
    @y0
    @com.google.android.gms.common.annotation.a
    public int E1(@q0(min = 1) @h0 String str) {
        return this.f6885a.m(str);
    }

    @Override // com.google.firebase.analytics.a.a
    @y0
    @com.google.android.gms.common.annotation.a
    public List<a.c> X0(@h0 String str, @i0 @q0(max = 23, min = 1) String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Bundle> it = this.f6885a.g(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.analytics.connector.internal.b.a(it.next()));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.a.a
    @y0
    @com.google.android.gms.common.annotation.a
    public Map<String, Object> a(boolean z) {
        return this.f6885a.n(null, null, z);
    }

    @Override // com.google.firebase.analytics.a.a
    @com.google.android.gms.common.annotation.a
    public void b(@h0 a.c cVar) {
        if (com.google.firebase.analytics.connector.internal.b.b(cVar)) {
            this.f6885a.t(com.google.firebase.analytics.connector.internal.b.g(cVar));
        }
    }

    @Override // com.google.firebase.analytics.a.a
    @com.google.android.gms.common.annotation.a
    public void c(@h0 String str, @h0 String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.c(str) && com.google.firebase.analytics.connector.internal.b.e(str, str2)) {
            this.f6885a.z(str, str2, obj);
        }
    }

    @Override // com.google.firebase.analytics.a.a
    @com.google.android.gms.common.annotation.a
    public void clearConditionalUserProperty(@q0(max = 24, min = 1) @h0 String str, @i0 String str2, @i0 Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.d(str2, bundle)) {
            this.f6885a.b(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.a.a
    @y0
    @com.google.android.gms.common.annotation.a
    public a.InterfaceC0206a d(@h0 String str, a.b bVar) {
        r.k(bVar);
        if (!com.google.firebase.analytics.connector.internal.b.c(str) || j(str)) {
            return null;
        }
        com.google.android.gms.measurement.c.a aVar = this.f6885a;
        com.google.firebase.analytics.connector.internal.a eVar = "fiam".equals(str) ? new com.google.firebase.analytics.connector.internal.e(aVar, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new g(aVar, bVar) : null;
        if (eVar == null) {
            return null;
        }
        this.f6886b.put(str, eVar);
        return new a(str);
    }

    @Override // com.google.firebase.analytics.a.a
    @com.google.android.gms.common.annotation.a
    public void y1(@h0 String str, @h0 String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.c(str) && com.google.firebase.analytics.connector.internal.b.d(str2, bundle) && com.google.firebase.analytics.connector.internal.b.f(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.h(str, str2, bundle);
            this.f6885a.o(str, str2, bundle);
        }
    }
}
