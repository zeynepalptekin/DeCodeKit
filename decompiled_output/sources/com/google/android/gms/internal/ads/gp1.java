package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class gp1 {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<xo1, fp1<? extends e70>> f3565a = new HashMap<>();

    public final <AdT extends e70> fp1<AdT> a(xo1 xo1Var, Context context, no1 no1Var, np1<AdT> np1Var) {
        fp1<AdT> fp1Var = (fp1) this.f3565a.get(xo1Var);
        if (fp1Var != null) {
            return fp1Var;
        }
        uo1 uo1Var = new uo1(yo1.h(xo1Var, context));
        fp1<AdT> fp1Var2 = new fp1<>(uo1Var, new kp1(uo1Var, no1Var, np1Var));
        this.f3565a.put(xo1Var, fp1Var2);
        return fp1Var2;
    }
}
