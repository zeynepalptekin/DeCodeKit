package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.xe0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f22 extends zw1 {
    private f22(Context context, String str, boolean z, int r4) {
        super(context, str, z, r4);
    }

    public static f22 y(String str, Context context, boolean z) {
        return z(str, context, false, w31.f5778a);
    }

    public static f22 z(String str, Context context, boolean z, int r4) {
        zw1.q(context, z);
        zw1.s(str, context, z, r4);
        return new f22(context, str, z, r4);
    }

    @Override // com.google.android.gms.internal.ads.zw1
    protected final List<Callable<Void>> p(jf2 jf2Var, Context context, fm0.a.C0175a c0175a, xe0.a aVar) {
        if (jf2Var.r() == null || !this.x) {
            return super.p(jf2Var, context, c0175a, aVar);
        }
        int r6 = jf2Var.o();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.p(jf2Var, context, c0175a, aVar));
        arrayList.add(new eg2(jf2Var, "mLW4WfBtN0b1ZboDT/Xcg0iQ140V7G6lHXVBVeBNgLy2jqsT86h2d5npN9bwHugA", "7PTXHfesCwrygeE6a5SpFPYapA+6N5AjzCxH/Yeev9s=", c0175a, r6, 24));
        return arrayList;
    }
}
