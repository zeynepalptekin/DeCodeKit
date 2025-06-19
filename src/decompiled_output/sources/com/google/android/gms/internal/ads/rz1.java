package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class rz1<P> {
    private static final Charset d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentMap<String, List<qz1<P>>> f5200a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private qz1<P> f5201b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<P> f5202c;

    private rz1(Class<P> cls) {
        this.f5202c = cls;
    }

    public static <P> rz1<P> b(Class<P> cls) {
        return new rz1<>(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.qz1<P> a(P r9, com.google.android.gms.internal.ads.r42.b r10) throws java.security.GeneralSecurityException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.k42 r0 = r10.H()
            com.google.android.gms.internal.ads.k42 r1 = com.google.android.gms.internal.ads.k42.ENABLED
            if (r0 != r1) goto L94
            com.google.android.gms.internal.ads.qz1 r0 = new com.google.android.gms.internal.ads.qz1
            int[] r1 = com.google.android.gms.internal.ads.dz1.f3189a
            com.google.android.gms.internal.ads.d52 r2 = r10.I()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 5
            r3 = 1
            if (r1 == r3) goto L37
            r4 = 2
            if (r1 == r4) goto L37
            r4 = 3
            if (r1 == r4) goto L2e
            r2 = 4
            if (r1 != r2) goto L26
            byte[] r1 = com.google.android.gms.internal.ads.yy1.f6196a
            goto L4c
        L26:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "unknown output prefix type"
            r9.<init>(r10)
            throw r9
        L2e:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteBuffer r1 = r1.put(r3)
            goto L40
        L37:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            r2 = 0
            java.nio.ByteBuffer r1 = r1.put(r2)
        L40:
            int r2 = r10.L()
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            byte[] r1 = r1.array()
        L4c:
            r4 = r1
            com.google.android.gms.internal.ads.k42 r5 = r10.H()
            com.google.android.gms.internal.ads.d52 r6 = r10.I()
            int r7 = r10.L()
            r2 = r0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r9.add(r0)
            java.lang.String r10 = new java.lang.String
            byte[] r1 = r0.d()
            java.nio.charset.Charset r2 = com.google.android.gms.internal.ads.rz1.d
            r10.<init>(r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<com.google.android.gms.internal.ads.qz1<P>>> r1 = r8.f5200a
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.lang.Object r9 = r1.put(r10, r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L93
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r9)
            r1.add(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<com.google.android.gms.internal.ads.qz1<P>>> r9 = r8.f5200a
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r9.put(r10, r1)
        L93:
            return r0
        L94:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "only ENABLED key is allowed"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rz1.a(java.lang.Object, com.google.android.gms.internal.ads.r42$b):com.google.android.gms.internal.ads.qz1");
    }

    public final void c(qz1<P> qz1Var) {
        if (qz1Var == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        }
        if (qz1Var.b() != k42.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        List<qz1<P>> listEmptyList = this.f5200a.get(new String(qz1Var.d(), d));
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.f5201b = qz1Var;
    }

    public final Class<P> d() {
        return this.f5202c;
    }

    public final qz1<P> e() {
        return this.f5201b;
    }
}
