package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class e32 extends l92<e32, a> implements za2 {
    private static volatile kb2<e32> zzel;
    private static final e32 zzhxp;
    private int zzhwq;
    private a82 zzhwr = a82.e;

    public static final class a extends l92.b<e32, a> implements za2 {
        private a() {
            super(e32.zzhxp);
        }

        /* synthetic */ a(f32 f32Var) {
            this();
        }

        public final a v(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((e32) this.e).I(0);
            return this;
        }

        public final a w(a82 a82Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((e32) this.e).Q(a82Var);
            return this;
        }
    }

    static {
        e32 e32Var = new e32();
        zzhxp = e32Var;
        l92.w(e32.class, e32Var);
    }

    private e32() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    public static a M() {
        return zzhxp.z();
    }

    public static e32 O(a82 a82Var, y82 y82Var) throws w92 {
        return (e32) l92.m(zzhxp, a82Var, y82Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(a82 a82Var) {
        a82Var.getClass();
        this.zzhwr = a82Var;
    }

    public final int H() {
        return this.zzhwq;
    }

    public final a82 L() {
        return this.zzhwr;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        f32 f32Var = null;
        switch (f32.f3369a[r2 - 1]) {
            case 1:
                return new e32();
            case 2:
                return new a(f32Var);
            case 3:
                return l92.u(zzhxp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzhwq", "zzhwr"});
            case 4:
                return zzhxp;
            case 5:
                kb2<e32> aVar = zzel;
                if (aVar == null) {
                    synchronized (e32.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxp);
                            zzel = aVar;
                        }
                    }
                }
                return aVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
