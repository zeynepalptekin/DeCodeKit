package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class vk implements rk2 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, xm> f5692a;

    /* renamed from: b, reason: collision with root package name */
    private long f5693b;

    /* renamed from: c, reason: collision with root package name */
    private final zo f5694c;
    private final int d;

    public vk(zo zoVar) {
        this(zoVar, 5242880);
    }

    private vk(zo zoVar, int r5) {
        this.f5692a = new LinkedHashMap(16, 0.75f, true);
        this.f5693b = 0L;
        this.f5694c = zoVar;
        this.d = 5242880;
    }

    public vk(File file, int r5) {
        this.f5692a = new LinkedHashMap(16, 0.75f, true);
        this.f5693b = 0L;
        this.f5694c = new yn(this, file);
        this.d = 20971520;
    }

    private final synchronized void a(String str) {
        boolean zDelete = o(str).delete();
        b(str);
        if (!zDelete) {
            qf.a("Could not delete cache entry for key=%s, filename=%s", str, n(str));
        }
    }

    private final void b(String str) {
        xm xmVarRemove = this.f5692a.remove(str);
        if (xmVarRemove != null) {
            this.f5693b -= xmVarRemove.f5997a;
        }
    }

    private static int c(InputStream inputStream) throws IOException {
        int r1 = inputStream.read();
        if (r1 != -1) {
            return r1;
        }
        throw new EOFException();
    }

    @androidx.annotation.x0
    private static InputStream d(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    static String e(bq bqVar) throws IOException {
        return new String(j(bqVar, m(bqVar)), "UTF-8");
    }

    static void f(OutputStream outputStream, int r2) throws IOException {
        outputStream.write(r2 & 255);
        outputStream.write((r2 >> 8) & 255);
        outputStream.write((r2 >> 16) & 255);
        outputStream.write(r2 >>> 24);
    }

    static void g(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void h(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        g(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final void i(String str, xm xmVar) {
        if (this.f5692a.containsKey(str)) {
            this.f5693b += xmVar.f5997a - this.f5692a.get(str).f5997a;
        } else {
            this.f5693b += xmVar.f5997a;
        }
        this.f5692a.put(str, xmVar);
    }

    @androidx.annotation.x0
    private static byte[] j(bq bqVar, long j) throws IOException {
        long jA = bqVar.a();
        if (j >= 0 && j <= jA) {
            int r2 = (int) j;
            if (r2 == j) {
                byte[] bArr = new byte[r2];
                new DataInputStream(bqVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(jA);
        throw new IOException(sb.toString());
    }

    static int k(InputStream inputStream) throws IOException {
        return (c(inputStream) << 24) | c(inputStream) | 0 | (c(inputStream) << 8) | (c(inputStream) << 16);
    }

    static List<bv2> l(bq bqVar) throws IOException {
        int r0 = k(bqVar);
        if (r0 < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(r0);
            throw new IOException(sb.toString());
        }
        List<bv2> listEmptyList = r0 == 0 ? Collections.emptyList() : new ArrayList<>();
        for (int r2 = 0; r2 < r0; r2++) {
            listEmptyList.add(new bv2(e(bqVar).intern(), e(bqVar).intern()));
        }
        return listEmptyList;
    }

    static long m(InputStream inputStream) throws IOException {
        return (c(inputStream) & 255) | 0 | ((c(inputStream) & 255) << 8) | ((c(inputStream) & 255) << 16) | ((c(inputStream) & 255) << 24) | ((c(inputStream) & 255) << 32) | ((c(inputStream) & 255) << 40) | ((c(inputStream) & 255) << 48) | ((255 & c(inputStream)) << 56);
    }

    private static String n(String str) {
        int length = str.length() / 2;
        String strValueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String strValueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    private final File o(String str) {
        return new File(this.f5694c.O(), n(str));
    }

    @Override // com.google.android.gms.internal.ads.rk2
    public final synchronized void E0() {
        File fileO = this.f5694c.O();
        if (!fileO.exists()) {
            if (!fileO.mkdirs()) {
                qf.b("Unable to create cache dir %s", fileO.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = fileO.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                long length = file.length();
                bq bqVar = new bq(new BufferedInputStream(d(file)), length);
                try {
                    xm xmVarB = xm.b(bqVar);
                    xmVarB.f5997a = length;
                    i(xmVarB.f5998b, xmVarB);
                    bqVar.close();
                } catch (Throwable th) {
                    bqVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rk2
    public final synchronized un2 F0(String str) {
        xm xmVar = this.f5692a.get(str);
        if (xmVar == null) {
            return null;
        }
        File fileO = o(str);
        try {
            bq bqVar = new bq(new BufferedInputStream(d(fileO)), fileO.length());
            try {
                xm xmVarB = xm.b(bqVar);
                if (!TextUtils.equals(str, xmVarB.f5998b)) {
                    qf.a("%s: key=%s, found=%s", fileO.getAbsolutePath(), str, xmVarB.f5998b);
                    b(str);
                    return null;
                }
                byte[] bArrJ = j(bqVar, bqVar.a());
                un2 un2Var = new un2();
                un2Var.f5560a = bArrJ;
                un2Var.f5561b = xmVar.f5999c;
                un2Var.f5562c = xmVar.d;
                un2Var.d = xmVar.e;
                un2Var.e = xmVar.f;
                un2Var.f = xmVar.g;
                List<bv2> list = xmVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (bv2 bv2Var : list) {
                    treeMap.put(bv2Var.a(), bv2Var.b());
                }
                un2Var.g = treeMap;
                un2Var.h = Collections.unmodifiableList(xmVar.h);
                return un2Var;
            } finally {
                bqVar.close();
            }
        } catch (IOException e) {
            qf.a("%s: %s", fileO.getAbsolutePath(), e.toString());
            a(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.rk2
    public final synchronized void G0(String str, un2 un2Var) {
        long j;
        if (this.f5693b + un2Var.f5560a.length <= this.d || un2Var.f5560a.length <= this.d * 0.9f) {
            File fileO = o(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileO));
                xm xmVar = new xm(str, un2Var);
                if (!xmVar.a(bufferedOutputStream)) {
                    bufferedOutputStream.close();
                    qf.a("Failed to write header for %s", fileO.getAbsolutePath());
                    throw new IOException();
                }
                bufferedOutputStream.write(un2Var.f5560a);
                bufferedOutputStream.close();
                xmVar.f5997a = fileO.length();
                i(str, xmVar);
                if (this.f5693b >= this.d) {
                    if (qf.f4995b) {
                        qf.c("Pruning old cache entries.", new Object[0]);
                    }
                    long j2 = this.f5693b;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator<Map.Entry<String, xm>> it = this.f5692a.entrySet().iterator();
                    int r2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            j = j2;
                            break;
                        }
                        xm value = it.next().getValue();
                        if (o(value.f5998b).delete()) {
                            j = j2;
                            this.f5693b -= value.f5997a;
                        } else {
                            j = j2;
                            qf.a("Could not delete cache entry for key=%s, filename=%s", value.f5998b, n(value.f5998b));
                        }
                        it.remove();
                        r2++;
                        if (this.f5693b < this.d * 0.9f) {
                            break;
                        } else {
                            j2 = j;
                        }
                    }
                    if (qf.f4995b) {
                        qf.c("pruned %d files, %d bytes, %d ms", Integer.valueOf(r2), Long.valueOf(this.f5693b - j), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                    }
                }
            } catch (IOException unused) {
                if (!fileO.delete()) {
                    qf.a("Could not clean up file %s", fileO.getAbsolutePath());
                }
                if (this.f5694c.O().exists()) {
                    return;
                }
                qf.a("Re-initializing cache after external clearing.", new Object[0]);
                this.f5692a.clear();
                this.f5693b = 0L;
                E0();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rk2
    public final synchronized void H0(String str, boolean z) {
        un2 un2VarF0 = F0(str);
        if (un2VarF0 != null) {
            un2VarF0.f = 0L;
            un2VarF0.e = 0L;
            G0(str, un2VarF0);
        }
    }
}
