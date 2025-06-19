package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.ads.a03;
import com.google.android.gms.internal.ads.ah;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.bk;
import com.google.android.gms.internal.ads.cs;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.h42;
import com.google.android.gms.internal.ads.ht2;
import com.google.android.gms.internal.ads.i52;
import com.google.android.gms.internal.ads.jr;
import com.google.android.gms.internal.ads.jw2;
import com.google.android.gms.internal.ads.ky2;
import com.google.android.gms.internal.ads.oy2;
import com.google.android.gms.internal.ads.oz2;
import com.google.android.gms.internal.ads.py2;
import com.google.android.gms.internal.ads.q1;
import com.google.android.gms.internal.ads.qw2;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.sx2;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.tz2;
import com.google.android.gms.internal.ads.uz2;
import com.google.android.gms.internal.ads.vw2;
import com.google.android.gms.internal.ads.vy2;
import com.google.android.gms.internal.ads.xx2;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class j extends ky2 {
    private final as e;
    private final qw2 f;
    private final Future<i52> g = cs.f3023a.submit(new o(this));
    private final Context h;
    private final q i;

    @i0
    private WebView j;

    @i0
    private xx2 k;

    @i0
    private i52 l;
    private AsyncTask<Void, Void, String> m;

    public j(Context context, qw2 qw2Var, String str, as asVar) {
        this.h = context;
        this.e = asVar;
        this.f = qw2Var;
        this.j = new WebView(this.h);
        this.i = new q(context, str);
        H8(0);
        this.j.setVerticalScrollBarEnabled(false);
        this.j.getSettings().setJavaScriptEnabled(true);
        this.j.setWebViewClient(new m(this));
        this.j.setOnTouchListener(new l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String F8(String str) {
        if (this.l == null) {
            return str;
        }
        Uri uriB = Uri.parse(str);
        try {
            uriB = this.l.b(uriB, this.h, null, null);
        } catch (h42 e) {
            tr.d("Unable to process ad data", e);
        }
        return uriB.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G8(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.h.startActivity(intent);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final Bundle A() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final py2 A3() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void A7(gh ghVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void B2() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void D() throws RemoteException {
        r.f("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void E6(a03 a03Var) {
        throw new IllegalStateException("Unused method");
    }

    @d0
    final int E8(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            qx2.a();
            return jr.r(this.h, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void G3(ah ahVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void H0(bk bkVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @d0
    final void H8(int r3) {
        if (this.j == null) {
            return;
        }
        this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, r3));
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void I2(qw2 qw2Var) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final String K6() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void M6() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @d0
    final String M8() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(q1.d.a());
        builder.appendQueryParameter(c.a.b.b.a.d.f1596b, this.i.a());
        builder.appendQueryParameter("pubId", this.i.d());
        Map<String, String> mapE = this.i.e();
        for (String str : mapE.keySet()) {
            builder.appendQueryParameter(str, mapE.get(str));
        }
        Uri uriBuild = builder.build();
        i52 i52Var = this.l;
        if (i52Var != null) {
            try {
                uriBuild = i52Var.a(uriBuild, this.h);
            } catch (h42 e) {
                tr.d("Unable to process ad data", e);
            }
        }
        String strN8 = N8();
        String encodedQuery = uriBuild.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(strN8).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(strN8);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    @d0
    final String N8() {
        String strC = this.i.c();
        if (TextUtils.isEmpty(strC)) {
            strC = "www.google.com";
        }
        String strA = q1.d.a();
        StringBuilder sb = new StringBuilder(String.valueOf(strC).length() + 8 + String.valueOf(strA).length());
        sb.append("https://");
        sb.append(strC);
        sb.append(strA);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final c.a.b.b.e.c Q4() throws RemoteException {
        r.f("getAdFrame must be called on the main UI thread.");
        return c.a.b.b.e.e.i2(this.j);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    @i0
    public final String R0() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void R2(b1 b1Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void S0(oy2 oy2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void T(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void T4(xx2 xx2Var) throws RemoteException {
        this.k = xx2Var;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void V1(py2 py2Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void W5(com.google.android.gms.internal.ads.m mVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final boolean Y() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void a6(vy2 vy2Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void b4(sx2 sx2Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void destroy() throws RemoteException {
        r.f("destroy must be called on the main UI thread.");
        this.m.cancel(true);
        this.g.cancel(true);
        this.j.destroy();
        this.j = null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    @i0
    public final String e() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final boolean f5(jw2 jw2Var) throws RemoteException {
        r.l(this.j, "This Search Ad has already been torn down");
        this.i.b(jw2Var, this.e);
        this.m = new n(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void g3(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    @i0
    public final uz2 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void l8(vw2 vw2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void m0(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void m3(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    @i0
    public final tz2 o() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void q0(oz2 oz2Var) {
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final qw2 q8() throws RemoteException {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void t() throws RemoteException {
        r.f("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final boolean t0() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void v2(ht2 ht2Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final xx2 z5() {
        throw new IllegalStateException("getIAdListener not implemented");
    }
}
