package c.a.b.b.d;

import java.util.Arrays;

/* loaded from: classes.dex */
final class z extends w {
    private final byte[] f;

    z(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f = bArr;
    }

    @Override // c.a.b.b.d.w
    final byte[] e2() {
        return this.f;
    }
}
