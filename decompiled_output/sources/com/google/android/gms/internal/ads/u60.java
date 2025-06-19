package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u60 extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private final Context d;
    private View e;

    private u60(Context context) {
        super(context);
        this.d = context;
    }

    public static u60 a(Context context, View view, km1 km1Var) {
        u60 u60Var = new u60(context);
        u60Var.e = view;
        u60Var.addView(view);
        com.google.android.gms.ads.internal.p.z();
        ss.b(u60Var, u60Var);
        com.google.android.gms.ads.internal.p.z();
        ss.a(u60Var, u60Var);
        JSONObject jSONObject = km1Var.d0;
        if (jSONObject != null) {
            RelativeLayout relativeLayout = new RelativeLayout(u60Var.d);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
            if (jSONObjectOptJSONObject != null) {
                u60Var.b(jSONObjectOptJSONObject, relativeLayout, 10);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
            if (jSONObjectOptJSONObject2 != null) {
                u60Var.b(jSONObjectOptJSONObject2, relativeLayout, 12);
            }
            u60Var.addView(relativeLayout);
        }
        return u60Var;
    }

    private final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int r9) {
        TextView textView = new TextView(this.d);
        textView.setTextColor(-1);
        textView.setBackgroundColor(b.i.p.f0.t);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int r2 = c(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, r2, 0, r2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, c(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(r9);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int c(double d) {
        qx2.a();
        return jr.r(this.d, (int) d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.e.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.e.setY(-r0[1]);
    }
}
