package b.i.n.h;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.i.o.g;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f1140a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<C0069b> f1141b = new a();

    class a implements Comparator<C0069b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0069b c0069b, C0069b c0069b2) {
            int r5;
            int r6;
            int r0 = c0069b.f1144c;
            int r1 = c0069b2.f1144c;
            if (r0 < r1) {
                return -1;
            }
            if (r0 <= r1 && (r5 = c0069b.d) >= (r6 = c0069b2.d)) {
                return r5 > r6 ? -1 : 0;
            }
            return 1;
        }
    }

    /* renamed from: b.i.n.h.b$b, reason: collision with other inner class name */
    private static class C0069b {

        /* renamed from: a, reason: collision with root package name */
        URLSpan f1142a;

        /* renamed from: b, reason: collision with root package name */
        String f1143b;

        /* renamed from: c, reason: collision with root package name */
        int f1144c;
        int d;

        C0069b() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    private b() {
    }

    private static void a(@h0 TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void b(@h0 TextView textView, @h0 Pattern pattern, @i0 String str) {
        if (p()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            d(textView, pattern, str, null, null, null);
        }
    }

    public static void c(@h0 TextView textView, @h0 Pattern pattern, @i0 String str, @i0 Linkify.MatchFilter matchFilter, @i0 Linkify.TransformFilter transformFilter) {
        if (p()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            d(textView, pattern, str, null, matchFilter, transformFilter);
        }
    }

    @SuppressLint({"NewApi"})
    public static void d(@h0 TextView textView, @h0 Pattern pattern, @i0 String str, @i0 String[] strArr, @i0 Linkify.MatchFilter matchFilter, @i0 Linkify.TransformFilter transformFilter) {
        if (p()) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(textView.getText());
        if (h(spannableStringValueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(spannableStringValueOf);
            a(textView);
        }
    }

    public static boolean e(@h0 Spannable spannable, int r11) throws UnsupportedEncodingException {
        if (p()) {
            return Linkify.addLinks(spannable, r11);
        }
        if (r11 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((r11 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((r11 & 1) != 0) {
            l(arrayList, spannable, g.w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((r11 & 2) != 0) {
            l(arrayList, spannable, g.A, new String[]{"mailto:"}, null, null);
        }
        if ((r11 & 8) != 0) {
            m(arrayList, spannable);
        }
        o(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0069b c0069b = (C0069b) it.next();
            if (c0069b.f1142a == null) {
                j(c0069b.f1143b, c0069b.f1144c, c0069b.d, spannable);
            }
        }
        return true;
    }

    public static boolean f(@h0 Spannable spannable, @h0 Pattern pattern, @i0 String str) {
        return p() ? Linkify.addLinks(spannable, pattern, str) : h(spannable, pattern, str, null, null, null);
    }

    public static boolean g(@h0 Spannable spannable, @h0 Pattern pattern, @i0 String str, @i0 Linkify.MatchFilter matchFilter, @i0 Linkify.TransformFilter transformFilter) {
        return p() ? Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter) : h(spannable, pattern, str, null, matchFilter, transformFilter);
    }

    @SuppressLint({"NewApi"})
    public static boolean h(@h0 Spannable spannable, @h0 Pattern pattern, @i0 String str, @i0 String[] strArr, @i0 Linkify.MatchFilter matchFilter, @i0 Linkify.TransformFilter transformFilter) {
        if (p()) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f1140a;
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int r8 = 0;
        while (r8 < strArr.length) {
            String str2 = strArr[r8];
            r8++;
            strArr2[r8] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int r9 = matcher.start();
            int r0 = matcher.end();
            if (matchFilter != null ? matchFilter.acceptMatch(spannable, r9, r0) : true) {
                j(n(matcher.group(0), strArr2, matcher, transformFilter), r9, r0, spannable);
                z = true;
            }
        }
        return z;
    }

    public static boolean i(@h0 TextView textView, int r5) {
        if (p()) {
            return Linkify.addLinks(textView, r5);
        }
        if (r5 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (!e((Spannable) text, r5)) {
                return false;
            }
            a(textView);
            return true;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(text);
        if (!e(spannableStringValueOf, r5)) {
            return false;
        }
        a(textView);
        textView.setText(spannableStringValueOf);
        return true;
    }

    private static void j(String str, int r2, int r3, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), r2, r3, 33);
    }

    private static String k(String str) {
        return Build.VERSION.SDK_INT >= 28 ? WebView.findAddress(str) : b.i.n.h.a.c(str);
    }

    private static void l(ArrayList<C0069b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int r0 = matcher.start();
            int r1 = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, r0, r1)) {
                C0069b c0069b = new C0069b();
                c0069b.f1143b = n(matcher.group(0), strArr, matcher, transformFilter);
                c0069b.f1144c = r0;
                c0069b.d = r1;
                arrayList.add(c0069b);
            }
        }
    }

    private static void m(ArrayList<C0069b> arrayList, Spannable spannable) throws UnsupportedEncodingException {
        int r2;
        String string = spannable.toString();
        int r0 = 0;
        while (true) {
            try {
                String strK = k(string);
                if (strK != null && (r2 = string.indexOf(strK)) >= 0) {
                    C0069b c0069b = new C0069b();
                    int length = strK.length() + r2;
                    c0069b.f1144c = r2 + r0;
                    r0 += length;
                    c0069b.d = r0;
                    string = string.substring(length);
                    try {
                        c0069b.f1143b = "geo:0,0?q=" + URLEncoder.encode(strK, "UTF-8");
                        arrayList.add(c0069b);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    private static String n(@h0 String str, @h0 String[] strArr, Matcher matcher, @i0 Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int r10 = 0;
        while (true) {
            z = true;
            if (r10 >= strArr.length) {
                z = false;
                break;
            }
            if (str.regionMatches(true, 0, strArr[r10], 0, strArr[r10].length())) {
                if (!str.regionMatches(false, 0, strArr[r10], 0, strArr[r10].length())) {
                    str = strArr[r10] + str.substring(strArr[r10].length());
                }
            } else {
                r10++;
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    private static void o(ArrayList<C0069b> arrayList, Spannable spannable) {
        int r1;
        int r2 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int r12 = 0; r12 < uRLSpanArr.length; r12++) {
            C0069b c0069b = new C0069b();
            c0069b.f1142a = uRLSpanArr[r12];
            c0069b.f1144c = spannable.getSpanStart(uRLSpanArr[r12]);
            c0069b.d = spannable.getSpanEnd(uRLSpanArr[r12]);
            arrayList.add(c0069b);
        }
        Collections.sort(arrayList, f1141b);
        int size = arrayList.size();
        while (r2 < size - 1) {
            C0069b c0069b2 = arrayList.get(r2);
            int r3 = r2 + 1;
            C0069b c0069b3 = arrayList.get(r3);
            int r5 = c0069b2.f1144c;
            int r6 = c0069b3.f1144c;
            if (r5 <= r6 && (r1 = c0069b2.d) > r6) {
                int r4 = c0069b3.d;
                int r13 = (r4 > r1 && r1 - r5 <= r4 - r6) ? r1 - r5 < r4 - r6 ? r2 : -1 : r3;
                if (r13 != -1) {
                    Object obj = arrayList.get(r13).f1142a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(r13);
                    size--;
                }
            }
            r2 = r3;
        }
    }

    private static boolean p() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
