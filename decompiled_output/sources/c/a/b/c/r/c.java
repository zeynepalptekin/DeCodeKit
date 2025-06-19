package c.a.b.c.r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.appcompat.widget.a1;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class c {
    private c() {
    }

    @i0
    public static ColorStateList a(@h0 Context context, @h0 TypedArray typedArray, @u0 int r3) {
        int color;
        int resourceId;
        ColorStateList colorStateListC;
        return (!typedArray.hasValue(r3) || (resourceId = typedArray.getResourceId(r3, 0)) == 0 || (colorStateListC = b.a.b.a.a.c(context, resourceId)) == null) ? (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(r3, -1)) == -1) ? typedArray.getColorStateList(r3) : ColorStateList.valueOf(color) : colorStateListC;
    }

    @i0
    public static ColorStateList b(@h0 Context context, @h0 a1 a1Var, @u0 int r3) {
        int r0;
        int r02;
        ColorStateList colorStateListC;
        return (!a1Var.C(r3) || (r02 = a1Var.u(r3, 0)) == 0 || (colorStateListC = b.a.b.a.a.c(context, r02)) == null) ? (Build.VERSION.SDK_INT > 15 || (r0 = a1Var.c(r3, -1)) == -1) ? a1Var.d(r3) : ColorStateList.valueOf(r0) : colorStateListC;
    }

    public static int c(@h0 Context context, @h0 TypedArray typedArray, @u0 int r5, int r6) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(r5, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(r5, r6);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, r6);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @i0
    public static Drawable d(@h0 Context context, @h0 TypedArray typedArray, @u0 int r3) {
        int resourceId;
        Drawable drawableD;
        return (!typedArray.hasValue(r3) || (resourceId = typedArray.getResourceId(r3, 0)) == 0 || (drawableD = b.a.b.a.a.d(context, resourceId)) == null) ? typedArray.getDrawable(r3) : drawableD;
    }

    @u0
    static int e(@h0 TypedArray typedArray, @u0 int r1, @u0 int r2) {
        return typedArray.hasValue(r1) ? r1 : r2;
    }

    @i0
    public static d f(@h0 Context context, @h0 TypedArray typedArray, @u0 int r3) {
        int resourceId;
        if (!typedArray.hasValue(r3) || (resourceId = typedArray.getResourceId(r3, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }
}
