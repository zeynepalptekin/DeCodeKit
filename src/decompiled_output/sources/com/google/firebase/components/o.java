package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
class o {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final f<?> f6927a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<b> f6928b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set<b> f6929c = new HashSet();

        b(f<?> fVar) {
            this.f6927a = fVar;
        }

        void a(b bVar) {
            this.f6928b.add(bVar);
        }

        void b(b bVar) {
            this.f6929c.add(bVar);
        }

        f<?> c() {
            return this.f6927a;
        }

        Set<b> d() {
            return this.f6928b;
        }

        boolean e() {
            return this.f6928b.isEmpty();
        }

        boolean f() {
            return this.f6929c.isEmpty();
        }

        void g(b bVar) {
            this.f6929c.remove(bVar);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f6930a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6931b;

        private c(Class<?> cls, boolean z) {
            this.f6930a = cls;
            this.f6931b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f6930a.equals(this.f6930a) && cVar.f6931b == this.f6931b;
        }

        public int hashCode() {
            return ((this.f6930a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f6931b).hashCode();
        }
    }

    o() {
    }

    static void a(List<f<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int r2 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            r2++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (r2 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new q(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<f<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<f<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (p pVar : bVar.c().c()) {
                            if (pVar.b() && (set = (Set) map.get(new c(pVar.a(), pVar.d()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            f<?> next = it.next();
            b bVar3 = new b(next);
            for (Class<? super Object> cls : next.e()) {
                c cVar = new c(cls, !next.l());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f6931b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
