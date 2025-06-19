package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.p0;
import b.i.n.d;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class a0 extends TextView implements b.i.p.d0, androidx.core.widget.o, androidx.core.widget.b {
    private final f d;
    private final z e;
    private final y f;

    @androidx.annotation.i0
    private Future<b.i.n.d> g;

    public a0(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public a0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public a0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r3) throws Resources.NotFoundException, IllegalArgumentException {
        super(x0.b(context), attributeSet, r3);
        v0.a(this, getContext());
        f fVar = new f(this);
        this.d = fVar;
        fVar.e(attributeSet, r3);
        z zVar = new z(this);
        this.e = zVar;
        zVar.m(attributeSet, r3);
        this.e.b();
        this.f = new y(this);
    }

    private void c() {
        Future<b.i.n.d> future = this.g;
        if (future != null) {
            try {
                this.g = null;
                androidx.core.widget.m.D(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.m.i(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.m.j(this);
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        c();
        return super.getText();
    }

    @Override // android.widget.TextView
    @androidx.annotation.m0(api = 26)
    @androidx.annotation.h0
    public TextClassifier getTextClassifier() {
        y yVar;
        return (Build.VERSION.SDK_INT >= 28 || (yVar = this.f) == null) ? super.getTextClassifier() : yVar.a();
    }

    @androidx.annotation.h0
    public d.a getTextMetricsParamsCompat() {
        return androidx.core.widget.m.o(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return m.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int r8, int r9, int r10, int r11) {
        super.onLayout(z, r8, r9, r10, r11);
        z zVar = this.e;
        if (zVar != null) {
            zVar.o(z, r8, r9, r10, r11);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r1, int r2) {
        c();
        super.onMeasure(r1, r2);
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
    public void setCompoundDrawables(@androidx.annotation.i0 Drawable drawable, @androidx.annotation.i0 Drawable drawable2, @androidx.annotation.i0 Drawable drawable3, @androidx.annotation.i0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        z zVar = this.e;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.m0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.i0 Drawable drawable, @androidx.annotation.i0 Drawable drawable2, @androidx.annotation.i0 Drawable drawable3, @androidx.annotation.i0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        z zVar = this.e;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.m0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(r3 != 0 ? b.a.b.a.a.d(context, r3) : null, r4 != 0 ? b.a.b.a.a.d(context, r4) : null, r5 != 0 ? b.a.b.a.a.d(context, r5) : null, r6 != 0 ? b.a.b.a.a.d(context, r6) : null);
        z zVar = this.e;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.m0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@androidx.annotation.i0 Drawable drawable, @androidx.annotation.i0 Drawable drawable2, @androidx.annotation.i0 Drawable drawable3, @androidx.annotation.i0 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        z zVar = this.e;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(r3 != 0 ? b.a.b.a.a.d(context, r3) : null, r4 != 0 ? b.a.b.a.a.d(context, r4) : null, r5 != 0 ? b.a.b.a.a.d(context, r5) : null, r6 != 0 ? b.a.b.a.a.d(context, r6) : null);
        z zVar = this.e;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@androidx.annotation.i0 Drawable drawable, @androidx.annotation.i0 Drawable drawable2, @androidx.annotation.i0 Drawable drawable3, @androidx.annotation.i0 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        z zVar = this.e;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.G(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@androidx.annotation.k0 @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(r3);
        } else {
            androidx.core.widget.m.A(this, r3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@androidx.annotation.k0 @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(r3);
        } else {
            androidx.core.widget.m.B(this, r3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@androidx.annotation.k0 @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r1) {
        androidx.core.widget.m.C(this, r1);
    }

    public void setPrecomputedText(@androidx.annotation.h0 b.i.n.d dVar) {
        androidx.core.widget.m.D(this, dVar);
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
    @androidx.annotation.m0(api = 26)
    public void setTextClassifier(@androidx.annotation.i0 TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.f) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yVar.b(textClassifier);
        }
    }

    public void setTextFuture(@androidx.annotation.i0 Future<b.i.n.d> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@androidx.annotation.h0 d.a aVar) {
        androidx.core.widget.m.F(this, aVar);
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

    @Override // android.widget.TextView
    public void setTypeface(@androidx.annotation.i0 Typeface typeface, int r3) {
        Typeface typefaceA = (typeface == null || r3 <= 0) ? null : b.i.e.k.a(getContext(), typeface, r3);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        super.setTypeface(typeface, r3);
    }
}
