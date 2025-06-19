package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 {
    private static void a(List<String> list, m1<String> m1Var) {
        String strA = m1Var.a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        list.add(strA);
    }

    static List<String> b() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, m1.e("gad:dynamite_module:experiment_id", ""));
        a(arrayList, y1.f6070a);
        a(arrayList, y1.f6071b);
        a(arrayList, y1.f6072c);
        a(arrayList, y1.d);
        a(arrayList, y1.e);
        a(arrayList, y1.k);
        a(arrayList, y1.f);
        a(arrayList, y1.g);
        a(arrayList, y1.h);
        a(arrayList, y1.i);
        a(arrayList, y1.j);
        return arrayList;
    }

    static List<String> c() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, i2.f3751a);
        return arrayList;
    }
}
