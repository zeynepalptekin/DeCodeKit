package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;

/* loaded from: classes.dex */
class g extends Drawable implements Drawable.Callback, f, e {
    static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    private int d;
    private PorterDuff.Mode e;
    private boolean f;
    i g;
    private boolean h;
    Drawable i;

    g(@i0 Drawable drawable) {
        this.g = d();
        a(drawable);
    }

    g(@h0 i iVar, @i0 Resources resources) {
        this.g = iVar;
        e(resources);
    }

    @h0
    private i d() {
        return new i(this.g);
    }

    private void e(@i0 Resources resources) {
        Drawable.ConstantState constantState;
        i iVar = this.g;
        if (iVar == null || (constantState = iVar.f396b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    private boolean f(int[] r5) {
        if (!c()) {
            return false;
        }
        i iVar = this.g;
        ColorStateList colorStateList = iVar.f397c;
        PorterDuff.Mode mode = iVar.d;
        if (colorStateList == null || mode == null) {
            this.f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(r5, colorStateList.getDefaultColor());
            if (!this.f || colorForState != this.d || mode != this.e) {
                setColorFilter(colorForState, mode);
                this.d = colorForState;
                this.e = mode;
                this.f = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.f
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            i iVar = this.g;
            if (iVar != null) {
                iVar.f396b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.f
    public final Drawable b() {
        return this.i;
    }

    protected boolean c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@h0 Canvas canvas) {
        this.i.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        i iVar = this.g;
        return changingConfigurations | (iVar != null ? iVar.getChangingConfigurations() : 0) | this.i.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @i0
    public Drawable.ConstantState getConstantState() {
        i iVar = this.g;
        if (iVar == null || !iVar.a()) {
            return null;
        }
        this.g.f395a = getChangingConfigurations();
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    @h0
    public Drawable getCurrent() {
        return this.i.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.i.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.i.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.i.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.i.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.i.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@h0 Rect rect) {
        return this.i.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @h0
    public int[] getState() {
        return this.i.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.i.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@h0 Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @m0(19)
    public boolean isAutoMirrored() {
        return this.i.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        i iVar;
        ColorStateList colorStateList = (!c() || (iVar = this.g) == null) ? null : iVar.f397c;
        return (colorStateList != null && colorStateList.isStateful()) || this.i.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.i.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @h0
    public Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            this.g = d();
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.mutate();
            }
            i iVar = this.g;
            if (iVar != null) {
                Drawable drawable2 = this.i;
                iVar.f396b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
        return this.i.setLevel(r2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@h0 Drawable drawable, @h0 Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.i.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    @m0(19)
    public void setAutoMirrored(boolean z) {
        this.i.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
        this.i.setChangingConfigurations(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.i.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.i.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@h0 int[] r2) {
        return f(r2) || this.i.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTint(int r1) {
        setTintList(ColorStateList.valueOf(r1));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintList(ColorStateList colorStateList) {
        this.g.f397c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintMode(@h0 PorterDuff.Mode mode) {
        this.g.d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.i.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@h0 Drawable drawable, @h0 Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
