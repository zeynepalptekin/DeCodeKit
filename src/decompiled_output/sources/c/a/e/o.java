package c.a.e;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class o extends l {

    /* renamed from: a, reason: collision with root package name */
    private final c.a.e.a0.j<String, l> f2316a = new c.a.e.a0.j<>();

    private l S(Object obj) {
        return obj == null ? n.f2315a : new r(obj);
    }

    public void I(String str, l lVar) {
        if (lVar == null) {
            lVar = n.f2315a;
        }
        this.f2316a.put(str, lVar);
    }

    public void K(String str, Boolean bool) {
        I(str, S(bool));
    }

    public void L(String str, Character ch) {
        I(str, S(ch));
    }

    public void P(String str, Number number) {
        I(str, S(number));
    }

    public void Q(String str, String str2) {
        I(str, S(str2));
    }

    @Override // c.a.e.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public o c() {
        o oVar = new o();
        for (Map.Entry<String, l> entry : this.f2316a.entrySet()) {
            oVar.I(entry.getKey(), entry.getValue().c());
        }
        return oVar;
    }

    public Set<Map.Entry<String, l>> V() {
        return this.f2316a.entrySet();
    }

    public l W(String str) {
        return this.f2316a.get(str);
    }

    public i X(String str) {
        return (i) this.f2316a.get(str);
    }

    public o Y(String str) {
        return (o) this.f2316a.get(str);
    }

    public r Z(String str) {
        return (r) this.f2316a.get(str);
    }

    public boolean a0(String str) {
        return this.f2316a.containsKey(str);
    }

    public Set<String> b0() {
        return this.f2316a.keySet();
    }

    public l c0(String str) {
        return this.f2316a.remove(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).f2316a.equals(this.f2316a));
    }

    public int hashCode() {
        return this.f2316a.hashCode();
    }

    public int size() {
        return this.f2316a.size();
    }
}
