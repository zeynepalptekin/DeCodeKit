package b.i.k;

import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.x0;
import androidx.annotation.z;
import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
final class g implements h {

    /* renamed from: c, reason: collision with root package name */
    private static final Locale[] f1060c = new Locale[0];
    private static final Locale d = new Locale("en", "XA");
    private static final Locale e = new Locale("ar", "XB");
    private static final Locale f = f.b("en-Latn");

    /* renamed from: a, reason: collision with root package name */
    private final Locale[] f1061a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final String f1062b;

    g(@h0 Locale... localeArr) {
        String string;
        if (localeArr.length == 0) {
            this.f1061a = f1060c;
            string = "";
        } else {
            Locale[] localeArr2 = new Locale[localeArr.length];
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            for (int r3 = 0; r3 < localeArr.length; r3++) {
                Locale locale = localeArr[r3];
                if (locale == null) {
                    throw new NullPointerException("list[" + r3 + "] is null");
                }
                if (hashSet.contains(locale)) {
                    throw new IllegalArgumentException("list[" + r3 + "] is a repetition");
                }
                Locale locale2 = (Locale) locale.clone();
                localeArr2[r3] = locale2;
                k(sb, locale2);
                if (r3 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
            this.f1061a = localeArr2;
            string = sb.toString();
        }
        this.f1062b = string;
    }

    private Locale e(Collection<String> collection, boolean z) {
        int r1 = f(collection, z);
        if (r1 == -1) {
            return null;
        }
        return this.f1061a[r1];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int f(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f1061a
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L8
            return r2
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = b.i.k.g.f
            int r6 = r4.g(r6)
            if (r6 != 0) goto L1b
            return r2
        L1b:
            if (r6 >= r0) goto L1e
            goto L21
        L1e:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L21:
            java.util.Iterator r5 = r5.iterator()
        L25:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = b.i.k.f.b(r1)
            int r1 = r4.g(r1)
            if (r1 != 0) goto L3c
            return r2
        L3c:
            if (r1 >= r6) goto L25
            r6 = r1
            goto L25
        L40:
            if (r6 != r0) goto L43
            return r2
        L43:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.k.g.f(java.util.Collection, boolean):int");
    }

    private int g(Locale locale) {
        int r0 = 0;
        while (true) {
            Locale[] localeArr = this.f1061a;
            if (r0 >= localeArr.length) {
                return ActivityChooserView.f.j;
            }
            if (j(locale, localeArr[r0]) > 0) {
                return r0;
            }
            r0++;
        }
    }

    private static String h(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            String script = locale.getScript();
            if (!script.isEmpty()) {
                return script;
            }
        }
        return "";
    }

    private static boolean i(Locale locale) {
        return d.equals(locale) || e.equals(locale);
    }

    @z(from = FabTransformationScrimBehavior.j, to = 1)
    private static int j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || i(locale) || i(locale2)) {
            return 0;
        }
        String strH = h(locale);
        if (!strH.isEmpty()) {
            return strH.equals(h(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    @x0
    static void k(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // b.i.k.h
    public String a() {
        return this.f1062b;
    }

    @Override // b.i.k.h
    @i0
    public Object b() {
        return null;
    }

    @Override // b.i.k.h
    public int c(Locale locale) {
        int r0 = 0;
        while (true) {
            Locale[] localeArr = this.f1061a;
            if (r0 >= localeArr.length) {
                return -1;
            }
            if (localeArr[r0].equals(locale)) {
                return r0;
            }
            r0++;
        }
    }

    @Override // b.i.k.h
    public Locale d(@h0 String[] strArr) {
        return e(Arrays.asList(strArr), false);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Locale[] localeArr = ((g) obj).f1061a;
        if (this.f1061a.length != localeArr.length) {
            return false;
        }
        int r1 = 0;
        while (true) {
            Locale[] localeArr2 = this.f1061a;
            if (r1 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[r1].equals(localeArr[r1])) {
                return false;
            }
            r1++;
        }
    }

    @Override // b.i.k.h
    public Locale get(int r3) {
        if (r3 >= 0) {
            Locale[] localeArr = this.f1061a;
            if (r3 < localeArr.length) {
                return localeArr[r3];
            }
        }
        return null;
    }

    public int hashCode() {
        int r0 = 1;
        int r1 = 0;
        while (true) {
            Locale[] localeArr = this.f1061a;
            if (r1 >= localeArr.length) {
                return r0;
            }
            r0 = (r0 * 31) + localeArr[r1].hashCode();
            r1++;
        }
    }

    @Override // b.i.k.h
    public boolean isEmpty() {
        return this.f1061a.length == 0;
    }

    @Override // b.i.k.h
    public int size() {
        return this.f1061a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int r1 = 0;
        while (true) {
            Locale[] localeArr = this.f1061a;
            if (r1 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[r1]);
            if (r1 < this.f1061a.length - 1) {
                sb.append(',');
            }
            r1++;
        }
    }
}
