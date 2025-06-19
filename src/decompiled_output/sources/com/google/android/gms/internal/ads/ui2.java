package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface ui2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f5525a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a();

    int b();

    boolean c(int r1, int r2, int r3) throws xi2;

    boolean d();

    int e();

    void f();

    void flush();

    void g(ByteBuffer byteBuffer);

    ByteBuffer h();

    boolean u0();
}
