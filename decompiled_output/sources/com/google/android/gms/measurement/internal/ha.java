package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import c.a.b.b.g.c.hd;
import c.a.b.b.g.c.jb;
import c.a.b.b.g.c.pf;
import com.google.android.gms.measurement.c.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class ha extends y5 {
    private static final String[] g = {"firebase_", "google_", "ga_"};
    private static final String[] h = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f6407c;
    private final AtomicLong d;
    private int e;
    private Integer f;

    ha(b5 b5Var) {
        super(b5Var);
        this.f = null;
        this.d = new AtomicLong(0L);
    }

    static boolean B0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    static boolean C0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static Bundle D(List<ca> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (ca caVar : list) {
            String str = caVar.i;
            if (str != null) {
                bundle.putString(caVar.e, str);
            } else {
                Long l = caVar.g;
                if (l != null) {
                    bundle.putLong(caVar.e, l.longValue());
                } else {
                    Double d = caVar.k;
                    if (d != null) {
                        bundle.putDouble(caVar.e, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static boolean F0(String str) {
        for (String str2 : h) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final Object G(int r3, Object obj, boolean z, boolean z2) {
        Bundle bundleA;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return I(String.valueOf(obj), r3, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (bundleA = A((Bundle) parcelable)) != null && !bundleA.isEmpty()) {
                arrayList.add(bundleA);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final int G0(String str) {
        if (!h0("event param", str)) {
            return 3;
        }
        if (m0("event param", null, str)) {
            return !g0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    public static String I(String str, int r4, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= r4) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, r4))).concat("...");
        }
        return null;
    }

    private final int I0(String str) {
        if (!w0("event param", str)) {
            return 3;
        }
        if (m0("event param", null, str)) {
            return !g0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    static MessageDigest J0() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int r0 = 0; r0 < 2; r0++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    private static void K(Bundle bundle, int r1, String str, String str2, Object obj) {
        if (v0(bundle, r1)) {
            bundle.putString("_ev", I(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.r.k(bundle);
                if (obj != null) {
                    if ((obj instanceof String) || (obj instanceof CharSequence)) {
                        bundle.putLong("_el", String.valueOf(obj).length());
                    }
                }
            }
        }
    }

    @com.google.android.gms.common.util.d0
    private static boolean L0(String str) {
        com.google.android.gms.common.internal.r.k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int M0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (j().p(u.i0) && "_lgclid".equals(str)) ? 100 : 36;
    }

    private final void Y(String str, String str2, String str3, Bundle bundle, @androidx.annotation.i0 List<String> list, boolean z) throws IllegalStateException {
        int r0;
        String str4;
        int r02;
        if (bundle == null) {
            return;
        }
        int r15 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                r0 = z ? G0(str5) : 0;
                if (r0 == 0) {
                    r0 = I0(str5);
                }
            } else {
                r0 = 0;
            }
            if (r0 != 0) {
                K(bundle, r0, str5, str5, r0 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (d0(bundle.get(str5))) {
                    B().K().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    r02 = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    r02 = r(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (r02 != 0 && !"_ev".equals(str4)) {
                    K(bundle, r02, str4, str4, bundle.get(str4));
                } else if (e0(str4) && !l0(str4, c6.d) && (r15 = r15 + 1) > 0) {
                    B().H().c("Item cannot contain custom parameters", f().s(str2), f().q(bundle));
                    v0(bundle, 23);
                }
                bundle.remove(str4);
            }
        }
    }

    static boolean Z(Context context, boolean z) {
        com.google.android.gms.common.internal.r.k(context);
        return u0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean a0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean b0(Bundle bundle, int r5) {
        int r1 = 0;
        if (bundle.size() <= r5) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            r1++;
            if (r1 > r5) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean c0(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    static boolean d0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean e0(String str) {
        com.google.android.gms.common.internal.r.g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    static boolean k0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean l0(String str, String[] strArr) {
        com.google.android.gms.common.internal.r.k(strArr);
        for (String str2 : strArr) {
            if (B0(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean o0(@androidx.annotation.i0 List<String> list, @androidx.annotation.i0 List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    static byte[] p0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int r(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.Object r20, android.os.Bundle r21, @androidx.annotation.i0 java.util.List<java.lang.String> r22, boolean r23, boolean r24) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ha.r(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public static Bundle s0(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int r3 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (r3 < parcelableArr.length) {
                        if (parcelableArr[r3] instanceof Bundle) {
                            parcelableArr[r3] = new Bundle((Bundle) parcelableArr[r3]);
                        }
                        r3++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (r3 < list.size()) {
                        Object obj2 = list.get(r3);
                        if (obj2 instanceof Bundle) {
                            list.set(r3, new Bundle((Bundle) obj2));
                        }
                        r3++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static long t(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    public static ArrayList<Bundle> t0(List<va> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (va vaVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", vaVar.d);
            bundle.putString("origin", vaVar.e);
            bundle.putLong(a.C0190a.m, vaVar.g);
            bundle.putString(a.C0190a.f6334b, vaVar.f.e);
            a6.b(bundle, vaVar.f.h());
            bundle.putBoolean(a.C0190a.n, vaVar.h);
            String str = vaVar.i;
            if (str != null) {
                bundle.putString(a.C0190a.d, str);
            }
            s sVar = vaVar.j;
            if (sVar != null) {
                bundle.putString(a.C0190a.f, sVar.d);
                n nVar = vaVar.j.e;
                if (nVar != null) {
                    bundle.putBundle(a.C0190a.g, nVar.l());
                }
            }
            bundle.putLong(a.C0190a.e, vaVar.k);
            s sVar2 = vaVar.l;
            if (sVar2 != null) {
                bundle.putString(a.C0190a.h, sVar2.d);
                n nVar2 = vaVar.l.e;
                if (nVar2 != null) {
                    bundle.putBundle(a.C0190a.i, nVar2.l());
                }
            }
            bundle.putLong(a.C0190a.o, vaVar.f.f);
            bundle.putLong(a.C0190a.j, vaVar.m);
            s sVar3 = vaVar.n;
            if (sVar3 != null) {
                bundle.putString(a.C0190a.k, sVar3.d);
                n nVar3 = vaVar.n.e;
                if (nVar3 != null) {
                    bundle.putBundle(a.C0190a.l, nVar3.l());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static boolean u0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static long v(n nVar) {
        long length = 0;
        if (nVar == null) {
            return 0L;
        }
        Iterator<String> it = nVar.iterator();
        while (it.hasNext()) {
            if (nVar.j(it.next()) instanceof Parcelable[]) {
                length += ((Parcelable[]) r3).length;
            }
        }
        return length;
    }

    private static boolean v0(Bundle bundle, int r8) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", r8);
        return true;
    }

    @com.google.android.gms.common.util.d0
    static long w(byte[] bArr) {
        com.google.android.gms.common.internal.r.k(bArr);
        int r2 = 0;
        com.google.android.gms.common.internal.r.q(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (bArr[length] & 255) << r2;
            r2 += 8;
        }
        return j;
    }

    static Bundle[] x0(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else {
            if (!(obj instanceof ArrayList)) {
                return null;
            }
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    @com.google.android.gms.common.util.d0
    private final boolean z0(Context context, String str) {
        y3 y3VarE;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoE = c.a.b.b.d.s.c.a(context).e(str, 64);
            if (packageInfoE == null || packageInfoE.signatures == null || packageInfoE.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfoE.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            y3VarE = B().E();
            str2 = "Package name not found";
            y3VarE.b(str2, e);
            return true;
        } catch (CertificateException e2) {
            e = e2;
            y3VarE = B().E();
            str2 = "Error obtaining certificate";
            y3VarE.b(str2, e);
            return true;
        }
    }

    final Bundle A(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objH = H(str, bundle.get(str));
                if (objH == null) {
                    B().K().b("Param value can't be null", f().v(str));
                } else {
                    N(bundle2, str, objH);
                }
            }
        }
        return bundle2;
    }

    @androidx.annotation.y0
    final boolean A0(String str) {
        c();
        if (c.a.b.b.d.s.c.a(F()).a(str) == 0) {
            return true;
        }
        B().M().b("Permission not granted", str);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    final Bundle C(String str, String str2, Bundle bundle, @androidx.annotation.i0 List<String> list, boolean z, boolean z2) {
        int r0;
        int r9;
        ha haVar = this;
        boolean zL0 = l0(str2, z5.d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int r8 = j().u();
        int r18 = 0;
        for (String str3 : j().C(str, u.a0) ? new TreeSet<>(bundle.keySet()) : bundle.keySet()) {
            if (list == null || !list.contains(str3)) {
                r0 = z ? haVar.G0(str3) : 0;
                if (r0 == 0) {
                    r0 = haVar.I0(str3);
                }
            } else {
                r0 = 0;
            }
            if (r0 != 0) {
                K(bundle2, r0, str3, str3, r0 == 3 ? str3 : null);
                bundle2.remove(str3);
                r9 = r8;
            } else {
                r9 = r8;
                int r02 = r(str, str2, str3, bundle.get(str3), bundle2, list, z, zL0);
                if (r02 == 17) {
                    K(bundle2, r02, str3, str3, Boolean.FALSE);
                } else if (r02 != 0 && !"_ev".equals(str3)) {
                    K(bundle2, r02, r02 == 21 ? str2 : str3, str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (e0(str3)) {
                    int r03 = r18 + 1;
                    if (r03 > r9) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Event can't contain more than ");
                        sb.append(r9);
                        sb.append(" params");
                        B().H().c(sb.toString(), f().s(str2), f().q(bundle));
                        v0(bundle2, 5);
                        bundle2.remove(str3);
                        r18 = r03;
                    } else {
                        r18 = r03;
                    }
                }
                r8 = r9;
                haVar = this;
            }
            r8 = r9;
            haVar = this;
        }
        return bundle2;
    }

    final boolean D0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return j().P().equals(str);
    }

    final s E(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2, boolean z3) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (s(str2, z3) != 0) {
            B().E().b("Invalid conditional property event name", f().w(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleC = C(str, str2, bundle2, com.google.android.gms.common.util.h.c("_o"), false, false);
        if (z) {
            bundleC = A(bundleC);
        }
        return new s(str2, new n(bundleC), str3, j);
    }

    public final long E0() {
        long j = this.d.get();
        synchronized (this.d) {
            if (j != 0) {
                this.d.compareAndSet(-1L, 1L);
                return this.d.getAndIncrement();
            }
            long jNextLong = new Random(System.nanoTime() ^ z().a()).nextLong();
            int r3 = this.e + 1;
            this.e = r3;
            return jNextLong + r3;
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    final Object H(String str, Object obj) {
        if ("_ev".equals(str)) {
            return G(256, obj, true, true);
        }
        return G(C0(str) ? 256 : 100, obj, false, true);
    }

    @androidx.annotation.y0
    final SecureRandom H0() {
        c();
        if (this.f6407c == null) {
            this.f6407c = new SecureRandom();
        }
        return this.f6407c;
    }

    public final URL J(long j, @androidx.annotation.h0 String str, @androidx.annotation.h0 String str2, long j2) {
        try {
            com.google.android.gms.common.internal.r.g(str2);
            com.google.android.gms.common.internal.r.g(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j), Integer.valueOf(K0())), str2, str, Long.valueOf(j2));
            if (str.equals(j().Q())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e) {
            B().E().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final int K0() {
        if (this.f == null) {
            this.f = Integer.valueOf(c.a.b.b.d.f.i().b(F()) / 1000);
        }
        return this.f.intValue();
    }

    @androidx.annotation.y0
    final void L(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            B().I().b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    final void M(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                h().N(bundle, str, bundle2.get(str));
            }
        }
    }

    final void N(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            B().K().c("Not putting event parameter. Invalid value type. name, type", f().v(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final boolean N0() throws ClassNotFoundException {
        try {
            F().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void O(pf pfVar, int r4) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", r4);
        try {
            pfVar.s0(bundle);
        } catch (RemoteException e) {
            this.f6543a.B().I().b("Error returning int value to wrapper", e);
        }
    }

    public final void P(pf pfVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            pfVar.s0(bundle);
        } catch (RemoteException e) {
            this.f6543a.B().I().b("Error returning long value to wrapper", e);
        }
    }

    public final void Q(pf pfVar, Bundle bundle) {
        try {
            pfVar.s0(bundle);
        } catch (RemoteException e) {
            this.f6543a.B().I().b("Error returning bundle value to wrapper", e);
        }
    }

    public final void R(pf pfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            pfVar.s0(bundle);
        } catch (RemoteException e) {
            this.f6543a.B().I().b("Error returning string value to wrapper", e);
        }
    }

    public final void S(pf pfVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            pfVar.s0(bundle);
        } catch (RemoteException e) {
            this.f6543a.B().I().b("Error returning bundle list to wrapper", e);
        }
    }

    public final void T(pf pfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            pfVar.s0(bundle);
        } catch (RemoteException e) {
            this.f6543a.B().I().b("Error returning boolean value to wrapper", e);
        }
    }

    public final void U(pf pfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            pfVar.s0(bundle);
        } catch (RemoteException e) {
            this.f6543a.B().I().b("Error returning byte array to wrapper", e);
        }
    }

    final void V(a4 a4Var, int r10) {
        int r1 = 0;
        for (String str : new TreeSet(a4Var.d.keySet())) {
            if (e0(str) && (r1 = r1 + 1) > r10) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(r10);
                sb.append(" params");
                B().H().c(sb.toString(), f().s(a4Var.f6346a), f().q(a4Var.d));
                v0(a4Var.d, 5);
                a4Var.d.remove(str);
            }
        }
    }

    public final void W(ga gaVar, int r9, String str, String str2, int r12) {
        X(gaVar, null, r9, str, str2, r12);
    }

    final void X(ga gaVar, String str, int r5, String str2, String str3, int r8) {
        Bundle bundle = new Bundle();
        v0(bundle, r5);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (r5 == 6 || r5 == 7 || r5 == 2) {
            bundle.putLong("_el", r8);
        }
        if (jb.b() && j().p(u.Q0)) {
            gaVar.e(str, bundle);
        } else {
            this.f6543a.E().Z("auto", "_err", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ m d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ wa e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ u3 f() {
        return super.f();
    }

    @SuppressLint({"ApplySharedPref"})
    final boolean f0(String str, double d) {
        try {
            SharedPreferences.Editor editorEdit = F().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return editorEdit.commit();
        } catch (Exception e) {
            B().E().b("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    final boolean g0(String str, int r5, String str2) throws IllegalStateException {
        if (str2 == null) {
            B().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= r5) {
            return true;
        }
        B().H().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(r5), str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ ha h() {
        return super.h();
    }

    final boolean h0(String str, String str2) {
        if (str2 == null) {
            B().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            B().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int r1 = str2.codePointAt(0);
        if (!Character.isLetter(r1)) {
            B().H().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int r12 = Character.charCount(r1);
        while (r12 < length) {
            int r3 = str2.codePointAt(r12);
            if (r3 != 95 && !Character.isLetterOrDigit(r3)) {
                B().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            r12 += Character.charCount(r3);
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ j4 i() {
        return super.i();
    }

    final boolean i0(String str, String str2, int r6, Object obj) throws IllegalStateException {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > r6) {
                B().K().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ xa j() {
        return super.j();
    }

    final boolean j0(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (L0(str)) {
                return true;
            }
            if (this.f6543a.J()) {
                B().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", w3.t(str));
            }
            return false;
        }
        if (hd.b() && j().p(u.k0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f6543a.J()) {
                B().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (L0(str2)) {
            return true;
        }
        B().H().b("Invalid admob_app_id. Analytics disabled.", w3.t(str2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.y5
    @androidx.annotation.y0
    protected final void k() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                B().I().a("Utils falling back to Random for random id");
            }
        }
        this.d.set(jNextLong);
    }

    final boolean m0(String str, String[] strArr, String str2) {
        return n0(str, strArr, null, str2);
    }

    final boolean n0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z;
        if (str2 == null) {
            B().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.r.k(str2);
        String[] strArr3 = g;
        int length = strArr3.length;
        int r3 = 0;
        while (true) {
            if (r3 >= length) {
                z = false;
                break;
            }
            if (str2.startsWith(strArr3[r3])) {
                z = true;
                break;
            }
            r3++;
        }
        if (z) {
            B().H().c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr == null || !l0(str2, strArr) || (strArr2 != null && l0(str2, strArr2))) {
            return true;
        }
        B().H().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.y5
    protected final boolean o() {
        return true;
    }

    public final int q(int r3) {
        return c.a.b.b.d.f.i().k(F(), 12451000);
    }

    final int q0(String str) {
        if (!w0("user property", str)) {
            return 6;
        }
        if (m0("user property", b6.f6357a, str)) {
            return !g0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final int r0(String str, Object obj) {
        int r0;
        String str2;
        if ("_ldl".equals(str)) {
            r0 = M0(str);
            str2 = "user property referrer";
        } else {
            r0 = M0(str);
            str2 = "user property";
        }
        return i0(str2, str, r0, obj) ? 0 : 7;
    }

    final int s(String str, boolean z) {
        if (!w0(androidx.core.app.p.i0, str)) {
            return 2;
        }
        if (z) {
            if (!n0(androidx.core.app.p.i0, z5.f6577a, z5.f6578b, str)) {
                return 13;
            }
        } else if (!m0(androidx.core.app.p.i0, z5.f6577a, str)) {
            return 13;
        }
        return !g0(androidx.core.app.p.i0, 40, str) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:17:0x0076). Please report as a decompilation issue!!! */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final long u(android.content.Context r7, java.lang.String r8) throws java.security.NoSuchAlgorithmException {
        /*
            r6 = this;
            r6.c()
            com.google.android.gms.common.internal.r.k(r7)
            com.google.android.gms.common.internal.r.g(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.security.MessageDigest r1 = J0()
            r2 = -1
            r4 = 0
            if (r1 != 0) goto L25
            com.google.android.gms.measurement.internal.w3 r7 = r6.B()
            com.google.android.gms.measurement.internal.y3 r7 = r7.E()
            java.lang.String r8 = "Could not get MD5 instance"
            r7.a(r8)
            goto L77
        L25:
            if (r0 == 0) goto L76
            boolean r8 = r6.z0(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            if (r8 != 0) goto L76
            c.a.b.b.d.s.b r7 = c.a.b.b.d.s.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            android.content.Context r8 = r6.F()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r0 = 64
            android.content.pm.PackageInfo r7 = r7.e(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            android.content.pm.Signature[] r8 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            if (r8 == 0) goto L5a
            android.content.pm.Signature[] r8 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            int r8 = r8.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            if (r8 <= 0) goto L5a
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r8 = 0
            r7 = r7[r8]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            byte[] r7 = r1.digest(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            long r2 = w(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            goto L77
        L5a:
            com.google.android.gms.measurement.internal.w3 r7 = r6.B()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            com.google.android.gms.measurement.internal.y3 r7 = r7.I()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r8 = "Could not get signatures"
            r7.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            goto L77
        L68:
            r7 = move-exception
            com.google.android.gms.measurement.internal.w3 r8 = r6.B()
            com.google.android.gms.measurement.internal.y3 r8 = r8.E()
            java.lang.String r0 = "Package name not found"
            r8.b(r0, r7)
        L76:
            r2 = r4
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ha.u(android.content.Context, java.lang.String):long");
    }

    final boolean w0(String str, String str2) {
        if (str2 == null) {
            B().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            B().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int r1 = str2.codePointAt(0);
        if (!Character.isLetter(r1) && r1 != 95) {
            B().H().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int r12 = Character.charCount(r1);
        while (r12 < length) {
            int r4 = str2.codePointAt(r12);
            if (r4 != 95 && !Character.isLetterOrDigit(r4)) {
                B().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            r12 += Character.charCount(r4);
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    final Bundle y(@androidx.annotation.h0 Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(FirebaseAnalytics.b.N, queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(FirebaseAnalytics.b.O, queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(FirebaseAnalytics.b.P, queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(FirebaseAnalytics.b.Q, queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(FirebaseAnalytics.b.R, queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter(FirebaseAnalytics.b.S);
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString(FirebaseAnalytics.b.S, queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter(FirebaseAnalytics.b.T);
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString(FirebaseAnalytics.b.T, queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("anid", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            B().I().b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    final Object y0(String str, Object obj) {
        boolean zEquals = "_ldl".equals(str);
        int r3 = M0(str);
        return zEquals ? G(r3, obj, true, false) : G(r3, obj, false, false);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}
