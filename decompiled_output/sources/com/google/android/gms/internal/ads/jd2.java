package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class jd2 {

    public static final class a extends l92<a, b> implements za2 {
        private static volatile kb2<a> zzel;
        private static final a zziqi;
        private int zzdw;
        private int zziqb;
        private C0178a zziqc;
        private a82 zziqd;
        private a82 zziqe;
        private boolean zziqf;
        private boolean zziqg;
        private byte zziqh = 2;

        /* renamed from: com.google.android.gms.internal.ads.jd2$a$a, reason: collision with other inner class name */
        public static final class C0178a extends l92<C0178a, C0179a> implements za2 {
            private static volatile kb2<C0178a> zzel;
            private static final C0178a zziqn;
            private int zzdw;
            private String zziqj = "";
            private String zziqk = "";
            private String zziql = "";
            private int zziqm;

            /* renamed from: com.google.android.gms.internal.ads.jd2$a$a$a, reason: collision with other inner class name */
            public static final class C0179a extends l92.b<C0178a, C0179a> implements za2 {
                private C0179a() {
                    super(C0178a.zziqn);
                }

                /* synthetic */ C0179a(ld2 ld2Var) {
                    this();
                }
            }

            static {
                C0178a c0178a = new C0178a();
                zziqn = c0178a;
                l92.w(C0178a.class, c0178a);
            }

            private C0178a() {
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r2, Object obj, Object obj2) {
                ld2 ld2Var = null;
                switch (ld2.f4244a[r2 - 1]) {
                    case 1:
                        return new C0178a();
                    case 2:
                        return new C0179a(ld2Var);
                    case 3:
                        return l92.u(zziqn, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zzdw", "zziqj", "zziqk", "zziql", "zziqm"});
                    case 4:
                        return zziqn;
                    case 5:
                        kb2<C0178a> aVar = zzel;
                        if (aVar == null) {
                            synchronized (C0178a.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zziqn);
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

        public static final class b extends l92.b<a, b> implements za2 {
            private b() {
                super(a.zziqi);
            }

            /* synthetic */ b(ld2 ld2Var) {
                this();
            }
        }

        public enum c implements r92 {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);

            private static final q92<c> j = new nd2();
            private final int d;

            c(int r3) {
                this.d = r3;
            }

            public static c e(int r1) {
                if (r1 == 0) {
                    return SAFE;
                }
                if (r1 == 1) {
                    return DANGEROUS;
                }
                if (r1 == 2) {
                    return UNKNOWN;
                }
                if (r1 == 3) {
                    return POTENTIALLY_UNWANTED;
                }
                if (r1 != 4) {
                    return null;
                }
                return DANGEROUS_HOST;
            }

            public static t92 g() {
                return md2.f4391a;
            }

            @Override // com.google.android.gms.internal.ads.r92
            public final int h() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        static {
            a aVar = new a();
            zziqi = aVar;
            l92.w(a.class, aVar);
        }

        private a() {
            a82 a82Var = a82.e;
            this.zziqd = a82Var;
            this.zziqe = a82Var;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r3, Object obj, Object obj2) {
            ld2 ld2Var = null;
            switch (ld2.f4244a[r3 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new b(ld2Var);
                case 3:
                    return l92.u(zziqi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᔌ\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzdw", "zziqb", c.g(), "zziqc", "zziqd", "zziqe", "zziqf", "zziqg"});
                case 4:
                    return zziqi;
                case 5:
                    kb2<a> aVar = zzel;
                    if (aVar == null) {
                        synchronized (a.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zziqi);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return Byte.valueOf(this.zziqh);
                case 7:
                    this.zziqh = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class b extends l92<b, a> implements za2 {
        private static volatile kb2<b> zzel;
        private static final b zzirj;
        private int zzbzr;
        private int zzdw;
        private int zziqu;
        private C0180b zziqx;
        private f zzira;
        private boolean zzirb;
        private boolean zzire;
        private boolean zzirf;
        private i zzirg;
        private byte zziqh = 2;
        private String zziqk = "";
        private String zziqv = "";
        private String zziqw = "";
        private x92<h> zziqy = l92.F();
        private String zziqz = "";
        private x92<String> zzirc = l92.F();
        private String zzird = "";
        private a82 zziqd = a82.e;
        private x92<String> zzirh = l92.F();
        private x92<String> zziri = l92.F();

        public static final class a extends l92.b<b, a> implements za2 {
            private a() {
                super(b.zzirj);
            }

            /* synthetic */ a(ld2 ld2Var) {
                this();
            }

            public final a A(h hVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((b) this.e).W(hVar);
                return this;
            }

            public final a C(i iVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((b) this.e).X(iVar);
                return this;
            }

            public final List<h> D() {
                return Collections.unmodifiableList(((b) this.e).a0());
            }

            public final String F() {
                return ((b) this.e).b0();
            }

            public final a G() {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((b) this.e).c0();
                return this;
            }

            public final a J(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((b) this.e).I(str);
                return this;
            }

            public final a K(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((b) this.e).h0(str);
                return this;
            }

            public final a L(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((b) this.e).g0(str);
                return this;
            }

            public final a M(Iterable<String> iterable) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((b) this.e).i0(iterable);
                return this;
            }

            public final a N(Iterable<String> iterable) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((b) this.e).j0(iterable);
                return this;
            }

            public final String v() {
                return ((b) this.e).H();
            }

            public final a w(C0180b c0180b) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((b) this.e).S(c0180b);
                return this;
            }

            public final a x(f fVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((b) this.e).T(fVar);
                return this;
            }

            public final a z(g gVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((b) this.e).U(gVar);
                return this;
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.jd2$b$b, reason: collision with other inner class name */
        public static final class C0180b extends l92<C0180b, a> implements za2 {
            private static volatile kb2<C0180b> zzel;
            private static final C0180b zzirl;
            private int zzdw;
            private String zzirk = "";

            /* renamed from: com.google.android.gms.internal.ads.jd2$b$b$a */
            public static final class a extends l92.b<C0180b, a> implements za2 {
                private a() {
                    super(C0180b.zzirl);
                }

                /* synthetic */ a(ld2 ld2Var) {
                    this();
                }

                public final a v(String str) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((C0180b) this.e).K(str);
                    return this;
                }
            }

            static {
                C0180b c0180b = new C0180b();
                zzirl = c0180b;
                l92.w(C0180b.class, c0180b);
            }

            private C0180b() {
            }

            public static a I() {
                return zzirl.z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void K(String str) {
                str.getClass();
                this.zzdw |= 1;
                this.zzirk = str;
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r2, Object obj, Object obj2) {
                ld2 ld2Var = null;
                switch (ld2.f4244a[r2 - 1]) {
                    case 1:
                        return new C0180b();
                    case 2:
                        return new a(ld2Var);
                    case 3:
                        return l92.u(zzirl, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzdw", "zzirk"});
                    case 4:
                        return zzirl;
                    case 5:
                        kb2<C0180b> aVar = zzel;
                        if (aVar == null) {
                            synchronized (C0180b.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zzirl);
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

        public static final class c extends l92<c, a> implements za2 {
            private static volatile kb2<c> zzel;
            private static final c zzirn;
            private int zzdw;
            private a82 zzhzi;
            private byte zziqh = 2;
            private a82 zzirm;

            public static final class a extends l92.b<c, a> implements za2 {
                private a() {
                    super(c.zzirn);
                }

                /* synthetic */ a(ld2 ld2Var) {
                    this();
                }

                public final a v(a82 a82Var) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((c) this.e).J(a82Var);
                    return this;
                }

                public final a w(a82 a82Var) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((c) this.e).I(a82Var);
                    return this;
                }
            }

            static {
                c cVar = new c();
                zzirn = cVar;
                l92.w(c.class, cVar);
            }

            private c() {
                a82 a82Var = a82.e;
                this.zzirm = a82Var;
                this.zzhzi = a82Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void I(a82 a82Var) {
                a82Var.getClass();
                this.zzdw |= 2;
                this.zzhzi = a82Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void J(a82 a82Var) {
                a82Var.getClass();
                this.zzdw |= 1;
                this.zzirm = a82Var;
            }

            public static a L() {
                return zzirn.z();
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r3, Object obj, Object obj2) {
                ld2 ld2Var = null;
                switch (ld2.f4244a[r3 - 1]) {
                    case 1:
                        return new c();
                    case 2:
                        return new a(ld2Var);
                    case 3:
                        return l92.u(zzirn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzdw", "zzirm", "zzhzi"});
                    case 4:
                        return zzirn;
                    case 5:
                        kb2<c> aVar = zzel;
                        if (aVar == null) {
                            synchronized (c.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zzirn);
                                    zzel = aVar;
                                }
                            }
                        }
                        return aVar;
                    case 6:
                        return Byte.valueOf(this.zziqh);
                    case 7:
                        this.zziqh = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class d extends l92<d, a> implements za2 {
            private static volatile kb2<d> zzel;
            private static final d zzirt;
            private int zzdw;
            private C0181b zziro;
            private a82 zzirq;
            private a82 zzirr;
            private int zzirs;
            private byte zziqh = 2;
            private x92<c> zzirp = l92.F();

            public static final class a extends l92.b<d, a> implements za2 {
                private a() {
                    super(d.zzirt);
                }

                /* synthetic */ a(ld2 ld2Var) {
                    this();
                }

                public final a v(c cVar) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((d) this.e).I(cVar);
                    return this;
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.jd2$b$d$b, reason: collision with other inner class name */
            public static final class C0181b extends l92<C0181b, a> implements za2 {
                private static volatile kb2<C0181b> zzel;
                private static final C0181b zzirx;
                private int zzdw;
                private a82 zziru;
                private a82 zzirv;
                private a82 zzirw;

                /* renamed from: com.google.android.gms.internal.ads.jd2$b$d$b$a */
                public static final class a extends l92.b<C0181b, a> implements za2 {
                    private a() {
                        super(C0181b.zzirx);
                    }

                    /* synthetic */ a(ld2 ld2Var) {
                        this();
                    }
                }

                static {
                    C0181b c0181b = new C0181b();
                    zzirx = c0181b;
                    l92.w(C0181b.class, c0181b);
                }

                private C0181b() {
                    a82 a82Var = a82.e;
                    this.zziru = a82Var;
                    this.zzirv = a82Var;
                    this.zzirw = a82Var;
                }

                @Override // com.google.android.gms.internal.ads.l92
                protected final Object t(int r2, Object obj, Object obj2) {
                    ld2 ld2Var = null;
                    switch (ld2.f4244a[r2 - 1]) {
                        case 1:
                            return new C0181b();
                        case 2:
                            return new a(ld2Var);
                        case 3:
                            return l92.u(zzirx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zziru", "zzirv", "zzirw"});
                        case 4:
                            return zzirx;
                        case 5:
                            kb2<C0181b> aVar = zzel;
                            if (aVar == null) {
                                synchronized (C0181b.class) {
                                    aVar = zzel;
                                    if (aVar == null) {
                                        aVar = new l92.a<>(zzirx);
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
                d dVar = new d();
                zzirt = dVar;
                l92.w(d.class, dVar);
            }

            private d() {
                a82 a82Var = a82.e;
                this.zzirq = a82Var;
                this.zzirr = a82Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void I(c cVar) {
                cVar.getClass();
                x92<c> x92Var = this.zzirp;
                if (!x92Var.m()) {
                    this.zzirp = l92.s(x92Var);
                }
                this.zzirp.add(cVar);
            }

            public static a J() {
                return zzirt.z();
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r3, Object obj, Object obj2) {
                ld2 ld2Var = null;
                switch (ld2.f4244a[r3 - 1]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(ld2Var);
                    case 3:
                        return l92.u(zzirt, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzdw", "zziro", "zzirp", c.class, "zzirq", "zzirr", "zzirs"});
                    case 4:
                        return zzirt;
                    case 5:
                        kb2<d> aVar = zzel;
                        if (aVar == null) {
                            synchronized (d.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zzirt);
                                    zzel = aVar;
                                }
                            }
                        }
                        return aVar;
                    case 6:
                        return Byte.valueOf(this.zziqh);
                    case 7:
                        this.zziqh = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class e extends l92<e, a> implements za2 {
            private static volatile kb2<e> zzel;
            private static final e zzisa;
            private int zzdw;
            private byte zziqh = 2;
            private x92<c> zzirp = l92.F();
            private a82 zzirq;
            private a82 zzirr;
            private int zzirs;
            private C0182b zziry;
            private a82 zzirz;

            public static final class a extends l92.b<e, a> implements za2 {
                private a() {
                    super(e.zzisa);
                }

                /* synthetic */ a(ld2 ld2Var) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.jd2$b$e$b, reason: collision with other inner class name */
            public static final class C0182b extends l92<C0182b, a> implements za2 {
                private static volatile kb2<C0182b> zzel;
                private static final C0182b zzisd;
                private int zzdw;
                private a82 zzirw;
                private int zzisb;
                private a82 zzisc;

                /* renamed from: com.google.android.gms.internal.ads.jd2$b$e$b$a */
                public static final class a extends l92.b<C0182b, a> implements za2 {
                    private a() {
                        super(C0182b.zzisd);
                    }

                    /* synthetic */ a(ld2 ld2Var) {
                        this();
                    }
                }

                static {
                    C0182b c0182b = new C0182b();
                    zzisd = c0182b;
                    l92.w(C0182b.class, c0182b);
                }

                private C0182b() {
                    a82 a82Var = a82.e;
                    this.zzisc = a82Var;
                    this.zzirw = a82Var;
                }

                @Override // com.google.android.gms.internal.ads.l92
                protected final Object t(int r2, Object obj, Object obj2) {
                    ld2 ld2Var = null;
                    switch (ld2.f4244a[r2 - 1]) {
                        case 1:
                            return new C0182b();
                        case 2:
                            return new a(ld2Var);
                        case 3:
                            return l92.u(zzisd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzisb", "zzisc", "zzirw"});
                        case 4:
                            return zzisd;
                        case 5:
                            kb2<C0182b> aVar = zzel;
                            if (aVar == null) {
                                synchronized (C0182b.class) {
                                    aVar = zzel;
                                    if (aVar == null) {
                                        aVar = new l92.a<>(zzisd);
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
                e eVar = new e();
                zzisa = eVar;
                l92.w(e.class, eVar);
            }

            private e() {
                a82 a82Var = a82.e;
                this.zzirq = a82Var;
                this.zzirr = a82Var;
                this.zzirz = a82Var;
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r3, Object obj, Object obj2) {
                ld2 ld2Var = null;
                switch (ld2.f4244a[r3 - 1]) {
                    case 1:
                        return new e();
                    case 2:
                        return new a(ld2Var);
                    case 3:
                        return l92.u(zzisa, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzdw", "zziry", "zzirp", c.class, "zzirq", "zzirr", "zzirs", "zzirz"});
                    case 4:
                        return zzisa;
                    case 5:
                        kb2<e> aVar = zzel;
                        if (aVar == null) {
                            synchronized (e.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zzisa);
                                    zzel = aVar;
                                }
                            }
                        }
                        return aVar;
                    case 6:
                        return Byte.valueOf(this.zziqh);
                    case 7:
                        this.zziqh = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class f extends l92<f, a> implements za2 {
            private static volatile kb2<f> zzel;
            private static final f zzisg;
            private int zzbzr;
            private int zzdw;
            private String zzise = "";
            private a82 zzisf = a82.e;

            public static final class a extends l92.b<f, a> implements za2 {
                private a() {
                    super(f.zzisg);
                }

                /* synthetic */ a(ld2 ld2Var) {
                    this();
                }

                public final a v(EnumC0183b enumC0183b) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((f) this.e).M(enumC0183b);
                    return this;
                }

                public final a w(a82 a82Var) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((f) this.e).L(a82Var);
                    return this;
                }

                public final a x(String str) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((f) this.e).H(str);
                    return this;
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.jd2$b$f$b, reason: collision with other inner class name */
            public enum EnumC0183b implements r92 {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);

                private static final q92<EnumC0183b> g = new od2();
                private final int d;

                EnumC0183b(int r3) {
                    this.d = r3;
                }

                public static EnumC0183b e(int r1) {
                    if (r1 == 0) {
                        return TYPE_UNKNOWN;
                    }
                    if (r1 != 1) {
                        return null;
                    }
                    return TYPE_CREATIVE;
                }

                public static t92 g() {
                    return pd2.f4808a;
                }

                @Override // com.google.android.gms.internal.ads.r92
                public final int h() {
                    return this.d;
                }

                @Override // java.lang.Enum
                public final String toString() {
                    return "<" + EnumC0183b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
                }
            }

            static {
                f fVar = new f();
                zzisg = fVar;
                l92.w(f.class, fVar);
            }

            private f() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void H(String str) {
                str.getClass();
                this.zzdw |= 2;
                this.zzise = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void L(a82 a82Var) {
                a82Var.getClass();
                this.zzdw |= 4;
                this.zzisf = a82Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void M(EnumC0183b enumC0183b) {
                this.zzbzr = enumC0183b.h();
                this.zzdw |= 1;
            }

            public static a N() {
                return zzisg.z();
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r2, Object obj, Object obj2) {
                ld2 ld2Var = null;
                switch (ld2.f4244a[r2 - 1]) {
                    case 1:
                        return new f();
                    case 2:
                        return new a(ld2Var);
                    case 3:
                        return l92.u(zzisg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzbzr", EnumC0183b.g(), "zzise", "zzisf"});
                    case 4:
                        return zzisg;
                    case 5:
                        kb2<f> aVar = zzel;
                        if (aVar == null) {
                            synchronized (f.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zzisg);
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

        public enum g implements r92 {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);

            private static final q92<g> o = new sd2();
            private final int d;

            g(int r3) {
                this.d = r3;
            }

            public static g e(int r0) {
                switch (r0) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            public static t92 g() {
                return rd2.f5126a;
            }

            @Override // com.google.android.gms.internal.ads.r92
            public final int h() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + g.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        public static final class h extends l92<h, C0184b> implements za2 {
            private static volatile kb2<h> zzel;
            private static final h zziti;
            private int zzdw;
            private int zzita;
            private d zzitb;
            private e zzitc;
            private int zzitd;
            private int zzitg;
            private byte zziqh = 2;
            private String zziqk = "";
            private s92 zzite = l92.C();
            private String zzitf = "";
            private x92<String> zzith = l92.F();

            public enum a implements r92 {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);

                private static final q92<a> i = new ud2();
                private final int d;

                a(int r3) {
                    this.d = r3;
                }

                public static a e(int r1) {
                    if (r1 == 0) {
                        return AD_RESOURCE_UNKNOWN;
                    }
                    if (r1 == 1) {
                        return AD_RESOURCE_CREATIVE;
                    }
                    if (r1 == 2) {
                        return AD_RESOURCE_POST_CLICK;
                    }
                    if (r1 != 3) {
                        return null;
                    }
                    return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                }

                public static t92 g() {
                    return td2.f5391a;
                }

                @Override // com.google.android.gms.internal.ads.r92
                public final int h() {
                    return this.d;
                }

                @Override // java.lang.Enum
                public final String toString() {
                    return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.jd2$b$h$b, reason: collision with other inner class name */
            public static final class C0184b extends l92.b<h, C0184b> implements za2 {
                private C0184b() {
                    super(h.zziti);
                }

                /* synthetic */ C0184b(ld2 ld2Var) {
                    this();
                }

                public final C0184b A(String str) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((h) this.e).W(str);
                    return this;
                }

                public final C0184b v(d dVar) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((h) this.e).K(dVar);
                    return this;
                }

                public final C0184b w(a aVar) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((h) this.e).L(aVar);
                    return this;
                }

                public final C0184b x(int r2) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((h) this.e).I(r2);
                    return this;
                }

                public final C0184b z(String str) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((h) this.e).J(str);
                    return this;
                }
            }

            static {
                h hVar = new h();
                zziti = hVar;
                l92.w(h.class, hVar);
            }

            private h() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void I(int r2) {
                this.zzdw |= 1;
                this.zzita = r2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void J(String str) {
                str.getClass();
                this.zzdw |= 2;
                this.zziqk = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void K(d dVar) {
                dVar.getClass();
                this.zzitb = dVar;
                this.zzdw |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void L(a aVar) {
                this.zzitg = aVar.h();
                this.zzdw |= 64;
            }

            public static C0184b T() {
                return zziti.z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void W(String str) {
                str.getClass();
                x92<String> x92Var = this.zzith;
                if (!x92Var.m()) {
                    this.zzith = l92.s(x92Var);
                }
                this.zzith.add(str);
            }

            public final String H() {
                return this.zziqk;
            }

            public final int S() {
                return this.zzith.size();
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r3, Object obj, Object obj2) {
                ld2 ld2Var = null;
                switch (ld2.f4244a[r3 - 1]) {
                    case 1:
                        return new h();
                    case 2:
                        return new C0184b(ld2Var);
                    case 3:
                        return l92.u(zziti, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzdw", "zzita", "zziqk", "zzitb", "zzitc", "zzitd", "zzite", "zzitf", "zzitg", a.g(), "zzith"});
                    case 4:
                        return zziti;
                    case 5:
                        kb2<h> aVar = zzel;
                        if (aVar == null) {
                            synchronized (h.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zziti);
                                    zzel = aVar;
                                }
                            }
                        }
                        return aVar;
                    case 6:
                        return Byte.valueOf(this.zziqh);
                    case 7:
                        this.zziqh = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class i extends l92<i, a> implements za2 {
            private static volatile kb2<i> zzel;
            private static final i zzitm;
            private int zzdw;
            private String zzitj = "";
            private long zzitk;
            private boolean zzitl;

            public static final class a extends l92.b<i, a> implements za2 {
                private a() {
                    super(i.zzitm);
                }

                /* synthetic */ a(ld2 ld2Var) {
                    this();
                }

                public final a v(boolean z) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((i) this.e).M(z);
                    return this;
                }

                public final a w(long j) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((i) this.e).N(j);
                    return this;
                }

                public final a x(String str) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((i) this.e).O(str);
                    return this;
                }
            }

            static {
                i iVar = new i();
                zzitm = iVar;
                l92.w(i.class, iVar);
            }

            private i() {
            }

            public static a K() {
                return zzitm.z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void M(boolean z) {
                this.zzdw |= 4;
                this.zzitl = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void N(long j) {
                this.zzdw |= 2;
                this.zzitk = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void O(String str) {
                str.getClass();
                this.zzdw |= 1;
                this.zzitj = str;
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r2, Object obj, Object obj2) {
                ld2 ld2Var = null;
                switch (ld2.f4244a[r2 - 1]) {
                    case 1:
                        return new i();
                    case 2:
                        return new a(ld2Var);
                    case 3:
                        return l92.u(zzitm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzdw", "zzitj", "zzitk", "zzitl"});
                    case 4:
                        return zzitm;
                    case 5:
                        kb2<i> aVar = zzel;
                        if (aVar == null) {
                            synchronized (i.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zzitm);
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
            b bVar = new b();
            zzirj = bVar;
            l92.w(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I(String str) {
            str.getClass();
            this.zzdw |= 4;
            this.zziqk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void S(C0180b c0180b) {
            c0180b.getClass();
            this.zziqx = c0180b;
            this.zzdw |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void T(f fVar) {
            fVar.getClass();
            this.zzira = fVar;
            this.zzdw |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void U(g gVar) {
            this.zzbzr = gVar.h();
            this.zzdw |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void W(h hVar) {
            hVar.getClass();
            x92<h> x92Var = this.zziqy;
            if (!x92Var.m()) {
                this.zziqy = l92.s(x92Var);
            }
            this.zziqy.add(hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void X(i iVar) {
            iVar.getClass();
            this.zzirg = iVar;
            this.zzdw |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c0() {
            this.zzdw &= -65;
            this.zziqz = zzirj.zziqz;
        }

        public static a d0() {
            return zzirj.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g0(String str) {
            str.getClass();
            this.zzdw |= 64;
            this.zziqz = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h0(String str) {
            str.getClass();
            this.zzdw |= 8;
            this.zziqv = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i0(Iterable<String> iterable) {
            x92<String> x92Var = this.zzirh;
            if (!x92Var.m()) {
                this.zzirh = l92.s(x92Var);
            }
            q72.a(iterable, this.zzirh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j0(Iterable<String> iterable) {
            x92<String> x92Var = this.zziri;
            if (!x92Var.m()) {
                this.zziri = l92.s(x92Var);
            }
            q72.a(iterable, this.zziri);
        }

        public final String H() {
            return this.zziqk;
        }

        public final List<h> a0() {
            return this.zziqy;
        }

        public final String b0() {
            return this.zziqz;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r3, Object obj, Object obj2) {
            ld2 ld2Var = null;
            switch (ld2.f4244a[r3 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(ld2Var);
                case 3:
                    return l92.u(zzirj, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zzdw", "zziqk", "zziqv", "zziqw", "zziqy", h.class, "zzirb", "zzirc", "zzird", "zzire", "zzirf", "zzbzr", g.g(), "zziqu", a.c.g(), "zziqx", "zziqz", "zzira", "zziqd", "zzirg", "zzirh", "zziri"});
                case 4:
                    return zzirj;
                case 5:
                    kb2<b> aVar = zzel;
                    if (aVar == null) {
                        synchronized (b.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzirj);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return Byte.valueOf(this.zziqh);
                case 7:
                    this.zziqh = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
