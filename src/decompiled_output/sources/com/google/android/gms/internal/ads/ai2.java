package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
final class ai2 implements Handler.Callback, vn2, xn2, bp2 {
    private int A;
    private int B;
    private long C;
    private int D;
    private bi2 E;
    private long F;
    private zh2 G;
    private zh2 H;
    private zh2 I;
    private ni2 J;
    private final mi2[] d;
    private final li2[] e;
    private final cp2 f;
    private final hi2 g;
    private final iq2 h;
    private final Handler i;
    private final HandlerThread j;
    private final Handler k;
    private final rh2 l;
    private final ti2 m;
    private final qi2 n;
    private ci2 o;
    private ji2 p;
    private mi2 q;
    private aq2 r;
    private tn2 s;
    private mi2[] t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int z = 0;
    private int y = 1;

    public ai2(mi2[] mi2VarArr, cp2 cp2Var, hi2 hi2Var, boolean z, int r5, Handler handler, ci2 ci2Var, rh2 rh2Var) {
        this.d = mi2VarArr;
        this.f = cp2Var;
        this.g = hi2Var;
        this.v = z;
        this.k = handler;
        this.o = ci2Var;
        this.l = rh2Var;
        this.e = new li2[mi2VarArr.length];
        for (int r4 = 0; r4 < mi2VarArr.length; r4++) {
            mi2VarArr[r4].w0(r4);
            this.e[r4] = mi2VarArr[r4].z0();
        }
        this.h = new iq2();
        this.t = new mi2[0];
        this.m = new ti2();
        this.n = new qi2();
        cp2Var.c(this);
        this.p = ji2.d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.j = handlerThread;
        handlerThread.start();
        this.i = new Handler(this.j.getLooper(), this);
    }

    private final void A() throws sh2 {
        this.w = false;
        this.h.a();
        for (mi2 mi2Var : this.t) {
            mi2Var.start();
        }
    }

    private final void B() throws sh2 {
        this.h.c();
        for (mi2 mi2Var : this.t) {
            n(mi2Var);
        }
    }

    private final void C() throws sh2 {
        zh2 zh2Var = this.I;
        if (zh2Var == null) {
            return;
        }
        long jH = zh2Var.f6264a.h();
        if (jH != -9223372036854775807L) {
            y(jH);
        } else {
            mi2 mi2Var = this.q;
            if (mi2Var == null || mi2Var.u0()) {
                this.F = this.h.f();
            } else {
                long jF = this.r.f();
                this.F = jF;
                this.h.g(jF);
            }
            jH = this.F - this.I.e();
        }
        this.o.f2977c = jH;
        this.C = SystemClock.elapsedRealtime() * 1000;
        long jN = this.t.length == 0 ? Long.MIN_VALUE : this.I.f6264a.n();
        ci2 ci2Var = this.o;
        if (jN == Long.MIN_VALUE) {
            jN = this.J.c(this.I.g, this.n, false).d;
        }
        ci2Var.d = jN;
    }

    private final void D() {
        I(true);
        this.g.e();
        e(1);
    }

    private final void E() throws IOException {
        zh2 zh2Var = this.G;
        if (zh2Var == null || zh2Var.j) {
            return;
        }
        zh2 zh2Var2 = this.H;
        if (zh2Var2 == null || zh2Var2.l == zh2Var) {
            for (mi2 mi2Var : this.t) {
                if (!mi2Var.v0()) {
                    return;
                }
            }
            this.G.f6264a.j();
        }
    }

    private final void F() {
        zh2 zh2Var = this.G;
        long jA = !zh2Var.j ? 0L : zh2Var.f6264a.a();
        if (jA == Long.MIN_VALUE) {
            H(false);
            return;
        }
        long jE = this.F - this.G.e();
        boolean zC = this.g.c(jA - jE);
        H(zC);
        if (zC) {
            this.G.f6264a.b(jE);
        }
    }

