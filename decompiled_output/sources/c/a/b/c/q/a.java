package c.a.b.c.q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.appcompat.widget.t;
import androidx.core.widget.c;
import c.a.b.c.a;
import com.google.android.material.internal.s;

/* loaded from: classes.dex */
public class a extends t {
    private static final int i = a.n.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] j = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @i0
    private ColorStateList g;
    private boolean h;

    public a(@h0 Context context) {
        this(context, null);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.radioButtonStyle);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet, int r10) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r10, i), attributeSet, r10);
        Context context2 = getContext();
        TypedArray typedArrayJ = s.j(context2, attributeSet, a.o.MaterialRadioButton, r10, i, new int[0]);
        if (typedArrayJ.hasValue(a.o.MaterialRadioButton_buttonTint)) {
            c.d(this, c.a.b.c.r.c.a(context2, typedArrayJ, a.o.MaterialRadioButton_buttonTint));
        }
        this.h = typedArrayJ.getBoolean(a.o.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayJ.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int r0 = c.a.b.c.i.a.d(this, a.c.colorControlActivated);
            int r1 = c.a.b.c.i.a.d(this, a.c.colorOnSurface);
            int r2 = c.a.b.c.i.a.d(this, a.c.colorSurface);
            int[] r3 = new int[j.length];
            r3[0] = c.a.b.c.i.a.g(r2, r0, 1.0f);
            r3[1] = c.a.b.c.i.a.g(r2, r1, 0.54f);
            r3[2] = c.a.b.c.i.a.g(r2, r1, 0.38f);
            r3[3] = c.a.b.c.i.a.g(r2, r1, 0.38f);
            this.g = new ColorStateList(j, r3);
        }
        return this.g;
    }

    public boolean a() {
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.h = z;
        c.d(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
