package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class co1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, eo1> f3004a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f3005b;

    /* renamed from: c, reason: collision with root package name */
    private final ao f3006c;
    private final as d;

    public co1(Context context, as asVar, ao aoVar) {
        this.f3005b = context;
        this.d = asVar;
        this.f3006c = aoVar;
    }

    private final eo1 a() {
        return new eo1(this.f3005b, this.f3006c.r(), this.f3006c.t());
    }

    private final eo1 c(String str) {
        rj rjVarB = rj.b(this.f3005b);
        try {
            rjVarB.a(str);
            po poVar = new po();
            poVar.a(this.f3005b, str, false);
            uo uoVar = new uo(this.f3006c.r(), poVar);
            return new eo1(rjVarB, uoVar, new ho(jr.z(), uoVar));
        } catch (PackageManager.NameNotFoundException unused) {
            return a();
        }
    }

    public final eo1 b(@androidx.annotation.i0 String str) {
        if (str == null) {
            return a();
        }
        if (this.f3004a.containsKey(str)) {
            return this.f3004a.get(str);
        }
        eo1 eo1VarC = c(str);
        this.f3004a.put(str, eo1VarC);
        return eo1VarC;
    }
}
