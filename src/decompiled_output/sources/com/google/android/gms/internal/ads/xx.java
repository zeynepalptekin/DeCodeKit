package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xx {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f6055a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f6056b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a() throws JSONException {
        String str = (String) qx2.e().c(e0.I);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            return "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            tr.d("Unable to build MRAID_ENV", e);
            return null;
        }
    }

    public static String b(@androidx.annotation.h0 String str, @androidx.annotation.i0 String... strArr) {
        if (strArr.length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f6055a.matcher(str);
        int r3 = 0;
        if (matcher.find()) {
            int r1 = matcher.end();
            sb.append(str.substring(0, r1));
            int length = strArr.length;
            while (r3 < length) {
                String str2 = strArr[r3];
                if (str2 != null) {
                    sb.append(str2);
                }
                r3++;
            }
            str = str.substring(r1);
        } else if (!f6056b.matcher(str).find()) {
            int length2 = strArr.length;
            while (r3 < length2) {
                String str3 = strArr[r3];
                if (str3 != null) {
                    sb.append(str3);
                }
                r3++;
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
