package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ve2<T> implements pe2<Set<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final pe2<Set<Object>> f5670c = oe2.a(Collections.emptySet());

    /* renamed from: a, reason: collision with root package name */
    private final List<ze2<T>> f5671a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ze2<Collection<T>>> f5672b;

    private ve2(List<ze2<T>> list, List<ze2<Collection<T>>> list2) {
        this.f5671a = list;
        this.f5672b = list2;
    }

    public static <T> xe2<T> a(int r2, int r3) {
        return new xe2<>(r2, r3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        int size = this.f5671a.size();
        ArrayList arrayList = new ArrayList(this.f5672b.size());
        int size2 = this.f5672b.size();
        for (int r4 = 0; r4 < size2; r4++) {
            Collection<T> collection = this.f5672b.get(r4).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetB = ke2.b(size);
        int size3 = this.f5671a.size();
        for (int r42 = 0; r42 < size3; r42++) {
            hashSetB.add(we2.a(this.f5671a.get(r42).get()));
        }
        int size4 = arrayList.size();
        for (int r3 = 0; r3 < size4; r3++) {
            Iterator it = ((Collection) arrayList.get(r3)).iterator();
            while (it.hasNext()) {
                hashSetB.add(we2.a(it.next()));
            }
        }
        return Collections.unmodifiableSet(hashSetB);
    }
}
