package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nc {
    public static List<String> a(JSONObject jSONObject, String str) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int r0 = 0; r0 < jSONArrayOptJSONArray.length(); r0++) {
            arrayList.add(jSONArrayOptJSONArray.getString(r0));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
