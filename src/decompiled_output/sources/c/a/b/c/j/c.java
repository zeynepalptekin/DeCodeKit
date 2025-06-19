package c.a.b.c.j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import androidx.annotation.f;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import c.a.b.c.a;
import com.google.android.material.internal.s;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class c {
    private c() {
    }

    @h0
    public static Rect a(@h0 Context context, @f int r8, int r9) {
        TypedArray typedArrayJ = s.j(context, null, a.o.MaterialAlertDialog, r8, r9, new int[0]);
        int dimensionPixelSize = typedArrayJ.getDimensionPixelSize(a.o.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(a.f.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayJ.getDimensionPixelSize(a.o.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(a.f.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayJ.getDimensionPixelSize(a.o.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(a.f.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayJ.getDimensionPixelSize(a.o.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(a.f.mtrl_alert_dialog_background_inset_bottom));
        typedArrayJ.recycle();
        if (Build.VERSION.SDK_INT >= 17 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    @h0
    public static InsetDrawable b(@i0 Drawable drawable, @h0 Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
