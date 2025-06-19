package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.cv2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class yz0 {
    private static final SparseArray<cv2.t.b> g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6197a;

    /* renamed from: b, reason: collision with root package name */
    private final fa0 f6198b;

    /* renamed from: c, reason: collision with root package name */
    private final TelephonyManager f6199c;
    private final vz0 d;
    private final oz0 e;
    private mv2 f;

    static {
        SparseArray<cv2.t.b> sparseArray = new SparseArray<>();
        g = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), cv2.t.b.CONNECTED);
        g.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), cv2.t.b.CONNECTING);
        g.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), cv2.t.b.CONNECTING);
        g.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), cv2.t.b.CONNECTING);
        g.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), cv2.t.b.DISCONNECTING);
        g.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), cv2.t.b.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), cv2.t.b.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.FAILED.ordinal(), cv2.t.b.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.IDLE.ordinal(), cv2.t.b.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.SCANNING.ordinal(), cv2.t.b.DISCONNECTED);
        g.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), cv2.t.b.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            g.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), cv2.t.b.CONNECTING);
        }
        g.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), cv2.t.b.CONNECTING);
    }

    yz0(Context context, fa0 fa0Var, vz0 vz0Var, oz0 oz0Var) {
        this.f6197a = context;
        this.f6198b = fa0Var;
        this.d = vz0Var;
        this.e = oz0Var;
        this.f6199c = (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] d(boolean z, ArrayList<cv2.h.a> arrayList, cv2.r rVar, cv2.t.b bVar) {
        return ((cv2.t.a) ((l92) cv2.t.a.k0().z(arrayList).J(g(com.google.android.gms.ads.internal.p.e().k(this.f6197a.getContentResolver()) != 0)).K(com.google.android.gms.ads.internal.p.e().g(this.f6197a, this.f6199c)).C(this.d.b()).D(this.d.d()).x(this.d.a()).w(bVar).v(rVar).L(this.f).F(g(z)).A(com.google.android.gms.ads.internal.p.j().a()).G(g(com.google.android.gms.ads.internal.p.e().c(this.f6197a.getContentResolver()) != 0)).P())).f();
    }

    private static mv2 g(boolean z) {
        return z ? mv2.ENUM_TRUE : mv2.ENUM_FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cv2.r i(Bundle bundle) {
        cv2.r.b bVar;
        cv2.r.a aVarL = cv2.r.L();
        int r1 = bundle.getInt("cnt", -2);
        int r5 = bundle.getInt("gnt", 0);
        if (r1 == -1) {
            this.f = mv2.ENUM_TRUE;
        } else {
            this.f = mv2.ENUM_FALSE;
            aVarL.w(r1 != 0 ? r1 != 1 ? cv2.r.c.NETWORKTYPE_UNSPECIFIED : cv2.r.c.WIFI : cv2.r.c.CELL);
            switch (r5) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    bVar = cv2.r.b.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    bVar = cv2.r.b.THREE_G;
                    break;
                case 13:
                    bVar = cv2.r.b.LTE;
                    break;
                default:
                    bVar = cv2.r.b.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            aVarL.v(bVar);
        }
        return (cv2.r) ((l92) aVarL.P());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static cv2.t.b j(Bundle bundle) {
        return g.get(jn1.a(jn1.a(bundle, "device"), "network").getInt("active_network_state", -1), cv2.t.b.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.cv2.h.a> k(android.os.Bundle r7) {
        /*
            java.lang.String r0 = "ad_types"
            java.lang.Object r7 = r7.get(r0)
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto Ld
            java.util.List r7 = (java.util.List) r7
            goto L17
        Ld:
            boolean r0 = r7 instanceof java.lang.String[]
            if (r0 == 0) goto L3d
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.util.List r7 = java.util.Arrays.asList(r7)
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L24:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L24
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L24
        L38:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            goto L41
        L3d:
            java.util.List r7 = java.util.Collections.emptyList()
        L41:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L4a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1396342996: goto L80;
                case -1052618729: goto L76;
                case -239580146: goto L6c;
                case 604727084: goto L62;
                default: goto L61;
            }
        L61:
            goto L89
        L62:
            java.lang.String r3 = "interstitial"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 1
            goto L89
        L6c:
            java.lang.String r3 = "rewarded"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 3
            goto L89
        L76:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 2
            goto L89
        L80:
            java.lang.String r3 = "banner"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 0
        L89:
            if (r2 == 0) goto L9d
            if (r2 == r6) goto L9a
            if (r2 == r5) goto L97
            if (r2 == r4) goto L94
            com.google.android.gms.internal.ads.cv2$h$a r1 = com.google.android.gms.internal.ads.cv2.h.a.AD_FORMAT_TYPE_UNSPECIFIED
            goto L9f
        L94:
            com.google.android.gms.internal.ads.cv2$h$a r1 = com.google.android.gms.internal.ads.cv2.h.a.REWARD_BASED_VIDEO_AD
            goto L9f
        L97:
            com.google.android.gms.internal.ads.cv2$h$a r1 = com.google.android.gms.internal.ads.cv2.h.a.NATIVE_APP_INSTALL
            goto L9f
        L9a:
            com.google.android.gms.internal.ads.cv2$h$a r1 = com.google.android.gms.internal.ads.cv2.h.a.INTERSTITIAL
            goto L9f
        L9d:
            com.google.android.gms.internal.ads.cv2$h$a r1 = com.google.android.gms.internal.ads.cv2.h.a.BANNER
        L9f:
            r0.add(r1)
            goto L4a
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yz0.k(android.os.Bundle):java.util.ArrayList");
    }

    public final void f(boolean z) {
        qx1.f(this.f6198b.a(), new b01(this, z), cs.f);
    }
}
