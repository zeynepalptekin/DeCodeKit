package c.a.b.b.d;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class y extends w {
    private static final WeakReference<byte[]> g = new WeakReference<>(null);
    private WeakReference<byte[]> f;

    y(byte[] bArr) {
        super(bArr);
        this.f = g;
    }

    protected abstract byte[] D2();

    @Override // c.a.b.b.d.w
    final byte[] e2() {
        byte[] bArrD2;
        synchronized (this) {
            bArrD2 = this.f.get();
            if (bArrD2 == null) {
                bArrD2 = D2();
                this.f = new WeakReference<>(bArrD2);
            }
        }
        return bArrD2;
    }
}
