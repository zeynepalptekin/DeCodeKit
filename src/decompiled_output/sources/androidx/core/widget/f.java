package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public class f {
    private f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i0
    public static ColorStateList a(@h0 ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof p) {
            return ((p) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i0
    public static PorterDuff.Mode b(@h0 ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof p) {
            return ((p) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(@h0 ImageView imageView, @i0 ColorStateList colorStateList) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT < 21) {
            if (imageView instanceof p) {
                ((p) imageView).setSupportImageTintList(colorStateList);
                return;
            }
            return;
        }
        imageView.setImageTintList(colorStateList);
        if (Build.VERSION.SDK_INT != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(@h0 ImageView imageView, @i0 PorterDuff.Mode mode) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT < 21) {
            if (imageView instanceof p) {
                ((p) imageView).setSupportImageTintMode(mode);
                return;
            }
            return;
        }
        imageView.setImageTintMode(mode);
        if (Build.VERSION.SDK_INT != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
