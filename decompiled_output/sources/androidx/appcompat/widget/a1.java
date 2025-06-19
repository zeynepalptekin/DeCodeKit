package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.p0;
import b.i.c.j.g;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f122a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f123b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f124c;

    private a1(Context context, TypedArray typedArray) {
        this.f122a = context;
        this.f123b = typedArray;
    }

    public static a1 E(Context context, int r2, int[] r3) {
        return new a1(context, context.obtainStyledAttributes(r2, r3));
    }

    public static a1 F(Context context, AttributeSet attributeSet, int[] r3) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, r3));
    }

    public static a1 G(Context context, AttributeSet attributeSet, int[] r3, int r4, int r5) {
        return new a1(context, context.obtainStyledAttributes(attributeSet, r3, r4, r5));
    }

    public boolean A(int r2, TypedValue typedValue) {
        return this.f123b.getValue(r2, typedValue);
    }

    public TypedArray B() {
        return this.f123b;
    }

    public boolean C(int r2) {
        return this.f123b.hasValue(r2);
    }

    public int D() {
        return this.f123b.length();
    }

    public TypedValue H(int r2) {
        return this.f123b.peekValue(r2);
    }

    public void I() {
        this.f123b.recycle();
    }

    public boolean a(int r2, boolean z) {
        return this.f123b.getBoolean(r2, z);
    }

    @androidx.annotation.m0(21)
    public int b() {
        return this.f123b.getChangingConfigurations();
    }

    public int c(int r2, int r3) {
        return this.f123b.getColor(r2, r3);
    }

    public ColorStateList d(int r3) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!this.f123b.hasValue(r3) || (resourceId = this.f123b.getResourceId(r3, 0)) == 0 || (colorStateListC = b.a.b.a.a.c(this.f122a, resourceId)) == null) ? this.f123b.getColorStateList(r3) : colorStateListC;
    }

    public float e(int r2, float f) {
        return this.f123b.getDimension(r2, f);
    }

    public int f(int r2, int r3) {
        return this.f123b.getDimensionPixelOffset(r2, r3);
    }

    public int g(int r2, int r3) {
        return this.f123b.getDimensionPixelSize(r2, r3);
    }

    public Drawable h(int r3) {
        int resourceId;
        return (!this.f123b.hasValue(r3) || (resourceId = this.f123b.getResourceId(r3, 0)) == 0) ? this.f123b.getDrawable(r3) : b.a.b.a.a.d(this.f122a, resourceId);
    }

    public Drawable i(int r4) {
        int resourceId;
        if (!this.f123b.hasValue(r4) || (resourceId = this.f123b.getResourceId(r4, 0)) == 0) {
            return null;
        }
        return k.b().d(this.f122a, resourceId, true);
    }

    public float j(int r2, float f) {
        return this.f123b.getFloat(r2, f);
    }

    @androidx.annotation.i0
    public Typeface k(@androidx.annotation.u0 int r3, int r4, @androidx.annotation.i0 g.a aVar) {
        int resourceId = this.f123b.getResourceId(r3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f124c == null) {
            this.f124c = new TypedValue();
        }
        return b.i.c.j.g.g(this.f122a, resourceId, this.f124c, r4, aVar);
    }

    public float l(int r2, int r3, int r4, float f) {
        return this.f123b.getFraction(r2, r3, r4, f);
    }

    public int m(int r2) {
        return this.f123b.getIndex(r2);
    }

    public int n() {
        return this.f123b.getIndexCount();
    }

    public int o(int r2, int r3) {
        return this.f123b.getInt(r2, r3);
    }

    public int p(int r2, int r3) {
        return this.f123b.getInteger(r2, r3);
    }

    public int q(int r2, int r3) {
        return this.f123b.getLayoutDimension(r2, r3);
    }

    public int r(int r2, String str) {
        return this.f123b.getLayoutDimension(r2, str);
    }

    public String s(int r2) {
        return this.f123b.getNonResourceString(r2);
    }

    public String t() {
        return this.f123b.getPositionDescription();
    }

    public int u(int r2, int r3) {
        return this.f123b.getResourceId(r2, r3);
    }

    public Resources v() {
        return this.f123b.getResources();
    }

    public String w(int r2) {
        return this.f123b.getString(r2);
    }

    public CharSequence x(int r2) {
        return this.f123b.getText(r2);
    }

    public CharSequence[] y(int r2) {
        return this.f123b.getTextArray(r2);
    }

    public int z(int r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f123b.getType(r3);
        }
        if (this.f124c == null) {
            this.f124c = new TypedValue();
        }
        this.f123b.getValue(r3, this.f124c);
        return this.f124c.type;
    }
}
