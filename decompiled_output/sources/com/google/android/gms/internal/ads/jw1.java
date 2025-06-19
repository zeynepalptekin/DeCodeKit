package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class jw1 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f4020a;

    public jw1(Pattern pattern) {
        this.f4020a = (Pattern) bv1.b(pattern);
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(@NullableDecl File file, String str) {
        return this.f4020a.matcher(str).matches();
    }
}
