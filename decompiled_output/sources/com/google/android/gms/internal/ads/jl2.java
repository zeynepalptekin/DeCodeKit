package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.c.a;

/* loaded from: classes.dex */
class jl2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3993a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f3991b = nq2.l("ftyp");

    /* renamed from: c, reason: collision with root package name */
    public static final int f3992c = nq2.l("avc1");
    public static final int d = nq2.l("avc3");
    public static final int e = nq2.l("hvc1");
    public static final int f = nq2.l("hev1");
    public static final int g = nq2.l("s263");
    public static final int h = nq2.l("d263");
    public static final int i = nq2.l("mdat");
    public static final int j = nq2.l("mp4a");
    public static final int k = nq2.l(".mp3");
    public static final int l = nq2.l("wave");
    public static final int m = nq2.l("lpcm");
    public static final int n = nq2.l("sowt");
    public static final int o = nq2.l("ac-3");
    public static final int p = nq2.l("dac3");
    public static final int q = nq2.l("ec-3");
    public static final int r = nq2.l("dec3");
    public static final int s = nq2.l("dtsc");
    public static final int t = nq2.l("dtsh");
    public static final int u = nq2.l("dtsl");
    public static final int v = nq2.l("dtse");
    public static final int w = nq2.l("ddts");
    public static final int x = nq2.l("tfdt");
    public static final int y = nq2.l("tfhd");
    public static final int z = nq2.l("trex");
    public static final int A = nq2.l("trun");
    public static final int B = nq2.l("sidx");
    public static final int C = nq2.l("moov");
    public static final int D = nq2.l("mvhd");
    public static final int E = nq2.l("trak");
    public static final int F = nq2.l("mdia");
    public static final int G = nq2.l("minf");
    public static final int H = nq2.l("stbl");
    public static final int I = nq2.l("avcC");
    public static final int J = nq2.l("hvcC");
    public static final int K = nq2.l("esds");
    public static final int L = nq2.l("moof");
    public static final int M = nq2.l("traf");
    public static final int N = nq2.l("mvex");
    public static final int O = nq2.l("mehd");
    public static final int P = nq2.l("tkhd");
    public static final int Q = nq2.l("edts");
    public static final int R = nq2.l("elst");
    public static final int S = nq2.l("mdhd");
    public static final int T = nq2.l("hdlr");
    public static final int U = nq2.l("stsd");
    public static final int V = nq2.l("pssh");
    public static final int W = nq2.l("sinf");
    public static final int X = nq2.l("schm");
    public static final int Y = nq2.l("schi");
    public static final int Z = nq2.l("tenc");
    public static final int a0 = nq2.l("encv");
    public static final int b0 = nq2.l("enca");
    public static final int c0 = nq2.l("frma");
    public static final int d0 = nq2.l("saiz");
    public static final int e0 = nq2.l("saio");
    public static final int f0 = nq2.l("sbgp");
    public static final int g0 = nq2.l("sgpd");
    public static final int h0 = nq2.l("uuid");
    public static final int i0 = nq2.l("senc");
    public static final int j0 = nq2.l("pasp");
    public static final int k0 = nq2.l("TTML");
    private static final int l0 = nq2.l("vmhd");
    public static final int m0 = nq2.l("mp4v");
    public static final int n0 = nq2.l("stts");
    public static final int o0 = nq2.l("stss");
    public static final int p0 = nq2.l("ctts");
    public static final int q0 = nq2.l("stsc");
    public static final int r0 = nq2.l("stsz");
    public static final int s0 = nq2.l("stz2");
    public static final int t0 = nq2.l("stco");
    public static final int u0 = nq2.l("co64");
    public static final int v0 = nq2.l("tx3g");
    public static final int w0 = nq2.l("wvtt");
    public static final int x0 = nq2.l("stpp");
    public static final int y0 = nq2.l("c608");
    public static final int z0 = nq2.l("samr");
    public static final int A0 = nq2.l("sawb");
    public static final int B0 = nq2.l("udta");
    public static final int C0 = nq2.l("meta");
    public static final int D0 = nq2.l("ilst");
    public static final int E0 = nq2.l("mean");
    public static final int F0 = nq2.l(a.C0190a.f6334b);
    public static final int G0 = nq2.l("data");
    public static final int H0 = nq2.l("emsg");
    public static final int I0 = nq2.l("st3d");
    public static final int J0 = nq2.l("sv3d");
    public static final int K0 = nq2.l("proj");
    public static final int L0 = nq2.l("vp08");
    public static final int M0 = nq2.l("vp09");
    public static final int N0 = nq2.l("vpcC");
    public static final int O0 = nq2.l("camm");
    public static final int P0 = nq2.l("alac");

    public jl2(int r1) {
        this.f3993a = r1;
    }

    public static int a(int r02) {
        return (r02 >> 24) & 255;
    }

    public static int b(int r1) {
        return r1 & b.i.p.f0.s;
    }

    public static String c(int r5) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (r5 >>> 24));
        sb.append((char) ((r5 >> 16) & 255));
        sb.append((char) ((r5 >> 8) & 255));
        sb.append((char) (r5 & 255));
        return sb.toString();
    }

    public String toString() {
        return c(this.f3993a);
    }
}
