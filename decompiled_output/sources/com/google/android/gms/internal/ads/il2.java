package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class il2 {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public int H;
    public int I;
    public long J;
    public long K;
    public boolean L;
    public boolean M;
    private String N;
    public yk2 O;
    public int P;

    /* renamed from: a, reason: collision with root package name */
    public String f3835a;

    /* renamed from: b, reason: collision with root package name */
    public int f3836b;

    /* renamed from: c, reason: collision with root package name */
    public int f3837c;
    public int d;
    public boolean e;
    public byte[] f;
    public xk2 g;
    public byte[] h;
    public ek2 i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public byte[] o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public float y;
    public float z;

    private il2() {
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = 0;
        this.o = null;
        this.p = -1;
        this.q = false;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = 1000;
        this.v = m.f.f719b;
        this.w = -1.0f;
        this.x = -1.0f;
        this.y = -1.0f;
        this.z = -1.0f;
        this.A = -1.0f;
        this.B = -1.0f;
        this.C = -1.0f;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = -1.0f;
        this.G = 1;
        this.H = -1;
        this.I = 8000;
        this.J = 0L;
        this.K = 0L;
        this.M = true;
        this.N = "eng";
    }

    /* synthetic */ il2(gl2 gl2Var) {
        this();
    }

    private static List<byte[]> b(hq2 hq2Var) throws ki2 {
        try {
            hq2Var.m(16);
            if (hq2Var.t() != 826496599) {
                return null;
            }
            byte[] bArr = hq2Var.f3710a;
            for (int r0 = hq2Var.b() + 20; r0 < bArr.length - 4; r0++) {
                if (bArr[r0] == 0 && bArr[r0 + 1] == 0 && bArr[r0 + 2] == 1 && bArr[r0 + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, r0, bArr.length));
                }
            }
            throw new ki2("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ki2("Error parsing FourCC VC1 codec private");
        }
    }

    private static boolean d(hq2 hq2Var) throws ki2 {
        try {
            int r0 = hq2Var.r();
            if (r0 == 1) {
                return true;
            }
            if (r0 == 65534) {
                hq2Var.l(24);
                if (hq2Var.e() == dl2.c0.getMostSignificantBits()) {
                    if (hq2Var.e() == dl2.c0.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ki2("Error parsing MS/ACM codec private");
        }
    }

    private static List<byte[]> e(byte[] bArr) throws ki2 {
        try {
            if (bArr[0] != 2) {
                throw new ki2("Error parsing vorbis codec private");
            }
            int r4 = 1;
            int r5 = 0;
            while (bArr[r4] == -1) {
                r5 += 255;
                r4++;
            }
            int r6 = r4 + 1;
            int r52 = r5 + bArr[r4];
            int r42 = 0;
            while (bArr[r6] == -1) {
                r42 += 255;
                r6++;
            }
            int r7 = r6 + 1;
            int r43 = r42 + bArr[r6];
            if (bArr[r7] != 1) {
                throw new ki2("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[r52];
            System.arraycopy(bArr, r7, bArr2, 0, r52);
            int r72 = r7 + r52;
            if (bArr[r72] != 3) {
                throw new ki2("Error parsing vorbis codec private");
            }
            int r73 = r72 + r43;
            if (bArr[r73] != 5) {
                throw new ki2("Error parsing vorbis codec private");
            }
            byte[] bArr3 = new byte[bArr.length - r73];
            System.arraycopy(bArr, r73, bArr3, 0, bArr.length - r73);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ki2("Error parsing vorbis codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.ok2 r43, int r44) throws com.google.android.gms.internal.ads.ki2 {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.il2.c(com.google.android.gms.internal.ads.ok2, int):void");
    }
}
