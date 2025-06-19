package com.google.firebase.analytics.a;

import android.os.Bundle;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.q0;
import androidx.annotation.y0;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface a {

    @com.google.android.gms.common.annotation.a
    /* renamed from: com.google.firebase.analytics.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0206a {
        @com.google.android.gms.common.annotation.a
        void a();

        @com.google.android.gms.common.annotation.a
        void b();

        @com.google.android.gms.common.annotation.a
        void c(Set<String> set);
    }

    @com.google.android.gms.common.annotation.a
    public interface b {
        @com.google.android.gms.common.annotation.a
        void a(int r1, @i0 Bundle bundle);
    }

    @com.google.android.gms.common.annotation.a
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @com.google.android.gms.common.annotation.a
        public String f6881a;

        /* renamed from: b, reason: collision with root package name */
        @com.google.android.gms.common.annotation.a
        public String f6882b;

        /* renamed from: c, reason: collision with root package name */
        @com.google.android.gms.common.annotation.a
        public Object f6883c;

        @com.google.android.gms.common.annotation.a
        public String d;

        @com.google.android.gms.common.annotation.a
        public long e;

        @com.google.android.gms.common.annotation.a
        public String f;

        @com.google.android.gms.common.annotation.a
        public Bundle g;

        @com.google.android.gms.common.annotation.a
        public String h;

        @com.google.android.gms.common.annotation.a
        public Bundle i;

        @com.google.android.gms.common.annotation.a
        public long j;

        @com.google.android.gms.common.annotation.a
        public String k;

        @com.google.android.gms.common.annotation.a
        public Bundle l;

        @com.google.android.gms.common.annotation.a
        public long m;

        @com.google.android.gms.common.annotation.a
        public boolean n;

        @com.google.android.gms.common.annotation.a
        public long o;
    }

    @y0
    @com.google.android.gms.common.annotation.a
    int E1(@q0(min = 1) @h0 String str);

    @y0
    @com.google.android.gms.common.annotation.a
    List<c> X0(@h0 String str, @i0 @q0(max = 23, min = 1) String str2);

    @y0
    @com.google.android.gms.common.annotation.a
    Map<String, Object> a(boolean z);

    @com.google.android.gms.common.annotation.a
    void b(@h0 c cVar);

    @com.google.android.gms.common.annotation.a
    void c(@h0 String str, @h0 String str2, Object obj);

    @com.google.android.gms.common.annotation.a
    void clearConditionalUserProperty(@q0(max = 24, min = 1) @h0 String str, @i0 String str2, @i0 Bundle bundle);

    @com.google.android.gms.common.annotation.a
    InterfaceC0206a d(String str, b bVar);

    @com.google.android.gms.common.annotation.a
    void y1(@h0 String str, @h0 String str2, Bundle bundle);
}
