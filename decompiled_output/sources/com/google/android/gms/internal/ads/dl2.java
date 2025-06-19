package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.ek2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class dl2 implements mk2 {
    private static final sk2 Z = new gl2();
    private static final byte[] a0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] b0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID c0 = new UUID(72057594037932032L, -9223371306706625679L);
    private long A;
    private bq2 B;
    private bq2 C;
    private boolean D;
    private int E;
    private long F;
    private long G;
    private int H;
    private int I;
    private int[] J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private byte S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private boolean X;
    private ok2 Y;

    /* renamed from: a, reason: collision with root package name */
    private final bl2 f3134a;

    /* renamed from: b, reason: collision with root package name */
    private final kl2 f3135b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<il2> f3136c;
    private final boolean d;
    private final hq2 e;
    private final hq2 f;
    private final hq2 g;
    private final hq2 h;
    private final hq2 i;
    private final hq2 j;
    private final hq2 k;
    private final hq2 l;
    private final hq2 m;
    private ByteBuffer n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;
    private il2 t;
    private boolean u;
    private int v;
    private long w;
    private boolean x;
    private long y;
    private long z;

    public dl2() {
        this(0);
    }

    private dl2(int r2) {
        this(new al2(), 0);
    }

    private dl2(bl2 bl2Var, int r6) {
        this.p = -1L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.y = -1L;
        this.z = -1L;
        this.A = -9223372036854775807L;
        this.f3134a = bl2Var;
        bl2Var.b(new fl2(this, null));
        this.d = true;
        this.f3135b = new kl2();
        this.f3136c = new SparseArray<>();
        this.g = new hq2(4);
        this.h = new hq2(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new hq2(4);
        this.e = new hq2(cq2.f3017a);
        this.f = new hq2(4);
        this.j = new hq2();
        this.k = new hq2();
        this.l = new hq2(8);
        this.m = new hq2();
    }

    private final int b(pk2 pk2Var, yk2 yk2Var, int r4) throws InterruptedException, IOException {
        int r2;
        int r0 = this.j.q();
        if (r0 > 0) {
            r2 = Math.min(r4, r0);
            yk2Var.c(this.j, r2);
        } else {
            r2 = yk2Var.a(pk2Var, r4, false);
        }
        this.N += r2;
        this.V += r2;
        return r2;
    }

    private final void j(pk2 pk2Var, il2 il2Var, int r12) throws InterruptedException, IOException {
        int r7;
        if ("S_TEXT/UTF8".equals(il2Var.f3835a)) {
            int length = a0.length + r12;
            if (this.k.a() < length) {
                this.k.f3710a = Arrays.copyOf(a0, length + r12);
            }
            pk2Var.readFully(this.k.f3710a, a0.length, r12);
            this.k.l(0);
            this.k.k(length);
            return;
        }
        yk2 yk2Var = il2Var.O;
        if (!this.O) {
            if (il2Var.e) {
                this.M &= -1073741825;
                if (!this.P) {
                    pk2Var.readFully(this.g.f3710a, 0, 1);
                    this.N++;
                    byte[] bArr = this.g.f3710a;
                    if ((bArr[0] & 128) == 128) {
                        throw new ki2("Extension bit is set in signal byte");
                    }
                    this.S = bArr[0];
                    this.P = true;
                }
                byte b2 = this.S;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        pk2Var.readFully(this.l.f3710a, 0, 8);
                        this.N += 8;
                        this.Q = true;
                        this.g.f3710a[0] = (byte) ((z ? 128 : 0) | 8);
                        this.g.l(0);
                        yk2Var.c(this.g, 1);
                        this.V++;
                        this.l.l(0);
                        yk2Var.c(this.l, 8);
                        this.V += 8;
                    }
                    if (z) {
                        if (!this.R) {
                            pk2Var.readFully(this.g.f3710a, 0, 1);
                            this.N++;
                            this.g.l(0);
                            this.T = this.g.g();
                            this.R = true;
                        }
                        int r2 = this.T << 2;
                        this.g.j(r2);
                        pk2Var.readFully(this.g.f3710a, 0, r2);
                        this.N += r2;
                        short s = (short) ((this.T / 2) + 1);
                        int r5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.n;
                        if (byteBuffer == null || byteBuffer.capacity() < r5) {
                            this.n = ByteBuffer.allocate(r5);
                        }
                        this.n.position(0);
                        this.n.putShort(s);
                        int r22 = 0;
                        int r6 = 0;
                        while (true) {
                            r7 = this.T;
                            if (r22 >= r7) {
                                break;
                            }
                            int r72 = this.g.v();
                            if (r22 % 2 == 0) {
                                this.n.putShort((short) (r72 - r6));
                            } else {
                                this.n.putInt(r72 - r6);
                            }
                            r22++;
                            r6 = r72;
                        }
                        int r23 = (r12 - this.N) - r6;
                        int r73 = r7 % 2;
                        ByteBuffer byteBuffer2 = this.n;
                        if (r73 == 1) {
                            byteBuffer2.putInt(r23);
                        } else {
                            byteBuffer2.putShort((short) r23);
                            this.n.putInt(0);
                        }
                        this.m.o(this.n.array(), r5);
                        yk2Var.c(this.m, r5);
                        this.V += r5;
                    }
                }
            } else {
                byte[] bArr2 = il2Var.f;
                if (bArr2 != null) {
                    this.j.o(bArr2, bArr2.length);
                }
            }
            this.O = true;
        }
        int r122 = r12 + this.j.c();
        if (!"V_MPEG4/ISO/AVC".equals(il2Var.f3835a) && !"V_MPEGH/ISO/HEVC".equals(il2Var.f3835a)) {
            while (true) {
                int r24 = this.N;
                if (r24 >= r122) {
                    break;
                } else {
                    b(pk2Var, yk2Var, r122 - r24);
                }
            }
        } else {
            byte[] bArr3 = this.f.f3710a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int r3 = il2Var.P;
            int r4 = 4 - r3;
            while (this.N < r122) {
                int r62 = this.U;
                if (r62 == 0) {
                    int r63 = Math.min(r3, this.j.q());
                    pk2Var.readFully(bArr3, r4 + r63, r3 - r63);
                    if (r63 > 0) {
                        this.j.p(bArr3, r4, r63);
                    }
                    this.N += r3;
                    this.f.l(0);
                    this.U = this.f.v();
                    this.e.l(0);
                    yk2Var.c(this.e, 4);
                    this.V += 4;
                } else {
                    this.U = r62 - b(pk2Var, yk2Var, r62);
                }
            }
        }
        if ("A_VORBIS".equals(il2Var.f3835a)) {
            this.h.l(0);
            yk2Var.c(this.h, 4);
            this.V += 4;
        }
    }

    private final void k(il2 il2Var, long j) {
        byte[] bArrK;
        if ("S_TEXT/UTF8".equals(il2Var.f3835a)) {
            byte[] bArr = this.k.f3710a;
            long j2 = this.G;
            if (j2 == -9223372036854775807L) {
                bArrK = b0;
            } else {
                int r8 = (int) (j2 / 3600000000L);
                long j3 = j2 - (r8 * 3600000000L);
                int r5 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * r5);
                bArrK = nq2.k(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(r8), Integer.valueOf(r5), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (1000000 * r4)) / 1000))));
            }
            System.arraycopy(bArrK, 0, bArr, 19, 12);
            yk2 yk2Var = il2Var.O;
            hq2 hq2Var = this.k;
            yk2Var.c(hq2Var, hq2Var.c());
            this.V += this.k.c();
        }
        il2Var.O.b(j, this.M, this.V, 0, il2Var.g);
        this.W = true;
        t();
    }

    private static int[] l(int[] r1, int r2) {
        return r1 == null ? new int[r2] : r1.length >= r2 ? r1 : new int[Math.max(r1.length << 1, r2)];
    }

    static int m(int r0) {
        switch (r0) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case c.a.d.g.v /* 17026 */:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static boolean n(int r1) {
        return r1 == 357149030 || r1 == 524531317 || r1 == 475249515 || r1 == 374648427;
    }

    private final void p(pk2 pk2Var, int r5) throws InterruptedException, IOException {
        if (this.g.c() >= r5) {
            return;
        }
        if (this.g.a() < r5) {
            hq2 hq2Var = this.g;
            byte[] bArr = hq2Var.f3710a;
            hq2Var.o(Arrays.copyOf(bArr, Math.max(bArr.length << 1, r5)), this.g.c());
        }
        hq2 hq2Var2 = this.g;
        pk2Var.readFully(hq2Var2.f3710a, hq2Var2.c(), r5 - this.g.c());
        this.g.k(r5);
    }

    private final long s(long j) throws ki2 {
        long j2 = this.q;
        if (j2 != -9223372036854775807L) {
            return nq2.c(j, j2, 1000L);
        }
        throw new ki2("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void t() {
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        this.j.i();
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final void a() {
    }

    final void c(int r2, double d) {
        if (r2 == 181) {
            this.t.I = (int) d;
            return;
        }
        if (r2 == 17545) {
            this.r = (long) d;
            return;
        }
        switch (r2) {
            case 21969:
                this.t.w = (float) d;
                break;
            case 21970:
                this.t.x = (float) d;
                break;
            case 21971:
                this.t.y = (float) d;
                break;
            case 21972:
                this.t.z = (float) d;
                break;
            case 21973:
                this.t.A = (float) d;
                break;
            case 21974:
                this.t.B = (float) d;
                break;
            case 21975:
                this.t.C = (float) d;
                break;
            case 21976:
                this.t.D = (float) d;
                break;
            case 21977:
                this.t.E = (float) d;
                break;
            case 21978:
                this.t.F = (float) d;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final boolean d(pk2 pk2Var) throws InterruptedException, IOException {
        return new hl2().a(pk2Var);
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final void e(long j, long j2) {
        this.A = -9223372036854775807L;
        this.E = 0;
        this.f3134a.a();
        this.f3135b.a();
        t();
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final void f(ok2 ok2Var) {
        this.Y = ok2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f2, code lost:
    
        throw new com.google.android.gms.internal.ads.ki2("EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void g(int r22, int r23, com.google.android.gms.internal.ads.pk2 r24) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dl2.g(int, int, com.google.android.gms.internal.ads.pk2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.mk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.pk2 r9, com.google.android.gms.internal.ads.tk2 r10) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r8.W = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3a
            boolean r3 = r8.W
            if (r3 != 0) goto L3a
            com.google.android.gms.internal.ads.bl2 r2 = r8.f3134a
            boolean r2 = r2.c(r9)
            if (r2 == 0) goto L5
            long r3 = r9.getPosition()
            boolean r5 = r8.x
            if (r5 == 0) goto L25
            r8.z = r3
            long r3 = r8.y
            r10.f5416a = r3
            r8.x = r0
        L23:
            r3 = 1
            goto L37
        L25:
            boolean r3 = r8.u
            if (r3 == 0) goto L36
            long r3 = r8.z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L36
            r10.f5416a = r3
            r8.z = r5
            goto L23
        L36:
            r3 = 0
        L37:
            if (r3 == 0) goto L5
            return r1
        L3a:
            if (r2 == 0) goto L3d
            return r0
        L3d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dl2.h(com.google.android.gms.internal.ads.pk2, com.google.android.gms.internal.ads.tk2):int");
    }

    final void i(int r3, String str) throws ki2 {
        if (r3 == 134) {
            this.t.f3835a = str;
            return;
        }
        if (r3 != 17026) {
            if (r3 != 2274716) {
                return;
            }
            this.t.N = str;
        } else {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new ki2(sb.toString());
        }
    }

    final void o(int r14) throws ki2 {
        wk2 vk2Var;
        bq2 bq2Var;
        bq2 bq2Var2;
        int r8;
        if (r14 == 160) {
            if (this.E != 2) {
                return;
            }
            if (!this.X) {
                this.M |= 1;
            }
            k(this.f3136c.get(this.K), this.F);
            this.E = 0;
            return;
        }
        if (r14 == 174) {
            String str = this.t.f3835a;
            if ((("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) ? 1 : 0) != 0) {
                il2 il2Var = this.t;
                il2Var.c(this.Y, il2Var.f3836b);
                SparseArray<il2> sparseArray = this.f3136c;
                il2 il2Var2 = this.t;
                sparseArray.put(il2Var2.f3836b, il2Var2);
            }
            this.t = null;
            return;
        }
        if (r14 == 19899) {
            int r142 = this.v;
            if (r142 != -1) {
                long j = this.w;
                if (j != -1) {
                    if (r142 == 475249515) {
                        this.y = j;
                        return;
                    }
                    return;
                }
            }
            throw new ki2("Mandatory element SeekID or SeekPosition not found");
        }
        if (r14 == 25152) {
            il2 il2Var3 = this.t;
            if (il2Var3.e) {
                if (il2Var3.g == null) {
                    throw new ki2("Encrypted Track found but ContentEncKeyID was not found");
                }
                il2Var3.i = new ek2(new ek2.a(ph2.f4817b, "video/webm", this.t.g.f5993b));
                return;
            }
            return;
        }
        if (r14 == 28032) {
            il2 il2Var4 = this.t;
            if (il2Var4.e && il2Var4.f != null) {
                throw new ki2("Combining encryption and compression is not supported");
            }
            return;
        }
        if (r14 == 357149030) {
            if (this.q == -9223372036854775807L) {
                this.q = 1000000L;
            }
            long j2 = this.r;
            if (j2 != -9223372036854775807L) {
                this.s = s(j2);
                return;
            }
            return;
        }
        if (r14 == 374648427) {
            if (this.f3136c.size() == 0) {
                throw new ki2("No valid tracks were found");
            }
            this.Y.m();
            return;
        }
        if (r14 == 475249515 && !this.u) {
            ok2 ok2Var = this.Y;
            if (this.p == -1 || this.s == -9223372036854775807L || (bq2Var = this.B) == null || bq2Var.c() == 0 || (bq2Var2 = this.C) == null || bq2Var2.c() != this.B.c()) {
                this.B = null;
                this.C = null;
                vk2Var = new vk2(this.s);
            } else {
                int r0 = this.B.c();
                int[] r4 = new int[r0];
                long[] jArr = new long[r0];
                long[] jArr2 = new long[r0];
                long[] jArr3 = new long[r0];
                for (int r82 = 0; r82 < r0; r82++) {
                    jArr3[r82] = this.B.b(r82);
                    jArr[r82] = this.p + this.C.b(r82);
                }
                while (true) {
                    r8 = r0 - 1;
                    if (ı >= r8) {
                        break;
                    }
                    int r83 = ı + 1;
                    r4[ı] = (int) (jArr[r83] - jArr[ı]);
                    jArr2[ı] = jArr3[r83] - jArr3[ı];
                    ı = r83;
                }
                r4[r8] = (int) ((this.p + this.o) - jArr[r8]);
                jArr2[r8] = this.s - jArr3[r8];
                this.B = null;
                this.C = null;
                vk2Var = new kk2(r4, jArr, jArr2, jArr3);
            }
            ok2Var.l(vk2Var);
            this.u = true;
        }
    }

    final void q(int r9, long j) throws ki2 {
        if (r9 == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw new ki2(sb.toString());
        }
        if (r9 == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw new ki2(sb2.toString());
        }
        switch (r9) {
            case 131:
                this.t.f3837c = (int) j;
                return;
            case 136:
                this.t.L = j == 1;
                return;
            case 155:
                this.G = s(j);
                return;
            case 159:
                this.t.G = (int) j;
                return;
            case 176:
                this.t.j = (int) j;
                return;
            case 179:
                this.B.a(s(j));
                return;
            case 186:
                this.t.k = (int) j;
                return;
            case 215:
                this.t.f3836b = (int) j;
                return;
            case 231:
                this.A = s(j);
                return;
            case 241:
                if (this.D) {
                    return;
                }
                this.C.a(j);
                this.D = true;
                return;
            case 251:
                this.X = true;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw new ki2(sb3.toString());
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new ki2(sb4.toString());
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw new ki2(sb5.toString());
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new ki2(sb6.toString());
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw new ki2(sb7.toString());
            case 21420:
                this.w = j + this.p;
                return;
            case 21432:
                int r92 = (int) j;
                if (r92 == 0) {
                    this.t.p = 0;
                    return;
                }
                if (r92 == 1) {
                    this.t.p = 2;
                    return;
                } else if (r92 == 3) {
                    this.t.p = 1;
                    return;
                } else {
                    if (r92 != 15) {
                        return;
                    }
                    this.t.p = 3;
                    return;
                }
            case 21680:
                this.t.l = (int) j;
                return;
            case 21682:
                this.t.n = (int) j;
                return;
            case 21690:
                this.t.m = (int) j;
                return;
            case 21930:
                this.t.M = j == 1;
                return;
            case 22186:
                this.t.J = j;
                return;
            case 22203:
                this.t.K = j;
                return;
            case 25188:
                this.t.H = (int) j;
                return;
            case 2352003:
                this.t.d = (int) j;
                return;
            case 2807729:
                this.q = j;
                return;
            default:
                switch (r9) {
                    case 21945:
                        int r93 = (int) j;
                        if (r93 == 1) {
                            this.t.t = 2;
                            return;
                        } else {
                            if (r93 != 2) {
                                return;
                            }
                            this.t.t = 1;
                            return;
                        }
                    case 21946:
                        int r94 = (int) j;
                        if (r94 != 1) {
                            if (r94 == 16) {
                                this.t.s = 6;
                                return;
                            } else if (r94 == 18) {
                                this.t.s = 7;
                                return;
                            } else if (r94 != 6 && r94 != 7) {
                                return;
                            }
                        }
                        this.t.s = 3;
                        return;
                    case 21947:
                        il2 il2Var = this.t;
                        il2Var.q = true;
                        int r11 = (int) j;
                        if (r11 == 1) {
                            il2Var.r = 1;
                            return;
                        }
                        if (r11 == 9) {
                            il2Var.r = 6;
                            return;
                        } else {
                            if (r11 == 4 || r11 == 5 || r11 == 6 || r11 == 7) {
                                this.t.r = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.t.u = (int) j;
                        return;
                    case 21949:
                        this.t.v = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    final void r(int r6, long j, long j2) throws ki2 {
        if (r6 == 160) {
            this.X = false;
            return;
        }
        if (r6 == 174) {
            this.t = new il2(null);
            return;
        }
        if (r6 == 187) {
            this.D = false;
            return;
        }
        if (r6 == 19899) {
            this.v = -1;
            this.w = -1L;
            return;
        }
        if (r6 == 20533) {
            this.t.e = true;
            return;
        }
        if (r6 == 21968) {
            this.t.q = true;
            return;
        }
        if (r6 == 408125543) {
            long j3 = this.p;
            if (j3 != -1 && j3 != j) {
                throw new ki2("Multiple Segment elements not supported");
            }
            this.p = j;
            this.o = j2;
            return;
        }
        if (r6 == 475249515) {
            this.B = new bq2();
            this.C = new bq2();
        } else if (r6 == 524531317 && !this.u) {
            if (this.d && this.y != -1) {
                this.x = true;
            } else {
                this.Y.l(new vk2(this.s));
                this.u = true;
            }
        }
    }
}
