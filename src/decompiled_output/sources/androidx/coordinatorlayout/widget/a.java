package androidx.coordinatorlayout.widget;

import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.f.i;
import b.i.o.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final h.a<ArrayList<T>> f250a = new h.b(10);

    /* renamed from: b, reason: collision with root package name */
    private final i<T, ArrayList<T>> f251b = new i<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f252c = new ArrayList<>();
    private final HashSet<T> d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f251b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int r1 = 0; r1 < size; r1++) {
                e(arrayList2.get(r1), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    @h0
    private ArrayList<T> f() {
        ArrayList<T> arrayListB = this.f250a.b();
        return arrayListB == null ? new ArrayList<>() : arrayListB;
    }

    private void k(@h0 ArrayList<T> arrayList) {
        arrayList.clear();
        this.f250a.a(arrayList);
    }

    public void a(@h0 T t, @h0 T t2) {
        if (!this.f251b.containsKey(t) || !this.f251b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f251b.get(t);
        if (arrayListF == null) {
            arrayListF = f();
            this.f251b.put(t, arrayListF);
        }
        arrayListF.add(t2);
    }

    public void b(@h0 T t) {
        if (this.f251b.containsKey(t)) {
            return;
        }
        this.f251b.put(t, null);
    }

    public void c() {
        int size = this.f251b.size();
        for (int r1 = 0; r1 < size; r1++) {
            ArrayList<T> arrayListM = this.f251b.m(r1);
            if (arrayListM != null) {
                k(arrayListM);
            }
        }
        this.f251b.clear();
    }

    public boolean d(@h0 T t) {
        return this.f251b.containsKey(t);
    }

    @i0
    public List g(@h0 T t) {
        return this.f251b.get(t);
    }

    @i0
    public List<T> h(@h0 T t) {
        int size = this.f251b.size();
        ArrayList arrayList = null;
        for (int r2 = 0; r2 < size; r2++) {
            ArrayList<T> arrayListM = this.f251b.m(r2);
            if (arrayListM != null && arrayListM.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f251b.i(r2));
            }
        }
        return arrayList;
    }

    @h0
    public ArrayList<T> i() {
        this.f252c.clear();
        this.d.clear();
        int size = this.f251b.size();
        for (int r1 = 0; r1 < size; r1++) {
            e(this.f251b.i(r1), this.f252c, this.d);
        }
        return this.f252c;
    }

    public boolean j(@h0 T t) {
        int size = this.f251b.size();
        for (int r2 = 0; r2 < size; r2++) {
            ArrayList<T> arrayListM = this.f251b.m(r2);
            if (arrayListM != null && arrayListM.contains(t)) {
                return true;
            }
        }
        return false;
    }

    int l() {
        return this.f251b.size();
    }
}
