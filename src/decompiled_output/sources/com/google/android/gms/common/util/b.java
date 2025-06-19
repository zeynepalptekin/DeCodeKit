package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@d0
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class b {
    private b() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T> T[] a(@RecentlyNonNull T[] tArr, @RecentlyNonNull T t) {
        if (tArr == null && t == null) {
            throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
        }
        T[] tArr2 = tArr == null ? (T[]) ((Object[]) Array.newInstance(t.getClass(), 1)) : (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr2.length - 1] = t;
        return tArr2;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T> T[] b(@RecentlyNonNull T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], length);
        int length2 = tArr[0].length;
        for (int r3 = 1; r3 < tArr.length; r3++) {
            T[] tArr4 = tArr[r3];
            System.arraycopy(tArr4, 0, tArr3, length2, tArr4.length);
            length2 += tArr4.length;
        }
        return tArr3;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static byte[] c(@RecentlyNonNull byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr[0], length);
        int length2 = bArr[0].length;
        for (int r3 = 1; r3 < bArr.length; r3++) {
            byte[] bArr3 = bArr[r3];
            System.arraycopy(bArr3, 0, bArrCopyOf, length2, bArr3.length);
            length2 += bArr3.length;
        }
        return bArrCopyOf;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean d(@RecentlyNonNull int[] r4, @RecentlyNonNull int r5) {
        if (r4 == null) {
            return false;
        }
        for (int r0 : r4) {
            if (r0 == r5) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T> boolean e(@RecentlyNonNull T[] tArr, @RecentlyNonNull T t) {
        int length = tArr != null ? tArr.length : 0;
        int r2 = 0;
        while (true) {
            if (r2 >= length) {
                r2 = -1;
                break;
            }
            if (com.google.android.gms.common.internal.q.b(tArr[r2], t)) {
                break;
            }
            r2++;
        }
        return r2 >= 0;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T> ArrayList<T> f() {
        return new ArrayList<>();
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static <T> T[] g(@RecentlyNonNull T[] tArr, @RecentlyNonNull T... tArr2) {
        int r5;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || tArr2.length == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length));
        if (tArr2.length == 1) {
            r5 = 0;
            for (T t : tArr) {
                if (!com.google.android.gms.common.internal.q.b(tArr2[0], t)) {
                    tArr3[r5] = t;
                    r5++;
                }
            }
        } else {
            int r4 = 0;
            for (T t2 : tArr) {
                if (!e(tArr2, t2)) {
                    tArr3[r4] = t2;
                    r4++;
                }
            }
            r5 = r4;
        }
        if (tArr3 == null) {
            return null;
        }
        return r5 != tArr3.length ? (T[]) Arrays.copyOf(tArr3, r5) : tArr3;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static <T> ArrayList<T> h(@RecentlyNonNull T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static int[] i(@RecentlyNonNull Collection<Integer> collection) {
        int r0 = 0;
        if (collection == null || collection.size() == 0) {
            return new int[0];
        }
        int[] r1 = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            r1[r0] = it.next().intValue();
            r0++;
        }
        return r1;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static Integer[] j(@RecentlyNonNull int[] r4) {
        if (r4 == null) {
            return null;
        }
        int length = r4.length;
        Integer[] numArr = new Integer[length];
        for (int r2 = 0; r2 < length; r2++) {
            numArr[r2] = Integer.valueOf(r4[r2]);
        }
        return numArr;
    }

    @com.google.android.gms.common.annotation.a
    public static void k(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull double[] dArr) {
        int length = dArr.length;
        for (int r1 = 0; r1 < length; r1++) {
            if (r1 != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(dArr[r1]));
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void l(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull float[] fArr) {
        int length = fArr.length;
        for (int r1 = 0; r1 < length; r1++) {
            if (r1 != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(fArr[r1]));
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void m(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull int[] r4) {
        int length = r4.length;
        for (int r1 = 0; r1 < length; r1++) {
            if (r1 != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(r4[r1]));
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void n(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull long[] jArr) {
        int length = jArr.length;
        for (int r1 = 0; r1 < length; r1++) {
            if (r1 != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(jArr[r1]));
        }
    }

    @com.google.android.gms.common.annotation.a
    public static <T> void o(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull T[] tArr) {
        int length = tArr.length;
        for (int r1 = 0; r1 < length; r1++) {
            if (r1 != 0) {
                sb.append(",");
            }
            sb.append(tArr[r1]);
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void p(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull boolean[] zArr) {
        int length = zArr.length;
        for (int r1 = 0; r1 < length; r1++) {
            if (r1 != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(zArr[r1]));
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void q(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull String[] strArr) {
        int length = strArr.length;
        for (int r1 = 0; r1 < length; r1++) {
            if (r1 != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[r1]);
            sb.append("\"");
        }
    }
}
