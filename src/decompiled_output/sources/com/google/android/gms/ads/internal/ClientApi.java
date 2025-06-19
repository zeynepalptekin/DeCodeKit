package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.overlay.y;
import com.google.android.gms.ads.internal.overlay.z;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.dy2;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.fh;
import com.google.android.gms.internal.ads.fi1;
import com.google.android.gms.internal.ads.gg;
import com.google.android.gms.internal.ads.gz;
import com.google.android.gms.internal.ads.h71;
import com.google.android.gms.internal.ads.hy2;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.j71;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.o3;
import com.google.android.gms.internal.ads.pg;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.qw2;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.r3;
import com.google.android.gms.internal.ads.tk;
import com.google.android.gms.internal.ads.ty2;
import com.google.android.gms.internal.ads.u71;
import com.google.android.gms.internal.ads.xy2;
import com.google.android.gms.internal.ads.yj;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ClientApi extends ty2 {
    @com.google.android.gms.common.annotation.a
    public ClientApi() {
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final tk D7(c.a.b.b.e.c cVar, String str, qc qcVar, int r4) {
        Context context = (Context) c.a.b.b.e.e.e2(cVar);
        return gz.b(context, qcVar, r4).s().a(context).c(str).b().a();
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final pg F0(c.a.b.b.e.c cVar) {
        Activity activity = (Activity) c.a.b.b.e.e.e2(cVar);
        AdOverlayInfoParcel adOverlayInfoParcelI = AdOverlayInfoParcel.i(activity.getIntent());
        if (adOverlayInfoParcelI == null) {
            return new t(activity);
        }
        int r1 = adOverlayInfoParcelI.n;
        return r1 != 1 ? r1 != 2 ? r1 != 3 ? r1 != 4 ? new t(activity) : new s(activity, adOverlayInfoParcelI) : new y(activity) : new z(activity) : new com.google.android.gms.ads.internal.overlay.q(activity);
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final dy2 N5(c.a.b.b.e.c cVar, String str, qc qcVar, int r4) {
        Context context = (Context) c.a.b.b.e.e.e2(cVar);
        return new h71(gz.b(context, qcVar, r4), context, str);
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final hy2 W1(c.a.b.b.e.c cVar, qw2 qw2Var, String str, qc qcVar, int r5) {
        Context context = (Context) c.a.b.b.e.e.e2(cVar);
        fi1 fi1VarA = gz.b(context, qcVar, r5).o().b(str).c(context).a();
        return r5 >= ((Integer) qx2.e().c(e0.t3)).intValue() ? fi1VarA.b() : fi1VarA.a();
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final hy2 W6(c.a.b.b.e.c cVar, qw2 qw2Var, String str, qc qcVar, int r5) {
        Context context = (Context) c.a.b.b.e.e.e2(cVar);
        return new u71(gz.b(context, qcVar, r5), context, qw2Var, str);
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final gg Y0(c.a.b.b.e.c cVar, qc qcVar, int r3) {
        return gz.b((Context) c.a.b.b.e.e.e2(cVar), qcVar, r3).v();
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final jn Y1(c.a.b.b.e.c cVar, qc qcVar, int r3) {
        return gz.b((Context) c.a.b.b.e.e.e2(cVar), qcVar, r3).u();
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final xy2 c6(c.a.b.b.e.c cVar, int r2) {
        return gz.x((Context) c.a.b.b.e.e.e2(cVar), r2).k();
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final fh h5(c.a.b.b.e.c cVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final xy2 j7(c.a.b.b.e.c cVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final yj p7(c.a.b.b.e.c cVar, qc qcVar, int r3) {
        Context context = (Context) c.a.b.b.e.e.e2(cVar);
        return gz.b(context, qcVar, r3).s().a(context).b().b();
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final hy2 r5(c.a.b.b.e.c cVar, qw2 qw2Var, String str, qc qcVar, int r5) {
        Context context = (Context) c.a.b.b.e.e.e2(cVar);
        return new j71(gz.b(context, qcVar, r5), context, qw2Var, str);
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final o3 s8(c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2) {
        return new im0((FrameLayout) c.a.b.b.e.e.e2(cVar), (FrameLayout) c.a.b.b.e.e.e2(cVar2), 202510000);
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final hy2 t2(c.a.b.b.e.c cVar, qw2 qw2Var, String str, int r8) {
        return new j((Context) c.a.b.b.e.e.e2(cVar), qw2Var, str, new as(202510000, r8, true, false));
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final r3 t3(c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2, c.a.b.b.e.c cVar3) {
        return new em0((View) c.a.b.b.e.e.e2(cVar), (HashMap) c.a.b.b.e.e.e2(cVar2), (HashMap) c.a.b.b.e.e.e2(cVar3));
    }
}
