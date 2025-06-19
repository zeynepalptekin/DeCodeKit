package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@d0
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2595a = Pattern.compile("\\\\.");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f2596b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private r() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean a(@androidx.annotation.i0 Object obj, @androidx.annotation.i0 Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                if (!a(jSONObject.get((String) com.google.android.gms.common.internal.r.k(next)), jSONObject2.get(next))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return obj.equals(obj2);
        }
        JSONArray jSONArray = (JSONArray) obj;
        JSONArray jSONArray2 = (JSONArray) obj2;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int r2 = 0; r2 < jSONArray.length(); r2++) {
            try {
                if (!a(jSONArray.get(r2), jSONArray2.get(r2))) {
                    return false;
                }
            } catch (JSONException unused) {
                return false;
            }
        }
        return true;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static String b(@androidx.annotation.i0 String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f2596b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char cCharAt = matcher.group().charAt(0);
            if (cCharAt == '\f') {
                str2 = "\\\\f";
            } else if (cCharAt == '\r') {
                str2 = "\\\\r";
            } else if (cCharAt == '\"') {
                str2 = "\\\\\\\"";
            } else if (cCharAt == '/') {
                str2 = "\\\\/";
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        str2 = "\\\\b";
                        break;
                    case '\t':
                        str2 = "\\\\t";
                        break;
                    case '\n':
                        str2 = "\\\\n";
                        break;
                }
            } else {
                str2 = "\\\\\\\\";
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static String c(@RecentlyNonNull String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strA = i0.a(str);
        Matcher matcher = f2595a.matcher(strA);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char cCharAt = matcher.group().charAt(1);
            if (cCharAt == '\"') {
                str2 = "\"";
            } else if (cCharAt == '/') {
                str2 = "/";
            } else if (cCharAt == '\\') {
                str2 = "\\\\";
            } else if (cCharAt == 'b') {
                str2 = "\b";
            } else if (cCharAt == 'f') {
                str2 = "\f";
            } else if (cCharAt == 'n') {
                str2 = "\n";
            } else if (cCharAt == 'r') {
                str2 = "\r";
            } else {
                if (cCharAt != 't') {
                    throw new IllegalStateException("Found an escaped character that should never be.");
                }
                str2 = "\t";
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        if (stringBuffer == null) {
            return strA;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
