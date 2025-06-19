package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.g91;
import com.google.android.gms.internal.ads.ia0;
import com.google.android.gms.internal.ads.qf0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s81 extends in {
    private static final List<String> o = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));
    private static final List<String> p = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    private static final List<String> q = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));
    private static final List<String> r = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    private gz e;
    private Context f;
    private i52 g;
    private as h;
    private pn1<up0> i;
    private final cy1 j;
    private final ScheduledExecutorService k;

    @androidx.annotation.i0
    private th l;
    private Point m = new Point();
    private Point n = new Point();

    public s81(gz gzVar, Context context, i52 i52Var, as asVar, pn1<up0> pn1Var, cy1 cy1Var, ScheduledExecutorService scheduledExecutorService) {
        this.e = gzVar;
        this.f = context;
        this.g = i52Var;
        this.h = asVar;
        this.i = pn1Var;
        this.j = cy1Var;
        this.k = scheduledExecutorService;
    }

    private static Uri A8(Uri uri, String str, String str2) {
        String string = uri.toString();
        int r1 = string.indexOf("&adurl=");
        if (r1 == -1) {
            r1 = string.indexOf("?adurl=");
        }
        if (r1 == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int r12 = r1 + 1;
        return Uri.parse(string.substring(0, r12) + str + "=" + str2 + "&" + string.substring(r12));
    }

    static final /* synthetic */ String D8(Exception exc) {
        tr.c("", exc);
        return null;
    }

    static /* synthetic */ ArrayList F8(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uriA8 = (Uri) it.next();
            if (N8(uriA8) && !TextUtils.isEmpty(str)) {
                uriA8 = A8(uriA8, "nas", str);
            }
            arrayList.add(uriA8);
        }
        return arrayList;
    }

    private static boolean H8(@androidx.annotation.h0 Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (path.contains(it.next())) {
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith(it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean I8() {
        Map<String, WeakReference<View>> map;
        th thVar = this.l;
        return (thVar == null || (map = thVar.e) == null || map.isEmpty()) ? false : true;
    }

    static /* synthetic */ Uri L8(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? A8(uri, "nas", str) : uri;
    }

    private final dy1<String> M8(final String str) {
        final up0[] up0VarArr = new up0[1];
        dy1 dy1VarJ = qx1.j(this.i.a(), new ax1(this, up0VarArr, str) { // from class: com.google.android.gms.internal.ads.z81

            /* renamed from: a, reason: collision with root package name */
            private final s81 f6234a;

            /* renamed from: b, reason: collision with root package name */
            private final up0[] f6235b;

            /* renamed from: c, reason: collision with root package name */
            private final String f6236c;

            {
                this.f6234a = this;
                this.f6235b = up0VarArr;
                this.f6236c = str;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f6234a.C8(this.f6235b, this.f6236c, (up0) obj);
            }
        }, this.j);
        dy1VarJ.e(new Runnable(this, up0VarArr) { // from class: com.google.android.gms.internal.ads.d91
            private final s81 d;
            private final up0[] e;

            {
                this.d = this;
                this.e = up0VarArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.G8(this.e);
            }
        }, this.j);
        return lx1.H(dy1VarJ).C(((Integer) qx2.e().c(e0.Y4)).intValue(), TimeUnit.MILLISECONDS, this.k).D(x81.f5948a, this.j).E(Exception.class, a91.f2656a, this.j);
    }

    @androidx.annotation.x0
    private static boolean N8(@androidx.annotation.h0 Uri uri) {
        return H8(uri, q, r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z8, reason: merged with bridge method [inline-methods] */
    public final Uri J8(Uri uri, c.a.b.b.e.c cVar) throws Exception {
        try {
            uri = this.g.b(uri, this.f, (View) c.a.b.b.e.e.e2(cVar), null);
        } catch (h42 e) {
            tr.d("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ dy1 C8(up0[] up0VarArr, String str, up0 up0Var) throws Exception {
        up0VarArr[0] = up0Var;
        Context context = this.f;
        th thVar = this.l;
        Map<String, WeakReference<View>> map = thVar.e;
        JSONObject jSONObjectE = wq.e(context, map, map, thVar.d);
        JSONObject jSONObjectD = wq.d(this.f, this.l.d);
        JSONObject jSONObjectL = wq.l(this.l.d);
        JSONObject jSONObjectI = wq.i(this.f, this.l.d);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectE);
        jSONObject.put("ad_view_signal", jSONObjectD);
        jSONObject.put("scroll_view_signal", jSONObjectL);
        jSONObject.put("lock_screen_signal", jSONObjectI);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", wq.f(null, this.f, this.n, this.m));
        }
        return up0Var.j(str, jSONObject);
    }

    final /* synthetic */ ArrayList E8(List list, c.a.b.b.e.c cVar) throws Exception {
        String strD = this.g.h() != null ? this.g.h().d(this.f, (View) c.a.b.b.e.e.e2(cVar), null) : "";
        if (TextUtils.isEmpty(strD)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uriA8 = (Uri) it.next();
            if (N8(uriA8)) {
                uriA8 = A8(uriA8, "ms", strD);
            } else {
                String strValueOf = String.valueOf(uriA8);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
                sb.append("Not a Google URL: ");
                sb.append(strValueOf);
                tr.i(sb.toString());
            }
            arrayList.add(uriA8);
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ void G8(up0[] up0VarArr) {
        if (up0VarArr[0] != null) {
            this.i.b(qx1.g(up0VarArr[0]));
        }
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final c.a.b.b.e.c I1(c.a.b.b.e.c cVar) {
        return null;
    }

    final /* synthetic */ dy1 K8(final ArrayList arrayList) throws Exception {
        return qx1.i(M8("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new ru1(this, arrayList) { // from class: com.google.android.gms.internal.ads.v81

            /* renamed from: a, reason: collision with root package name */
            private final s81 f5645a;

            /* renamed from: b, reason: collision with root package name */
            private final List f5646b;

            {
                this.f5645a = this;
                this.f5646b = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                return s81.F8(this.f5646b, (String) obj);
            }
        }, this.j);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void L2(th thVar) {
        this.l = thVar;
        this.i.c(1);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final c.a.b.b.e.c N6(c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2) {
        return null;
    }

    final /* synthetic */ dy1 O8(final Uri uri) throws Exception {
        return qx1.i(M8("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new ru1(this, uri) { // from class: com.google.android.gms.internal.ads.y81

            /* renamed from: a, reason: collision with root package name */
            private final s81 f6101a;

            /* renamed from: b, reason: collision with root package name */
            private final Uri f6102b;

            {
                this.f6101a = this;
                this.f6102b = uri;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                return s81.L8(this.f6102b, (String) obj);
            }
        }, this.j);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void T5(c.a.b.b.e.c cVar, pn pnVar, en enVar) {
        Context context = (Context) c.a.b.b.e.e.e2(cVar);
        this.f = context;
        String str = pnVar.d;
        String str2 = pnVar.e;
        qw2 qw2Var = pnVar.f;
        jw2 jw2VarA = pnVar.g;
        p81 p81VarT = this.e.t();
        ia0.a aVarG = new ia0.a().g(context);
        cn1 cn1Var = new cn1();
        if (str == null) {
            str = "adUnitId";
        }
        cn1 cn1VarZ = cn1Var.z(str);
        if (jw2VarA == null) {
            jw2VarA = new mw2().a();
        }
        cn1 cn1VarB = cn1VarZ.B(jw2VarA);
        if (qw2Var == null) {
            qw2Var = new qw2();
        }
        qx1.f(p81VarT.b(aVarG.c(cn1VarB.u(qw2Var).e()).d()).d(new g91(new g91.a().b(str2))).c(new qf0.a().o()).a().a(), new b91(this, enVar), this.e.e());
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void a2(List<Uri> list, final c.a.b.b.e.c cVar, lh lhVar) {
        try {
            if (!((Boolean) qx2.e().c(e0.X4)).booleanValue()) {
                lhVar.u1("The updating URL feature is not enabled.");
                return;
            }
            if (list.size() != 1) {
                lhVar.u1("There should be only 1 click URL.");
                return;
            }
            final Uri uri = list.get(0);
            if (H8(uri, o, p)) {
                dy1 dy1VarSubmit = this.j.submit(new Callable(this, uri, cVar) { // from class: com.google.android.gms.internal.ads.t81

                    /* renamed from: a, reason: collision with root package name */
                    private final s81 f5360a;

                    /* renamed from: b, reason: collision with root package name */
                    private final Uri f5361b;

                    /* renamed from: c, reason: collision with root package name */
                    private final c.a.b.b.e.c f5362c;

                    {
                        this.f5360a = this;
                        this.f5361b = uri;
                        this.f5362c = cVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f5360a.J8(this.f5361b, this.f5362c);
                    }
                });
                if (I8()) {
                    dy1VarSubmit = qx1.j(dy1VarSubmit, new ax1(this) { // from class: com.google.android.gms.internal.ads.w81

                        /* renamed from: a, reason: collision with root package name */
                        private final s81 f5806a;

                        {
                            this.f5806a = this;
                        }

                        @Override // com.google.android.gms.internal.ads.ax1
                        public final dy1 a(Object obj) {
                            return this.f5806a.O8((Uri) obj);
                        }
                    }, this.j);
                } else {
                    tr.h("Asset view map is empty.");
                }
                qx1.f(dy1VarSubmit, new e91(this, lhVar), this.e.e());
                return;
            }
            String strValueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
            sb.append("Not a Google URL: ");
            sb.append(strValueOf);
            tr.i(sb.toString());
            lhVar.Y7(list);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void c7(c.a.b.b.e.c cVar) {
        if (((Boolean) qx2.e().c(e0.X4)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) c.a.b.b.e.e.e2(cVar);
            th thVar = this.l;
            this.m = wq.a(motionEvent, thVar == null ? null : thVar.d);
            if (motionEvent.getAction() == 0) {
                this.n = this.m;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.m;
            motionEventObtain.setLocation(point.x, point.y);
            this.g.d(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void g7(final List<Uri> list, final c.a.b.b.e.c cVar, lh lhVar) {
        if (!((Boolean) qx2.e().c(e0.X4)).booleanValue()) {
            try {
                lhVar.u1("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                tr.c("", e);
                return;
            }
        }
        dy1 dy1VarSubmit = this.j.submit(new Callable(this, list, cVar) { // from class: com.google.android.gms.internal.ads.r81

            /* renamed from: a, reason: collision with root package name */
            private final s81 f5111a;

            /* renamed from: b, reason: collision with root package name */
            private final List f5112b;

            /* renamed from: c, reason: collision with root package name */
            private final c.a.b.b.e.c f5113c;

            {
                this.f5111a = this;
                this.f5112b = list;
                this.f5113c = cVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5111a.E8(this.f5112b, this.f5113c);
            }
        });
        if (I8()) {
            dy1VarSubmit = qx1.j(dy1VarSubmit, new ax1(this) { // from class: com.google.android.gms.internal.ads.u81

                /* renamed from: a, reason: collision with root package name */
                private final s81 f5489a;

                {
                    this.f5489a = this;
                }

                @Override // com.google.android.gms.internal.ads.ax1
                public final dy1 a(Object obj) {
                    return this.f5489a.K8((ArrayList) obj);
                }
            }, this.j);
        } else {
            tr.h("Asset view map is empty.");
        }
        qx1.f(dy1VarSubmit, new f91(this, lhVar), this.e.e());
    }
}
