package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ot1 {

    /* renamed from: a, reason: collision with root package name */
    private final fh2 f4742a;

    /* renamed from: b, reason: collision with root package name */
    private final File f4743b;

    /* renamed from: c, reason: collision with root package name */
    private final File f4744c;
    private final File d;
    private byte[] e;

    public ot1(@androidx.annotation.h0 fh2 fh2Var, @androidx.annotation.h0 File file, @androidx.annotation.h0 File file2, @androidx.annotation.h0 File file3) {
        this.f4742a = fh2Var;
        this.f4743b = file;
        this.f4744c = file3;
        this.d = file2;
    }

    public final boolean a() {
        return System.currentTimeMillis() / 1000 > this.f4742a.U();
    }

    public final fh2 b() {
        return this.f4742a;
    }

    public final File c() {
        return this.f4743b;
    }

    public final File d() {
        return this.f4744c;
    }

    public final byte[] e() {
        if (this.e == null) {
            this.e = qt1.f(this.d);
        }
        byte[] bArr = this.e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean f(long j) {
        return this.f4742a.U() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
