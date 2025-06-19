package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class i extends CheckedTextView {
    private static final int[] e = {R.attr.checkMark};
    private final z d;

    public i(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public i(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public i(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r5) throws Resources.NotFoundException, IllegalArgumentException {
        super(x0.b(context), attributeSet, r5);
        v0.a(this, getContext());
        z zVar = new z(this);
        this.d = zVar;
        zVar.m(attributeSet, r5);
        this.d.b();
        a1 a1VarG = a1.G(getContext(), attributeSet, e, r5, 0);
        setCheckMarkDrawable(a1VarG.h(0));
        a1VarG.I();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        z zVar = this.d;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return m.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@androidx.annotation.q int r2) {
        setCheckMarkDrawable(b.a.b.a.a.d(getContext(), r2));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.G(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int r3) {
        super.setTextAppearance(context, r3);
        z zVar = this.d;
        if (zVar != null) {
            zVar.q(context, r3);
        }
    }
}
