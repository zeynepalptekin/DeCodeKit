package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.measurement.c.a;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class nr {

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.u("lock")
    private static boolean f4596c = false;

    @androidx.annotation.u("lock")
    private static boolean d = false;

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f4597a;

    /* renamed from: b, reason: collision with root package name */
    private static Object f4595b = new Object();
    private static com.google.android.gms.common.util.g e = com.google.android.gms.common.util.k.e();
    private static final Set<String> f = new HashSet(Arrays.asList(new String[0]));

    public nr() {
        this(null);
    }

    public nr(@androidx.annotation.i0 String str) {
        List<String> listAsList;
        if (a()) {
            String[] strArr = new String[1];
            String strValueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = strValueOf.length() != 0 ? "network_request_".concat(strValueOf) : new String("network_request_");
            listAsList = Arrays.asList(strArr);
        } else {
            listAsList = new ArrayList<>();
        }
        this.f4597a = listAsList;
    }

    public static boolean a() {
        boolean z;
        synchronized (f4595b) {
            z = f4596c && d;
        }
        return z;
    }

    static final /* synthetic */ void b(int r3, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(r3);
        jsonWriter.endObject();
        c(jsonWriter, map);
        jsonWriter.endObject();
    }

    private static void c(JsonWriter jsonWriter, @androidx.annotation.i0 Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!f.contains(key)) {
                if (!(next.getValue() instanceof List)) {
                    if (!(next.getValue() instanceof String)) {
                        tr.g("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(a.C0190a.f6334b).value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(a.C0190a.f6334b).value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    static final /* synthetic */ void d(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    private final void e(String str, ur urVar) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(e.a());
            jsonWriter.name(androidx.core.app.p.i0).value(str);
            jsonWriter.name("components").beginArray();
            Iterator<String> it = this.f4597a.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            urVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            tr.c("unable to log", e2);
        }
        r(stringWriter.toString());
    }

    static final /* synthetic */ void g(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        c(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(com.google.android.gms.common.util.c.d(bArr));
        }
        jsonWriter.endObject();
    }

    static final /* synthetic */ void k(byte[] bArr, JsonWriter jsonWriter) throws NoSuchAlgorithmException, IOException {
        String str;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String strD = com.google.android.gms.common.util.c.d(bArr);
        if (length >= 10000) {
            strD = jr.v(strD);
            str = strD != null ? "bodydigest" : "body";
            jsonWriter.name("bodylength").value(length);
            jsonWriter.endObject();
        }
        jsonWriter.name(str).value(strD);
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    public static void l(boolean z) {
        synchronized (f4595b) {
            f4596c = true;
            d = z;
        }
    }

    private final void m(final String str, final String str2, @androidx.annotation.i0 final Map<String, ?> map, @androidx.annotation.i0 final byte[] bArr) throws IOException {
        e("onNetworkRequest", new ur(str, str2, map, bArr) { // from class: com.google.android.gms.internal.ads.qr

            /* renamed from: a, reason: collision with root package name */
            private final String f5051a;

            /* renamed from: b, reason: collision with root package name */
            private final String f5052b;

            /* renamed from: c, reason: collision with root package name */
            private final Map f5053c;
            private final byte[] d;

            {
                this.f5051a = str;
                this.f5052b = str2;
                this.f5053c = map;
                this.d = bArr;
            }

            @Override // com.google.android.gms.internal.ads.ur
            public final void a(JsonWriter jsonWriter) throws IOException {
                nr.g(this.f5051a, this.f5052b, this.f5053c, this.d, jsonWriter);
            }
        });
    }

    private final void n(@androidx.annotation.i0 final Map<String, ?> map, final int r3) throws IOException {
        e("onNetworkResponse", new ur(r3, map) { // from class: com.google.android.gms.internal.ads.pr

            /* renamed from: a, reason: collision with root package name */
            private final int f4873a;

            /* renamed from: b, reason: collision with root package name */
            private final Map f4874b;

            {
                this.f4873a = r3;
                this.f4874b = map;
            }

            @Override // com.google.android.gms.internal.ads.ur
            public final void a(JsonWriter jsonWriter) throws IOException {
                nr.b(this.f4873a, this.f4874b, jsonWriter);
            }
        });
    }

    public static boolean o(Context context) {
        if (Build.VERSION.SDK_INT < 17 || !v1.f5624a.a().booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e2) {
            tr.d("Fail to determine debug setting.", e2);
            return false;
        }
    }

    private final void q(@androidx.annotation.i0 final String str) throws IOException {
        e("onNetworkRequestError", new ur(str) { // from class: com.google.android.gms.internal.ads.rr

            /* renamed from: a, reason: collision with root package name */
            private final String f5178a;

            {
                this.f5178a = str;
            }

            @Override // com.google.android.gms.internal.ads.ur
            public final void a(JsonWriter jsonWriter) throws IOException {
                nr.d(this.f5178a, jsonWriter);
            }
        });
    }

    private static synchronized void r(String str) {
        tr.h("GMA Debug BEGIN");
        int r1 = 0;
        while (r1 < str.length()) {
            int r2 = r1 + 4000;
            String strValueOf = String.valueOf(str.substring(r1, Math.min(r2, str.length())));
            tr.h(strValueOf.length() != 0 ? "GMA Debug CONTENT ".concat(strValueOf) : new String("GMA Debug CONTENT "));
            r1 = r2;
        }
        tr.h("GMA Debug FINISH");
    }

    public static void t() {
        synchronized (f4595b) {
            f4596c = false;
            d = false;
            tr.i("Ad debug logging enablement is out of date.");
        }
    }

    public static boolean u() {
        boolean z;
        synchronized (f4595b) {
            z = f4596c;
        }
        return z;
    }

    public final void f(String str, String str2, @androidx.annotation.i0 Map<String, ?> map, @androidx.annotation.i0 byte[] bArr) throws IOException {
        if (a()) {
            m(str, str2, map, bArr);
        }
    }

    public final void h(HttpURLConnection httpURLConnection, int r5) throws IOException {
        if (a()) {
            String responseMessage = null;
            n(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), r5);
            if (r5 < 200 || r5 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    String strValueOf = String.valueOf(e2.getMessage());
                    tr.i(strValueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(strValueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                q(responseMessage);
            }
        }
    }

    public final void i(HttpURLConnection httpURLConnection, @androidx.annotation.i0 byte[] bArr) throws IOException {
        if (a()) {
            m(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void j(@androidx.annotation.i0 Map<String, ?> map, int r3) throws IOException {
        if (a()) {
            n(map, r3);
            if (r3 < 200 || r3 >= 300) {
                q(null);
            }
        }
    }

    public final void p(@androidx.annotation.i0 String str) throws IOException {
        if (a() && str != null) {
            s(str.getBytes());
        }
    }

    public final void s(final byte[] bArr) throws IOException {
        e("onNetworkResponseBody", new ur(bArr) { // from class: com.google.android.gms.internal.ads.sr

            /* renamed from: a, reason: collision with root package name */
            private final byte[] f5293a;

            {
                this.f5293a = bArr;
            }

            @Override // com.google.android.gms.internal.ads.ur
            public final void a(JsonWriter jsonWriter) throws NoSuchAlgorithmException, IOException {
                nr.k(this.f5293a, jsonWriter);
            }
        });
    }
}
