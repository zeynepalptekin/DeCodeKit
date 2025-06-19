package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.u0;
import androidx.appcompat.widget.a0;
import c.a.b.c.a;
import c.a.b.c.r.b;
import c.a.b.c.r.c;
import com.google.android.material.theme.a.a;

/* loaded from: classes.dex */
public class MaterialTextView extends a0 {
    public MaterialTextView(@h0 Context context) {
        this(context, null);
    }

    public MaterialTextView(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@h0 Context context, @i0 AttributeSet attributeSet, int r4) {
        this(context, attributeSet, r4, 0);
    }

    public MaterialTextView(@h0 Context context, @i0 AttributeSet attributeSet, int r4, int r5) throws Resources.NotFoundException {
        int r2;
        super(a.c(context, attributeSet, r4, r5), attributeSet, r4);
        Context context2 = getContext();
        if (i(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (l(context2, theme, attributeSet, r4, r5) || (r2 = j(theme, attributeSet, r4, r5)) == -1) {
                return;
            }
            h(theme, r2);
        }
    }

    private void h(@h0 Resources.Theme theme, int r5) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(r5, a.o.MaterialTextAppearance);
        int r52 = k(getContext(), typedArrayObtainStyledAttributes, a.o.MaterialTextAppearance_android_lineHeight, a.o.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (r52 >= 0) {
            setLineHeight(r52);
        }
    }

    private static boolean i(Context context) {
        return b.b(context, a.c.textAppearanceLineHeightEnabled, true);
    }

    private static int j(@h0 Resources.Theme theme, @i0 AttributeSet attributeSet, int r3, int r4) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, a.o.MaterialTextView, r3, r4);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int k(@h0 Context context, @h0 TypedArray typedArray, @u0 @h0 int... r6) {
        int r2 = -1;
        for (int r1 = 0; r1 < r6.length && r2 < 0; r1++) {
            r2 = c.c(context, typedArray, r6[r1], -1);
        }
        return r2;
    }

    private static boolean l(@h0 Context context, @h0 Resources.Theme theme, @i0 AttributeSet attributeSet, int r4, int r5) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, a.o.MaterialTextView, r4, r5);
        int r1 = k(context, typedArrayObtainStyledAttributes, a.o.MaterialTextView_android_lineHeight, a.o.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return r1 != -1;
    }

    @Override // androidx.appcompat.widget.a0, android.widget.TextView
    public void setTextAppearance(@h0 Context context, int r3) throws Resources.NotFoundException {
        super.setTextAppearance(context, r3);
        if (i(context)) {
            h(context.getTheme(), r3);
        }
    }
}
