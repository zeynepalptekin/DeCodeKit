package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f6 {

    /* renamed from: a, reason: collision with root package name */
    public static final z6<rw> f3376a = j6.f3919a;

    /* renamed from: b, reason: collision with root package name */
    public static final z6<rw> f3377b = h6.f3634a;

    /* renamed from: c, reason: collision with root package name */
    public static final z6<rw> f3378c = l6.f4202a;
    public static final z6<rw> d = k6.f4057a;
    public static final z6<rw> e = new p6();
    public static final z6<rw> f = new r6();
    public static final z6<rw> g = n6.f4496a;
    public static final z6<Object> h = new q6();
    public static final z6<rw> i = new t6();
    public static final z6<rw> j = m6.f4352a;
    public static final z6<rw> k = new s6();
    public static final z6<rw> l = new v6();
    public static final z6<zt> m = new lv();
    public static final z6<zt> n = new ov();
    public static final z6<rw> o = new g6();
    public static final f7 p = new f7();
    public static final z6<rw> q = new u6();
    public static final z6<rw> r = new x6();
    public static final z6<rw> s = new w6();
    public static final z6<rw> t = new o6();

    static final /* synthetic */ void a(fw fwVar, Map map) throws h42 {
        String str = (String) map.get("u");
        if (str == null) {
            tr.i("URL missing from click GMSG.");
            return;
        }
        Uri uriB = Uri.parse(str);
        try {
            i52 i52VarK = ((zx) fwVar).k();
            if (i52VarK != null && i52VarK.f(uriB)) {
                uriB = i52VarK.b(uriB, ((rx) fwVar).getContext(), ((by) fwVar).getView(), ((rx) fwVar).a());
            }
        } catch (h42 unused) {
            String strValueOf = String.valueOf(str);
            tr.i(strValueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf) : new String("Unable to append parameter to URL: "));
        }
        rx rxVar = (rx) fwVar;
        new zq(rxVar.getContext(), ((cy) fwVar).b().d, fn.b(uriB, rxVar.getContext())).c();
    }

    static final /* synthetic */ void b(rx rxVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            tr.i("URL missing from httpTrack GMSG.");
        } else {
            new zq(rxVar.getContext(), ((cy) rxVar).b().d, str).c();
        }
    }

    static final /* synthetic */ void c(zx zxVar, Map map) throws NumberFormatException {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int r0 = Integer.parseInt(str);
            int r1 = Integer.parseInt(str2);
            int r4 = Integer.parseInt(str3);
            i52 i52VarK = zxVar.k();
            if (i52VarK != null) {
                i52VarK.h().b(r0, r1, r4);
            }
        } catch (NumberFormatException unused) {
            tr.i("Could not parse touch parameters from gmsg.");
        }
    }

    static final /* synthetic */ void d(rx rxVar, Map map) throws JSONException, URISyntaxException {
        JSONException jSONException;
        String str;
        String strOptString;
        Intent uri;
        PackageManager packageManager = rxVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int r6 = 0; r6 < jSONArray.length(); r6++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(r6);
                        strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        uri = null;
                        if (!TextUtils.isEmpty(strOptString7)) {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e2) {
                                String strValueOf = String.valueOf(strOptString7);
                                tr.c(strValueOf.length() != 0 ? "Error parsing the url: ".concat(strValueOf) : new String("Error parsing the url: "), e2);
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                    } catch (JSONException e3) {
                        jSONException = e3;
                        str = "Error parsing the intent data.";
                    }
                    try {
                        jSONObject.put(strOptString, packageManager.resolveActivity(uri, 65536) != null);
                    } catch (JSONException e4) {
                        jSONException = e4;
                        str = "Error constructing openable urls response.";
                        tr.c(str, jSONException);
                    }
                }
                ((c9) rxVar).e("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((c9) rxVar).e("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((c9) rxVar).e("openableIntents", new JSONObject());
        }
    }

    static final /* synthetic */ void e(rx rxVar, Map map) {
        if (!((Boolean) qx2.e().c(e0.t5)).booleanValue()) {
            tr.i("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            tr.i("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap map2 = new HashMap();
        map2.put(str, Boolean.valueOf(rxVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null));
        ((c9) rxVar).M("openableApp", map2);
    }

    static final /* synthetic */ void f(rx rxVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            tr.i("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = rxVar.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                z = false;
            }
            map2.put(str2, Boolean.valueOf(z));
        }
        ((c9) rxVar).M("openableURLs", map2);
    }
}
