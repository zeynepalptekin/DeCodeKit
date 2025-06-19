package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.p0;
import b.a.a;

/* loaded from: classes.dex */
public class l extends EditText implements b.i.p.d0 {
    private final f d;
    private final z e;
    private final y f;

    public l(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public l(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.editTextStyle);
    }

    public l(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r3) throws Resources.NotFoundException, IllegalArgumentException {
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

    @Override // android.widget.EditText, android.widget.TextView
    @androidx.annotation.i0
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    @androidx.annotation.m0(api = 26)
    @androidx.annotation.h0
    public TextClassifier getTextClassifier() {
        y yVar;
        return (Build.VERSION.SDK_INT >= 28 || (yVar = this.f) == null) ? super.getTextClassifier() : yVar.a();
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
}
