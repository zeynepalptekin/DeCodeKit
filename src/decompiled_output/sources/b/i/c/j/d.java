package b.i.c.j;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.i.a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f989a = 400;

    /* renamed from: b, reason: collision with root package name */
    private static final int f990b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f991c = 0;
    public static final int d = 1;
    public static final int e = -1;
    private static final int f = 500;

    public interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final C0056d[] f992a;

        public c(@h0 C0056d[] c0056dArr) {
            this.f992a = c0056dArr;
        }

        @h0
        public C0056d[] a() {
            return this.f992a;
        }
    }

    /* renamed from: b.i.c.j.d$d, reason: collision with other inner class name */
    public static final class C0056d {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final String f993a;

        /* renamed from: b, reason: collision with root package name */
        private int f994b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f995c;
        private String d;
        private int e;
        private int f;

        public C0056d(@h0 String str, int r2, boolean z, @i0 String str2, int r5, int r6) {
            this.f993a = str;
            this.f994b = r2;
            this.f995c = z;
            this.d = str2;
            this.e = r5;
            this.f = r6;
        }

        @h0
        public String a() {
            return this.f993a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        @i0
        public String d() {
            return this.d;
        }

        public int e() {
            return this.f994b;
        }

        public boolean f() {
            return this.f995c;
        }
    }

    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final b.i.l.a f996a;

        /* renamed from: b, reason: collision with root package name */
        private final int f997b;

        /* renamed from: c, reason: collision with root package name */
        private final int f998c;

        public e(@h0 b.i.l.a aVar, int r2, int r3) {
            this.f996a = aVar;
            this.f998c = r2;
            this.f997b = r3;
        }

        public int a() {
            return this.f998c;
        }

        @h0
        public b.i.l.a b() {
            return this.f996a;
        }

        public int c() {
            return this.f997b;
        }
    }

    private d() {
    }

    private static int a(TypedArray typedArray, int r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(r3);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(r3, typedValue);
        return typedValue.type;
    }

    @i0
    public static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, @androidx.annotation.e int r6) throws Resources.NotFoundException {
        if (r6 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(r6);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int r62 = 0; r62 < typedArrayObtainTypedArray.length(); r62++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(r62, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(r6)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    @i0
    private static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    @i0
    private static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.FontFamily);
        String string = typedArrayObtainAttributes.getString(a.j.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(a.j.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(a.j.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(a.j.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(a.j.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(a.j.FontFamily_fontProviderFetchTimeout, f);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new b.i.l.a(string, string2, string3, c(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((C0056d[]) arrayList.toArray(new C0056d[arrayList.size()]));
    }

    private static C0056d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.FontFamilyFont);
        int r4 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(a.j.FontFamilyFont_fontWeight) ? a.j.FontFamilyFont_fontWeight : a.j.FontFamilyFont_android_fontWeight, f989a);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(a.j.FontFamilyFont_fontStyle) ? a.j.FontFamilyFont_fontStyle : a.j.FontFamilyFont_android_fontStyle, 0);
        int r0 = typedArrayObtainAttributes.hasValue(a.j.FontFamilyFont_ttcIndex) ? a.j.FontFamilyFont_ttcIndex : a.j.FontFamilyFont_android_ttcIndex;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(a.j.FontFamilyFont_fontVariationSettings) ? a.j.FontFamilyFont_fontVariationSettings : a.j.FontFamilyFont_android_fontVariationSettings);
        int r7 = typedArrayObtainAttributes.getInt(r0, 0);
        int r02 = typedArrayObtainAttributes.hasValue(a.j.FontFamilyFont_font) ? a.j.FontFamilyFont_font : a.j.FontFamilyFont_android_font;
        int resourceId = typedArrayObtainAttributes.getResourceId(r02, 0);
        String string2 = typedArrayObtainAttributes.getString(r02);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0056d(string2, r4, z, string, r7, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int r0 = 1;
        while (r0 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                r0++;
            } else if (next == 3) {
                r0--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
