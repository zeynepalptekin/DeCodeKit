package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.cv2;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ot0 implements pe2<Set<ch0<ir1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<String> f4739a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f4740b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f4741c;
    private final ze2<Map<zq1, tt0>> d;

    public ot0(ze2<String> ze2Var, ze2<Context> ze2Var2, ze2<Executor> ze2Var3, ze2<Map<zq1, tt0>> ze2Var4) {
        this.f4739a = ze2Var;
        this.f4740b = ze2Var2;
        this.f4741c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        Set setEmptySet;
        final String str = this.f4739a.get();
        Context context = this.f4740b.get();
        Executor executor = this.f4741c.get();
        Map<zq1, tt0> map = this.d.get();
        if (((Boolean) qx2.e().c(e0.e3)).booleanValue()) {
            tu2 tu2Var = new tu2(new yu2(context));
            tu2Var.a(new su2(str) { // from class: com.google.android.gms.internal.ads.qt0

                /* renamed from: a, reason: collision with root package name */
                private final String f5061a;

                {
                    this.f5061a = str;
                }

                @Override // com.google.android.gms.internal.ads.su2
                public final void a(cv2.n.a aVar) {
                    aVar.D(this.f5061a);
                }
            });
            setEmptySet = Collections.singleton(new ch0(new rt0(tu2Var, map), executor));
        } else {
            setEmptySet = Collections.emptySet();
        }
        return (Set) we2.b(setEmptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
