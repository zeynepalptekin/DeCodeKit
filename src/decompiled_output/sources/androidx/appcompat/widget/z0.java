package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class z0 extends p0 {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f218b;

    public z0(@androidx.annotation.h0 Context context, @androidx.annotation.h0 Resources resources) {
        super(resources);
        this.f218b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.p0, android.content.res.Resources
    public Drawable getDrawable(int r4) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(r4);
        Context context = this.f218b.get();
        if (drawable != null && context != null) {
            o0.h().x(context, r4, drawable);
        }
        return drawable;
    }
}
