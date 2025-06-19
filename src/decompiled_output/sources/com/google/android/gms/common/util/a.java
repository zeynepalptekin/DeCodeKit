package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f2567a = -1;

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    @TargetApi(24)
    public static Context a(@RecentlyNonNull Context context) {
        return c.a.b.b.g.b.l.b() ? c.a.b.b.g.b.l.a(context) : context;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static byte[] b(@RecentlyNonNull Context context, @RecentlyNonNull String str) throws PackageManager.NameNotFoundException {
        MessageDigest messageDigestC;
        PackageInfo packageInfoE = c.a.b.b.d.s.c.a(context).e(str, 64);
        Signature[] signatureArr = packageInfoE.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestC = c("SHA1")) == null) {
            return null;
        }
        return messageDigestC.digest(packageInfoE.signatures[0].toByteArray());
    }

    @RecentlyNullable
    public static MessageDigest c(@RecentlyNonNull String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int r0 = 0; r0 < 2; r0++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
