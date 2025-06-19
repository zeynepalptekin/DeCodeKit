package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import b.a.a;

/* loaded from: classes.dex */
public class u extends RatingBar {
    private final s d;

    public u(@androidx.annotation.h0 Context context) {
        this(context, null);
    }

    public u(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.ratingBarStyle);
    }

    public u(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        v0.a(this, getContext());
        s sVar = new s(this);
        this.d = sVar;
        sVar.c(attributeSet, r3);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        Bitmap bitmapB = this.d.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), r2, 0), getMeasuredHeight());
        }
    }
}
