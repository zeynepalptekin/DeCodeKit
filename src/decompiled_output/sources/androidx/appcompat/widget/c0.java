package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class c0 extends ToggleButton {
    private final z d;

    public c0(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public c0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public c0(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r3) throws Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet, r3);
        v0.a(this, getContext());
        z zVar = new z(this);
        this.d = zVar;
        zVar.m(attributeSet, r3);
    }
}
