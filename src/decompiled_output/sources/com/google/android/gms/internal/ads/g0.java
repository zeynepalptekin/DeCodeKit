package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g0 {
    public static boolean a(String str) {
        return b((String) qx2.e().c(e0.z3), str);
    }

    private static boolean b(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.p.g().e(e, "NonagonUtil.isPatternMatched");
            }
        }
        return false;
    }
}
