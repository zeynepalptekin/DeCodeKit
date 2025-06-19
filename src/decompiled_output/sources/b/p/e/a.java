package b.p.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;

@Deprecated
/* loaded from: classes.dex */
public class a extends View {
    @Deprecated
    public a(@h0 Context context) {
        this(context, null);
    }

    @Deprecated
    public a(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public a(@h0 Context context, @i0 AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    private static int a(int r2, int r3) {
        int mode = View.MeasureSpec.getMode(r3);
        int size = View.MeasureSpec.getSize(r3);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? r2 : size : Math.min(r2, size);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    @Deprecated
    protected void onMeasure(int r2, int r3) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), r2), a(getSuggestedMinimumHeight(), r3));
    }
}
