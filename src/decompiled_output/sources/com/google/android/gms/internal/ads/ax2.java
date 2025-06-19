package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ax2 {

    /* renamed from: a, reason: collision with root package name */
    private final hw2 f2762a;

    /* renamed from: b, reason: collision with root package name */
    private final iw2 f2763b;

    /* renamed from: c, reason: collision with root package name */
    private final s03 f2764c;
    private final q5 d;
    private final fk e;
    private final kl f;
    private final qg g;
    private final p5 h;

    public ax2(hw2 hw2Var, iw2 iw2Var, s03 s03Var, q5 q5Var, fk fkVar, kl klVar, qg qgVar, p5 p5Var) {
        this.f2762a = hw2Var;
        this.f2763b = iw2Var;
        this.f2764c = s03Var;
        this.d = q5Var;
        this.e = fkVar;
        this.f = klVar;
        this.g = qgVar;
        this.h = p5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        qx2.a().d(context, qx2.g().d, "gmob-apps", bundle, true);
    }

    public final o3 a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return new mx2(this, frameLayout, frameLayout2, context).b(context, false);
    }

    public final r3 b(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        return new px2(this, view, map, map2).b(view.getContext(), false);
    }

    @androidx.annotation.i0
    public final jn c(Context context, qc qcVar) {
        return new fx2(this, context, qcVar).b(context, false);
    }

    public final hy2 e(Context context, qw2 qw2Var, String str, qc qcVar) {
        return new jx2(this, context, qw2Var, str, qcVar).b(context, false);
    }

    @androidx.annotation.i0
    public final gg g(Context context, qc qcVar) {
        return new hx2(this, context, qcVar).b(context, false);
    }

    @androidx.annotation.i0
    public final pg h(Activity activity) {
        bx2 bx2Var = new bx2(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            tr.g("useClientJar flag not found in activity intent extras.");
        }
        return bx2Var.b(activity, booleanExtra);
    }

    public final dy2 j(Context context, String str, qc qcVar) {
        return new kx2(this, context, str, qcVar).b(context, false);
    }

    public final tk l(Context context, String str, qc qcVar) {
        return new cx2(this, context, str, qcVar).b(context, false);
    }
}
