package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public final class mn1 {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f4432a;

    @com.google.android.gms.common.util.d0
    public mn1() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) qx2.e().c(e0.W4));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f4432a = patternCompile;
    }

    @androidx.annotation.i0
    public final String a(@androidx.annotation.i0 String str) {
        Pattern pattern = this.f4432a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
