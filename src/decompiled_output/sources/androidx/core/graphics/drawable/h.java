package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.m0;
import java.lang.reflect.Method;

@m0(21)
/* loaded from: classes.dex */
class h extends g {
    private static final String k = "WrappedDrawableApi21";
    private static Method l;

    h(Drawable drawable) {
        super(drawable);
        g();
    }

    h(i iVar, Resources resources) {
        super(iVar, resources);
        g();
    }

    private void g() {
        if (l == null) {
            try {
                l = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w(k, "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.g
    protected boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.i;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    @h0
    public Rect getDirtyBounds() {
        return this.i.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@h0 Outline outline) {
        this.i.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.i;
        if (drawable != null && (method = l) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w(k, "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.i.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
        this.i.setHotspotBounds(r2, r3, r4, r5);
    }

    @Override // androidx.core.graphics.drawable.g, android.graphics.drawable.Drawable
    public boolean setState(@h0 int[] r1) {
        if (!super.setState(r1)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTint(int r2) {
        if (c()) {
            super.setTint(r2);
        } else {
            this.i.setTint(r2);
        }
    }

    @Override // androidx.core.graphics.drawable.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.i.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintMode(@h0 PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.i.setTintMode(mode);
        }
    }
}
