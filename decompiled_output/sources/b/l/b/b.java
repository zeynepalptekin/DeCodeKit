package b.l.b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.i0;
import androidx.annotation.m0;

@m0(19)
/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1302a = "DocumentFile";

    /* renamed from: b, reason: collision with root package name */
    private static final int f1303b = 512;

    private b() {
    }

    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(g(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strG = g(context, uri);
        int r4 = n(context, uri, "flags", 0);
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        if ((r4 & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(strG) || (r4 & 8) == 0) {
            return (TextUtils.isEmpty(strG) || (r4 & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void c(@i0 AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) throws Exception {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e) {
            Log.w(f1302a, "Failed query: " + e);
            return false;
        } finally {
            c(cursorQuery);
        }
    }

    public static long e(Context context, Uri uri) {
        return o(context, uri, "flags", 0L);
    }

    @i0
    public static String f(Context context, Uri uri) {
        return p(context, uri, "_display_name", null);
    }

    @i0
    private static String g(Context context, Uri uri) {
        return p(context, uri, "mime_type", null);
    }

    @i0
    public static String h(Context context, Uri uri) {
        String strG = g(context, uri);
        if ("vnd.android.document/directory".equals(strG)) {
            return null;
        }
        return strG;
    }

    public static boolean i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(g(context, uri));
    }

    public static boolean j(Context context, Uri uri) {
        String strG = g(context, uri);
        return ("vnd.android.document/directory".equals(strG) || TextUtils.isEmpty(strG)) ? false : true;
    }

    public static boolean k(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (e(context, uri) & 512) != 0;
    }

    public static long l(Context context, Uri uri) {
        return o(context, uri, "last_modified", 0L);
    }

    public static long m(Context context, Uri uri) {
        return o(context, uri, "_size", 0L);
    }

    private static int n(Context context, Uri uri, String str, int r5) {
        return (int) o(context, uri, str, r5);
    }

    private static long o(Context context, Uri uri, String str, long j) throws Exception {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j : cursorQuery.getLong(0);
        } catch (Exception e) {
            Log.w(f1302a, "Failed query: " + e);
            return j;
        } finally {
            c(cursorQuery);
        }
    }

    @i0
    private static String p(Context context, Uri uri, String str, @i0 String str2) throws Exception {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? str2 : cursorQuery.getString(0);
        } catch (Exception e) {
            Log.w(f1302a, "Failed query: " + e);
            return str2;
        } finally {
            c(cursorQuery);
        }
    }
}
