package com.google.android.gms.measurement.c;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.y0;
import c.a.b.b.g.c.h;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.measurement.internal.d6;
import com.google.android.gms.measurement.internal.e6;
import java.util.List;
import java.util.Map;

@v
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final h f6332a;

    @com.google.android.gms.common.annotation.a
    /* renamed from: com.google.android.gms.measurement.c.a$a, reason: collision with other inner class name */
    public static final class C0190a {

        /* renamed from: a, reason: collision with root package name */
        @com.google.android.gms.common.annotation.a
        public static final String f6333a = "origin";

        /* renamed from: b, reason: collision with root package name */
        @com.google.android.gms.common.annotation.a
        public static final String f6334b = "name";

        /* renamed from: c, reason: collision with root package name */
        @com.google.android.gms.common.annotation.a
        public static final String f6335c = "value";

        @com.google.android.gms.common.annotation.a
        public static final String d = "trigger_event_name";

        @com.google.android.gms.common.annotation.a
        public static final String e = "trigger_timeout";

        @com.google.android.gms.common.annotation.a
        public static final String f = "timed_out_event_name";

        @com.google.android.gms.common.annotation.a
        public static final String g = "timed_out_event_params";

        @com.google.android.gms.common.annotation.a
        public static final String h = "triggered_event_name";

        @com.google.android.gms.common.annotation.a
        public static final String i = "triggered_event_params";

        @com.google.android.gms.common.annotation.a
        public static final String j = "time_to_live";

        @com.google.android.gms.common.annotation.a
        public static final String k = "expired_event_name";

        @com.google.android.gms.common.annotation.a
        public static final String l = "expired_event_params";

        @com.google.android.gms.common.annotation.a
        public static final String m = "creation_timestamp";

        @com.google.android.gms.common.annotation.a
        public static final String n = "active";

        @com.google.android.gms.common.annotation.a
        public static final String o = "triggered_timestamp";

        private C0190a() {
        }
    }

    @v
    @com.google.android.gms.common.annotation.a
    public interface b extends e6 {
        @Override // com.google.android.gms.measurement.internal.e6
        @y0
        @v
        @com.google.android.gms.common.annotation.a
        void a(String str, String str2, Bundle bundle, long j);
    }

    @v
    @com.google.android.gms.common.annotation.a
    public interface c extends d6 {
        @Override // com.google.android.gms.measurement.internal.d6
        @y0
        @v
        @com.google.android.gms.common.annotation.a
        void a(String str, String str2, Bundle bundle, long j);
    }

    public a(h hVar) {
        this.f6332a = hVar;
    }

    @o0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @v
    @com.google.android.gms.common.annotation.a
    public static a k(@h0 Context context) {
        return h.b(context).f();
    }

    @o0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @com.google.android.gms.common.annotation.a
    public static a l(@h0 Context context, @h0 String str, @h0 String str2, @h0 String str3, Bundle bundle) {
        return h.c(context, str, str2, str3, bundle).f();
    }

    @v
    @com.google.android.gms.common.annotation.a
    public void A(c cVar) {
        this.f6332a.M(cVar);
    }

    public final void B(boolean z) {
        this.f6332a.C(z);
    }

    @com.google.android.gms.common.annotation.a
    public void a(@q0(min = 1) @h0 String str) {
        this.f6332a.N(str);
    }

    @com.google.android.gms.common.annotation.a
    public void b(@q0(max = 24, min = 1) @h0 String str, @i0 String str2, @i0 Bundle bundle) {
        this.f6332a.O(str, str2, bundle);
    }

    @com.google.android.gms.common.annotation.a
    public void c(@q0(min = 1) @h0 String str) {
        this.f6332a.T(str);
    }

    @com.google.android.gms.common.annotation.a
    public long d() {
        return this.f6332a.Z();
    }

    @com.google.android.gms.common.annotation.a
    public String e() {
        return this.f6332a.h0();
    }

    @i0
    @com.google.android.gms.common.annotation.a
    public String f() {
        return this.f6332a.X();
    }

    @y0
    @com.google.android.gms.common.annotation.a
    public List<Bundle> g(@i0 String str, @i0 @q0(max = 23, min = 1) String str2) {
        return this.f6332a.H(str, str2);
    }

    @i0
    @com.google.android.gms.common.annotation.a
    public String h() {
        return this.f6332a.e0();
    }

    @i0
    @com.google.android.gms.common.annotation.a
    public String i() {
        return this.f6332a.c0();
    }

    @i0
    @com.google.android.gms.common.annotation.a
    public String j() {
        return this.f6332a.R();
    }

    @y0
    @com.google.android.gms.common.annotation.a
    public int m(@q0(min = 1) @h0 String str) {
        return this.f6332a.W(str);
    }

    @y0
    @com.google.android.gms.common.annotation.a
    public Map<String, Object> n(@i0 String str, @i0 @q0(max = 24, min = 1) String str2, boolean z) {
        return this.f6332a.i(str, str2, z);
    }

    @com.google.android.gms.common.annotation.a
    public void o(String str, String str2, Bundle bundle) {
        this.f6332a.x(str, str2, bundle);
    }

    @com.google.android.gms.common.annotation.a
    public void p(String str, String str2, Bundle bundle, long j) {
        this.f6332a.y(str, str2, bundle, j);
    }

    @com.google.android.gms.common.annotation.a
    public void q(Bundle bundle) {
        this.f6332a.a(bundle, false);
    }

    @com.google.android.gms.common.annotation.a
    public Bundle r(Bundle bundle) {
        return this.f6332a.a(bundle, true);
    }

    @v
    @com.google.android.gms.common.annotation.a
    public void s(c cVar) {
        this.f6332a.q(cVar);
    }

    @com.google.android.gms.common.annotation.a
    public void t(@h0 Bundle bundle) {
        this.f6332a.m(bundle);
    }

    @com.google.android.gms.common.annotation.a
    public void u(Bundle bundle) {
        this.f6332a.L(bundle);
    }

    @com.google.android.gms.common.annotation.a
    public void v(@h0 Activity activity, @i0 @q0(max = 36, min = 1) String str, @i0 @q0(max = 36, min = 1) String str2) {
        this.f6332a.l(activity, str, str2);
    }

    @y0
    @v
    @com.google.android.gms.common.annotation.a
    public void w(b bVar) {
        this.f6332a.r(bVar);
    }

    @com.google.android.gms.common.annotation.a
    public void x(@i0 Boolean bool) {
        this.f6332a.s(bool);
    }

    @com.google.android.gms.common.annotation.a
    public void y(boolean z) {
        this.f6332a.s(Boolean.valueOf(z));
    }

    @com.google.android.gms.common.annotation.a
    public void z(String str, String str2, Object obj) {
        this.f6332a.A(str, str2, obj);
    }
}
