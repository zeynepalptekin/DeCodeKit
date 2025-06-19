package b.f;

import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f894a;

    /* renamed from: b, reason: collision with root package name */
    private int f895b;

    /* renamed from: c, reason: collision with root package name */
    private int f896c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public g(int r4) {
        if (r4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f896c = r4;
        this.f894a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int n(K k, V v) {
        int r0 = p(k, v);
        if (r0 >= 0) {
            return r0;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    @i0
    protected V a(@h0 K k) {
        return null;
    }

    public final synchronized int b() {
        return this.e;
    }

    protected void c(boolean z, @h0 K k, @h0 V v, @i0 V v2) {
    }

    public final void d() {
        r(-1);
    }

    public final synchronized int e() {
        return this.f;
    }

    @i0
    public final V f(@h0 K k) {
        V v;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v2 = this.f894a.get(k);
            if (v2 != null) {
                this.g++;
                return v2;
            }
            this.h++;
            V vA = a(k);
            if (vA == null) {
                return null;
            }
            synchronized (this) {
                this.e++;
                v = (V) this.f894a.put(k, vA);
                if (v != null) {
                    this.f894a.put(k, v);
                } else {
                    this.f895b += n(k, vA);
                }
            }
            if (v != null) {
                c(false, k, vA, v);
                return v;
            }
            r(this.f896c);
            return vA;
        }
    }

    public final synchronized int g() {
        return this.g;
    }

    public final synchronized int h() {
        return this.f896c;
    }

    public final synchronized int i() {
        return this.h;
    }

    @i0
    public final V j(@h0 K k, @h0 V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.f895b += n(k, v);
            vPut = this.f894a.put(k, v);
            if (vPut != null) {
                this.f895b -= n(k, vPut);
            }
        }
        if (vPut != null) {
            c(false, k, vPut, v);
        }
        r(this.f896c);
        return vPut;
    }

    public final synchronized int k() {
        return this.d;
    }

    @i0
    public final V l(@h0 K k) {
        V vRemove;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            vRemove = this.f894a.remove(k);
            if (vRemove != null) {
                this.f895b -= n(k, vRemove);
            }
        }
        if (vRemove != null) {
            c(false, k, vRemove, null);
        }
        return vRemove;
    }

    public void m(int r2) {
        if (r2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.f896c = r2;
        }
        r(r2);
    }

    public final synchronized int o() {
        return this.f895b;
    }

    protected int p(@h0 K k, @h0 V v) {
        return 1;
    }

    public final synchronized Map<K, V> q() {
        return new LinkedHashMap(this.f894a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f895b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f894a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f895b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f895b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f894a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f894a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f894a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f895b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.n(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f895b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.c(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.g.r(int):void");
    }

    public final synchronized String toString() {
        int r0;
        r0 = this.g + this.h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f896c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(r0 != 0 ? (this.g * 100) / r0 : 0));
    }
}
