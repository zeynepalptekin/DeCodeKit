package b.i.m.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {
    private a() {
    }

    @i0
    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(28)
    public static CharSequence a(@h0 Context context, @h0 ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        int size = serviceInfo.getNamedContentLocales().size();
        if (size == 0) {
            return null;
        }
        String[] strArr = new String[size];
        int r2 = 0;
        Iterator<Locale> it = serviceInfo.getNamedContentLocales().iterator();
        while (it.hasNext()) {
            strArr[r2] = it.next().toLanguageTag();
            r2++;
        }
        Locale firstMatch = locales.getFirstMatch(strArr);
        if (firstMatch == null) {
            return null;
        }
        return serviceInfo.getNameForLocale(firstMatch);
    }
}
