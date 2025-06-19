package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f402a = "CompoundButtonCompat";

    /* renamed from: b, reason: collision with root package name */
    private static Field f403b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f404c;

    private c() {
    }

    @i0
    public static Drawable a(@h0 CompoundButton compoundButton) throws NoSuchFieldException {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f404c) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f403b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(f402a, "Failed to retrieve mButtonDrawable field", e);
            }
            f404c = true;
        }
        Field field = f403b;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i(f402a, "Failed to get button drawable via reflection", e2);
                f403b = null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i0
    public static ColorStateList b(@h0 CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof n) {
            return ((n) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i0
    public static PorterDuff.Mode c(@h0 CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintMode();
        }
        if (compoundButton instanceof n) {
            return ((n) compoundButton).getSupportButtonTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(@h0 CompoundButton compoundButton, @i0 ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof n) {
            ((n) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(@h0 CompoundButton compoundButton, @i0 PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof n) {
            ((n) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
