package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final /* synthetic */ class no0 implements ru1 {

    /* renamed from: a, reason: collision with root package name */
    static final ru1 f4578a = new no0();

    private no0() {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (po0 po0Var : (List) obj) {
            if (po0Var != null) {
                arrayList.add(po0Var);
            }
        }
        return arrayList;
    }
}
