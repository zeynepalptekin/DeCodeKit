package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public interface o {
    @i0
    ColorStateList getSupportCompoundDrawablesTintList();

    @i0
    PorterDuff.Mode getSupportCompoundDrawablesTintMode();

    void setSupportCompoundDrawablesTintList(@i0 ColorStateList colorStateList);

    void setSupportCompoundDrawablesTintMode(@i0 PorterDuff.Mode mode);
}
