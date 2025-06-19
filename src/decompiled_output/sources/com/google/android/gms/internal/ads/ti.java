package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class ti {
    private static final Comparator<byte[]> e = new wl();

    /* renamed from: a, reason: collision with root package name */
    private final List<byte[]> f5400a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f5401b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f5402c = 0;
    private final int d = 4096;

    public ti(int r2) {
    }

    private final synchronized void c() {
        while (this.f5402c > this.d) {
            byte[] bArrRemove = this.f5400a.remove(0);
            this.f5401b.remove(bArrRemove);
            this.f5402c -= bArrRemove.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.d) {
                this.f5400a.add(bArr);
                int r0 = Collections.binarySearch(this.f5401b, bArr, e);
                if (r0 < 0) {
                    r0 = (-r0) - 1;
                }
                this.f5401b.add(r0, bArr);
                this.f5402c += bArr.length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int r4) {
        for (int r0 = 0; r0 < this.f5401b.size(); r0++) {
            byte[] bArr = this.f5401b.get(r0);
            if (bArr.length >= r4) {
                this.f5402c -= bArr.length;
                this.f5401b.remove(r0);
                this.f5400a.remove(bArr);
                return bArr;
            }
        }
        return new byte[r4];
    }
}
