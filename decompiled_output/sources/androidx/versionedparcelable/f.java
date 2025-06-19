package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.p0;
import java.lang.reflect.Method;

@p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
class f extends e {
    private static final boolean B = false;
    private static final String C = "VersionedParcelParcel";
    private int A;
    private final SparseIntArray t;
    private final Parcel u;
    private final int v;
    private final int w;
    private final String x;
    private int y;
    private int z;

    f(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new b.f.a(), new b.f.a(), new b.f.a());
    }

    private f(Parcel parcel, int r2, int r3, String str, b.f.a<String, Method> aVar, b.f.a<String, Method> aVar2, b.f.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.t = new SparseIntArray();
        this.y = -1;
        this.z = 0;
        this.A = -1;
        this.u = parcel;
        this.v = r2;
        this.w = r3;
        this.z = r2;
        this.x = str;
    }

    @Override // androidx.versionedparcelable.e
    public void C0(double d) {
        this.u.writeDouble(d);
    }

    @Override // androidx.versionedparcelable.e
    public boolean F(int r5) {
        while (this.z < this.w) {
            int r0 = this.A;
            if (r0 == r5) {
                return true;
            }
            if (String.valueOf(r0).compareTo(String.valueOf(r5)) > 0) {
                return false;
            }
            this.u.setDataPosition(this.z);
            int r02 = this.u.readInt();
            this.A = this.u.readInt();
            this.z += r02;
        }
        return this.A == r5;
    }

    @Override // androidx.versionedparcelable.e
    public float G() {
        return this.u.readFloat();
    }

    @Override // androidx.versionedparcelable.e
    public void H0(float f) {
        this.u.writeFloat(f);
    }

    @Override // androidx.versionedparcelable.e
    public int L() {
        return this.u.readInt();
    }

    @Override // androidx.versionedparcelable.e
    public void L0(int r2) {
        this.u.writeInt(r2);
    }

    @Override // androidx.versionedparcelable.e
    public long Q() {
        return this.u.readLong();
    }

    @Override // androidx.versionedparcelable.e
    public void Q0(long j) {
        this.u.writeLong(j);
    }

    @Override // androidx.versionedparcelable.e
    public <T extends Parcelable> T V() {
        return (T) this.u.readParcelable(f.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.e
    public void W0(Parcelable parcelable) {
        this.u.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.e
    public void a() {
        int r0 = this.y;
        if (r0 >= 0) {
            int r02 = this.t.get(r0);
            int r1 = this.u.dataPosition();
            this.u.setDataPosition(r02);
            this.u.writeInt(r1 - r02);
            this.u.setDataPosition(r1);
        }
    }

    @Override // androidx.versionedparcelable.e
    protected e c() {
        Parcel parcel = this.u;
        int r2 = parcel.dataPosition();
        int r0 = this.z;
        if (r0 == this.v) {
            r0 = this.w;
        }
        return new f(parcel, r2, r0, this.x + "  ", this.f757a, this.f758b, this.f759c);
    }

    @Override // androidx.versionedparcelable.e
    public String c0() {
        return this.u.readString();
    }

    @Override // androidx.versionedparcelable.e
    public IBinder e0() {
        return this.u.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.e
    public void e1(String str) {
        this.u.writeString(str);
    }

    @Override // androidx.versionedparcelable.e
    public void g1(IBinder iBinder) {
        this.u.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.e
    public void i0(int r3) {
        a();
        this.y = r3;
        this.t.put(r3, this.u.dataPosition());
        L0(0);
        L0(r3);
    }

    @Override // androidx.versionedparcelable.e
    public void i1(IInterface iInterface) {
        this.u.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.e
    public boolean l() {
        return this.u.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.e
    public void m0(boolean z) {
        this.u.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.e
    public Bundle p() {
        return this.u.readBundle(f.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.e
    public void q0(Bundle bundle) {
        this.u.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.e
    public byte[] s() {
        int r0 = this.u.readInt();
        if (r0 < 0) {
            return null;
        }
        byte[] bArr = new byte[r0];
        this.u.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.e
    public void t0(byte[] bArr) {
        if (bArr == null) {
            this.u.writeInt(-1);
        } else {
            this.u.writeInt(bArr.length);
            this.u.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.e
    protected CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.u);
    }

    @Override // androidx.versionedparcelable.e
    public void v0(byte[] bArr, int r4, int r5) {
        if (bArr == null) {
            this.u.writeInt(-1);
        } else {
            this.u.writeInt(bArr.length);
            this.u.writeByteArray(bArr, r4, r5);
        }
    }

    @Override // androidx.versionedparcelable.e
    public double y() {
        return this.u.readDouble();
    }

    @Override // androidx.versionedparcelable.e
    protected void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.u, 0);
    }
}
