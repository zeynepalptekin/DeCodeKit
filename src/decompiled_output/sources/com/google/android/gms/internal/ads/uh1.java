package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class uh1 implements pe2<ef1<JSONObject>> {
    public static ef1<JSONObject> a(rn rnVar, Object obj, ag1 ag1Var, yg1 yg1Var, je2<uf1> je2Var, je2<eg1> je2Var2, je2<ig1> je2Var3, je2<pg1> je2Var4, je2<ug1> je2Var5, je2<dh1> je2Var6, je2<hh1> je2Var7, je2<wh1> je2Var8, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((qg1) obj);
        hashSet.add(ag1Var);
        hashSet.add(yg1Var);
        if (((Boolean) qx2.e().c(e0.S3)).booleanValue()) {
            hashSet.add(je2Var.get());
        }
        if (((Boolean) qx2.e().c(e0.T3)).booleanValue()) {
            hashSet.add(je2Var2.get());
        }
        if (((Boolean) qx2.e().c(e0.U3)).booleanValue()) {
            hashSet.add(je2Var3.get());
        }
        if (((Boolean) qx2.e().c(e0.V3)).booleanValue()) {
            hashSet.add(je2Var4.get());
        }
        if (((Boolean) qx2.e().c(e0.Z3)).booleanValue()) {
            hashSet.add(new pd1(je2Var6.get(), ((Long) qx2.e().c(e0.u2)).longValue(), scheduledExecutorService));
        }
        if (((Boolean) qx2.e().c(e0.b4)).booleanValue()) {
            hashSet.add(je2Var7.get());
        }
        if (((Boolean) qx2.e().c(e0.c4)).booleanValue()) {
            hashSet.add(je2Var8.get());
        }
        return (ef1) we2.b(new ef1(executor, hashSet), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }
}
