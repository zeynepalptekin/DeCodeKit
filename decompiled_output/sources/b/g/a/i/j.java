package b.g.a.i;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public List<h> f941a;

    /* renamed from: b, reason: collision with root package name */
    int f942b;

    /* renamed from: c, reason: collision with root package name */
    int f943c;
    public boolean d;
    public final int[] e;
    List<h> f;
    List<h> g;
    HashSet<h> h;
    HashSet<h> i;
    List<h> j;
    List<h> k;

    j(List<h> list) {
        this.f942b = -1;
        this.f943c = -1;
        this.d = false;
        this.e = new int[]{-1, -1};
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashSet<>();
        this.i = new HashSet<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f941a = list;
    }

    j(List<h> list, boolean z) {
        this.f942b = -1;
        this.f943c = -1;
        this.d = false;
        this.e = new int[]{-1, -1};
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashSet<>();
        this.i = new HashSet<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f941a = list;
        this.d = z;
    }

    private void e(ArrayList<h> arrayList, h hVar) {
        if (hVar.s0) {
            return;
        }
        arrayList.add(hVar);
        hVar.s0 = true;
        if (hVar.y0()) {
            return;
        }
        if (hVar instanceof l) {
            l lVar = (l) hVar;
            int r2 = lVar.d1;
            for (int r3 = 0; r3 < r2; r3++) {
                e(arrayList, lVar.c1[r3]);
            }
        }
        int length = hVar.C.length;
        for (int r1 = 0; r1 < length; r1++) {
            e eVar = hVar.C[r1].d;
            if (eVar != null) {
                h hVar2 = eVar.f927b;
                if (eVar != null && hVar2 != hVar.a0()) {
                    e(arrayList, hVar2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(b.g.a.i.h r7) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.j.f(b.g.a.i.h):void");
    }

    void a(h hVar, int r3) {
        HashSet<h> hashSet;
        if (r3 == 0) {
            hashSet = this.h;
        } else if (r3 != 1) {
            return;
        } else {
            hashSet = this.i;
        }
        hashSet.add(hVar);
    }

    public List<h> b(int r2) {
        if (r2 == 0) {
            return this.f;
        }
        if (r2 == 1) {
            return this.g;
        }
        return null;
    }

    Set<h> c(int r2) {
        if (r2 == 0) {
            return this.h;
        }
        if (r2 == 1) {
            return this.i;
        }
        return null;
    }

    List<h> d() {
        if (!this.j.isEmpty()) {
            return this.j;
        }
        int size = this.f941a.size();
        for (int r1 = 0; r1 < size; r1++) {
            h hVar = this.f941a.get(r1);
            if (!hVar.q0) {
                e((ArrayList) this.j, hVar);
            }
        }
        this.k.clear();
        this.k.addAll(this.f941a);
        this.k.removeAll(this.j);
        return this.j;
    }

    void g() {
        int size = this.k.size();
        for (int r1 = 0; r1 < size; r1++) {
            f(this.k.get(r1));
        }
    }
}
