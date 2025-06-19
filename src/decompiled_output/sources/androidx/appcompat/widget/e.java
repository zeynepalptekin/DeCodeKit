package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.annotation.p0;
import b.a.a;

/* loaded from: classes.dex */
public class e extends AutoCompleteTextView implements b.i.p.d0 {
    private static final int[] f = {R.attr.popupBackground};
    private final f d;
    private final z e;

    public e(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public e(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.autoCompleteTextViewStyle);
    }

    public e(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r5) throws Resources.NotFoundException, IllegalArgumentException {
        super(x0.b(context), attributeSet, r5);
        v0.a(this, getContext());
        a1 a1VarG = a1.G(getContext(), attributeSet, f, r5, 0);
        if (a1VarG.C(0)) {
            setDropDownBackgroundDrawable(a1VarG.h(0));
        }
        a1VarG.I();
        f fVar = new f(this);
        this.d = fVar;
        fVar.e(attributeSet, r5);
        z zVar = new z(this);
        this.e = zVar;
        zVar.m(attributeSet, r5);
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return m.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@androidx.annotation.q int r2) {
        setDropDownBackgroundDrawable(b.a.b.a.a.d(getContext(), r2));
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int r3) {
        super.setTextAppearance(context, r3);
        z zVar = this.e;
        if (zVar != null) {
            zVar.q(context, r3);
        }
    }
}
