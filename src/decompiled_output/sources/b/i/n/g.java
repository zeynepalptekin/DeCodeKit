package b.i.n;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Locale f1131a = new Locale("", "");

    /* renamed from: b, reason: collision with root package name */
    private static final String f1132b = "Arab";

    /* renamed from: c, reason: collision with root package name */
    private static final String f1133c = "Hebr";

    private g() {
    }

    private static int a(@h0 Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(@i0 Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f1131a)) {
            return 0;
        }
        String strC = c.c(locale);
        return strC == null ? a(locale) : (strC.equalsIgnoreCase(f1132b) || strC.equalsIgnoreCase(f1133c)) ? 1 : 0;
    }

    @h0
    public static String c(@h0 String str) {
        String str2;
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.htmlEncode(str);
        }
        StringBuilder sb = new StringBuilder();
        for (int r1 = 0; r1 < str.length(); r1++) {
            char cCharAt = str.charAt(r1);
            if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == '<') {
                str2 = "&lt;";
            } else if (cCharAt == '>') {
                str2 = "&gt;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt != '\'') {
                sb.append(cCharAt);
            } else {
                str2 = "&#39;";
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}
