package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class fg extends eg implements z6<rw> {

    /* renamed from: c, reason: collision with root package name */
    private final rw f3406c;
    private final Context d;
    private final WindowManager e;
    private final o f;
    private DisplayMetrics g;
    private float h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;

    public fg(rw rwVar, Context context, o oVar) {
        super(rwVar);
        this.i = -1;
        this.j = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.f3406c = rwVar;
        this.d = context;
        this.f = oVar;
        this.e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(rw rwVar, Map map) throws JSONException {
        int r9;
        this.g = new DisplayMetrics();
        Display defaultDisplay = this.e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.g);
        this.h = this.g.density;
        this.k = defaultDisplay.getRotation();
        qx2.a();
        DisplayMetrics displayMetrics = this.g;
        this.i = jr.k(displayMetrics, displayMetrics.widthPixels);
        qx2.a();
        DisplayMetrics displayMetrics2 = this.g;
        this.j = jr.k(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityA = this.f3406c.a();
        if (activityA == null || activityA.getWindow() == null) {
            this.l = this.i;
            r9 = this.j;
        } else {
            com.google.android.gms.ads.internal.p.c();
            int[] r92 = to.S(activityA);
            qx2.a();
            this.l = jr.k(this.g, r92[0]);
            qx2.a();
            r9 = jr.k(this.g, r92[1]);
        }
        this.m = r9;
        if (this.f3406c.h().e()) {
            this.n = this.i;
            this.o = this.j;
        } else {
            this.f3406c.measure(0, 0);
        }
        c(this.i, this.j, this.l, this.m, this.h, this.k);
        this.f3406c.e("onDeviceFeaturesReceived", new ag(new cg().c(this.f.b()).b(this.f.c()).d(this.f.e()).e(this.f.d()).f(true)).a());
        int[] r1 = new int[2];
        this.f3406c.getLocationOnScreen(r1);
        h(qx2.a().j(this.d, r1[0]), qx2.a().j(this.d, r1[1]));
        if (tr.a(2)) {
            tr.h("Dispatching Ready Event.");
        }
        f(this.f3406c.b().d);
    }

    public final void h(int r6, int r7) {
        int r1 = this.d instanceof Activity ? com.google.android.gms.ads.internal.p.c().a0((Activity) this.d)[0] : 0;
        if (this.f3406c.h() == null || !this.f3406c.h().e()) {
            int width = this.f3406c.getWidth();
            int height = this.f3406c.getHeight();
            if (((Boolean) qx2.e().c(e0.K)).booleanValue()) {
                if (width == 0 && this.f3406c.h() != null) {
                    width = this.f3406c.h().f3733c;
                }
                if (height == 0 && this.f3406c.h() != null) {
                    height = this.f3406c.h().f3732b;
                }
            }
            this.n = qx2.a().j(this.d, width);
            this.o = qx2.a().j(this.d, height);
        }
        d(r6, r7 - r1, this.n, this.o);
        this.f3406c.C0().k(r6, r7);
    }
}
