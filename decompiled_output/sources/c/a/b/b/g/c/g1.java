package c.a.b.b.g.c;

import androidx.appcompat.widget.ActivityChooserView;
import c.a.b.b.g.c.h7;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g1 {

    public static final class a extends h7<a, C0127a> implements t8 {
        private static final a zzh;
        private static volatile e9<a> zzi;
        private int zzc;
        private int zzd;
        private i zze;
        private i zzf;
        private boolean zzg;

        /* renamed from: c.a.b.b.g.c.g1$a$a, reason: collision with other inner class name */
        public static final class C0127a extends h7.a<a, C0127a> implements t8 {
            private C0127a() {
                super(a.zzh);
            }

            /* synthetic */ C0127a(i1 i1Var) {
                this();
            }

            public final C0127a A(i iVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((a) this.e).N(iVar);
                return this;
            }

            public final C0127a C(boolean z) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((a) this.e).J(z);
                return this;
            }

            public final C0127a x(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((a) this.e).C(r2);
                return this;
            }

            public final C0127a z(i.a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((a) this.e).G((i) ((h7) aVar.j()));
                return this;
            }
        }

        static {
            a aVar = new a();
            zzh = aVar;
            h7.u(a.class, aVar);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void C(int r2) {
            this.zzc |= 1;
            this.zzd = r2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void G(i iVar) {
            iVar.getClass();
            this.zze = iVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J(boolean z) {
            this.zzc |= 8;
            this.zzg = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void N(i iVar) {
            iVar.getClass();
            this.zzf = iVar;
            this.zzc |= 4;
        }

        public static C0127a T() {
            return zzh.w();
        }

        public final boolean K() {
            return (this.zzc & 1) != 0;
        }

        public final int L() {
            return this.zzd;
        }

        public final i O() {
            i iVar = this.zze;
            return iVar == null ? i.d0() : iVar;
        }

        public final boolean P() {
            return (this.zzc & 4) != 0;
        }

        public final i Q() {
            i iVar = this.zzf;
            return iVar == null ? i.d0() : iVar;
        }

        public final boolean R() {
            return (this.zzc & 8) != 0;
        }

        public final boolean S() {
            return this.zzg;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            i1 i1Var = null;
            switch (i1.f1722a[r2 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0127a(i1Var);
                case 3:
                    return h7.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    e9<a> cVar = zzi;
                    if (cVar == null) {
                        synchronized (a.class) {
                            cVar = zzi;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzh);
                                zzi = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class b extends h7<b, a> implements t8 {
        private static final b zzf;
        private static volatile e9<b> zzg;
        private int zzc;
        private int zzd;
        private long zze;

        public static final class a extends h7.a<b, a> implements t8 {
            private a() {
                super(b.zzf);
            }

            /* synthetic */ a(i1 i1Var) {
                this();
            }

            public final a x(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((b) this.e).C(r2);
                return this;
            }

            public final a z(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((b) this.e).D(j);
                return this;
            }
        }

        static {
            b bVar = new b();
            zzf = bVar;
            h7.u(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void C(int r2) {
            this.zzc |= 1;
            this.zzd = r2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(long j) {
            this.zzc |= 2;
            this.zze = j;
        }

        public static a M() {
            return zzf.w();
        }

        public final boolean G() {
            return (this.zzc & 1) != 0;
        }

        public final int J() {
            return this.zzd;
        }

        public final boolean K() {
            return (this.zzc & 2) != 0;
        }

        public final long L() {
            return this.zze;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            i1 i1Var = null;
            switch (i1.f1722a[r2 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(i1Var);
                case 3:
                    return h7.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    e9<b> cVar = zzg;
                    if (cVar == null) {
                        synchronized (b.class) {
                            cVar = zzg;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzf);
                                zzg = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class c extends h7<c, a> implements t8 {
        private static final c zzi;
        private static volatile e9<c> zzj;
        private int zzc;
        private r7<e> zzd = h7.B();
        private String zze = "";
        private long zzf;
        private long zzg;
        private int zzh;

        public static final class a extends h7.a<c, a> implements t8 {
            private a() {
                super(c.zzi);
            }

            /* synthetic */ a(i1 i1Var) {
                this();
            }

            public final a A(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((c) this.e).F(j);
                return this;
            }

            public final a C(e.a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((c) this.e).P((e) ((h7) aVar.j()));
                return this;
            }

            public final a D(e eVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((c) this.e).P(eVar);
                return this;
            }

            public final a F(Iterable<? extends e> iterable) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((c) this.e).Q(iterable);
                return this;
            }

            public final a G(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((c) this.e).R(str);
                return this;
            }

            public final e J(int r2) {
                return ((c) this.e).C(r2);
            }

            public final List<e> K() {
                return Collections.unmodifiableList(((c) this.e).D());
            }

            public final int L() {
                return ((c) this.e).S();
            }

            public final a M(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((c) this.e).T(r2);
                return this;
            }

            public final a N(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((c) this.e).U(j);
                return this;
            }

            public final a O() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((c) this.e).g0();
                return this;
            }

            public final String Q() {
                return ((c) this.e).W();
            }

            public final boolean R() {
                return ((c) this.e).X();
            }

            public final long S() {
                return ((c) this.e).Y();
            }

            public final long T() {
                return ((c) this.e).a0();
            }

            public final a x(int r2, e.a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((c) this.e).E(r2, (e) ((h7) aVar.j()));
                return this;
            }

            public final a z(int r2, e eVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((c) this.e).E(r2, eVar);
                return this;
            }
        }

        static {
            c cVar = new c();
            zzi = cVar;
            h7.u(c.class, cVar);
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E(int r2, e eVar) {
            eVar.getClass();
            f0();
            this.zzd.set(r2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void F(long j) {
            this.zzc |= 2;
            this.zzf = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void P(e eVar) {
            eVar.getClass();
            f0();
            this.zzd.add(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Q(Iterable<? extends e> iterable) {
            f0();
            o5.k(iterable, this.zzd);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void R(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zze = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void T(int r2) {
            f0();
            this.zzd.remove(r2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void U(long j) {
            this.zzc |= 4;
            this.zzg = j;
        }

        public static a d0() {
            return zzi.w();
        }

        private final void f0() {
            r7<e> r7Var = this.zzd;
            if (r7Var.a()) {
                return;
            }
            this.zzd = h7.q(r7Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g0() {
            this.zzd = h7.B();
        }

        public final e C(int r2) {
            return this.zzd.get(r2);
        }

        public final List<e> D() {
            return this.zzd;
        }

        public final int S() {
            return this.zzd.size();
        }

        public final String W() {
            return this.zze;
        }

        public final boolean X() {
            return (this.zzc & 2) != 0;
        }

        public final long Y() {
            return this.zzf;
        }

        public final boolean Z() {
            return (this.zzc & 4) != 0;
        }

        public final long a0() {
            return this.zzg;
        }

        public final boolean b0() {
            return (this.zzc & 8) != 0;
        }

        public final int c0() {
            return this.zzh;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            i1 i1Var = null;
            switch (i1.f1722a[r2 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(i1Var);
                case 3:
                    return h7.s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", e.class, "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    e9<c> cVar = zzj;
                    if (cVar == null) {
                        synchronized (c.class) {
                            cVar = zzj;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzi);
                                zzj = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class d extends h7<d, a> implements t8 {
        private static final d zzf;
        private static volatile e9<d> zzg;
        private int zzc;
        private String zzd = "";
        private long zze;

        public static final class a extends h7.a<d, a> implements t8 {
            private a() {
                super(d.zzf);
            }

            /* synthetic */ a(i1 i1Var) {
                this();
            }

            public final a x(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((d) this.e).D(j);
                return this;
            }

            public final a z(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((d) this.e).G(str);
                return this;
            }
        }

        static {
            d dVar = new d();
            zzf = dVar;
            h7.u(d.class, dVar);
        }

        private d() {
        }

        public static a C() {
            return zzf.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(long j) {
            this.zzc |= 2;
            this.zze = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void G(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            i1 i1Var = null;
            switch (i1.f1722a[r2 - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new a(i1Var);
                case 3:
                    return h7.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    e9<d> cVar = zzg;
                    if (cVar == null) {
                        synchronized (d.class) {
                            cVar = zzg;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzf);
                                zzg = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class e extends h7<e, a> implements t8 {
        private static final e zzj;
        private static volatile e9<e> zzk;
        private int zzc;
        private long zzf;
        private float zzg;
        private double zzh;
        private String zzd = "";
        private String zze = "";
        private r7<e> zzi = h7.B();

        public static final class a extends h7.a<e, a> implements t8 {
            private a() {
                super(e.zzj);
            }

            /* synthetic */ a(i1 i1Var) {
                this();
            }

            public final a A(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((e) this.e).D(j);
                return this;
            }

            public final a C(a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((e) this.e).X((e) ((h7) aVar.j()));
                return this;
            }

            public final a D(Iterable<? extends e> iterable) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((e) this.e).M(iterable);
                return this;
            }

            public final a F(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((e) this.e).N(str);
                return this;
            }

            public final a G() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((e) this.e).j0();
                return this;
            }

            public final a J(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((e) this.e).S(str);
                return this;
            }

            public final a K() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((e) this.e).k0();
                return this;
            }

            public final int L() {
                return ((e) this.e).f0();
            }

            public final a M() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((e) this.e).m0();
                return this;
            }

            public final a x() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((e) this.e).i0();
                return this;
            }

            public final a z(double d) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((e) this.e).C(d);
                return this;
            }
        }

        static {
            e eVar = new e();
            zzj = eVar;
            h7.u(e.class, eVar);
        }

        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void C(double d) {
            this.zzc |= 16;
            this.zzh = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(long j) {
            this.zzc |= 4;
            this.zzf = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void M(Iterable<? extends e> iterable) {
            l0();
            o5.k(iterable, this.zzi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void N(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void S(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void X(e eVar) {
            eVar.getClass();
            l0();
            this.zzi.add(eVar);
        }

        public static a g0() {
            return zzj.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i0() {
            this.zzc &= -3;
            this.zze = zzj.zze;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j0() {
            this.zzc &= -5;
            this.zzf = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k0() {
            this.zzc &= -17;
            this.zzh = 0.0d;
        }

        private final void l0() {
            r7<e> r7Var = this.zzi;
            if (r7Var.a()) {
                return;
            }
            this.zzi = h7.q(r7Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m0() {
            this.zzi = h7.B();
        }

        public final boolean O() {
            return (this.zzc & 1) != 0;
        }

        public final String P() {
            return this.zzd;
        }

        public final boolean U() {
            return (this.zzc & 2) != 0;
        }

        public final String V() {
            return this.zze;
        }

        public final boolean Y() {
            return (this.zzc & 4) != 0;
        }

        public final long Z() {
            return this.zzf;
        }

        public final boolean a0() {
            return (this.zzc & 8) != 0;
        }

        public final float b0() {
            return this.zzg;
        }

        public final boolean c0() {
            return (this.zzc & 16) != 0;
        }

        public final double d0() {
            return this.zzh;
        }

        public final List<e> e0() {
            return this.zzi;
        }

        public final int f0() {
            return this.zzi.size();
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r3, Object obj, Object obj2) {
            i1 i1Var = null;
            switch (i1.f1722a[r3 - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new a(i1Var);
                case 3:
                    return h7.s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", e.class});
                case 4:
                    return zzj;
                case 5:
                    e9<e> cVar = zzk;
                    if (cVar == null) {
                        synchronized (e.class) {
                            cVar = zzk;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzj);
                                zzk = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class f extends h7<f, a> implements t8 {
        private static final f zzd;
        private static volatile e9<f> zze;
        private r7<g> zzc = h7.B();

        public static final class a extends h7.a<f, a> implements t8 {
            private a() {
                super(f.zzd);
            }

            /* synthetic */ a(i1 i1Var) {
                this();
            }

            public final a x(g.a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((f) this.e).F((g) ((h7) aVar.j()));
                return this;
            }

            public final g z(int r2) {
                return ((f) this.e).C(0);
            }
        }

        static {
            f fVar = new f();
            zzd = fVar;
            h7.u(f.class, fVar);
        }

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void F(g gVar) {
            gVar.getClass();
            r7<g> r7Var = this.zzc;
            if (!r7Var.a()) {
                this.zzc = h7.q(r7Var);
            }
            this.zzc.add(gVar);
        }

        public static a G() {
            return zzd.w();
        }

        public final g C(int r2) {
            return this.zzc.get(0);
        }

        public final List<g> D() {
            return this.zzc;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            i1 i1Var = null;
            switch (i1.f1722a[r2 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a(i1Var);
                case 3:
                    return h7.s(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", g.class});
                case 4:
                    return zzd;
                case 5:
                    e9<f> cVar = zze;
                    if (cVar == null) {
                        synchronized (f.class) {
                            cVar = zze;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzd);
                                zze = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class g extends h7<g, a> implements t8 {
        private static final g zzax;
        private static volatile e9<g> zzay;
        private int zzaa;
        private boolean zzad;
        private int zzag;
        private int zzah;
        private int zzai;
        private long zzak;
        private long zzal;
        private int zzao;
        private h zzaq;
        private long zzas;
        private long zzat;
        private int zzaw;
        private int zzc;
        private int zzd;
        private int zze;
        private long zzh;
        private long zzi;
        private long zzj;
        private long zzk;
        private long zzl;
        private int zzq;
        private long zzu;
        private long zzv;
        private boolean zzx;
        private long zzz;
        private r7<c> zzf = h7.B();
        private r7<k> zzg = h7.B();
        private String zzm = "";
        private String zzn = "";
        private String zzo = "";
        private String zzp = "";
        private String zzr = "";
        private String zzs = "";
        private String zzt = "";
        private String zzw = "";
        private String zzy = "";
        private String zzab = "";
        private String zzac = "";
        private r7<a> zzae = h7.B();
        private String zzaf = "";
        private String zzaj = "";
        private String zzam = "";
        private String zzan = "";
        private String zzap = "";
        private p7 zzar = h7.z();
        private String zzau = "";
        private String zzav = "";

        public static final class a extends h7.a<g, a> implements t8 {
            private a() {
                super(g.zzax);
            }

            /* synthetic */ a(i1 i1Var) {
                this();
            }

            public final a A(int r2, k kVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).F(r2, kVar);
                return this;
            }

            public final a A0(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).o2(j);
                return this;
            }

            public final a B0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).s2(str);
                return this;
            }

            public final a C(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).G(j);
                return this;
            }

            public final String C0() {
                return ((g) this.e).Y2();
            }

            public final a D(c.a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).J((c) ((h7) aVar.j()));
                return this;
            }

            public final a D0() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).a1();
                return this;
            }

            public final a E0(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).t2(j);
                return this;
            }

            public final a F(h.a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).V((h) ((h7) aVar.j()));
                return this;
            }

            public final a F0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).w2(str);
                return this;
            }

            public final a G(k.a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).W((k) ((h7) aVar.j()));
                return this;
            }

            public final a G0() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).k1();
                return this;
            }

            public final a H0(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).z2(j);
                return this;
            }

            public final a I0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).C2(str);
                return this;
            }

            public final a J(k kVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).W(kVar);
                return this;
            }

            public final a J0() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).l1();
                return this;
            }

            public final a K(Iterable<? extends c> iterable) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).X(iterable);
                return this;
            }

            public final a K0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).E2(str);
                return this;
            }

            public final a L(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).Y(str);
                return this;
            }

            public final a L0() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).m1();
                return this;
            }

            public final a M(boolean z) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).Z(z);
                return this;
            }

            public final a M0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).I2(null);
                return this;
            }

            public final List<c> N() {
                return Collections.unmodifiableList(((g) this.e).b1());
            }

            public final a N0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).K2(str);
                return this;
            }

            public final int O() {
                return ((g) this.e).q1();
            }

            public final String O0() {
                return ((g) this.e).m0();
            }

            public final a P0() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).n1();
                return this;
            }

            public final c Q(int r2) {
                return ((g) this.e).D(r2);
            }

            public final a Q0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).O2(str);
                return this;
            }

            public final a R(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).C0(j);
                return this;
            }

            public final a R0() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).o1();
                return this;
            }

            public final a S(Iterable<? extends k> iterable) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).J0(iterable);
                return this;
            }

            public final a S0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).R2(str);
                return this;
            }

            public final a T(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).K0(str);
                return this;
            }

            public final a T0() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).p1();
                return this;
            }

            public final a U(boolean z) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).L0(z);
                return this;
            }

            public final String U0() {
                return ((g) this.e).Q0();
            }

            public final a W() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).W0();
                return this;
            }

            public final a X(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).B1(r2);
                return this;
            }

            public final a Y(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).c1(j);
                return this;
            }

            public final a Z(Iterable<? extends a> iterable) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).i1(iterable);
                return this;
            }

            public final a a0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).j1(str);
                return this;
            }

            public final a b0(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).s1(j);
                return this;
            }

            public final a c0(Iterable<? extends Integer> iterable) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).y1(iterable);
                return this;
            }

            public final a d0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).z1(str);
                return this;
            }

            public final k e0(int r2) {
                return ((g) this.e).B0(r2);
            }

            public final List<k> f0() {
                return Collections.unmodifiableList(((g) this.e).A1());
            }

            public final int g0() {
                return ((g) this.e).I1();
            }

            public final a h0(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).J1(r2);
                return this;
            }

            public final a i0(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).C1(j);
                return this;
            }

            public final a j0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).H1(str);
                return this;
            }

            public final long k0() {
                return ((g) this.e).m2();
            }

            public final a l0(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).Q1(r2);
                return this;
            }

            public final a m0(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).K1(j);
                return this;
            }

            public final a n0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).P1(str);
                return this;
            }

            public final long o0() {
                return ((g) this.e).y2();
            }

            public final a p0(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).Z1(r2);
                return this;
            }

            public final a q0(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).R1(j);
                return this;
            }

            public final a r0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).W1(str);
                return this;
            }

            public final a s0() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).Y0();
                return this;
            }

            public final a t0(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).f2(r2);
                return this;
            }

            public final a u0(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).a2(j);
                return this;
            }

            public final a v0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).e2(str);
                return this;
            }

            public final a w0() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).Z0();
                return this;
            }

            public final a x(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).r1(1);
                return this;
            }

            public final a x0(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).n2(r2);
                return this;
            }

            public final a y0(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).g2(j);
                return this;
            }

            public final a z(int r2, c.a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).E(r2, (c) ((h7) aVar.j()));
                return this;
            }

            public final a z0(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((g) this.e).k2(str);
                return this;
            }
        }

        static {
            g gVar = new g();
            zzax = gVar;
            h7.u(g.class, gVar);
        }

        private g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void B1(int r2) {
            V0();
            this.zzf.remove(r2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void C0(long j) {
            this.zzc |= 4;
            this.zzi = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void C1(long j) {
            this.zzc |= 32;
            this.zzl = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void C2(String str) {
            str.getClass();
            this.zzc |= 16777216;
            this.zzaf = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E(int r2, c cVar) {
            cVar.getClass();
            V0();
            this.zzf.set(r2, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E2(String str) {
            str.getClass();
            this.zzc |= 268435456;
            this.zzaj = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void F(int r2, k kVar) {
            kVar.getClass();
            X0();
            this.zzg.set(r2, kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void G(long j) {
            this.zzc |= 2;
            this.zzh = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void H1(String str) {
            str.getClass();
            this.zzc |= 2048;
            this.zzr = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I2(String str) {
            str.getClass();
            this.zzc |= Integer.MIN_VALUE;
            this.zzam = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J(c cVar) {
            cVar.getClass();
            V0();
            this.zzf.add(cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J0(Iterable<? extends k> iterable) {
            X0();
            o5.k(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J1(int r2) {
            X0();
            this.zzg.remove(r2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K0(String str) {
            str.getClass();
            this.zzc |= 128;
            this.zzn = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K1(long j) {
            this.zzc |= 16384;
            this.zzu = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K2(String str) {
            str.getClass();
            this.zzd |= 4;
            this.zzap = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L0(boolean z) {
            this.zzc |= 8388608;
            this.zzad = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void O2(String str) {
            str.getClass();
            this.zzd |= 64;
            this.zzau = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void P1(String str) {
            str.getClass();
            this.zzc |= 4096;
            this.zzs = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Q1(int r2) {
            this.zzc |= 1024;
            this.zzq = r2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void R1(long j) {
            this.zzc |= 32768;
            this.zzv = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void R2(String str) {
            str.getClass();
            this.zzd |= 128;
            this.zzav = str;
        }

        public static a T0() {
            return zzax.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void V(h hVar) {
            hVar.getClass();
            this.zzaq = hVar;
            this.zzd |= 8;
        }

        private final void V0() {
            r7<c> r7Var = this.zzf;
            if (r7Var.a()) {
                return;
            }
            this.zzf = h7.q(r7Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void W(k kVar) {
            kVar.getClass();
            X0();
            this.zzg.add(kVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void W0() {
            this.zzf = h7.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void W1(String str) {
            str.getClass();
            this.zzc |= 8192;
            this.zzt = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void X(Iterable<? extends c> iterable) {
            V0();
            o5.k(iterable, this.zzf);
        }

        private final void X0() {
            r7<k> r7Var = this.zzg;
            if (r7Var.a()) {
                return;
            }
            this.zzg = h7.q(r7Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Y(String str) {
            str.getClass();
            this.zzc |= 64;
            this.zzm = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Y0() {
            this.zzc &= -17;
            this.zzk = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Z(boolean z) {
            this.zzc |= 131072;
            this.zzx = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Z0() {
            this.zzc &= -33;
            this.zzl = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Z1(int r3) {
            this.zzc |= 1048576;
            this.zzaa = r3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a1() {
            this.zzc &= -65537;
            this.zzw = zzax.zzw;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a2(long j) {
            this.zzc |= 524288;
            this.zzz = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c1(long j) {
            this.zzc |= 8;
            this.zzj = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e2(String str) {
            str.getClass();
            this.zzc |= 65536;
            this.zzw = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f2(int r3) {
            this.zzc |= 33554432;
            this.zzag = r3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g2(long j) {
            this.zzc |= 536870912;
            this.zzak = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i1(Iterable<? extends a> iterable) {
            r7<a> r7Var = this.zzae;
            if (!r7Var.a()) {
                this.zzae = h7.q(r7Var);
            }
            o5.k(iterable, this.zzae);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j1(String str) {
            str.getClass();
            this.zzc |= 256;
            this.zzo = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k1() {
            this.zzc &= -131073;
            this.zzx = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k2(String str) {
            str.getClass();
            this.zzc |= 262144;
            this.zzy = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l1() {
            this.zzc &= -262145;
            this.zzy = zzax.zzy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m1() {
            this.zzc &= -2097153;
            this.zzab = zzax.zzab;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n1() {
            this.zzae = h7.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n2(int r2) {
            this.zzd |= 2;
            this.zzao = r2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void o1() {
            this.zzc &= -268435457;
            this.zzaj = zzax.zzaj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void o2(long j) {
            this.zzc |= 1073741824;
            this.zzal = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void p1() {
            this.zzc &= ActivityChooserView.f.j;
            this.zzam = zzax.zzam;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r1(int r2) {
            this.zzc |= 1;
            this.zze = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void s1(long j) {
            this.zzc |= 16;
            this.zzk = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void s2(String str) {
            str.getClass();
            this.zzc |= 2097152;
            this.zzab = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void t2(long j) {
            this.zzd |= 16;
            this.zzas = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void w2(String str) {
            str.getClass();
            this.zzc |= 4194304;
            this.zzac = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void y1(Iterable<? extends Integer> iterable) {
            p7 p7Var = this.zzar;
            if (!p7Var.a()) {
                int size = p7Var.size();
                this.zzar = p7Var.e(size == 0 ? 10 : size << 1);
            }
            o5.k(iterable, this.zzar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void z1(String str) {
            str.getClass();
            this.zzc |= 512;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void z2(long j) {
            this.zzd |= 32;
            this.zzat = j;
        }

        public final int A0() {
            return this.zze;
        }

        public final List<k> A1() {
            return this.zzg;
        }

        public final k B0(int r2) {
            return this.zzg.get(r2);
        }

        public final long C() {
            return this.zzu;
        }

        public final c D(int r2) {
            return this.zzf.get(r2);
        }

        public final boolean F2() {
            return (this.zzc & 16) != 0;
        }

        public final long G2() {
            return this.zzk;
        }

        public final int I1() {
            return this.zzg.size();
        }

        public final boolean L2() {
            return (this.zzc & 32) != 0;
        }

        public final int M0() {
            return this.zzao;
        }

        public final long M2() {
            return this.zzl;
        }

        public final String N0() {
            return this.zzap;
        }

        public final boolean O0() {
            return (this.zzd & 16) != 0;
        }

        public final long P0() {
            return this.zzas;
        }

        public final String P2() {
            return this.zzm;
        }

        public final String Q0() {
            return this.zzau;
        }

        public final boolean R0() {
            return (this.zzd & 128) != 0;
        }

        public final String S0() {
            return this.zzav;
        }

        public final String S2() {
            return this.zzn;
        }

        public final String T2() {
            return this.zzo;
        }

        public final String U2() {
            return this.zzp;
        }

        public final boolean V2() {
            return (this.zzc & 1024) != 0;
        }

        public final int W2() {
            return this.zzq;
        }

        public final boolean X1() {
            return (this.zzc & 2) != 0;
        }

        public final String X2() {
            return this.zzr;
        }

        public final long Y1() {
            return this.zzh;
        }

        public final String Y2() {
            return this.zzs;
        }

        public final String Z2() {
            return this.zzt;
        }

        public final boolean a0() {
            return (this.zzc & 1) != 0;
        }

        public final boolean a3() {
            return (this.zzc & 16384) != 0;
        }

        public final boolean b0() {
            return (this.zzc & 32768) != 0;
        }

        public final List<c> b1() {
            return this.zzf;
        }

        public final long c0() {
            return this.zzv;
        }

        public final String d0() {
            return this.zzw;
        }

        public final boolean e0() {
            return (this.zzc & 131072) != 0;
        }

        public final boolean f0() {
            return this.zzx;
        }

        public final String g0() {
            return this.zzy;
        }

        public final boolean h0() {
            return (this.zzc & 524288) != 0;
        }

        public final long i0() {
            return this.zzz;
        }

        public final boolean j0() {
            return (this.zzc & 1048576) != 0;
        }

        public final int k0() {
            return this.zzaa;
        }

        public final String l0() {
            return this.zzab;
        }

        public final boolean l2() {
            return (this.zzc & 4) != 0;
        }

        public final String m0() {
            return this.zzac;
        }

        public final long m2() {
            return this.zzi;
        }

        public final boolean n0() {
            return (this.zzc & 8388608) != 0;
        }

        public final boolean o0() {
            return this.zzad;
        }

        public final List<a> p0() {
            return this.zzae;
        }

        public final String q0() {
            return this.zzaf;
        }

        public final int q1() {
            return this.zzf.size();
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            i1 i1Var = null;
            switch (i1.f1722a[r2 - 1]) {
                case 1:
                    return new g();
                case 2:
                    return new a(i1Var);
                case 3:
                    return h7.s(zzax, "\u0001-\u0000\u0002\u00015-\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(", new Object[]{"zzc", "zzd", "zze", "zzf", c.class, "zzg", k.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzk", "zzad", "zzae", a.class, "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", h1.g()});
                case 4:
                    return zzax;
                case 5:
                    e9<g> cVar = zzay;
                    if (cVar == null) {
                        synchronized (g.class) {
                            cVar = zzay;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzax);
                                zzay = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final boolean r0() {
            return (this.zzc & 33554432) != 0;
        }

        public final int s0() {
            return this.zzag;
        }

        public final String t0() {
            return this.zzaj;
        }

        public final boolean u0() {
            return (this.zzc & 536870912) != 0;
        }

        public final long v0() {
            return this.zzak;
        }

        public final boolean w0() {
            return (this.zzc & 1073741824) != 0;
        }

        public final long x0() {
            return this.zzal;
        }

        public final boolean x2() {
            return (this.zzc & 8) != 0;
        }

        public final String y0() {
            return this.zzam;
        }

        public final long y2() {
            return this.zzj;
        }

        public final boolean z0() {
            return (this.zzd & 2) != 0;
        }
    }

    public static final class h extends h7<h, a> implements t8 {
        private static final h zzf;
        private static volatile e9<h> zzg;
        private int zzc;
        private int zzd = 1;
        private r7<d> zze = h7.B();

        public static final class a extends h7.a<h, a> implements t8 {
            private a() {
                super(h.zzf);
            }

            /* synthetic */ a(i1 i1Var) {
                this();
            }

            public final a x(d.a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((h) this.e).D((d) ((h7) aVar.j()));
                return this;
            }
        }

        public enum b implements k7 {
            RADS(1),
            PROVISIONING(2);

            private static final n7<b> g = new l1();
            private final int d;

            b(int r3) {
                this.d = r3;
            }

            public static b e(int r1) {
                if (r1 == 1) {
                    return RADS;
                }
                if (r1 != 2) {
                    return null;
                }
                return PROVISIONING;
            }

            public static m7 g() {
                return m1.f1767a;
            }

            @Override // c.a.b.b.g.c.k7
            public final int a() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        static {
            h hVar = new h();
            zzf = hVar;
            h7.u(h.class, hVar);
        }

        private h() {
        }

        public static a C() {
            return zzf.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(d dVar) {
            dVar.getClass();
            r7<d> r7Var = this.zze;
            if (!r7Var.a()) {
                this.zze = h7.q(r7Var);
            }
            this.zze.add(dVar);
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            i1 i1Var = null;
            switch (i1.f1722a[r2 - 1]) {
                case 1:
                    return new h();
                case 2:
                    return new a(i1Var);
                case 3:
                    return h7.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", b.g(), "zze", d.class});
                case 4:
                    return zzf;
                case 5:
                    e9<h> cVar = zzg;
                    if (cVar == null) {
                        synchronized (h.class) {
                            cVar = zzg;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzf);
                                zzg = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class i extends h7<i, a> implements t8 {
        private static final i zzg;
        private static volatile e9<i> zzh;
        private o7 zzc = h7.A();
        private o7 zzd = h7.A();
        private r7<b> zze = h7.B();
        private r7<j> zzf = h7.B();

        public static final class a extends h7.a<i, a> implements t8 {
            private a() {
                super(i.zzg);
            }

            /* synthetic */ a(i1 i1Var) {
                this();
            }

            public final a A(Iterable<? extends Long> iterable) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((i) this.e).J(iterable);
                return this;
            }

            public final a C() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((i) this.e).g0();
                return this;
            }

            public final a D(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((i) this.e).Y(r2);
                return this;
            }

            public final a F(Iterable<? extends Long> iterable) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((i) this.e).P(iterable);
                return this;
            }

            public final a G(Iterable<? extends b> iterable) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((i) this.e).S(iterable);
                return this;
            }

            public final a J(Iterable<? extends j> iterable) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((i) this.e).W(iterable);
                return this;
            }

            public final a x() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((i) this.e).f0();
                return this;
            }

            public final a z(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((i) this.e).U(r2);
                return this;
            }
        }

        static {
            i iVar = new i();
            zzg = iVar;
            h7.u(i.class, iVar);
        }

        private i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J(Iterable<? extends Long> iterable) {
            o7 o7Var = this.zzc;
            if (!o7Var.a()) {
                this.zzc = h7.p(o7Var);
            }
            o5.k(iterable, this.zzc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void P(Iterable<? extends Long> iterable) {
            o7 o7Var = this.zzd;
            if (!o7Var.a()) {
                this.zzd = h7.p(o7Var);
            }
            o5.k(iterable, this.zzd);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void S(Iterable<? extends b> iterable) {
            h0();
            o5.k(iterable, this.zze);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void U(int r2) {
            h0();
            this.zze.remove(r2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void W(Iterable<? extends j> iterable) {
            i0();
            o5.k(iterable, this.zzf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Y(int r2) {
            i0();
            this.zzf.remove(r2);
        }

        public static a c0() {
            return zzg.w();
        }

        public static i d0() {
            return zzg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f0() {
            this.zzc = h7.A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g0() {
            this.zzd = h7.A();
        }

        private final void h0() {
            r7<b> r7Var = this.zze;
            if (r7Var.a()) {
                return;
            }
            this.zze = h7.q(r7Var);
        }

        private final void i0() {
            r7<j> r7Var = this.zzf;
            if (r7Var.a()) {
                return;
            }
            this.zzf = h7.q(r7Var);
        }

        public final b C(int r2) {
            return this.zze.get(r2);
        }

        public final List<Long> D() {
            return this.zzc;
        }

        public final int K() {
            return this.zzc.size();
        }

        public final j L(int r2) {
            return this.zzf.get(r2);
        }

        public final List<Long> Q() {
            return this.zzd;
        }

        public final int T() {
            return this.zzd.size();
        }

        public final List<b> X() {
            return this.zze;
        }

        public final int Z() {
            return this.zze.size();
        }

        public final List<j> a0() {
            return this.zzf;
        }

        public final int b0() {
            return this.zzf.size();
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            i1 i1Var = null;
            switch (i1.f1722a[r2 - 1]) {
                case 1:
                    return new i();
                case 2:
                    return new a(i1Var);
                case 3:
                    return h7.s(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", b.class, "zzf", j.class});
                case 4:
                    return zzg;
                case 5:
                    e9<i> cVar = zzh;
                    if (cVar == null) {
                        synchronized (i.class) {
                            cVar = zzh;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzg);
                                zzh = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class j extends h7<j, a> implements t8 {
        private static final j zzf;
        private static volatile e9<j> zzg;
        private int zzc;
        private int zzd;
        private o7 zze = h7.A();

        public static final class a extends h7.a<j, a> implements t8 {
            private a() {
                super(j.zzf);
            }

            /* synthetic */ a(i1 i1Var) {
                this();
            }

            public final a x(int r2) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((j) this.e).K(r2);
                return this;
            }

            public final a z(Iterable<? extends Long> iterable) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((j) this.e).F(iterable);
                return this;
            }
        }

        static {
            j jVar = new j();
            zzf = jVar;
            h7.u(j.class, jVar);
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void F(Iterable<? extends Long> iterable) {
            o7 o7Var = this.zze;
            if (!o7Var.a()) {
                this.zze = h7.p(o7Var);
            }
            o5.k(iterable, this.zze);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(int r2) {
            this.zzc |= 1;
            this.zzd = r2;
        }

        public static a N() {
            return zzf.w();
        }

        public final long C(int r3) {
            return this.zze.g(r3);
        }

        public final boolean G() {
            return (this.zzc & 1) != 0;
        }

        public final int J() {
            return this.zzd;
        }

        public final List<Long> L() {
            return this.zze;
        }

        public final int M() {
            return this.zze.size();
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            i1 i1Var = null;
            switch (i1.f1722a[r2 - 1]) {
                case 1:
                    return new j();
                case 2:
                    return new a(i1Var);
                case 3:
                    return h7.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    e9<j> cVar = zzg;
                    if (cVar == null) {
                        synchronized (j.class) {
                            cVar = zzg;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzf);
                                zzg = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class k extends h7<k, a> implements t8 {
        private static final k zzj;
        private static volatile e9<k> zzk;
        private int zzc;
        private long zzd;
        private String zze = "";
        private String zzf = "";
        private long zzg;
        private float zzh;
        private double zzi;

        public static final class a extends h7.a<k, a> implements t8 {
            private a() {
                super(k.zzj);
            }

            /* synthetic */ a(i1 i1Var) {
                this();
            }

            public final a A(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((k) this.e).D(j);
                return this;
            }

            public final a C(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((k) this.e).K(str);
                return this;
            }

            public final a D() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((k) this.e).d0();
                return this;
            }

            public final a F(long j) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((k) this.e).N(j);
                return this;
            }

            public final a G(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((k) this.e).R(str);
                return this;
            }

            public final a J() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((k) this.e).e0();
                return this;
            }

            public final a x() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((k) this.e).c0();
                return this;
            }

            public final a z(double d) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((k) this.e).C(d);
                return this;
            }
        }

        static {
            k kVar = new k();
            zzj = kVar;
            h7.u(k.class, kVar);
        }

        private k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void C(double d) {
            this.zzc |= 32;
            this.zzi = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(long j) {
            this.zzc |= 1;
            this.zzd = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void N(long j) {
            this.zzc |= 8;
            this.zzg = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void R(String str) {
            str.getClass();
            this.zzc |= 4;
            this.zzf = str;
        }

        public static a a0() {
            return zzj.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c0() {
            this.zzc &= -5;
            this.zzf = zzj.zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d0() {
            this.zzc &= -9;
            this.zzg = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e0() {
            this.zzc &= -33;
            this.zzi = 0.0d;
        }

        public final boolean L() {
            return (this.zzc & 1) != 0;
        }

        public final long M() {
            return this.zzd;
        }

        public final String S() {
            return this.zze;
        }

        public final boolean U() {
            return (this.zzc & 4) != 0;
        }

        public final String V() {
            return this.zzf;
        }

        public final boolean W() {
            return (this.zzc & 8) != 0;
        }

        public final long X() {
            return this.zzg;
        }

        public final boolean Y() {
            return (this.zzc & 32) != 0;
        }

        public final double Z() {
            return this.zzi;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            i1 i1Var = null;
            switch (i1.f1722a[r2 - 1]) {
                case 1:
                    return new k();
                case 2:
                    return new a(i1Var);
                case 3:
                    return h7.s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    e9<k> cVar = zzk;
                    if (cVar == null) {
                        synchronized (k.class) {
                            cVar = zzk;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzj);
                                zzk = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
