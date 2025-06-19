package com.google.firebase.installations.t;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.u;
import androidx.annotation.x0;
import c.a.d.e;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f6983c = "com.google.android.gms.appid";
    private static final String d = "|S||P|";
    private static final String e = "|S|id";
    private static final String f = "|T|";
    private static final String g = "|";
    private static final String h = "token";
    private static final String i = "{";
    private static final String[] j = {"*", "FCM", c.a.b.b.j.a.t, ""};

    /* renamed from: a, reason: collision with root package name */
    @u("iidPrefs")
    private final SharedPreferences f6984a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6985b;

    @x0
    public b(@h0 SharedPreferences sharedPreferences, @i0 String str) {
        this.f6984a = sharedPreferences;
        this.f6985b = str;
    }

    public b(@h0 e eVar) {
        this.f6984a = eVar.l().getSharedPreferences(f6983c, 0);
        this.f6985b = b(eVar);
    }

    private String a(@h0 String str, @h0 String str2) {
        return f + str + g + str2;
    }

    private static String b(e eVar) {
        String strM = eVar.q().m();
        if (strM != null) {
            return strM;
        }
        String strJ = eVar.q().j();
        if (!strJ.startsWith("1:") && !strJ.startsWith("2:")) {
            return strJ;
        }
        String[] strArrSplit = strJ.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @i0
    private static String c(@h0 PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString(h);
        } catch (JSONException unused) {
            return null;
        }
    }

    @i0
    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored " + e2);
            return null;
        }
    }

    @i0
    private String g() {
        String string;
        synchronized (this.f6984a) {
            string = this.f6984a.getString(e, null);
        }
        return string;
    }

    @i0
    private String h() {
        synchronized (this.f6984a) {
            String string = this.f6984a.getString(d, null);
            if (string == null) {
                return null;
            }
            PublicKey publicKeyE = e(string);
            if (publicKeyE == null) {
                return null;
            }
            return c(publicKeyE);
        }
    }

    @i0
    public String f() {
        synchronized (this.f6984a) {
            String strG = g();
            if (strG != null) {
                return strG;
            }
            return h();
        }
    }

    @i0
    public String i() {
        synchronized (this.f6984a) {
            for (String str : j) {
                String string = this.f6984a.getString(a(this.f6985b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith(i)) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
