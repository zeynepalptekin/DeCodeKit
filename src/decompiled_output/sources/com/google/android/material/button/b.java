package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.h;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.w;
import androidx.annotation.x0;
import b.i.p.f0;
import b.i.p.m;
import b.i.p.p0.d;
import c.a.b.c.a;
import c.a.b.c.u.o;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.s;
import com.google.android.material.internal.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class b extends LinearLayout {
    private static final String n = b.class.getSimpleName();
    private static final int o = a.n.Widget_MaterialComponents_MaterialButtonToggleGroup;
    private final List<d> d;
    private final c e;
    private final f f;
    private final LinkedHashSet<e> g;
    private final Comparator<MaterialButton> h;
    private Integer[] i;
    private boolean j;
    private boolean k;
    private boolean l;

    @w
    private int m;

    class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int r0 = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (r0 != 0) {
                return r0;
            }
            int r02 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return r02 != 0 ? r02 : Integer.valueOf(b.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(b.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.b$b, reason: collision with other inner class name */
    class C0194b extends b.i.p.a {
        C0194b() {
        }

        @Override // b.i.p.a
        public void g(View view, @h0 b.i.p.p0.d dVar) {
            super.g(view, dVar);
            dVar.W0(d.c.h(0, 1, b.this.p(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private class c implements MaterialButton.b {
        private c() {
        }

        /* synthetic */ c(b bVar, a aVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(@h0 MaterialButton materialButton, boolean z) {
            if (b.this.j) {
                return;
            }
            if (b.this.k) {
                b.this.m = z ? materialButton.getId() : -1;
            }
            if (b.this.z(materialButton.getId(), z)) {
                b.this.n(materialButton.getId(), materialButton.isChecked());
            }
            b.this.invalidate();
        }
    }

    private static class d {
        private static final c.a.b.c.u.d e = new c.a.b.c.u.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        c.a.b.c.u.d f6650a;

        /* renamed from: b, reason: collision with root package name */
        c.a.b.c.u.d f6651b;

        /* renamed from: c, reason: collision with root package name */
        c.a.b.c.u.d f6652c;
        c.a.b.c.u.d d;

        d(c.a.b.c.u.d dVar, c.a.b.c.u.d dVar2, c.a.b.c.u.d dVar3, c.a.b.c.u.d dVar4) {
            this.f6650a = dVar;
            this.f6651b = dVar3;
            this.f6652c = dVar4;
            this.d = dVar2;
        }

        public static d a(d dVar) {
            c.a.b.c.u.d dVar2 = e;
            return new d(dVar2, dVar.d, dVar2, dVar.f6652c);
        }

        public static d b(d dVar, View view) {
            return z.i(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            c.a.b.c.u.d dVar2 = dVar.f6650a;
            c.a.b.c.u.d dVar3 = dVar.d;
            c.a.b.c.u.d dVar4 = e;
            return new d(dVar2, dVar3, dVar4, dVar4);
        }

        public static d d(d dVar) {
            c.a.b.c.u.d dVar2 = e;
            return new d(dVar2, dVar2, dVar.f6651b, dVar.f6652c);
        }

        public static d e(d dVar, View view) {
            return z.i(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            c.a.b.c.u.d dVar2 = dVar.f6650a;
            c.a.b.c.u.d dVar3 = e;
            return new d(dVar2, dVar3, dVar.f6651b, dVar3);
        }
    }

    public interface e {
        void a(b bVar, @w int r2, boolean z);
    }

    private class f implements MaterialButton.c {
        private f() {
        }

        /* synthetic */ f(b bVar, a aVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public void a(@h0 MaterialButton materialButton, boolean z) {
            b.this.invalidate();
        }
    }

    public b(@h0 Context context) {
        this(context, null);
    }

    public b(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.materialButtonToggleGroupStyle);
    }

    public b(@h0 Context context, @i0 AttributeSet attributeSet, int r9) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r9, o), attributeSet, r9);
        this.d = new ArrayList();
        a aVar = null;
        this.e = new c(this, aVar);
        this.f = new f(this, aVar);
        this.g = new LinkedHashSet<>();
        this.h = new a();
        this.j = false;
        TypedArray typedArrayJ = s.j(getContext(), attributeSet, a.o.MaterialButtonToggleGroup, r9, o, new int[0]);
        setSingleSelection(typedArrayJ.getBoolean(a.o.MaterialButtonToggleGroup_singleSelection, false));
        this.m = typedArrayJ.getResourceId(a.o.MaterialButtonToggleGroup_checkedButton, -1);
        this.l = typedArrayJ.getBoolean(a.o.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayJ.recycle();
        f0.K1(this, 1);
    }

    private void A() {
        TreeMap treeMap = new TreeMap(this.h);
        int childCount = getChildCount();
        for (int r3 = 0; r3 < childCount; r3++) {
            treeMap.put(o(r3), Integer.valueOf(r3));
        }
        this.i = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int r1 = 0; r1 < childCount; r1++) {
            if (r(r1)) {
                return r1;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (r(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int r1 = 0;
        for (int r0 = 0; r0 < getChildCount(); r0++) {
            if ((getChildAt(r0) instanceof MaterialButton) && r(r0)) {
                r1++;
            }
        }
        return r1;
    }

    private void h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int r1 = firstVisibleChildIndex + 1; r1 < getChildCount(); r1++) {
            MaterialButton materialButtonO = o(r1);
            int r3 = Math.min(materialButtonO.getStrokeWidth(), o(r1 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsI = i(materialButtonO);
            if (getOrientation() == 0) {
                m.g(layoutParamsI, 0);
                m.h(layoutParamsI, -r3);
            } else {
                layoutParamsI.bottomMargin = 0;
                layoutParamsI.topMargin = -r3;
            }
            materialButtonO.setLayoutParams(layoutParamsI);
        }
        v(firstVisibleChildIndex);
    }

    @h0
    private LinearLayout.LayoutParams i(@h0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void k(int r2) {
        w(r2, true);
        z(r2, true);
        setCheckedId(r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(@w int r3, boolean z) {
        Iterator<e> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().a(this, r3, z);
        }
    }

    private MaterialButton o(int r1) {
        return (MaterialButton) getChildAt(r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int p(@i0 View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int r2 = 0;
        for (int r0 = 0; r0 < getChildCount(); r0++) {
            if (getChildAt(r0) == view) {
                return r2;
            }
            if ((getChildAt(r0) instanceof MaterialButton) && r(r0)) {
                r2++;
            }
        }
        return -1;
    }

    @i0
    private d q(int r3, int r4, int r5) {
        d dVar = this.d.get(r3);
        if (r4 == r5) {
            return dVar;
        }
        boolean z = getOrientation() == 0;
        if (r3 == r4) {
            return z ? d.e(dVar, this) : d.f(dVar);
        }
        if (r3 == r5) {
            return z ? d.b(dVar, this) : d.a(dVar);
        }
        return null;
    }

    private boolean r(int r2) {
        return getChildAt(r2).getVisibility() != 8;
    }

    private void setCheckedId(int r2) {
        this.m = r2;
        n(r2, true);
    }

    private void setGeneratedIdIfNeeded(@h0 MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(f0.B());
        }
    }

    private void setupButtonChild(@h0 MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.a(this.e);
        materialButton.setOnPressedChangeListenerInternal(this.f);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void v(int r4) {
        if (getChildCount() == 0 || r4 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) o(r4).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            m.g(layoutParams, 0);
            m.h(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void w(@w int r2, boolean z) {
        View viewFindViewById = findViewById(r2);
        if (viewFindViewById instanceof MaterialButton) {
            this.j = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.j = false;
        }
    }

    private static void y(o.b bVar, @i0 d dVar) {
        if (dVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.L(dVar.f6650a).y(dVar.d).Q(dVar.f6651b).D(dVar.f6652c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(int r5, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.l && checkedButtonIds.isEmpty()) {
            w(r5, true);
            this.m = r5;
            return false;
        }
        if (z && this.k) {
            checkedButtonIds.remove(Integer.valueOf(r5));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int r6 = it.next().intValue();
                w(r6, false);
                n(r6, false);
            }
        }
        return true;
    }

    @x0
    void B() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int r3 = 0; r3 < childCount; r3++) {
            MaterialButton materialButtonO = o(r3);
            if (materialButtonO.getVisibility() != 8) {
                o.b bVarV = materialButtonO.getShapeAppearanceModel().v();
                y(bVarV, q(r3, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonO.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int r6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(n, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, r6, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            z(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        o shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.d.add(new d(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        f0.u1(materialButton, new C0194b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@h0 Canvas canvas) {
        A();
        super.dispatchDraw(canvas);
    }

    public void g(@h0 e eVar) {
        this.g.add(eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @h0
    public CharSequence getAccessibilityClassName() {
        return b.class.getName();
    }

    @w
    public int getCheckedButtonId() {
        if (this.k) {
            return this.m;
        }
        return -1;
    }

    @h0
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int r1 = 0; r1 < getChildCount(); r1++) {
            MaterialButton materialButtonO = o(r1);
            if (materialButtonO.isChecked()) {
                arrayList.add(Integer.valueOf(materialButtonO.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int r2, int r3) {
        Integer[] numArr = this.i;
        if (numArr != null && r3 < numArr.length) {
            return numArr[r3].intValue();
        }
        Log.w(n, "Child order wasn't updated");
        return r3;
    }

    public void j(@w int r2) {
        if (r2 == this.m) {
            return;
        }
        k(r2);
    }

    public void l() {
        this.j = true;
        for (int r1 = 0; r1 < getChildCount(); r1++) {
            MaterialButton materialButtonO = o(r1);
            materialButtonO.setChecked(false);
            n(materialButtonO.getId(), false);
        }
        this.j = false;
        setCheckedId(-1);
    }

    public void m() {
        this.g.clear();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int r0 = this.m;
        if (r0 != -1) {
            k(r0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        b.i.p.p0.d.T1(accessibilityNodeInfo).V0(d.b.f(1, getVisibleButtonCount(), false, t() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r1, int r2) {
        B();
        h();
        super.onMeasure(r1, r2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f(this.e);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int r3 = indexOfChild(view);
        if (r3 >= 0) {
            this.d.remove(r3);
        }
        B();
        h();
    }

    public boolean s() {
        return this.l;
    }

    public void setSelectionRequired(boolean z) {
        this.l = z;
    }

    public void setSingleSelection(@h int r2) {
        setSingleSelection(getResources().getBoolean(r2));
    }

    public void setSingleSelection(boolean z) {
        if (this.k != z) {
            this.k = z;
            l();
        }
    }

    public boolean t() {
        return this.k;
    }

    public void u(@h0 e eVar) {
        this.g.remove(eVar);
    }

    public void x(@w int r3) {
        w(r3, false);
        z(r3, false);
        this.m = -1;
        n(r3, false);
    }
}
