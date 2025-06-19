package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class h9 implements p8 {

    /* renamed from: a, reason: collision with root package name */
    private final r8 f1715a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1716b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f1717c;
    private final int d;

    h9(r8 r8Var, String str, Object[] objArr) {
        this.f1715a = r8Var;
        this.f1716b = str;
        this.f1717c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int r4 = cCharAt & 8191;
        int r0 = 13;
        int r1 = 1;
        while (true) {
            int r2 = r1 + 1;
            char cCharAt2 = str.charAt(r1);
            if (cCharAt2 < 55296) {
                this.d = r4 | (cCharAt2 << r0);
                return;
            } else {
                r4 |= (cCharAt2 & 8191) << r0;
                r0 += 13;
                r1 = r2;
            }
        }
    }

    @Override // c.a.b.b.g.c.p8
    public final int a() {
        return (this.d & 1) == 1 ? g9.f1697a : g9.f1698b;
    }

    @Override // c.a.b.b.g.c.p8
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // c.a.b.b.g.c.p8
    public final r8 c() {
        return this.f1715a;
    }

    final String d() {
        return this.f1716b;
    }

    final Object[] e() {
        return this.f1717c;
    }
}
