package c.a.b.c.x;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.appcompat.widget.u0;
import c.a.b.c.a;
import com.google.android.material.internal.s;
import com.google.android.material.internal.z;

/* loaded from: classes.dex */
public class a extends u0 {
    private static final int h0 = a.n.Widget_MaterialComponents_CompoundButton_Switch;
    private static final int[][] i0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @h0
    private final c.a.b.c.l.a d0;

    @i0
    private ColorStateList e0;

    @i0
    private ColorStateList f0;
    private boolean g0;

    public a(@h0 Context context) {
        this(context, null);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.switchStyle);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet, int r9) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r9, h0), attributeSet, r9);
        Context context2 = getContext();
        this.d0 = new c.a.b.c.l.a(context2);
        TypedArray typedArrayJ = s.j(context2, attributeSet, a.o.SwitchMaterial, r9, h0, new int[0]);
        this.g0 = typedArrayJ.getBoolean(a.o.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayJ.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() throws Resources.NotFoundException {
        if (this.e0 == null) {
            int r0 = c.a.b.c.i.a.d(this, a.c.colorSurface);
            int r1 = c.a.b.c.i.a.d(this, a.c.colorControlActivated);
            float dimension = getResources().getDimension(a.f.mtrl_switch_thumb_elevation);
            if (this.d0.l()) {
                dimension += z.h(this);
            }
            int r2 = this.d0.e(r0, dimension);
            int[] r3 = new int[i0.length];
            r3[0] = c.a.b.c.i.a.g(r0, r1, 1.0f);
            r3[1] = r2;
            r3[2] = c.a.b.c.i.a.g(r0, r1, 0.38f);
            r3[3] = r2;
            this.e0 = new ColorStateList(i0, r3);
        }
        return this.e0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f0 == null) {
            int[] r0 = new int[i0.length];
            int r1 = c.a.b.c.i.a.d(this, a.c.colorSurface);
            int r2 = c.a.b.c.i.a.d(this, a.c.colorControlActivated);
            int r3 = c.a.b.c.i.a.d(this, a.c.colorOnSurface);
            r0[0] = c.a.b.c.i.a.g(r1, r2, 0.54f);
            r0[1] = c.a.b.c.i.a.g(r1, r3, 0.32f);
            r0[2] = c.a.b.c.i.a.g(r1, r2, 0.12f);
            r0[3] = c.a.b.c.i.a.g(r1, r3, 0.12f);
            this.f0 = new ColorStateList(i0, r0);
        }
        return this.f0;
    }

    public boolean m() {
        return this.g0;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.g0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList materialThemeColorsTrackTintList;
        this.g0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            materialThemeColorsTrackTintList = getMaterialThemeColorsTrackTintList();
        } else {
            materialThemeColorsTrackTintList = null;
            setThumbTintList(null);
        }
        setTrackTintList(materialThemeColorsTrackTintList);
    }
}
