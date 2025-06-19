package b.i.c.j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.z0;
import b.i.p.f0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class a {
    private a() {
    }

    @h0
    public static ColorStateList a(@h0 Resources resources, @h0 XmlPullParser xmlPullParser, @i0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @h0
    public static ColorStateList b(@h0 Resources resources, @h0 XmlPullParser xmlPullParser, @h0 AttributeSet attributeSet, @i0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return d(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @i0
    public static ColorStateList c(@h0 Resources resources, @z0 int r1, @i0 Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(r1), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList d(@androidx.annotation.h0 android.content.res.Resources r17, @androidx.annotation.h0 org.xmlpull.v1.XmlPullParser r18, @androidx.annotation.h0 android.util.AttributeSet r19, @androidx.annotation.i0 android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r19
            int r1 = r18.getDepth()
            r2 = 1
            int r1 = r1 + r2
            r3 = 20
            int[][] r4 = new int[r3][]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = 0
        L10:
            int r7 = r18.next()
            if (r7 == r2) goto Lae
            int r8 = r18.getDepth()
            if (r8 >= r1) goto L1f
            r9 = 3
            if (r7 == r9) goto Lae
        L1f:
            r9 = 2
            if (r7 != r9) goto La7
            if (r8 > r1) goto La7
            java.lang.String r7 = r18.getName()
            java.lang.String r8 = "item"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L32
            goto La7
        L32:
            int[] r7 = b.i.a.j.ColorStateListItem
            r8 = r17
            r9 = r20
            android.content.res.TypedArray r7 = f(r8, r9, r0, r7)
            int r10 = b.i.a.j.ColorStateListItem_android_color
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r7.getColor(r10, r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = b.i.a.j.ColorStateListItem_android_alpha
            boolean r12 = r7.hasValue(r12)
            if (r12 == 0) goto L56
            int r12 = b.i.a.j.ColorStateListItem_android_alpha
        L51:
            float r11 = r7.getFloat(r12, r11)
            goto L61
        L56:
            int r12 = b.i.a.j.ColorStateListItem_alpha
            boolean r12 = r7.hasValue(r12)
            if (r12 == 0) goto L61
            int r12 = b.i.a.j.ColorStateListItem_alpha
            goto L51
        L61:
            r7.recycle()
            int r7 = r19.getAttributeCount()
            int[] r12 = new int[r7]
            r13 = 0
            r14 = 0
        L6c:
            if (r13 >= r7) goto L91
            int r15 = r0.getAttributeNameResource(r13)
            r2 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r2) goto L8d
            r2 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r2) goto L8d
            int r2 = b.i.a.C0054a.alpha
            if (r15 == r2) goto L8d
            int r2 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r13, r5)
            if (r16 == 0) goto L89
            goto L8a
        L89:
            int r15 = -r15
        L8a:
            r12[r14] = r15
            r14 = r2
        L8d:
            int r13 = r13 + 1
            r2 = 1
            goto L6c
        L91:
            int[] r2 = android.util.StateSet.trimStateSet(r12, r14)
            int r7 = e(r10, r11)
            int[] r3 = b.i.c.j.f.a(r3, r6, r7)
            java.lang.Object[] r2 = b.i.c.j.f.c(r4, r6, r2)
            r4 = r2
            int[][] r4 = (int[][]) r4
            int r6 = r6 + 1
            goto Lab
        La7:
            r8 = r17
            r9 = r20
        Lab:
            r2 = 1
            goto L10
        Lae:
            int[] r0 = new int[r6]
            int[][] r1 = new int[r6][]
            java.lang.System.arraycopy(r3, r5, r0, r5, r6)
            java.lang.System.arraycopy(r4, r5, r1, r5, r6)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.c.j.a.d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    @k
    private static int e(@k int r1, @r(from = 0.0d, to = 1.0d) float f) {
        return (r1 & f0.s) | (Math.round(Color.alpha(r1) * f) << 24);
    }

    private static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] r3) {
        return theme == null ? resources.obtainAttributes(attributeSet, r3) : theme.obtainStyledAttributes(attributeSet, r3, 0, 0);
    }
}
