package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class ps2 {

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private static MessageDigest f4885b;

    /* renamed from: a, reason: collision with root package name */
    protected Object f4886a = new Object();

    abstract byte[] a(String str);

    @androidx.annotation.i0
    protected final MessageDigest b() {
        synchronized (this.f4886a) {
            if (f4885b != null) {
                return f4885b;
            }
            for (int r1 = 0; r1 < 2; r1++) {
                try {
                    f4885b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f4885b;
        }
    }
}
