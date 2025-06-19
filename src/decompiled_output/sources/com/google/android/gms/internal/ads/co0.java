package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final /* synthetic */ class co0 implements ru1 {

    /* renamed from: a, reason: collision with root package name */
    static final ru1 f3003a = new co0();

    private co0() {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (v2 v2Var : (List) obj) {
            if (v2Var != null) {
                arrayList.add(v2Var);
            }
        }
        return arrayList;
    }
}
