package b.i.c;

import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f {
    private f() {
    }

    @i0
    public static String a(@i0 String str, @h0 String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(strArrSplit, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    @i0
    public static String b(@i0 String[] strArr, @h0 String str) {
        if (strArr == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), strArrSplit)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean c(@i0 String str, @h0 String str2) {
        if (str == null) {
            return false;
        }
        return e(str.split("/"), str2.split("/"));
    }

    @h0
    public static String[] d(@i0 String[] strArr, @h0 String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), strArrSplit)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean e(@h0 String[] strArr, @h0 String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        if (strArr.length != 2) {
            return false;
        }
        if ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }
}
