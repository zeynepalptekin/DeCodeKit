package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class t32 extends l92<t32, a> implements za2 {
    private static volatile kb2<t32> zzel;
    private static final t32 zzhyj;
    private int zzhwq;
    private p32 zzhxz;
    private a82 zzhyh;
    private a82 zzhyi;

    public static final class a extends l92.b<t32, a> implements za2 {
        private a() {
            super(t32.zzhyj);
        }

        /* synthetic */ a(u32 u32Var) {
            this();
        }

        public final a v(a82 a82Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((t32) this.e).X(a82Var);
            return this;
        }

        public final a w(a82 a82Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((t32) this.e).Y(a82Var);
            return this;
        }

        public final a x(p32 p32Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((t32) this.e).M(p32Var);
            return this;
        }

        public final a z(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((t32) this.e).I(0);
            return this;
        }
    }

    static {
        t32 t32Var = new t32();
        zzhyj = t32Var;
        l92.w(t32.class, t32Var);
    }

    private t32() {
        a82 a82Var = a82.e;
        this.zzhyh = a82Var;
        this.zzhyi = a82Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(p32 p32Var) {
        p32Var.getClass();
        this.zzhxz = p32Var;
    }

    public static a S() {
        return zzhyj.z();
    }

    public static t32 T() {
        return zzhyj;
    }

    public static t32 W(a82 a82Var, y82 y82Var) throws w92 {
        return (t32) l92.m(zzhyj, a82Var, y82Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(a82 a82Var) {
        a82Var.getClass();
        this.zzhyh = a82Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(a82 a82Var) {
        a82Var.getClass();
        this.zzhyi = a82Var;
    }

    public final int H() {
        return this.zzhwq;
    }

    public final p32 O() {
        p32 p32Var = this.zzhxz;
        return p32Var == null ? p32.K() : p32Var;
    }

    public final a82 Q() {
        return this.zzhyh;
    }

    public final a82 R() {
        return this.zzhyi;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        u32 u32Var = null;
        switch (u32.f5476a[r2 - 1]) {
            case 1:
                return new t32();
            case 2:
                return new a(u32Var);
            case 3:
                return l92.u(zzhyj, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzhwq", "zzhxz", "zzhyh", "zzhyi"});
            case 4:
                return zzhyj;
            case 5:
                kb2<t32> aVar = zzel;
                if (aVar == null) {
                    synchronized (t32.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhyj);
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
