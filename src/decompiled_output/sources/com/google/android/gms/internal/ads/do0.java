package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class do0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3147a;

    /* renamed from: b, reason: collision with root package name */
    private final un0 f3148b;

    /* renamed from: c, reason: collision with root package name */
    private final i52 f3149c;
    private final as d;
    private final com.google.android.gms.ads.internal.b e;
    private final tu2 f;
    private final Executor g;
    private final z2 h;
    private final ro0 i;
    private final ScheduledExecutorService j;

    public do0(Context context, un0 un0Var, i52 i52Var, as asVar, com.google.android.gms.ads.internal.b bVar, tu2 tu2Var, Executor executor, an1 an1Var, ro0 ro0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f3147a = context;
        this.f3148b = un0Var;
        this.f3149c = i52Var;
        this.d = asVar;
        this.e = bVar;
        this.f = tu2Var;
        this.g = executor;
        this.h = an1Var.i;
        this.i = ro0Var;
        this.j = scheduledExecutorService;
    }

    private static <T> dy1<T> b(dy1<T> dy1Var, T t) {
        final Object obj = null;
        return qx1.k(dy1Var, Exception.class, new ax1(obj) { // from class: com.google.android.gms.internal.ads.ko0

            /* renamed from: a, reason: collision with root package name */
            private final Object f4126a;

            {
                this.f4126a = obj;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj2) {
                Object obj3 = this.f4126a;
                oo.l("Error during loading assets.", (Exception) obj2);
                return qx1.g(obj3);
            }
        }, cs.f);
    }

    private final dy1<List<v2>> c(@androidx.annotation.i0 JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return qx1.g(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int r1 = 0; r1 < length; r1++) {
            arrayList.add(d(jSONArray.optJSONObject(r1), z));
        }
        return qx1.i(qx1.m(arrayList), co0.f3003a, this.g);
    }

    private final dy1<v2> d(@androidx.annotation.i0 JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return qx1.g(null);
        }
        final String strOptString = jSONObject.optString(com.google.android.gms.common.internal.o.f2536a);
        if (TextUtils.isEmpty(strOptString)) {
            return qx1.g(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int r10 = jSONObject.optInt("width", -1);
        final int r11 = jSONObject.optInt("height", -1);
        if (z) {
            return qx1.g(new v2(null, Uri.parse(strOptString), dOptDouble, r10, r11));
        }
        return e(jSONObject.optBoolean("require"), qx1.i(this.f3148b.d(strOptString, dOptDouble, zOptBoolean), new ru1(strOptString, dOptDouble, r10, r11) { // from class: com.google.android.gms.internal.ads.fo0

            /* renamed from: a, reason: collision with root package name */
            private final String f3425a;

            /* renamed from: b, reason: collision with root package name */
            private final double f3426b;

            /* renamed from: c, reason: collision with root package name */
            private final int f3427c;
            private final int d;

            {
                this.f3425a = strOptString;
                this.f3426b = dOptDouble;
                this.f3427c = r10;
                this.d = r11;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                String str = this.f3425a;
                return new v2(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f3426b, this.f3427c, this.d);
            }
        }, this.g), null);
    }

    private static <T> dy1<T> e(boolean z, final dy1<T> dy1Var, T t) {
        return z ? qx1.j(dy1Var, new ax1(dy1Var) { // from class: com.google.android.gms.internal.ads.jo0

            /* renamed from: a, reason: collision with root package name */
            private final dy1 f4003a;

            {
                this.f4003a = dy1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return obj != null ? this.f4003a : qx1.a(new k41(xn1.INTERNAL_ERROR, "Retrieve required value in native ad response failed."));
            }
        }, cs.f) : b(dy1Var, null);
    }

    private static Integer j(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static List<r03> k(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return nv1.s();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return nv1.s();
        }
        ArrayList arrayList = new ArrayList();
        for (int r1 = 0; r1 < jSONArrayOptJSONArray.length(); r1++) {
            r03 r03VarM = m(jSONArrayOptJSONArray.optJSONObject(r1));
            if (r03VarM != null) {
                arrayList.add(r03VarM);
            }
        }
        return nv1.t(arrayList);
    }

    @androidx.annotation.i0
    public static r03 l(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m(jSONObjectOptJSONObject);
    }

    @androidx.annotation.i0
    private static r03 m(@androidx.annotation.i0 JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new r03(strOptString, strOptString2);
    }

    final /* synthetic */ q2 a(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numJ = j(jSONObject, "bg_color");
        Integer numJ2 = j(jSONObject, "text_color");
        int r1 = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int r2 = jSONObject.optInt("animation_ms", 1000);
        return new q2(strOptString, list, numJ, numJ2, r1 > 0 ? Integer.valueOf(r1) : null, jSONObject.optInt("presentation_ms", 4000) + r2, this.h.h, zOptBoolean);
    }

    final /* synthetic */ dy1 f(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.p.d();
        rw rwVarA = zw.a(this.f3147a, hy.b(), "native-omid", false, false, this.f3149c, null, this.d, null, null, this.e, this.f, null, false, null, null);
        final ls lsVarF = ls.f(rwVarA);
        rwVarA.C0().m(new dy(lsVarF) { // from class: com.google.android.gms.internal.ads.mo0

            /* renamed from: a, reason: collision with root package name */
            private final ls f4433a;

            {
                this.f4433a = lsVarF;
            }

            @Override // com.google.android.gms.internal.ads.dy
            public final void a(boolean z) {
                this.f4433a.g();
            }
        });
        rwVarA.loadData(str, "text/html", "UTF-8");
        return lsVarF;
    }

    public final dy1<v2> g(JSONObject jSONObject, String str) {
        return d(jSONObject.optJSONObject(str), this.h.e);
    }

    public final dy1<List<v2>> h(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        z2 z2Var = this.h;
        return c(jSONArrayOptJSONArray, z2Var.e, z2Var.g);
    }

    public final dy1<q2> i(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return qx1.g(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return e(jSONObjectOptJSONObject.optBoolean("require"), qx1.i(c(jSONArrayOptJSONArray, false, true), new ru1(this, jSONObjectOptJSONObject) { // from class: com.google.android.gms.internal.ads.eo0

            /* renamed from: a, reason: collision with root package name */
            private final do0 f3297a;

            /* renamed from: b, reason: collision with root package name */
            private final JSONObject f3298b;

            {
                this.f3297a = this;
                this.f3298b = jSONObjectOptJSONObject;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                return this.f3297a.a(this.f3298b, (List) obj);
            }
        }, this.g), null);
    }

    public final dy1<rw> n(JSONObject jSONObject) {
        JSONObject jSONObjectE = qq.e(jSONObject, "html_containers", "instream");
        if (jSONObjectE != null) {
            final dy1<rw> dy1VarG = this.i.g(jSONObjectE.optString("base_url"), jSONObjectE.optString("html"));
            return qx1.j(dy1VarG, new ax1(dy1VarG) { // from class: com.google.android.gms.internal.ads.go0

                /* renamed from: a, reason: collision with root package name */
                private final dy1 f3561a;

                {
                    this.f3561a = dy1VarG;
                }

                @Override // com.google.android.gms.internal.ads.ax1
                public final dy1 a(Object obj) throws k41 {
                    dy1 dy1Var = this.f3561a;
                    rw rwVar = (rw) obj;
                    if (rwVar == null || rwVar.n() == null) {
                        throw new k41(xn1.INTERNAL_ERROR, "Retrieve video view in instream ad response failed.");
                    }
                    return dy1Var;
                }
            }, cs.f);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return qx1.g(null);
        }
        if (TextUtils.isEmpty(jSONObjectOptJSONObject.optString("vast_xml"))) {
            tr.i("Required field 'vast_xml' is missing");
            return qx1.g(null);
        }
        return b(qx1.d(this.i.f(jSONObjectOptJSONObject), ((Integer) qx2.e().c(e0.g2)).intValue(), TimeUnit.SECONDS, this.j), null);
    }
}
