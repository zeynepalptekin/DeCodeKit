package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@androidx.annotation.x0
/* loaded from: classes.dex */
final class xm {

    /* renamed from: a, reason: collision with root package name */
    long f5997a;

    /* renamed from: b, reason: collision with root package name */
    final String f5998b;

    /* renamed from: c, reason: collision with root package name */
    final String f5999c;
    final long d;
    final long e;
    final long f;
    final long g;
    final List<bv2> h;

    /* JADX WARN: Illegal instructions before constructor call */
    xm(String str, un2 un2Var) {
        String str2 = un2Var.f5561b;
        long j = un2Var.f5562c;
        long j2 = un2Var.d;
        long j3 = un2Var.e;
        long j4 = un2Var.f;
        List arrayList = un2Var.h;
        if (arrayList == null) {
            Map<String, String> map = un2Var.g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new bv2(entry.getKey(), entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    private xm(String str, String str2, long j, long j2, long j3, long j4, List<bv2> list) {
        this.f5998b = str;
        this.f5999c = "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    static xm b(bq bqVar) throws IOException {
        if (vk.k(bqVar) == 538247942) {
            return new xm(vk.e(bqVar), vk.e(bqVar), vk.m(bqVar), vk.m(bqVar), vk.m(bqVar), vk.m(bqVar), vk.l(bqVar));
        }
        throw new IOException();
    }

    final boolean a(OutputStream outputStream) throws IOException {
        try {
            vk.f(outputStream, 538247942);
            vk.h(outputStream, this.f5998b);
            vk.h(outputStream, this.f5999c == null ? "" : this.f5999c);
            vk.g(outputStream, this.d);
            vk.g(outputStream, this.e);
            vk.g(outputStream, this.f);
            vk.g(outputStream, this.g);
            List<bv2> list = this.h;
            if (list != null) {
                vk.f(outputStream, list.size());
                for (bv2 bv2Var : list) {
                    vk.h(outputStream, bv2Var.a());
                    vk.h(outputStream, bv2Var.b());
                }
            } else {
                vk.f(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            qf.a("%s", e.toString());
            return false;
        }
    }
}
