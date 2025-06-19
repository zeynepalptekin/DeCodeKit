package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class ia2 extends ga2 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f3802c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private ia2() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> f(Object obj, long j, int r6) {
        List<L> listK;
        ea2 ea2Var;
        List<L> listG = g(obj, j);
        if (!listG.isEmpty()) {
            if (f3802c.isAssignableFrom(listG.getClass())) {
                ArrayList arrayList = new ArrayList(listG.size() + r6);
                arrayList.addAll(listG);
                ea2Var = arrayList;
            } else if (listG instanceof sc2) {
                ea2 ea2Var2 = new ea2(listG.size() + r6);
                ea2Var2.addAll((sc2) listG);
                ea2Var = ea2Var2;
            } else {
                if (!(listG instanceof jb2) || !(listG instanceof x92)) {
                    return listG;
                }
                x92 x92Var = (x92) listG;
                if (x92Var.m()) {
                    return listG;
                }
                listK = x92Var.k(listG.size() + r6);
            }
            tc2.f(obj, j, ea2Var);
            return ea2Var;
        }
        listK = listG instanceof ha2 ? new ea2(r6) : ((listG instanceof jb2) && (listG instanceof x92)) ? ((x92) listG).k(r6) : new ArrayList<>(r6);
        tc2.f(obj, j, listK);
        return listK;
    }

    private static <E> List<E> g(Object obj, long j) {
        return (List) tc2.G(obj, j);
    }

    @Override // com.google.android.gms.internal.ads.ga2
    final <L> List<L> a(Object obj, long j) {
        return f(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.ga2
    final <E> void b(Object obj, Object obj2, long j) {
        List listG = g(obj2, j);
        List listF = f(obj, j, listG.size());
        int size = listF.size();
        int size2 = listG.size();
        if (size > 0 && size2 > 0) {
            listF.addAll(listG);
        }
        if (size > 0) {
            listG = listF;
        }
        tc2.f(obj, j, listG);
    }

    @Override // com.google.android.gms.internal.ads.ga2
    final void c(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) tc2.G(obj, j);
        if (list instanceof ha2) {
            objUnmodifiableList = ((ha2) list).p();
        } else {
            if (f3802c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof jb2) && (list instanceof x92)) {
                x92 x92Var = (x92) list;
                if (x92Var.m()) {
                    x92Var.w();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        tc2.f(obj, j, objUnmodifiableList);
    }
}
