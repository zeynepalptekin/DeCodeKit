package com.google.android.gms.internal.ads;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class wv1<K, V> extends rv1<K, V> {
    private static final rv1<Object, Object> k = new wv1(null, new Object[0], 0);
    private final transient Object h;
    private final transient Object[] i;
    private final transient int j;

    private wv1(Object obj, Object[] objArr, int r3) {
        this.h = obj;
        this.i = objArr;
        this.j = r3;
    }

    private static IllegalArgumentException f(Object obj, Object obj2, Object[] objArr, int r6) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[r6]);
        String strValueOf4 = String.valueOf(objArr[r6 ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 39 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <K, V> com.google.android.gms.internal.ads.wv1<K, V> g(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wv1.g(int, java.lang.Object[]):com.google.android.gms.internal.ads.wv1");
    }

    @Override // com.google.android.gms.internal.ads.rv1
    final qv1<Map.Entry<K, V>> b() {
        return new aw1(this, this.i, 0, this.j);
    }

    @Override // com.google.android.gms.internal.ads.rv1
    final qv1<K> c() {
        return new cw1(this, new bw1(this.i, 0, this.j));
    }

    @Override // com.google.android.gms.internal.ads.rv1
    final iv1<V> d() {
        return new bw1(this.i, 1, this.j);
    }

    @Override // com.google.android.gms.internal.ads.rv1, java.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.h;
        Object[] objArr = this.i;
        int r2 = this.j;
        if (obj == null) {
            return null;
        }
        if (r2 == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        }
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int r0 = jv1.a(obj.hashCode());
            while (true) {
                int r02 = r0 & length;
                int r6 = bArr[r02] & 255;
                if (r6 == 255) {
                    return null;
                }
                if (objArr[r6].equals(obj)) {
                    return (V) objArr[r6 ^ 1];
                }
                r0 = r02 + 1;
            }
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int r03 = jv1.a(obj.hashCode());
            while (true) {
                int r04 = r03 & length2;
                int r62 = sArr[r04] & 65535;
                if (r62 == 65535) {
                    return null;
                }
                if (objArr[r62].equals(obj)) {
                    return (V) objArr[r62 ^ 1];
                }
                r03 = r04 + 1;
            }
        } else {
            int[] r05 = (int[]) obj2;
            int length3 = r05.length - 1;
            int r5 = jv1.a(obj.hashCode());
            while (true) {
                int r52 = r5 & length3;
                int r63 = r05[r52];
                if (r63 == -1) {
                    return null;
                }
                if (objArr[r63].equals(obj)) {
                    return (V) objArr[r63 ^ 1];
                }
                r5 = r52 + 1;
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.j;
    }
}
