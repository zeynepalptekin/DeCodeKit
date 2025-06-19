package com.google.firebase.installations.u;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import c.a.d.r.c;
import c.a.d.w.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.util.n;
import com.google.android.gms.measurement.c.a;
import com.google.firebase.installations.k;
import com.google.firebase.installations.u.d;
import com.google.firebase.installations.u.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static final String B = "a:";
    private static final String C = "Firebase-Installations";

    @d0
    static final String D = "Invalid Expiration Timestamp.";
    private static final String d = "firebaseinstallations.googleapis.com";
    private static final String e = "projects/%s/installations";
    private static final String f = "projects/%s/installations/%s/authTokens:generate";
    private static final String g = "projects/%s/installations/%s";
    private static final String h = "v1";
    private static final String i = "FIS_v2";
    private static final String j = "Content-Type";
    private static final String k = "Accept";
    private static final String l = "application/json";
    private static final String m = "Content-Encoding";
    private static final String n = "gzip";
    private static final String o = "Cache-Control";
    private static final String p = "no-cache";
    private static final String q = "fire-installations-id";
    private static final String r = "x-firebase-client-log-type";
    private static final String s = "x-firebase-client";
    private static final String t = "X-Android-Package";
    private static final String u = "X-Android-Cert";
    private static final String v = "x-goog-fis-android-iid-migration-auth";
    private static final String w = "x-goog-api-key";
    private static final int x = 10000;
    private static final int z = 1;

    /* renamed from: a, reason: collision with root package name */
    private final Context f7002a;

    /* renamed from: b, reason: collision with root package name */
    private final h f7003b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a.d.r.c f7004c;
    private static final Pattern y = Pattern.compile("[0-9]+s");
    private static final Charset A = Charset.forName("UTF-8");

    public c(@h0 Context context, @i0 h hVar, @i0 c.a.d.r.c cVar) {
        this.f7002a = context;
        this.f7003b = hVar;
        this.f7004c = cVar;
    }

    private static String a(@i0 String str, @h0 String str2, @h0 String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static JSONObject b(String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", i);
            jSONObject.put("sdkVersion", "a:16.3.2");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static JSONObject c() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private String g() {
        try {
            byte[] bArrB = com.google.android.gms.common.util.a.b(this.f7002a, this.f7002a.getPackageName());
            if (bArrB != null) {
                return n.c(bArrB, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f7002a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("ContentValues", "No such package: " + this.f7002a.getPackageName(), e2);
            return null;
        }
    }

    private static byte[] h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static void i() {
        Log.e(C, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void j(HttpURLConnection httpURLConnection, @i0 String str, @h0 String str2, @h0 String str3) throws IOException {
        String strN = n(httpURLConnection);
        if (TextUtils.isEmpty(strN)) {
            return;
        }
        Log.w(C, strN);
        Log.w(C, a(str, str2, str3));
    }

    private HttpURLConnection k(URL url, String str) throws IOException {
        c.a aVarA;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(x);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(x);
        httpURLConnection.addRequestProperty(j, l);
        httpURLConnection.addRequestProperty(k, l);
        httpURLConnection.addRequestProperty(m, n);
        httpURLConnection.addRequestProperty(o, p);
        httpURLConnection.addRequestProperty(t, this.f7002a.getPackageName());
        c.a.d.r.c cVar = this.f7004c;
        if (cVar != null && this.f7003b != null && (aVarA = cVar.a(q)) != c.a.NONE) {
            httpURLConnection.addRequestProperty(s, this.f7003b.a());
            httpURLConnection.addRequestProperty(r, Integer.toString(aVarA.e()));
        }
        httpURLConnection.addRequestProperty(u, g());
        httpURLConnection.addRequestProperty(w, str);
        return httpURLConnection;
    }

    @d0
    static long l(String str) {
        r.b(y.matcher(str).matches(), D);
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d m(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, A));
        e.a aVarA = e.a();
        d.a aVarA2 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(a.C0190a.f6334b)) {
                aVarA2.f(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarA2.c(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarA2.d(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarA.c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarA.d(l(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarA2.b(aVarA.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA2.e(d.b.OK).a();
    }

    @i0
    private static String n(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, A));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    private e o(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, A));
        e.a aVarA = e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarA.d(l(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA.b(e.b.OK).a();
    }

    private void p(HttpURLConnection httpURLConnection, @h0 String str, @h0 String str2) throws IOException {
        r(httpURLConnection, h(b(str, str2)));
    }

    private void q(HttpURLConnection httpURLConnection) throws IOException {
        r(httpURLConnection, h(c()));
    }

    private static void r(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @h0
    public d d(@h0 String str, @h0 String str2, @h0 String str3, @h0 String str4, @i0 String str5) throws IOException {
        int r2 = 0;
        URL url = new URL(String.format("https://%s/%s/%s", d, h, String.format(e, str3)));
        while (r2 <= 1) {
            HttpURLConnection httpURLConnectionK = k(url, str);
            try {
                httpURLConnectionK.setRequestMethod("POST");
                httpURLConnectionK.setDoOutput(true);
                if (str5 != null) {
                    httpURLConnectionK.addRequestProperty(v, str5);
                }
                p(httpURLConnectionK, str2, str4);
                int responseCode = httpURLConnectionK.getResponseCode();
                if (responseCode == 200) {
                    return m(httpURLConnectionK);
                }
                j(httpURLConnectionK, str4, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    i();
                    return d.a().e(d.b.BAD_CONFIG).a();
                }
                r2++;
            } finally {
                httpURLConnectionK.disconnect();
            }
        }
        throw new IOException();
    }

    @h0
    public void e(@h0 String str, @h0 String str2, @h0 String str3, @h0 String str4) throws c.a.d.h, IOException {
        int r2 = 0;
        URL url = new URL(String.format("https://%s/%s/%s", d, h, String.format(g, str3, str2)));
        while (r2 <= 1) {
            HttpURLConnection httpURLConnectionK = k(url, str);
            try {
                httpURLConnectionK.setRequestMethod("DELETE");
                httpURLConnectionK.addRequestProperty("Authorization", "FIS_v2 " + str4);
                int responseCode = httpURLConnectionK.getResponseCode();
                if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                    j(httpURLConnectionK, null, str, str3);
                    if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                        i();
                        throw new k("Bad config while trying to delete FID", k.a.BAD_CONFIG);
                    }
                    r2++;
                }
                return;
            } finally {
                httpURLConnectionK.disconnect();
            }
        }
        throw new IOException();
    }

    @h0
    public e f(@h0 String str, @h0 String str2, @h0 String str3, @h0 String str4) throws IOException {
        int r2 = 0;
        URL url = new URL(String.format("https://%s/%s/%s", d, h, String.format(f, str3, str2)));
        while (r2 <= 1) {
            HttpURLConnection httpURLConnectionK = k(url, str);
            try {
                httpURLConnectionK.setRequestMethod("POST");
                httpURLConnectionK.addRequestProperty("Authorization", "FIS_v2 " + str4);
                q(httpURLConnectionK);
                int responseCode = httpURLConnectionK.getResponseCode();
                if (responseCode == 200) {
                    return o(httpURLConnectionK);
                }
                j(httpURLConnectionK, null, str, str3);
                if (responseCode != 401 && responseCode != 404) {
                    if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                        i();
                        return e.a().b(e.b.BAD_CONFIG).a();
                    }
                    r2++;
                }
                return e.a().b(e.b.AUTH_ERROR).a();
            } finally {
                httpURLConnectionK.disconnect();
            }
        }
        throw new IOException();
    }
}
