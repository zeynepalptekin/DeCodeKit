package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.p0;
import androidx.versionedparcelable.e;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

@p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
class g extends e {
    private static final Charset C = Charset.forName("UTF-16");
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 3;
    private static final int H = 4;
    private static final int I = 5;
    private static final int J = 6;
    private static final int K = 7;
    private static final int L = 8;
    private static final int M = 9;
    private static final int N = 10;
    private static final int O = 11;
    private static final int P = 12;
    private static final int Q = 13;
    private static final int R = 14;
    private int A;
    int B;
    private final DataInputStream t;
    private final DataOutputStream u;
    private DataInputStream v;
    private DataOutputStream w;
    private b x;
    private boolean y;
    int z;

    class a extends FilterInputStream {
        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            g gVar = g.this;
            int r1 = gVar.B;
            if (r1 != -1 && gVar.z >= r1) {
                throw new IOException();
            }
            int r0 = super.read();
            g.this.z++;
            return r0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int r5, int r6) throws IOException {
            g gVar = g.this;
            int r1 = gVar.B;
            if (r1 != -1 && gVar.z >= r1) {
                throw new IOException();
            }
            int r4 = super.read(bArr, r5, r6);
            if (r4 > 0) {
                g.this.z += r4;
            }
            return r4;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            g gVar = g.this;
            int r1 = gVar.B;
            if (r1 != -1 && gVar.z >= r1) {
                throw new IOException();
            }
            long jSkip = super.skip(j);
            if (jSkip > 0) {
                g.this.z += (int) jSkip;
            }
            return jSkip;
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final ByteArrayOutputStream f760a = new ByteArrayOutputStream();

        /* renamed from: b, reason: collision with root package name */
        final DataOutputStream f761b = new DataOutputStream(this.f760a);

        /* renamed from: c, reason: collision with root package name */
        private final int f762c;
        private final DataOutputStream d;

        b(int r3, DataOutputStream dataOutputStream) {
            this.f762c = r3;
            this.d = dataOutputStream;
        }

        void a() throws IOException {
            this.f761b.flush();
            int size = this.f760a.size();
            this.d.writeInt((this.f762c << 16) | (size >= 65535 ? b.i.g.b.a.f1046a : size));
            if (size >= 65535) {
                this.d.writeInt(size);
            }
            this.f760a.writeTo(this.d);
        }
    }

