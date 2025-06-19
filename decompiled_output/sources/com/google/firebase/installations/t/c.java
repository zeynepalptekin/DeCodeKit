package com.google.firebase.installations.t;

import androidx.annotation.h0;
import c.a.d.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final String f6986c = "PersistedInstallation";
    private static final String d = "Fid";
    private static final String e = "AuthToken";
    private static final String f = "RefreshToken";
    private static final String g = "TokenCreationEpochInSecs";
    private static final String h = "ExpiresInSecs";
    private static final String i = "Status";
    private static final String j = "FisError";

    /* renamed from: a, reason: collision with root package name */
    private final File f6987a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final e f6988b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(@h0 e eVar) {
        this.f6987a = new File(eVar.l().getFilesDir(), "PersistedInstallation." + eVar.r() + ".json");
        this.f6988b = eVar;
    }

    private JSONObject c() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f6987a);
            while (true) {
                try {
                    int r5 = fileInputStream.read(bArr, 0, 16384);
                    if (r5 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, r5);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused2) {
            return new JSONObject();
        }
    }

    public void a() {
        this.f6987a.delete();
    }

    @h0
    public d b(@h0 d dVar) throws JSONException, IOException {
        File fileCreateTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(d, dVar.d());
            jSONObject.put(i, dVar.g().ordinal());
            jSONObject.put(e, dVar.b());
            jSONObject.put(f, dVar.f());
            jSONObject.put(g, dVar.h());
            jSONObject.put(h, dVar.c());
            jSONObject.put(j, dVar.e());
            fileCreateTempFile = File.createTempFile(f6986c, "tmp", this.f6988b.l().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (fileCreateTempFile.renameTo(this.f6987a)) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    @h0
    public d d() throws IOException {
        JSONObject jSONObjectC = c();
        String strOptString = jSONObjectC.optString(d, null);
        int r3 = jSONObjectC.optInt(i, a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectC.optString(e, null);
        String strOptString3 = jSONObjectC.optString(f, null);
        long jOptLong = jSONObjectC.optLong(g, 0L);
        long jOptLong2 = jSONObjectC.optLong(h, 0L);
        return d.a().d(strOptString).g(a.values()[r3]).b(strOptString2).f(strOptString3).h(jOptLong).c(jOptLong2).e(jSONObjectC.optString(j, null)).a();
    }
}
