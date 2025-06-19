package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f125a;

    public b(ActionBarContainer actionBarContainer) {
        this.f125a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f125a;
        if (actionBarContainer.k) {
            Drawable drawable = actionBarContainer.j;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f125a;
        Drawable drawable3 = actionBarContainer2.i;
        if (drawable3 == null || !actionBarContainer2.l) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @androidx.annotation.m0(21)
    public void getOutline(@androidx.annotation.h0 Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f125a;
        if (actionBarContainer.k) {
            drawable = actionBarContainer.j;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.h;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
