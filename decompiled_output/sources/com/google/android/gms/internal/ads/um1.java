package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.measurement.c.a;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class um1 {

    /* renamed from: a, reason: collision with root package name */
    public final List<km1> f5550a;

    /* renamed from: b, reason: collision with root package name */
    public final lm1 f5551b;

    /* renamed from: c, reason: collision with root package name */
    public final List<xm1> f5552c;

    private um1(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException, AssertionError {
        List<km1> listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        lm1 lm1Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        listEmptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            listEmptyList.add(new km1(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        lm1Var = new lm1(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    Map<String, String> mapJ = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (a.C0190a.f6334b.equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            mapJ = qq.j(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new xm1(strNextString, mapJ));
                    }
                    jsonReader.endObject();
                }
            }
            jsonReader.endArray();
        }
        this.f5552c = arrayList;
        this.f5550a = listEmptyList;
        this.f5551b = lm1Var == null ? new lm1(new JsonReader(new StringReader("{}"))) : lm1Var;
    }

    public static um1 a(Reader reader) throws om1 {
        try {
            try {
                return new um1(new JsonReader(reader));
            } finally {
                com.google.android.gms.common.util.q.b(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new om1("unable to parse ServerResponse", e);
        }
    }
}
