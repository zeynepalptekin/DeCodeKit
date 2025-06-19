package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class f extends View {
    public f(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public f(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        super.setVisibility(8);
    }

    public f(Context context, AttributeSet attributeSet, int r3, int r4) {
        super(context, attributeSet, r3);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int r2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f234a = r2;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int r2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f235b = r2;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        aVar.f236c = f;
        setLayoutParams(aVar);
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
    }
}
