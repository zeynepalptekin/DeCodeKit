package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class fh2 extends l92<fh2, a> implements za2 {
    private static final fh2 zzach;
    private static volatile kb2<fh2> zzel;
    private String zzacc = "";
    private String zzacd = "";
    private long zzace;
    private long zzacf;
    private long zzacg;
    private int zzdw;

    public static final class a extends l92.b<fh2, a> implements za2 {
        private a() {
            super(fh2.zzach);
        }

        /* synthetic */ a(gh2 gh2Var) {
            this();
        }

        public final a A(long j) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((fh2) this.e).W(j);
            return this;
        }

        public final a v(String str) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((fh2) this.e).J(str);
            return this;
        }

        public final a w(String str) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((fh2) this.e).K(str);
            return this;
        }

        public final a x(long j) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((fh2) this.e).R(j);
            return this;
        }

        public final a z(long j) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((fh2) this.e).T(j);
            return this;
        }
    }

    static {
        fh2 fh2Var = new fh2();
        zzach = fh2Var;
        l92.w(fh2.class, fh2Var);
    }

    private fh2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(String str) {
        str.getClass();
        this.zzdw |= 1;
        this.zzacc = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(String str) {
        str.getClass();
        this.zzdw |= 2;
        this.zzacd = str;
    }

    public static fh2 L(a82 a82Var, y82 y82Var) throws w92 {
        return (fh2) l92.m(zzach, a82Var, y82Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(long j) {
        this.zzdw |= 4;
        this.zzace = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(long j) {
        this.zzdw |= 8;
        this.zzacf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(long j) {
        this.zzdw |= 16;
        this.zzacg = j;
    }

    public static a Z() {
        return zzach.z();
    }

    public static fh2 a0() {
        return zzach;
    }

    public static fh2 c0(a82 a82Var) throws w92 {
        return (fh2) l92.l(zzach, a82Var);
    }

    public final String Q() {
        return this.zzacc;
    }

    public final String S() {
        return this.zzacd;
    }

    public final long U() {
        return this.zzace;
    }

    public final long X() {
        return this.zzacf;
    }

    public final long Y() {
        return this.zzacg;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        gh2 gh2Var = null;
        switch (gh2.f3539a[r2 - 1]) {
            case 1:
                return new fh2();
            case 2:
                return new a(gh2Var);
            case 3:
                return l92.u(zzach, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzdw", "zzacc", "zzacd", "zzace", "zzacf", "zzacg"});
            case 4:
                return zzach;
            case 5:
                kb2<fh2> aVar = zzel;
                if (aVar == null) {
                    synchronized (fh2.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzach);
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
