package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.annotation.p0;
import b.a.a;
import java.lang.reflect.InvocationTargetException;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class DialogTitle extends a0 {
    public DialogTitle(@androidx.annotation.h0 Context context) {
        super(context);
    }

    public DialogTitle(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogTitle(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    @Override // androidx.appcompat.widget.a0, android.widget.TextView, android.view.View
    protected void onMeasure(int r7, int r8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int lineCount;
        super.onMeasure(r7, r8);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, a.m.TextAppearance, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.m.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
        super.onMeasure(r7, r8);
    }
}
