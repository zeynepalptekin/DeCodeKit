package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ow2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ow2 f4752a = new ow2();

    @com.google.android.gms.common.util.d0
    protected ow2() {
    }

    public static hk a(Context context, c03 c03Var, String str) {
        return new hk(b(context, c03Var), str);
    }

    public static jw2 b(Context context, c03 c03Var) {
        Context context2;
        List listUnmodifiableList;
        aw2 aw2Var;
        String strC;
        Date dateA = c03Var.a();
        long time = dateA != null ? dateA.getTime() : -1L;
        String strB = c03Var.b();
        int r8 = c03Var.e();
        Set<String> setF = c03Var.f();
        if (setF.isEmpty()) {
            context2 = context;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(setF));
            context2 = context;
        }
        boolean zN = c03Var.n(context2);
        Location locationG = c03Var.g();
        Bundle bundleK = c03Var.k(AdMobAdapter.class);
        if (c03Var.v() != null) {
            aw2Var = new aw2(c03Var.v().a(), qx2.i().containsKey(c03Var.v().b()) ? qx2.i().get(c03Var.v().b()) : "");
        } else {
            aw2Var = null;
        }
        boolean zH = c03Var.h();
        String strL = c03Var.l();
        com.google.android.gms.ads.n0.b bVarQ = c03Var.q();
        i iVar = bVarQ != null ? new i(bVarQ) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            qx2.a();
            strC = jr.c(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strC = null;
        }
        boolean zM = c03Var.m();
        com.google.android.gms.ads.x xVarC = k03.v().c();
        return new jw2(8, time, bundleK, r8, listUnmodifiableList, zN, Math.max(c03Var.t(), xVarC.b()), zH, strL, iVar, locationG, strB, c03Var.s(), c03Var.d(), Collections.unmodifiableList(new ArrayList(c03Var.u())), c03Var.p(), strC, zM, aw2Var, Math.max(c03Var.w(), xVarC.c()), (String) Collections.max(Arrays.asList(c03Var.i(), xVarC.a()), nw2.d), c03Var.o());
    }

    static final /* synthetic */ int c(String str, String str2) {
        return com.google.android.gms.ads.x.p.indexOf(str) - com.google.android.gms.ads.x.p.indexOf(str2);
    }
}
