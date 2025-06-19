package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lv implements z6<zt> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4310a;

    private static int b(Context context, Map<String, String> map, String str, int r4) {
        String str2 = map.get(str);
        if (str2 == null) {
            return r4;
        }
        try {
            qx2.a();
            return jr.r(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            tr.i(sb.toString());
            return r4;
        }
    }

    private static void c(mt mtVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                mtVar.w(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                tr.i(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            mtVar.x(Integer.parseInt(str2));
        }
        if (str3 != null) {
            mtVar.y(Integer.parseInt(str3));
        }
        if (str4 != null) {
            mtVar.z(Integer.parseInt(str4));
        }
        if (str5 != null) {
            mtVar.A(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(zt ztVar, Map map) throws NumberFormatException {
        int r8;
        zt ztVar2 = ztVar;
        String str = (String) map.get("action");
        if (str == null) {
            tr.i("Action missing from video GMSG.");
            return;
        }
        if (tr.a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            tr.f(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                tr.i("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                ztVar2.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                tr.i("Invalid color parameter in video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str3 = (String) map.get("mimeTypes");
            if (str3 == null) {
                tr.i("No MIME types specified for decoder properties inspection.");
                mt.p(ztVar2, "missingMimeTypes");
                return;
            }
            HashMap map2 = new HashMap();
            for (String str4 : str3.split(",")) {
                map2.put(str4, hr.b(str4.trim()));
            }
            mt.q(ztVar2, map2);
            return;
        }
        st stVarT = ztVar2.t();
        if (stVarT == null) {
            tr.i("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = "new".equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = ztVar2.getContext();
            int r4 = b(context, map, "x", 0);
            int r5 = b(context, map, "y", 0);
            int r6 = b(context, map, "w", -1);
            int r0 = b(context, map, "h", -1);
            int r62 = Math.min(r6, ztVar2.p() - r4);
            int r7 = Math.min(r0, ztVar2.P() - r5);
            try {
                r8 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused2) {
                r8 = 0;
            }
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || stVarT.e() != null) {
                stVarT.d(r4, r5, r62, r7);
                return;
            }
            stVarT.c(r4, r5, r62, r7, r8, z, new au((String) map.get("flags")));
            mt mtVarE = stVarT.e();
            if (mtVarE != null) {
                c(mtVarE, map);
                return;
            }
            return;
        }
        mx mxVarN = ztVar2.n();
        if (mxVarN != null) {
            if ("timeupdate".equals(str)) {
                String str5 = (String) map.get("currentTime");
                if (str5 == null) {
                    tr.i("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    mxVarN.E8(Float.parseFloat(str5));
                    return;
                } catch (NumberFormatException unused3) {
                    String strValueOf = String.valueOf(str5);
                    tr.i(strValueOf.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(strValueOf) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                    return;
                }
            }
            if ("skip".equals(str)) {
                mxVarN.B8();
                return;
            }
        }
        mt mtVarE2 = stVarT.e();
        if (mtVarE2 == null) {
            mt.s(ztVar2);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = ztVar2.getContext();
            int r02 = b(context2, map, "x", 0);
            int r12 = b(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, r02, r12, 0);
            mtVarE2.B(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str6 = (String) map.get("time");
            if (str6 == null) {
                tr.i("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                mtVarE2.m((int) (Float.parseFloat(str6) * 1000.0f));
                return;
            } catch (NumberFormatException unused4) {
                String strValueOf2 = String.valueOf(str6);
                tr.i(strValueOf2.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(strValueOf2) : new String("Could not parse time parameter from currentTime video GMSG: "));
                return;
            }
        }
        if ("hide".equals(str)) {
            mtVarE2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            mtVarE2.C();
            return;
        }
        if ("loadControl".equals(str)) {
            c(mtVarE2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                mtVarE2.D();
                return;
            } else {
                mtVarE2.E();
                return;
            }
        }
        if ("pause".equals(str)) {
            mtVarE2.k();
            return;
        }
        if ("play".equals(str)) {
            mtVarE2.l();
            return;
        }
        if ("show".equals(str)) {
            mtVarE2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str7 = (String) map.get("src");
            String[] strArr = {str7};
            String str8 = (String) map.get("demuxed");
            if (str8 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str8);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int r42 = 0; r42 < jSONArray.length(); r42++) {
                        strArr2[r42] = jSONArray.getString(r42);
                    }
                    strArr = strArr2;
                } catch (JSONException unused5) {
                    String strValueOf3 = String.valueOf(str8);
                    tr.i(strValueOf3.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(strValueOf3) : new String("Malformed demuxed URL list for playback: "));
                    strArr = new String[]{str7};
                }
            }
            mtVarE2.t(str7, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = ztVar2.getContext();
            mtVarE2.n(b(context3, map, "dx", 0), b(context3, map, "dy", 0));
            if (this.f4310a) {
                return;
            }
            ztVar2.k0();
            this.f4310a = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                mtVarE2.F();
                return;
            } else {
                String strValueOf4 = String.valueOf(str);
                tr.i(strValueOf4.length() != 0 ? "Unknown video action: ".concat(strValueOf4) : new String("Unknown video action: "));
                return;
            }
        }
        String str9 = (String) map.get("volume");
        if (str9 == null) {
            tr.i("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            mtVarE2.setVolume(Float.parseFloat(str9));
        } catch (NumberFormatException unused6) {
            String strValueOf5 = String.valueOf(str9);
            tr.i(strValueOf5.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(strValueOf5) : new String("Could not parse volume parameter from volume video GMSG: "));
        }
    }
}
