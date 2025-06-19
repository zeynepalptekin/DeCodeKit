package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class z61 implements Runnable {
    private z61() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            MessageDigest unused = x41.f5930b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused2) {
        } catch (Throwable th) {
            x41.e.countDown();
            throw th;
        }
        x41.e.countDown();
    }
}
