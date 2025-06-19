package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;
import java.util.List;

/* loaded from: classes.dex */
public final class r42 extends l92<r42, a> implements za2 {
    private static volatile kb2<r42> zzel;
    private static final r42 zziah;
    private int zziaf;
    private x92<b> zziag = l92.F();

    public static final class a extends l92.b<r42, a> implements za2 {
        private a() {
            super(r42.zziah);
        }

        /* synthetic */ a(s42 s42Var) {
            this();
        }
    }

    public static final class b extends l92<b, a> implements za2 {
        private static volatile kb2<b> zzel;
        private static final b zzial;
        private int zzhzy;
        private j42 zziai;
        private int zziaj;
        private int zziak;

        public static final class a extends l92.b<b, a> implements za2 {
            private a() {
                super(b.zzial);
            }

            /* synthetic */ a(s42 s42Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzial = bVar;
            l92.w(b.class, bVar);
        }

        private b() {
        }

        public final k42 H() {
            k42 k42VarE = k42.e(this.zziaj);
            return k42VarE == null ? k42.UNRECOGNIZED : k42VarE;
        }

        public final d52 I() {
            d52 d52VarE = d52.e(this.zzhzy);
            return d52VarE == null ? d52.UNRECOGNIZED : d52VarE;
        }

        public final boolean J() {
            return this.zziai != null;
        }

        public final j42 K() {
            j42 j42Var = this.zziai;
            return j42Var == null ? j42.R() : j42Var;
        }

        public final int L() {
            return this.zziak;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            s42 s42Var = null;
            switch (s42.f5219a[r2 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(s42Var);
                case 3:
                    return l92.u(zzial, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zziai", "zziaj", "zziak", "zzhzy"});
                case 4:
                    return zzial;
                case 5:
                    kb2<b> aVar = zzel;
                    if (aVar == null) {
                        synchronized (b.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzial);
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

    static {
        r42 r42Var = new r42();
        zziah = r42Var;
        l92.w(r42.class, r42Var);
    }

    private r42() {
    }

    public static r42 L(byte[] bArr, y82 y82Var) throws w92 {
        return (r42) l92.q(zziah, bArr, y82Var);
    }

    public final int H() {
        return this.zziaf;
    }

    public final List<b> I() {
        return this.zziag;
    }

    public final int J() {
        return this.zziag.size();
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        s42 s42Var = null;
        switch (s42.f5219a[r2 - 1]) {
            case 1:
                return new r42();
            case 2:
                return new a(s42Var);
            case 3:
                return l92.u(zziah, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zziaf", "zziag", b.class});
            case 4:
                return zziah;
            case 5:
                kb2<r42> aVar = zzel;
                if (aVar == null) {
                    synchronized (r42.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zziah);
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
