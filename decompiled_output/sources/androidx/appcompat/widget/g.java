package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.p0;
import b.a.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class g extends Button implements b.i.p.d0, androidx.core.widget.b, androidx.core.widget.o {
    private final f d;
    private final z e;

    public g(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public g(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.buttonStyle);
    }

    public g(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r3) throws Resources.NotFoundException, IllegalArgumentException {
        super(x0.b(context), attributeSet, r3);
        v0.a(this, getContext());
        f fVar = new f(this);
        this.d = fVar;
        fVar.e(attributeSet, r3);
        z zVar = new z(this);
        this.e = zVar;
        zVar.m(attributeSet, r3);
        this.e.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.d;
        if (fVar != null) {
            fVar.b();
        }
        z zVar = this.e;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f401a) {
            return super.getAutoSizeMaxTextSize();
        }
        z zVar = this.e;
        if (zVar != null) {
            return zVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f401a) {
            return super.getAutoSizeMinTextSize();
        }
        z zVar = this.e;
        if (zVar != null) {
            return zVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f401a) {
            return super.getAutoSizeStepGranularity();
        }
        z zVar = this.e;
        if (zVar != null) {
            return zVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f401a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        z zVar = this.e;
        return zVar != null ? zVar.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f401a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        z zVar = this.e;
        if (zVar != null) {
            return zVar.i();
        }
        return 0;
    }

    @Override // b.i.p.d0
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.d;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // b.i.p.d0
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.d;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.o
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.e.j();
    }

    @Override // androidx.core.widget.o
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.e.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int r8, int r9, int r10, int r11) {
        super.onLayout(z, r8, r9, r10, r11);
        z zVar = this.e;
        if (zVar != null) {
            zVar.o(z, r8, r9, r10, r11);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int r2, int r3, int r4) {
        super.onTextChanged(charSequence, r2, r3, r4);
        z zVar = this.e;
        if (zVar == null || androidx.core.widget.b.f401a || !zVar.l()) {
            return;
        }
        this.e.c();
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws IllegalArgumentException {
        if (androidx.core.widget.b.f401a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5);
            return;
        }
        z zVar = this.e;
        if (zVar != null) {
            zVar.s(r2, r3, r4, r5);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.h0 int[] r2, int r3) throws IllegalArgumentException {
        if (androidx.core.widget.b.f401a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3);
            return;
        }
        z zVar = this.e;
        if (zVar != null) {
            zVar.t(r2, r3);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int r2) throws IllegalArgumentException {
        if (androidx.core.widget.b.f401a) {
            super.setAutoSizeTextTypeWithDefaults(r2);
            return;
        }
        z zVar = this.e;
        if (zVar != null) {
            zVar.u(r2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.d;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.q int r2) {
        super.setBackgroundResource(r2);
        f fVar = this.d;
        if (fVar != null) {
            fVar.g(r2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.G(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        z zVar = this.e;
        if (zVar != null) {
            zVar.r(z);
        }
    }

    @Override // b.i.p.d0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.i0 ColorStateList colorStateList) {
        f fVar = this.d;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // b.i.p.d0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.i0 PorterDuff.Mode mode) {
        f fVar = this.d;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // androidx.core.widget.o
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.i0 ColorStateList colorStateList) {
        this.e.v(colorStateList);
        this.e.b();
    }

    @Override // androidx.core.widget.o
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.i0 PorterDuff.Mode mode) {
        this.e.w(mode);
        this.e.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int r3) {
        super.setTextAppearance(context, r3);
        z zVar = this.e;
        if (zVar != null) {
            zVar.q(context, r3);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int r2, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (androidx.core.widget.b.f401a) {
            super.setTextSize(r2, f);
            return;
        }
        z zVar = this.e;
        if (zVar != null) {
            zVar.z(r2, f);
        }
    }
}
