package b.i.p.p0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.p0;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static final String g = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
    private final int d;
    private final d e;
    private final int f;

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public a(int r1, d dVar, int r3) {
        this.d = r1;
        this.e = dVar;
        this.f = r3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@h0 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(g, this.d);
        this.e.F0(this.f, bundle);
    }
}
