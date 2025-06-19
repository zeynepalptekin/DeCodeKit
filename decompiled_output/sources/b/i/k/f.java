package b.i.k;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.q0;
import androidx.annotation.z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    private static final f f1058b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private h f1059a;

    private f(h hVar) {
        this.f1059a = hVar;
    }

    @h0
    public static f a(@h0 Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? n(new LocaleList(localeArr)) : new f(new g(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @h0
    public static f c(@i0 String str) {
        if (str == null || str.isEmpty()) {
            return g();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int r2 = 0; r2 < length; r2++) {
            localeArr[r2] = Build.VERSION.SDK_INT >= 21 ? Locale.forLanguageTag(strArrSplit[r2]) : b(strArrSplit[r2]);
        }
        return a(localeArr);
    }

    @q0(min = 1)
    @h0
    public static f e() {
        return Build.VERSION.SDK_INT >= 24 ? n(LocaleList.getAdjustedDefault()) : a(Locale.getDefault());
    }

    @q0(min = 1)
    @h0
    public static f f() {
        return Build.VERSION.SDK_INT >= 24 ? n(LocaleList.getDefault()) : a(Locale.getDefault());
    }

    @h0
    public static f g() {
        return f1058b;
    }

    @m0(24)
    @h0
    public static f n(@h0 LocaleList localeList) {
        return new f(new i(localeList));
    }

    @m0(24)
    @Deprecated
    public static f o(Object obj) {
        return n((LocaleList) obj);
    }

    public Locale d(int r2) {
        return this.f1059a.get(r2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f1059a.equals(((f) obj).f1059a);
    }

    @i0
    public Locale h(@h0 String[] strArr) {
        return this.f1059a.d(strArr);
    }

    public int hashCode() {
        return this.f1059a.hashCode();
    }

    @z(from = RecyclerView.Q0)
    public int i(Locale locale) {
        return this.f1059a.c(locale);
    }

    public boolean j() {
        return this.f1059a.isEmpty();
    }

    @z(from = FabTransformationScrimBehavior.j)
    public int k() {
        return this.f1059a.size();
    }

    @h0
    public String l() {
        return this.f1059a.a();
    }

    @i0
    public Object m() {
        return this.f1059a.b();
    }

    public String toString() {
        return this.f1059a.toString();
    }
}
