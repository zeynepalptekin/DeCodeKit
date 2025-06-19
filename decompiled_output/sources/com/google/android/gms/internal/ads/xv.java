package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class xv implements z6<zt> {
    private static Integer b(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            tr.i(sb.toString());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.z6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(com.google.android.gms.internal.ads.zt r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xv.a(java.lang.Object, java.util.Map):void");
    }
}
