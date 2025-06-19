package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class lm1 {

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f4274a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4275b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4276c;
    public final String d;
    public final int e;
    public final long f;

    @androidx.annotation.i0
    public final mm1 g;

    lm1(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List<String> listEmptyList = Collections.emptyList();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        mm1 mm1Var = null;
        long jNextLong = 0;
        int r3 = 0;
        int r4 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("nofill_urls".equals(strNextName)) {
                listEmptyList = qq.b(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                r3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("response_code".equals(strNextName)) {
                r4 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                if (((Boolean) qx2.e().c(e0.w5)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    mm1Var = new mm1(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.f4274a = listEmptyList;
        this.f4276c = r3;
        this.f4275b = strNextString;
        this.d = strNextString2;
        this.e = r4;
        this.f = jNextLong;
        this.g = mm1Var;
    }
}