    private final void H(boolean z) {
        if (this.x != z) {
            this.x = z;
            this.k.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void I(boolean z) {
        this.i.removeMessages(2);
        this.w = false;
        this.h.c();
        this.r = null;
        this.q = null;
        this.F = 60000000L;
        for (mi2 mi2Var : this.t) {
            try {
                n(mi2Var);
                mi2Var.A0();
            } catch (sh2 | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.t = new mi2[0];
        zh2 zh2Var = this.I;
        if (zh2Var == null) {
            zh2Var = this.G;
        }
        m(zh2Var);
        this.G = null;
        this.H = null;
        this.I = null;
        H(false);
        if (z) {
            tn2 tn2Var = this.s;
            if (tn2Var != null) {
                tn2Var.f();
                this.s = null;
            }
            this.J = null;
        }
    }

    private final boolean J(int r6) {
        this.J.c(r6, this.n, false);
        return !this.J.d(0, this.m, false).e && this.J.b(r6, this.n, this.m, this.z) == -1;
    }

    private final void e(int r4) {
        if (this.y != r4) {
            this.y = r4;
            this.k.obtainMessage(1, r4, 0).sendToTarget();
        }
    }

    private final int h(int r7, ni2 ni2Var, ni2 ni2Var2) {
        int r0 = ni2Var.h();
        int r3 = -1;
        for (int r2 = 0; r2 < r0 && r3 == -1; r2++) {
            r7 = ni2Var.b(r7, this.n, this.m, this.z);
            r3 = ni2Var2.f(ni2Var.c(r7, this.n, true).f5019b);
        }
        return r3;
    }

    private final long i(int r8, long j) throws sh2 {
        zh2 zh2Var;
        B();
        this.w = false;
        e(2);
        zh2 zh2Var2 = this.I;
        if (zh2Var2 == null) {
            zh2 zh2Var3 = this.G;
            if (zh2Var3 != null) {
                zh2Var3.a();
            }
            zh2Var = null;
        } else {
            zh2Var = null;
            while (zh2Var2 != null) {
                if (zh2Var2.g == r8 && zh2Var2.j) {
                    zh2Var = zh2Var2;
                } else {
                    zh2Var2.a();
                }
                zh2Var2 = zh2Var2.l;
            }
        }
        zh2 zh2Var4 = this.I;
        if (zh2Var4 != zh2Var || zh2Var4 != this.H) {
            for (mi2 mi2Var : this.t) {
                mi2Var.A0();
            }
            this.t = new mi2[0];
            this.r = null;
            this.q = null;
            this.I = null;
        }
        if (zh2Var != null) {
            zh2Var.l = null;
            this.G = zh2Var;
            this.H = zh2Var;
            v(zh2Var);
            zh2 zh2Var5 = this.I;
            if (zh2Var5.k) {
                j = zh2Var5.f6264a.o(j);
            }
            y(j);
            F();
        } else {
            this.G = null;
            this.H = null;
            this.I = null;
            y(j);
        }
        this.i.sendEmptyMessage(2);
        return j;
    }

    private final Pair<Integer, Long> j(bi2 bi2Var) {
        ni2 ni2Var = bi2Var.f2835a;
        if (ni2Var.a()) {
            ni2Var = this.J;
        }
        try {
            Pair<Integer, Long> pairU = u(ni2Var, bi2Var.f2836b, bi2Var.f2837c);
            ni2 ni2Var2 = this.J;
            if (ni2Var2 == ni2Var) {
                return pairU;
            }
            int r1 = ni2Var2.f(ni2Var.c(((Integer) pairU.first).intValue(), this.n, true).f5019b);
            if (r1 != -1) {
                return Pair.create(Integer.valueOf(r1), (Long) pairU.second);
            }
            int r6 = h(((Integer) pairU.first).intValue(), ni2Var, this.J);
            if (r6 == -1) {
                return null;
            }
            this.J.c(r6, this.n, false);
            return t(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new ii2(this.J, bi2Var.f2836b, bi2Var.f2837c);
        }
    }

    private final Pair<Integer, Long> k(ni2 ni2Var, int r10, long j, long j2) {
        vp2.g(r10, 0, ni2Var.g());
        ni2Var.e(r10, this.m, false, j2);
        if (j == -9223372036854775807L) {
            j = this.m.h;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        long j3 = this.m.j + j;
        long j4 = ni2Var.c(0, this.n, false).d;
        if (j4 != -9223372036854775807L) {
            int r11 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j3));
    }

    private final void l(long j, long j2) {
        this.i.removeMessages(2);
        long jElapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            this.i.sendEmptyMessage(2);
        } else {
            this.i.sendEmptyMessageDelayed(2, jElapsedRealtime);
        }
    }

    private static void m(zh2 zh2Var) {
        while (zh2Var != null) {
            zh2Var.a();
            zh2Var = zh2Var.l;
        }
    }

    private static void n(mi2 mi2Var) throws sh2 {
        if (mi2Var.getState() == 2) {
            mi2Var.stop();
        }
    }

    private final void q(Object obj, int r6) {
        this.o = new ci2(0, 0L);
        w(obj, r6);
        this.o = new ci2(0, -9223372036854775807L);
        e(4);
        I(false);
    }

    private final void s(boolean[] zArr, int r18) throws sh2 {
        this.t = new mi2[r18];
        int r2 = 0;
        int r3 = 0;
        while (true) {
            mi2[] mi2VarArr = this.d;
            if (r2 >= mi2VarArr.length) {
                return;
            }
            mi2 mi2Var = mi2VarArr[r2];
            xo2 xo2VarA = this.I.m.f3305b.a(r2);
            if (xo2VarA != null) {
                int r15 = r3 + 1;
                this.t[r3] = mi2Var;
                if (mi2Var.getState() == 0) {
                    oi2 oi2Var = this.I.m.d[r2];
                    boolean z = this.v && this.y == 3;
                    boolean z2 = !zArr[r2] && z;
                    int length = xo2VarA.length();
                    di2[] di2VarArr = new di2[length];
                    for (int r9 = 0; r9 < length; r9++) {
                        di2VarArr[r9] = xo2VarA.b(r9);
                    }
                    zh2 zh2Var = this.I;
                    mi2Var.y0(oi2Var, di2VarArr, zh2Var.d[r2], this.F, z2, zh2Var.e());
                    aq2 aq2VarC0 = mi2Var.C0();
                    if (aq2VarC0 != null) {
                        if (this.r != null) {
                            throw sh2.c(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.r = aq2VarC0;
                        this.q = mi2Var;
                        aq2VarC0.e(this.p);
                    }
                    if (z) {
                        mi2Var.start();
                    }
                }
                r3 = r15;
            }
            r2++;
        }
    }

    private final Pair<Integer, Long> t(int r3, long j) {
        return u(this.J, r3, -9223372036854775807L);
    }

    private final Pair<Integer, Long> u(ni2 ni2Var, int r9, long j) {
        return k(ni2Var, r9, j, 0L);
    }

    private final void v(zh2 zh2Var) throws sh2 {
        if (this.I == zh2Var) {
            return;
        }
        boolean[] zArr = new boolean[this.d.length];
        int r2 = 0;
        int r3 = 0;
        while (true) {
            mi2[] mi2VarArr = this.d;
            if (r2 >= mi2VarArr.length) {
                this.I = zh2Var;
                this.k.obtainMessage(3, zh2Var.m).sendToTarget();
                s(zArr, r3);
                return;
            }
            mi2 mi2Var = mi2VarArr[r2];
            zArr[r2] = mi2Var.getState() != 0;
            xo2 xo2VarA = zh2Var.m.f3305b.a(r2);
            if (xo2VarA != null) {
                r3++;
            }
            if (zArr[r2] && (xo2VarA == null || (mi2Var.D0() && mi2Var.G0() == this.I.d[r2]))) {
                if (mi2Var == this.q) {
                    this.h.d(this.r);
                    this.r = null;
                    this.q = null;
                }
                n(mi2Var);
                mi2Var.A0();
            }
            r2++;
        }
    }

    private final void w(Object obj, int r6) {
        this.k.obtainMessage(6, new ei2(this.J, obj, this.o, r6)).sendToTarget();
    }

    private final void y(long j) throws sh2 {
        zh2 zh2Var = this.I;
        long jE = j + (zh2Var == null ? 60000000L : zh2Var.e());
        this.F = jE;
        this.h.g(jE);
        for (mi2 mi2Var : this.t) {
            mi2Var.E0(this.F);
        }
    }

    private final boolean z(long j) {
        if (j == -9223372036854775807L || this.o.f2977c < j) {
            return true;
        }
        zh2 zh2Var = this.I.l;
        return zh2Var != null && zh2Var.j;
    }

    public final void G(boolean z) {
        this.i.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.bp2
    public final void a() {
        this.i.sendEmptyMessage(10);
    }

    public final synchronized void b() {
        if (this.u) {
            return;
        }
        this.i.sendEmptyMessage(6);
        while (!this.u) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.j.quit();
    }

    @Override // com.google.android.gms.internal.ads.vn2
    public final void c(rn2 rn2Var) {
        this.i.obtainMessage(8, rn2Var).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void d(ni2 ni2Var, Object obj) {
        this.i.obtainMessage(7, Pair.create(ni2Var, obj)).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.jo2
    public final /* synthetic */ void f(go2 go2Var) {
        this.i.obtainMessage(9, (rn2) go2Var).sendToTarget();
    }

    public final void g() {
        this.i.sendEmptyMessage(5);
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0283 A[Catch: IOException -> 0x0890, sh2 -> 0x0895, RuntimeException -> 0x089a, TryCatch #8 {RuntimeException -> 0x089a, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:127:0x01be, B:120:0x0194, B:121:0x0196, B:123:0x019a, B:124:0x019e, B:126:0x01a8, B:129:0x01ca, B:131:0x01d2, B:134:0x01d9, B:136:0x01dd, B:138:0x01e5, B:141:0x01ec, B:143:0x01ff, B:144:0x020d, B:146:0x0211, B:148:0x0221, B:150:0x0225, B:152:0x0233, B:153:0x0238, B:161:0x027f, B:163:0x0283, B:166:0x028a, B:168:0x0294, B:171:0x029f, B:172:0x02c7, B:174:0x02cb, B:178:0x02d8, B:179:0x02db, B:180:0x02e8, B:184:0x02f6, B:186:0x02fc, B:187:0x030f, B:189:0x0313, B:191:0x0323, B:193:0x0335, B:197:0x0343, B:199:0x0348, B:200:0x035c, B:201:0x0363, B:164:0x0286, B:154:0x0250, B:156:0x0258, B:158:0x025e, B:159:0x0263, B:203:0x0367, B:204:0x0372, B:211:0x037d, B:212:0x037e, B:214:0x0382, B:216:0x038a, B:218:0x0397, B:217:0x0391, B:220:0x03a3, B:222:0x03ab, B:223:0x03b4, B:225:0x03ba, B:226:0x03d8, B:230:0x03e1, B:236:0x0404, B:240:0x0412, B:241:0x0418, B:249:0x0428, B:253:0x0436, B:256:0x043f, B:260:0x044e, B:261:0x0457, B:262:0x0458, B:264:0x0460, B:374:0x06bd, B:376:0x06c3, B:377:0x06cb, B:379:0x06e6, B:381:0x06f1, B:385:0x06fa, B:387:0x0700, B:393:0x070c, B:398:0x0716, B:400:0x071d, B:401:0x0720, B:403:0x0724, B:405:0x0732, B:406:0x0745, B:410:0x075e, B:412:0x0766, B:414:0x076c, B:447:0x07f6, B:449:0x07fa, B:451:0x07ff, B:452:0x0807, B:454:0x080b, B:458:0x0814, B:463:0x082a, B:456:0x0810, B:459:0x081a, B:461:0x081f, B:462:0x0825, B:415:0x0776, B:417:0x077b, B:420:0x0782, B:422:0x078a, B:426:0x079d, B:436:0x07cf, B:438:0x07d7, B:429:0x07a5, B:430:0x07b3, B:423:0x078f, B:434:0x07c9, B:439:0x07db, B:441:0x07e0, B:446:0x07ec, B:444:0x07e6, B:265:0x0468, B:267:0x046c, B:280:0x04af, B:282:0x04b7, B:307:0x058f, B:309:0x0593, B:312:0x059c, B:314:0x05a0, B:316:0x05a4, B:318:0x05ab, B:320:0x05af, B:322:0x05b5, B:324:0x05c1, B:325:0x05ec, B:328:0x05f3, B:330:0x05f8, B:332:0x0604, B:334:0x060a, B:336:0x0610, B:337:0x0613, B:339:0x0617, B:341:0x061c, B:344:0x062e, B:347:0x0636, B:348:0x0639, B:350:0x063f, B:352:0x0647, B:357:0x0666, B:359:0x066b, B:362:0x0679, B:364:0x067f, B:366:0x068f, B:368:0x0695, B:370:0x069e, B:371:0x06a7, B:372:0x06b7, B:373:0x06ba, B:317:0x05a8, B:284:0x04bf, B:286:0x04c3, B:294:0x051e, B:296:0x0522, B:299:0x053f, B:303:0x054d, B:305:0x0581, B:306:0x0585, B:302:0x0546, B:298:0x0529, B:288:0x04c9, B:291:0x04da, B:293:0x050d, B:268:0x0471, B:270:0x047b, B:272:0x0483, B:275:0x0492, B:277:0x0496, B:279:0x04a3, B:465:0x082e, B:469:0x0836, B:471:0x083c, B:472:0x0843, B:474:0x0848, B:475:0x084d, B:476:0x0851, B:478:0x0855, B:480:0x0859, B:484:0x0865, B:486:0x0874, B:487:0x0880), top: B:511:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0286 A[Catch: IOException -> 0x0890, sh2 -> 0x0895, RuntimeException -> 0x089a, TryCatch #8 {RuntimeException -> 0x089a, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:127:0x01be, B:120:0x0194, B:121:0x0196, B:123:0x019a, B:124:0x019e, B:126:0x01a8, B:129:0x01ca, B:131:0x01d2, B:134:0x01d9, B:136:0x01dd, B:138:0x01e5, B:141:0x01ec, B:143:0x01ff, B:144:0x020d, B:146:0x0211, B:148:0x0221, B:150:0x0225, B:152:0x0233, B:153:0x0238, B:161:0x027f, B:163:0x0283, B:166:0x028a, B:168:0x0294, B:171:0x029f, B:172:0x02c7, B:174:0x02cb, B:178:0x02d8, B:179:0x02db, B:180:0x02e8, B:184:0x02f6, B:186:0x02fc, B:187:0x030f, B:189:0x0313, B:191:0x0323, B:193:0x0335, B:197:0x0343, B:199:0x0348, B:200:0x035c, B:201:0x0363, B:164:0x0286, B:154:0x0250, B:156:0x0258, B:158:0x025e, B:159:0x0263, B:203:0x0367, B:204:0x0372, B:211:0x037d, B:212:0x037e, B:214:0x0382, B:216:0x038a, B:218:0x0397, B:217:0x0391, B:220:0x03a3, B:222:0x03ab, B:223:0x03b4, B:225:0x03ba, B:226:0x03d8, B:230:0x03e1, B:236:0x0404, B:240:0x0412, B:241:0x0418, B:249:0x0428, B:253:0x0436, B:256:0x043f, B:260:0x044e, B:261:0x0457, B:262:0x0458, B:264:0x0460, B:374:0x06bd, B:376:0x06c3, B:377:0x06cb, B:379:0x06e6, B:381:0x06f1, B:385:0x06fa, B:387:0x0700, B:393:0x070c, B:398:0x0716, B:400:0x071d, B:401:0x0720, B:403:0x0724, B:405:0x0732, B:406:0x0745, B:410:0x075e, B:412:0x0766, B:414:0x076c, B:447:0x07f6, B:449:0x07fa, B:451:0x07ff, B:452:0x0807, B:454:0x080b, B:458:0x0814, B:463:0x082a, B:456:0x0810, B:459:0x081a, B:461:0x081f, B:462:0x0825, B:415:0x0776, B:417:0x077b, B:420:0x0782, B:422:0x078a, B:426:0x079d, B:436:0x07cf, B:438:0x07d7, B:429:0x07a5, B:430:0x07b3, B:423:0x078f, B:434:0x07c9, B:439:0x07db, B:441:0x07e0, B:446:0x07ec, B:444:0x07e6, B:265:0x0468, B:267:0x046c, B:280:0x04af, B:282:0x04b7, B:307:0x058f, B:309:0x0593, B:312:0x059c, B:314:0x05a0, B:316:0x05a4, B:318:0x05ab, B:320:0x05af, B:322:0x05b5, B:324:0x05c1, B:325:0x05ec, B:328:0x05f3, B:330:0x05f8, B:332:0x0604, B:334:0x060a, B:336:0x0610, B:337:0x0613, B:339:0x0617, B:341:0x061c, B:344:0x062e, B:347:0x0636, B:348:0x0639, B:350:0x063f, B:352:0x0647, B:357:0x0666, B:359:0x066b, B:362:0x0679, B:364:0x067f, B:366:0x068f, B:368:0x0695, B:370:0x069e, B:371:0x06a7, B:372:0x06b7, B:373:0x06ba, B:317:0x05a8, B:284:0x04bf, B:286:0x04c3, B:294:0x051e, B:296:0x0522, B:299:0x053f, B:303:0x054d, B:305:0x0581, B:306:0x0585, B:302:0x0546, B:298:0x0529, B:288:0x04c9, B:291:0x04da, B:293:0x050d, B:268:0x0471, B:270:0x047b, B:272:0x0483, B:275:0x0492, B:277:0x0496, B:279:0x04a3, B:465:0x082e, B:469:0x0836, B:471:0x083c, B:472:0x0843, B:474:0x0848, B:475:0x084d, B:476:0x0851, B:478:0x0855, B:480:0x0859, B:484:0x0865, B:486:0x0874, B:487:0x0880), top: B:511:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028a A[Catch: IOException -> 0x0890, sh2 -> 0x0895, RuntimeException -> 0x089a, TryCatch #8 {RuntimeException -> 0x089a, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:127:0x01be, B:120:0x0194, B:121:0x0196, B:123:0x019a, B:124:0x019e, B:126:0x01a8, B:129:0x01ca, B:131:0x01d2, B:134:0x01d9, B:136:0x01dd, B:138:0x01e5, B:141:0x01ec, B:143:0x01ff, B:144:0x020d, B:146:0x0211, B:148:0x0221, B:150:0x0225, B:152:0x0233, B:153:0x0238, B:161:0x027f, B:163:0x0283, B:166:0x028a, B:168:0x0294, B:171:0x029f, B:172:0x02c7, B:174:0x02cb, B:178:0x02d8, B:179:0x02db, B:180:0x02e8, B:184:0x02f6, B:186:0x02fc, B:187:0x030f, B:189:0x0313, B:191:0x0323, B:193:0x0335, B:197:0x0343, B:199:0x0348, B:200:0x035c, B:201:0x0363, B:164:0x0286, B:154:0x0250, B:156:0x0258, B:158:0x025e, B:159:0x0263, B:203:0x0367, B:204:0x0372, B:211:0x037d, B:212:0x037e, B:214:0x0382, B:216:0x038a, B:218:0x0397, B:217:0x0391, B:220:0x03a3, B:222:0x03ab, B:223:0x03b4, B:225:0x03ba, B:226:0x03d8, B:230:0x03e1, B:236:0x0404, B:240:0x0412, B:241:0x0418, B:249:0x0428, B:253:0x0436, B:256:0x043f, B:260:0x044e, B:261:0x0457, B:262:0x0458, B:264:0x0460, B:374:0x06bd, B:376:0x06c3, B:377:0x06cb, B:379:0x06e6, B:381:0x06f1, B:385:0x06fa, B:387:0x0700, B:393:0x070c, B:398:0x0716, B:400:0x071d, B:401:0x0720, B:403:0x0724, B:405:0x0732, B:406:0x0745, B:410:0x075e, B:412:0x0766, B:414:0x076c, B:447:0x07f6, B:449:0x07fa, B:451:0x07ff, B:452:0x0807, B:454:0x080b, B:458:0x0814, B:463:0x082a, B:456:0x0810, B:459:0x081a, B:461:0x081f, B:462:0x0825, B:415:0x0776, B:417:0x077b, B:420:0x0782, B:422:0x078a, B:426:0x079d, B:436:0x07cf, B:438:0x07d7, B:429:0x07a5, B:430:0x07b3, B:423:0x078f, B:434:0x07c9, B:439:0x07db, B:441:0x07e0, B:446:0x07ec, B:444:0x07e6, B:265:0x0468, B:267:0x046c, B:280:0x04af, B:282:0x04b7, B:307:0x058f, B:309:0x0593, B:312:0x059c, B:314:0x05a0, B:316:0x05a4, B:318:0x05ab, B:320:0x05af, B:322:0x05b5, B:324:0x05c1, B:325:0x05ec, B:328:0x05f3, B:330:0x05f8, B:332:0x0604, B:334:0x060a, B:336:0x0610, B:337:0x0613, B:339:0x0617, B:341:0x061c, B:344:0x062e, B:347:0x0636, B:348:0x0639, B:350:0x063f, B:352:0x0647, B:357:0x0666, B:359:0x066b, B:362:0x0679, B:364:0x067f, B:366:0x068f, B:368:0x0695, B:370:0x069e, B:371:0x06a7, B:372:0x06b7, B:373:0x06ba, B:317:0x05a8, B:284:0x04bf, B:286:0x04c3, B:294:0x051e, B:296:0x0522, B:299:0x053f, B:303:0x054d, B:305:0x0581, B:306:0x0585, B:302:0x0546, B:298:0x0529, B:288:0x04c9, B:291:0x04da, B:293:0x050d, B:268:0x0471, B:270:0x047b, B:272:0x0483, B:275:0x0492, B:277:0x0496, B:279:0x04a3, B:465:0x082e, B:469:0x0836, B:471:0x083c, B:472:0x0843, B:474:0x0848, B:475:0x084d, B:476:0x0851, B:478:0x0855, B:480:0x0859, B:484:0x0865, B:486:0x0874, B:487:0x0880), top: B:511:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0522 A[Catch: IOException -> 0x0890, sh2 -> 0x0895, RuntimeException -> 0x089a, TryCatch #8 {RuntimeException -> 0x089a, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:127:0x01be, B:120:0x0194, B:121:0x0196, B:123:0x019a, B:124:0x019e, B:126:0x01a8, B:129:0x01ca, B:131:0x01d2, B:134:0x01d9, B:136:0x01dd, B:138:0x01e5, B:141:0x01ec, B:143:0x01ff, B:144:0x020d, B:146:0x0211, B:148:0x0221, B:150:0x0225, B:152:0x0233, B:153:0x0238, B:161:0x027f, B:163:0x0283, B:166:0x028a, B:168:0x0294, B:171:0x029f, B:172:0x02c7, B:174:0x02cb, B:178:0x02d8, B:179:0x02db, B:180:0x02e8, B:184:0x02f6, B:186:0x02fc, B:187:0x030f, B:189:0x0313, B:191:0x0323, B:193:0x0335, B:197:0x0343, B:199:0x0348, B:200:0x035c, B:201:0x0363, B:164:0x0286, B:154:0x0250, B:156:0x0258, B:158:0x025e, B:159:0x0263, B:203:0x0367, B:204:0x0372, B:211:0x037d, B:212:0x037e, B:214:0x0382, B:216:0x038a, B:218:0x0397, B:217:0x0391, B:220:0x03a3, B:222:0x03ab, B:223:0x03b4, B:225:0x03ba, B:226:0x03d8, B:230:0x03e1, B:236:0x0404, B:240:0x0412, B:241:0x0418, B:249:0x0428, B:253:0x0436, B:256:0x043f, B:260:0x044e, B:261:0x0457, B:262:0x0458, B:264:0x0460, B:374:0x06bd, B:376:0x06c3, B:377:0x06cb, B:379:0x06e6, B:381:0x06f1, B:385:0x06fa, B:387:0x0700, B:393:0x070c, B:398:0x0716, B:400:0x071d, B:401:0x0720, B:403:0x0724, B:405:0x0732, B:406:0x0745, B:410:0x075e, B:412:0x0766, B:414:0x076c, B:447:0x07f6, B:449:0x07fa, B:451:0x07ff, B:452:0x0807, B:454:0x080b, B:458:0x0814, B:463:0x082a, B:456:0x0810, B:459:0x081a, B:461:0x081f, B:462:0x0825, B:415:0x0776, B:417:0x077b, B:420:0x0782, B:422:0x078a, B:426:0x079d, B:436:0x07cf, B:438:0x07d7, B:429:0x07a5, B:430:0x07b3, B:423:0x078f, B:434:0x07c9, B:439:0x07db, B:441:0x07e0, B:446:0x07ec, B:444:0x07e6, B:265:0x0468, B:267:0x046c, B:280:0x04af, B:282:0x04b7, B:307:0x058f, B:309:0x0593, B:312:0x059c, B:314:0x05a0, B:316:0x05a4, B:318:0x05ab, B:320:0x05af, B:322:0x05b5, B:324:0x05c1, B:325:0x05ec, B:328:0x05f3, B:330:0x05f8, B:332:0x0604, B:334:0x060a, B:336:0x0610, B:337:0x0613, B:339:0x0617, B:341:0x061c, B:344:0x062e, B:347:0x0636, B:348:0x0639, B:350:0x063f, B:352:0x0647, B:357:0x0666, B:359:0x066b, B:362:0x0679, B:364:0x067f, B:366:0x068f, B:368:0x0695, B:370:0x069e, B:371:0x06a7, B:372:0x06b7, B:373:0x06ba, B:317:0x05a8, B:284:0x04bf, B:286:0x04c3, B:294:0x051e, B:296:0x0522, B:299:0x053f, B:303:0x054d, B:305:0x0581, B:306:0x0585, B:302:0x0546, B:298:0x0529, B:288:0x04c9, B:291:0x04da, B:293:0x050d, B:268:0x0471, B:270:0x047b, B:272:0x0483, B:275:0x0492, B:277:0x0496, B:279:0x04a3, B:465:0x082e, B:469:0x0836, B:471:0x083c, B:472:0x0843, B:474:0x0848, B:475:0x084d, B:476:0x0851, B:478:0x0855, B:480:0x0859, B:484:0x0865, B:486:0x0874, B:487:0x0880), top: B:511:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0529 A[Catch: IOException -> 0x0890, sh2 -> 0x0895, RuntimeException -> 0x089a, TryCatch #8 {RuntimeException -> 0x089a, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:127:0x01be, B:120:0x0194, B:121:0x0196, B:123:0x019a, B:124:0x019e, B:126:0x01a8, B:129:0x01ca, B:131:0x01d2, B:134:0x01d9, B:136:0x01dd, B:138:0x01e5, B:141:0x01ec, B:143:0x01ff, B:144:0x020d, B:146:0x0211, B:148:0x0221, B:150:0x0225, B:152:0x0233, B:153:0x0238, B:161:0x027f, B:163:0x0283, B:166:0x028a, B:168:0x0294, B:171:0x029f, B:172:0x02c7, B:174:0x02cb, B:178:0x02d8, B:179:0x02db, B:180:0x02e8, B:184:0x02f6, B:186:0x02fc, B:187:0x030f, B:189:0x0313, B:191:0x0323, B:193:0x0335, B:197:0x0343, B:199:0x0348, B:200:0x035c, B:201:0x0363, B:164:0x0286, B:154:0x0250, B:156:0x0258, B:158:0x025e, B:159:0x0263, B:203:0x0367, B:204:0x0372, B:211:0x037d, B:212:0x037e, B:214:0x0382, B:216:0x038a, B:218:0x0397, B:217:0x0391, B:220:0x03a3, B:222:0x03ab, B:223:0x03b4, B:225:0x03ba, B:226:0x03d8, B:230:0x03e1, B:236:0x0404, B:240:0x0412, B:241:0x0418, B:249:0x0428, B:253:0x0436, B:256:0x043f, B:260:0x044e, B:261:0x0457, B:262:0x0458, B:264:0x0460, B:374:0x06bd, B:376:0x06c3, B:377:0x06cb, B:379:0x06e6, B:381:0x06f1, B:385:0x06fa, B:387:0x0700, B:393:0x070c, B:398:0x0716, B:400:0x071d, B:401:0x0720, B:403:0x0724, B:405:0x0732, B:406:0x0745, B:410:0x075e, B:412:0x0766, B:414:0x076c, B:447:0x07f6, B:449:0x07fa, B:451:0x07ff, B:452:0x0807, B:454:0x080b, B:458:0x0814, B:463:0x082a, B:456:0x0810, B:459:0x081a, B:461:0x081f, B:462:0x0825, B:415:0x0776, B:417:0x077b, B:420:0x0782, B:422:0x078a, B:426:0x079d, B:436:0x07cf, B:438:0x07d7, B:429:0x07a5, B:430:0x07b3, B:423:0x078f, B:434:0x07c9, B:439:0x07db, B:441:0x07e0, B:446:0x07ec, B:444:0x07e6, B:265:0x0468, B:267:0x046c, B:280:0x04af, B:282:0x04b7, B:307:0x058f, B:309:0x0593, B:312:0x059c, B:314:0x05a0, B:316:0x05a4, B:318:0x05ab, B:320:0x05af, B:322:0x05b5, B:324:0x05c1, B:325:0x05ec, B:328:0x05f3, B:330:0x05f8, B:332:0x0604, B:334:0x060a, B:336:0x0610, B:337:0x0613, B:339:0x0617, B:341:0x061c, B:344:0x062e, B:347:0x0636, B:348:0x0639, B:350:0x063f, B:352:0x0647, B:357:0x0666, B:359:0x066b, B:362:0x0679, B:364:0x067f, B:366:0x068f, B:368:0x0695, B:370:0x069e, B:371:0x06a7, B:372:0x06b7, B:373:0x06ba, B:317:0x05a8, B:284:0x04bf, B:286:0x04c3, B:294:0x051e, B:296:0x0522, B:299:0x053f, B:303:0x054d, B:305:0x0581, B:306:0x0585, B:302:0x0546, B:298:0x0529, B:288:0x04c9, B:291:0x04da, B:293:0x050d, B:268:0x0471, B:270:0x047b, B:272:0x0483, B:275:0x0492, B:277:0x0496, B:279:0x04a3, B:465:0x082e, B:469:0x0836, B:471:0x083c, B:472:0x0843, B:474:0x0848, B:475:0x084d, B:476:0x0851, B:478:0x0855, B:480:0x0859, B:484:0x0865, B:486:0x0874, B:487:0x0880), top: B:511:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0546 A[Catch: IOException -> 0x0890, sh2 -> 0x0895, RuntimeException -> 0x089a, TryCatch #8 {RuntimeException -> 0x089a, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:127:0x01be, B:120:0x0194, B:121:0x0196, B:123:0x019a, B:124:0x019e, B:126:0x01a8, B:129:0x01ca, B:131:0x01d2, B:134:0x01d9, B:136:0x01dd, B:138:0x01e5, B:141:0x01ec, B:143:0x01ff, B:144:0x020d, B:146:0x0211, B:148:0x0221, B:150:0x0225, B:152:0x0233, B:153:0x0238, B:161:0x027f, B:163:0x0283, B:166:0x028a, B:168:0x0294, B:171:0x029f, B:172:0x02c7, B:174:0x02cb, B:178:0x02d8, B:179:0x02db, B:180:0x02e8, B:184:0x02f6, B:186:0x02fc, B:187:0x030f, B:189:0x0313, B:191:0x0323, B:193:0x0335, B:197:0x0343, B:199:0x0348, B:200:0x035c, B:201:0x0363, B:164:0x0286, B:154:0x0250, B:156:0x0258, B:158:0x025e, B:159:0x0263, B:203:0x0367, B:204:0x0372, B:211:0x037d, B:212:0x037e, B:214:0x0382, B:216:0x038a, B:218:0x0397, B:217:0x0391, B:220:0x03a3, B:222:0x03ab, B:223:0x03b4, B:225:0x03ba, B:226:0x03d8, B:230:0x03e1, B:236:0x0404, B:240:0x0412, B:241:0x0418, B:249:0x0428, B:253:0x0436, B:256:0x043f, B:260:0x044e, B:261:0x0457, B:262:0x0458, B:264:0x0460, B:374:0x06bd, B:376:0x06c3, B:377:0x06cb, B:379:0x06e6, B:381:0x06f1, B:385:0x06fa, B:387:0x0700, B:393:0x070c, B:398:0x0716, B:400:0x071d, B:401:0x0720, B:403:0x0724, B:405:0x0732, B:406:0x0745, B:410:0x075e, B:412:0x0766, B:414:0x076c, B:447:0x07f6, B:449:0x07fa, B:451:0x07ff, B:452:0x0807, B:454:0x080b, B:458:0x0814, B:463:0x082a, B:456:0x0810, B:459:0x081a, B:461:0x081f, B:462:0x0825, B:415:0x0776, B:417:0x077b, B:420:0x0782, B:422:0x078a, B:426:0x079d, B:436:0x07cf, B:438:0x07d7, B:429:0x07a5, B:430:0x07b3, B:423:0x078f, B:434:0x07c9, B:439:0x07db, B:441:0x07e0, B:446:0x07ec, B:444:0x07e6, B:265:0x0468, B:267:0x046c, B:280:0x04af, B:282:0x04b7, B:307:0x058f, B:309:0x0593, B:312:0x059c, B:314:0x05a0, B:316:0x05a4, B:318:0x05ab, B:320:0x05af, B:322:0x05b5, B:324:0x05c1, B:325:0x05ec, B:328:0x05f3, B:330:0x05f8, B:332:0x0604, B:334:0x060a, B:336:0x0610, B:337:0x0613, B:339:0x0617, B:341:0x061c, B:344:0x062e, B:347:0x0636, B:348:0x0639, B:350:0x063f, B:352:0x0647, B:357:0x0666, B:359:0x066b, B:362:0x0679, B:364:0x067f, B:366:0x068f, B:368:0x0695, B:370:0x069e, B:371:0x06a7, B:372:0x06b7, B:373:0x06ba, B:317:0x05a8, B:284:0x04bf, B:286:0x04c3, B:294:0x051e, B:296:0x0522, B:299:0x053f, B:303:0x054d, B:305:0x0581, B:306:0x0585, B:302:0x0546, B:298:0x0529, B:288:0x04c9, B:291:0x04da, B:293:0x050d, B:268:0x0471, B:270:0x047b, B:272:0x0483, B:275:0x0492, B:277:0x0496, B:279:0x04a3, B:465:0x082e, B:469:0x0836, B:471:0x083c, B:472:0x0843, B:474:0x0848, B:475:0x084d, B:476:0x0851, B:478:0x0855, B:480:0x0859, B:484:0x0865, B:486:0x0874, B:487:0x0880), top: B:511:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0581 A[Catch: IOException -> 0x0890, sh2 -> 0x0895, RuntimeException -> 0x089a, TryCatch #8 {RuntimeException -> 0x089a, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:127:0x01be, B:120:0x0194, B:121:0x0196, B:123:0x019a, B:124:0x019e, B:126:0x01a8, B:129:0x01ca, B:131:0x01d2, B:134:0x01d9, B:136:0x01dd, B:138:0x01e5, B:141:0x01ec, B:143:0x01ff, B:144:0x020d, B:146:0x0211, B:148:0x0221, B:150:0x0225, B:152:0x0233, B:153:0x0238, B:161:0x027f, B:163:0x0283, B:166:0x028a, B:168:0x0294, B:171:0x029f, B:172:0x02c7, B:174:0x02cb, B:178:0x02d8, B:179:0x02db, B:180:0x02e8, B:184:0x02f6, B:186:0x02fc, B:187:0x030f, B:189:0x0313, B:191:0x0323, B:193:0x0335, B:197:0x0343, B:199:0x0348, B:200:0x035c, B:201:0x0363, B:164:0x0286, B:154:0x0250, B:156:0x0258, B:158:0x025e, B:159:0x0263, B:203:0x0367, B:204:0x0372, B:211:0x037d, B:212:0x037e, B:214:0x0382, B:216:0x038a, B:218:0x0397, B:217:0x0391, B:220:0x03a3, B:222:0x03ab, B:223:0x03b4, B:225:0x03ba, B:226:0x03d8, B:230:0x03e1, B:236:0x0404, B:240:0x0412, B:241:0x0418, B:249:0x0428, B:253:0x0436, B:256:0x043f, B:260:0x044e, B:261:0x0457, B:262:0x0458, B:264:0x0460, B:374:0x06bd, B:376:0x06c3, B:377:0x06cb, B:379:0x06e6, B:381:0x06f1, B:385:0x06fa, B:387:0x0700, B:393:0x070c, B:398:0x0716, B:400:0x071d, B:401:0x0720, B:403:0x0724, B:405:0x0732, B:406:0x0745, B:410:0x075e, B:412:0x0766, B:414:0x076c, B:447:0x07f6, B:449:0x07fa, B:451:0x07ff, B:452:0x0807, B:454:0x080b, B:458:0x0814, B:463:0x082a, B:456:0x0810, B:459:0x081a, B:461:0x081f, B:462:0x0825, B:415:0x0776, B:417:0x077b, B:420:0x0782, B:422:0x078a, B:426:0x079d, B:436:0x07cf, B:438:0x07d7, B:429:0x07a5, B:430:0x07b3, B:423:0x078f, B:434:0x07c9, B:439:0x07db, B:441:0x07e0, B:446:0x07ec, B:444:0x07e6, B:265:0x0468, B:267:0x046c, B:280:0x04af, B:282:0x04b7, B:307:0x058f, B:309:0x0593, B:312:0x059c, B:314:0x05a0, B:316:0x05a4, B:318:0x05ab, B:320:0x05af, B:322:0x05b5, B:324:0x05c1, B:325:0x05ec, B:328:0x05f3, B:330:0x05f8, B:332:0x0604, B:334:0x060a, B:336:0x0610, B:337:0x0613, B:339:0x0617, B:341:0x061c, B:344:0x062e, B:347:0x0636, B:348:0x0639, B:350:0x063f, B:352:0x0647, B:357:0x0666, B:359:0x066b, B:362:0x0679, B:364:0x067f, B:366:0x068f, B:368:0x0695, B:370:0x069e, B:371:0x06a7, B:372:0x06b7, B:373:0x06ba, B:317:0x05a8, B:284:0x04bf, B:286:0x04c3, B:294:0x051e, B:296:0x0522, B:299:0x053f, B:303:0x054d, B:305:0x0581, B:306:0x0585, B:302:0x0546, B:298:0x0529, B:288:0x04c9, B:291:0x04da, B:293:0x050d, B:268:0x0471, B:270:0x047b, B:272:0x0483, B:275:0x0492, B:277:0x0496, B:279:0x04a3, B:465:0x082e, B:469:0x0836, B:471:0x083c, B:472:0x0843, B:474:0x0848, B:475:0x084d, B:476:0x0851, B:478:0x0855, B:480:0x0859, B:484:0x0865, B:486:0x0874, B:487:0x0880), top: B:511:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0593 A[Catch: IOException -> 0x0890, sh2 -> 0x0895, RuntimeException -> 0x089a, TryCatch #8 {RuntimeException -> 0x089a, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:127:0x01be, B:120:0x0194, B:121:0x0196, B:123:0x019a, B:124:0x019e, B:126:0x01a8, B:129:0x01ca, B:131:0x01d2, B:134:0x01d9, B:136:0x01dd, B:138:0x01e5, B:141:0x01ec, B:143:0x01ff, B:144:0x020d, B:146:0x0211, B:148:0x0221, B:150:0x0225, B:152:0x0233, B:153:0x0238, B:161:0x027f, B:163:0x0283, B:166:0x028a, B:168:0x0294, B:171:0x029f, B:172:0x02c7, B:174:0x02cb, B:178:0x02d8, B:179:0x02db, B:180:0x02e8, B:184:0x02f6, B:186:0x02fc, B:187:0x030f, B:189:0x0313, B:191:0x0323, B:193:0x0335, B:197:0x0343, B:199:0x0348, B:200:0x035c, B:201:0x0363, B:164:0x0286, B:154:0x0250, B:156:0x0258, B:158:0x025e, B:159:0x0263, B:203:0x0367, B:204:0x0372, B:211:0x037d, B:212:0x037e, B:214:0x0382, B:216:0x038a, B:218:0x0397, B:217:0x0391, B:220:0x03a3, B:222:0x03ab, B:223:0x03b4, B:225:0x03ba, B:226:0x03d8, B:230:0x03e1, B:236:0x0404, B:240:0x0412, B:241:0x0418, B:249:0x0428, B:253:0x0436, B:256:0x043f, B:260:0x044e, B:261:0x0457, B:262:0x0458, B:264:0x0460, B:374:0x06bd, B:376:0x06c3, B:377:0x06cb, B:379:0x06e6, B:381:0x06f1, B:385:0x06fa, B:387:0x0700, B:393:0x070c, B:398:0x0716, B:400:0x071d, B:401:0x0720, B:403:0x0724, B:405:0x0732, B:406:0x0745, B:410:0x075e, B:412:0x0766, B:414:0x076c, B:447:0x07f6, B:449:0x07fa, B:451:0x07ff, B:452:0x0807, B:454:0x080b, B:458:0x0814, B:463:0x082a, B:456:0x0810, B:459:0x081a, B:461:0x081f, B:462:0x0825, B:415:0x0776, B:417:0x077b, B:420:0x0782, B:422:0x078a, B:426:0x079d, B:436:0x07cf, B:438:0x07d7, B:429:0x07a5, B:430:0x07b3, B:423:0x078f, B:434:0x07c9, B:439:0x07db, B:441:0x07e0, B:446:0x07ec, B:444:0x07e6, B:265:0x0468, B:267:0x046c, B:280:0x04af, B:282:0x04b7, B:307:0x058f, B:309:0x0593, B:312:0x059c, B:314:0x05a0, B:316:0x05a4, B:318:0x05ab, B:320:0x05af, B:322:0x05b5, B:324:0x05c1, B:325:0x05ec, B:328:0x05f3, B:330:0x05f8, B:332:0x0604, B:334:0x060a, B:336:0x0610, B:337:0x0613, B:339:0x0617, B:341:0x061c, B:344:0x062e, B:347:0x0636, B:348:0x0639, B:350:0x063f, B:352:0x0647, B:357:0x0666, B:359:0x066b, B:362:0x0679, B:364:0x067f, B:366:0x068f, B:368:0x0695, B:370:0x069e, B:371:0x06a7, B:372:0x06b7, B:373:0x06ba, B:317:0x05a8, B:284:0x04bf, B:286:0x04c3, B:294:0x051e, B:296:0x0522, B:299:0x053f, B:303:0x054d, B:305:0x0581, B:306:0x0585, B:302:0x0546, B:298:0x0529, B:288:0x04c9, B:291:0x04da, B:293:0x050d, B:268:0x0471, B:270:0x047b, B:272:0x0483, B:275:0x0492, B:277:0x0496, B:279:0x04a3, B:465:0x082e, B:469:0x0836, B:471:0x083c, B:472:0x0843, B:474:0x0848, B:475:0x084d, B:476:0x0851, B:478:0x0855, B:480:0x0859, B:484:0x0865, B:486:0x0874, B:487:0x0880), top: B:511:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05a8 A[Catch: IOException -> 0x0890, sh2 -> 0x0895, RuntimeException -> 0x089a, TryCatch #8 {RuntimeException -> 0x089a, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:127:0x01be, B:120:0x0194, B:121:0x0196, B:123:0x019a, B:124:0x019e, B:126:0x01a8, B:129:0x01ca, B:131:0x01d2, B:134:0x01d9, B:136:0x01dd, B:138:0x01e5, B:141:0x01ec, B:143:0x01ff, B:144:0x020d, B:146:0x0211, B:148:0x0221, B:150:0x0225, B:152:0x0233, B:153:0x0238, B:161:0x027f, B:163:0x0283, B:166:0x028a, B:168:0x0294, B:171:0x029f, B:172:0x02c7, B:174:0x02cb, B:178:0x02d8, B:179:0x02db, B:180:0x02e8, B:184:0x02f6, B:186:0x02fc, B:187:0x030f, B:189:0x0313, B:191:0x0323, B:193:0x0335, B:197:0x0343, B:199:0x0348, B:200:0x035c, B:201:0x0363, B:164:0x0286, B:154:0x0250, B:156:0x0258, B:158:0x025e, B:159:0x0263, B:203:0x0367, B:204:0x0372, B:211:0x037d, B:212:0x037e, B:214:0x0382, B:216:0x038a, B:218:0x0397, B:217:0x0391, B:220:0x03a3, B:222:0x03ab, B:223:0x03b4, B:225:0x03ba, B:226:0x03d8, B:230:0x03e1, B:236:0x0404, B:240:0x0412, B:241:0x0418, B:249:0x0428, B:253:0x0436, B:256:0x043f, B:260:0x044e, B:261:0x0457, B:262:0x0458, B:264:0x0460, B:374:0x06bd, B:376:0x06c3, B:377:0x06cb, B:379:0x06e6, B:381:0x06f1, B:385:0x06fa, B:387:0x0700, B:393:0x070c, B:398:0x0716, B:400:0x071d, B:401:0x0720, B:403:0x0724, B:405:0x0732, B:406:0x0745, B:410:0x075e, B:412:0x0766, B:414:0x076c, B:447:0x07f6, B:449:0x07fa, B:451:0x07ff, B:452:0x0807, B:454:0x080b, B:458:0x0814, B:463:0x082a, B:456:0x0810, B:459:0x081a, B:461:0x081f, B:462:0x0825, B:415:0x0776, B:417:0x077b, B:420:0x0782, B:422:0x078a, B:426:0x079d, B:436:0x07cf, B:438:0x07d7, B:429:0x07a5, B:430:0x07b3, B:423:0x078f, B:434:0x07c9, B:439:0x07db, B:441:0x07e0, B:446:0x07ec, B:444:0x07e6, B:265:0x0468, B:267:0x046c, B:280:0x04af, B:282:0x04b7, B:307:0x058f, B:309:0x0593, B:312:0x059c, B:314:0x05a0, B:316:0x05a4, B:318:0x05ab, B:320:0x05af, B:322:0x05b5, B:324:0x05c1, B:325:0x05ec, B:328:0x05f3, B:330:0x05f8, B:332:0x0604, B:334:0x060a, B:336:0x0610, B:337:0x0613, B:339:0x0617, B:341:0x061c, B:344:0x062e, B:347:0x0636, B:348:0x0639, B:350:0x063f, B:352:0x0647, B:357:0x0666, B:359:0x066b, B:362:0x0679, B:364:0x067f, B:366:0x068f, B:368:0x0695, B:370:0x069e, B:371:0x06a7, B:372:0x06b7, B:373:0x06ba, B:317:0x05a8, B:284:0x04bf, B:286:0x04c3, B:294:0x051e, B:296:0x0522, B:299:0x053f, B:303:0x054d, B:305:0x0581, B:306:0x0585, B:302:0x0546, B:298:0x0529, B:288:0x04c9, B:291:0x04da, B:293:0x050d, B:268:0x0471, B:270:0x047b, B:272:0x0483, B:275:0x0492, B:277:0x0496, B:279:0x04a3, B:465:0x082e, B:469:0x0836, B:471:0x083c, B:472:0x0843, B:474:0x0848, B:475:0x084d, B:476:0x0851, B:478:0x0855, B:480:0x0859, B:484:0x0865, B:486:0x0874, B:487:0x0880), top: B:511:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05af A[Catch: IOException -> 0x0890, sh2 -> 0x0895, RuntimeException -> 0x089a, LOOP:9: B:320:0x05af->B:324:0x05c1, LOOP_START, TryCatch #8 {RuntimeException -> 0x089a, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:127:0x01be, B:120:0x0194, B:121:0x0196, B:123:0x019a, B:124:0x019e, B:126:0x01a8, B:129:0x01ca, B:131:0x01d2, B:134:0x01d9, B:136:0x01dd, B:138:0x01e5, B:141:0x01ec, B:143:0x01ff, B:144:0x020d, B:146:0x0211, B:148:0x0221, B:150:0x0225, B:152:0x0233, B:153:0x0238, B:161:0x027f, B:163:0x0283, B:166:0x028a, B:168:0x0294, B:171:0x029f, B:172:0x02c7, B:174:0x02cb, B:178:0x02d8, B:179:0x02db, B:180:0x02e8, B:184:0x02f6, B:186:0x02fc, B:187:0x030f, B:189:0x0313, B:191:0x0323, B:193:0x0335, B:197:0x0343, B:199:0x0348, B:200:0x035c, B:201:0x0363, B:164:0x0286, B:154:0x0250, B:156:0x0258, B:158:0x025e, B:159:0x0263, B:203:0x0367, B:204:0x0372, B:211:0x037d, B:212:0x037e, B:214:0x0382, B:216:0x038a, B:218:0x0397, B:217:0x0391, B:220:0x03a3, B:222:0x03ab, B:223:0x03b4, B:225:0x03ba, B:226:0x03d8, B:230:0x03e1, B:236:0x0404, B:240:0x0412, B:241:0x0418, B:249:0x0428, B:253:0x0436, B:256:0x043f, B:260:0x044e, B:261:0x0457, B:262:0x0458, B:264:0x0460, B:374:0x06bd, B:376:0x06c3, B:377:0x06cb, B:379:0x06e6, B:381:0x06f1, B:385:0x06fa, B:387:0x0700, B:393:0x070c, B:398:0x0716, B:400:0x071d, B:401:0x0720, B:403:0x0724, B:405:0x0732, B:406:0x0745, B:410:0x075e, B:412:0x0766, B:414:0x076c, B:447:0x07f6, B:449:0x07fa, B:451:0x07ff, B:452:0x0807, B:454:0x080b, B:458:0x0814, B:463:0x082a, B:456:0x0810, B:459:0x081a, B:461:0x081f, B:462:0x0825, B:415:0x0776, B:417:0x077b, B:420:0x0782, B:422:0x078a, B:426:0x079d, B:436:0x07cf, B:438:0x07d7, B:429:0x07a5, B:430:0x07b3, B:423:0x078f, B:434:0x07c9, B:439:0x07db, B:441:0x07e0, B:446:0x07ec, B:444:0x07e6, B:265:0x0468, B:267:0x046c, B:280:0x04af, B:282:0x04b7, B:307:0x058f, B:309:0x0593, B:312:0x059c, B:314:0x05a0, B:316:0x05a4, B:318:0x05ab, B:320:0x05af, B:322:0x05b5, B:324:0x05c1, B:325:0x05ec, B:328:0x05f3, B:330:0x05f8, B:332:0x0604, B:334:0x060a, B:336:0x0610, B:337:0x0613, B:339:0x0617, B:341:0x061c, B:344:0x062e, B:347:0x0636, B:348:0x0639, B:350:0x063f, B:352:0x0647, B:357:0x0666, B:359:0x066b, B:362:0x0679, B:364:0x067f, B:366:0x068f, B:368:0x0695, B:370:0x069e, B:371:0x06a7, B:372:0x06b7, B:373:0x06ba, B:317:0x05a8, B:284:0x04bf, B:286:0x04c3, B:294:0x051e, B:296:0x0522, B:299:0x053f, B:303:0x054d, B:305:0x0581, B:306:0x0585, B:302:0x0546, B:298:0x0529, B:288:0x04c9, B:291:0x04da, B:293:0x050d, B:268:0x0471, B:270:0x047b, B:272:0x0483, B:275:0x0492, B:277:0x0496, B:279:0x04a3, B:465:0x082e, B:469:0x0836, B:471:0x083c, B:472:0x0843, B:474:0x0848, B:475:0x084d, B:476:0x0851, B:478:0x0855, B:480:0x0859, B:484:0x0865, B:486:0x0874, B:487:0x0880), top: B:511:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06b7 A[Catch: IOException -> 0x0890, sh2 -> 0x0895, RuntimeException -> 0x089a, TryCatch #8 {RuntimeException -> 0x089a, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:127:0x01be, B:120:0x0194, B:121:0x0196, B:123:0x019a, B:124:0x019e, B:126:0x01a8, B:129:0x01ca, B:131:0x01d2, B:134:0x01d9, B:136:0x01dd, B:138:0x01e5, B:141:0x01ec, B:143:0x01ff, B:144:0x020d, B:146:0x0211, B:148:0x0221, B:150:0x0225, B:152:0x0233, B:153:0x0238, B:161:0x027f, B:163:0x0283, B:166:0x028a, B:168:0x0294, B:171:0x029f, B:172:0x02c7, B:174:0x02cb, B:178:0x02d8, B:179:0x02db, B:180:0x02e8, B:184:0x02f6, B:186:0x02fc, B:187:0x030f, B:189:0x0313, B:191:0x0323, B:193:0x0335, B:197:0x0343, B:199:0x0348, B:200:0x035c, B:201:0x0363, B:164:0x0286, B:154:0x0250, B:156:0x0258, B:158:0x025e, B:159:0x0263, B:203:0x0367, B:204:0x0372, B:211:0x037d, B:212:0x037e, B:214:0x0382, B:216:0x038a, B:218:0x0397, B:217:0x0391, B:220:0x03a3, B:222:0x03ab, B:223:0x03b4, B:225:0x03ba, B:226:0x03d8, B:230:0x03e1, B:236:0x0404, B:240:0x0412, B:241:0x0418, B:249:0x0428, B:253:0x0436, B:256:0x043f, B:260:0x044e, B:261:0x0457, B:262:0x0458, B:264:0x0460, B:374:0x06bd, B:376:0x06c3, B:377:0x06cb, B:379:0x06e6, B:381:0x06f1, B:385:0x06fa, B:387:0x0700, B:393:0x070c, B:398:0x0716, B:400:0x071d, B:401:0x0720, B:403:0x0724, B:405:0x0732, B:406:0x0745, B:410:0x075e, B:412:0x0766, B:414:0x076c, B:447:0x07f6, B:449:0x07fa, B:451:0x07ff, B:452:0x0807, B:454:0x080b, B:458:0x0814, B:463:0x082a, B:456:0x0810, B:459:0x081a, B:461:0x081f, B:462:0x0825, B:415:0x0776, B:417:0x077b, B:420:0x0782, B:422:0x078a, B:426:0x079d, B:436:0x07cf, B:438:0x07d7, B:429:0x07a5, B:430:0x07b3, B:423:0x078f, B:434:0x07c9, B:439:0x07db, B:441:0x07e0, B:446:0x07ec, B:444:0x07e6, B:265:0x0468, B:267:0x046c, B:280:0x04af, B:282:0x04b7, B:307:0x058f, B:309:0x0593, B:312:0x059c, B:314:0x05a0, B:316:0x05a4, B:318:0x05ab, B:320:0x05af, B:322:0x05b5, B:324:0x05c1, B:325:0x05ec, B:328:0x05f3, B:330:0x05f8, B:332:0x0604, B:334:0x060a, B:336:0x0610, B:337:0x0613, B:339:0x0617, B:341:0x061c, B:344:0x062e, B:347:0x0636, B:348:0x0639, B:350:0x063f, B:352:0x0647, B:357:0x0666, B:359:0x066b, B:362:0x0679, B:364:0x067f, B:366:0x068f, B:368:0x0695, B:370:0x069e, B:371:0x06a7, B:372:0x06b7, B:373:0x06ba, B:317:0x05a8, B:284:0x04bf, B:286:0x04c3, B:294:0x051e, B:296:0x0522, B:299:0x053f, B:303:0x054d, B:305:0x0581, B:306:0x0585, B:302:0x0546, B:298:0x0529, B:288:0x04c9, B:291:0x04da, B:293:0x050d, B:268:0x0471, B:270:0x047b, B:272:0x0483, B:275:0x0492, B:277:0x0496, B:279:0x04a3, B:465:0x082e, B:469:0x0836, B:471:0x083c, B:472:0x0843, B:474:0x0848, B:475:0x084d, B:476:0x0851, B:478:0x0855, B:480:0x0859, B:484:0x0865, B:486:0x0874, B:487:0x0880), top: B:511:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x07c7  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            Method dump skipped, instructions count: 2292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ai2.handleMessage(android.os.Message):boolean");
    }

    public final void o(ni2 ni2Var, int r4, long j) {
        this.i.obtainMessage(3, new bi2(ni2Var, r4, j)).sendToTarget();
    }

    public final void p(tn2 tn2Var, boolean z) {
        this.i.obtainMessage(0, 1, 0, tn2Var).sendToTarget();
    }

    public final void r(wh2... wh2VarArr) {
        if (this.u) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            this.A++;
            this.i.obtainMessage(11, wh2VarArr).sendToTarget();
        }
    }

    public final synchronized void x(wh2... wh2VarArr) {
        if (this.u) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int r0 = this.A;
        this.A = r0 + 1;
        this.i.obtainMessage(11, wh2VarArr).sendToTarget();
        while (this.B <= r0) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
