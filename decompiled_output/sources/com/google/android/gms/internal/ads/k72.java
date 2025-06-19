package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class k72 {

    /* renamed from: b, reason: collision with root package name */
    private static Cipher f4059b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f4060c = new Object();
    private static final Object d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final SecureRandom f4061a = null;

    public k72(SecureRandom secureRandom) {
    }

    private static Cipher a() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        synchronized (d) {
            if (f4059b == null) {
                f4059b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f4059b;
        }
        return cipher;
    }

    public final byte[] b(byte[] bArr, String str) throws j62 {
        byte[] bArrDoFinal;
        if (bArr.length != 16) {
            throw new j62(this);
        }
        try {
            byte[] bArrB = v21.b(str, false);
            if (bArrB.length <= 16) {
                throw new j62(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrB.length);
            byteBufferAllocate.put(bArrB);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArrB.length - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f4060c) {
                a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = a().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new j62(this, e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new j62(this, e2);
        } catch (InvalidKeyException e3) {
            throw new j62(this, e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new j62(this, e4);
        } catch (BadPaddingException e5) {
            throw new j62(this, e5);
        } catch (IllegalBlockSizeException e6) {
            throw new j62(this, e6);
        } catch (NoSuchPaddingException e7) {
            throw new j62(this, e7);
        }
    }

    public final byte[] c(String str) throws j62 {
        try {
            byte[] bArrB = v21.b(str, false);
            if (bArrB.length != 32) {
                throw new j62(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(bArrB, 4, 16).get(bArr);
            for (int r0 = 0; r0 < 16; r0++) {
                bArr[r0] = (byte) (bArr[r0] ^ 68);
            }
            return bArr;
        } catch (IllegalArgumentException e) {
            throw new j62(this, e);
        }
    }

    public final String d(byte[] bArr, byte[] bArr2) throws j62 {
        byte[] bArrDoFinal;
        byte[] bArr3;
        if (bArr.length != 16) {
            throw new j62(this);
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f4060c) {
                a().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = a().doFinal(bArr2);
                bArr3 = a().getIV();
            }
            int length = bArrDoFinal.length + bArr3.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
            byteBufferAllocate.put(bArr3).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr4 = new byte[length];
            byteBufferAllocate.get(bArr4);
            return v21.a(bArr4, false);
        } catch (InvalidKeyException e) {
            throw new j62(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new j62(this, e2);
        } catch (BadPaddingException e3) {
            throw new j62(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new j62(this, e4);
        } catch (NoSuchPaddingException e5) {
            throw new j62(this, e5);
        }
    }
}
