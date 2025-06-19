package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.fm0;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class jf2 {
    private static final String r = "jf2";

    /* renamed from: a, reason: collision with root package name */
    protected Context f3958a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f3959b;

    /* renamed from: c, reason: collision with root package name */
    private DexClassLoader f3960c;
    private k72 d;
    private byte[] e;
    private boolean i;
    private vs1 l;
    private Map<Pair<String, String>, yg2> o;
    private hf2 q;
    private volatile com.google.android.gms.ads.e0.a f = null;
    private volatile boolean g = false;
    private Future h = null;
    private volatile fm0.a j = null;
    private Future k = null;
    private boolean m = false;
    private boolean n = false;
    private boolean p = false;

    private jf2(Context context) {
        Context applicationContext = context.getApplicationContext();
        boolean z = applicationContext != null;
        this.i = z;
        this.f3958a = z ? applicationContext : context;
        this.o = new HashMap();
        if (this.q == null) {
            this.q = new hf2(this.f3958a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        try {
            if (this.f == null && this.i) {
                com.google.android.gms.ads.e0.a aVar = new com.google.android.gms.ads.e0.a(this.f3958a);
                aVar.f();
                this.f = aVar;
            }
        } catch (c.a.b.b.d.g | c.a.b.b.d.h | IOException unused) {
            this.f = null;
        }
    }

    @androidx.annotation.x0
    private final fm0.a C() {
        try {
            return es1.a(this.f3958a, this.f3958a.getPackageName(), Integer.toString(this.f3958a.getPackageManager().getPackageInfo(this.f3958a.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static jf2 d(Context context, String str, String str2, boolean z) throws Throwable {
        jf2 jf2Var = new jf2(context);
        try {
            jf2Var.f3959b = Executors.newCachedThreadPool(new nf2());
            jf2Var.g = z;
            if (z) {
                jf2Var.h = jf2Var.f3959b.submit(new lf2(jf2Var));
            }
            jf2Var.f3959b.execute(new of2(jf2Var));
            try {
                c.a.b.b.d.f fVarI = c.a.b.b.d.f.i();
                jf2Var.m = fVarI.b(jf2Var.f3958a) > 0;
                jf2Var.n = fVarI.j(jf2Var.f3958a) == 0;
            } catch (Throwable unused) {
            }
            jf2Var.f(0, true);
            if (tf2.a() && ((Boolean) qx2.e().c(e0.N1)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            k72 k72Var = new k72(null);
            jf2Var.d = k72Var;
            try {
                jf2Var.e = k72Var.c(str);
            } catch (j62 e) {
                throw new gf2(e);
            }
        } catch (gf2 unused2) {
        }
        try {
            try {
                try {
                    File cacheDir = jf2Var.f3958a.getCacheDir();
                    if (cacheDir == null && (cacheDir = jf2Var.f3958a.getDir("dex", 0)) == null) {
                        throw new gf2();
                    }
                    File file = new File(String.format("%s/%s.jar", cacheDir, "1588462714860"));
                    if (!file.exists()) {
                        byte[] bArrB = jf2Var.d.b(jf2Var.e, str2);
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        fileOutputStream.write(bArrB, 0, bArrB.length);
                        fileOutputStream.close();
                    }
                    jf2Var.n(cacheDir, "1588462714860");
                    try {
                        jf2Var.f3960c = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, jf2Var.f3958a.getClassLoader());
                        p(file);
                        jf2Var.h(cacheDir, "1588462714860");
                        k(String.format("%s/%s.dex", cacheDir, "1588462714860"));
                        jf2Var.l = new vs1(jf2Var);
                        jf2Var.p = true;
                        return jf2Var;
                    } catch (Throwable th) {
                        p(file);
                        jf2Var.h(cacheDir, "1588462714860");
                        k(String.format("%s/%s.dex", cacheDir, "1588462714860"));
                        throw th;
                    }
                } catch (IOException e2) {
                    throw new gf2(e2);
                }
            } catch (NullPointerException e3) {
                throw new gf2(e3);
            }
        } catch (j62 e4) {
            throw new gf2(e4);
        } catch (FileNotFoundException e5) {
            throw new gf2(e5);
        }
    }

    private final void h(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        p(file3);
                        return;
                    }
                    System.out.print("test");
                    System.out.print("test");
                    System.out.print("test");
                    fm0.c.a aVarX = fm0.c.O().z(a82.S(Build.VERSION.SDK.getBytes())).x(a82.S(str.getBytes()));
                    byte[] bytes = this.d.d(this.e, bArr).getBytes();
                    aVarX.v(a82.S(bytes)).w(a82.S(x41.e(bytes)));
                    file2.createNewFile();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArrF = ((fm0.c) ((l92) aVarX.P())).f();
                        fileOutputStream.write(bArrF, 0, bArrF.length);
                        fileOutputStream.close();
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        p(file3);
                    } catch (j62 | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        p(file3);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        p(file3);
                        throw th;
                    }
                } catch (j62 | IOException | NoSuchAlgorithmException unused9) {
                    fileOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (j62 | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i(int r4, fm0.a aVar) {
        if (r4 < 4) {
            return aVar == null || !aVar.h0() || aVar.Z().equals("0000000000000000000000000000000000000000000000000000000000000000") || !aVar.s0() || !aVar.t0().H() || aVar.t0().I() == -2;
        }
        return false;
    }

    private static void k(String str) {
        p(new File(str));
    }

    private final boolean n(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (file3.exists()) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                p(file2);
                return false;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        Log.d(r, "Cannot read the cache data.");
                        p(file2);
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        return false;
                    }
                    fm0.c cVarI = fm0.c.I(bArr, y82.c());
                    if (str.equals(new String(cVarI.M().c())) && Arrays.equals(cVarI.L().c(), x41.e(cVarI.K().c())) && Arrays.equals(cVarI.N().c(), Build.VERSION.SDK.getBytes())) {
                        byte[] bArrB = this.d.b(this.e, new String(cVarI.K().c()));
                        file3.createNewFile();
                        fileOutputStream = new FileOutputStream(file3);
                        try {
                            fileOutputStream.write(bArrB, 0, bArrB.length);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused2) {
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                            return true;
                        } catch (j62 | IOException | NoSuchAlgorithmException unused4) {
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused6) {
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused7) {
                                }
                            }
                            if (fileOutputStream == null) {
                                throw th;
                            }
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException unused8) {
                                throw th;
                            }
                        }
                    }
                    p(file2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused9) {
                    }
                    return false;
                } catch (j62 | IOException | NoSuchAlgorithmException unused10) {
                    fileOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (j62 | IOException | NoSuchAlgorithmException unused11) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static void p(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            Log.d(r, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    public final Future A() {
        return this.k;
    }

    public final com.google.android.gms.ads.e0.a D() throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.g) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        Future future = this.h;
        if (future != null) {
            try {
                future.get(2000L, TimeUnit.MILLISECONDS);
                this.h = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.h.cancel(true);
            }
        }
        return this.f;
    }

    public final Context a() {
        return this.f3958a;
    }

    public final boolean b() {
        return this.p;
    }

    public final Method e(String str, String str2) {
        yg2 yg2Var = this.o.get(new Pair(str, str2));
        if (yg2Var == null) {
            return null;
        }
        return yg2Var.d();
    }

    @androidx.annotation.x0
    final void f(int r3, boolean z) {
        if (this.n) {
            Future<?> futureSubmit = this.f3959b.submit(new pf2(this, r3, z));
            if (r3 == 0) {
                this.k = futureSubmit;
            }
        }
    }

    public final boolean j(String str, String str2, Class<?>... clsArr) {
        if (this.o.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.o.put(new Pair<>(str, str2), new yg2(this, str, str2, clsArr));
        return true;
    }

    @androidx.annotation.x0
    final fm0.a l(int r1, boolean z) throws InterruptedException {
        if (r1 > 0 && z) {
            try {
                Thread.sleep(r1 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        return C();
    }

    public final int o() {
        if (this.l != null) {
            return vs1.e();
        }
        return Integer.MIN_VALUE;
    }

    public final boolean q() {
        return this.q.a();
    }

    public final ExecutorService r() {
        return this.f3959b;
    }

    public final DexClassLoader s() {
        return this.f3960c;
    }

    public final k72 t() {
        return this.d;
    }

    public final byte[] u() {
        return this.e;
    }

    public final boolean v() {
        return this.m;
    }

    public final vs1 w() {
        return this.l;
    }

    public final boolean x() {
        return this.n;
    }

    final hf2 y() {
        return this.q;
    }

    public final fm0.a z() {
        return this.j;
    }
}
