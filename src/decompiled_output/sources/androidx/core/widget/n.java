package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public interface n {
    @i0
    ColorStateList getSupportButtonTintList();

    @i0
    PorterDuff.Mode getSupportButtonTintMode();

    void setSupportButtonTintList(@i0 ColorStateList colorStateList);

    void setSupportButtonTintMode(@i0 PorterDuff.Mode mode);
}
