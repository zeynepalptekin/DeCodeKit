package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2592a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f2593b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f2594c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private p() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static Map<String, String> a(@RecentlyNonNull URI r6, @RecentlyNonNull String str) {
        Map<String, String> mapEmptyMap = Collections.emptyMap();
        String rawQuery = r6.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            mapEmptyMap = new HashMap<>();
            Scanner scanner = new Scanner(rawQuery);
            scanner.useDelimiter("&");
            while (scanner.hasNext()) {
                String[] strArrSplit = scanner.next().split("=");
                if (strArrSplit.length == 0 || strArrSplit.length > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                String strB = b(strArrSplit[0], str);
                String strB2 = null;
                if (strArrSplit.length == 2) {
                    strB2 = b(strArrSplit[1], str);
                }
                mapEmptyMap.put(strB, strB2);
            }
        }
        return mapEmptyMap;
    }

    private static String b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
