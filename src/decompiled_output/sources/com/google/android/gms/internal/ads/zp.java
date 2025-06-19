package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zp extends uj {
    private final Context e;

    private zp(Context context, rg rgVar) {
        super(rgVar);
        this.e = context;
    }

    public static f3 d(Context context) {
        f3 f3Var = new f3(new vk(new File(context.getCacheDir(), "admob_volley"), 20971520), new zp(context, new et()));
        f3Var.a();
        return f3Var;
    }

    @Override // com.google.android.gms.internal.ads.uj, com.google.android.gms.internal.ads.ey2
    public final fz2 a(b<?> bVar) throws pd {
        if (bVar.G() && bVar.g() == 0) {
            if (Pattern.matches((String) qx2.e().c(e0.P2), bVar.i())) {
                qx2.a();
                if (jr.t(this.e, 13400000)) {
                    fz2 fz2VarA = new u7(this.e).a(bVar);
                    if (fz2VarA != null) {
                        String strValueOf = String.valueOf(bVar.i());
                        oo.m(strValueOf.length() != 0 ? "Got gmscore asset response: ".concat(strValueOf) : new String("Got gmscore asset response: "));
                        return fz2VarA;
                    }
                    String strValueOf2 = String.valueOf(bVar.i());
                    oo.m(strValueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(strValueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.a(bVar);
    }
}
