package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.p0;
import androidx.appcompat.widget.h0;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements h0 {
    private h0.a d;

    public FitWindowsFrameLayout(@androidx.annotation.h0 Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        h0.a aVar = this.d;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.h0
    public void setOnFitSystemWindowsListener(h0.a aVar) {
        this.d = aVar;
    }
}
