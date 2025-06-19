package b.i.c.j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.p0;
import androidx.annotation.u0;
import org.xmlpull.v1.XmlPullParser;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1009a = "http://schemas.android.com/apk/res/android";

    private h() {
    }

    public static int a(@h0 Context context, int r3, int r4) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(r3, typedValue, true);
        return typedValue.resourceId != 0 ? r3 : r4;
    }

    public static boolean b(@h0 TypedArray typedArray, @u0 int r1, @u0 int r2, boolean z) {
        return typedArray.getBoolean(r1, typedArray.getBoolean(r2, z));
    }

    @i0
    public static Drawable c(@h0 TypedArray typedArray, @u0 int r1, @u0 int r2) {
        Drawable drawable = typedArray.getDrawable(r1);
        return drawable == null ? typedArray.getDrawable(r2) : drawable;
    }

    public static int d(@h0 TypedArray typedArray, @u0 int r1, @u0 int r2, int r3) {
        return typedArray.getInt(r1, typedArray.getInt(r2, r3));
    }

    public static boolean e(@h0 TypedArray typedArray, @h0 XmlPullParser xmlPullParser, @h0 String str, @u0 int r3, boolean z) {
        return !r(xmlPullParser, str) ? z : typedArray.getBoolean(r3, z);
    }

    @k
    public static int f(@h0 TypedArray typedArray, @h0 XmlPullParser xmlPullParser, @h0 String str, @u0 int r3, @k int r4) {
        return !r(xmlPullParser, str) ? r4 : typedArray.getColor(r3, r4);
    }

    @i0
    public static ColorStateList g(@h0 TypedArray typedArray, @h0 XmlPullParser xmlPullParser, @i0 Resources.Theme theme, @h0 String str, @u0 int r5) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(r5, typedValue);
        int r4 = typedValue.type;
        if (r4 != 2) {
            return (r4 < 28 || r4 > 31) ? a.c(typedArray.getResources(), typedArray.getResourceId(r5, 0), theme) : h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + r5 + ": " + typedValue);
    }

    @h0
    private static ColorStateList h(@h0 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static b i(@h0 TypedArray typedArray, @h0 XmlPullParser xmlPullParser, @i0 Resources.Theme theme, @h0 String str, @u0 int r5, @k int r6) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(r5, typedValue);
            int r4 = typedValue.type;
            if (r4 >= 28 && r4 <= 31) {
                return b.b(typedValue.data);
            }
            b bVarG = b.g(typedArray.getResources(), typedArray.getResourceId(r5, 0), theme);
            if (bVarG != null) {
                return bVarG;
            }
        }
        return b.b(r6);
    }

    public static float j(@h0 TypedArray typedArray, @h0 XmlPullParser xmlPullParser, @h0 String str, @u0 int r3, float f) {
        return !r(xmlPullParser, str) ? f : typedArray.getFloat(r3, f);
    }

    public static int k(@h0 TypedArray typedArray, @h0 XmlPullParser xmlPullParser, @h0 String str, @u0 int r3, int r4) {
        return !r(xmlPullParser, str) ? r4 : typedArray.getInt(r3, r4);
    }

    @androidx.annotation.c
    public static int l(@h0 TypedArray typedArray, @h0 XmlPullParser xmlPullParser, @h0 String str, @u0 int r3, @androidx.annotation.c int r4) {
        return !r(xmlPullParser, str) ? r4 : typedArray.getResourceId(r3, r4);
    }

    @i0
    public static String m(@h0 TypedArray typedArray, @h0 XmlPullParser xmlPullParser, @h0 String str, @u0 int r3) {
        if (r(xmlPullParser, str)) {
            return typedArray.getString(r3);
        }
        return null;
    }

    @androidx.annotation.c
    public static int n(@h0 TypedArray typedArray, @u0 int r1, @u0 int r2, @androidx.annotation.c int r3) {
        return typedArray.getResourceId(r1, typedArray.getResourceId(r2, r3));
    }

    @i0
    public static String o(@h0 TypedArray typedArray, @u0 int r1, @u0 int r2) {
        String string = typedArray.getString(r1);
        return string == null ? typedArray.getString(r2) : string;
    }

    @i0
    public static CharSequence p(@h0 TypedArray typedArray, @u0 int r1, @u0 int r2) {
        CharSequence text = typedArray.getText(r1);
        return text == null ? typedArray.getText(r2) : text;
    }

    @i0
    public static CharSequence[] q(@h0 TypedArray typedArray, @u0 int r1, @u0 int r2) {
        CharSequence[] textArray = typedArray.getTextArray(r1);
        return textArray == null ? typedArray.getTextArray(r2) : textArray;
    }

    public static boolean r(@h0 XmlPullParser xmlPullParser, @h0 String str) {
        return xmlPullParser.getAttributeValue(f1009a, str) != null;
    }

    @h0
    public static TypedArray s(@h0 Resources resources, @i0 Resources.Theme theme, @h0 AttributeSet attributeSet, @h0 int[] r3) {
        return theme == null ? resources.obtainAttributes(attributeSet, r3) : theme.obtainStyledAttributes(attributeSet, r3, 0, 0);
    }

    @i0
    public static TypedValue t(@h0 TypedArray typedArray, @h0 XmlPullParser xmlPullParser, @h0 String str, int r3) {
        if (r(xmlPullParser, str)) {
            return typedArray.peekValue(r3);
        }
        return null;
    }
}
