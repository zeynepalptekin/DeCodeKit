package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;
import com.google.android.gms.internal.ads.l92.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class l92<MessageType extends l92<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends q72<MessageType, BuilderType> {
    private static Map<Object, l92<?, ?>> zzije = new ConcurrentHashMap();
    protected qc2 zzijc = qc2.h();
    private int zzijd = -1;

    public static class a<T extends l92<T, ?>> extends r72<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f4224b;

        public a(T t) {
            this.f4224b = t;
        }
    }

    public static abstract class b<MessageType extends l92<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends p72<MessageType, BuilderType> {
        private final MessageType d;
        protected MessageType e;
        protected boolean f = false;

        protected b(MessageType messagetype) {
            this.d = messagetype;
            this.e = (MessageType) messagetype.t(e.d, null, null);
        }

        private static void o(MessageType messagetype, MessageType messagetype2) {
            mb2.b().a(messagetype).b(messagetype, messagetype2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.ads.p72
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final BuilderType l(m82 m82Var, y82 y82Var) throws IOException {
            if (this.f) {
                s();
                this.f = false;
            }
            try {
                mb2.b().a(this.e).e(this.e, t82.a(m82Var), y82Var);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        private final BuilderType r(byte[] bArr, int r10, int r11, y82 y82Var) throws w92 {
            if (this.f) {
                s();
                this.f = false;
            }
            try {
                mb2.b().a(this.e).a(this.e, bArr, 0, r11 + 0, new v72(y82Var));
                return this;
            } catch (w92 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw w92.a();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ads.p72
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            b bVar = (b) this.d.t(e.e, null, null);
            bVar.k((l92) E());
            return bVar;
        }

        @Override // com.google.android.gms.internal.ads.za2
        public final /* synthetic */ xa2 g() {
            return this.d;
        }

        @Override // com.google.android.gms.internal.ads.za2
        public final boolean isInitialized() {
            return l92.x(this.e, false);
        }

        @Override // com.google.android.gms.internal.ads.p72
        public final /* synthetic */ p72 m(byte[] bArr, int r2, int r3, y82 y82Var) throws w92 {
            return r(bArr, 0, r3, y82Var);
        }

        @Override // com.google.android.gms.internal.ads.p72
        /* renamed from: n */
        public final /* synthetic */ p72 clone() {
            return (b) clone();
        }

        @Override // com.google.android.gms.internal.ads.p72
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final BuilderType k(MessageType messagetype) {
            if (this.f) {
                s();
                this.f = false;
            }
            o(this.e, messagetype);
            return this;
        }

        protected void s() {
            MessageType messagetype = (MessageType) this.e.t(e.d, null, null);
            o(messagetype, this.e);
            this.e = messagetype;
        }

        @Override // com.google.android.gms.internal.ads.ab2
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public MessageType E() {
            if (this.f) {
                return this.e;
            }
            MessageType messagetype = this.e;
            mb2.b().a(messagetype).c(messagetype);
            this.f = true;
            return this.e;
        }

        @Override // com.google.android.gms.internal.ads.ab2
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final MessageType P() {
            MessageType messagetype = (MessageType) E();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new nc2(messagetype);
        }
    }

    static final class c implements g92<c> {
        @Override // com.google.android.gms.internal.ads.g92
        public final hd2 D() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.g92
        public final gb2 F(gb2 gb2Var, gb2 gb2Var2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.g92
        public final ab2 K(ab2 ab2Var, xa2 xa2Var) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.g92
        public final boolean L() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.g92
        public final int h() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.g92
        public final boolean l() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.g92
        public final ed2 u() {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends l92<MessageType, BuilderType> implements za2 {
        protected e92<c> zzijj = e92.p();

        final e92<c> H() {
            if (this.zzijj.b()) {
                this.zzijj = (e92) this.zzijj.clone();
            }
            return this.zzijj;
        }
    }

    public enum e {

        /* renamed from: a, reason: collision with root package name */
        public static final int f4225a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f4226b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f4227c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final int i = 1;
        public static final int j = 2;
        public static final int l = 1;
        public static final int m = 2;
        private static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] k = {1, 2};
        private static final /* synthetic */ int[] n = {1, 2};

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    public static class f<ContainingType extends xa2, Type> extends z82<ContainingType, Type> {
    }

    protected static s92 C() {
        return p92.i();
    }

    protected static u92 D() {
        return ka2.i();
    }

    protected static <E> x92<E> F() {
        return lb2.h();
    }

    static <T extends l92<?, ?>> T G(Class<T> cls) throws ClassNotFoundException {
        l92<?, ?> l92Var = zzije.get(cls);
        if (l92Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                l92Var = zzije.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (l92Var == null) {
            l92Var = (T) ((l92) tc2.x(cls)).t(e.f, null, null);
            if (l92Var == null) {
                throw new IllegalStateException();
            }
            zzije.put(cls, l92Var);
        }
        return (T) l92Var;
    }

    private static <T extends l92<T, ?>> T k(T t) throws w92 {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw new w92(new nc2(t).getMessage()).j(t);
    }

    protected static <T extends l92<T, ?>> T l(T t, a82 a82Var) throws w92 {
        return (T) k(k(y(t, a82Var, y82.b())));
    }

    protected static <T extends l92<T, ?>> T m(T t, a82 a82Var, y82 y82Var) throws w92 {
        return (T) k(y(t, a82Var, y82Var));
    }

    private static <T extends l92<T, ?>> T n(T t, m82 m82Var, y82 y82Var) throws w92 {
        T t2 = (T) t.t(e.d, null, null);
        try {
            ub2 ub2VarA = mb2.b().a(t2);
            ub2VarA.e(t2, t82.a(m82Var), y82Var);
            ub2VarA.c(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof w92) {
                throw ((w92) e2.getCause());
            }
            throw new w92(e2.getMessage()).j(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof w92) {
                throw ((w92) e3.getCause());
            }
            throw e3;
        }
    }

    protected static <T extends l92<T, ?>> T o(T t, byte[] bArr) throws w92 {
        return (T) k(p(t, bArr, 0, bArr.length, y82.b()));
    }

    private static <T extends l92<T, ?>> T p(T t, byte[] bArr, int r8, int r9, y82 y82Var) throws w92 {
        T t2 = (T) t.t(e.d, null, null);
        try {
            ub2 ub2VarA = mb2.b().a(t2);
            ub2VarA.a(t2, bArr, 0, r9, new v72(y82Var));
            ub2VarA.c(t2);
            if (t2.zziee == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof w92) {
                throw ((w92) e2.getCause());
            }
            throw new w92(e2.getMessage()).j(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw w92.a().j(t2);
        }
    }

    protected static <T extends l92<T, ?>> T q(T t, byte[] bArr, y82 y82Var) throws w92 {
        return (T) k(p(t, bArr, 0, bArr.length, y82Var));
    }

    protected static s92 r(s92 s92Var) {
        int size = s92Var.size();
        return s92Var.k(size == 0 ? 10 : size << 1);
    }

    protected static <E> x92<E> s(x92<E> x92Var) {
        int size = x92Var.size();
        return x92Var.k(size == 0 ? 10 : size << 1);
    }

    protected static Object u(xa2 xa2Var, String str, Object[] objArr) {
        return new pb2(xa2Var, str, objArr);
    }

    static Object v(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static <T extends l92<?, ?>> void w(Class<T> cls, T t) {
        zzije.put(cls, t);
    }

    protected static final <T extends l92<T, ?>> boolean x(T t, boolean z) {
        byte bByteValue = ((Byte) t.t(e.f4225a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zH = mb2.b().a(t).h(t);
        if (z) {
            t.t(e.f4226b, zH ? t : null, null);
        }
        return zH;
    }

    private static <T extends l92<T, ?>> T y(T t, a82 a82Var, y82 y82Var) throws w92 {
        try {
            m82 m82VarV = a82Var.v();
            T t2 = (T) n(t, m82VarV, y82Var);
            try {
                m82VarV.x(0);
                return t2;
            } catch (w92 e2) {
                throw e2.j(t2);
            }
        } catch (w92 e3) {
            throw e3;
        }
    }

    public final BuilderType A() {
        BuilderType buildertype = (BuilderType) t(e.e, null, null);
        buildertype.k(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.xa2
    public final int b() {
        if (this.zzijd == -1) {
            this.zzijd = mb2.b().a(this).d(this);
        }
        return this.zzijd;
    }

    @Override // com.google.android.gms.internal.ads.xa2
    public final /* synthetic */ ab2 c() {
        b bVar = (b) t(e.e, null, null);
        bVar.k(this);
        return bVar;
    }

    @Override // com.google.android.gms.internal.ads.xa2
    public final void d(v82 v82Var) throws IOException {
        mb2.b().a(this).j(this, x82.a(v82Var));
    }

    @Override // com.google.android.gms.internal.ads.xa2
    public final /* synthetic */ ab2 e() {
        return (b) t(e.e, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return mb2.b().a(this).f(this, (l92) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.za2
    public final /* synthetic */ xa2 g() {
        return (l92) t(e.f, null, null);
    }

    public int hashCode() {
        int r0 = this.zziee;
        if (r0 != 0) {
            return r0;
        }
        int i = mb2.b().a(this).i(this);
        this.zziee = i;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.q72
    final int i() {
        return this.zzijd;
    }

    @Override // com.google.android.gms.internal.ads.za2
    public final boolean isInitialized() {
        return x(this, true);
    }

    @Override // com.google.android.gms.internal.ads.q72
    final void j(int r1) {
        this.zzijd = r1;
    }

    protected abstract Object t(int r1, Object obj, Object obj2);

    public String toString() {
        return cb2.a(this, super.toString());
    }

    protected final <MessageType extends l92<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType z() {
        return (BuilderType) t(e.e, null, null);
    }
}
