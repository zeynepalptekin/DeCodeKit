package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class e22 extends l92<e22, a> implements za2 {
    private static volatile kb2<e22> zzel;
    private static final e22 zzhwt;
    private int zzhwq;
    private a82 zzhwr = a82.e;
    private j22 zzhws;

    public static final class a extends l92.b<e22, a> implements za2 {
        private a() {
            super(e22.zzhwt);
        }

        /* synthetic */ a(d22 d22Var) {
            this();
        }

        public final a v(j22 j22Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((e22) this.e).S(j22Var);
            return this;
        }

        public final a w(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((e22) this.e).I(0);
            return this;
        }

        public final a x(a82 a82Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((e22) this.e).T(a82Var);
            return this;
        }
    }

    static {
        e22 e22Var = new e22();
        zzhwt = e22Var;
        l92.w(e22.class, e22Var);
    }

    private e22() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    public static a O() {
        return zzhwt.z();
    }

    public static e22 R(a82 a82Var, y82 y82Var) throws w92 {
        return (e22) l92.m(zzhwt, a82Var, y82Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(j22 j22Var) {
        j22Var.getClass();
        this.zzhws = j22Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(a82 a82Var) {
        a82Var.getClass();
        this.zzhwr = a82Var;
    }

    public final int H() {
        return this.zzhwq;
    }

    public final a82 M() {
        return this.zzhwr;
    }

    public final j22 N() {
        j22 j22Var = this.zzhws;
        return j22Var == null ? j22.I() : j22Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        d22 d22Var = null;
        switch (d22.f3062a[r2 - 1]) {
            case 1:
                return new e22();
            case 2:
                return new a(d22Var);
            case 3:
                return l92.u(zzhwt, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzhwq", "zzhwr", "zzhws"});
            case 4:
                return zzhwt;
            case 5:
                kb2<e22> aVar = zzel;
                if (aVar == null) {
                    synchronized (e22.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhwt);
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
