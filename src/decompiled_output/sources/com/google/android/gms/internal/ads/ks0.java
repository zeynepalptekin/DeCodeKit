package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ks0 {
    public static String a(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (!((Boolean) qx2.e().c(e0.m1)).booleanValue() || jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) == null) {
            return "";
        }
        for (int r6 = 0; r6 < jSONArrayOptJSONArray.length(); r6++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(r6);
            if (jSONObjectOptJSONObject != null) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                if (b(jSONArrayOptJSONArray2, str) && !b(jSONArrayOptJSONArray3, str)) {
                    return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                }
            }
        }
        return "";
    }

    private static boolean b(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int r1 = 0; r1 < jSONArray.length(); r1++) {
                try {
                } catch (PatternSyntaxException e) {
                    com.google.android.gms.ads.internal.p.g().e(e, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
                if (Pattern.compile(jSONArray.optString(r1)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }
}
