package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

@TargetApi(19)
/* loaded from: classes.dex */
public final class ur0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    private Context f5586a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private PopupWindow f5587b;

    private static PopupWindow c(Context context, View view) {
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view, -1, -1);
        PopupWindow popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setClippingEnabled(false);
        tr.f("Displaying the 1x1 popup off the screen.");
        try {
            popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            return popupWindow;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        Context context = this.f5586a;
        if (context == null || this.f5587b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f5587b.isShowing()) {
            this.f5587b.dismiss();
        }
        this.f5586a = null;
        this.f5587b = null;
    }

    public final void b(Context context, View view) {
        if (!com.google.android.gms.common.util.v.h() || com.google.android.gms.common.util.v.j()) {
            return;
        }
        PopupWindow popupWindowC = c(context, view);
        this.f5587b = popupWindowC;
        if (popupWindowC == null) {
            context = null;
        }
        this.f5586a = context;
    }
}
