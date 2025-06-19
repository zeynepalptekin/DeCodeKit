package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes.dex */
public final class rm2 {
    private static final SparseIntArray d;
    private static final SparseIntArray e;
    private static final Map<String, Integer> f;

    /* renamed from: a, reason: collision with root package name */
    private static final km2 f5162a = km2.f("OMX.google.raw.decoder");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f5163b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<a, List<km2>> f5164c = new HashMap<>();
    private static int g = -1;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f5165a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f5166b;

        public a(String str, boolean z) {
            this.f5165a = str;
            this.f5166b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f5165a, aVar.f5165a) && this.f5166b == aVar.f5166b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f5165a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f5166b ? 1231 : 1237);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(66, 1);
        d.put(77, 2);
        d.put(88, 4);
        d.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        e.put(11, 4);
        e.put(12, 8);
        e.put(13, 16);
        e.put(20, 32);
        e.put(21, 64);
        e.put(22, 128);
        e.put(30, 256);
        e.put(31, 512);
        e.put(32, 1024);
        e.put(40, 2048);
        e.put(41, 4096);
        e.put(42, 8192);
        e.put(50, 16384);
        e.put(51, 32768);
        e.put(52, 65536);
        HashMap map = new HashMap();
        f = map;
        map.put("L30", 1);
        f.put("L60", 4);
        f.put("L63", 16);
        f.put("L90", 64);
        f.put("L93", 256);
        f.put("L120", 1024);
        f.put("L123", 4096);
        f.put("L150", 16384);
        f.put("L153", 65536);
        f.put("L156", 262144);
        f.put("L180", 1048576);
        f.put("L183", 4194304);
        f.put("L186", 16777216);
        f.put("H30", 2);
        f.put("H60", 8);
        f.put("H63", 32);
        f.put("H90", 128);
        f.put("H93", 512);
        f.put("H120", 2048);
        f.put("H123", 8192);
        f.put("H150", 32768);
        f.put("H153", 131072);
        f.put("H156", 524288);
        f.put("H180", 2097152);
        f.put("H183", 8388608);
        f.put("H186", 33554432);
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        Integer numValueOf;
        Integer numValueOf2;
        String strValueOf;
        StringBuilder sb;
        String str2;
        if (strArr.length < 2) {
            String strValueOf2 = String.valueOf(str);
            Log.w("MediaCodecUtil", strValueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else {
                if (strArr.length < 3) {
                    String strValueOf3 = String.valueOf(str);
                    Log.w("MediaCodecUtil", strValueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf3) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                Integer numValueOf3 = Integer.valueOf(Integer.parseInt(strArr[1]));
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                numValueOf2 = numValueOf3;
            }
            Integer numValueOf4 = Integer.valueOf(d.get(numValueOf2.intValue()));
            if (numValueOf4 == null) {
                strValueOf = String.valueOf(numValueOf2);
                sb = new StringBuilder(String.valueOf(strValueOf).length() + 21);
                str2 = "Unknown AVC profile: ";
            } else {
                Integer numValueOf5 = Integer.valueOf(e.get(numValueOf.intValue()));
                if (numValueOf5 != null) {
                    return new Pair<>(numValueOf4, numValueOf5);
                }
                strValueOf = String.valueOf(numValueOf);
                sb = new StringBuilder(String.valueOf(strValueOf).length() + 19);
                str2 = "Unknown AVC level: ";
            }
            sb.append(str2);
            sb.append(strValueOf);
            Log.w("MediaCodecUtil", sb.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf4 = String.valueOf(str);
            Log.w("MediaCodecUtil", strValueOf4.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf4) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.sm2.<init>(java.lang.Throwable, com.google.android.gms.internal.ads.qm2):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:194)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.google.android.gms.internal.ads.km2> b(com.google.android.gms.internal.ads.rm2.a r17, com.google.android.gms.internal.ads.vm2 r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rm2.b(com.google.android.gms.internal.ads.rm2$a, com.google.android.gms.internal.ads.vm2):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> c(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rm2.c(java.lang.String):android.util.Pair");
    }

    public static km2 d(String str, boolean z) throws sm2 {
        List<km2> listE = e(str, z);
        if (listE.isEmpty()) {
            return null;
        }
        return listE.get(0);
    }

    private static synchronized List<km2> e(String str, boolean z) throws sm2 {
        a aVar = new a(str, z);
        List<km2> list = f5164c.get(aVar);
        if (list != null) {
            return list;
        }
        List<km2> listB = b(aVar, nq2.f4592a >= 21 ? new xm2(z) : new um2());
        if (z && listB.isEmpty() && 21 <= nq2.f4592a && nq2.f4592a <= 23) {
            listB = b(aVar, new um2());
            if (!listB.isEmpty()) {
                String str2 = listB.get(0).f4114a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(str);
                sb.append(". Assuming: ");
                sb.append(str2);
                Log.w("MediaCodecUtil", sb.toString());
            }
        }
        List<km2> listUnmodifiableList = Collections.unmodifiableList(listB);
        f5164c.put(aVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static km2 f() {
        return f5162a;
    }

    public static int g() throws sm2 {
        if (g == -1) {
            int r2 = 0;
            km2 km2VarD = d("video/avc", false);
            if (km2VarD != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrJ = km2VarD.j();
                int length = codecProfileLevelArrJ.length;
                int r4 = 0;
                while (r2 < length) {
                    int r5 = codecProfileLevelArrJ[r2].level;
                    int r6 = 9437184;
                    if (r5 != 1 && r5 != 2) {
                        switch (r5) {
                            case 8:
                            case 16:
                            case 32:
                                r6 = 101376;
                                break;
                            case 64:
                                r6 = 202752;
                                break;
                            case 128:
                            case 256:
                                r6 = 414720;
                                break;
                            case 512:
                                r6 = 921600;
                                break;
                            case 1024:
                                r6 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                r6 = 2097152;
                                break;
                            case 8192:
                                r6 = 2228224;
                                break;
                            case 16384:
                                r6 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                r6 = -1;
                                break;
                        }
                    } else {
                        r6 = 25344;
                    }
                    r4 = Math.max(r6, r4);
                    r2++;
                }
                r2 = Math.max(r4, nq2.f4592a >= 21 ? 345600 : 172800);
            }
            g = r2;
        }
        return g;
    }
}
