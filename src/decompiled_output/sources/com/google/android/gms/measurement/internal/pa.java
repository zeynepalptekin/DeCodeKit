package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.g1;
import c.a.b.b.g.c.ic;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class pa {

    /* renamed from: a, reason: collision with root package name */
    private String f6489a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6490b;

    /* renamed from: c, reason: collision with root package name */
    private g1.i f6491c;
    private BitSet d;
    private BitSet e;
    private Map<Integer, Long> f;
    private Map<Integer, List<Long>> g;
    private final /* synthetic */ na h;

    private pa(na naVar, String str) {
        this.h = naVar;
        this.f6489a = str;
        this.f6490b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new b.f.a();
        this.g = new b.f.a();
    }

    private pa(na naVar, String str, g1.i iVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.h = naVar;
        this.f6489a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new b.f.a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.g.put(num, arrayList);
            }
        }
        this.f6490b = false;
        this.f6491c = iVar;
    }

    /* synthetic */ pa(na naVar, String str, g1.i iVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, qa qaVar) {
        this(naVar, str, iVar, bitSet, bitSet2, map, map2);
    }

    /* synthetic */ pa(na naVar, String str, qa qaVar) {
        this(naVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [c.a.b.b.g.c.g1$a$a, c.a.b.b.g.c.h7$a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [c.a.b.b.g.c.g1$i$a] */
    @androidx.annotation.h0
    final g1.a a(int r8) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? T = g1.a.T();
        T.x(r8);
        T.C(this.f6490b);
        g1.i iVar = this.f6491c;
        if (iVar != null) {
            T.A(iVar);
        }
        ?? A = g1.i.c0().F(da.H(this.d)).A(da.H(this.e));
        if (this.f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f.size());
            Iterator<Integer> it = this.f.keySet().iterator();
            while (it.hasNext()) {
                int r3 = it.next().intValue();
                arrayList.add((g1.b) ((c.a.b.b.g.c.h7) g1.b.M().x(r3).z(this.f.get(Integer.valueOf(r3)).longValue()).j()));
            }
        }
        A.G(arrayList);
        if (this.g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.g.size());
            for (Integer num : this.g.keySet()) {
                g1.j.a aVarX = g1.j.N().x(num.intValue());
                List<Long> list = this.g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    aVarX.z(list);
                }
                arrayList2.add((g1.j) ((c.a.b.b.g.c.h7) aVarX.j()));
            }
        }
        A.J(arrayList2);
        T.z(A);
        return (g1.a) ((c.a.b.b.g.c.h7) T.j());
    }

    final void c(@androidx.annotation.h0 ua uaVar) {
        int r0 = uaVar.a();
        Boolean bool = uaVar.f6538c;
        if (bool != null) {
            this.e.set(r0, bool.booleanValue());
        }
        Boolean bool2 = uaVar.d;
        if (bool2 != null) {
            this.d.set(r0, bool2.booleanValue());
        }
        if (uaVar.e != null) {
            Long l = this.f.get(Integer.valueOf(r0));
            long jLongValue = uaVar.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.f.put(Integer.valueOf(r0), Long.valueOf(jLongValue));
            }
        }
        if (uaVar.f != null) {
            List<Long> arrayList = this.g.get(Integer.valueOf(r0));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.g.put(Integer.valueOf(r0), arrayList);
            }
            if (uaVar.i()) {
                arrayList.clear();
            }
            if (ic.b() && this.h.j().w(this.f6489a, u.d0) && uaVar.j()) {
                arrayList.clear();
            }
            if (!ic.b() || !this.h.j().w(this.f6489a, u.d0)) {
                arrayList.add(Long.valueOf(uaVar.f.longValue() / 1000));
                return;
            }
            long jLongValue2 = uaVar.f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }
}
