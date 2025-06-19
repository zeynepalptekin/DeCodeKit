package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.ConcurrentHashMap;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    private static final i f2538b = new i("LibraryVersion", "");

    /* renamed from: c, reason: collision with root package name */
    private static p f2539c = new p();

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f2540a = new ConcurrentHashMap<>();

    @com.google.android.gms.common.util.d0
    protected p() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static p a() {
        return f2539c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    @androidx.annotation.RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b(@androidx.annotation.RecentlyNonNull java.lang.String r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.r.h(r10, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r9.f2540a
            boolean r2 = r2.containsKey(r10)
            if (r2 == 0) goto L1a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r9.f2540a
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L1a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "/%s.properties"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            java.lang.Class<com.google.android.gms.common.internal.p> r5 = com.google.android.gms.common.internal.p.class
            java.io.InputStream r4 = r5.getResourceAsStream(r4)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            if (r4 == 0) goto L6a
            r2.load(r4)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r5 = "version"
            java.lang.String r3 = r2.getProperty(r5, r3)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            com.google.android.gms.common.internal.i r2 = com.google.android.gms.common.internal.p.f2538b     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            int r5 = r5 + 12
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            r6.append(r10)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r5 = " version is "
            r6.append(r5)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            r6.append(r3)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            r2.l(r1, r5)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            goto L83
        L6a:
            com.google.android.gms.common.internal.i r2 = com.google.android.gms.common.internal.p.f2538b     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            if (r6 == 0) goto L7b
            java.lang.String r5 = r0.concat(r5)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            goto L80
        L7b:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
        L80:
            r2.n(r1, r5)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
        L83:
            if (r4 == 0) goto Lb5
            com.google.android.gms.common.util.q.b(r4)
            goto Lb5
        L89:
            r10 = move-exception
            r3 = r4
            goto Lc6
        L8c:
            r2 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L95
        L91:
            r10 = move-exception
            goto Lc6
        L93:
            r2 = move-exception
            r4 = r3
        L95:
            com.google.android.gms.common.internal.i r5 = com.google.android.gms.common.internal.p.f2538b     // Catch: java.lang.Throwable -> L91
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L91
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L91
            if (r7 == 0) goto La6
            java.lang.String r0 = r0.concat(r6)     // Catch: java.lang.Throwable -> L91
            goto Lac
        La6:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L91
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L91
            r0 = r6
        Lac:
            r5.f(r1, r0, r2)     // Catch: java.lang.Throwable -> L91
            if (r3 == 0) goto Lb4
            com.google.android.gms.common.util.q.b(r3)
        Lb4:
            r3 = r4
        Lb5:
            if (r3 != 0) goto Lc0
            com.google.android.gms.common.internal.i r0 = com.google.android.gms.common.internal.p.f2538b
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.c(r1, r2)
            java.lang.String r3 = "UNKNOWN"
        Lc0:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r9.f2540a
            r0.put(r10, r3)
            return r3
        Lc6:
            if (r3 == 0) goto Lcb
            com.google.android.gms.common.util.q.b(r3)
        Lcb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.p.b(java.lang.String):java.lang.String");
    }
}
