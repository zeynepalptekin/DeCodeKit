package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class p9<ReferenceT> implements q9 {

    @androidx.annotation.u("this")
    private final Map<String, CopyOnWriteArrayList<z6<? super ReferenceT>>> d = new HashMap();
    private ReferenceT e;

    private final synchronized void T(final String str, final Map<String, String> map) {
        if (tr.a(2)) {
            String strValueOf = String.valueOf(str);
            oo.m(strValueOf.length() != 0 ? "Received GMSG: ".concat(strValueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                oo.m(sb.toString());
            }
        }
        CopyOnWriteArrayList<z6<? super ReferenceT>> copyOnWriteArrayList = this.d.get(str);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            if (((Boolean) qx2.e().c(e0.S4)).booleanValue() && com.google.android.gms.ads.internal.p.g().l() != null) {
                cs.f3023a.execute(new Runnable(str) { // from class: com.google.android.gms.internal.ads.r9
                    private final String d;

                    {
                        this.d = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        com.google.android.gms.ads.internal.p.g().l().f(this.d.substring(1));
                    }
                });
                return;
            }
            return;
        }
        Iterator<z6<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            final z6<? super ReferenceT> next = it.next();
            cs.e.execute(new Runnable(this, next, map) { // from class: com.google.android.gms.internal.ads.s9
                private final p9 d;
                private final z6 e;
                private final Map f;

                {
                    this.d = this;
                    this.e = next;
                    this.f = map;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.Q(this.e, this.f);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.q9
    public final boolean D(@androidx.annotation.i0 String str) {
        return str != null && g0(Uri.parse(str));
    }

    public final synchronized void F(String str, com.google.android.gms.common.util.w<z6<? super ReferenceT>> wVar) {
        CopyOnWriteArrayList<z6<? super ReferenceT>> copyOnWriteArrayList = this.d.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            z6<? super ReferenceT> z6Var = (z6) it.next();
            if (wVar.a(z6Var)) {
                arrayList.add(z6Var);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    public final synchronized void K() {
        this.d.clear();
    }

    final /* synthetic */ void Q(z6 z6Var, Map map) {
        z6Var.a(this.e, map);
    }

    public final void U(ReferenceT referencet) {
        this.e = referencet;
    }

    public final boolean g0(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        v0(uri);
        return true;
    }

    public final synchronized void j(String str, z6<? super ReferenceT> z6Var) {
        CopyOnWriteArrayList<z6<? super ReferenceT>> copyOnWriteArrayList = this.d.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(z6Var);
    }

    public final synchronized void o(String str, z6<? super ReferenceT> z6Var) {
        CopyOnWriteArrayList<z6<? super ReferenceT>> copyOnWriteArrayList = this.d.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.d.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(z6Var);
    }

    public final void v0(Uri uri) {
        String path = uri.getPath();
        com.google.android.gms.ads.internal.p.c();
        T(path, to.d0(uri));
    }
}
