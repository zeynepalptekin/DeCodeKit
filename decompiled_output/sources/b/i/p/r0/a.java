package b.i.p.r0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1275a = 16777216;

    /* renamed from: b, reason: collision with root package name */
    public static final int f1276b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f1277c = new String[0];
    private static final String d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    @Deprecated
    public a() {
    }

    @h0
    public static String[] a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f1277c;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f1277c;
        }
        String[] stringArray = bundle.getStringArray(d);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(e);
        }
        return stringArray != null ? stringArray : f1277c;
    }

    static int b(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean zContainsKey = bundle.containsKey(d);
        boolean zContainsKey2 = editorInfo.extras.containsKey(e);
        if (zContainsKey && zContainsKey2) {
            return 4;
        }
        if (zContainsKey) {
            return 3;
        }
        return zContainsKey2 ? 2 : 0;
    }

    public static void c(@h0 EditorInfo editorInfo, @i0 String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(d, strArr);
        editorInfo.extras.putStringArray(e, strArr);
    }
}
