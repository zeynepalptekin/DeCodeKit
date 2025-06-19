package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* loaded from: classes.dex */
public final class nt1 {

    /* renamed from: a, reason: collision with root package name */
    private final File f4607a;

    /* renamed from: b, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private final File f4608b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f4609c;
    private final ch2 d;

    public nt1(@androidx.annotation.h0 Context context, ch2 ch2Var) {
        this.f4609c = context.getSharedPreferences("pcvmspf", 0);
        this.f4607a = qt1.a(context.getDir("pccache", 0), false);
        this.f4608b = qt1.a(context.getDir("tmppccache", 0), true);
        this.d = ch2Var;
    }

    @com.google.android.gms.common.util.d0
    private static String a(@androidx.annotation.h0 fh2 fh2Var) {
        return com.google.android.gms.common.util.n.a(fh2Var.h().c());
    }

    private final File c() {
        File file = new File(this.f4607a, Integer.toString(this.d.h()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String d() {
        int r0 = this.d.h();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(r0);
        return sb.toString();
    }

    private final String e() {
        int r0 = this.d.h();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(r0);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.google.android.gms.common.util.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.fh2 f(int r6) {
        /*
            r5 = this;
            int r0 = com.google.android.gms.internal.ads.vt1.f5732a
            r1 = 0
            if (r6 != r0) goto L10
            android.content.SharedPreferences r6 = r5.f4609c
            java.lang.String r0 = r5.e()
        Lb:
            java.lang.String r6 = r6.getString(r0, r1)
            goto L1c
        L10:
            int r0 = com.google.android.gms.internal.ads.vt1.f5733b
            if (r6 != r0) goto L1b
            android.content.SharedPreferences r6 = r5.f4609c
            java.lang.String r0 = r5.d()
            goto Lb
        L1b:
            r6 = r1
        L1c:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L23
            return r1
        L23:
            byte[] r6 = com.google.android.gms.common.util.n.d(r6)     // Catch: com.google.android.gms.internal.ads.w92 -> L59
            com.google.android.gms.internal.ads.a82 r6 = com.google.android.gms.internal.ads.a82.S(r6)     // Catch: com.google.android.gms.internal.ads.w92 -> L59
            com.google.android.gms.internal.ads.fh2 r6 = com.google.android.gms.internal.ads.fh2.c0(r6)     // Catch: com.google.android.gms.internal.ads.w92 -> L59
            java.lang.String r0 = r6.Q()     // Catch: com.google.android.gms.internal.ads.w92 -> L59
            java.lang.String r2 = "pcam"
            java.io.File r3 = r5.c()     // Catch: com.google.android.gms.internal.ads.w92 -> L59
            java.io.File r2 = com.google.android.gms.internal.ads.qt1.c(r0, r2, r3)     // Catch: com.google.android.gms.internal.ads.w92 -> L59
            java.lang.String r3 = "pcbc"
            java.io.File r4 = r5.c()     // Catch: com.google.android.gms.internal.ads.w92 -> L59
            java.io.File r0 = com.google.android.gms.internal.ads.qt1.c(r0, r3, r4)     // Catch: com.google.android.gms.internal.ads.w92 -> L59
            boolean r2 = r2.exists()     // Catch: com.google.android.gms.internal.ads.w92 -> L59
            if (r2 == 0) goto L55
            boolean r0 = r0.exists()     // Catch: com.google.android.gms.internal.ads.w92 -> L59
            if (r0 == 0) goto L55
            r0 = 1
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L59
            return r6
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.f(int):com.google.android.gms.internal.ads.fh2");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(@androidx.annotation.h0 com.google.android.gms.internal.ads.eh2 r9, @androidx.annotation.i0 com.google.android.gms.internal.ads.tt1 r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.b(com.google.android.gms.internal.ads.eh2, com.google.android.gms.internal.ads.tt1):boolean");
    }

    public final ot1 g(int r6) {
        fh2 fh2VarF = f(r6);
        if (fh2VarF == null) {
            return null;
        }
        String strQ = fh2VarF.Q();
        return new ot1(fh2VarF, qt1.c(strQ, "pcam", c()), qt1.c(strQ, "pcbc", c()), qt1.c(strQ, "pcopt", c()));
    }
}
