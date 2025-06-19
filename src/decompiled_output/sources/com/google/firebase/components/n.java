package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class n extends a {
    private static final c.a.d.s.a<Set<Object>> e = m.a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<f<?>, u<?>> f6924a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, u<?>> f6925b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, u<Set<?>>> f6926c = new HashMap();
    private final t d;

    public n(Executor executor, Iterable<j> iterable, f<?>... fVarArr) {
        this.d = new t(executor);
        ArrayList<f<?>> arrayList = new ArrayList();
        arrayList.add(f.q(this.d, t.class, c.a.d.o.d.class, c.a.d.o.c.class));
        Iterator<j> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getComponents());
        }
        for (f<?> fVar : fVarArr) {
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        o.a(arrayList);
        for (f<?> fVar2 : arrayList) {
            this.f6924a.put(fVar2, new u<>(k.a(this, fVar2)));
        }
        h();
        i();
    }

    static /* synthetic */ Set g(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((u) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void h() {
        for (Map.Entry<f<?>, u<?>> entry : this.f6924a.entrySet()) {
            f<?> key = entry.getKey();
            if (key.l()) {
                u<?> value = entry.getValue();
                Iterator<Class<? super Object>> it = key.e().iterator();
                while (it.hasNext()) {
                    this.f6925b.put(it.next(), value);
                }
            }
        }
        j();
    }

    private void i() {
        HashMap map = new HashMap();
        for (Map.Entry<f<?>, u<?>> entry : this.f6924a.entrySet()) {
            f<?> key = entry.getKey();
            if (!key.l()) {
                u<?> value = entry.getValue();
                for (Class<? super Object> cls : key.e()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            this.f6926c.put((Class) entry2.getKey(), new u<>(l.a((Set) entry2.getValue())));
        }
    }

    private void j() {
        for (f<?> fVar : this.f6924a.keySet()) {
            for (p pVar : fVar.c()) {
                if (pVar.c() && !this.f6925b.containsKey(pVar.a())) {
                    throw new v(String.format("Unsatisfied dependency for component %s: %s", fVar, pVar.a()));
                }
            }
        }
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.g
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.g
    public /* bridge */ /* synthetic */ Set b(Class cls) {
        return super.b(cls);
    }

    @Override // com.google.firebase.components.g
    public <T> c.a.d.s.a<T> c(Class<T> cls) {
        w.c(cls, "Null interface requested.");
        return this.f6925b.get(cls);
    }

    @Override // com.google.firebase.components.g
    public <T> c.a.d.s.a<Set<T>> d(Class<T> cls) {
        u<Set<?>> uVar = this.f6926c.get(cls);
        return uVar != null ? uVar : (c.a.d.s.a<Set<T>>) e;
    }

    public void e(boolean z) {
        for (Map.Entry<f<?>, u<?>> entry : this.f6924a.entrySet()) {
            f<?> key = entry.getKey();
            u<?> value = entry.getValue();
            if (key.i() || (key.j() && z)) {
                value.get();
            }
        }
        this.d.e();
    }
}
