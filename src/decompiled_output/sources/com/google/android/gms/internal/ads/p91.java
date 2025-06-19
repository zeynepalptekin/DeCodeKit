package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class p91 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4786a;

    /* renamed from: b, reason: collision with root package name */
    public String f4787b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f4788c = new Bundle();

    public p91(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        Map<String, String> map = new HashMap<>();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            char c2 = 65535;
            int r5 = strNextName.hashCode();
            if (r5 != -995427962) {
                if (r5 == -271442291 && strNextName.equals("signal_dictionary")) {
                    c2 = 1;
                }
            } else if (strNextName.equals("params")) {
                c2 = 0;
            }
            if (c2 == 0) {
                strNextString = jsonReader.nextString();
            } else if (c2 != 1) {
                jsonReader.skipValue();
            } else {
                map = qq.j(jsonReader);
            }
        }
        this.f4786a = strNextString;
        jsonReader.endObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f4788c.putString(entry.getKey(), entry.getValue());
            }
        }
    }

    final p91 a(Bundle bundle) {
        try {
            this.f4787b = com.google.android.gms.ads.internal.p.c().R(bundle).toString();
        } catch (JSONException unused) {
            this.f4787b = "{}";
        }
        return this;
    }
}
