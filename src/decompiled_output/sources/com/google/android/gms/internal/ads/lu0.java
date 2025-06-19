package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class lu0 implements ir1 {
    private final fu0 e;
    private final com.google.android.gms.common.util.g f;
    private final Map<zq1, Long> d = new HashMap();
    private final Map<zq1, ku0> g = new HashMap();

    public lu0(fu0 fu0Var, Set<ku0> set, com.google.android.gms.common.util.g gVar) {
        this.e = fu0Var;
        for (ku0 ku0Var : set) {
            this.g.put(ku0Var.f4151c, ku0Var);
        }
        this.f = gVar;
    }

    private final void e(zq1 zq1Var, boolean z) {
        zq1 zq1Var2 = this.g.get(zq1Var).f4150b;
        String str = z ? "s." : "f.";
        if (this.d.containsKey(zq1Var2)) {
            long jC = this.f.c() - this.d.get(zq1Var2).longValue();
            Map<String, String> mapC = this.e.c();
            String strValueOf = String.valueOf(this.g.get(zq1Var).f4149a);
            String strConcat = strValueOf.length() != 0 ? "label.".concat(strValueOf) : new String("label.");
            String strValueOf2 = String.valueOf(Long.toString(jC));
            mapC.put(strConcat, strValueOf2.length() != 0 ? str.concat(strValueOf2) : new String(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void a(zq1 zq1Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void b(zq1 zq1Var, String str) {
        this.d.put(zq1Var, Long.valueOf(this.f.c()));
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void c(zq1 zq1Var, String str) {
        if (this.d.containsKey(zq1Var)) {
            long jC = this.f.c() - this.d.get(zq1Var).longValue();
            Map<String, String> mapC = this.e.c();
            String strValueOf = String.valueOf(str);
            String strConcat = strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task.");
            String strValueOf2 = String.valueOf(Long.toString(jC));
            mapC.put(strConcat, strValueOf2.length() != 0 ? "s.".concat(strValueOf2) : new String("s."));
        }
        if (this.g.containsKey(zq1Var)) {
            e(zq1Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void d(zq1 zq1Var, String str, Throwable th) {
        if (this.d.containsKey(zq1Var)) {
            long jC = this.f.c() - this.d.get(zq1Var).longValue();
            Map<String, String> mapC = this.e.c();
            String strValueOf = String.valueOf(str);
            String strConcat = strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task.");
            String strValueOf2 = String.valueOf(Long.toString(jC));
            mapC.put(strConcat, strValueOf2.length() != 0 ? "f.".concat(strValueOf2) : new String("f."));
        }
        if (this.g.containsKey(zq1Var)) {
            e(zq1Var, false);
        }
    }
}
