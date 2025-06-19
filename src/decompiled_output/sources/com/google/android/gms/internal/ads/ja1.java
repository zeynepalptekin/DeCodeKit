package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class ja1 implements ff1<cf1<Bundle>> {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f3933a;

    ja1(Set<String> set) {
        this.f3933a = set;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<cf1<Bundle>> a() {
        final ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f3933a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return qx1.g(new cf1(arrayList) { // from class: com.google.android.gms.internal.ads.ia1

            /* renamed from: a, reason: collision with root package name */
            private final ArrayList f3801a;

            {
                this.f3801a = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.cf1
            public final void b(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.f3801a);
            }
        });
    }
}
