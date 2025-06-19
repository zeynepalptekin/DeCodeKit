package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class pp {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4855a;

    /* renamed from: b, reason: collision with root package name */
    private String f4856b;

    /* renamed from: c, reason: collision with root package name */
    private String f4857c;
    private String d;

    @androidx.annotation.i0
    private String e;
    private int f;
    private int g;
    private PointF h;
    private PointF i;
    private Handler j;
    private Runnable k;

    public pp(Context context) {
        this.f = 0;
        this.k = new Runnable(this) { // from class: com.google.android.gms.internal.ads.op
            private final pp d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.m();
            }
        };
        this.f4855a = context;
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.p.q().b();
        this.j = com.google.android.gms.ads.internal.p.q().a();
    }

    public pp(Context context, String str) {
        this(context);
        this.f4856b = str;
    }

    private static int c(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    private final boolean f(float f, float f2, float f3, float f4) {
        return Math.abs(this.h.x - f) < ((float) this.g) && Math.abs(this.h.y - f2) < ((float) this.g) && Math.abs(this.i.x - f3) < ((float) this.g) && Math.abs(this.i.y - f4) < ((float) this.g);
    }

    public final void a(String str) {
        this.f4857c = str;
    }

    public final void b() {
        try {
            if (!(this.f4855a instanceof Activity)) {
                tr.h("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(com.google.android.gms.ads.internal.p.m().l()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = com.google.android.gms.ads.internal.p.m().m() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            final int r3 = c(arrayList, "Ad Information", true);
            final int r0 = c(arrayList, str, true);
            final int r1 = c(arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f4855a, com.google.android.gms.ads.internal.p.e().t());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, r3, r0, r1) { // from class: com.google.android.gms.internal.ads.rp
                private final pp d;
                private final int e;
                private final int f;
                private final int g;

                {
                    this.d = this;
                    this.e = r3;
                    this.f = r0;
                    this.g = r1;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int r8) {
                    this.d.d(this.e, this.f, this.g, dialogInterface, r8);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            oo.l("", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void d(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L9b
            android.content.Context r1 = r0.f4855a
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto Le
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.tr.h(r1)
            return
        Le:
            java.lang.String r1 = r0.f4856b
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L71
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.p.c()
            java.util.Map r1 = com.google.android.gms.internal.ads.to.d0(r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L3f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L3f
        L62:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L71
            goto L73
        L71:
            java.lang.String r1 = "No debug information"
        L73:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.f4855a
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            com.google.android.gms.internal.ads.qp r3 = new com.google.android.gms.internal.ads.qp
            r3.<init>(r0, r1)
            java.lang.String r1 = "Share"
            r2.setPositiveButton(r1, r3)
            android.content.DialogInterface$OnClickListener r1 = com.google.android.gms.internal.ads.tp.d
            java.lang.String r3 = "Close"
            r2.setNegativeButton(r3, r1)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L9b:
            if (r5 != r2) goto Lad
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.tr.f(r1)
            com.google.android.gms.internal.ads.cy1 r1 = com.google.android.gms.internal.ads.cs.f3023a
            com.google.android.gms.internal.ads.sp r2 = new com.google.android.gms.internal.ads.sp
            r2.<init>(r0)
            r1.execute(r2)
            return
        Lad:
            if (r5 != r3) goto Lbe
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.tr.f(r1)
            com.google.android.gms.internal.ads.cy1 r1 = com.google.android.gms.internal.ads.cs.f3023a
            com.google.android.gms.internal.ads.vp r2 = new com.google.android.gms.internal.ads.vp
            r2.<init>(r0)
            r1.execute(r2)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pp.d(int, int, int, android.content.DialogInterface, int):void");
    }

    final /* synthetic */ void e(String str, DialogInterface dialogInterface, int r4) {
        com.google.android.gms.ads.internal.p.c();
        to.i(this.f4855a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final void g(String str) {
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getActionMasked()
            int r1 = r11.getHistorySize()
            int r2 = r11.getPointerCount()
            r3 = 0
            if (r0 != 0) goto L21
            r10.f = r3
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r3)
            float r11 = r11.getY(r3)
            r0.<init>(r1, r11)
            r10.h = r0
            return
        L21:
            int r4 = r10.f
            r5 = -1
            if (r4 != r5) goto L27
            return
        L27:
            r6 = 5
            r7 = 1
            if (r4 != 0) goto L56
            if (r0 != r6) goto L56
            r10.f = r6
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r7)
            float r11 = r11.getY(r7)
            r0.<init>(r1, r11)
            r10.i = r0
            android.os.Handler r11 = r10.j
            java.lang.Runnable r0 = r10.k
            com.google.android.gms.internal.ads.s<java.lang.Long> r1 = com.google.android.gms.internal.ads.e0.T2
            com.google.android.gms.internal.ads.z r2 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r1 = r2.c(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r11.postDelayed(r0, r1)
            return
        L56:
            int r4 = r10.f
            if (r4 != r6) goto La2
            r4 = 2
            if (r2 == r4) goto L5f
        L5d:
            r3 = 1
            goto L97
        L5f:
            if (r0 != r4) goto L97
            r0 = 0
            r2 = 0
        L63:
            if (r0 >= r1) goto L7f
            float r4 = r11.getHistoricalX(r3, r0)
            float r6 = r11.getHistoricalY(r3, r0)
            float r8 = r11.getHistoricalX(r7, r0)
            float r9 = r11.getHistoricalY(r7, r0)
            boolean r4 = r10.f(r4, r6, r8, r9)
            if (r4 != 0) goto L7c
            r2 = 1
        L7c:
            int r0 = r0 + 1
            goto L63
        L7f:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r11.getX(r7)
            float r11 = r11.getY(r7)
            boolean r11 = r10.f(r0, r1, r3, r11)
            if (r11 != 0) goto L96
            goto L5d
        L96:
            r3 = r2
        L97:
            if (r3 == 0) goto La2
            r10.f = r5
            android.os.Handler r11 = r10.j
            java.lang.Runnable r0 = r10.k
            r11.removeCallbacks(r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pp.h(android.view.MotionEvent):void");
    }

    public final void i(String str) {
        this.f4856b = str;
    }

    public final void j(String str) {
        this.e = str;
    }

    final /* synthetic */ void k() {
        com.google.android.gms.ads.internal.p.m().a(this.f4855a, this.f4857c, this.d, this.e);
    }

    final /* synthetic */ void l() {
        com.google.android.gms.ads.internal.p.m().g(this.f4855a, this.f4857c, this.d);
    }

    final /* synthetic */ void m() {
        this.f = 4;
        b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f4856b);
        sb.append(",DebugSignal: ");
        sb.append(this.e);
        sb.append(",AFMA Version: ");
        sb.append(this.d);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f4857c);
        sb.append("}");
        return sb.toString();
    }
}
