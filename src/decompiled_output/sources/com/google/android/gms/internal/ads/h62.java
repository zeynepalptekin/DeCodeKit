package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public final class h62 {
    public static BigInteger a(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static KeyPair b(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorA = l62.k.a("EC");
        keyPairGeneratorA.initialize(eCParameterSpec);
        return keyPairGeneratorA.generateKeyPair();
    }

    public static ECPublicKey c(k62 k62Var, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpecD = d(k62Var);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        f(eCPoint, eCParameterSpecD.getCurve());
        return (ECPublicKey) l62.l.a("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecD));
    }

    public static ECParameterSpec d(k62 k62Var) throws NoSuchAlgorithmException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int r0 = g62.f3505b[k62Var.ordinal()];
        if (r0 == 1) {
            str = "115792089210356248762697446949407573530086143415290314195533631308867097853951";
            str2 = "115792089210356248762697446949407573529996955224135760342422259061068512044369";
            str3 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b";
            str4 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296";
            str5 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5";
        } else if (r0 == 2) {
            str = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319";
            str2 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643";
            str3 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef";
            str4 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7";
            str5 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f";
        } else {
            if (r0 != 3) {
                String strValueOf = String.valueOf(k62Var);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
                sb.append("curve not implemented:");
                sb.append(strValueOf);
                throw new NoSuchAlgorithmException(sb.toString());
            }
            str = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";
            str2 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449";
            str3 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00";
            str4 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66";
            str5 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650";
        }
        return e(str, str2, str3, str4, str5);
    }

    private static ECParameterSpec e(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    static void f(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerA = a(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(bigIntegerA) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(bigIntegerA) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(bigIntegerA).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerA))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static byte[] g(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws IllegalStateException, GeneralSecurityException {
        BigInteger bigInteger;
        f(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = l62.l.a("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement keyAgreementA = l62.j.a("ECDH");
        keyAgreementA.init(eCPrivateKey);
        try {
            keyAgreementA.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = keyAgreementA.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger2 = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger2.signum() == -1 || bigInteger2.compareTo(a(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger bigIntegerA = a(curve);
            BigInteger bigIntegerMod = bigInteger2.multiply(bigInteger2).add(curve.getA()).multiply(bigInteger2).add(curve.getB()).mod(bigIntegerA);
            if (bigIntegerA.signum() != 1) {
                throw new InvalidAlgorithmParameterException("p must be positive");
            }
            BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerA);
            BigInteger bigIntegerAdd = null;
            if (bigIntegerMod2.equals(BigInteger.ZERO)) {
                bigInteger = BigInteger.ZERO;
            } else {
                if (bigIntegerA.testBit(0) && bigIntegerA.testBit(1)) {
                    bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerA.add(BigInteger.ONE).shiftRight(2), bigIntegerA);
                } else if (bigIntegerA.testBit(0) && !bigIntegerA.testBit(1)) {
                    bigIntegerAdd = BigInteger.ONE;
                    BigInteger bigIntegerShiftRight = bigIntegerA.subtract(BigInteger.ONE).shiftRight(1);
                    int r6 = 0;
                    while (true) {
                        BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerA);
                        if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                            break;
                        }
                        BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerA);
                        if (bigIntegerModPow.add(BigInteger.ONE).equals(bigIntegerA)) {
                            BigInteger bigIntegerShiftRight2 = bigIntegerA.add(BigInteger.ONE).shiftRight(1);
                            BigInteger bigIntegerMod4 = BigInteger.ONE;
                            BigInteger bigIntegerMod5 = bigIntegerAdd;
                            for (int r8 = bigIntegerShiftRight2.bitLength() - 2; r8 >= 0; r8--) {
                                BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                                bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerA).multiply(bigIntegerMod3)).mod(bigIntegerA);
                                bigIntegerMod4 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerA);
                                if (bigIntegerShiftRight2.testBit(r8)) {
                                    BigInteger bigIntegerMod6 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod4.multiply(bigIntegerMod3)).mod(bigIntegerA);
                                    bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod4).add(bigIntegerMod5).mod(bigIntegerA);
                                    bigIntegerMod5 = bigIntegerMod6;
                                }
                            }
                            bigIntegerAdd = bigIntegerMod5;
                        } else {
                            if (!bigIntegerModPow.equals(BigInteger.ONE)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigIntegerAdd = bigIntegerAdd.add(BigInteger.ONE);
                            r6++;
                            if (r6 == 128 && !bigIntegerA.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                }
                if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerA).compareTo(bigIntegerMod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
                bigInteger = bigIntegerAdd;
            }
            if (true != bigInteger.testBit(0)) {
                bigIntegerA.subtract(bigInteger).mod(bigIntegerA);
            }
            return bArrGenerateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e.toString());
        }
    }
}
