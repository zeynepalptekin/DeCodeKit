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
import java.util.List;

/* loaded from: classes.dex */
public class c {
    private c() {
    }

    public static void A(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3, @RecentlyNonNull SparseArray<Float> sparseArray, @RecentlyNonNull boolean z) {
        if (sparseArray == null) {
            if (z) {
                f0(parcel, r3, 0);
                return;
            }
            return;
        }
        int r32 = e0(parcel, r3);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseArray.keyAt(r0));
            parcel.writeFloat(sparseArray.valueAt(r0).floatValue());
        }
        h0(parcel, r32);
    }

    public static void B(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull IBinder iBinder, @RecentlyNonNull boolean z) {
        if (iBinder == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeStrongBinder(iBinder);
            h0(parcel, r12);
        }
    }

    public static void C(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull IBinder[] iBinderArr, @RecentlyNonNull boolean z) {
        if (iBinderArr == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeBinderArray(iBinderArr);
            h0(parcel, r12);
        }
    }

    public static void D(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull List<IBinder> list, @RecentlyNonNull boolean z) {
        if (list == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeBinderList(list);
            h0(parcel, r12);
        }
    }

    public static void E(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3, @RecentlyNonNull SparseArray<IBinder> sparseArray, @RecentlyNonNull boolean z) {
        if (sparseArray == null) {
            if (z) {
                f0(parcel, r3, 0);
                return;
            }
            return;
        }
        int r32 = e0(parcel, r3);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseArray.keyAt(r0));
            parcel.writeStrongBinder(sparseArray.valueAt(r0));
        }
        h0(parcel, r32);
    }

    public static void F(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull int r3) {
        f0(parcel, r2, 4);
        parcel.writeInt(r3);
    }

    public static void G(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull int[] r2, @RecentlyNonNull boolean z) {
        if (r2 == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeIntArray(r2);
            h0(parcel, r12);
        }
    }

    public static void H(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3, @RecentlyNonNull List<Integer> list, @RecentlyNonNull boolean z) {
        if (list == null) {
            if (z) {
                f0(parcel, r3, 0);
                return;
            }
            return;
        }
        int r32 = e0(parcel, r3);
        int size = list.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(list.get(r0).intValue());
        }
        h0(parcel, r32);
    }

    public static void I(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull Integer num, @RecentlyNonNull boolean z) {
        if (num != null) {
            f0(parcel, r1, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            f0(parcel, r1, 0);
        }
    }

    public static void J(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull List list, @RecentlyNonNull boolean z) {
        if (list == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeList(list);
            h0(parcel, r12);
        }
    }

    public static void K(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull long j) {
        f0(parcel, r2, 8);
        parcel.writeLong(j);
    }

    public static void L(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull long[] jArr, @RecentlyNonNull boolean z) {
        if (jArr == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeLongArray(jArr);
            h0(parcel, r12);
        }
    }

    public static void M(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r4, @RecentlyNonNull List<Long> list, @RecentlyNonNull boolean z) {
        if (list == null) {
            if (z) {
                f0(parcel, r4, 0);
                return;
            }
            return;
        }
        int r42 = e0(parcel, r4);
        int size = list.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeLong(list.get(r0).longValue());
        }
        h0(parcel, r42);
    }

    public static void N(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull Long l, @RecentlyNonNull boolean z) {
        if (l != null) {
            f0(parcel, r1, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            f0(parcel, r1, 0);
        }
    }

    public static void O(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull Parcel parcel2, @RecentlyNonNull boolean z) {
        if (parcel2 == null) {
            if (z) {
                f0(parcel, r2, 0);
            }
        } else {
            int r22 = e0(parcel, r2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            h0(parcel, r22);
        }
    }

    public static void P(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r5, @RecentlyNonNull Parcel[] parcelArr, @RecentlyNonNull boolean z) {
        if (parcelArr == null) {
            if (z) {
                f0(parcel, r5, 0);
                return;
            }
            return;
        }
        int r52 = e0(parcel, r5);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        h0(parcel, r52);
    }

    public static void Q(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r5, @RecentlyNonNull List<Parcel> list, @RecentlyNonNull boolean z) {
        if (list == null) {
            if (z) {
                f0(parcel, r5, 0);
                return;
            }
            return;
        }
        int r52 = e0(parcel, r5);
        int size = list.size();
        parcel.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            Parcel parcel2 = list.get(r1);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        h0(parcel, r52);
    }

    public static void R(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r5, @RecentlyNonNull SparseArray<Parcel> sparseArray, @RecentlyNonNull boolean z) {
        if (sparseArray == null) {
            if (z) {
                f0(parcel, r5, 0);
                return;
            }
            return;
        }
        int r52 = e0(parcel, r5);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            parcel.writeInt(sparseArray.keyAt(r1));
            Parcel parcelValueAt = sparseArray.valueAt(r1);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        h0(parcel, r52);
    }

    public static void S(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull Parcelable parcelable, @RecentlyNonNull int r3, @RecentlyNonNull boolean z) {
        if (parcelable == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcelable.writeToParcel(parcel, r3);
            h0(parcel, r12);
        }
    }

    public static void T(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull short s) {
        f0(parcel, r2, 4);
        parcel.writeInt(s);
    }

    public static void U(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull SparseBooleanArray sparseBooleanArray, @RecentlyNonNull boolean z) {
        if (sparseBooleanArray == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            h0(parcel, r12);
        }
    }

    public static void V(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3, @RecentlyNonNull SparseIntArray sparseIntArray, @RecentlyNonNull boolean z) {
        if (sparseIntArray == null) {
            if (z) {
                f0(parcel, r3, 0);
                return;
            }
            return;
        }
        int r32 = e0(parcel, r3);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseIntArray.keyAt(r0));
            parcel.writeInt(sparseIntArray.valueAt(r0));
        }
        h0(parcel, r32);
    }

    public static void W(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r4, @RecentlyNonNull SparseLongArray sparseLongArray, @RecentlyNonNull boolean z) {
        if (sparseLongArray == null) {
            if (z) {
                f0(parcel, r4, 0);
                return;
            }
            return;
        }
        int r42 = e0(parcel, r4);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseLongArray.keyAt(r0));
            parcel.writeLong(sparseLongArray.valueAt(r0));
        }
        h0(parcel, r42);
    }

    public static void X(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull String str, @RecentlyNonNull boolean z) {
        if (str == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeString(str);
            h0(parcel, r12);
        }
    }

    public static void Y(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull String[] strArr, @RecentlyNonNull boolean z) {
        if (strArr == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeStringArray(strArr);
            h0(parcel, r12);
        }
    }

    public static void Z(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull List<String> list, @RecentlyNonNull boolean z) {
        if (list == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeStringList(list);
            h0(parcel, r12);
        }
    }

    @RecentlyNonNull
    public static int a(@RecentlyNonNull Parcel parcel) {
        return e0(parcel, 20293);
    }

    public static void a0(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3, @RecentlyNonNull SparseArray<String> sparseArray, @RecentlyNonNull boolean z) {
        if (sparseArray == null) {
            if (z) {
                f0(parcel, r3, 0);
                return;
            }
            return;
        }
        int r32 = e0(parcel, r3);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseArray.keyAt(r0));
            parcel.writeString(sparseArray.valueAt(r0));
        }
        h0(parcel, r32);
    }

    public static void b(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1) {
        h0(parcel, r1);
    }

    public static <T extends Parcelable> void b0(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r4, @RecentlyNonNull T[] tArr, @RecentlyNonNull int r6, @RecentlyNonNull boolean z) {
        if (tArr == null) {
            if (z) {
                f0(parcel, r4, 0);
                return;
            }
            return;
        }
        int r42 = e0(parcel, r4);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                g0(parcel, t, r6);
            }
        }
        h0(parcel, r42);
    }

    public static void c(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull BigDecimal bigDecimal, @RecentlyNonNull boolean z) {
        if (bigDecimal == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            h0(parcel, r12);
        }
    }

    public static <T extends Parcelable> void c0(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r4, @RecentlyNonNull List<T> list, @RecentlyNonNull boolean z) {
        if (list == null) {
            if (z) {
                f0(parcel, r4, 0);
                return;
            }
            return;
        }
        int r42 = e0(parcel, r4);
        int size = list.size();
        parcel.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            T t = list.get(r1);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                g0(parcel, t, 0);
            }
        }
        h0(parcel, r42);
    }

    public static void d(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3, @RecentlyNonNull BigDecimal[] bigDecimalArr, @RecentlyNonNull boolean z) {
        if (bigDecimalArr == null) {
            if (z) {
                f0(parcel, r3, 0);
                return;
            }
            return;
        }
        int r32 = e0(parcel, r3);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int r0 = 0; r0 < length; r0++) {
            parcel.writeByteArray(bigDecimalArr[r0].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[r0].scale());
        }
        h0(parcel, r32);
    }

    public static <T extends Parcelable> void d0(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r4, @RecentlyNonNull SparseArray<T> sparseArray, @RecentlyNonNull boolean z) {
        if (sparseArray == null) {
            if (z) {
                f0(parcel, r4, 0);
                return;
            }
            return;
        }
        int r42 = e0(parcel, r4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            parcel.writeInt(sparseArray.keyAt(r1));
            T tValueAt = sparseArray.valueAt(r1);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                g0(parcel, tValueAt, 0);
            }
        }
        h0(parcel, r42);
    }

    public static void e(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull BigInteger bigInteger, @RecentlyNonNull boolean z) {
        if (bigInteger == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeByteArray(bigInteger.toByteArray());
            h0(parcel, r12);
        }
    }

    private static int e0(Parcel parcel, int r2) {
        parcel.writeInt(r2 | b.i.g.b.a.f1048c);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void f(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3, @RecentlyNonNull BigInteger[] bigIntegerArr, @RecentlyNonNull boolean z) {
        if (bigIntegerArr == null) {
            if (z) {
                f0(parcel, r3, 0);
                return;
            }
            return;
        }
        int r32 = e0(parcel, r3);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        h0(parcel, r32);
    }

    private static void f0(Parcel parcel, int r2, int r3) {
        if (r3 < 65535) {
            parcel.writeInt(r2 | (r3 << 16));
        } else {
            parcel.writeInt(r2 | b.i.g.b.a.f1048c);
            parcel.writeInt(r3);
        }
    }

    public static void g(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull boolean z) {
        f0(parcel, r2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    private static <T extends Parcelable> void g0(Parcel parcel, T t, int r4) {
        int r0 = parcel.dataPosition();
        parcel.writeInt(1);
        int r1 = parcel.dataPosition();
        t.writeToParcel(parcel, r4);
        int r3 = parcel.dataPosition();
        parcel.setDataPosition(r0);
        parcel.writeInt(r3 - r1);
        parcel.setDataPosition(r3);
    }

    public static void h(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull boolean[] zArr, @RecentlyNonNull boolean z) {
        if (zArr == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeBooleanArray(zArr);
            h0(parcel, r12);
        }
    }

    private static void h0(Parcel parcel, int r3) {
        int r0 = parcel.dataPosition();
        parcel.setDataPosition(r3 - 4);
        parcel.writeInt(r0 - r3);
        parcel.setDataPosition(r0);
    }

    public static void i(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3, @RecentlyNonNull List<Boolean> list, @RecentlyNonNull boolean z) {
        if (list == null) {
            if (z) {
                f0(parcel, r3, 0);
                return;
            }
            return;
        }
        int r32 = e0(parcel, r3);
        int size = list.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(list.get(r0).booleanValue() ? 1 : 0);
        }
        h0(parcel, r32);
    }

    public static void j(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull Boolean bool, @RecentlyNonNull boolean z) {
        if (bool != null) {
            f0(parcel, r1, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            f0(parcel, r1, 0);
        }
    }

    public static void k(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull Bundle bundle, @RecentlyNonNull boolean z) {
        if (bundle == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeBundle(bundle);
            h0(parcel, r12);
        }
    }

    public static void l(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull byte b2) {
        f0(parcel, r2, 4);
        parcel.writeInt(b2);
    }

    public static void m(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull byte[] bArr, @RecentlyNonNull boolean z) {
        if (bArr == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeByteArray(bArr);
            h0(parcel, r12);
        }
    }

    public static void n(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3, @RecentlyNonNull byte[][] bArr, @RecentlyNonNull boolean z) {
        if (bArr == null) {
            if (z) {
                f0(parcel, r3, 0);
                return;
            }
            return;
        }
        int r32 = e0(parcel, r3);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        h0(parcel, r32);
    }

    public static void o(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3, @RecentlyNonNull SparseArray<byte[]> sparseArray, @RecentlyNonNull boolean z) {
        if (sparseArray == null) {
            if (z) {
                f0(parcel, r3, 0);
                return;
            }
            return;
        }
        int r32 = e0(parcel, r3);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseArray.keyAt(r0));
            parcel.writeByteArray(sparseArray.valueAt(r0));
        }
        h0(parcel, r32);
    }

    public static void p(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull char c2) {
        f0(parcel, r2, 4);
        parcel.writeInt(c2);
    }

    public static void q(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull char[] cArr, @RecentlyNonNull boolean z) {
        if (cArr == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeCharArray(cArr);
            h0(parcel, r12);
        }
    }

    public static void r(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull double d) {
        f0(parcel, r2, 8);
        parcel.writeDouble(d);
    }

    public static void s(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull double[] dArr, @RecentlyNonNull boolean z) {
        if (dArr == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeDoubleArray(dArr);
            h0(parcel, r12);
        }
    }

    public static void t(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r4, @RecentlyNonNull List<Double> list, @RecentlyNonNull boolean z) {
        if (list == null) {
            if (z) {
                f0(parcel, r4, 0);
                return;
            }
            return;
        }
        int r42 = e0(parcel, r4);
        int size = list.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeDouble(list.get(r0).doubleValue());
        }
        h0(parcel, r42);
    }

    public static void u(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull Double d, @RecentlyNonNull boolean z) {
        if (d != null) {
            f0(parcel, r1, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            f0(parcel, r1, 0);
        }
    }

    public static void v(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r4, @RecentlyNonNull SparseArray<Double> sparseArray, @RecentlyNonNull boolean z) {
        if (sparseArray == null) {
            if (z) {
                f0(parcel, r4, 0);
                return;
            }
            return;
        }
        int r42 = e0(parcel, r4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseArray.keyAt(r0));
            parcel.writeDouble(sparseArray.valueAt(r0).doubleValue());
        }
        h0(parcel, r42);
    }

    public static void w(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r2, @RecentlyNonNull float f) {
        f0(parcel, r2, 4);
        parcel.writeFloat(f);
    }

    public static void x(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull float[] fArr, @RecentlyNonNull boolean z) {
        if (fArr == null) {
            if (z) {
                f0(parcel, r1, 0);
            }
        } else {
            int r12 = e0(parcel, r1);
            parcel.writeFloatArray(fArr);
            h0(parcel, r12);
        }
    }

    public static void y(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r3, @RecentlyNonNull List<Float> list, @RecentlyNonNull boolean z) {
        if (list == null) {
            if (z) {
                f0(parcel, r3, 0);
                return;
            }
            return;
        }
        int r32 = e0(parcel, r3);
        int size = list.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeFloat(list.get(r0).floatValue());
        }
        h0(parcel, r32);
    }

    public static void z(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r1, @RecentlyNonNull Float f, @RecentlyNonNull boolean z) {
        if (f != null) {
            f0(parcel, r1, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            f0(parcel, r1, 0);
        }
    }
}
