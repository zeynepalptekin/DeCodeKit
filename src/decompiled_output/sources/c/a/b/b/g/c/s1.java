package c.a.b.b.g.c;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class s1 {
    private static HashMap<String, String> f;
    private static Object k;
    private static boolean l;

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f1812a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f1813b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f1814c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean e = new AtomicBoolean();
    private static final HashMap<String, Boolean> g = new HashMap<>();
    private static final HashMap<String, Integer> h = new HashMap<>();
    private static final HashMap<String, Long> i = new HashMap<>();
    private static final HashMap<String, Float> j = new HashMap<>();
    private static String[] m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (s1.class) {
            if (f == null) {
                e.set(false);
                f = new HashMap<>();
                k = new Object();
                l = false;
                contentResolver.registerContentObserver(f1812a, true, new r1(null));
            } else if (e.getAndSet(false)) {
                f.clear();
                g.clear();
                h.clear();
                i.clear();
                j.clear();
                k = new Object();
                l = false;
            }
            Object obj = k;
            if (f.containsKey(str)) {
                String str3 = f.get(str);
                return str3 != null ? str3 : null;
            }
            for (String str4 : m) {
                if (str.startsWith(str4)) {
                    if (!l || f.isEmpty()) {
                        f.putAll(b(contentResolver, m));
                        l = true;
                        if (f.containsKey(str)) {
                            String str5 = f.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            Cursor cursorQuery = contentResolver.query(f1812a, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    d(obj, str, null);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                String string = cursorQuery.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                d(obj, str, string);
                String str6 = string != null ? string : null;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return str6;
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
    }

    private static Map<String, String> b(ContentResolver contentResolver, String... strArr) {
        Cursor cursorQuery = contentResolver.query(f1813b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (cursorQuery == null) {
            return treeMap;
        }
        while (cursorQuery.moveToNext()) {
            try {
                treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } finally {
                cursorQuery.close();
            }
        }
        return treeMap;
    }

    private static void d(Object obj, String str, String str2) {
        synchronized (s1.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }
}
