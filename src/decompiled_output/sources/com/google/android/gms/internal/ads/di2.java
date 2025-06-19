package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class di2 implements Parcelable {
    public static final Parcelable.Creator<di2> CREATOR = new gi2();
    public final int A;
    public final String B;
    private final int C;
    private int D;
    private final String d;
    public final int e;
    public final String f;
    private final wm2 g;
    private final String h;
    public final String i;
    public final int j;
    public final List<byte[]> k;
    public final ek2 l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    private final int r;
    private final byte[] s;
    private final oq2 t;
    public final int u;
    public final int v;
    public final int w;
    private final int x;
    private final int y;
    public final long z;

    di2(Parcel parcel) {
        this.d = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.f = parcel.readString();
        this.e = parcel.readInt();
        this.j = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.o = parcel.readFloat();
        this.p = parcel.readInt();
        this.q = parcel.readFloat();
        this.s = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.r = parcel.readInt();
        this.t = (oq2) parcel.readParcelable(oq2.class.getClassLoader());
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.z = parcel.readLong();
        int r0 = parcel.readInt();
        this.k = new ArrayList(r0);
        for (int r1 = 0; r1 < r0; r1++) {
            this.k.add(parcel.createByteArray());
        }
        this.l = (ek2) parcel.readParcelable(ek2.class.getClassLoader());
        this.g = (wm2) parcel.readParcelable(wm2.class.getClassLoader());
    }

    private di2(String str, String str2, String str3, String str4, int r8, int r9, int r10, int r11, float f, int r13, float f2, byte[] bArr, int r16, oq2 oq2Var, int r18, int r19, int r20, int r21, int r22, int r23, String str5, int r25, long j, List<byte[]> list, ek2 ek2Var, wm2 wm2Var) {
        this.d = str;
        this.h = str2;
        this.i = str3;
        this.f = str4;
        this.e = r8;
        this.j = r9;
        this.m = r10;
        this.n = r11;
        this.o = f;
        this.p = r13;
        this.q = f2;
        this.s = bArr;
        this.r = r16;
        this.t = oq2Var;
        this.u = r18;
        this.v = r19;
        this.w = r20;
        this.x = r21;
        this.y = r22;
        this.A = r23;
        this.B = str5;
        this.C = r25;
        this.z = j;
        this.k = list == null ? Collections.emptyList() : list;
        this.l = ek2Var;
        this.g = wm2Var;
    }

    public static di2 c(String str, String str2, long j) {
        return new di2(null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static di2 d(String str, String str2, String str3, int r32, int r33, int r34, int r35, float f, List<byte[]> list, int r38, float f2, byte[] bArr, int r41, oq2 oq2Var, ek2 ek2Var) {
        return new di2(str, null, str2, null, -1, r33, r34, r35, -1.0f, r38, f2, bArr, r41, oq2Var, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, ek2Var, null);
    }

    public static di2 e(String str, String str2, String str3, int r32, int r33, int r34, int r35, int r36, List<byte[]> list, ek2 ek2Var, int r39, String str4) {
        return new di2(str, null, str2, null, -1, r33, -1, -1, -1.0f, -1, -1.0f, null, -1, null, r34, r35, r36, -1, -1, r39, str4, -1, Long.MAX_VALUE, list, ek2Var, null);
    }

    public static di2 f(String str, String str2, String str3, int r15, int r16, int r17, int r18, List<byte[]> list, ek2 ek2Var, int r21, String str4) {
        return e(str, str2, null, -1, -1, r17, r18, -1, null, ek2Var, 0, str4);
    }

    public static di2 g(String str, String str2, String str3, int r32, int r33, String str4, int r35, ek2 ek2Var, long j, List<byte[]> list) {
        return new di2(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, r33, str4, -1, j, list, ek2Var, null);
    }

    public static di2 h(String str, String str2, String str3, int r14, int r15, String str4, ek2 ek2Var) {
        return g(str, str2, null, -1, r15, str4, -1, ek2Var, Long.MAX_VALUE, Collections.emptyList());
    }

    public static di2 i(String str, String str2, String str3, int r32, ek2 ek2Var) {
        return new di2(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, ek2Var, null);
    }

    public static di2 j(String str, String str2, String str3, int r32, List<byte[]> list, String str4, ek2 ek2Var) {
        return new di2(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, ek2Var, null);
    }

    @TargetApi(16)
    private static void k(MediaFormat mediaFormat, String str, int r3) {
        if (r3 != -1) {
            mediaFormat.setInteger(str, r3);
        }
    }

    public final di2 a(ek2 ek2Var) {
        return new di2(this.d, this.h, this.i, this.f, this.e, this.j, this.m, this.n, this.o, this.p, this.q, this.s, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.A, this.B, this.C, this.z, this.k, ek2Var, this.g);
    }

    public final di2 b(wm2 wm2Var) {
        return new di2(this.d, this.h, this.i, this.f, this.e, this.j, this.m, this.n, this.o, this.p, this.q, this.s, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.A, this.B, this.C, this.z, this.k, this.l, wm2Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && di2.class == obj.getClass()) {
            di2 di2Var = (di2) obj;
            if (this.e == di2Var.e && this.j == di2Var.j && this.m == di2Var.m && this.n == di2Var.n && this.o == di2Var.o && this.p == di2Var.p && this.q == di2Var.q && this.r == di2Var.r && this.u == di2Var.u && this.v == di2Var.v && this.w == di2Var.w && this.x == di2Var.x && this.y == di2Var.y && this.z == di2Var.z && this.A == di2Var.A && nq2.g(this.d, di2Var.d) && nq2.g(this.B, di2Var.B) && this.C == di2Var.C && nq2.g(this.h, di2Var.h) && nq2.g(this.i, di2Var.i) && nq2.g(this.f, di2Var.f) && nq2.g(this.l, di2Var.l) && nq2.g(this.g, di2Var.g) && nq2.g(this.t, di2Var.t) && Arrays.equals(this.s, di2Var.s) && this.k.size() == di2Var.k.size()) {
                for (int r2 = 0; r2 < this.k.size(); r2++) {
                    if (!Arrays.equals(this.k.get(r2), di2Var.k.get(r2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.D == 0) {
            String str = this.d;
            int r0 = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.h;
            int r02 = (r0 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.i;
            int r03 = (r02 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int r04 = (((((((((((r03 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.e) * 31) + this.m) * 31) + this.n) * 31) + this.u) * 31) + this.v) * 31;
            String str5 = this.B;
            int r05 = (((r04 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.C) * 31;
            ek2 ek2Var = this.l;
            int r06 = (r05 + (ek2Var == null ? 0 : ek2Var.hashCode())) * 31;
            wm2 wm2Var = this.g;
            this.D = r06 + (wm2Var != null ? wm2Var.hashCode() : 0);
        }
        return this.D;
    }

    public final di2 l(int r31, int r32) {
        return new di2(this.d, this.h, this.i, this.f, this.e, this.j, this.m, this.n, this.o, this.p, this.q, this.s, this.r, this.t, this.u, this.v, this.w, r31, r32, this.A, this.B, this.C, this.z, this.k, this.l, this.g);
    }

    public final di2 m(long j) {
        return new di2(this.d, this.h, this.i, this.f, this.e, this.j, this.m, this.n, this.o, this.p, this.q, this.s, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.A, this.B, this.C, j, this.k, this.l, this.g);
    }

    public final int p() {
        int r2;
        int r0 = this.m;
        if (r0 == -1 || (r2 = this.n) == -1) {
            return -1;
        }
        return r0 * r2;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat q() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.i);
        String str = this.B;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        k(mediaFormat, "max-input-size", this.j);
        k(mediaFormat, "width", this.m);
        k(mediaFormat, "height", this.n);
        float f = this.o;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        k(mediaFormat, "rotation-degrees", this.p);
        k(mediaFormat, "channel-count", this.u);
        k(mediaFormat, "sample-rate", this.v);
        k(mediaFormat, "encoder-delay", this.x);
        k(mediaFormat, "encoder-padding", this.y);
        for (int r1 = 0; r1 < this.k.size(); r1++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(r1);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.k.get(r1)));
        }
        oq2 oq2Var = this.t;
        if (oq2Var != null) {
            k(mediaFormat, "color-transfer", oq2Var.f);
            k(mediaFormat, "color-standard", oq2Var.d);
            k(mediaFormat, "color-range", oq2Var.e);
            byte[] bArr = oq2Var.g;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final di2 t(int r32) {
        return new di2(this.d, this.h, this.i, this.f, this.e, r32, this.m, this.n, this.o, this.p, this.q, this.s, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.A, this.B, this.C, this.z, this.k, this.l, this.g);
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.h;
        String str3 = this.i;
        int r3 = this.e;
        String str4 = this.B;
        int r5 = this.m;
        int r6 = this.n;
        float f = this.o;
        int r8 = this.u;
        int r9 = this.v;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(r3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(r5);
        sb.append(", ");
        sb.append(r6);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(r8);
        sb.append(", ");
        sb.append(r9);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        parcel.writeString(this.d);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.f);
        parcel.writeInt(this.e);
        parcel.writeInt(this.j);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeFloat(this.o);
        parcel.writeInt(this.p);
        parcel.writeFloat(this.q);
        parcel.writeInt(this.s != null ? 1 : 0);
        byte[] bArr = this.s;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.r);
        parcel.writeParcelable(this.t, r6);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeLong(this.z);
        int size = this.k.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeByteArray(this.k.get(r0));
        }
        parcel.writeParcelable(this.l, 0);
        parcel.writeParcelable(this.g, 0);
    }
}
