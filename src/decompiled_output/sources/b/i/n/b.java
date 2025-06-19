package b.i.n;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.h0;
import androidx.annotation.i0;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1108a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f1109b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1110c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    public static final int h = 32;
    public static final int i = 256;
    public static final int j = 0;
    public static final int k = 63;

    private b() {
    }

    @h0
    public static Spanned a(@h0 String str, int r3) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, r3) : Html.fromHtml(str);
    }

    @h0
    public static Spanned b(@h0 String str, int r3, @i0 Html.ImageGetter imageGetter, @i0 Html.TagHandler tagHandler) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, r3, imageGetter, tagHandler) : Html.fromHtml(str, imageGetter, tagHandler);
    }

    @h0
    public static String c(@h0 Spanned spanned, int r3) {
        return Build.VERSION.SDK_INT >= 24 ? Html.toHtml(spanned, r3) : Html.toHtml(spanned);
    }
}
