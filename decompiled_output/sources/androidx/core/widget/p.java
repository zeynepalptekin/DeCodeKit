package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.i0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface p {
    @i0
    ColorStateList getSupportImageTintList();

    @i0
    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@i0 ColorStateList colorStateList);

    void setSupportImageTintMode(@i0 PorterDuff.Mode mode);
}
