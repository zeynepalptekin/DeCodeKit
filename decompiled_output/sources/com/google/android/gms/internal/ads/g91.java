package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class g91 {

    /* renamed from: a, reason: collision with root package name */
    private String f3510a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f3511a;

        public final a b(String str) {
            this.f3511a = str;
            return this;
        }
    }

    private g91(a aVar) {
        this.f3510a = aVar.f3511a;
    }

    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f3510a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String b() {
        return this.f3510a.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.cv2.a.EnumC0172a c() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f3510a
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1999289321: goto L2b;
                case -1372958932: goto L21;
                case 543046670: goto L17;
                case 1951953708: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L35
        Ld:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 0
            goto L36
        L17:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 3
            goto L36
        L21:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 1
            goto L36
        L2b:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 2
            goto L36
        L35:
            r0 = -1
        L36:
            if (r0 == 0) goto L4a
            if (r0 == r4) goto L47
            if (r0 == r3) goto L44
            if (r0 == r2) goto L41
            com.google.android.gms.internal.ads.cv2$a$a r0 = com.google.android.gms.internal.ads.cv2.a.EnumC0172a.AD_INITIATER_UNSPECIFIED
            return r0
        L41:
            com.google.android.gms.internal.ads.cv2$a$a r0 = com.google.android.gms.internal.ads.cv2.a.EnumC0172a.REWARD_BASED_VIDEO_AD
            return r0
        L44:
            com.google.android.gms.internal.ads.cv2$a$a r0 = com.google.android.gms.internal.ads.cv2.a.EnumC0172a.AD_LOADER
            return r0
        L47:
            com.google.android.gms.internal.ads.cv2$a$a r0 = com.google.android.gms.internal.ads.cv2.a.EnumC0172a.INTERSTITIAL
            return r0
        L4a:
            com.google.android.gms.internal.ads.cv2$a$a r0 = com.google.android.gms.internal.ads.cv2.a.EnumC0172a.BANNER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g91.c():com.google.android.gms.internal.ads.cv2$a$a");
    }
}
