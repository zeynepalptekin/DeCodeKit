package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class x41 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f5929a = false;

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f5930b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f5931c = new Object();
    private static final Object d = new Object();
    static CountDownLatch e = new CountDownLatch(1);

    private static fm0.a a(fm0.a.d dVar) {
        fm0.a.C0175a c0175aV0 = fm0.a.v0();
        c0175aV0.k0(dVar.h());
        return (fm0.a) ((l92) c0175aV0.P());
    }

    private static Vector<byte[]> c(byte[] bArr, int r7) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int r3 = 0; r3 < length; r3++) {
            int r4 = r3 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, r4, bArr.length - r4 > 255 ? r4 + 255 : bArr.length));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static byte[] d(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer byteBufferPut;
        int r0 = z ? 239 : 255;
        if (bArr.length > r0) {
            bArr = a(fm0.a.d.PSN_ENCODE_SIZE_FAIL).f();
        }
        if (bArr.length < r0) {
            byte[] bArr2 = new byte[r0 - bArr.length];
            new SecureRandom().nextBytes(bArr2);
            byteBufferPut = ByteBuffer.allocate(r0 + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            byteBufferPut = ByteBuffer.allocate(r0 + 1).put((byte) bArr.length).put(bArr);
        }
        byte[] bArrArray = byteBufferPut.array();
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(e(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        for (fc1 fc1Var : new da1().N2) {
            fc1Var.a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new n72(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }

    public static byte[] e(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        synchronized (f5931c) {
            MessageDigest messageDigestG = g();
            if (messageDigestG == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigestG.reset();
            messageDigestG.update(bArr);
            bArrDigest = f5930b.digest();
        }
        return bArrDigest;
    }

    static void f() {
        synchronized (d) {
            if (!f5929a) {
                f5929a = true;
                new Thread(new z61()).start();
            }
        }
    }

    private static MessageDigest g() throws InterruptedException {
        boolean zAwait;
        MessageDigest messageDigest;
        f();
        try {
            zAwait = e.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            zAwait = false;
        }
        if (zAwait && (messageDigest = f5930b) != null) {
            return messageDigest;
        }
        return null;
    }

    static String h(fm0.a aVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArrD;
        xa2 xa2VarP;
        byte[] bArrF = aVar.f();
        if (((Boolean) qx2.e().c(e0.M1)).booleanValue()) {
            Vector<byte[]> vectorC = c(bArrF, 255);
            if (vectorC == null || vectorC.size() == 0) {
                bArrD = d(a(fm0.a.d.PSN_ENCODE_SIZE_FAIL).f(), str, true);
                return v21.a(bArrD, true);
            }
            fm0.f.a aVarL = fm0.f.L();
            Iterator<byte[]> it = vectorC.iterator();
            while (it.hasNext()) {
                aVarL.w(a82.S(d(it.next(), str, false)));
            }
            aVarL.x(a82.S(e(bArrF)));
            xa2VarP = aVarL.P();
        } else {
            if (rf2.f5134a == null) {
                throw new GeneralSecurityException();
            }
            xa2VarP = fm0.f.L().w(a82.S(rf2.f5134a.a(bArrF, str != null ? str.getBytes() : new byte[0]))).v(mt0.TINK_HYBRID).P();
        }
        bArrD = ((fm0.f) ((l92) xa2VarP)).f();
        return v21.a(bArrD, true);
    }
}
