package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.h0;
import androidx.annotation.i;
import androidx.annotation.i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.b.h;
import c.a.b.c.b.j;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    @i0
    private Map<View, Integer> l;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void j0(@h0 View view, boolean z) {
        int r6;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.l = new HashMap(childCount);
            }
            for (int r4 = 0; r4 < childCount; r4++) {
                View childAt = coordinatorLayout.getChildAt(r4);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.l.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        r6 = 4;
                    } else {
                        Map<View, Integer> map = this.l;
                        if (map != null && map.containsKey(childAt)) {
                            r6 = this.l.get(childAt).intValue();
                        }
                    }
                    f0.K1(childAt, r6);
                }
            }
            if (z) {
                return;
            }
            this.l = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @i
    protected boolean K(@h0 View view, @h0 View view2, boolean z, boolean z2) {
        j0(view2, z);
        return super.K(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @h0
    protected FabTransformationBehavior.e h0(Context context, boolean z) {
        int r4 = z ? a.b.mtrl_fab_transformation_sheet_expand_spec : a.b.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f6865a = h.d(context, r4);
        eVar.f6866b = new j(17, 0.0f, 0.0f);
        return eVar;
    }
}
