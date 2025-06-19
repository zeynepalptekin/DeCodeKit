package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.h0;
import androidx.annotation.m0;

@m0(21)
/* loaded from: classes.dex */
class b extends c {
    protected b(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // androidx.core.graphics.drawable.c
    void f(int r7, int r8, int r9, Rect rect, Rect rect2) {
        Gravity.apply(r7, r8, r9, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@h0 Outline outline) {
        t();
        outline.setRoundRect(this.h, c());
    }

    @Override // androidx.core.graphics.drawable.c
    public boolean h() {
        Bitmap bitmap = this.f391a;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // androidx.core.graphics.drawable.c
    public void o(boolean z) {
        Bitmap bitmap = this.f391a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }
}
