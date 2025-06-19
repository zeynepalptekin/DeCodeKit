package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.h;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.o;
import androidx.annotation.p;
import androidx.annotation.w;
import b.i.p.f0;
import b.i.p.p0.d;
import c.a.b.c.a;
import com.google.android.material.internal.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ChipGroup extends com.google.android.material.internal.e {
    private static final int q = a.n.Widget_MaterialComponents_ChipGroup;

    @p
    private int h;

    @p
    private int i;
    private boolean j;
    private boolean k;

    @i0
    private d l;
    private final b m;

    @h0
    private e n;

    @w
    private int o;
    private boolean p;

    private class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(@h0 CompoundButton compoundButton, boolean z) {
            if (ChipGroup.this.p) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.k) {
                ChipGroup.this.s(compoundButton.getId(), true);
                ChipGroup.this.r(compoundButton.getId(), false);
                return;
            }
            int id = compoundButton.getId();
            if (!z) {
                if (ChipGroup.this.o == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            } else {
                if (ChipGroup.this.o != -1 && ChipGroup.this.o != id && ChipGroup.this.j) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.s(chipGroup.o, false);
                }
                ChipGroup.this.setCheckedId(id);
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(int r1, int r2) {
            super(r1, r2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, @w int r2);
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener d;

        private e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.m);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int r10) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r10, q), attributeSet, r10);
        this.m = new b();
        this.n = new e();
        this.o = -1;
        this.p = false;
        TypedArray typedArrayJ = s.j(getContext(), attributeSet, a.o.ChipGroup, r10, q, new int[0]);
        int dimensionPixelOffset = typedArrayJ.getDimensionPixelOffset(a.o.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayJ.getDimensionPixelOffset(a.o.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayJ.getDimensionPixelOffset(a.o.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayJ.getBoolean(a.o.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayJ.getBoolean(a.o.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayJ.getBoolean(a.o.ChipGroup_selectionRequired, false));
        int resourceId = typedArrayJ.getResourceId(a.o.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.o = resourceId;
        }
        typedArrayJ.recycle();
        super.setOnHierarchyChangeListener(this.n);
        f0.K1(this, 1);
    }

    private int getChipCount() {
        int r1 = 0;
        for (int r0 = 0; r0 < getChildCount(); r0++) {
            if (getChildAt(r0) instanceof Chip) {
                r1++;
            }
        }
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(int r3, boolean z) {
        this.o = r3;
        d dVar = this.l;
        if (dVar != null && this.j && z) {
            dVar.a(this, r3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(@w int r2, boolean z) {
        View viewFindViewById = findViewById(r2);
        if (viewFindViewById instanceof Chip) {
            this.p = true;
            ((Chip) viewFindViewById).setChecked(z);
            this.p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int r2) {
        r(r2, true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int r5, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int r1 = this.o;
                if (r1 != -1 && this.j) {
                    s(r1, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, r5, layoutParams);
    }

    @Override // com.google.android.material.internal.e
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    @Override // android.view.ViewGroup
    @h0
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    @h0
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    @h0
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    @w
    public int getCheckedChipId() {
        if (this.j) {
            return this.o;
        }
        return -1;
    }

    @h0
    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int r1 = 0; r1 < getChildCount(); r1++) {
            View childAt = getChildAt(r1);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.j) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    @p
    public int getChipSpacingHorizontal() {
        return this.h;
    }

    @p
    public int getChipSpacingVertical() {
        return this.i;
    }

    public void m(@w int r4) {
        int r0 = this.o;
        if (r4 == r0) {
            return;
        }
        if (r0 != -1 && this.j) {
            s(r0, false);
        }
        if (r4 != -1) {
            s(r4, true);
        }
        setCheckedId(r4);
    }

    public void n() {
        this.p = true;
        for (int r1 = 0; r1 < getChildCount(); r1++) {
            View childAt = getChildAt(r1);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.p = false;
        setCheckedId(-1);
    }

    int o(@i0 View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int r2 = 0;
        for (int r0 = 0; r0 < getChildCount(); r0++) {
            if (getChildAt(r0) instanceof Chip) {
                if (((Chip) getChildAt(r0)) == view) {
                    return r2;
                }
                r2++;
            }
        }
        return -1;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int r0 = this.o;
        if (r0 != -1) {
            s(r0, true);
            setCheckedId(this.o);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        b.i.p.p0.d.T1(accessibilityNodeInfo).V0(d.b.f(getRowCount(), c() ? getChipCount() : -1, false, q() ? 1 : 2));
    }

    public boolean p() {
        return this.k;
    }

    public boolean q() {
        return this.j;
    }

    public void setChipSpacing(@p int r1) {
        setChipSpacingHorizontal(r1);
        setChipSpacingVertical(r1);
    }

    public void setChipSpacingHorizontal(@p int r2) {
        if (this.h != r2) {
            this.h = r2;
            setItemSpacing(r2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@o int r2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(r2));
    }

    public void setChipSpacingResource(@o int r2) {
        setChipSpacing(getResources().getDimensionPixelOffset(r2));
    }

    public void setChipSpacingVertical(@p int r2) {
        if (this.i != r2) {
            this.i = r2;
            setLineSpacing(r2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@o int r2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(r2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@i0 Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int r2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.l = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.n.d = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.k = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int r2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int r2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(@h int r2) {
        setSingleLine(getResources().getBoolean(r2));
    }

    @Override // com.google.android.material.internal.e
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(@h int r2) {
        setSingleSelection(getResources().getBoolean(r2));
    }

    public void setSingleSelection(boolean z) {
        if (this.j != z) {
            this.j = z;
            n();
        }
    }
}
