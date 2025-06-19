package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.wm2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class qk2 {

    /* renamed from: c, reason: collision with root package name */
    private static final en2 f5028c = new uk2();
    private static final Pattern d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f5029a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f5030b = -1;

    private final boolean b(String str, String str2) throws NumberFormatException {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = d.matcher(str2);
        if (matcher.find()) {
            try {
                int r1 = Integer.parseInt(matcher.group(1), 16);
                int r5 = Integer.parseInt(matcher.group(2), 16);
                if (r1 > 0 || r5 > 0) {
                    this.f5029a = r1;
                    this.f5030b = r5;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean a(wm2 wm2Var) {
        for (int r1 = 0; r1 < wm2Var.a(); r1++) {
            wm2.a aVarB = wm2Var.b(r1);
            if (aVarB instanceof cn2) {
                cn2 cn2Var = (cn2) aVarB;
                if (b(cn2Var.f, cn2Var.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c() {
        return (this.f5029a == -1 || this.f5030b == -1) ? false : true;
    }
}
