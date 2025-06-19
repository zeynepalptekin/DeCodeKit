package c.a.b.c.d;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.x0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import b.a.a;
import b.i.o.h;
import b.i.p.f0;
import b.i.p.p0.d;
import b.w.j0;
import b.w.l0;
import c.a.b.c.a;
import com.google.android.material.internal.r;
import java.util.HashSet;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class c extends ViewGroup implements o {
    private static final long C = 115;
    private static final int D = 5;
    private static final int[] E = {R.attr.state_checked};
    private static final int[] F = {-16842910};
    private d A;
    private g B;

    @h0
    private final l0 d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    @h0
    private final View.OnClickListener j;
    private final h.a<c.a.b.c.d.a> k;
    private boolean l;
    private int m;

    @i0
    private c.a.b.c.d.a[] n;
    private int o;
    private int p;
    private ColorStateList q;

    @p
    private int r;
    private ColorStateList s;

    @i0
    private final ColorStateList t;

    @t0
    private int u;

    @t0
    private int v;
    private Drawable w;
    private int x;
    private int[] y;

    @h0
    private SparseArray<c.a.b.c.c.a> z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j itemData = ((c.a.b.c.d.a) view).getItemData();
            if (c.this.B.P(itemData, c.this.A, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public c(Context context) {
        this(context, null);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new h.c(5);
        this.o = 0;
        this.p = 0;
        this.z = new SparseArray<>(5);
        Resources resources = getResources();
        this.e = resources.getDimensionPixelSize(a.f.design_bottom_navigation_item_max_width);
        this.f = resources.getDimensionPixelSize(a.f.design_bottom_navigation_item_min_width);
        this.g = resources.getDimensionPixelSize(a.f.design_bottom_navigation_active_item_max_width);
        this.h = resources.getDimensionPixelSize(a.f.design_bottom_navigation_active_item_min_width);
        this.i = resources.getDimensionPixelSize(a.f.design_bottom_navigation_height);
        this.t = e(R.attr.textColorSecondary);
        b.w.c cVar = new b.w.c();
        this.d = cVar;
        cVar.d1(0);
        this.d.B0(C);
        this.d.D0(new b.o.b.a.b());
        this.d.Q0(new r());
        this.j = new a();
        this.y = new int[5];
        f0.K1(this, 1);
    }

    private c.a.b.c.d.a getNewItem() {
        c.a.b.c.d.a aVarB = this.k.b();
        return aVarB == null ? new c.a.b.c.d.a(getContext()) : aVarB;
    }

    private boolean j(int r4, int r5) {
        if (r4 == -1) {
            if (r5 > 3) {
                return true;
            }
        } else if (r4 == 0) {
            return true;
        }
        return false;
    }

    private boolean k(int r2) {
        return r2 != -1;
    }

    private void m() {
        HashSet hashSet = new HashSet();
        for (int r2 = 0; r2 < this.B.size(); r2++) {
            hashSet.add(Integer.valueOf(this.B.getItem(r2).getItemId()));
        }
        for (int r1 = 0; r1 < this.z.size(); r1++) {
            int r22 = this.z.keyAt(r1);
            if (!hashSet.contains(Integer.valueOf(r22))) {
                this.z.delete(r22);
            }
        }
    }

    private void p(int r3) {
        if (k(r3)) {
            return;
        }
        throw new IllegalArgumentException(r3 + " is not a valid view id");
    }

    private void setBadgeIfNeeded(@h0 c.a.b.c.d.a aVar) {
        c.a.b.c.c.a aVar2;
        int id = aVar.getId();
        if (k(id) && (aVar2 = this.z.get(id)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public void c(g gVar) {
        this.B = gVar;
    }

    public void d() {
        removeAllViews();
        c.a.b.c.d.a[] aVarArr = this.n;
        if (aVarArr != null) {
            for (c.a.b.c.d.a aVar : aVarArr) {
                if (aVar != null) {
                    this.k.a(aVar);
                    aVar.j();
                }
            }
        }
        if (this.B.size() == 0) {
            this.o = 0;
            this.p = 0;
            this.n = null;
            return;
        }
        m();
        this.n = new c.a.b.c.d.a[this.B.size()];
        boolean zJ = j(this.m, this.B.H().size());
        for (int r2 = 0; r2 < this.B.size(); r2++) {
            this.A.d(true);
            this.B.getItem(r2).setCheckable(true);
            this.A.d(false);
            c.a.b.c.d.a newItem = getNewItem();
            this.n[r2] = newItem;
            newItem.setIconTintList(this.q);
            newItem.setIconSize(this.r);
            newItem.setTextColor(this.t);
            newItem.setTextAppearanceInactive(this.u);
            newItem.setTextAppearanceActive(this.v);
            newItem.setTextColor(this.s);
            Drawable drawable = this.w;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.x);
            }
            newItem.setShifting(zJ);
            newItem.setLabelVisibilityMode(this.m);
            newItem.g((j) this.B.getItem(r2), 0);
            newItem.setItemPosition(r2);
            newItem.setOnClickListener(this.j);
            if (this.o != 0 && this.B.getItem(r2).getItemId() == this.o) {
                this.p = r2;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int r0 = Math.min(this.B.size() - 1, this.p);
        this.p = r0;
        this.B.getItem(r0).setChecked(true);
    }

    @i0
    public ColorStateList e(int r10) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(r10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListC = b.a.b.a.a.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(a.b.colorPrimary, typedValue, true)) {
            return null;
        }
        int r0 = typedValue.data;
        int defaultColor = colorStateListC.getDefaultColor();
        return new ColorStateList(new int[][]{F, E, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListC.getColorForState(F, defaultColor), r0, defaultColor});
    }

    @i0
    @x0
    c.a.b.c.d.a f(int r6) {
        p(r6);
        c.a.b.c.d.a[] aVarArr = this.n;
        if (aVarArr == null) {
            return null;
        }
        for (c.a.b.c.d.a aVar : aVarArr) {
            if (aVar.getId() == r6) {
                return aVar;
            }
        }
        return null;
    }

    @i0
    c.a.b.c.c.a g(int r2) {
        return this.z.get(r2);
    }

    SparseArray<c.a.b.c.c.a> getBadgeDrawables() {
        return this.z;
    }

    @i0
    public ColorStateList getIconTintList() {
        return this.q;
    }

    @i0
    public Drawable getItemBackground() {
        c.a.b.c.d.a[] aVarArr = this.n;
        return (aVarArr == null || aVarArr.length <= 0) ? this.w : aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.x;
    }

    @p
    public int getItemIconSize() {
        return this.r;
    }

    @t0
    public int getItemTextAppearanceActive() {
        return this.v;
    }

    @t0
    public int getItemTextAppearanceInactive() {
        return this.u;
    }

    public ColorStateList getItemTextColor() {
        return this.s;
    }

    public int getLabelVisibilityMode() {
        return this.m;
    }

    public int getSelectedItemId() {
        return this.o;
    }

    @Override // androidx.appcompat.view.menu.o
    public int getWindowAnimations() {
        return 0;
    }

    c.a.b.c.c.a h(int r3) {
        p(r3);
        c.a.b.c.c.a aVarD = this.z.get(r3);
        if (aVarD == null) {
            aVarD = c.a.b.c.c.a.d(getContext());
            this.z.put(r3, aVarD);
        }
        c.a.b.c.d.a aVarF = f(r3);
        if (aVarF != null) {
            aVarF.setBadge(aVarD);
        }
        return aVarD;
    }

    public boolean i() {
        return this.l;
    }

    void l(int r3) {
        p(r3);
        c.a.b.c.c.a aVar = this.z.get(r3);
        c.a.b.c.d.a aVarF = f(r3);
        if (aVarF != null) {
            aVarF.j();
        }
        if (aVar != null) {
            this.z.remove(r3);
        }
    }

    void n(int r5) {
        int size = this.B.size();
        for (int r1 = 0; r1 < size; r1++) {
            MenuItem item = this.B.getItem(r1);
            if (r5 == item.getItemId()) {
                this.o = r5;
                this.p = r1;
                item.setChecked(true);
                return;
            }
        }
    }

    public void o() {
        g gVar = this.B;
        if (gVar == null || this.n == null) {
            return;
        }
        int size = gVar.size();
        if (size != this.n.length) {
            d();
            return;
        }
        int r1 = this.o;
        for (int r3 = 0; r3 < size; r3++) {
            MenuItem item = this.B.getItem(r3);
            if (item.isChecked()) {
                this.o = item.getItemId();
                this.p = r3;
            }
        }
        if (r1 != this.o) {
            j0.b(this, this.d);
        }
        boolean zJ = j(this.m, this.B.H().size());
        for (int r32 = 0; r32 < size; r32++) {
            this.A.d(true);
            this.n[r32].setLabelVisibilityMode(this.m);
            this.n[r32].setShifting(zJ);
            this.n[r32].g((j) this.B.getItem(r32), 0);
            this.A.d(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        b.i.p.p0.d.T1(accessibilityNodeInfo).V0(d.b.f(1, this.B.H().size(), false, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r6, int r7, int r8, int r9) {
        int childCount = getChildCount();
        int r82 = r8 - r6;
        int r92 = r9 - r7;
        int measuredWidth = 0;
        for (int r72 = 0; r72 < childCount; r72++) {
            View childAt = getChildAt(r72);
            if (childAt.getVisibility() != 8) {
                if (f0.W(this) == 1) {
                    int r2 = r82 - measuredWidth;
                    childAt.layout(r2 - childAt.getMeasuredWidth(), 0, r2, r92);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, r92);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int r11, int r12) {
        int size = View.MeasureSpec.getSize(r11);
        int size2 = this.B.H().size();
        int childCount = getChildCount();
        int r1 = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        if (j(this.m, size2) && this.l) {
            View childAt = getChildAt(this.p);
            int r7 = this.h;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.g, Integer.MIN_VALUE), r1);
                r7 = Math.max(r7, childAt.getMeasuredWidth());
            }
            int r122 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int r3 = Math.min(size - (this.f * r122), Math.min(r7, this.g));
            int r112 = size - r3;
            int r72 = Math.min(r112 / (r122 == 0 ? 1 : r122), this.e);
            int r113 = r112 - (r122 * r72);
            int r123 = 0;
            while (r123 < childCount) {
                if (getChildAt(r123).getVisibility() != 8) {
                    this.y[r123] = r123 == this.p ? r3 : r72;
                    if (r113 > 0) {
                        int[] r8 = this.y;
                        r8[r123] = r8[r123] + 1;
                        r113--;
                    }
                } else {
                    this.y[r123] = 0;
                }
                r123++;
            }
        } else {
            int r32 = Math.min(size / (size2 == 0 ? 1 : size2), this.g);
            int r114 = size - (size2 * r32);
            for (int r124 = 0; r124 < childCount; r124++) {
                if (getChildAt(r124).getVisibility() != 8) {
                    int[] r73 = this.y;
                    r73[r124] = r32;
                    if (r114 > 0) {
                        r73[r124] = r73[r124] + 1;
                        r114--;
                    }
                } else {
                    this.y[r124] = 0;
                }
            }
        }
        int measuredWidth = 0;
        for (int r115 = 0; r115 < childCount; r115++) {
            View childAt2 = getChildAt(r115);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.y[r115], 1073741824), r1);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(measuredWidth, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), 0), View.resolveSizeAndState(this.i, r1, 0));
    }

    void setBadgeDrawables(SparseArray<c.a.b.c.c.a> sparseArray) {
        this.z = sparseArray;
        c.a.b.c.d.a[] aVarArr = this.n;
        if (aVarArr != null) {
            for (c.a.b.c.d.a aVar : aVarArr) {
                aVar.setBadge(sparseArray.get(aVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.q = colorStateList;
        c.a.b.c.d.a[] aVarArr = this.n;
        if (aVarArr != null) {
            for (c.a.b.c.d.a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(@i0 Drawable drawable) {
        this.w = drawable;
        c.a.b.c.d.a[] aVarArr = this.n;
        if (aVarArr != null) {
            for (c.a.b.c.d.a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int r5) {
        this.x = r5;
        c.a.b.c.d.a[] aVarArr = this.n;
        if (aVarArr != null) {
            for (c.a.b.c.d.a aVar : aVarArr) {
                aVar.setItemBackground(r5);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.l = z;
    }

    public void setItemIconSize(@p int r5) {
        this.r = r5;
        c.a.b.c.d.a[] aVarArr = this.n;
        if (aVarArr != null) {
            for (c.a.b.c.d.a aVar : aVarArr) {
                aVar.setIconSize(r5);
            }
        }
    }

    public void setItemTextAppearanceActive(@t0 int r6) {
        this.v = r6;
        c.a.b.c.d.a[] aVarArr = this.n;
        if (aVarArr != null) {
            for (c.a.b.c.d.a aVar : aVarArr) {
                aVar.setTextAppearanceActive(r6);
                ColorStateList colorStateList = this.s;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@t0 int r6) {
        this.u = r6;
        c.a.b.c.d.a[] aVarArr = this.n;
        if (aVarArr != null) {
            for (c.a.b.c.d.a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(r6);
                ColorStateList colorStateList = this.s;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.s = colorStateList;
        c.a.b.c.d.a[] aVarArr = this.n;
        if (aVarArr != null) {
            for (c.a.b.c.d.a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int r1) {
        this.m = r1;
    }

    public void setPresenter(d dVar) {
        this.A = dVar;
    }
}
