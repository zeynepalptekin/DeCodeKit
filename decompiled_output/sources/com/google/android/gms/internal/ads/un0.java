package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class un0 {

    /* renamed from: a, reason: collision with root package name */
    private final iq f5556a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f5557b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f5558c;

    public un0(iq iqVar, com.google.android.gms.common.util.g gVar, Executor executor) {
        this.f5556a = iqVar;
        this.f5557b = gVar;
        this.f5558c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap b(byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) qx2.e().c(e0.p4)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int r6 = options.outWidth * options.outHeight;
            if (r6 > 0) {
                int r62 = r6 - 1;
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros(r62 / ((Integer) qx2.e().c(e0.q4)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }

    private final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long jC = this.f5557b.c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jC2 = this.f5557b.c();
        if (Build.VERSION.SDK_INT >= 19 && bitmapDecodeByteArray != null) {
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            long j = jC2 - jC;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            oo.m(sb.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final dy1<Bitmap> d(String str, double d, boolean z) {
        return qx1.i(iq.d(str), new xn0(this, d, z), this.f5558c);
    }
}
