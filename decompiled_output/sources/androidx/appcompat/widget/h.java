package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.p0;
import b.a.a;

/* loaded from: classes.dex */
public class h extends CheckBox implements androidx.core.widget.n, b.i.p.d0 {
    private final j d;
    private final f e;
    private final z f;

    public h(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public h(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.checkboxStyle);
    }

    public h(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r3) throws Resources.NotFoundException, IllegalArgumentException {
        super(x0.b(context), attributeSet, r3);
        v0.a(this, getContext());
        j jVar = new j(this);
        this.d = jVar;
        jVar.e(attributeSet, r3);
        f fVar = new f(this);
        this.e = fVar;
        fVar.e(attributeSet, r3);
        z zVar = new z(this);
        this.f = zVar;
        zVar.m(attributeSet, r3);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.e;
        if (fVar != null) {
            fVar.b();
        }
        z zVar = this.f;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        j jVar = this.d;
        return jVar != null ? jVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // b.i.p.d0
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // b.i.p.d0
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.n
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        j jVar = this.d;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.n
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.d;
        if (jVar != null) {
            return jVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.e;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.q int r2) {
        super.setBackgroundResource(r2);
        f fVar = this.e;
        if (fVar != null) {
            fVar.g(r2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@androidx.annotation.q int r2) throws NoSuchFieldException {
        setButtonDrawable(b.a.b.a.a.d(getContext(), r2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) throws NoSuchFieldException {
        super.setButtonDrawable(drawable);
        j jVar = this.d;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override // b.i.p.d0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.i0 ColorStateList colorStateList) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // b.i.p.d0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.i0 PorterDuff.Mode mode) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // androidx.core.widget.n
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@androidx.annotation.i0 ColorStateList colorStateList) throws NoSuchFieldException {
        j jVar = this.d;
        if (jVar != null) {
            jVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.n
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@androidx.annotation.i0 PorterDuff.Mode mode) throws NoSuchFieldException {
        j jVar = this.d;
        if (jVar != null) {
            jVar.h(mode);
        }
    }
}
