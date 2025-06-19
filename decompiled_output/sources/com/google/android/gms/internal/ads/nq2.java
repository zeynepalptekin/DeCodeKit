package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class nq2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4592a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f4593b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f4594c;
    public static final String d;
    public static final String e;
    private static final Pattern f;
    private static final Pattern g;
    private static final Pattern h;
    private static final int[] i;

    static {
        f4592a = (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') ? 26 : Build.VERSION.SDK_INT;
        f4593b = Build.DEVICE;
        f4594c = Build.MANUFACTURER;
        String str = Build.MODEL;
        d = str;
        String str2 = f4593b;
        String str3 = f4594c;
        int r3 = f4592a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(r3);
        e = sb.toString();
        f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        h = Pattern.compile("%([A-Fa-f0-9]{2})");
        i = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(0.1f, Math.min(f2, 8.0f));
    }

    public static int b(long[] jArr, long j, boolean z, boolean z2) {
        int r3;
        int r6 = Arrays.binarySearch(jArr, j);
        if (r6 < 0) {
            r3 = -(r6 + 2);
        } else {
            do {
                r6--;
                if (r6 < 0) {
                    break;
                }
            } while (jArr[r6] == j);
            r3 = r6 + 1;
        }
        return z2 ? Math.max(0, r3) : r3;
    }

    public static long c(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (j * (j2 / j3));
    }

    public static String d(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int r1 = 0; r1 < objArr.length; r1++) {
            sb.append(objArr[r1].getClass().getSimpleName());
            if (r1 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void e(ip2 ip2Var) {
        if (ip2Var != null) {
            try {
                ip2Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void f(long[] jArr, long j, long j2) {
        int r0 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (r0 < jArr.length) {
                jArr[r0] = jArr[r0] / j3;
                r0++;
            }
            return;
        }
        if (j2 >= 1000000 || 1000000 % j2 != 0) {
            double d2 = 1000000.0d / j2;
            while (r0 < jArr.length) {
                jArr[r0] = (long) (jArr[r0] * d2);
                r0++;
            }
            return;
        }
        long j4 = 1000000 / j2;
        while (r0 < jArr.length) {
            jArr[r0] = jArr[r0] * j4;
            r0++;
        }
    }

    public static boolean g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int h(long[] jArr, long j, boolean z, boolean z2) {
        int r5;
        int r0 = Arrays.binarySearch(jArr, j);
        if (r0 < 0) {
            r5 = ~r0;
        } else {
            do {
                r0++;
                if (r0 >= jArr.length) {
                    break;
                }
            } while (jArr[r0] == j);
            r5 = z ? r0 - 1 : r0;
        }
        return z2 ? Math.min(jArr.length - 1, r5) : r5;
    }

    public static ExecutorService i(String str) {
        return Executors.newSingleThreadExecutor(new mq2(str));
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        return new Locale(str).getLanguage();
    }

    public static byte[] k(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static int l(String str) {
        int length = str.length();
        vp2.a(length <= 4);
        int r2 = 0;
        for (int r1 = 0; r1 < length; r1++) {
            r2 = (r2 << 8) | str.charAt(r1);
        }
        return r2;
    }

    public static byte[] m(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int r2 = 0; r2 < length; r2++) {
            int r3 = r2 << 1;
            bArr[r2] = (byte) ((Character.digit(str.charAt(r3), 16) << 4) + Character.digit(str.charAt(r3 + 1), 16));
        }
        return bArr;
    }

    public static int n(int r1) {
        if (r1 == 8) {
            return 3;
        }
        if (r1 == 16) {
            return 2;
        }
        if (r1 != 24) {
            return r1 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static int o(int r2) {
        if (r2 == 0) {
            return 16777216;
        }
        if (r2 == 1) {
            return 3538944;
        }
        if (r2 == 2) {
            return 13107200;
        }
        if (r2 == 3 || r2 == 4) {
            return 131072;
        }
        throw new IllegalStateException();
    }

    public static int p(int r0, int r1, int r2) {
        return Math.max(r1, Math.min(r0, r2));
    }

    public static int q(int r0, int r1) {
        return ((r0 + r1) - 1) / r1;
    }

    public static int r(int r3, int r4) {
        if (r3 == Integer.MIN_VALUE) {
            return r4 * 3;
        }
        if (r3 == 1073741824) {
            return r4 << 2;
        }
        if (r3 == 2) {
            return r4 << 1;
        }
        if (r3 == 3) {
            return r4;
        }
        throw new IllegalArgumentException();
    }
}
