package com.google.android.gms.common.internal.z;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.RecentlyNonNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    public static class a extends RuntimeException {
        public a(@RecentlyNonNull String str, @RecentlyNonNull Parcel parcel) {
            int r0 = parcel.dataPosition();
            int r5 = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(r0);
            sb.append(" size=");
            sb.append(r5);
            super(sb.toString());
        }
    }

    private b() {
    }

    @RecentlyNonNull
    public static ArrayList<Parcel> A(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r9) {
        int r92 = f0(parcel, r9);
        int r0 = parcel.dataPosition();
        if (r92 == 0) {
            return null;
        }
        int r2 = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int r4 = 0; r4 < r2; r4++) {
            int r5 = parcel.readInt();
            if (r5 != 0) {
                int r6 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, r6, r5);
                arrayList.add(parcelObtain);
                parcel.setDataPosition(r6 + r5);
            } else {
                arrayList.add(null);
            }
        }
        parcel.setDataPosition(r0 + r92);
        return arrayList;
    }

    @RecentlyNonNull
    public static SparseArray<Parcel> B(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r10) {
        int r102 = f0(parcel, r10);
        int r0 = parcel.dataPosition();
        if (r102 == 0) {
            return null;
        }
        int r2 = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int r4 = 0; r4 < r2; r4++) {
            int r5 = parcel.readInt();
            int r6 = parcel.readInt();
            if (r6 != 0) {
                int r7 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, r7, r6);
                sparseArray.append(r5, parcelObtain);
                parcel.setDataPosition(r7 + r6);
            } else {
                sparseArray.append(r5, null);
            }
        }
        parcel.setDataPosition(r0 + r102);
        return sparseArray;
    }

    @RecentlyNonNull
    public static <T extends Parcelable> T C(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int r22 = f0(parcel, r2);
        int r0 = parcel.dataPosition();
        if (r22 == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(r0 + r22);
        return tCreateFromParcel;
    }

    @RecentlyNonNull
    public static SparseBooleanArray D(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(r0 + r32);
        return sparseBooleanArray;
    }

    @RecentlyNonNull
    public static SparseIntArray E(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r7) {
        int r72 = f0(parcel, r7);
        int r0 = parcel.dataPosition();
        if (r72 == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(r0 + r72);
        return sparseIntArray;
    }

    @RecentlyNonNull
    public static SparseLongArray F(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r8) {
        int r82 = f0(parcel, r8);
        int r0 = parcel.dataPosition();
        if (r82 == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(r0 + r82);
        return sparseLongArray;
    }

    @RecentlyNonNull
    public static String G(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(r0 + r32);
        return string;
    }

    @RecentlyNonNull
    public static String[] H(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(r0 + r32);
        return strArrCreateStringArray;
    }

    @RecentlyNonNull
    public static ArrayList<String> I(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(r0 + r32);
        return arrayListCreateStringArrayList;
    }

    @RecentlyNonNull
    public static SparseArray<String> J(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r7) {
        int r72 = f0(parcel, r7);
        int r0 = parcel.dataPosition();
        if (r72 == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(r0 + r72);
        return sparseArray;
    }

    @RecentlyNonNull
    public static <T> T[] K(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int r22 = f0(parcel, r2);
        int r0 = parcel.dataPosition();
        if (r22 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(r0 + r22);
        return tArr;
    }

    @RecentlyNonNull
    public static <T> ArrayList<T> L(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int r22 = f0(parcel, r2);
        int r0 = parcel.dataPosition();
        if (r22 == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(r0 + r22);
        return arrayListCreateTypedArrayList;
    }

    @RecentlyNonNull
    public static <T> SparseArray<T> M(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r8, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int r82 = f0(parcel, r8);
        int r0 = parcel.dataPosition();
        if (r82 == 0) {
            return null;
        }
        int r2 = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int r4 = 0; r4 < r2; r4++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(r0 + r82);
        return sparseArray;
    }

    public static void N(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r4) {
        if (parcel.dataPosition() == r4) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(r4);
        throw new a(sb.toString(), parcel);
    }

    @RecentlyNonNull
    public static int O(@RecentlyNonNull int r1) {
        return r1 & b.i.g.b.a.f1046a;
    }

    @RecentlyNonNull
    public static boolean P(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2) {
        i0(parcel, r2, 4);
        return parcel.readInt() != 0;
    }

    @RecentlyNonNull
    public static Boolean Q(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r0 = f0(parcel, r3);
        if (r0 == 0) {
            return null;
        }
        j0(parcel, r3, r0, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    @RecentlyNonNull
    public static byte R(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2) {
        i0(parcel, r2, 4);
        return (byte) parcel.readInt();
    }

    @RecentlyNonNull
    public static char S(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2) {
        i0(parcel, r2, 4);
        return (char) parcel.readInt();
    }

    @RecentlyNonNull
    public static double T(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2) {
        i0(parcel, r2, 8);
        return parcel.readDouble();
    }

    @RecentlyNonNull
    public static Double U(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r0 = f0(parcel, r3);
        if (r0 == 0) {
            return null;
        }
        j0(parcel, r3, r0, 8);
        return Double.valueOf(parcel.readDouble());
    }

    @RecentlyNonNull
    public static float V(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2) {
        i0(parcel, r2, 4);
        return parcel.readFloat();
    }

    @RecentlyNonNull
    public static Float W(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r0 = f0(parcel, r3);
        if (r0 == 0) {
            return null;
        }
        j0(parcel, r3, r0, 4);
        return Float.valueOf(parcel.readFloat());
    }

    @RecentlyNonNull
    public static int X(@RecentlyNonNull Parcel parcel) {
        return parcel.readInt();
    }

    @RecentlyNonNull
    public static IBinder Y(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(r0 + r32);
        return strongBinder;
    }

    @RecentlyNonNull
    public static int Z(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2) {
        i0(parcel, r2, 4);
        return parcel.readInt();
    }

    @RecentlyNonNull
    public static BigDecimal a(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r4) {
        int r42 = f0(parcel, r4);
        int r0 = parcel.dataPosition();
        if (r42 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int r2 = parcel.readInt();
        parcel.setDataPosition(r0 + r42);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), r2);
    }

    @RecentlyNonNull
    public static Integer a0(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r0 = f0(parcel, r3);
        if (r0 == 0) {
            return null;
        }
        j0(parcel, r3, r0, 4);
        return Integer.valueOf(parcel.readInt());
    }

    @RecentlyNonNull
    public static BigDecimal[] b(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r9) {
        int r92 = f0(parcel, r9);
        int r0 = parcel.dataPosition();
        if (r92 == 0) {
            return null;
        }
        int r1 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[r1];
        for (int r3 = 0; r3 < r1; r3++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[r3] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(r0 + r92);
        return bigDecimalArr;
    }

    public static void b0(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull List list, @RecentlyNonNull ClassLoader classLoader) {
        int r22 = f0(parcel, r2);
        int r0 = parcel.dataPosition();
        if (r22 == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(r0 + r22);
    }

    @RecentlyNonNull
    public static BigInteger c(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(r0 + r32);
        return new BigInteger(bArrCreateByteArray);
    }

    @RecentlyNonNull
    public static long c0(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2) {
        i0(parcel, r2, 8);
        return parcel.readLong();
    }

    @RecentlyNonNull
    public static BigInteger[] d(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r7) {
        int r72 = f0(parcel, r7);
        int r0 = parcel.dataPosition();
        if (r72 == 0) {
            return null;
        }
        int r1 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[r1];
        for (int r3 = 0; r3 < r1; r3++) {
            bigIntegerArr[r3] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(r0 + r72);
        return bigIntegerArr;
    }

    @RecentlyNonNull
    public static Long d0(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r0 = f0(parcel, r3);
        if (r0 == 0) {
            return null;
        }
        j0(parcel, r3, r0, 8);
        return Long.valueOf(parcel.readLong());
    }

    @RecentlyNonNull
    public static boolean[] e(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(r0 + r32);
        return zArrCreateBooleanArray;
    }

    @RecentlyNonNull
    public static short e0(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2) {
        i0(parcel, r2, 4);
        return (short) parcel.readInt();
    }

    @RecentlyNonNull
    public static ArrayList<Boolean> f(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r7) {
        int r72 = f0(parcel, r7);
        int r0 = parcel.dataPosition();
        if (r72 == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
        for (int r4 = 0; r4 < r2; r4++) {
            arrayList.add(Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(r0 + r72);
        return arrayList;
    }

    @RecentlyNonNull
    public static int f0(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        return (r3 & b.i.g.b.a.f1048c) != -65536 ? (r3 >> 16) & b.i.g.b.a.f1046a : parcel.readInt();
    }

    @RecentlyNonNull
    public static Bundle g(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(r0 + r32);
        return bundle;
    }

    public static void g0(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2) {
        parcel.setDataPosition(parcel.dataPosition() + f0(parcel, r2));
    }

    @RecentlyNonNull
    public static byte[] h(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(r0 + r32);
        return bArrCreateByteArray;
    }

    @RecentlyNonNull
    public static int h0(@RecentlyNonNull Parcel parcel) {
        int r0 = X(parcel);
        int r1 = f0(parcel, r0);
        int r2 = parcel.dataPosition();
        if (O(r0) != 20293) {
            String strValueOf = String.valueOf(Integer.toHexString(r0));
            throw new a(strValueOf.length() != 0 ? "Expected object header. Got 0x".concat(strValueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int r12 = r1 + r2;
        if (r12 >= r2 && r12 <= parcel.dataSize()) {
            return r12;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(r2);
        sb.append(" end=");
        sb.append(r12);
        throw new a(sb.toString(), parcel);
    }

    @RecentlyNonNull
    public static byte[][] i(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r6) {
        int r62 = f0(parcel, r6);
        int r0 = parcel.dataPosition();
        if (r62 == 0) {
            return null;
        }
        int r1 = parcel.readInt();
        byte[][] bArr = new byte[r1][];
        for (int r3 = 0; r3 < r1; r3++) {
            bArr[r3] = parcel.createByteArray();
        }
        parcel.setDataPosition(r0 + r62);
        return bArr;
    }

    private static void i0(Parcel parcel, int r5, int r6) {
        int r52 = f0(parcel, r5);
        if (r52 == r6) {
            return;
        }
        String hexString = Integer.toHexString(r52);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(r6);
        sb.append(" got ");
        sb.append(r52);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    @RecentlyNonNull
    public static SparseArray<byte[]> j(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r7) {
        int r72 = f0(parcel, r7);
        int r0 = parcel.dataPosition();
        if (r72 == 0) {
            return null;
        }
        int r1 = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(r1);
        for (int r3 = 0; r3 < r1; r3++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(r0 + r72);
        return sparseArray;
    }

    private static void j0(Parcel parcel, int r4, int r5, int r6) {
        if (r5 == r6) {
            return;
        }
        String hexString = Integer.toHexString(r5);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(r6);
        sb.append(" got ");
        sb.append(r5);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    @RecentlyNonNull
    public static char[] k(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        char[] cArrCreateCharArray = parcel.createCharArray();
        parcel.setDataPosition(r0 + r32);
        return cArrCreateCharArray;
    }

    @RecentlyNonNull
    public static double[] l(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(r0 + r32);
        return dArrCreateDoubleArray;
    }

    @RecentlyNonNull
    public static ArrayList<Double> m(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r7) {
        int r72 = f0(parcel, r7);
        int r0 = parcel.dataPosition();
        if (r72 == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(r0 + r72);
        return arrayList;
    }

    @RecentlyNonNull
    public static SparseArray<Double> n(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r8) {
        int r82 = f0(parcel, r8);
        int r0 = parcel.dataPosition();
        if (r82 == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(r0 + r82);
        return sparseArray;
    }

    @RecentlyNonNull
    public static float[] o(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(r0 + r32);
        return fArrCreateFloatArray;
    }

    @RecentlyNonNull
    public static ArrayList<Float> p(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r6) {
        int r62 = f0(parcel, r6);
        int r0 = parcel.dataPosition();
        if (r62 == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(r0 + r62);
        return arrayList;
    }

    @RecentlyNonNull
    public static SparseArray<Float> q(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r7) {
        int r72 = f0(parcel, r7);
        int r0 = parcel.dataPosition();
        if (r72 == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(r0 + r72);
        return sparseArray;
    }

    @RecentlyNonNull
    public static IBinder[] r(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        IBinder[] iBinderArrCreateBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(r0 + r32);
        return iBinderArrCreateBinderArray;
    }

    @RecentlyNonNull
    public static ArrayList<IBinder> s(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        ArrayList<IBinder> arrayListCreateBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(r0 + r32);
        return arrayListCreateBinderArrayList;
    }

    @RecentlyNonNull
    public static SparseArray<IBinder> t(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r7) {
        int r72 = f0(parcel, r7);
        int r0 = parcel.dataPosition();
        if (r72 == 0) {
            return null;
        }
        int r1 = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(r1);
        for (int r3 = 0; r3 < r1; r3++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(r0 + r72);
        return sparseArray;
    }

    @RecentlyNonNull
    public static int[] u(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        int[] r1 = parcel.createIntArray();
        parcel.setDataPosition(r0 + r32);
        return r1;
    }

    @RecentlyNonNull
    public static ArrayList<Integer> v(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r6) {
        int r62 = f0(parcel, r6);
        int r0 = parcel.dataPosition();
        if (r62 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(r0 + r62);
        return arrayList;
    }

    @RecentlyNonNull
    public static long[] w(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(r0 + r32);
        return jArrCreateLongArray;
    }

    @RecentlyNonNull
    public static ArrayList<Long> x(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r7) {
        int r72 = f0(parcel, r7);
        int r0 = parcel.dataPosition();
        if (r72 == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(r0 + r72);
        return arrayList;
    }

    @RecentlyNonNull
    public static Parcel y(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3) {
        int r32 = f0(parcel, r3);
        int r0 = parcel.dataPosition();
        if (r32 == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, r0, r32);
        parcel.setDataPosition(r0 + r32);
        return parcelObtain;
    }

    @RecentlyNonNull
    public static Parcel[] z(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r9) {
        int r92 = f0(parcel, r9);
        int r0 = parcel.dataPosition();
        if (r92 == 0) {
            return null;
        }
        int r2 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[r2];
        for (int r4 = 0; r4 < r2; r4++) {
            int r5 = parcel.readInt();
            if (r5 != 0) {
                int r6 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, r6, r5);
                parcelArr[r4] = parcelObtain;
                parcel.setDataPosition(r6 + r5);
            } else {
                parcelArr[r4] = null;
            }
        }
        parcel.setDataPosition(r0 + r92);
        return parcelArr;
    }
}
