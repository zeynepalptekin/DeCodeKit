package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pj implements aj {

    /* renamed from: a, reason: collision with root package name */
    private gb<JSONObject, JSONObject> f4822a;

    /* renamed from: b, reason: collision with root package name */
    private gb<JSONObject, JSONObject> f4823b;

    public pj(Context context) {
        pb pbVarA = com.google.android.gms.ads.internal.p.p().a(context, as.h());
        kb<JSONObject> kbVar = ob.f4669b;
        this.f4822a = pbVarA.a("google.afma.request.getAdDictionary", kbVar, kbVar);
        pb pbVarA2 = com.google.android.gms.ads.internal.p.p().a(context, as.h());
        kb<JSONObject> kbVar2 = ob.f4669b;
        this.f4823b = pbVarA2.a("google.afma.sdkConstants.getSdkConstants", kbVar2, kbVar2);
    }

    @Override // com.google.android.gms.internal.ads.aj
    public final gb<JSONObject, JSONObject> a() {
        return this.f4823b;
    }
}
