package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import b.a.a;

/* loaded from: classes.dex */
class r extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f185b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f186a;

    static {
        f185b = Build.VERSION.SDK_INT < 21;
    }

    public r(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, @androidx.annotation.f int r4) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super(context, attributeSet, r4);
        a(context, attributeSet, r4, 0);
    }

    public r(@androidx.annotation.h0 Context context, @androidx.annotation.i0 AttributeSet attributeSet, @androidx.annotation.f int r3, @androidx.annotation.t0 int r4) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super(context, attributeSet, r3, r4);
        a(context, attributeSet, r3, r4);
    }

    private void a(Context context, AttributeSet attributeSet, int r4, int r5) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        a1 a1VarG = a1.G(context, attributeSet, a.m.PopupWindow, r4, r5);
        if (a1VarG.C(a.m.PopupWindow_overlapAnchor)) {
            b(a1VarG.a(a.m.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a1VarG.h(a.m.PopupWindow_android_popupBackground));
        a1VarG.I();
    }

    private void b(boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (f185b) {
            this.f186a = z;
        } else {
            androidx.core.widget.k.c(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int r3, int r4) {
        if (f185b && this.f186a) {
            r4 -= view.getHeight();
        }
        super.showAsDropDown(view, r3, r4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int r3, int r4, int r5) {
        if (f185b && this.f186a) {
            r4 -= view.getHeight();
        }
        super.showAsDropDown(view, r3, r4, r5);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int r8, int r9, int r10, int r11) {
        if (f185b && this.f186a) {
            r9 -= view.getHeight();
        }
        super.update(view, r8, r9, r10, r11);
    }
}
