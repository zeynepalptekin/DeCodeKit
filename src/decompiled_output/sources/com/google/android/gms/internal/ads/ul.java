package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.internal.ads.jd2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ul implements im {
    private static List<Future<Void>> o = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("lock")
    private final jd2.b.a f5539a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    private final LinkedHashMap<String, jd2.b.h.C0184b> f5540b;
    private final Context e;
    private final km f;

    @androidx.annotation.x0
    private boolean g;
    private final dm h;
    private final jm i;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    private final List<String> f5541c = new ArrayList();

    @GuardedBy("lock")
    private final List<String> d = new ArrayList();
    private final Object j = new Object();
    private HashSet<String> k = new HashSet<>();
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;

    public ul(Context context, as asVar, dm dmVar, String str, km kmVar) {
        com.google.android.gms.common.internal.r.l(dmVar, "SafeBrowsing config is not present.");
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5540b = new LinkedHashMap<>();
        this.f = kmVar;
        this.h = dmVar;
        Iterator<String> it = dmVar.h.iterator();
        while (it.hasNext()) {
            this.k.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        this.k.remove("cookie".toLowerCase(Locale.ENGLISH));
        jd2.b.a aVarD0 = jd2.b.d0();
        aVarD0.z(jd2.b.g.OCTAGON_AD);
        aVarD0.J(str);
        aVarD0.K(str);
        jd2.b.C0180b.a aVarI = jd2.b.C0180b.I();
        String str2 = this.h.d;
        if (str2 != null) {
            aVarI.v(str2);
        }
        aVarD0.w((jd2.b.C0180b) ((l92) aVarI.P()));
        jd2.b.i.a aVarV = jd2.b.i.K().v(c.a.b.b.d.s.c.a(this.e).f());
        String str3 = asVar.d;
        if (str3 != null) {
            aVarV.x(str3);
        }
        long jB = c.a.b.b.d.f.i().b(this.e);
        if (jB > 0) {
            aVarV.w(jB);
        }
        aVarD0.C((jd2.b.i) ((l92) aVarV.P()));
        this.f5539a = aVarD0;
        this.i = new jm(this.e, this.h.k, this);
    }

    @androidx.annotation.i0
    private final jd2.b.h.C0184b l(String str) {
        jd2.b.h.C0184b c0184b;
        synchronized (this.j) {
            c0184b = this.f5540b.get(str);
        }
        return c0184b;
    }

    static final /* synthetic */ Void m(String str) {
        return null;
    }

    @androidx.annotation.x0
    private final dy1<Void> o() {
        dy1<Void> dy1VarI;
        if (!((this.g && this.h.j) || (this.n && this.h.i) || (!this.g && this.h.g))) {
            return qx1.g(null);
        }
        synchronized (this.j) {
            Iterator<jd2.b.h.C0184b> it = this.f5540b.values().iterator();
            while (it.hasNext()) {
                this.f5539a.A((jd2.b.h) ((l92) it.next().P()));
            }
            this.f5539a.M(this.f5541c);
            this.f5539a.N(this.d);
            if (fm.a()) {
                String strV = this.f5539a.v();
                String strF = this.f5539a.F();
                StringBuilder sb = new StringBuilder(String.valueOf(strV).length() + 53 + String.valueOf(strF).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(strV);
                sb.append("\n  clickUrl: ");
                sb.append(strF);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (jd2.b.h hVar : this.f5539a.D()) {
                    sb2.append("    [");
                    sb2.append(hVar.S());
                    sb2.append("] ");
                    sb2.append(hVar.H());
                }
                fm.b(sb2.toString());
            }
            dy1<String> dy1VarA = new iq(this.e).a(1, this.h.e, null, ((jd2.b) ((l92) this.f5539a.P())).f());
            if (fm.a()) {
                dy1VarA.e(am.d, cs.f3023a);
            }
            dy1VarI = qx1.i(dy1VarA, zl.f6280a, cs.f);
        }
        return dy1VarI;
    }

    @Override // com.google.android.gms.internal.ads.im
    public final String[] a(String[] strArr) {
        return (String[]) this.i.a(strArr).toArray(new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.im
    public final boolean b() {
        return com.google.android.gms.common.util.v.h() && this.h.f && !this.m;
    }

    @Override // com.google.android.gms.internal.ads.im
    public final dm c() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.im
    public final void d(String str) {
        synchronized (this.j) {
            if (str == null) {
                this.f5539a.G();
            } else {
                this.f5539a.L(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.im
    public final void e(String str, Map<String, String> map, int r9) {
        synchronized (this.j) {
            if (r9 == 3) {
                this.n = true;
            }
            if (this.f5540b.containsKey(str)) {
                if (r9 == 3) {
                    this.f5540b.get(str).w(jd2.b.h.a.e(r9));
                }
                return;
            }
            jd2.b.h.C0184b c0184bT = jd2.b.h.T();
            jd2.b.h.a aVarE = jd2.b.h.a.e(r9);
            if (aVarE != null) {
                c0184bT.w(aVarE);
            }
            c0184bT.x(this.f5540b.size());
            c0184bT.z(str);
            jd2.b.d.a aVarJ = jd2.b.d.J();
            if (this.k.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.k.contains(key.toLowerCase(Locale.ENGLISH))) {
                        aVarJ.v((jd2.b.c) ((l92) jd2.b.c.L().v(a82.K(key)).w(a82.K(value)).P()));
                    }
                }
            }
            c0184bT.v((jd2.b.d) ((l92) aVarJ.P()));
            this.f5540b.put(str, c0184bT);
        }
    }

    @Override // com.google.android.gms.internal.ads.im
    public final void f() {
        synchronized (this.j) {
            dy1 dy1VarJ = qx1.j(this.f.a(this.e, this.f5540b.keySet()), new ax1(this) { // from class: com.google.android.gms.internal.ads.xl

                /* renamed from: a, reason: collision with root package name */
                private final ul f5994a;

                {
                    this.f5994a = this;
                }

                @Override // com.google.android.gms.internal.ads.ax1
                public final dy1 a(Object obj) {
                    return this.f5994a.n((Map) obj);
                }
            }, cs.f);
            dy1 dy1VarD = qx1.d(dy1VarJ, 10L, TimeUnit.SECONDS, cs.d);
            qx1.f(dy1VarJ, new cm(this, dy1VarD), cs.f);
            o.add(dy1VarD);
        }
    }

    @Override // com.google.android.gms.internal.ads.im
    public final void g() {
        this.l = true;
    }

    @Override // com.google.android.gms.internal.ads.im
    public final void h(View view) {
        if (this.h.f && !this.m) {
            com.google.android.gms.ads.internal.p.c();
            final Bitmap bitmapG0 = to.g0(view);
            if (bitmapG0 == null) {
                fm.b("Failed to capture the webview bitmap.");
            } else {
                this.m = true;
                to.O(new Runnable(this, bitmapG0) { // from class: com.google.android.gms.internal.ads.yl
                    private final ul d;
                    private final Bitmap e;

                    {
                        this.d = this;
                        this.e = bitmapG0;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.i(this.e);
                    }
                });
            }
        }
    }

    final /* synthetic */ void i(Bitmap bitmap) {
        j82 j82VarX = a82.x();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, j82VarX);
        synchronized (this.j) {
            this.f5539a.x((jd2.b.f) ((l92) jd2.b.f.N().w(j82VarX.b()).x("image/png").v(jd2.b.f.EnumC0183b.TYPE_CREATIVE).P()));
        }
    }

    final void j(String str) {
        synchronized (this.j) {
            this.f5541c.add(str);
        }
    }

    final void k(String str) {
        synchronized (this.j) {
            this.d.add(str);
        }
    }

    final /* synthetic */ dy1 n(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.j) {
                            int length = jSONArrayOptJSONArray.length();
                            jd2.b.h.C0184b c0184bL = l(str);
                            if (c0184bL == null) {
                                String strValueOf = String.valueOf(str);
                                fm.b(strValueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(strValueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                for (int r6 = 0; r6 < length; r6++) {
                                    c0184bL.A(jSONArrayOptJSONArray.getJSONObject(r6).getString("threat_type"));
                                }
                                this.g = (length > 0) | this.g;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (h2.f3616b.a().booleanValue()) {
                    tr.b("Failed to get SafeBrowsing metadata", e);
                }
                return qx1.a(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.g) {
            synchronized (this.j) {
                this.f5539a.z(jd2.b.g.OCTAGON_AD_SB_MATCH);
            }
        }
        return o();
    }
}
