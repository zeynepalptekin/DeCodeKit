package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@TargetApi(14)
/* loaded from: classes.dex */
public final class js2 extends Thread {
    private boolean d;
    private boolean e;
    private boolean f;
    private final Object g;
    private final cs2 h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final String q;
    private final boolean r;
    private final boolean s;
    private final boolean t;

    public js2() {
        this(new cs2());
    }

    @com.google.android.gms.common.util.d0
    private js2(cs2 cs2Var) {
        this.d = false;
        this.e = false;
        this.f = false;
        this.h = cs2Var;
        this.g = new Object();
        this.j = u1.d.a().intValue();
        this.k = u1.f5467a.a().intValue();
        this.l = u1.e.a().intValue();
        this.m = u1.f5469c.a().intValue();
        this.n = ((Integer) qx2.e().c(e0.L)).intValue();
        this.o = ((Integer) qx2.e().c(e0.M)).intValue();
        this.p = ((Integer) qx2.e().c(e0.N)).intValue();
        this.i = u1.f.a().intValue();
        this.q = (String) qx2.e().c(e0.P);
        this.r = ((Boolean) qx2.e().c(e0.Q)).booleanValue();
        this.s = ((Boolean) qx2.e().c(e0.R)).booleanValue();
        this.t = ((Boolean) qx2.e().c(e0.S)).booleanValue();
        setName("ContentFetchTask");
    }

    @com.google.android.gms.common.util.d0
    private final ns2 b(@androidx.annotation.i0 View view, ds2 ds2Var) {
        boolean z;
        if (view == null) {
            return new ns2(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new ns2(this, 0, 0);
            }
            ds2Var.d(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new ns2(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof rw)) {
            WebView webView = (WebView) view;
            if (com.google.android.gms.common.util.v.h()) {
                ds2Var.n();
                webView.post(new ls2(this, ds2Var, webView, globalVisibleRect));
                z = true;
            } else {
                z = false;
            }
            return z ? new ns2(this, 0, 1) : new ns2(this, 0, 0);
        }
        if (!(view instanceof ViewGroup)) {
            return new ns2(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int r1 = 0;
        int r2 = 0;
        for (int r0 = 0; r0 < viewGroup.getChildCount(); r0++) {
            ns2 ns2VarB = b(viewGroup.getChildAt(r0), ds2Var);
            r1 += ns2VarB.f4604a;
            r2 += ns2VarB.f4605b;
        }
        return new ns2(this, r1, r2);
    }

    @com.google.android.gms.common.util.d0
    private static boolean f() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Context contextB = com.google.android.gms.ads.internal.p.f().b();
            if (contextB == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) contextB.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) contextB.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) contextB.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.p.g().e(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void h() {
        synchronized (this.g) {
            this.e = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            tr.f(sb.toString());
        }
    }

    public final void a() {
        synchronized (this.g) {
            this.e = false;
            this.g.notifyAll();
            tr.f("ContentFetchThread: wakeup");
        }
    }

    @com.google.android.gms.common.util.d0
    final void c(ds2 ds2Var, WebView webView, String str, boolean z) {
        ds2Var.m();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (this.r || TextUtils.isEmpty(webView.getTitle())) {
                    ds2Var.c(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    ds2Var.c(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (ds2Var.h()) {
                this.h.b(ds2Var);
            }
        } catch (JSONException unused) {
            tr.f("Json string may be malformed.");
        } catch (Throwable th) {
            tr.b("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.p.g().e(th, "ContentFetchTask.processWebViewContent");
        }
    }

    @com.google.android.gms.common.util.d0
    final void d(View view) {
        try {
            ds2 ds2Var = new ds2(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.s);
            Context contextB = com.google.android.gms.ads.internal.p.f().b();
            if (contextB != null && !TextUtils.isEmpty(this.q)) {
                String str = (String) view.getTag(contextB.getResources().getIdentifier((String) qx2.e().c(e0.O), "id", contextB.getPackageName()));
                if (str != null && str.equals(this.q)) {
                    return;
                }
            }
            ns2 ns2VarB = b(view, ds2Var);
            ds2Var.p();
            if (ns2VarB.f4604a == 0 && ns2VarB.f4605b == 0) {
                return;
            }
            if (ns2VarB.f4605b == 0 && ds2Var.q() == 0) {
                return;
            }
            if (ns2VarB.f4605b == 0 && this.h.a(ds2Var)) {
                return;
            }
            this.h.c(ds2Var);
        } catch (Exception e) {
            tr.c("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.p.g().e(e, "ContentFetchTask.fetchContent");
        }
    }

    public final void e() {
        synchronized (this.g) {
            if (this.d) {
                tr.f("Content hash thread already started, quiting...");
            } else {
                this.d = true;
                start();
            }
        }
    }

    public final ds2 g() {
        return this.h.d(this.t);
    }

    public final boolean i() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0082 A[EXC_TOP_SPLITTER, LOOP:1: B:46:0x0082->B:51:0x0082, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            r4 = this;
        L0:
            boolean r0 = f()     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            if (r0 == 0) goto L5a
            com.google.android.gms.internal.ads.fs2 r0 = com.google.android.gms.ads.internal.p.f()     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            android.app.Activity r0 = r0.a()     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            if (r0 != 0) goto L19
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.tr.f(r0)     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
        L15:
            r4.h()     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            goto L60
        L19:
            if (r0 == 0) goto L60
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L3d
            if (r2 == 0) goto L4c
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L3d
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Exception -> L3d
            if (r2 == 0) goto L4c
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> L3d
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L3d
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch: java.lang.Exception -> L3d
            r1 = r0
            goto L4c
        L3d:
            r0 = move-exception
            com.google.android.gms.internal.ads.ao r2 = com.google.android.gms.ads.internal.p.g()     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.e(r0, r3)     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.tr.f(r0)     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
        L4c:
            if (r1 == 0) goto L60
            if (r1 != 0) goto L51
            goto L60
        L51:
            com.google.android.gms.internal.ads.is2 r0 = new com.google.android.gms.internal.ads.is2     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            r0.<init>(r4, r1)     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            r1.post(r0)     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            goto L60
        L5a:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.tr.f(r0)     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            goto L15
        L60:
            int r0 = r4.i     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L69 java.lang.InterruptedException -> L79
            goto L7f
        L69:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.tr.c(r1, r0)
            com.google.android.gms.internal.ads.ao r1 = com.google.android.gms.ads.internal.p.g()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.e(r0, r2)
            goto L7f
        L79:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.tr.c(r1, r0)
        L7f:
            java.lang.Object r0 = r4.g
            monitor-enter(r0)
        L82:
            boolean r1 = r4.e     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L91
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.tr.f(r1)     // Catch: java.lang.InterruptedException -> L82 java.lang.Throwable -> L94
            java.lang.Object r1 = r4.g     // Catch: java.lang.InterruptedException -> L82 java.lang.Throwable -> L94
            r1.wait()     // Catch: java.lang.InterruptedException -> L82 java.lang.Throwable -> L94
            goto L82
        L91:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L94
            goto L0
        L94:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L94
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.js2.run():void");
    }
}
