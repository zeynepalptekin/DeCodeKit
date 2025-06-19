package b.i.c.j;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.p0;
import b.i.a;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f999a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f1000b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f1001c = 2;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f1002a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f1003b;

        a(@k int r4, @k int r5) {
            this.f1002a = new int[]{r4, r5};
            this.f1003b = new float[]{0.0f, 1.0f};
        }

        a(@k int r4, @k int r5, @k int r6) {
            this.f1002a = new int[]{r4, r5, r6};
            this.f1003b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(@h0 List<Integer> list, @h0 List<Float> list2) {
            int size = list.size();
            this.f1002a = new int[size];
            this.f1003b = new float[size];
            for (int r1 = 0; r1 < size; r1++) {
                this.f1002a[r1] = list.get(r1).intValue();
                this.f1003b[r1] = list2.get(r1).floatValue();
            }
        }
    }

    private e() {
    }

    private static a a(@i0 a aVar, @k int r1, @k int r2, boolean z, @k int r4) {
        return aVar != null ? aVar : z ? new a(r1, r4, r2) : new a(r1, r2);
    }

    static Shader b(@h0 Resources resources, @h0 XmlPullParser xmlPullParser, @i0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return c(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    static Shader c(@h0 Resources resources, @h0 XmlPullParser xmlPullParser, @h0 AttributeSet attributeSet, @i0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayS = h.s(resources, theme, attributeSet, a.j.GradientColor);
        float fJ = h.j(typedArrayS, xmlPullParser, "startX", a.j.GradientColor_android_startX, 0.0f);
        float fJ2 = h.j(typedArrayS, xmlPullParser, "startY", a.j.GradientColor_android_startY, 0.0f);
        float fJ3 = h.j(typedArrayS, xmlPullParser, "endX", a.j.GradientColor_android_endX, 0.0f);
        float fJ4 = h.j(typedArrayS, xmlPullParser, "endY", a.j.GradientColor_android_endY, 0.0f);
        float fJ5 = h.j(typedArrayS, xmlPullParser, "centerX", a.j.GradientColor_android_centerX, 0.0f);
        float fJ6 = h.j(typedArrayS, xmlPullParser, "centerY", a.j.GradientColor_android_centerY, 0.0f);
        int r5 = h.k(typedArrayS, xmlPullParser, "type", a.j.GradientColor_android_type, 0);
        int r6 = h.f(typedArrayS, xmlPullParser, "startColor", a.j.GradientColor_android_startColor, 0);
        boolean zR = h.r(xmlPullParser, "centerColor");
        int r2 = h.f(typedArrayS, xmlPullParser, "centerColor", a.j.GradientColor_android_centerColor, 0);
        int r3 = h.f(typedArrayS, xmlPullParser, "endColor", a.j.GradientColor_android_endColor, 0);
        int r4 = h.k(typedArrayS, xmlPullParser, "tileMode", a.j.GradientColor_android_tileMode, 0);
        float fJ7 = h.j(typedArrayS, xmlPullParser, "gradientRadius", a.j.GradientColor_android_gradientRadius, 0.0f);
        typedArrayS.recycle();
        a aVarA = a(d(resources, xmlPullParser, attributeSet, theme), r6, r3, zR, r2);
        if (r5 != 1) {
            return r5 != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f1002a, aVarA.f1003b, e(r4)) : new SweepGradient(fJ5, fJ6, aVarA.f1002a, aVarA.f1003b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f1002a, aVarA.f1003b, e(r4));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new b.i.c.j.e.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static b.i.c.j.e.a d(@androidx.annotation.h0 android.content.res.Resources r8, @androidx.annotation.h0 org.xmlpull.v1.XmlPullParser r9, @androidx.annotation.h0 android.util.AttributeSet r10, @androidx.annotation.i0 android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = b.i.a.j.GradientColorItem
            android.content.res.TypedArray r3 = b.i.c.j.h.s(r8, r11, r10, r3)
            int r5 = b.i.a.j.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = b.i.a.j.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = b.i.a.j.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = b.i.a.j.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            b.i.c.j.e$a r8 = new b.i.c.j.e$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.c.j.e.d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):b.i.c.j.e$a");
    }

    private static Shader.TileMode e(int r1) {
        return r1 != 1 ? r1 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