    public g(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new b.f.a(), new b.f.a(), new b.f.a());
    }

    private g(InputStream inputStream, OutputStream outputStream, b.f.a<String, Method> aVar, b.f.a<String, Method> aVar2, b.f.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.z = 0;
        this.A = -1;
        this.B = -1;
        this.t = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.u = dataOutputStream;
        this.v = this.t;
        this.w = dataOutputStream;
    }

    private void o1(int r3, String str, Bundle bundle) {
        switch (r3) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException("Unknown type " + r3);
        }
    }

    private void p1(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int r4;
        if (obj == null) {
            r4 = 0;
        } else {
            if (obj instanceof Bundle) {
                L0(1);
                q0((Bundle) obj);
                return;
            }
            if (obj instanceof String) {
                L0(3);
                e1((String) obj);
                return;
            }
            if (obj instanceof String[]) {
                L0(4);
                k0((String[]) obj);
                return;
            }
            if (obj instanceof Boolean) {
                L0(5);
                m0(((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof boolean[]) {
                L0(6);
                o0((boolean[]) obj);
                return;
            }
            if (obj instanceof Double) {
                L0(7);
                C0(((Double) obj).doubleValue());
                return;
            }
            if (obj instanceof double[]) {
                L0(8);
                E0((double[]) obj);
                return;
            }
            if (!(obj instanceof Integer)) {
                if (obj instanceof int[]) {
                    L0(10);
                    N0((int[]) obj);
                    return;
                }
                if (obj instanceof Long) {
                    L0(11);
                    Q0(((Long) obj).longValue());
                    return;
                }
                if (obj instanceof long[]) {
                    L0(12);
                    S0((long[]) obj);
                    return;
                }
                if (obj instanceof Float) {
                    L0(13);
                    H0(((Float) obj).floatValue());
                    return;
                } else if (obj instanceof float[]) {
                    L0(14);
                    J0((float[]) obj);
                    return;
                } else {
                    throw new IllegalArgumentException("Unsupported type " + obj.getClass());
                }
            }
            L0(9);
            r4 = ((Integer) obj).intValue();
        }
        L0(r4);
    }

    @Override // androidx.versionedparcelable.e
    public void C0(double d) throws IOException {
        try {
            this.w.writeDouble(d);
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public boolean F(int r5) throws IOException {
        while (this.A != r5) {
            try {
                if (String.valueOf(this.A).compareTo(String.valueOf(r5)) > 0) {
                    return false;
                }
                if (this.z < this.B) {
                    this.t.skip(this.B - this.z);
                }
                this.B = -1;
                int r1 = this.t.readInt();
                this.z = 0;
                int r3 = r1 & b.i.g.b.a.f1046a;
                if (r3 == 65535) {
                    r3 = this.t.readInt();
                }
                this.A = (r1 >> 16) & b.i.g.b.a.f1046a;
                this.B = r3;
            } catch (IOException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.versionedparcelable.e
    public float G() {
        try {
            return this.v.readFloat();
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void H0(float f) throws IOException {
        try {
            this.w.writeFloat(f);
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public int L() {
        try {
            return this.v.readInt();
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void L0(int r2) throws IOException {
        try {
            this.w.writeInt(r2);
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public long Q() {
        try {
            return this.v.readLong();
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void Q0(long j) throws IOException {
        try {
            this.w.writeLong(j);
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // androidx.versionedparcelable.e
    public void W0(Parcelable parcelable) {
        if (!this.y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.e
    public void a() {
        b bVar = this.x;
        if (bVar != null) {
            try {
                if (bVar.f760a.size() != 0) {
                    this.x.a();
                }
                this.x = null;
            } catch (IOException e) {
                throw new e.b(e);
            }
        }
    }

    @Override // androidx.versionedparcelable.e
    protected e c() {
        return new g(this.v, this.w, this.f757a, this.f758b, this.f759c);
    }

    @Override // androidx.versionedparcelable.e
    public String c0() throws IOException {
        try {
            int r0 = this.v.readInt();
            if (r0 <= 0) {
                return null;
            }
            byte[] bArr = new byte[r0];
            this.v.readFully(bArr);
            return new String(bArr, C);
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public IBinder e0() {
        return null;
    }

    @Override // androidx.versionedparcelable.e
    public void e1(String str) throws IOException {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(C);
                this.w.writeInt(bytes.length);
                this.w.write(bytes);
            } else {
                this.w.writeInt(-1);
            }
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void g1(IBinder iBinder) {
        if (!this.y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.e
    public boolean i() {
        return true;
    }

    @Override // androidx.versionedparcelable.e
    public void i0(int r3) {
        a();
        b bVar = new b(r3, this.u);
        this.x = bVar;
        this.w = bVar.f761b;
    }

    @Override // androidx.versionedparcelable.e
    public void i1(IInterface iInterface) {
        if (!this.y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.e
    public void j0(boolean z, boolean z2) {
        if (!z) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.y = z2;
    }

    @Override // androidx.versionedparcelable.e
    public boolean l() {
        try {
            return this.v.readBoolean();
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void m0(boolean z) throws IOException {
        try {
            this.w.writeBoolean(z);
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public Bundle p() throws IOException {
        int r0 = L();
        if (r0 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int r2 = 0; r2 < r0; r2++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    @Override // androidx.versionedparcelable.e
    public void q0(Bundle bundle) throws IOException {
        try {
            if (bundle == null) {
                this.w.writeInt(-1);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            this.w.writeInt(setKeySet.size());
            for (String str : setKeySet) {
                e1(str);
                p1(bundle.get(str));
            }
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public byte[] s() throws IOException {
        try {
            int r0 = this.v.readInt();
            if (r0 <= 0) {
                return null;
            }
            byte[] bArr = new byte[r0];
            this.v.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public void t0(byte[] bArr) throws IOException {
        try {
            if (bArr != null) {
                this.w.writeInt(bArr.length);
                this.w.write(bArr);
            } else {
                this.w.writeInt(-1);
            }
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    protected CharSequence v() {
        return null;
    }

    @Override // androidx.versionedparcelable.e
    public void v0(byte[] bArr, int r3, int r4) throws IOException {
        try {
            if (bArr != null) {
                this.w.writeInt(r4);
                this.w.write(bArr, r3, r4);
            } else {
                this.w.writeInt(-1);
            }
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    public double y() {
        try {
            return this.v.readDouble();
        } catch (IOException e) {
            throw new e.b(e);
        }
    }

    @Override // androidx.versionedparcelable.e
    protected void y0(CharSequence charSequence) {
        if (!this.y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }
}
