package com.google.firebase.installations.u;

import androidx.annotation.i0;
import com.google.firebase.installations.u.d;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f6990a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6991b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6992c;
    private final e d;
    private final d.b e;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f6993a;

        /* renamed from: b, reason: collision with root package name */
        private String f6994b;

        /* renamed from: c, reason: collision with root package name */
        private String f6995c;
        private e d;
        private d.b e;

        b() {
        }

        private b(d dVar) {
            this.f6993a = dVar.f();
            this.f6994b = dVar.c();
            this.f6995c = dVar.d();
            this.d = dVar.b();
            this.e = dVar.e();
        }

        @Override // com.google.firebase.installations.u.d.a
        public d a() {
            return new a(this.f6993a, this.f6994b, this.f6995c, this.d, this.e);
        }

        @Override // com.google.firebase.installations.u.d.a
        public d.a b(e eVar) {
            this.d = eVar;
            return this;
        }

        @Override // com.google.firebase.installations.u.d.a
        public d.a c(String str) {
            this.f6994b = str;
            return this;
        }

        @Override // com.google.firebase.installations.u.d.a
        public d.a d(String str) {
            this.f6995c = str;
            return this;
        }

        @Override // com.google.firebase.installations.u.d.a
        public d.a e(d.b bVar) {
            this.e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.u.d.a
        public d.a f(String str) {
            this.f6993a = str;
            return this;
        }
    }

    private a(@i0 String str, @i0 String str2, @i0 String str3, @i0 e eVar, @i0 d.b bVar) {
        this.f6990a = str;
        this.f6991b = str2;
        this.f6992c = str3;
        this.d = eVar;
        this.e = bVar;
    }

    @Override // com.google.firebase.installations.u.d
    @i0
    public e b() {
        return this.d;
    }

    @Override // com.google.firebase.installations.u.d
    @i0
    public String c() {
        return this.f6991b;
    }

    @Override // com.google.firebase.installations.u.d
    @i0
    public String d() {
        return this.f6992c;
    }

    @Override // com.google.firebase.installations.u.d
    @i0
    public d.b e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f6990a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f6991b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f6992c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    e eVar = this.d;
                    if (eVar != null ? eVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.e;
                        d.b bVarE = dVar.e();
                        if (bVar == null) {
                            if (bVarE == null) {
                                return true;
                            }
                        } else if (bVar.equals(bVarE)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.u.d
    @i0
    public String f() {
        return this.f6990a;
    }

    @Override // com.google.firebase.installations.u.d
    public d.a g() {
        return new b(this);
    }

    public int hashCode() {
        String str = this.f6990a;
        int r0 = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f6991b;
        int r02 = (r0 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6992c;
        int r03 = (r02 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        e eVar = this.d;
        int r04 = (r03 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        d.b bVar = this.e;
        return r04 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f6990a + ", fid=" + this.f6991b + ", refreshToken=" + this.f6992c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
