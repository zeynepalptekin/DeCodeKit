package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class xt1 {
    private static final Object d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f6037a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f6038b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6039c;

    public xt1(@androidx.annotation.h0 Context context, @androidx.annotation.h0 ch2 ch2Var) {
        this.f6037a = context;
        this.f6039c = Integer.toString(ch2Var.h());
        this.f6038b = context.getSharedPreferences("pcvmspf", 0);
    }

    private final String c() {
        String strValueOf = String.valueOf(this.f6039c);
        return strValueOf.length() != 0 ? "FBAMTD".concat(strValueOf) : new String("FBAMTD");
    }

    private final String d() {
        String strValueOf = String.valueOf(this.f6039c);
        return strValueOf.length() != 0 ? "LATMTD".concat(strValueOf) : new String("LATMTD");
    }

    private static String e(@androidx.annotation.h0 eh2 eh2Var) {
        return com.google.android.gms.common.util.n.a(((fh2) ((l92) fh2.Z().v(eh2Var.I().Q()).w(eh2Var.I().S()).z(eh2Var.I().X()).A(eh2Var.I().Y()).x(eh2Var.I().U()).P())).h().c());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.fh2 f(int r3) {
        /*
            r2 = this;
            int r0 = com.google.android.gms.internal.ads.vt1.f5732a
            r1 = 0
            if (r3 != r0) goto L10
            android.content.SharedPreferences r3 = r2.f6038b
            java.lang.String r0 = r2.d()
        Lb:
            java.lang.String r3 = r3.getString(r0, r1)
            goto L1c
        L10:
            int r0 = com.google.android.gms.internal.ads.vt1.f5733b
            if (r3 != r0) goto L1b
            android.content.SharedPreferences r3 = r2.f6038b
            java.lang.String r0 = r2.c()
            goto Lb
        L1b:
            r3 = r1
        L1c:
            if (r3 != 0) goto L1f
            return r1
        L1f:
            byte[] r3 = com.google.android.gms.common.util.n.d(r3)     // Catch: com.google.android.gms.internal.ads.w92 -> L30
            com.google.android.gms.internal.ads.a82 r3 = com.google.android.gms.internal.ads.a82.S(r3)     // Catch: com.google.android.gms.internal.ads.w92 -> L30
            com.google.android.gms.internal.ads.y82 r0 = com.google.android.gms.internal.ads.y82.c()     // Catch: com.google.android.gms.internal.ads.w92 -> L30
            com.google.android.gms.internal.ads.fh2 r3 = com.google.android.gms.internal.ads.fh2.L(r3, r0)     // Catch: com.google.android.gms.internal.ads.w92 -> L30
            return r3
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xt1.f(int):com.google.android.gms.internal.ads.fh2");
    }

    private final File g(@androidx.annotation.h0 String str) {
        return new File(new File(this.f6037a.getDir("pccache", 0), this.f6039c), str);
    }

    public final boolean a(@androidx.annotation.h0 eh2 eh2Var) {
        synchronized (d) {
            if (!qt1.d(new File(g(eh2Var.I().Q()), "pcbc"), eh2Var.K().c())) {
                return false;
            }
            String strE = e(eh2Var);
            SharedPreferences.Editor editorEdit = this.f6038b.edit();
            editorEdit.putString(d(), strE);
            return editorEdit.commit();
        }
    }

    public final boolean b(@androidx.annotation.h0 eh2 eh2Var, @androidx.annotation.i0 tt1 tt1Var) {
        synchronized (d) {
            fh2 fh2VarF = f(vt1.f5732a);
            String strQ = eh2Var.I().Q();
            if (fh2VarF != null && fh2VarF.Q().equals(strQ)) {
                return false;
            }
            if (!g(strQ).mkdirs()) {
                return false;
            }
            File fileG = g(strQ);
            File file = new File(fileG, "pcam");
            File file2 = new File(fileG, "pcbc");
            if (!qt1.d(file, eh2Var.J().c())) {
                return false;
            }
            if (!qt1.d(file2, eh2Var.K().c())) {
                return false;
            }
            if (tt1Var != null && !tt1Var.a(file)) {
                qt1.e(fileG);
                return false;
            }
            String strE = e(eh2Var);
            String string = this.f6038b.getString(d(), null);
            SharedPreferences.Editor editorEdit = this.f6038b.edit();
            editorEdit.putString(d(), strE);
            if (string != null) {
                editorEdit.putString(c(), string);
            }
            if (!editorEdit.commit()) {
                return false;
            }
            HashSet hashSet = new HashSet();
            fh2 fh2VarF2 = f(vt1.f5732a);
            if (fh2VarF2 != null) {
                hashSet.add(fh2VarF2.Q());
            }
            fh2 fh2VarF3 = f(vt1.f5733b);
            if (fh2VarF3 != null) {
                hashSet.add(fh2VarF3.Q());
            }
            for (File file3 : new File(this.f6037a.getDir("pccache", 0), this.f6039c).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    qt1.e(file3);
                }
            }
            return true;
        }
    }

    @androidx.annotation.i0
    public final ot1 h(int r7) {
        synchronized (d) {
            fh2 fh2VarF = f(r7);
            if (fh2VarF == null) {
                return null;
            }
            File fileG = g(fh2VarF.Q());
            return new ot1(fh2VarF, new File(fileG, "pcam"), new File(fileG, "pcbc"), new File(fileG, "pcopt"));
        }
    }
}
