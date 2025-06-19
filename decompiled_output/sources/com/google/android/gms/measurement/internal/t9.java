package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import c.a.b.b.g.c.cb;
import c.a.b.b.g.c.d1;
import c.a.b.b.g.c.g1;
import c.a.b.b.g.c.hd;
import c.a.b.b.g.c.md;
import c.a.b.b.g.c.uc;
import c.a.b.b.g.c.wb;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class t9 implements x5 {
    private static volatile t9 A;

    /* renamed from: a, reason: collision with root package name */
    private v4 f6519a;

    /* renamed from: b, reason: collision with root package name */
    private z3 f6520b;

    /* renamed from: c, reason: collision with root package name */
    private d f6521c;
    private h4 d;
    private p9 e;
    private na f;
    private final da g;
    private n7 h;
    private y8 i;
    private final b5 j;
    private boolean k;
    private boolean l;

    @com.google.android.gms.common.util.d0
    private long m;
    private List<Runnable> n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private FileLock t;
    private FileChannel u;
    private List<Long> v;
    private List<Long> w;
    private long x;
    private final Map<String, e> y;
    private final ga z;

    private class a implements f {

        /* renamed from: a, reason: collision with root package name */
        g1.g f6522a;

        /* renamed from: b, reason: collision with root package name */
        List<Long> f6523b;

        /* renamed from: c, reason: collision with root package name */
        List<g1.c> f6524c;
        private long d;

        private a() {
        }

        /* synthetic */ a(t9 t9Var, w9 w9Var) {
            this();
        }

        private static long c(g1.c cVar) {
            return ((cVar.Y() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.f
        public final boolean a(long j, g1.c cVar) {
            com.google.android.gms.common.internal.r.k(cVar);
            if (this.f6524c == null) {
                this.f6524c = new ArrayList();
            }
            if (this.f6523b == null) {
                this.f6523b = new ArrayList();
            }
            if (this.f6524c.size() > 0 && c(this.f6524c.get(0)) != c(cVar)) {
                return false;
            }
            long jB = this.d + cVar.b();
            if (jB >= Math.max(0, u.j.a(null).intValue())) {
                return false;
            }
            this.d = jB;
            this.f6524c.add(cVar);
            this.f6523b.add(Long.valueOf(j));
            return this.f6524c.size() < Math.max(1, u.k.a(null).intValue());
        }

        @Override // com.google.android.gms.measurement.internal.f
        public final void b(g1.g gVar) {
            com.google.android.gms.common.internal.r.k(gVar);
            this.f6522a = gVar;
        }
    }

    private t9(ba baVar) {
        this(baVar, null);
    }

    private t9(ba baVar, b5 b5Var) throws IllegalStateException {
        this.k = false;
        this.z = new aa(this);
        com.google.android.gms.common.internal.r.k(baVar);
        this.j = b5.a(baVar.f6360a, null, null);
        this.x = -1L;
        da daVar = new da(this);
        daVar.r();
        this.g = daVar;
        z3 z3Var = new z3(this);
        z3Var.r();
        this.f6520b = z3Var;
        v4 v4Var = new v4(this);
        v4Var.r();
        this.f6519a = v4Var;
        this.y = new HashMap();
        this.j.x().v(new w9(this, baVar));
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    private final boolean D(int r7, FileChannel fileChannel) throws IOException {
        p0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.j.B().E().a("Bad channel to read from");
            return false;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(r7);
        byteBufferAllocate.flip();
        try {
            fileChannel.truncate(0L);
            if (this.j.b().p(u.t0) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0L);
            }
            fileChannel.write(byteBufferAllocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.j.B().E().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.j.B().E().b("Failed to write to channel", e);
            return false;
        }
    }

    private final boolean E(g1.c.a aVar, g1.c.a aVar2) {
        com.google.android.gms.common.internal.r.a("_e".equals(aVar.Q()));
        e0();
        g1.e eVarY = da.y((g1.c) ((c.a.b.b.g.c.h7) aVar.j()), "_sc");
        String strV = eVarY == null ? null : eVarY.V();
        e0();
        g1.e eVarY2 = da.y((g1.c) ((c.a.b.b.g.c.h7) aVar2.j()), "_pc");
        String strV2 = eVarY2 != null ? eVarY2.V() : null;
        if (strV2 == null || !strV2.equals(strV)) {
            return false;
        }
        O(aVar, aVar2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026d A[Catch: all -> 0x1008, TryCatch #2 {all -> 0x1008, blocks: (B:3:0x000f, B:43:0x00de, B:110:0x0269, B:112:0x026d, B:118:0x027b, B:119:0x02a2, B:122:0x02ba, B:125:0x02e0, B:127:0x0317, B:133:0x032d, B:135:0x0337, B:336:0x0930, B:137:0x0361, B:139:0x0367, B:141:0x037d, B:143:0x038b, B:146:0x03ab, B:148:0x03b1, B:150:0x03c1, B:152:0x03cf, B:154:0x03df, B:155:0x03ee, B:157:0x03f3, B:160:0x0409, B:190:0x046d, B:193:0x0477, B:195:0x0485, B:200:0x04d3, B:196:0x04a4, B:198:0x04b2, B:204:0x04e0, B:207:0x0515, B:208:0x0543, B:210:0x0577, B:212:0x057d, B:234:0x064d, B:235:0x0659, B:238:0x0663, B:244:0x0686, B:241:0x0675, B:247:0x068c, B:249:0x0698, B:251:0x06a4, B:267:0x06f3, B:270:0x0710, B:272:0x0724, B:274:0x072e, B:277:0x0741, B:279:0x0755, B:281:0x0763, B:325:0x08ba, B:327:0x08c4, B:329:0x08ca, B:330:0x08e0, B:331:0x08e4, B:333:0x08f7, B:334:0x090e, B:335:0x0916, B:286:0x0781, B:288:0x078f, B:291:0x07a4, B:293:0x07b8, B:295:0x07c6, B:298:0x07d8, B:300:0x07f0, B:302:0x07fc, B:305:0x080f, B:307:0x0823, B:309:0x086e, B:311:0x0875, B:313:0x087b, B:315:0x0885, B:317:0x088c, B:319:0x0892, B:321:0x089c, B:322:0x08ac, B:255:0x06c5, B:259:0x06d9, B:261:0x06df, B:264:0x06ea, B:215:0x0589, B:217:0x05be, B:218:0x05db, B:220:0x05e1, B:222:0x05ef, B:226:0x0603, B:223:0x05f8, B:229:0x060a, B:231:0x0611, B:232:0x0630, B:167:0x042b, B:170:0x0435, B:173:0x043f, B:341:0x094c, B:343:0x095a, B:345:0x0963, B:356:0x0995, B:346:0x096b, B:348:0x0974, B:350:0x097a, B:353:0x0986, B:355:0x0990, B:359:0x099c, B:360:0x09a8, B:362:0x09ae, B:368:0x09c7, B:369:0x09d2, B:374:0x09df, B:378:0x0a06, B:380:0x0a25, B:382:0x0a33, B:384:0x0a39, B:386:0x0a43, B:387:0x0a75, B:389:0x0a7b, B:391:0x0a89, B:395:0x0a94, B:392:0x0a8e, B:396:0x0a97, B:397:0x0aa6, B:399:0x0aac, B:401:0x0abc, B:402:0x0ac3, B:404:0x0acf, B:405:0x0ad6, B:406:0x0ad9, B:408:0x0adf, B:410:0x0af1, B:411:0x0af4, B:419:0x0b64, B:421:0x0b7f, B:422:0x0b90, B:424:0x0b94, B:426:0x0ba0, B:427:0x0ba8, B:429:0x0bac, B:431:0x0bb4, B:432:0x0bc2, B:433:0x0bcd, B:439:0x0c0e, B:440:0x0c16, B:442:0x0c1c, B:444:0x0c2e, B:446:0x0c32, B:460:0x0c68, B:463:0x0c7e, B:448:0x0c40, B:450:0x0c44, B:452:0x0c4e, B:454:0x0c52, B:375:0x09e4, B:377:0x09ea, B:69:0x01c2, B:93:0x0238), top: B:591:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027b A[Catch: all -> 0x1008, TryCatch #2 {all -> 0x1008, blocks: (B:3:0x000f, B:43:0x00de, B:110:0x0269, B:112:0x026d, B:118:0x027b, B:119:0x02a2, B:122:0x02ba, B:125:0x02e0, B:127:0x0317, B:133:0x032d, B:135:0x0337, B:336:0x0930, B:137:0x0361, B:139:0x0367, B:141:0x037d, B:143:0x038b, B:146:0x03ab, B:148:0x03b1, B:150:0x03c1, B:152:0x03cf, B:154:0x03df, B:155:0x03ee, B:157:0x03f3, B:160:0x0409, B:190:0x046d, B:193:0x0477, B:195:0x0485, B:200:0x04d3, B:196:0x04a4, B:198:0x04b2, B:204:0x04e0, B:207:0x0515, B:208:0x0543, B:210:0x0577, B:212:0x057d, B:234:0x064d, B:235:0x0659, B:238:0x0663, B:244:0x0686, B:241:0x0675, B:247:0x068c, B:249:0x0698, B:251:0x06a4, B:267:0x06f3, B:270:0x0710, B:272:0x0724, B:274:0x072e, B:277:0x0741, B:279:0x0755, B:281:0x0763, B:325:0x08ba, B:327:0x08c4, B:329:0x08ca, B:330:0x08e0, B:331:0x08e4, B:333:0x08f7, B:334:0x090e, B:335:0x0916, B:286:0x0781, B:288:0x078f, B:291:0x07a4, B:293:0x07b8, B:295:0x07c6, B:298:0x07d8, B:300:0x07f0, B:302:0x07fc, B:305:0x080f, B:307:0x0823, B:309:0x086e, B:311:0x0875, B:313:0x087b, B:315:0x0885, B:317:0x088c, B:319:0x0892, B:321:0x089c, B:322:0x08ac, B:255:0x06c5, B:259:0x06d9, B:261:0x06df, B:264:0x06ea, B:215:0x0589, B:217:0x05be, B:218:0x05db, B:220:0x05e1, B:222:0x05ef, B:226:0x0603, B:223:0x05f8, B:229:0x060a, B:231:0x0611, B:232:0x0630, B:167:0x042b, B:170:0x0435, B:173:0x043f, B:341:0x094c, B:343:0x095a, B:345:0x0963, B:356:0x0995, B:346:0x096b, B:348:0x0974, B:350:0x097a, B:353:0x0986, B:355:0x0990, B:359:0x099c, B:360:0x09a8, B:362:0x09ae, B:368:0x09c7, B:369:0x09d2, B:374:0x09df, B:378:0x0a06, B:380:0x0a25, B:382:0x0a33, B:384:0x0a39, B:386:0x0a43, B:387:0x0a75, B:389:0x0a7b, B:391:0x0a89, B:395:0x0a94, B:392:0x0a8e, B:396:0x0a97, B:397:0x0aa6, B:399:0x0aac, B:401:0x0abc, B:402:0x0ac3, B:404:0x0acf, B:405:0x0ad6, B:406:0x0ad9, B:408:0x0adf, B:410:0x0af1, B:411:0x0af4, B:419:0x0b64, B:421:0x0b7f, B:422:0x0b90, B:424:0x0b94, B:426:0x0ba0, B:427:0x0ba8, B:429:0x0bac, B:431:0x0bb4, B:432:0x0bc2, B:433:0x0bcd, B:439:0x0c0e, B:440:0x0c16, B:442:0x0c1c, B:444:0x0c2e, B:446:0x0c32, B:460:0x0c68, B:463:0x0c7e, B:448:0x0c40, B:450:0x0c44, B:452:0x0c4e, B:454:0x0c52, B:375:0x09e4, B:377:0x09ea, B:69:0x01c2, B:93:0x0238), top: B:591:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x064d A[Catch: all -> 0x1008, TryCatch #2 {all -> 0x1008, blocks: (B:3:0x000f, B:43:0x00de, B:110:0x0269, B:112:0x026d, B:118:0x027b, B:119:0x02a2, B:122:0x02ba, B:125:0x02e0, B:127:0x0317, B:133:0x032d, B:135:0x0337, B:336:0x0930, B:137:0x0361, B:139:0x0367, B:141:0x037d, B:143:0x038b, B:146:0x03ab, B:148:0x03b1, B:150:0x03c1, B:152:0x03cf, B:154:0x03df, B:155:0x03ee, B:157:0x03f3, B:160:0x0409, B:190:0x046d, B:193:0x0477, B:195:0x0485, B:200:0x04d3, B:196:0x04a4, B:198:0x04b2, B:204:0x04e0, B:207:0x0515, B:208:0x0543, B:210:0x0577, B:212:0x057d, B:234:0x064d, B:235:0x0659, B:238:0x0663, B:244:0x0686, B:241:0x0675, B:247:0x068c, B:249:0x0698, B:251:0x06a4, B:267:0x06f3, B:270:0x0710, B:272:0x0724, B:274:0x072e, B:277:0x0741, B:279:0x0755, B:281:0x0763, B:325:0x08ba, B:327:0x08c4, B:329:0x08ca, B:330:0x08e0, B:331:0x08e4, B:333:0x08f7, B:334:0x090e, B:335:0x0916, B:286:0x0781, B:288:0x078f, B:291:0x07a4, B:293:0x07b8, B:295:0x07c6, B:298:0x07d8, B:300:0x07f0, B:302:0x07fc, B:305:0x080f, B:307:0x0823, B:309:0x086e, B:311:0x0875, B:313:0x087b, B:315:0x0885, B:317:0x088c, B:319:0x0892, B:321:0x089c, B:322:0x08ac, B:255:0x06c5, B:259:0x06d9, B:261:0x06df, B:264:0x06ea, B:215:0x0589, B:217:0x05be, B:218:0x05db, B:220:0x05e1, B:222:0x05ef, B:226:0x0603, B:223:0x05f8, B:229:0x060a, B:231:0x0611, B:232:0x0630, B:167:0x042b, B:170:0x0435, B:173:0x043f, B:341:0x094c, B:343:0x095a, B:345:0x0963, B:356:0x0995, B:346:0x096b, B:348:0x0974, B:350:0x097a, B:353:0x0986, B:355:0x0990, B:359:0x099c, B:360:0x09a8, B:362:0x09ae, B:368:0x09c7, B:369:0x09d2, B:374:0x09df, B:378:0x0a06, B:380:0x0a25, B:382:0x0a33, B:384:0x0a39, B:386:0x0a43, B:387:0x0a75, B:389:0x0a7b, B:391:0x0a89, B:395:0x0a94, B:392:0x0a8e, B:396:0x0a97, B:397:0x0aa6, B:399:0x0aac, B:401:0x0abc, B:402:0x0ac3, B:404:0x0acf, B:405:0x0ad6, B:406:0x0ad9, B:408:0x0adf, B:410:0x0af1, B:411:0x0af4, B:419:0x0b64, B:421:0x0b7f, B:422:0x0b90, B:424:0x0b94, B:426:0x0ba0, B:427:0x0ba8, B:429:0x0bac, B:431:0x0bb4, B:432:0x0bc2, B:433:0x0bcd, B:439:0x0c0e, B:440:0x0c16, B:442:0x0c1c, B:444:0x0c2e, B:446:0x0c32, B:460:0x0c68, B:463:0x0c7e, B:448:0x0c40, B:450:0x0c44, B:452:0x0c4e, B:454:0x0c52, B:375:0x09e4, B:377:0x09ea, B:69:0x01c2, B:93:0x0238), top: B:591:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0724 A[Catch: all -> 0x1008, TryCatch #2 {all -> 0x1008, blocks: (B:3:0x000f, B:43:0x00de, B:110:0x0269, B:112:0x026d, B:118:0x027b, B:119:0x02a2, B:122:0x02ba, B:125:0x02e0, B:127:0x0317, B:133:0x032d, B:135:0x0337, B:336:0x0930, B:137:0x0361, B:139:0x0367, B:141:0x037d, B:143:0x038b, B:146:0x03ab, B:148:0x03b1, B:150:0x03c1, B:152:0x03cf, B:154:0x03df, B:155:0x03ee, B:157:0x03f3, B:160:0x0409, B:190:0x046d, B:193:0x0477, B:195:0x0485, B:200:0x04d3, B:196:0x04a4, B:198:0x04b2, B:204:0x04e0, B:207:0x0515, B:208:0x0543, B:210:0x0577, B:212:0x057d, B:234:0x064d, B:235:0x0659, B:238:0x0663, B:244:0x0686, B:241:0x0675, B:247:0x068c, B:249:0x0698, B:251:0x06a4, B:267:0x06f3, B:270:0x0710, B:272:0x0724, B:274:0x072e, B:277:0x0741, B:279:0x0755, B:281:0x0763, B:325:0x08ba, B:327:0x08c4, B:329:0x08ca, B:330:0x08e0, B:331:0x08e4, B:333:0x08f7, B:334:0x090e, B:335:0x0916, B:286:0x0781, B:288:0x078f, B:291:0x07a4, B:293:0x07b8, B:295:0x07c6, B:298:0x07d8, B:300:0x07f0, B:302:0x07fc, B:305:0x080f, B:307:0x0823, B:309:0x086e, B:311:0x0875, B:313:0x087b, B:315:0x0885, B:317:0x088c, B:319:0x0892, B:321:0x089c, B:322:0x08ac, B:255:0x06c5, B:259:0x06d9, B:261:0x06df, B:264:0x06ea, B:215:0x0589, B:217:0x05be, B:218:0x05db, B:220:0x05e1, B:222:0x05ef, B:226:0x0603, B:223:0x05f8, B:229:0x060a, B:231:0x0611, B:232:0x0630, B:167:0x042b, B:170:0x0435, B:173:0x043f, B:341:0x094c, B:343:0x095a, B:345:0x0963, B:356:0x0995, B:346:0x096b, B:348:0x0974, B:350:0x097a, B:353:0x0986, B:355:0x0990, B:359:0x099c, B:360:0x09a8, B:362:0x09ae, B:368:0x09c7, B:369:0x09d2, B:374:0x09df, B:378:0x0a06, B:380:0x0a25, B:382:0x0a33, B:384:0x0a39, B:386:0x0a43, B:387:0x0a75, B:389:0x0a7b, B:391:0x0a89, B:395:0x0a94, B:392:0x0a8e, B:396:0x0a97, B:397:0x0aa6, B:399:0x0aac, B:401:0x0abc, B:402:0x0ac3, B:404:0x0acf, B:405:0x0ad6, B:406:0x0ad9, B:408:0x0adf, B:410:0x0af1, B:411:0x0af4, B:419:0x0b64, B:421:0x0b7f, B:422:0x0b90, B:424:0x0b94, B:426:0x0ba0, B:427:0x0ba8, B:429:0x0bac, B:431:0x0bb4, B:432:0x0bc2, B:433:0x0bcd, B:439:0x0c0e, B:440:0x0c16, B:442:0x0c1c, B:444:0x0c2e, B:446:0x0c32, B:460:0x0c68, B:463:0x0c7e, B:448:0x0c40, B:450:0x0c44, B:452:0x0c4e, B:454:0x0c52, B:375:0x09e4, B:377:0x09ea, B:69:0x01c2, B:93:0x0238), top: B:591:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x08ca A[Catch: all -> 0x1008, TryCatch #2 {all -> 0x1008, blocks: (B:3:0x000f, B:43:0x00de, B:110:0x0269, B:112:0x026d, B:118:0x027b, B:119:0x02a2, B:122:0x02ba, B:125:0x02e0, B:127:0x0317, B:133:0x032d, B:135:0x0337, B:336:0x0930, B:137:0x0361, B:139:0x0367, B:141:0x037d, B:143:0x038b, B:146:0x03ab, B:148:0x03b1, B:150:0x03c1, B:152:0x03cf, B:154:0x03df, B:155:0x03ee, B:157:0x03f3, B:160:0x0409, B:190:0x046d, B:193:0x0477, B:195:0x0485, B:200:0x04d3, B:196:0x04a4, B:198:0x04b2, B:204:0x04e0, B:207:0x0515, B:208:0x0543, B:210:0x0577, B:212:0x057d, B:234:0x064d, B:235:0x0659, B:238:0x0663, B:244:0x0686, B:241:0x0675, B:247:0x068c, B:249:0x0698, B:251:0x06a4, B:267:0x06f3, B:270:0x0710, B:272:0x0724, B:274:0x072e, B:277:0x0741, B:279:0x0755, B:281:0x0763, B:325:0x08ba, B:327:0x08c4, B:329:0x08ca, B:330:0x08e0, B:331:0x08e4, B:333:0x08f7, B:334:0x090e, B:335:0x0916, B:286:0x0781, B:288:0x078f, B:291:0x07a4, B:293:0x07b8, B:295:0x07c6, B:298:0x07d8, B:300:0x07f0, B:302:0x07fc, B:305:0x080f, B:307:0x0823, B:309:0x086e, B:311:0x0875, B:313:0x087b, B:315:0x0885, B:317:0x088c, B:319:0x0892, B:321:0x089c, B:322:0x08ac, B:255:0x06c5, B:259:0x06d9, B:261:0x06df, B:264:0x06ea, B:215:0x0589, B:217:0x05be, B:218:0x05db, B:220:0x05e1, B:222:0x05ef, B:226:0x0603, B:223:0x05f8, B:229:0x060a, B:231:0x0611, B:232:0x0630, B:167:0x042b, B:170:0x0435, B:173:0x043f, B:341:0x094c, B:343:0x095a, B:345:0x0963, B:356:0x0995, B:346:0x096b, B:348:0x0974, B:350:0x097a, B:353:0x0986, B:355:0x0990, B:359:0x099c, B:360:0x09a8, B:362:0x09ae, B:368:0x09c7, B:369:0x09d2, B:374:0x09df, B:378:0x0a06, B:380:0x0a25, B:382:0x0a33, B:384:0x0a39, B:386:0x0a43, B:387:0x0a75, B:389:0x0a7b, B:391:0x0a89, B:395:0x0a94, B:392:0x0a8e, B:396:0x0a97, B:397:0x0aa6, B:399:0x0aac, B:401:0x0abc, B:402:0x0ac3, B:404:0x0acf, B:405:0x0ad6, B:406:0x0ad9, B:408:0x0adf, B:410:0x0af1, B:411:0x0af4, B:419:0x0b64, B:421:0x0b7f, B:422:0x0b90, B:424:0x0b94, B:426:0x0ba0, B:427:0x0ba8, B:429:0x0bac, B:431:0x0bb4, B:432:0x0bc2, B:433:0x0bcd, B:439:0x0c0e, B:440:0x0c16, B:442:0x0c1c, B:444:0x0c2e, B:446:0x0c32, B:460:0x0c68, B:463:0x0c7e, B:448:0x0c40, B:450:0x0c44, B:452:0x0c4e, B:454:0x0c52, B:375:0x09e4, B:377:0x09ea, B:69:0x01c2, B:93:0x0238), top: B:591:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x08e4 A[Catch: all -> 0x1008, TryCatch #2 {all -> 0x1008, blocks: (B:3:0x000f, B:43:0x00de, B:110:0x0269, B:112:0x026d, B:118:0x027b, B:119:0x02a2, B:122:0x02ba, B:125:0x02e0, B:127:0x0317, B:133:0x032d, B:135:0x0337, B:336:0x0930, B:137:0x0361, B:139:0x0367, B:141:0x037d, B:143:0x038b, B:146:0x03ab, B:148:0x03b1, B:150:0x03c1, B:152:0x03cf, B:154:0x03df, B:155:0x03ee, B:157:0x03f3, B:160:0x0409, B:190:0x046d, B:193:0x0477, B:195:0x0485, B:200:0x04d3, B:196:0x04a4, B:198:0x04b2, B:204:0x04e0, B:207:0x0515, B:208:0x0543, B:210:0x0577, B:212:0x057d, B:234:0x064d, B:235:0x0659, B:238:0x0663, B:244:0x0686, B:241:0x0675, B:247:0x068c, B:249:0x0698, B:251:0x06a4, B:267:0x06f3, B:270:0x0710, B:272:0x0724, B:274:0x072e, B:277:0x0741, B:279:0x0755, B:281:0x0763, B:325:0x08ba, B:327:0x08c4, B:329:0x08ca, B:330:0x08e0, B:331:0x08e4, B:333:0x08f7, B:334:0x090e, B:335:0x0916, B:286:0x0781, B:288:0x078f, B:291:0x07a4, B:293:0x07b8, B:295:0x07c6, B:298:0x07d8, B:300:0x07f0, B:302:0x07fc, B:305:0x080f, B:307:0x0823, B:309:0x086e, B:311:0x0875, B:313:0x087b, B:315:0x0885, B:317:0x088c, B:319:0x0892, B:321:0x089c, B:322:0x08ac, B:255:0x06c5, B:259:0x06d9, B:261:0x06df, B:264:0x06ea, B:215:0x0589, B:217:0x05be, B:218:0x05db, B:220:0x05e1, B:222:0x05ef, B:226:0x0603, B:223:0x05f8, B:229:0x060a, B:231:0x0611, B:232:0x0630, B:167:0x042b, B:170:0x0435, B:173:0x043f, B:341:0x094c, B:343:0x095a, B:345:0x0963, B:356:0x0995, B:346:0x096b, B:348:0x0974, B:350:0x097a, B:353:0x0986, B:355:0x0990, B:359:0x099c, B:360:0x09a8, B:362:0x09ae, B:368:0x09c7, B:369:0x09d2, B:374:0x09df, B:378:0x0a06, B:380:0x0a25, B:382:0x0a33, B:384:0x0a39, B:386:0x0a43, B:387:0x0a75, B:389:0x0a7b, B:391:0x0a89, B:395:0x0a94, B:392:0x0a8e, B:396:0x0a97, B:397:0x0aa6, B:399:0x0aac, B:401:0x0abc, B:402:0x0ac3, B:404:0x0acf, B:405:0x0ad6, B:406:0x0ad9, B:408:0x0adf, B:410:0x0af1, B:411:0x0af4, B:419:0x0b64, B:421:0x0b7f, B:422:0x0b90, B:424:0x0b94, B:426:0x0ba0, B:427:0x0ba8, B:429:0x0bac, B:431:0x0bb4, B:432:0x0bc2, B:433:0x0bcd, B:439:0x0c0e, B:440:0x0c16, B:442:0x0c1c, B:444:0x0c2e, B:446:0x0c32, B:460:0x0c68, B:463:0x0c7e, B:448:0x0c40, B:450:0x0c44, B:452:0x0c4e, B:454:0x0c52, B:375:0x09e4, B:377:0x09ea, B:69:0x01c2, B:93:0x0238), top: B:591:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x096b A[Catch: all -> 0x1008, TryCatch #2 {all -> 0x1008, blocks: (B:3:0x000f, B:43:0x00de, B:110:0x0269, B:112:0x026d, B:118:0x027b, B:119:0x02a2, B:122:0x02ba, B:125:0x02e0, B:127:0x0317, B:133:0x032d, B:135:0x0337, B:336:0x0930, B:137:0x0361, B:139:0x0367, B:141:0x037d, B:143:0x038b, B:146:0x03ab, B:148:0x03b1, B:150:0x03c1, B:152:0x03cf, B:154:0x03df, B:155:0x03ee, B:157:0x03f3, B:160:0x0409, B:190:0x046d, B:193:0x0477, B:195:0x0485, B:200:0x04d3, B:196:0x04a4, B:198:0x04b2, B:204:0x04e0, B:207:0x0515, B:208:0x0543, B:210:0x0577, B:212:0x057d, B:234:0x064d, B:235:0x0659, B:238:0x0663, B:244:0x0686, B:241:0x0675, B:247:0x068c, B:249:0x0698, B:251:0x06a4, B:267:0x06f3, B:270:0x0710, B:272:0x0724, B:274:0x072e, B:277:0x0741, B:279:0x0755, B:281:0x0763, B:325:0x08ba, B:327:0x08c4, B:329:0x08ca, B:330:0x08e0, B:331:0x08e4, B:333:0x08f7, B:334:0x090e, B:335:0x0916, B:286:0x0781, B:288:0x078f, B:291:0x07a4, B:293:0x07b8, B:295:0x07c6, B:298:0x07d8, B:300:0x07f0, B:302:0x07fc, B:305:0x080f, B:307:0x0823, B:309:0x086e, B:311:0x0875, B:313:0x087b, B:315:0x0885, B:317:0x088c, B:319:0x0892, B:321:0x089c, B:322:0x08ac, B:255:0x06c5, B:259:0x06d9, B:261:0x06df, B:264:0x06ea, B:215:0x0589, B:217:0x05be, B:218:0x05db, B:220:0x05e1, B:222:0x05ef, B:226:0x0603, B:223:0x05f8, B:229:0x060a, B:231:0x0611, B:232:0x0630, B:167:0x042b, B:170:0x0435, B:173:0x043f, B:341:0x094c, B:343:0x095a, B:345:0x0963, B:356:0x0995, B:346:0x096b, B:348:0x0974, B:350:0x097a, B:353:0x0986, B:355:0x0990, B:359:0x099c, B:360:0x09a8, B:362:0x09ae, B:368:0x09c7, B:369:0x09d2, B:374:0x09df, B:378:0x0a06, B:380:0x0a25, B:382:0x0a33, B:384:0x0a39, B:386:0x0a43, B:387:0x0a75, B:389:0x0a7b, B:391:0x0a89, B:395:0x0a94, B:392:0x0a8e, B:396:0x0a97, B:397:0x0aa6, B:399:0x0aac, B:401:0x0abc, B:402:0x0ac3, B:404:0x0acf, B:405:0x0ad6, B:406:0x0ad9, B:408:0x0adf, B:410:0x0af1, B:411:0x0af4, B:419:0x0b64, B:421:0x0b7f, B:422:0x0b90, B:424:0x0b94, B:426:0x0ba0, B:427:0x0ba8, B:429:0x0bac, B:431:0x0bb4, B:432:0x0bc2, B:433:0x0bcd, B:439:0x0c0e, B:440:0x0c16, B:442:0x0c1c, B:444:0x0c2e, B:446:0x0c32, B:460:0x0c68, B:463:0x0c7e, B:448:0x0c40, B:450:0x0c44, B:452:0x0c4e, B:454:0x0c52, B:375:0x09e4, B:377:0x09ea, B:69:0x01c2, B:93:0x0238), top: B:591:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0c68 A[Catch: all -> 0x1008, TryCatch #2 {all -> 0x1008, blocks: (B:3:0x000f, B:43:0x00de, B:110:0x0269, B:112:0x026d, B:118:0x027b, B:119:0x02a2, B:122:0x02ba, B:125:0x02e0, B:127:0x0317, B:133:0x032d, B:135:0x0337, B:336:0x0930, B:137:0x0361, B:139:0x0367, B:141:0x037d, B:143:0x038b, B:146:0x03ab, B:148:0x03b1, B:150:0x03c1, B:152:0x03cf, B:154:0x03df, B:155:0x03ee, B:157:0x03f3, B:160:0x0409, B:190:0x046d, B:193:0x0477, B:195:0x0485, B:200:0x04d3, B:196:0x04a4, B:198:0x04b2, B:204:0x04e0, B:207:0x0515, B:208:0x0543, B:210:0x0577, B:212:0x057d, B:234:0x064d, B:235:0x0659, B:238:0x0663, B:244:0x0686, B:241:0x0675, B:247:0x068c, B:249:0x0698, B:251:0x06a4, B:267:0x06f3, B:270:0x0710, B:272:0x0724, B:274:0x072e, B:277:0x0741, B:279:0x0755, B:281:0x0763, B:325:0x08ba, B:327:0x08c4, B:329:0x08ca, B:330:0x08e0, B:331:0x08e4, B:333:0x08f7, B:334:0x090e, B:335:0x0916, B:286:0x0781, B:288:0x078f, B:291:0x07a4, B:293:0x07b8, B:295:0x07c6, B:298:0x07d8, B:300:0x07f0, B:302:0x07fc, B:305:0x080f, B:307:0x0823, B:309:0x086e, B:311:0x0875, B:313:0x087b, B:315:0x0885, B:317:0x088c, B:319:0x0892, B:321:0x089c, B:322:0x08ac, B:255:0x06c5, B:259:0x06d9, B:261:0x06df, B:264:0x06ea, B:215:0x0589, B:217:0x05be, B:218:0x05db, B:220:0x05e1, B:222:0x05ef, B:226:0x0603, B:223:0x05f8, B:229:0x060a, B:231:0x0611, B:232:0x0630, B:167:0x042b, B:170:0x0435, B:173:0x043f, B:341:0x094c, B:343:0x095a, B:345:0x0963, B:356:0x0995, B:346:0x096b, B:348:0x0974, B:350:0x097a, B:353:0x0986, B:355:0x0990, B:359:0x099c, B:360:0x09a8, B:362:0x09ae, B:368:0x09c7, B:369:0x09d2, B:374:0x09df, B:378:0x0a06, B:380:0x0a25, B:382:0x0a33, B:384:0x0a39, B:386:0x0a43, B:387:0x0a75, B:389:0x0a7b, B:391:0x0a89, B:395:0x0a94, B:392:0x0a8e, B:396:0x0a97, B:397:0x0aa6, B:399:0x0aac, B:401:0x0abc, B:402:0x0ac3, B:404:0x0acf, B:405:0x0ad6, B:406:0x0ad9, B:408:0x0adf, B:410:0x0af1, B:411:0x0af4, B:419:0x0b64, B:421:0x0b7f, B:422:0x0b90, B:424:0x0b94, B:426:0x0ba0, B:427:0x0ba8, B:429:0x0bac, B:431:0x0bb4, B:432:0x0bc2, B:433:0x0bcd, B:439:0x0c0e, B:440:0x0c16, B:442:0x0c1c, B:444:0x0c2e, B:446:0x0c32, B:460:0x0c68, B:463:0x0c7e, B:448:0x0c40, B:450:0x0c44, B:452:0x0c4e, B:454:0x0c52, B:375:0x09e4, B:377:0x09ea, B:69:0x01c2, B:93:0x0238), top: B:591:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0c7e A[Catch: all -> 0x1008, TRY_LEAVE, TryCatch #2 {all -> 0x1008, blocks: (B:3:0x000f, B:43:0x00de, B:110:0x0269, B:112:0x026d, B:118:0x027b, B:119:0x02a2, B:122:0x02ba, B:125:0x02e0, B:127:0x0317, B:133:0x032d, B:135:0x0337, B:336:0x0930, B:137:0x0361, B:139:0x0367, B:141:0x037d, B:143:0x038b, B:146:0x03ab, B:148:0x03b1, B:150:0x03c1, B:152:0x03cf, B:154:0x03df, B:155:0x03ee, B:157:0x03f3, B:160:0x0409, B:190:0x046d, B:193:0x0477, B:195:0x0485, B:200:0x04d3, B:196:0x04a4, B:198:0x04b2, B:204:0x04e0, B:207:0x0515, B:208:0x0543, B:210:0x0577, B:212:0x057d, B:234:0x064d, B:235:0x0659, B:238:0x0663, B:244:0x0686, B:241:0x0675, B:247:0x068c, B:249:0x0698, B:251:0x06a4, B:267:0x06f3, B:270:0x0710, B:272:0x0724, B:274:0x072e, B:277:0x0741, B:279:0x0755, B:281:0x0763, B:325:0x08ba, B:327:0x08c4, B:329:0x08ca, B:330:0x08e0, B:331:0x08e4, B:333:0x08f7, B:334:0x090e, B:335:0x0916, B:286:0x0781, B:288:0x078f, B:291:0x07a4, B:293:0x07b8, B:295:0x07c6, B:298:0x07d8, B:300:0x07f0, B:302:0x07fc, B:305:0x080f, B:307:0x0823, B:309:0x086e, B:311:0x0875, B:313:0x087b, B:315:0x0885, B:317:0x088c, B:319:0x0892, B:321:0x089c, B:322:0x08ac, B:255:0x06c5, B:259:0x06d9, B:261:0x06df, B:264:0x06ea, B:215:0x0589, B:217:0x05be, B:218:0x05db, B:220:0x05e1, B:222:0x05ef, B:226:0x0603, B:223:0x05f8, B:229:0x060a, B:231:0x0611, B:232:0x0630, B:167:0x042b, B:170:0x0435, B:173:0x043f, B:341:0x094c, B:343:0x095a, B:345:0x0963, B:356:0x0995, B:346:0x096b, B:348:0x0974, B:350:0x097a, B:353:0x0986, B:355:0x0990, B:359:0x099c, B:360:0x09a8, B:362:0x09ae, B:368:0x09c7, B:369:0x09d2, B:374:0x09df, B:378:0x0a06, B:380:0x0a25, B:382:0x0a33, B:384:0x0a39, B:386:0x0a43, B:387:0x0a75, B:389:0x0a7b, B:391:0x0a89, B:395:0x0a94, B:392:0x0a8e, B:396:0x0a97, B:397:0x0aa6, B:399:0x0aac, B:401:0x0abc, B:402:0x0ac3, B:404:0x0acf, B:405:0x0ad6, B:406:0x0ad9, B:408:0x0adf, B:410:0x0af1, B:411:0x0af4, B:419:0x0b64, B:421:0x0b7f, B:422:0x0b90, B:424:0x0b94, B:426:0x0ba0, B:427:0x0ba8, B:429:0x0bac, B:431:0x0bb4, B:432:0x0bc2, B:433:0x0bcd, B:439:0x0c0e, B:440:0x0c16, B:442:0x0c1c, B:444:0x0c2e, B:446:0x0c32, B:460:0x0c68, B:463:0x0c7e, B:448:0x0c40, B:450:0x0c44, B:452:0x0c4e, B:454:0x0c52, B:375:0x09e4, B:377:0x09ea, B:69:0x01c2, B:93:0x0238), top: B:591:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0ca2 A[Catch: all -> 0x0fe7, TRY_ENTER, TryCatch #1 {all -> 0x0fe7, blocks: (B:413:0x0b31, B:414:0x0b46, B:416:0x0b4c, B:507:0x0e1a, B:435:0x0bd8, B:465:0x0ca2, B:467:0x0cae, B:469:0x0cc2, B:470:0x0d00, B:474:0x0d18, B:476:0x0d1f, B:478:0x0d30, B:480:0x0d34, B:482:0x0d38, B:484:0x0d3c, B:485:0x0d48, B:486:0x0d4d, B:488:0x0d53, B:490:0x0d72, B:491:0x0d7b, B:506:0x0e17, B:492:0x0d8f, B:494:0x0d96, B:498:0x0dba, B:500:0x0de4, B:501:0x0def, B:502:0x0dfd, B:503:0x0e01, B:505:0x0e0b, B:495:0x0da1, B:508:0x0e24, B:510:0x0e31, B:511:0x0e38, B:512:0x0e40, B:514:0x0e46, B:517:0x0e5e), top: B:589:0x0b31 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115 A[Catch: SQLiteException -> 0x023f, all -> 0x0ffc, TryCatch #3 {SQLiteException -> 0x023f, blocks: (B:20:0x0086, B:47:0x00ed, B:49:0x0115, B:52:0x0129, B:53:0x012d, B:54:0x013f, B:56:0x0145), top: B:593:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0feb  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0238 A[Catch: all -> 0x1008, PHI: r6 r25
  0x0238: PHI (r6v5 android.database.Cursor) = (r6v6 android.database.Cursor), (r6v136 android.database.Cursor) binds: [B:108:0x0266, B:92:0x0236] A[DONT_GENERATE, DONT_INLINE]
  0x0238: PHI (r25v2 java.lang.String) = (r25v3 java.lang.String), (r25v10 java.lang.String) binds: [B:108:0x0266, B:92:0x0236] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x1008, blocks: (B:3:0x000f, B:43:0x00de, B:110:0x0269, B:112:0x026d, B:118:0x027b, B:119:0x02a2, B:122:0x02ba, B:125:0x02e0, B:127:0x0317, B:133:0x032d, B:135:0x0337, B:336:0x0930, B:137:0x0361, B:139:0x0367, B:141:0x037d, B:143:0x038b, B:146:0x03ab, B:148:0x03b1, B:150:0x03c1, B:152:0x03cf, B:154:0x03df, B:155:0x03ee, B:157:0x03f3, B:160:0x0409, B:190:0x046d, B:193:0x0477, B:195:0x0485, B:200:0x04d3, B:196:0x04a4, B:198:0x04b2, B:204:0x04e0, B:207:0x0515, B:208:0x0543, B:210:0x0577, B:212:0x057d, B:234:0x064d, B:235:0x0659, B:238:0x0663, B:244:0x0686, B:241:0x0675, B:247:0x068c, B:249:0x0698, B:251:0x06a4, B:267:0x06f3, B:270:0x0710, B:272:0x0724, B:274:0x072e, B:277:0x0741, B:279:0x0755, B:281:0x0763, B:325:0x08ba, B:327:0x08c4, B:329:0x08ca, B:330:0x08e0, B:331:0x08e4, B:333:0x08f7, B:334:0x090e, B:335:0x0916, B:286:0x0781, B:288:0x078f, B:291:0x07a4, B:293:0x07b8, B:295:0x07c6, B:298:0x07d8, B:300:0x07f0, B:302:0x07fc, B:305:0x080f, B:307:0x0823, B:309:0x086e, B:311:0x0875, B:313:0x087b, B:315:0x0885, B:317:0x088c, B:319:0x0892, B:321:0x089c, B:322:0x08ac, B:255:0x06c5, B:259:0x06d9, B:261:0x06df, B:264:0x06ea, B:215:0x0589, B:217:0x05be, B:218:0x05db, B:220:0x05e1, B:222:0x05ef, B:226:0x0603, B:223:0x05f8, B:229:0x060a, B:231:0x0611, B:232:0x0630, B:167:0x042b, B:170:0x0435, B:173:0x043f, B:341:0x094c, B:343:0x095a, B:345:0x0963, B:356:0x0995, B:346:0x096b, B:348:0x0974, B:350:0x097a, B:353:0x0986, B:355:0x0990, B:359:0x099c, B:360:0x09a8, B:362:0x09ae, B:368:0x09c7, B:369:0x09d2, B:374:0x09df, B:378:0x0a06, B:380:0x0a25, B:382:0x0a33, B:384:0x0a39, B:386:0x0a43, B:387:0x0a75, B:389:0x0a7b, B:391:0x0a89, B:395:0x0a94, B:392:0x0a8e, B:396:0x0a97, B:397:0x0aa6, B:399:0x0aac, B:401:0x0abc, B:402:0x0ac3, B:404:0x0acf, B:405:0x0ad6, B:406:0x0ad9, B:408:0x0adf, B:410:0x0af1, B:411:0x0af4, B:419:0x0b64, B:421:0x0b7f, B:422:0x0b90, B:424:0x0b94, B:426:0x0ba0, B:427:0x0ba8, B:429:0x0bac, B:431:0x0bb4, B:432:0x0bc2, B:433:0x0bcd, B:439:0x0c0e, B:440:0x0c16, B:442:0x0c1c, B:444:0x0c2e, B:446:0x0c32, B:460:0x0c68, B:463:0x0c7e, B:448:0x0c40, B:450:0x0c44, B:452:0x0c4e, B:454:0x0c52, B:375:0x09e4, B:377:0x09ea, B:69:0x01c2, B:93:0x0238), top: B:591:0x000f }] */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean G(java.lang.String r43, long r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 4115
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.G(java.lang.String, long):boolean");
    }

    private final boolean H() {
        p0();
        i0();
        return a0().J0() || !TextUtils.isEmpty(a0().v());
    }

    @androidx.annotation.y0
    private final void I() {
        l3<Long> l3Var;
        long jMax;
        p0();
        i0();
        if (this.m > 0) {
            long jAbs = 3600000 - Math.abs(this.j.z().c() - this.m);
            if (jAbs > 0) {
                this.j.B().N().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                n0().c();
                o0().u();
                return;
            }
            this.m = 0L;
        }
        if (!this.j.q() || !H()) {
            this.j.B().N().a("Nothing to upload or uploading impossible");
            n0().c();
            o0().u();
            return;
        }
        long jA = this.j.z().a();
        long jMax2 = Math.max(0L, u.B.a(null).longValue());
        boolean z = a0().K0() || a0().w();
        if (z) {
            String strP = this.j.b().P();
            l3Var = (TextUtils.isEmpty(strP) || ".none.".equals(strP)) ? u.v : u.w;
        } else {
            l3Var = u.u;
        }
        long jMax3 = Math.max(0L, l3Var.a(null).longValue());
        long jA2 = this.j.t().e.a();
        long jA3 = this.j.t().f.a();
        long jMax4 = Math.max(a0().H0(), a0().I0());
        if (jMax4 == 0) {
            jMax = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = jA - Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            long jMax5 = Math.max(jAbs3, jAbs4);
            jMax = jAbs2 + jMax2;
            if (z && jMax5 > 0) {
                jMax = Math.min(jAbs2, jMax5) + jMax3;
            }
            if (!e0().T(jMax5, jMax3)) {
                jMax = jMax5 + jMax3;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                for (int r5 = 0; r5 < Math.min(20, Math.max(0, u.D.a(null).intValue())); r5++) {
                    jMax += Math.max(0L, u.C.a(null).longValue()) * (1 << r5);
                    if (jMax > jAbs4) {
                        break;
                    }
                }
                jMax = 0;
            }
        }
        if (jMax == 0) {
            this.j.B().N().a("Next upload time is 0");
            n0().c();
            o0().u();
            return;
        }
        if (!Y().w()) {
            this.j.B().N().a("No network");
            n0().b();
            o0().u();
            return;
        }
        long jA4 = this.j.t().g.a();
        long jMax6 = Math.max(0L, u.s.a(null).longValue());
        if (!e0().T(jA4, jMax6)) {
            jMax = Math.max(jMax, jA4 + jMax6);
        }
        n0().c();
        long jA5 = jMax - this.j.z().a();
        if (jA5 <= 0) {
            jA5 = Math.max(0L, u.x.a(null).longValue());
            this.j.t().e.b(this.j.z().a());
        }
        this.j.B().N().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        o0().t(jA5);
    }

    @androidx.annotation.y0
    private final void J() throws IllegalStateException {
        p0();
        if (this.q || this.r || this.s) {
            this.j.B().N().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s));
            return;
        }
        this.j.B().N().a("Stopping uploading service(s)");
        List<Runnable> list = this.n;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.n.clear();
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    private final boolean K() throws IOException {
        y3 y3VarI;
        String str;
        FileLock fileLock;
        p0();
        if (this.j.b().p(u.j0) && (fileLock = this.t) != null && fileLock.isValid()) {
            this.j.B().N().a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.j.F().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.u = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.t = fileLockTryLock;
            if (fileLockTryLock != null) {
                this.j.B().N().a("Storage concurrent access okay");
                return true;
            }
            this.j.B().E().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            y3VarI = this.j.B().E();
            str = "Failed to acquire storage lock";
            y3VarI.b(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            y3VarI = this.j.B().E();
            str = "Failed to access storage lock file";
            y3VarI.b(str, e);
            return false;
        } catch (OverlappingFileLockException e3) {
            e = e3;
            y3VarI = this.j.B().I();
            str = "Storage lock already acquired";
            y3VarI.b(str, e);
            return false;
        }
    }

    @androidx.annotation.y0
    private final ma L(String str) {
        f4 f4VarM0 = a0().m0(str);
        if (f4VarM0 == null || TextUtils.isEmpty(f4VarM0.T())) {
            this.j.B().M().b("No app data available; dropping", str);
            return null;
        }
        Boolean boolN = N(f4VarM0);
        if (boolN != null && !boolN.booleanValue()) {
            this.j.B().E().b("App version does not match; dropping. appId", w3.t(str));
            return null;
        }
        return new ma(str, f4VarM0.A(), f4VarM0.T(), f4VarM0.V(), f4VarM0.X(), f4VarM0.Z(), f4VarM0.b0(), (String) null, f4VarM0.e0(), false, f4VarM0.M(), f4VarM0.k(), 0L, 0, f4VarM0.l(), f4VarM0.m(), false, f4VarM0.D(), f4VarM0.n(), f4VarM0.d0(), f4VarM0.o(), (hd.b() && this.j.b().C(str, u.k0)) ? f4VarM0.G() : null, (wb.b() && this.j.b().p(u.L0)) ? b(str).e() : "");
    }

    @androidx.annotation.y0
    private final Boolean N(f4 f4Var) {
        try {
            if (f4Var.V() != -2147483648L) {
                if (f4Var.V() == c.a.b.b.d.s.c.a(this.j.F()).e(f4Var.t(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = c.a.b.b.d.s.c.a(this.j.F()).e(f4Var.t(), 0).versionName;
                if (f4Var.T() != null && f4Var.T().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void O(g1.c.a aVar, g1.c.a aVar2) {
        com.google.android.gms.common.internal.r.a("_e".equals(aVar.Q()));
        e0();
        g1.e eVarY = da.y((g1.c) ((c.a.b.b.g.c.h7) aVar.j()), "_et");
        if (!eVarY.Y() || eVarY.Z() <= 0) {
            return;
        }
        long jZ = eVarY.Z();
        e0();
        g1.e eVarY2 = da.y((g1.c) ((c.a.b.b.g.c.h7) aVar2.j()), "_et");
        if (eVarY2 != null && eVarY2.Z() > 0) {
            jZ += eVarY2.Z();
        }
        e0();
        da.K(aVar2, "_et", Long.valueOf(jZ));
        e0();
        da.K(aVar, "_fr", 1L);
    }

    @androidx.annotation.y0
    private final void P(s sVar, ma maVar) throws IllegalStateException {
        if (md.b() && this.j.b().p(u.C0)) {
            a4 a4VarB = a4.b(sVar);
            this.j.G().M(a4VarB.d, a0().E0(maVar.d));
            this.j.G().V(a4VarB, this.j.b().k(maVar.d));
            sVar = a4VarB.a();
        }
        if (this.j.b().p(u.f0) && "_cmp".equals(sVar.d) && "referrer API v2".equals(sVar.e.y("_cis"))) {
            String strY = sVar.e.y("gclid");
            if (!TextUtils.isEmpty(strY)) {
                s(new ca("_lgclid", sVar.g, strY, "auto"), maVar);
            }
        }
        m(sVar, maVar);
    }

    private static void Q(u9 u9Var) {
        if (u9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (u9Var.p()) {
            return;
        }
        String strValueOf = String.valueOf(u9Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:296:0x0966 A[Catch: all -> 0x09b5, TryCatch #1 {all -> 0x09b5, blocks: (B:39:0x013b, B:42:0x014a, B:44:0x0154, B:49:0x0160, B:56:0x0172, B:59:0x017e, B:61:0x0195, B:66:0x01ae, B:71:0x01e3, B:73:0x01e9, B:75:0x01f7, B:77:0x0203, B:79:0x020d, B:81:0x0218, B:84:0x021f, B:93:0x02b0, B:95:0x02ba, B:99:0x02f3, B:103:0x0305, B:105:0x0352, B:107:0x0357, B:108:0x0370, B:112:0x0381, B:114:0x0395, B:116:0x039a, B:117:0x03b3, B:121:0x03d8, B:125:0x03fd, B:126:0x0416, B:129:0x0425, B:132:0x0448, B:133:0x0464, B:135:0x046e, B:137:0x047a, B:139:0x0480, B:140:0x048b, B:142:0x0497, B:143:0x04ae, B:145:0x04d5, B:148:0x04ee, B:151:0x0534, B:153:0x055c, B:155:0x0596, B:156:0x059b, B:158:0x05a3, B:159:0x05a8, B:161:0x05b0, B:162:0x05b5, B:164:0x05be, B:165:0x05c4, B:167:0x05d1, B:168:0x05d6, B:170:0x05dc, B:172:0x05ea, B:173:0x0601, B:175:0x0607, B:177:0x0617, B:179:0x0621, B:181:0x0629, B:182:0x062e, B:184:0x0638, B:186:0x0642, B:188:0x064a, B:189:0x064c, B:195:0x0665, B:197:0x066d, B:198:0x0672, B:200:0x0681, B:201:0x0684, B:203:0x069a, B:205:0x06a8, B:231:0x0756, B:233:0x079e, B:234:0x07a3, B:236:0x07ab, B:238:0x07b1, B:239:0x07bd, B:241:0x07c6, B:242:0x07cb, B:244:0x07d7, B:246:0x07e6, B:248:0x07f4, B:249:0x07f8, B:251:0x0801, B:253:0x0811, B:255:0x081f, B:258:0x0830, B:260:0x0865, B:261:0x086a, B:257:0x0825, B:250:0x07fc, B:262:0x0876, B:264:0x087c, B:266:0x088a, B:271:0x08a1, B:273:0x08ab, B:274:0x08b2, B:275:0x08bd, B:277:0x08c3, B:279:0x08f4, B:280:0x0904, B:282:0x090c, B:283:0x0912, B:285:0x0918, B:294:0x0960, B:296:0x0966, B:299:0x0982, B:288:0x0926, B:290:0x094b, B:298:0x096a, B:268:0x0890, B:270:0x089a, B:207:0x06ae, B:209:0x06b8, B:211:0x06c2, B:213:0x06c6, B:215:0x06d1, B:216:0x06de, B:218:0x06f0, B:220:0x06f4, B:222:0x06fa, B:224:0x070a, B:226:0x071c, B:230:0x0753, B:227:0x0736, B:229:0x073c, B:190:0x0650, B:192:0x065a, B:194:0x0662, B:152:0x054e, B:86:0x0249, B:87:0x0267, B:92:0x0295, B:91:0x0284, B:78:0x0208, B:69:0x01bc, B:70:0x01d9), top: B:307:0x013b, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f3 A[Catch: all -> 0x09b5, TRY_LEAVE, TryCatch #1 {all -> 0x09b5, blocks: (B:39:0x013b, B:42:0x014a, B:44:0x0154, B:49:0x0160, B:56:0x0172, B:59:0x017e, B:61:0x0195, B:66:0x01ae, B:71:0x01e3, B:73:0x01e9, B:75:0x01f7, B:77:0x0203, B:79:0x020d, B:81:0x0218, B:84:0x021f, B:93:0x02b0, B:95:0x02ba, B:99:0x02f3, B:103:0x0305, B:105:0x0352, B:107:0x0357, B:108:0x0370, B:112:0x0381, B:114:0x0395, B:116:0x039a, B:117:0x03b3, B:121:0x03d8, B:125:0x03fd, B:126:0x0416, B:129:0x0425, B:132:0x0448, B:133:0x0464, B:135:0x046e, B:137:0x047a, B:139:0x0480, B:140:0x048b, B:142:0x0497, B:143:0x04ae, B:145:0x04d5, B:148:0x04ee, B:151:0x0534, B:153:0x055c, B:155:0x0596, B:156:0x059b, B:158:0x05a3, B:159:0x05a8, B:161:0x05b0, B:162:0x05b5, B:164:0x05be, B:165:0x05c4, B:167:0x05d1, B:168:0x05d6, B:170:0x05dc, B:172:0x05ea, B:173:0x0601, B:175:0x0607, B:177:0x0617, B:179:0x0621, B:181:0x0629, B:182:0x062e, B:184:0x0638, B:186:0x0642, B:188:0x064a, B:189:0x064c, B:195:0x0665, B:197:0x066d, B:198:0x0672, B:200:0x0681, B:201:0x0684, B:203:0x069a, B:205:0x06a8, B:231:0x0756, B:233:0x079e, B:234:0x07a3, B:236:0x07ab, B:238:0x07b1, B:239:0x07bd, B:241:0x07c6, B:242:0x07cb, B:244:0x07d7, B:246:0x07e6, B:248:0x07f4, B:249:0x07f8, B:251:0x0801, B:253:0x0811, B:255:0x081f, B:258:0x0830, B:260:0x0865, B:261:0x086a, B:257:0x0825, B:250:0x07fc, B:262:0x0876, B:264:0x087c, B:266:0x088a, B:271:0x08a1, B:273:0x08ab, B:274:0x08b2, B:275:0x08bd, B:277:0x08c3, B:279:0x08f4, B:280:0x0904, B:282:0x090c, B:283:0x0912, B:285:0x0918, B:294:0x0960, B:296:0x0966, B:299:0x0982, B:288:0x0926, B:290:0x094b, B:298:0x096a, B:268:0x0890, B:270:0x089a, B:207:0x06ae, B:209:0x06b8, B:211:0x06c2, B:213:0x06c6, B:215:0x06d1, B:216:0x06de, B:218:0x06f0, B:220:0x06f4, B:222:0x06fa, B:224:0x070a, B:226:0x071c, B:230:0x0753, B:227:0x0736, B:229:0x073c, B:190:0x0650, B:192:0x065a, B:194:0x0662, B:152:0x054e, B:86:0x0249, B:87:0x0267, B:92:0x0295, B:91:0x0284, B:78:0x0208, B:69:0x01bc, B:70:0x01d9), top: B:307:0x013b, inners: #0, #2 }] */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void X(com.google.android.gms.measurement.internal.s r27, com.google.android.gms.measurement.internal.ma r28) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 2495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.X(com.google.android.gms.measurement.internal.s, com.google.android.gms.measurement.internal.ma):void");
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    private final int a(FileChannel fileChannel) throws IOException {
        p0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.j.B().E().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int r6 = fileChannel.read(byteBufferAllocate);
            if (r6 == 4) {
                byteBufferAllocate.flip();
                return byteBufferAllocate.getInt();
            }
            if (r6 != -1) {
                this.j.B().I().b("Unexpected data length. Bytes read", Integer.valueOf(r6));
            }
            return 0;
        } catch (IOException e) {
            this.j.B().E().b("Failed to read from channel", e);
            return 0;
        }
    }

    private final boolean b0(ma maVar) {
        return (hd.b() && this.j.b().C(maVar.d, u.k0)) ? (TextUtils.isEmpty(maVar.e) && TextUtils.isEmpty(maVar.y) && TextUtils.isEmpty(maVar.u)) ? false : true : (TextUtils.isEmpty(maVar.e) && TextUtils.isEmpty(maVar.u)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.f4 c(com.google.android.gms.measurement.internal.ma r9, com.google.android.gms.measurement.internal.f4 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.c(com.google.android.gms.measurement.internal.ma, com.google.android.gms.measurement.internal.f4, java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    public static t9 f(Context context) {
        com.google.android.gms.common.internal.r.k(context);
        com.google.android.gms.common.internal.r.k(context.getApplicationContext());
        if (A == null) {
            synchronized (t9.class) {
                if (A == null) {
                    A = new t9(new ba(context));
                }
            }
        }
        return A;
    }

    @androidx.annotation.y0
    private final String g(e eVar) {
        if (wb.b() && this.j.b().p(u.L0) && !eVar.q()) {
            return null;
        }
        return r0();
    }

    @com.google.android.gms.common.util.d0
    private static void j(g1.c.a aVar, int r5, String str) {
        List<g1.e> listK = aVar.K();
        for (int r1 = 0; r1 < listK.size(); r1++) {
            if ("_err".equals(listK.get(r1).P())) {
                return;
            }
        }
        aVar.D((g1.e) ((c.a.b.b.g.c.h7) g1.e.g0().F("_err").A(Long.valueOf(r5).longValue()).j())).D((g1.e) ((c.a.b.b.g.c.h7) g1.e.g0().F("_ev").J(str).j()));
    }

    @com.google.android.gms.common.util.d0
    private static void k(g1.c.a aVar, @androidx.annotation.h0 String str) {
        List<g1.e> listK = aVar.K();
        for (int r1 = 0; r1 < listK.size(); r1++) {
            if (str.equals(listK.get(r1).P())) {
                aVar.M(r1);
                return;
            }
        }
    }

    @com.google.android.gms.common.util.d0
    private final void l(g1.g.a aVar, long j, boolean z) {
        String str = z ? "_se" : "_lte";
        ea eaVarR0 = a0().r0(aVar.C0(), str);
        ea eaVar = (eaVarR0 == null || eaVarR0.e == null) ? new ea(aVar.C0(), "auto", str, this.j.z().a(), Long.valueOf(j)) : new ea(aVar.C0(), "auto", str, this.j.z().a(), Long.valueOf(((Long) eaVarR0.e).longValue() + j));
        g1.k kVar = (g1.k) ((c.a.b.b.g.c.h7) g1.k.a0().C(str).A(this.j.z().a()).F(((Long) eaVar.e).longValue()).j());
        boolean z2 = false;
        int r0 = da.t(aVar, str);
        if (r0 >= 0) {
            aVar.A(r0, kVar);
            z2 = true;
        }
        if (!z2) {
            aVar.J(kVar);
        }
        if (j > 0) {
            a0().W(eaVar);
            this.j.B().N().c("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", eaVar.e);
        }
    }

    private final h4 n0() {
        h4 h4Var = this.d;
        if (h4Var != null) {
            return h4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    @androidx.annotation.y0
    private final void o(f4 f4Var) throws IllegalStateException {
        b.f.a aVar;
        p0();
        if (hd.b() && this.j.b().C(f4Var.t(), u.k0)) {
            if (TextUtils.isEmpty(f4Var.A()) && TextUtils.isEmpty(f4Var.G()) && TextUtils.isEmpty(f4Var.D())) {
                y(f4Var.t(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(f4Var.A()) && TextUtils.isEmpty(f4Var.D())) {
            y(f4Var.t(), 204, null, null, null);
            return;
        }
        String strN = this.j.b().n(f4Var);
        try {
            URL url = new URL(strN);
            this.j.B().N().b("Fetching remote configuration", f4Var.t());
            d1.b bVarT = W().t(f4Var.t());
            String strA = W().A(f4Var.t());
            if (bVarT == null || TextUtils.isEmpty(strA)) {
                aVar = null;
            } else {
                b.f.a aVar2 = new b.f.a();
                aVar2.put("If-Modified-Since", strA);
                aVar = aVar2;
            }
            this.q = true;
            z3 z3VarY = Y();
            String strT = f4Var.t();
            y9 y9Var = new y9(this);
            z3VarY.c();
            z3VarY.q();
            com.google.android.gms.common.internal.r.k(url);
            com.google.android.gms.common.internal.r.k(y9Var);
            z3VarY.x().E(new d4(z3VarY, strT, url, null, aVar, y9Var));
        } catch (MalformedURLException unused) {
            this.j.B().E().c("Failed to parse config URL. Not fetching. appId", w3.t(f4Var.t()), strN);
        }
    }

    private final p9 o0() {
        Q(this.e);
        return this.e;
    }

    @androidx.annotation.y0
    private final void p0() {
        this.j.x().c();
    }

    private final long q0() {
        long jA = this.j.z().a();
        j4 j4VarT = this.j.t();
        j4VarT.l();
        j4VarT.c();
        long jA2 = j4VarT.i.a();
        if (jA2 == 0) {
            jA2 = 1 + j4VarT.h().H0().nextInt(86400000);
            j4VarT.i.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void r(ba baVar) {
        this.j.x().c();
        d dVar = new d(this);
        dVar.r();
        this.f6521c = dVar;
        this.j.b().o(this.f6519a);
        y8 y8Var = new y8(this);
        y8Var.r();
        this.i = y8Var;
        na naVar = new na(this);
        naVar.r();
        this.f = naVar;
        n7 n7Var = new n7(this);
        n7Var.r();
        this.h = n7Var;
        p9 p9Var = new p9(this);
        p9Var.r();
        this.e = p9Var;
        this.d = new h4(this);
        if (this.o != this.p) {
            this.j.B().E().c("Not all upload components initialized", Integer.valueOf(this.o), Integer.valueOf(this.p));
        }
        this.k = true;
    }

    @androidx.annotation.y0
    @Deprecated
    private final String r0() {
        byte[] bArr = new byte[16];
        this.j.G().H0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @androidx.annotation.y0
    final void A(String str, e eVar) {
        if (wb.b() && this.j.b().p(u.L0)) {
            p0();
            i0();
            this.y.put(str, eVar);
            d dVarA0 = a0();
            if (wb.b() && dVarA0.j().p(u.L0)) {
                com.google.android.gms.common.internal.r.k(str);
                com.google.android.gms.common.internal.r.k(eVar);
                dVarA0.c();
                dVarA0.q();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("consent_state", eVar.e());
                try {
                    if (dVarA0.u().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                        dVarA0.B().E().b("Failed to insert/update consent setting (got -1). appId", w3.t(str));
                    }
                } catch (SQLiteException e) {
                    dVarA0.B().E().c("Error storing consent setting. appId, error", w3.t(str), e);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final w3 B() {
        return this.j.B();
    }

    final void C(boolean z) {
        I();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final Context F() {
        return this.j.F();
    }

    public final xa M() {
        return this.j.b();
    }

    @androidx.annotation.y0
    final void R(ca caVar, ma maVar) {
        p0();
        i0();
        if (b0(maVar)) {
            if (!maVar.k) {
                V(maVar);
                return;
            }
            if ("_npa".equals(caVar.e) && maVar.v != null) {
                this.j.B().M().a("Falling back to manifest metadata value for ad personalization");
                s(new ca("_npa", this.j.z().a(), Long.valueOf(maVar.v.booleanValue() ? 1L : 0L), "auto"), maVar);
                return;
            }
            this.j.B().M().b("Removing user property", this.j.H().w(caVar.e));
            a0().w0();
            try {
                V(maVar);
                a0().o0(maVar.d, caVar.e);
                a0().t();
                this.j.B().M().b("User property removed", this.j.H().w(caVar.e));
            } finally {
                a0().B0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0445 A[Catch: all -> 0x04a5, TryCatch #0 {all -> 0x04a5, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01ab, B:54:0x01be, B:57:0x01d2, B:59:0x01dd, B:64:0x01ec, B:66:0x01f4, B:68:0x01fa, B:72:0x0209, B:74:0x020c, B:76:0x0230, B:78:0x0235, B:79:0x023d, B:85:0x0251, B:88:0x0265, B:90:0x02b9, B:92:0x02c1, B:94:0x02c5, B:95:0x02c8, B:97:0x02e9, B:137:0x03c3, B:138:0x03c6, B:139:0x03d7, B:150:0x0435, B:152:0x0445, B:154:0x045f, B:155:0x0466, B:156:0x0477, B:160:0x0496, B:99:0x0302, B:104:0x032d, B:106:0x0335, B:108:0x033f, B:113:0x0355, B:117:0x035f, B:121:0x036a, B:124:0x037c, B:129:0x03a7, B:131:0x03ad, B:132:0x03b2, B:134:0x03b8, B:127:0x038f, B:102:0x0315, B:142:0x03de, B:144:0x0414, B:146:0x041c, B:148:0x0420, B:149:0x0423, B:157:0x047b, B:159:0x047f, B:82:0x0245, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:166:0x009f, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x047b A[Catch: all -> 0x04a5, TryCatch #0 {all -> 0x04a5, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01ab, B:54:0x01be, B:57:0x01d2, B:59:0x01dd, B:64:0x01ec, B:66:0x01f4, B:68:0x01fa, B:72:0x0209, B:74:0x020c, B:76:0x0230, B:78:0x0235, B:79:0x023d, B:85:0x0251, B:88:0x0265, B:90:0x02b9, B:92:0x02c1, B:94:0x02c5, B:95:0x02c8, B:97:0x02e9, B:137:0x03c3, B:138:0x03c6, B:139:0x03d7, B:150:0x0435, B:152:0x0445, B:154:0x045f, B:155:0x0466, B:156:0x0477, B:160:0x0496, B:99:0x0302, B:104:0x032d, B:106:0x0335, B:108:0x033f, B:113:0x0355, B:117:0x035f, B:121:0x036a, B:124:0x037c, B:129:0x03a7, B:131:0x03ad, B:132:0x03b2, B:134:0x03b8, B:127:0x038f, B:102:0x0315, B:142:0x03de, B:144:0x0414, B:146:0x041c, B:148:0x0420, B:149:0x0423, B:157:0x047b, B:159:0x047f, B:82:0x0245, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:166:0x009f, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020c A[Catch: all -> 0x04a5, TryCatch #0 {all -> 0x04a5, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01ab, B:54:0x01be, B:57:0x01d2, B:59:0x01dd, B:64:0x01ec, B:66:0x01f4, B:68:0x01fa, B:72:0x0209, B:74:0x020c, B:76:0x0230, B:78:0x0235, B:79:0x023d, B:85:0x0251, B:88:0x0265, B:90:0x02b9, B:92:0x02c1, B:94:0x02c5, B:95:0x02c8, B:97:0x02e9, B:137:0x03c3, B:138:0x03c6, B:139:0x03d7, B:150:0x0435, B:152:0x0445, B:154:0x045f, B:155:0x0466, B:156:0x0477, B:160:0x0496, B:99:0x0302, B:104:0x032d, B:106:0x0335, B:108:0x033f, B:113:0x0355, B:117:0x035f, B:121:0x036a, B:124:0x037c, B:129:0x03a7, B:131:0x03ad, B:132:0x03b2, B:134:0x03b8, B:127:0x038f, B:102:0x0315, B:142:0x03de, B:144:0x0414, B:146:0x041c, B:148:0x0420, B:149:0x0423, B:157:0x047b, B:159:0x047f, B:82:0x0245, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:166:0x009f, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0251 A[Catch: all -> 0x04a5, TRY_LEAVE, TryCatch #0 {all -> 0x04a5, blocks: (B:24:0x009f, B:26:0x00ad, B:44:0x010f, B:46:0x011b, B:48:0x0132, B:49:0x015a, B:51:0x01ab, B:54:0x01be, B:57:0x01d2, B:59:0x01dd, B:64:0x01ec, B:66:0x01f4, B:68:0x01fa, B:72:0x0209, B:74:0x020c, B:76:0x0230, B:78:0x0235, B:79:0x023d, B:85:0x0251, B:88:0x0265, B:90:0x02b9, B:92:0x02c1, B:94:0x02c5, B:95:0x02c8, B:97:0x02e9, B:137:0x03c3, B:138:0x03c6, B:139:0x03d7, B:150:0x0435, B:152:0x0445, B:154:0x045f, B:155:0x0466, B:156:0x0477, B:160:0x0496, B:99:0x0302, B:104:0x032d, B:106:0x0335, B:108:0x033f, B:113:0x0355, B:117:0x035f, B:121:0x036a, B:124:0x037c, B:129:0x03a7, B:131:0x03ad, B:132:0x03b2, B:134:0x03b8, B:127:0x038f, B:102:0x0315, B:142:0x03de, B:144:0x0414, B:146:0x041c, B:148:0x0420, B:149:0x0423, B:157:0x047b, B:159:0x047f, B:82:0x0245, B:30:0x00bc, B:32:0x00c0, B:36:0x00d1, B:38:0x00eb, B:40:0x00f5, B:43:0x00ff), top: B:166:0x009f, inners: #1, #2, #3 }] */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void S(com.google.android.gms.measurement.internal.ma r22) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.S(com.google.android.gms.measurement.internal.ma):void");
    }

    @androidx.annotation.y0
    final void T(va vaVar) {
        ma maVarL = L(vaVar.d);
        if (maVarL != null) {
            U(vaVar, maVarL);
        }
    }

    @androidx.annotation.y0
    final void U(va vaVar, ma maVar) {
        com.google.android.gms.common.internal.r.k(vaVar);
        com.google.android.gms.common.internal.r.g(vaVar.d);
        com.google.android.gms.common.internal.r.k(vaVar.f);
        com.google.android.gms.common.internal.r.g(vaVar.f.e);
        p0();
        i0();
        if (b0(maVar)) {
            if (!maVar.k) {
                V(maVar);
                return;
            }
            a0().w0();
            try {
                V(maVar);
                va vaVarS0 = a0().s0(vaVar.d, vaVar.f.e);
                if (vaVarS0 != null) {
                    this.j.B().M().c("Removing conditional user property", vaVar.d, this.j.H().w(vaVar.f.e));
                    a0().u0(vaVar.d, vaVar.f.e);
                    if (vaVarS0.h) {
                        a0().o0(vaVar.d, vaVar.f.e);
                    }
                    if (vaVar.n != null) {
                        X(this.j.G().E(vaVar.d, vaVar.n.d, vaVar.n.e != null ? vaVar.n.e.l() : null, vaVarS0.e, vaVar.n.g, true, false, cb.b() && this.j.b().p(u.O0)), maVar);
                    }
                } else {
                    this.j.B().I().c("Conditional user property doesn't exist", w3.t(vaVar.d), this.j.H().w(vaVar.f.e));
                }
                a0().t();
            } finally {
                a0().B0();
            }
        }
    }

    @androidx.annotation.y0
    final f4 V(ma maVar) {
        p0();
        i0();
        com.google.android.gms.common.internal.r.k(maVar);
        com.google.android.gms.common.internal.r.g(maVar.d);
        f4 f4VarM0 = a0().m0(maVar.d);
        e eVarK = e.f6371c;
        if (wb.b() && this.j.b().p(u.L0)) {
            eVarK = b(maVar.d).k(e.b(maVar.z));
        }
        String strU = (wb.b() && this.j.b().p(u.L0) && !eVarK.o()) ? "" : this.i.u(maVar.d);
        if (!uc.b() || !this.j.b().p(u.p0)) {
            return c(maVar, f4VarM0, strU);
        }
        if (f4VarM0 == null) {
            f4VarM0 = new f4(this.j, maVar.d);
            if (wb.b() && this.j.b().p(u.L0)) {
                if (eVarK.q()) {
                    f4VarM0.c(g(eVarK));
                }
                if (eVarK.o()) {
                }
            } else {
                f4VarM0.c(r0());
            }
            f4VarM0.C(strU);
        } else if ((!wb.b() || !this.j.b().p(u.L0) || eVarK.o()) && !strU.equals(f4VarM0.J())) {
            f4VarM0.C(strU);
            f4VarM0.c((wb.b() && this.j.b().p(u.L0)) ? g(eVarK) : r0());
        }
        f4VarM0.r(maVar.e);
        f4VarM0.v(maVar.u);
        if (hd.b() && this.j.b().C(f4VarM0.t(), u.k0)) {
            f4VarM0.z(maVar.y);
        }
        if (!TextUtils.isEmpty(maVar.n)) {
            f4VarM0.F(maVar.n);
        }
        long j = maVar.h;
        if (j != 0) {
            f4VarM0.y(j);
        }
        if (!TextUtils.isEmpty(maVar.f)) {
            f4VarM0.I(maVar.f);
        }
        f4VarM0.u(maVar.m);
        String str = maVar.g;
        if (str != null) {
            f4VarM0.L(str);
        }
        f4VarM0.B(maVar.i);
        f4VarM0.e(maVar.k);
        if (!TextUtils.isEmpty(maVar.j)) {
            f4VarM0.O(maVar.j);
        }
        if (!this.j.b().p(u.A0)) {
            f4VarM0.c0(maVar.o);
        }
        f4VarM0.s(maVar.r);
        f4VarM0.w(maVar.s);
        f4VarM0.b(maVar.v);
        f4VarM0.E(maVar.w);
        if (f4VarM0.f()) {
            a0().R(f4VarM0);
        }
        return f4VarM0;
    }

    public final v4 W() {
        Q(this.f6519a);
        return this.f6519a;
    }

    public final z3 Y() {
        Q(this.f6520b);
        return this.f6520b;
    }

    final String Z(ma maVar) throws IllegalStateException {
        try {
            return (String) this.j.x().s(new x9(this, maVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.j.B().E().c("Failed to get app instance id. appId", w3.t(maVar.d), e);
            return null;
        }
    }

    public final d a0() {
        Q(this.f6521c);
        return this.f6521c;
    }

    @androidx.annotation.y0
    final e b(String str) {
        e eVarF0 = e.f6371c;
        if (wb.b() && this.j.b().p(u.L0)) {
            p0();
            i0();
            eVarF0 = this.y.get(str);
            if (eVarF0 == null) {
                eVarF0 = a0().F0(str);
                if (eVarF0 == null) {
                    eVarF0 = e.f6371c;
                }
                A(str, eVarF0);
            }
        }
        return eVarF0;
    }

    public final na c0() {
        Q(this.f);
        return this.f;
    }

    public final n7 d0() {
        Q(this.h);
        return this.h;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final wa e() {
        return this.j.e();
    }

    public final da e0() {
        Q(this.g);
        return this.g;
    }

    public final y8 f0() {
        return this.i;
    }

    public final u3 g0() {
        return this.j.H();
    }

    @androidx.annotation.y0
    protected final void h() {
        this.j.x().c();
        a0().G0();
        if (this.j.t().e.a() == 0) {
            this.j.t().e.b(this.j.z().a());
        }
        I();
    }

    public final ha h0() {
        return this.j.G();
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    final void i(int r9, Throwable th, byte[] bArr, String str) throws IllegalStateException {
        d dVarA0;
        long jLongValue;
        p0();
        i0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.r = false;
                J();
            }
        }
        List<Long> list = this.v;
        this.v = null;
        boolean z = true;
        if ((r9 == 200 || r9 == 204) && th == null) {
            try {
                this.j.t().e.b(this.j.z().a());
                this.j.t().f.b(0L);
                I();
                this.j.B().N().c("Successful upload. Got network response. code, size", Integer.valueOf(r9), Integer.valueOf(bArr.length));
                a0().w0();
                try {
                    for (Long l : list) {
                        try {
                            dVarA0 = a0();
                            jLongValue = l.longValue();
                            dVarA0.c();
                            dVarA0.q();
                            try {
                            } catch (SQLiteException e) {
                                dVarA0.B().E().b("Failed to delete a bundle in a queue table", e);
                                throw e;
                            }
                        } catch (SQLiteException e2) {
                            if (this.w == null || !this.w.contains(l)) {
                                throw e2;
                            }
                        }
                        if (dVarA0.u().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    }
                    a0().t();
                    a0().B0();
                    this.w = null;
                    if (Y().w() && H()) {
                        j0();
                    } else {
                        this.x = -1L;
                        I();
                    }
                    this.m = 0L;
                } catch (Throwable th2) {
                    a0().B0();
                    throw th2;
                }
            } catch (SQLiteException e3) {
                this.j.B().E().b("Database error while trying to delete uploaded bundles", e3);
                this.m = this.j.z().c();
                this.j.B().N().b("Disable upload, time", Long.valueOf(this.m));
            }
        } else {
            this.j.B().N().c("Network upload failed. Will retry later. code, error", Integer.valueOf(r9), th);
            this.j.t().f.b(this.j.z().a());
            if (r9 != 503 && r9 != 429) {
                z = false;
            }
            if (z) {
                this.j.t().g.b(this.j.z().a());
            }
            a0().T(list);
            I();
        }
    }

    final void i0() {
        if (!this.k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    @androidx.annotation.y0
    final void j0() {
        f4 f4VarM0;
        String strD0;
        y3 y3VarN;
        String str;
        p0();
        i0();
        this.s = true;
        try {
            Boolean boolB0 = this.j.P().b0();
            if (boolB0 == null) {
                y3VarN = this.j.B().I();
                str = "Upload data called on the client side before use of service was decided";
            } else {
                if (!boolB0.booleanValue()) {
                    if (this.m > 0) {
                        I();
                    } else {
                        p0();
                        if (this.v != null) {
                            y3VarN = this.j.B().N();
                            str = "Uploading requested multiple times";
                        } else if (Y().w()) {
                            long jA = this.j.z().a();
                            int r7 = this.j.b().r(null, u.R);
                            long jM = jA - xa.M();
                            for (int r8 = 0; r8 < r7 && G(null, jM); r8++) {
                            }
                            long jA2 = this.j.t().e.a();
                            if (jA2 != 0) {
                                this.j.B().M().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jA - jA2)));
                            }
                            String strV = a0().v();
                            if (TextUtils.isEmpty(strV)) {
                                this.x = -1L;
                                String strJ = a0().J(jA - xa.M());
                                if (!TextUtils.isEmpty(strJ) && (f4VarM0 = a0().m0(strJ)) != null) {
                                    o(f4VarM0);
                                }
                            } else {
                                if (this.x == -1) {
                                    this.x = a0().L0();
                                }
                                List<Pair<g1.g, Long>> listM = a0().M(strV, this.j.b().r(strV, u.h), Math.max(0, this.j.b().r(strV, u.i)));
                                if (!listM.isEmpty()) {
                                    if (!wb.b() || !this.j.b().p(u.L0) || b(strV).o()) {
                                        Iterator<Pair<g1.g, Long>> it = listM.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                strD0 = null;
                                                break;
                                            }
                                            g1.g gVar = (g1.g) it.next().first;
                                            if (!TextUtils.isEmpty(gVar.d0())) {
                                                strD0 = gVar.d0();
                                                break;
                                            }
                                        }
                                        if (strD0 != null) {
                                            int r82 = 0;
                                            while (true) {
                                                if (r82 >= listM.size()) {
                                                    break;
                                                }
                                                g1.g gVar2 = (g1.g) listM.get(r82).first;
                                                if (!TextUtils.isEmpty(gVar2.d0()) && !gVar2.d0().equals(strD0)) {
                                                    listM = listM.subList(0, r82);
                                                    break;
                                                }
                                                r82++;
                                            }
                                        }
                                    }
                                    g1.f.a aVarG = g1.f.G();
                                    int size = listM.size();
                                    ArrayList arrayList = new ArrayList(listM.size());
                                    boolean z = this.j.b().J(strV) && !(wb.b() && this.j.b().p(u.L0) && !b(strV).o());
                                    boolean z2 = (wb.b() && this.j.b().p(u.L0) && !b(strV).o()) ? false : true;
                                    boolean z3 = (wb.b() && this.j.b().p(u.L0) && !b(strV).q()) ? false : true;
                                    int r14 = 0;
                                    while (r14 < size) {
                                        g1.g.a aVarX = ((g1.g) listM.get(r14).first).x();
                                        arrayList.add((Long) listM.get(r14).second);
                                        ArrayList arrayList2 = arrayList;
                                        aVarX.q0(32053L).C(jA).U(false);
                                        if (!z) {
                                            aVarX.T0();
                                        }
                                        if (wb.b() && this.j.b().p(u.L0)) {
                                            if (!z2) {
                                                aVarX.D0();
                                                aVarX.G0();
                                            }
                                            if (!z3) {
                                                aVarX.J0();
                                            }
                                        }
                                        if (this.j.b().C(strV, u.Y)) {
                                            aVarX.H0(e0().u(((g1.g) ((c.a.b.b.g.c.h7) aVarX.j())).l()));
                                        }
                                        aVarG.x(aVarX);
                                        r14++;
                                        arrayList = arrayList2;
                                    }
                                    ArrayList arrayList3 = arrayList;
                                    String strE = this.j.B().A(2) ? e0().E((g1.f) ((c.a.b.b.g.c.h7) aVarG.j())) : null;
                                    e0();
                                    byte[] bArrL = ((g1.f) ((c.a.b.b.g.c.h7) aVarG.j())).l();
                                    String strA = u.r.a(null);
                                    try {
                                        URL url = new URL(strA);
                                        com.google.android.gms.common.internal.r.a(!arrayList3.isEmpty());
                                        if (this.v != null) {
                                            this.j.B().E().a("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.v = new ArrayList(arrayList3);
                                        }
                                        this.j.t().f.b(jA);
                                        this.j.B().N().d("Uploading data. app, uncompressed size, data", size > 0 ? aVarG.z(0).Y2() : "?", Integer.valueOf(bArrL.length), strE);
                                        this.r = true;
                                        z3 z3VarY = Y();
                                        v9 v9Var = new v9(this, strV);
                                        z3VarY.c();
                                        z3VarY.q();
                                        com.google.android.gms.common.internal.r.k(url);
                                        com.google.android.gms.common.internal.r.k(bArrL);
                                        com.google.android.gms.common.internal.r.k(v9Var);
                                        z3VarY.x().E(new d4(z3VarY, strV, url, bArrL, null, v9Var));
                                    } catch (MalformedURLException unused) {
                                        this.j.B().E().c("Failed to parse upload URL. Not uploading. appId", w3.t(strV), strA);
                                    }
                                }
                            }
                        } else {
                            this.j.B().N().a("Network not connected, ignoring upload request");
                            I();
                        }
                    }
                }
                y3VarN = this.j.B().E();
                str = "Upload called in the client side when service should be used";
            }
            y3VarN.a(str);
        } finally {
            this.s = false;
            J();
        }
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    final void k0() {
        y3 y3VarE;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        p0();
        i0();
        if (this.l) {
            return;
        }
        this.l = true;
        if (K()) {
            int r0 = a(this.u);
            int r1 = this.j.R().G();
            p0();
            if (r0 > r1) {
                y3VarE = this.j.B().E();
                numValueOf = Integer.valueOf(r0);
                numValueOf2 = Integer.valueOf(r1);
                str = "Panic: can't downgrade version. Previous, current version";
            } else {
                if (r0 >= r1) {
                    return;
                }
                if (D(r1, this.u)) {
                    y3VarE = this.j.B().N();
                    numValueOf = Integer.valueOf(r0);
                    numValueOf2 = Integer.valueOf(r1);
                    str = "Storage version upgraded. Previous, current version";
                } else {
                    y3VarE = this.j.B().E();
                    numValueOf = Integer.valueOf(r0);
                    numValueOf2 = Integer.valueOf(r1);
                    str = "Storage version upgrade failed. Previous, current version";
                }
            }
            y3VarE.c(str, numValueOf, numValueOf2);
        }
    }

    final void l0() {
        this.p++;
    }

    @androidx.annotation.y0
    final void m(s sVar, ma maVar) throws IllegalStateException {
        List<va> listO;
        List<va> listO2;
        List<va> listO3;
        y3 y3VarE;
        String str;
        Object objT;
        String strW;
        Object obj;
        s sVar2 = sVar;
        com.google.android.gms.common.internal.r.k(maVar);
        com.google.android.gms.common.internal.r.g(maVar.d);
        p0();
        i0();
        String str2 = maVar.d;
        long j = sVar2.g;
        e0();
        if (da.U(sVar, maVar)) {
            if (!maVar.k) {
                V(maVar);
                return;
            }
            List<String> list = maVar.x;
            if (list != null) {
                if (!list.contains(sVar2.d)) {
                    this.j.B().M().d("Dropping non-safelisted event. appId, event name, origin", str2, sVar2.d, sVar2.f);
                    return;
                } else {
                    Bundle bundleL = sVar2.e.l();
                    bundleL.putLong("ga_safelisted", 1L);
                    sVar2 = new s(sVar2.d, new n(bundleL), sVar2.f, sVar2.g);
                }
            }
            a0().w0();
            try {
                d dVarA0 = a0();
                com.google.android.gms.common.internal.r.g(str2);
                dVarA0.c();
                dVarA0.q();
                if (j < 0) {
                    dVarA0.B().I().c("Invalid time querying timed out conditional properties", w3.t(str2), Long.valueOf(j));
                    listO = Collections.emptyList();
                } else {
                    listO = dVarA0.O("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (va vaVar : listO) {
                    if (vaVar != null) {
                        this.j.B().N().d("User property timed out", vaVar.d, this.j.H().w(vaVar.f.e), vaVar.f.h());
                        if (vaVar.j != null) {
                            X(new s(vaVar.j, j), maVar);
                        }
                        a0().u0(str2, vaVar.f.e);
                    }
                }
                d dVarA02 = a0();
                com.google.android.gms.common.internal.r.g(str2);
                dVarA02.c();
                dVarA02.q();
                if (j < 0) {
                    dVarA02.B().I().c("Invalid time querying expired conditional properties", w3.t(str2), Long.valueOf(j));
                    listO2 = Collections.emptyList();
                } else {
                    listO2 = dVarA02.O("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(listO2.size());
                for (va vaVar2 : listO2) {
                    if (vaVar2 != null) {
                        this.j.B().N().d("User property expired", vaVar2.d, this.j.H().w(vaVar2.f.e), vaVar2.f.h());
                        a0().o0(str2, vaVar2.f.e);
                        if (vaVar2.n != null) {
                            arrayList.add(vaVar2.n);
                        }
                        a0().u0(str2, vaVar2.f.e);
                    }
                }
                int size = arrayList.size();
                int r6 = 0;
                while (r6 < size) {
                    Object obj2 = arrayList.get(r6);
                    r6++;
                    X(new s((s) obj2, j), maVar);
                }
                d dVarA03 = a0();
                String str3 = sVar2.d;
                com.google.android.gms.common.internal.r.g(str2);
                com.google.android.gms.common.internal.r.g(str3);
                dVarA03.c();
                dVarA03.q();
                if (j < 0) {
                    dVarA03.B().I().d("Invalid time querying triggered conditional properties", w3.t(str2), dVarA03.f().s(str3), Long.valueOf(j));
                    listO3 = Collections.emptyList();
                } else {
                    listO3 = dVarA03.O("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(listO3.size());
                for (va vaVar3 : listO3) {
                    if (vaVar3 != null) {
                        ca caVar = vaVar3.f;
                        ea eaVar = new ea(vaVar3.d, vaVar3.e, caVar.e, j, caVar.h());
                        if (a0().W(eaVar)) {
                            y3VarE = this.j.B().N();
                            str = "User property triggered";
                            objT = vaVar3.d;
                            strW = this.j.H().w(eaVar.f6380c);
                            obj = eaVar.e;
                        } else {
                            y3VarE = this.j.B().E();
                            str = "Too many active user properties, ignoring";
                            objT = w3.t(vaVar3.d);
                            strW = this.j.H().w(eaVar.f6380c);
                            obj = eaVar.e;
                        }
                        y3VarE.d(str, objT, strW, obj);
                        if (vaVar3.l != null) {
                            arrayList2.add(vaVar3.l);
                        }
                        vaVar3.f = new ca(eaVar);
                        vaVar3.h = true;
                        a0().X(vaVar3);
                    }
                }
                X(sVar2, maVar);
                int size2 = arrayList2.size();
                int r13 = 0;
                while (r13 < size2) {
                    Object obj3 = arrayList2.get(r13);
                    r13++;
                    X(new s((s) obj3, j), maVar);
                }
                a0().t();
            } finally {
                a0().B0();
            }
        }
    }

    final b5 m0() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void n(com.google.android.gms.measurement.internal.s r36, java.lang.String r37) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.n(com.google.android.gms.measurement.internal.s, java.lang.String):void");
    }

    final void q(u9 u9Var) {
        this.o++;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void s(com.google.android.gms.measurement.internal.ca r14, com.google.android.gms.measurement.internal.ma r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.s(com.google.android.gms.measurement.internal.ca, com.google.android.gms.measurement.internal.ma):void");
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    final void t(ma maVar) {
        if (this.v != null) {
            ArrayList arrayList = new ArrayList();
            this.w = arrayList;
            arrayList.addAll(this.v);
        }
        d dVarA0 = a0();
        String str = maVar.d;
        com.google.android.gms.common.internal.r.g(str);
        dVarA0.c();
        dVarA0.q();
        try {
            SQLiteDatabase sQLiteDatabaseU = dVarA0.u();
            String[] strArr = {str};
            int r6 = sQLiteDatabaseU.delete("apps", "app_id=?", strArr) + 0 + sQLiteDatabaseU.delete("events", "app_id=?", strArr) + sQLiteDatabaseU.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseU.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseU.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseU.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseU.delete("queue", "app_id=?", strArr) + sQLiteDatabaseU.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseU.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseU.delete("default_event_params", "app_id=?", strArr);
            if (r6 > 0) {
                dVarA0.B().N().c("Reset analytics data. app, records", str, Integer.valueOf(r6));
            }
        } catch (SQLiteException e) {
            dVarA0.B().E().c("Error resetting analytics data. appId, error", w3.t(str), e);
        }
        if (maVar.k) {
            S(maVar);
        }
    }

    @androidx.annotation.y0
    final void u(va vaVar) {
        ma maVarL = L(vaVar.d);
        if (maVarL != null) {
            v(vaVar, maVarL);
        }
    }

    @androidx.annotation.y0
    final void v(va vaVar, ma maVar) {
        y3 y3VarE;
        String str;
        Object objT;
        String strW;
        Object objH;
        y3 y3VarE2;
        String str2;
        Object objT2;
        String strW2;
        Object obj;
        com.google.android.gms.common.internal.r.k(vaVar);
        com.google.android.gms.common.internal.r.g(vaVar.d);
        com.google.android.gms.common.internal.r.k(vaVar.e);
        com.google.android.gms.common.internal.r.k(vaVar.f);
        com.google.android.gms.common.internal.r.g(vaVar.f.e);
        p0();
        i0();
        if (b0(maVar)) {
            if (!maVar.k) {
                V(maVar);
                return;
            }
            va vaVar2 = new va(vaVar);
            boolean z = false;
            vaVar2.h = false;
            a0().w0();
            try {
                va vaVarS0 = a0().s0(vaVar2.d, vaVar2.f.e);
                if (vaVarS0 != null && !vaVarS0.e.equals(vaVar2.e)) {
                    this.j.B().I().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.j.H().w(vaVar2.f.e), vaVar2.e, vaVarS0.e);
                }
                if (vaVarS0 != null && vaVarS0.h) {
                    vaVar2.e = vaVarS0.e;
                    vaVar2.g = vaVarS0.g;
                    vaVar2.k = vaVarS0.k;
                    vaVar2.i = vaVarS0.i;
                    vaVar2.l = vaVarS0.l;
                    vaVar2.h = vaVarS0.h;
                    vaVar2.f = new ca(vaVar2.f.e, vaVarS0.f.f, vaVar2.f.h(), vaVarS0.f.j);
                } else if (TextUtils.isEmpty(vaVar2.i)) {
                    vaVar2.f = new ca(vaVar2.f.e, vaVar2.g, vaVar2.f.h(), vaVar2.f.j);
                    vaVar2.h = true;
                    z = true;
                }
                if (vaVar2.h) {
                    ca caVar = vaVar2.f;
                    ea eaVar = new ea(vaVar2.d, vaVar2.e, caVar.e, caVar.f, caVar.h());
                    if (a0().W(eaVar)) {
                        y3VarE2 = this.j.B().M();
                        str2 = "User property updated immediately";
                        objT2 = vaVar2.d;
                        strW2 = this.j.H().w(eaVar.f6380c);
                        obj = eaVar.e;
                    } else {
                        y3VarE2 = this.j.B().E();
                        str2 = "(2)Too many active user properties, ignoring";
                        objT2 = w3.t(vaVar2.d);
                        strW2 = this.j.H().w(eaVar.f6380c);
                        obj = eaVar.e;
                    }
                    y3VarE2.d(str2, objT2, strW2, obj);
                    if (z && vaVar2.l != null) {
                        X(new s(vaVar2.l, vaVar2.g), maVar);
                    }
                }
                if (a0().X(vaVar2)) {
                    y3VarE = this.j.B().M();
                    str = "Conditional property added";
                    objT = vaVar2.d;
                    strW = this.j.H().w(vaVar2.f.e);
                    objH = vaVar2.f.h();
                } else {
                    y3VarE = this.j.B().E();
                    str = "Too many conditional properties, ignoring";
                    objT = w3.t(vaVar2.d);
                    strW = this.j.H().w(vaVar2.f.e);
                    objH = vaVar2.f.h();
                }
                y3VarE.d(str, objT, strW, objH);
                a0().t();
            } finally {
                a0().B0();
            }
        }
    }

    @androidx.annotation.y0
    final void w(Runnable runnable) {
        p0();
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(runnable);
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final u4 x() {
        return this.j.x();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0132 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:6:0x0029, B:15:0x0045, B:62:0x016d, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x011c, B:55:0x0132, B:57:0x015a, B:59:0x0164, B:61:0x016a, B:56:0x0142, B:47:0x0103, B:49:0x010d), top: B:71:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:6:0x0029, B:15:0x0045, B:62:0x016d, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x011c, B:55:0x0132, B:57:0x015a, B:59:0x0164, B:61:0x016a, B:56:0x0142, B:47:0x0103, B:49:0x010d), top: B:71:0x0029, outer: #0 }] */
    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void y(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.y(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final com.google.android.gms.common.util.g z() {
        return this.j.z();
    }
}
