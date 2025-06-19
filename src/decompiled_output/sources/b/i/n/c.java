package b.i.n;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import androidx.annotation.i0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1111a = "ICUCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Method f1112b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f1113c;

    static {
        int r2 = Build.VERSION.SDK_INT;
        if (r2 >= 21) {
            if (r2 < 24) {
                try {
                    f1113c = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f1112b = cls.getMethod("getScript", String.class);
                f1113c = cls.getMethod("addLikelySubtags", String.class);
            }
        } catch (Exception e2) {
            f1112b = null;
            f1113c = null;
            Log.w(f1111a, e2);
        }
    }

    private c() {
    }

    private static String a(Locale locale) {
        String string = locale.toString();
        try {
            if (f1113c != null) {
                return (String) f1113c.invoke(null, string);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w(f1111a, e);
        }
        return string;
    }

    private static String b(String str) {
        try {
            if (f1112b != null) {
                return (String) f1112b.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w(f1111a, e);
        }
        return null;
    }

    @i0
    public static String c(Locale locale) {
        int r1 = Build.VERSION.SDK_INT;
        if (r1 >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (r1 >= 21) {
            try {
                return ((Locale) f1113c.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w(f1111a, e);
                return locale.getScript();
            }
        }
        String strA = a(locale);
        if (strA != null) {
            return b(strA);
        }
        return null;
    }
}
