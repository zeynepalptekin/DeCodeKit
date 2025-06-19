package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public class ia0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3795a;

    /* renamed from: b, reason: collision with root package name */
    private final an1 f3796b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f3797c;

    @androidx.annotation.i0
    private final String d;

    @androidx.annotation.i0
    private final zm1 e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f3798a;

        /* renamed from: b, reason: collision with root package name */
        private an1 f3799b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f3800c;

        @androidx.annotation.i0
        private String d;

        @androidx.annotation.i0
        private zm1 e;

        public final a b(zm1 zm1Var) {
            this.e = zm1Var;
            return this;
        }

        public final a c(an1 an1Var) {
            this.f3799b = an1Var;
            return this;
        }

        public final ia0 d() {
            return new ia0(this);
        }

        public final a g(Context context) {
            this.f3798a = context;
            return this;
        }

        public final a j(Bundle bundle) {
            this.f3800c = bundle;
            return this;
        }

        public final a k(String str) {
            this.d = str;
            return this;
        }
    }

    private ia0(a aVar) {
        this.f3795a = aVar.f3798a;
        this.f3796b = aVar.f3799b;
        this.f3797c = aVar.f3800c;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    final a a() {
        return new a().g(this.f3795a).c(this.f3796b).k(this.d).j(this.f3797c);
    }

    final an1 b() {
        return this.f3796b;
    }

    @androidx.annotation.i0
    final zm1 c() {
        return this.e;
    }

    @androidx.annotation.i0
    final Bundle d() {
        return this.f3797c;
    }

    @androidx.annotation.i0
    final String e() {
        return this.d;
    }

    final Context f(Context context) {
        return this.d != null ? context : this.f3795a;
    }
}
