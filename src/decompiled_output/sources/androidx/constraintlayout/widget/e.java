package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class e extends b {
    public e(Context context) {
        super(context);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public e(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    @Override // androidx.constraintlayout.widget.b
    protected void b(AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException {
        super.b(attributeSet);
        this.h = false;
    }

    @Override // androidx.constraintlayout.widget.b
    public void c(ConstraintLayout constraintLayout) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.l0.F1(0);
        aVar.l0.g1(0);
    }

    @Override // androidx.constraintlayout.widget.b
    public void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int r4 = 0; r4 < this.e; r4++) {
            View viewF = constraintLayout.f(this.d[r4]);
            if (viewF != null) {
                viewF.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    viewF.setElevation(elevation);
                }
            }
        }
    }
}
