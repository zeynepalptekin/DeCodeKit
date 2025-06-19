package c.a.e.a0.p;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public final class n {
    public static final c.a.e.x<String> A;
    public static final c.a.e.x<BigDecimal> B;
    public static final c.a.e.x<BigInteger> C;
    public static final c.a.e.y D;
    public static final c.a.e.x<StringBuilder> E;
    public static final c.a.e.y F;
    public static final c.a.e.x<StringBuffer> G;
    public static final c.a.e.y H;
    public static final c.a.e.x<URL> I;
    public static final c.a.e.y J;
    public static final c.a.e.x<URI> K;
    public static final c.a.e.y L;
    public static final c.a.e.x<InetAddress> M;
    public static final c.a.e.y N;
    public static final c.a.e.x<UUID> O;
    public static final c.a.e.y P;
    public static final c.a.e.x<Currency> Q;
    public static final c.a.e.y R;
    public static final c.a.e.y S;
    public static final c.a.e.x<Calendar> T;
    public static final c.a.e.y U;
    public static final c.a.e.x<Locale> V;
    public static final c.a.e.y W;
    public static final c.a.e.x<c.a.e.l> X;
    public static final c.a.e.y Y;
    public static final c.a.e.y Z;

    /* renamed from: a, reason: collision with root package name */
    public static final c.a.e.x<Class> f2279a;

    /* renamed from: b, reason: collision with root package name */
    public static final c.a.e.y f2280b;

    /* renamed from: c, reason: collision with root package name */
    public static final c.a.e.x<BitSet> f2281c;
    public static final c.a.e.y d;
    public static final c.a.e.x<Boolean> e;
    public static final c.a.e.x<Boolean> f;
    public static final c.a.e.y g;
    public static final c.a.e.x<Number> h;
    public static final c.a.e.y i;
    public static final c.a.e.x<Number> j;
    public static final c.a.e.y k;
    public static final c.a.e.x<Number> l;
    public static final c.a.e.y m;
    public static final c.a.e.x<AtomicInteger> n;
    public static final c.a.e.y o;
    public static final c.a.e.x<AtomicBoolean> p;
    public static final c.a.e.y q;
    public static final c.a.e.x<AtomicIntegerArray> r;
    public static final c.a.e.y s;
    public static final c.a.e.x<Number> t;
    public static final c.a.e.x<Number> u;
    public static final c.a.e.x<Number> v;
    public static final c.a.e.x<Number> w;
    public static final c.a.e.y x;
    public static final c.a.e.x<Character> y;
    public static final c.a.e.y z;

    static class a extends c.a.e.x<AtomicIntegerArray> {
        a() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray e(c.a.e.c0.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.l()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.r()));
                } catch (NumberFormatException e) {
                    throw new c.a.e.v(e);
                }
            }
            aVar.h();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int r2 = 0; r2 < size; r2++) {
                atomicIntegerArray.set(r2, ((Integer) arrayList.get(r2)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            dVar.e();
            int length = atomicIntegerArray.length();
            for (int r1 = 0; r1 < length; r1++) {
                dVar.A(atomicIntegerArray.get(r1));
            }
            dVar.h();
        }
    }

    static class a0 implements c.a.e.y {
        final /* synthetic */ Class d;
        final /* synthetic */ Class e;
        final /* synthetic */ c.a.e.x f;

        a0(Class cls, Class cls2, c.a.e.x xVar) {
            this.d = cls;
            this.e = cls2;
            this.f = xVar;
        }

        @Override // c.a.e.y
        public <T> c.a.e.x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            Class<? super T> clsF = aVar.f();
            if (clsF == this.d || clsF == this.e) {
                return this.f;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.d.getName() + "+" + this.e.getName() + ",adapter=" + this.f + "]";
        }
    }

    static class b extends c.a.e.x<Number> {
        b() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            try {
                return Long.valueOf(aVar.s());
            } catch (NumberFormatException e) {
                throw new c.a.e.v(e);
            }
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Number number) throws IOException {
            dVar.C(number);
        }
    }

    static class b0 implements c.a.e.y {
        final /* synthetic */ Class d;
        final /* synthetic */ c.a.e.x e;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        class a<T1> extends c.a.e.x<T1> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f2282a;

            a(Class cls) {
                this.f2282a = cls;
            }

            @Override // c.a.e.x
            public T1 e(c.a.e.c0.a aVar) throws IOException {
                T1 t1 = (T1) b0.this.e.e(aVar);
                if (t1 == null || this.f2282a.isInstance(t1)) {
                    return t1;
                }
                throw new c.a.e.v("Expected a " + this.f2282a.getName() + " but was " + t1.getClass().getName());
            }

            @Override // c.a.e.x
            public void i(c.a.e.c0.d dVar, T1 t1) throws IOException {
                b0.this.e.i(dVar, t1);
            }
        }

        b0(Class cls, c.a.e.x xVar) {
            this.d = cls;
            this.e = xVar;
        }

        @Override // c.a.e.y
        public <T2> c.a.e.x<T2> b(c.a.e.f fVar, c.a.e.b0.a<T2> aVar) {
            Class<? super T2> clsF = aVar.f();
            if (this.d.isAssignableFrom(clsF)) {
                return new a(clsF);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.d.getName() + ",adapter=" + this.e + "]";
        }
    }

    static class c extends c.a.e.x<Number> {
        c() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return Float.valueOf((float) aVar.q());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Number number) throws IOException {
            dVar.C(number);
        }
    }

    static /* synthetic */ class c0 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2284a;

        static {
            int[] r0 = new int[c.a.e.c0.c.values().length];
            f2284a = r0;
            try {
                r0[c.a.e.c0.c.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2284a[c.a.e.c0.c.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2284a[c.a.e.c0.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2284a[c.a.e.c0.c.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2284a[c.a.e.c0.c.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2284a[c.a.e.c0.c.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2284a[c.a.e.c0.c.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2284a[c.a.e.c0.c.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2284a[c.a.e.c0.c.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2284a[c.a.e.c0.c.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static class d extends c.a.e.x<Number> {
        d() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return Double.valueOf(aVar.q());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Number number) throws IOException {
            dVar.C(number);
        }
    }

    static class d0 extends c.a.e.x<Boolean> {
        d0() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean e(c.a.e.c0.a aVar) throws IOException {
            c.a.e.c0.c cVarZ = aVar.z();
            if (cVarZ != c.a.e.c0.c.NULL) {
                return cVarZ == c.a.e.c0.c.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.x())) : Boolean.valueOf(aVar.p());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Boolean bool) throws IOException {
            dVar.B(bool);
        }
    }

    static class e extends c.a.e.x<Number> {
        e() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(c.a.e.c0.a aVar) throws IOException {
            c.a.e.c0.c cVarZ = aVar.z();
            int r1 = c0.f2284a[cVarZ.ordinal()];
            if (r1 == 1 || r1 == 3) {
                return new c.a.e.a0.h(aVar.x());
            }
            if (r1 == 4) {
                aVar.v();
                return null;
            }
            throw new c.a.e.v("Expecting number, got: " + cVarZ);
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Number number) throws IOException {
            dVar.C(number);
        }
    }

    static class e0 extends c.a.e.x<Boolean> {
        e0() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return Boolean.valueOf(aVar.x());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Boolean bool) throws IOException {
            dVar.D(bool == null ? "null" : bool.toString());
        }
    }

    static class f extends c.a.e.x<Character> {
        f() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Character e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            String strX = aVar.x();
            if (strX.length() == 1) {
                return Character.valueOf(strX.charAt(0));
            }
            throw new c.a.e.v("Expecting character, got: " + strX);
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Character ch) throws IOException {
            dVar.D(ch == null ? null : String.valueOf(ch));
        }
    }

    static class f0 extends c.a.e.x<Number> {
        f0() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.r());
            } catch (NumberFormatException e) {
                throw new c.a.e.v(e);
            }
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Number number) throws IOException {
            dVar.C(number);
        }
    }

    static class g extends c.a.e.x<String> {
        g() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String e(c.a.e.c0.a aVar) throws IOException {
            c.a.e.c0.c cVarZ = aVar.z();
            if (cVarZ != c.a.e.c0.c.NULL) {
                return cVarZ == c.a.e.c0.c.BOOLEAN ? Boolean.toString(aVar.p()) : aVar.x();
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, String str) throws IOException {
            dVar.D(str);
        }
    }

    static class g0 extends c.a.e.x<Number> {
        g0() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.r());
            } catch (NumberFormatException e) {
                throw new c.a.e.v(e);
            }
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Number number) throws IOException {
            dVar.C(number);
        }
    }

    static class h extends c.a.e.x<BigDecimal> {
        h() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public BigDecimal e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            try {
                return new BigDecimal(aVar.x());
            } catch (NumberFormatException e) {
                throw new c.a.e.v(e);
            }
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, BigDecimal bigDecimal) throws IOException {
            dVar.C(bigDecimal);
        }
    }

    static class h0 extends c.a.e.x<Number> {
        h0() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Number e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            try {
                return Integer.valueOf(aVar.r());
            } catch (NumberFormatException e) {
                throw new c.a.e.v(e);
            }
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Number number) throws IOException {
            dVar.C(number);
        }
    }

    static class i extends c.a.e.x<BigInteger> {
        i() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public BigInteger e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            try {
                return new BigInteger(aVar.x());
            } catch (NumberFormatException e) {
                throw new c.a.e.v(e);
            }
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, BigInteger bigInteger) throws IOException {
            dVar.C(bigInteger);
        }
    }

    static class i0 extends c.a.e.x<AtomicInteger> {
        i0() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicInteger e(c.a.e.c0.a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.r());
            } catch (NumberFormatException e) {
                throw new c.a.e.v(e);
            }
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, AtomicInteger atomicInteger) throws IOException {
            dVar.A(atomicInteger.get());
        }
    }

    static class j extends c.a.e.x<StringBuilder> {
        j() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public StringBuilder e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return new StringBuilder(aVar.x());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, StringBuilder sb) throws IOException {
            dVar.D(sb == null ? null : sb.toString());
        }
    }

    static class j0 extends c.a.e.x<AtomicBoolean> {
        j0() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean e(c.a.e.c0.a aVar) throws IOException {
            return new AtomicBoolean(aVar.p());
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, AtomicBoolean atomicBoolean) throws IOException {
            dVar.E(atomicBoolean.get());
        }
    }

    static class k extends c.a.e.x<Class> {
        k() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Class e(c.a.e.c0.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    private static final class k0<T extends Enum<T>> extends c.a.e.x<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, T> f2285a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<T, String> f2286b = new HashMap();

        public k0(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String strName = t.name();
                    c.a.e.z.c cVar = (c.a.e.z.c) cls.getField(strName).getAnnotation(c.a.e.z.c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f2285a.put(str, t);
                        }
                    }
                    this.f2285a.put(strName, t);
                    this.f2286b.put(t, strName);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public T e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return this.f2285a.get(aVar.x());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, T t) throws IOException {
            dVar.D(t == null ? null : this.f2286b.get(t));
        }
    }

    static class l extends c.a.e.x<StringBuffer> {
        l() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public StringBuffer e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return new StringBuffer(aVar.x());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, StringBuffer stringBuffer) throws IOException {
            dVar.D(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    static class m extends c.a.e.x<URL> {
        m() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public URL e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            String strX = aVar.x();
            if ("null".equals(strX)) {
                return null;
            }
            return new URL(strX);
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, URL url) throws IOException {
            dVar.D(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: c.a.e.a0.p.n$n, reason: collision with other inner class name */
    static class C0155n extends c.a.e.x<URI> {
        C0155n() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public URI e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            try {
                String strX = aVar.x();
                if ("null".equals(strX)) {
                    return null;
                }
                return new URI(strX);
            } catch (URISyntaxException e) {
                throw new c.a.e.m(e);
            }
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, URI r2) throws IOException {
            dVar.D(r2 == null ? null : r2.toASCIIString());
        }
    }

    static class o extends c.a.e.x<InetAddress> {
        o() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public InetAddress e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return InetAddress.getByName(aVar.x());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, InetAddress inetAddress) throws IOException {
            dVar.D(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    static class p extends c.a.e.x<UUID> {
        p() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public UUID e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() != c.a.e.c0.c.NULL) {
                return UUID.fromString(aVar.x());
            }
            aVar.v();
            return null;
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, UUID r2) throws IOException {
            dVar.D(r2 == null ? null : r2.toString());
        }
    }

    static class q extends c.a.e.x<Currency> {
        q() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Currency e(c.a.e.c0.a aVar) throws IOException {
            return Currency.getInstance(aVar.x());
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Currency currency) throws IOException {
            dVar.D(currency.getCurrencyCode());
        }
    }

    static class r implements c.a.e.y {

        class a extends c.a.e.x<Timestamp> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a.e.x f2287a;

            a(c.a.e.x xVar) {
                this.f2287a = xVar;
            }

            @Override // c.a.e.x
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Timestamp e(c.a.e.c0.a aVar) throws IOException {
                Date date = (Date) this.f2287a.e(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // c.a.e.x
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public void i(c.a.e.c0.d dVar, Timestamp timestamp) throws IOException {
                this.f2287a.i(dVar, timestamp);
            }
        }

        r() {
        }

        @Override // c.a.e.y
        public <T> c.a.e.x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            if (aVar.f() != Timestamp.class) {
                return null;
            }
            return new a(fVar.q(Date.class));
        }
    }

    static class s extends c.a.e.x<Calendar> {

        /* renamed from: a, reason: collision with root package name */
        private static final String f2289a = "year";

        /* renamed from: b, reason: collision with root package name */
        private static final String f2290b = "month";

        /* renamed from: c, reason: collision with root package name */
        private static final String f2291c = "dayOfMonth";
        private static final String d = "hourOfDay";
        private static final String e = "minute";
        private static final String f = "second";

        s() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Calendar e(c.a.e.c0.a aVar) throws IOException, NumberFormatException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            aVar.b();
            int r2 = 0;
            int r3 = 0;
            int r4 = 0;
            int r5 = 0;
            int r6 = 0;
            int r7 = 0;
            while (aVar.z() != c.a.e.c0.c.END_OBJECT) {
                String strT = aVar.t();
                int r1 = aVar.r();
                if (f2289a.equals(strT)) {
                    r2 = r1;
                } else if (f2290b.equals(strT)) {
                    r3 = r1;
                } else if (f2291c.equals(strT)) {
                    r4 = r1;
                } else if (d.equals(strT)) {
                    r5 = r1;
                } else if (e.equals(strT)) {
                    r6 = r1;
                } else if (f.equals(strT)) {
                    r7 = r1;
                }
            }
            aVar.i();
            return new GregorianCalendar(r2, r3, r4, r5, r6, r7);
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                dVar.p();
                return;
            }
            dVar.f();
            dVar.n(f2289a);
            dVar.A(calendar.get(1));
            dVar.n(f2290b);
            dVar.A(calendar.get(2));
            dVar.n(f2291c);
            dVar.A(calendar.get(5));
            dVar.n(d);
            dVar.A(calendar.get(11));
            dVar.n(e);
            dVar.A(calendar.get(12));
            dVar.n(f);
            dVar.A(calendar.get(13));
            dVar.i();
        }
    }

    static class t extends c.a.e.x<Locale> {
        t() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Locale e(c.a.e.c0.a aVar) throws IOException {
            if (aVar.z() == c.a.e.c0.c.NULL) {
                aVar.v();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.x(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, Locale locale) throws IOException {
            dVar.D(locale == null ? null : locale.toString());
        }
    }

    static class u extends c.a.e.x<c.a.e.l> {
        u() {
        }

        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public c.a.e.l e(c.a.e.c0.a aVar) throws IOException {
            switch (c0.f2284a[aVar.z().ordinal()]) {
                case 1:
                    return new c.a.e.r((Number) new c.a.e.a0.h(aVar.x()));
                case 2:
                    return new c.a.e.r(Boolean.valueOf(aVar.p()));
                case 3:
                    return new c.a.e.r(aVar.x());
                case 4:
                    aVar.v();
                    return c.a.e.n.f2315a;
                case 5:
                    c.a.e.i iVar = new c.a.e.i();
                    aVar.a();
                    while (aVar.l()) {
                        iVar.I(e(aVar));
                    }
                    aVar.h();
                    return iVar;
                case 6:
                    c.a.e.o oVar = new c.a.e.o();
                    aVar.b();
                    while (aVar.l()) {
                        oVar.I(aVar.t(), e(aVar));
                    }
                    aVar.i();
                    return oVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, c.a.e.l lVar) throws IOException {
            if (lVar == null || lVar.F()) {
                dVar.p();
                return;
            }
            if (lVar.H()) {
                c.a.e.r rVarY = lVar.y();
                if (rVarY.P()) {
                    dVar.C(rVarY.B());
                    return;
                } else if (rVarY.K()) {
                    dVar.E(rVarY.j());
                    return;
                } else {
                    dVar.D(rVarY.D());
                    return;
                }
            }
            if (lVar.E()) {
                dVar.e();
                Iterator<c.a.e.l> it = lVar.u().iterator();
                while (it.hasNext()) {
                    i(dVar, it.next());
                }
                dVar.h();
                return;
            }
            if (!lVar.G()) {
                throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
            }
            dVar.f();
            for (Map.Entry<String, c.a.e.l> entry : lVar.x().V()) {
                dVar.n(entry.getKey());
                i(dVar, entry.getValue());
            }
            dVar.i();
        }
    }

    static class v extends c.a.e.x<BitSet> {
        v() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        @Override // c.a.e.x
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet e(c.a.e.c0.a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                c.a.e.c0.c r1 = r8.z()
                r2 = 0
                r3 = 0
            Le:
                c.a.e.c0.c r4 = c.a.e.c0.c.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = c.a.e.a0.p.n.c0.f2284a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.x()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = 0
                goto L69
            L30:
                c.a.e.v r8 = new c.a.e.v
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                c.a.e.v r8 = new c.a.e.v
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.p()
                goto L69
            L63:
                int r1 = r8.r()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                c.a.e.c0.c r1 = r8.z()
                goto Le
            L75:
                r8.h()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: c.a.e.a0.p.n.v.e(c.a.e.c0.a):java.util.BitSet");
        }

        @Override // c.a.e.x
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(c.a.e.c0.d dVar, BitSet bitSet) throws IOException {
            dVar.e();
            int length = bitSet.length();
            for (int r1 = 0; r1 < length; r1++) {
                dVar.A(bitSet.get(r1) ? 1L : 0L);
            }
            dVar.h();
        }
    }

    static class w implements c.a.e.y {
        w() {
        }

        @Override // c.a.e.y
        public <T> c.a.e.x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            Class<? super T> clsF = aVar.f();
            if (!Enum.class.isAssignableFrom(clsF) || clsF == Enum.class) {
                return null;
            }
            if (!clsF.isEnum()) {
                clsF = clsF.getSuperclass();
            }
            return new k0(clsF);
        }
    }

    static class x implements c.a.e.y {
        final /* synthetic */ c.a.e.b0.a d;
        final /* synthetic */ c.a.e.x e;

        x(c.a.e.b0.a aVar, c.a.e.x xVar) {
            this.d = aVar;
            this.e = xVar;
        }

        @Override // c.a.e.y
        public <T> c.a.e.x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            if (aVar.equals(this.d)) {
                return this.e;
            }
            return null;
        }
    }

    static class y implements c.a.e.y {
        final /* synthetic */ Class d;
        final /* synthetic */ c.a.e.x e;

        y(Class cls, c.a.e.x xVar) {
            this.d = cls;
            this.e = xVar;
        }

        @Override // c.a.e.y
        public <T> c.a.e.x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            if (aVar.f() == this.d) {
                return this.e;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.d.getName() + ",adapter=" + this.e + "]";
        }
    }

    static class z implements c.a.e.y {
        final /* synthetic */ Class d;
        final /* synthetic */ Class e;
        final /* synthetic */ c.a.e.x f;

        z(Class cls, Class cls2, c.a.e.x xVar) {
            this.d = cls;
            this.e = cls2;
            this.f = xVar;
        }

        @Override // c.a.e.y
        public <T> c.a.e.x<T> b(c.a.e.f fVar, c.a.e.b0.a<T> aVar) {
            Class<? super T> clsF = aVar.f();
            if (clsF == this.d || clsF == this.e) {
                return this.f;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.e.getName() + "+" + this.d.getName() + ",adapter=" + this.f + "]";
        }
    }

    static {
        c.a.e.x<Class> xVarD = new k().d();
        f2279a = xVarD;
        f2280b = b(Class.class, xVarD);
        c.a.e.x<BitSet> xVarD2 = new v().d();
        f2281c = xVarD2;
        d = b(BitSet.class, xVarD2);
        e = new d0();
        f = new e0();
        g = c(Boolean.TYPE, Boolean.class, e);
        h = new f0();
        i = c(Byte.TYPE, Byte.class, h);
        j = new g0();
        k = c(Short.TYPE, Short.class, j);
        l = new h0();
        m = c(Integer.TYPE, Integer.class, l);
        c.a.e.x<AtomicInteger> xVarD3 = new i0().d();
        n = xVarD3;
        o = b(AtomicInteger.class, xVarD3);
        c.a.e.x<AtomicBoolean> xVarD4 = new j0().d();
        p = xVarD4;
        q = b(AtomicBoolean.class, xVarD4);
        c.a.e.x<AtomicIntegerArray> xVarD5 = new a().d();
        r = xVarD5;
        s = b(AtomicIntegerArray.class, xVarD5);
        t = new b();
        u = new c();
        v = new d();
        e eVar = new e();
        w = eVar;
        x = b(Number.class, eVar);
        y = new f();
        z = c(Character.TYPE, Character.class, y);
        A = new g();
        B = new h();
        C = new i();
        D = b(String.class, A);
        j jVar = new j();
        E = jVar;
        F = b(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = b(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = b(URL.class, mVar);
        C0155n c0155n = new C0155n();
        K = c0155n;
        L = b(URI.class, c0155n);
        o oVar = new o();
        M = oVar;
        N = e(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = b(UUID.class, pVar);
        c.a.e.x<Currency> xVarD6 = new q().d();
        Q = xVarD6;
        R = b(Currency.class, xVarD6);
        S = new r();
        s sVar = new s();
        T = sVar;
        U = d(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = b(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = e(c.a.e.l.class, uVar);
        Z = new w();
    }

    private n() {
        throw new UnsupportedOperationException();
    }

    public static <TT> c.a.e.y a(c.a.e.b0.a<TT> aVar, c.a.e.x<TT> xVar) {
        return new x(aVar, xVar);
    }

    public static <TT> c.a.e.y b(Class<TT> cls, c.a.e.x<TT> xVar) {
        return new y(cls, xVar);
    }

    public static <TT> c.a.e.y c(Class<TT> cls, Class<TT> cls2, c.a.e.x<? super TT> xVar) {
        return new z(cls, cls2, xVar);
    }

    public static <TT> c.a.e.y d(Class<TT> cls, Class<? extends TT> cls2, c.a.e.x<? super TT> xVar) {
        return new a0(cls, cls2, xVar);
    }

    public static <T1> c.a.e.y e(Class<T1> cls, c.a.e.x<T1> xVar) {
        return new b0(cls, xVar);
    }
}
