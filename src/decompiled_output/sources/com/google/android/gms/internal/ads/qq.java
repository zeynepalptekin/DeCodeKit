package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qq {

    /* renamed from: a, reason: collision with root package name */
    private static final sq<Map<String, ?>> f5049a = new tq();

    public static String a(vq vqVar) {
        return p(vqVar);
    }

    public static List<String> b(JsonReader jsonReader) throws IllegalStateException, IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    @androidx.annotation.h0
    public static List<String> c(@androidx.annotation.i0 JSONArray jSONArray, @androidx.annotation.i0 List<String> list) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int r0 = 0; r0 < jSONArray.length(); r0++) {
            arrayList.add(jSONArray.getString(r0));
        }
        return arrayList;
    }

    public static JSONObject d(String str, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, obj);
        return jSONObject;
    }

    public static JSONObject e(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectL = l(jSONObject, strArr);
        if (jSONObjectL == null) {
            return null;
        }
        return jSONObjectL.optJSONObject(strArr[strArr.length - 1]);
    }

    private static void f(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof vq) {
            ((vq) obj).a(jsonWriter);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                f(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                f(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    private static void g(JsonWriter jsonWriter, JSONArray jSONArray) throws JSONException, IOException {
        try {
            jsonWriter.beginArray();
            for (int r0 = 0; r0 < jSONArray.length(); r0++) {
                Object obj = jSONArray.get(r0);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    h(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(strValueOf);
                        throw new JSONException(sb.toString());
                    }
                    g(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static void h(JsonWriter jsonWriter, JSONObject jSONObject) throws JSONException, IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    h(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(strValueOf);
                        throw new JSONException(sb.toString());
                    }
                    g(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static boolean i(boolean z, JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectL = l(jSONObject, strArr);
        if (jSONObjectL == null) {
            return false;
        }
        return jSONObjectL.optBoolean(strArr[strArr.length - 1], false);
    }

    public static Map<String, String> j(JsonReader jsonReader) throws IllegalStateException, IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            map.put(jsonReader.nextName(), jsonReader.nextString());
        }
        jsonReader.endObject();
        return map;
    }

    public static JSONObject k(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    private static JSONObject l(JSONObject jSONObject, String[] strArr) {
        for (int r0 = 0; r0 < strArr.length - 1; r0++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[r0]);
        }
        return jSONObject;
    }

    public static JSONObject m(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException {
        Object objN;
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                objN = n(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                objN = m(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    String strValueOf = String.valueOf(jsonTokenPeek);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
                    sb.append("unexpected json token: ");
                    sb.append(strValueOf);
                    throw new IllegalStateException(sb.toString());
                }
                objN = jsonReader.nextString();
            }
            jSONObject.put(strNextName, objN);
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray n(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException {
        Object objN;
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                objN = n(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                objN = m(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    String strValueOf = String.valueOf(jsonTokenPeek);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
                    sb.append("unexpected json token: ");
                    sb.append(strValueOf);
                    throw new IllegalStateException(sb.toString());
                }
                objN = jsonReader.nextString();
            }
            jSONArray.put(objN);
        }
        jsonReader.endArray();
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0098 A[PHI: r3 r4
  0x0098: PHI (r3v7 java.lang.String) = (r3v3 java.lang.String), (r3v10 java.lang.String) binds: [B:42:0x0096, B:83:0x0148] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r4v14 java.lang.String) = (r4v11 java.lang.String), (r4v15 java.lang.String) binds: [B:42:0x0096, B:83:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle o(org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qq.o(org.json.JSONObject):android.os.Bundle");
    }

    private static String p(Object obj) throws IOException {
        if (obj == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            f(jsonWriter, obj);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            tr.c("Error when writing JSON.", e);
            return null;
        }
    }
}
