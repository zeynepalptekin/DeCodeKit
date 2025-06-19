package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.p0;
import b.a.a;

/* loaded from: classes.dex */
public class n extends ImageButton implements b.i.p.d0, androidx.core.widget.p {
    private final f d;
    private final o e;

    public n(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public n(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.imageButtonStyle);
    }

    public n(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r3) {
        super(x0.b(context), attributeSet, r3);
        v0.a(this, getContext());
        f fVar = new f(this);
        this.d = fVar;
        fVar.e(attributeSet, r3);
        o oVar = new o(this);
        this.e = oVar;
        oVar.f(attributeSet, r3);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.d;
        if (fVar != null) {
            fVar.b();
        }
        o oVar = this.e;
        if (oVar != null) {
            oVar.b();
        }
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

    @Override // androidx.core.widget.p
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        o oVar = this.e;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.p
    @androidx.annotation.i0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        o oVar = this.e;
        if (oVar != null) {
            return oVar.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.e.e() && super.hasOverlappingRendering();
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        o oVar = this.e;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@androidx.annotation.i0 Drawable drawable) {
        super.setImageDrawable(drawable);
        o oVar = this.e;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@androidx.annotation.q int r2) {
        this.e.g(r2);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@androidx.annotation.i0 Uri uri) {
        super.setImageURI(uri);
        o oVar = this.e;
        if (oVar != null) {
            oVar.b();
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

    @Override // androidx.core.widget.p
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@androidx.annotation.i0 ColorStateList colorStateList) {
        o oVar = this.e;
        if (oVar != null) {
            oVar.i(colorStateList);
        }
    }

    @Override // androidx.core.widget.p
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@androidx.annotation.i0 PorterDuff.Mode mode) {
        o oVar = this.e;
        if (oVar != null) {
            oVar.j(mode);
        }
    }
}
