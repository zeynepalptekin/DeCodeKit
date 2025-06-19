package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.p0;
import b.d.a;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    private final int d;
    private final int e;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = getResources().getDimensionPixelOffset(a.c.browser_actions_context_menu_min_padding);
        this.e = getResources().getDimensionPixelOffset(a.c.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r2, int r3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.d * 2), this.e), 1073741824), r3);
    }
}
