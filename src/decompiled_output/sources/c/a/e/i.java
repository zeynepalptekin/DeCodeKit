package c.a.e;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends l implements Iterable<l> {
    private final List<l> d;

    public i() {
        this.d = new ArrayList();
    }

    public i(int r2) {
        this.d = new ArrayList(r2);
    }

    @Override // c.a.e.l
    public long A() {
        if (this.d.size() == 1) {
            return this.d.get(0).A();
        }
        throw new IllegalStateException();
    }

    @Override // c.a.e.l
    public Number B() {
        if (this.d.size() == 1) {
            return this.d.get(0).B();
        }
        throw new IllegalStateException();
    }

    @Override // c.a.e.l
    public short C() {
        if (this.d.size() == 1) {
            return this.d.get(0).C();
        }
        throw new IllegalStateException();
    }

    @Override // c.a.e.l
    public String D() {
        if (this.d.size() == 1) {
            return this.d.get(0).D();
        }
        throw new IllegalStateException();
    }

    public void I(l lVar) {
        if (lVar == null) {
            lVar = n.f2315a;
        }
        this.d.add(lVar);
    }

    public void K(Boolean bool) {
        this.d.add(bool == null ? n.f2315a : new r(bool));
    }

    public void L(Character ch) {
        this.d.add(ch == null ? n.f2315a : new r(ch));
    }

    public void P(Number number) {
        this.d.add(number == null ? n.f2315a : new r(number));
    }

    public void Q(String str) {
        this.d.add(str == null ? n.f2315a : new r(str));
    }

    public void S(i iVar) {
        this.d.addAll(iVar.d);
    }

    public boolean T(l lVar) {
        return this.d.contains(lVar);
    }

    @Override // c.a.e.l
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public i c() {
        if (this.d.isEmpty()) {
            return new i();
        }
        i iVar = new i(this.d.size());
        Iterator<l> it = this.d.iterator();
        while (it.hasNext()) {
            iVar.I(it.next().c());
        }
        return iVar;
    }

    public l W(int r2) {
        return this.d.get(r2);
    }

    public l X(int r2) {
        return this.d.remove(r2);
    }

    public boolean Y(l lVar) {
        return this.d.remove(lVar);
    }

    public l Z(int r2, l lVar) {
        return this.d.set(r2, lVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).d.equals(this.d));
    }

    @Override // c.a.e.l
    public BigDecimal h() {
        if (this.d.size() == 1) {
            return this.d.get(0).h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    @Override // c.a.e.l
    public BigInteger i() {
        if (this.d.size() == 1) {
            return this.d.get(0).i();
        }
        throw new IllegalStateException();
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.d.iterator();
    }

    @Override // c.a.e.l
    public boolean j() {
        if (this.d.size() == 1) {
            return this.d.get(0).j();
        }
        throw new IllegalStateException();
    }

    @Override // c.a.e.l
    public byte n() {
        if (this.d.size() == 1) {
            return this.d.get(0).n();
        }
        throw new IllegalStateException();
    }

    @Override // c.a.e.l
    public char o() {
        if (this.d.size() == 1) {
            return this.d.get(0).o();
        }
        throw new IllegalStateException();
    }

    @Override // c.a.e.l
    public double r() {
        if (this.d.size() == 1) {
            return this.d.get(0).r();
        }
        throw new IllegalStateException();
    }

    @Override // c.a.e.l
    public float s() {
        if (this.d.size() == 1) {
            return this.d.get(0).s();
        }
        throw new IllegalStateException();
    }

    public int size() {
        return this.d.size();
    }

    @Override // c.a.e.l
    public int t() {
        if (this.d.size() == 1) {
            return this.d.get(0).t();
        }
        throw new IllegalStateException();
    }
}
