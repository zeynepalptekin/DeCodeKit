package c.a.b.b.g.c;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class u9<K, V> implements Comparable<u9>, Map.Entry<K, V> {

    /* JADX INFO: Incorrect field signature: TK; */
    private final Comparable d;
    private V e;
    private final /* synthetic */ p9 f;

    /* JADX WARN: Multi-variable type inference failed */
    u9(p9 p9Var, K k, V v) {
        this.f = p9Var;
        this.d = k;
        this.e = v;
    }

    u9(p9 p9Var, Map.Entry<K, V> entry) {
        this(p9Var, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(u9 u9Var) {
        return ((Comparable) getKey()).compareTo((Comparable) u9Var.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return e(this.d, entry.getKey()) && e(this.e, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.d;
        int r0 = comparable == null ? 0 : comparable.hashCode();
        V v = this.e;
        return r0 ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f.p();
        V v2 = this.e;
        this.e = v;
        return v2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
