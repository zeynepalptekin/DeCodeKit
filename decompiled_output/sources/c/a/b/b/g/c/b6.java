package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class b6 extends j6 {
    private final int i;
    private final int j;

    b6(byte[] bArr, int r3, int r4) {
        super(bArr);
        y5.x(r3, r3 + r4, bArr.length);
        this.i = r3;
        this.j = r4;
    }

    @Override // c.a.b.b.g.c.j6
    protected final int E() {
        return this.i;
    }

    @Override // c.a.b.b.g.c.j6, c.a.b.b.g.c.y5
    public final byte c(int r5) {
        int r0 = h();
        if (((r0 - (r5 + 1)) | r5) >= 0) {
            return this.h[this.i + r5];
        }
        if (r5 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(r5);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(r5);
        sb2.append(", ");
        sb2.append(r0);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // c.a.b.b.g.c.j6, c.a.b.b.g.c.y5
    public final int h() {
        return this.j;
    }

    @Override // c.a.b.b.g.c.j6, c.a.b.b.g.c.y5
    final byte u(int r3) {
        return this.h[this.i + r3];
    }
}
