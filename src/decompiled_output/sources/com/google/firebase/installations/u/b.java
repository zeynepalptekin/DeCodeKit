package com.google.firebase.installations.u;

import androidx.annotation.h0;
import androidx.annotation.i0;
import com.google.firebase.installations.u.e;

/* loaded from: classes.dex */
final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f6996a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6997b;

    /* renamed from: c, reason: collision with root package name */
    private final e.b f6998c;

    /* renamed from: com.google.firebase.installations.u.b$b, reason: collision with other inner class name */
    static final class C0211b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private String f6999a;

        /* renamed from: b, reason: collision with root package name */
        private Long f7000b;

        /* renamed from: c, reason: collision with root package name */
        private e.b f7001c;

        C0211b() {
        }

        private C0211b(e eVar) {
            this.f6999a = eVar.c();
            this.f7000b = Long.valueOf(eVar.d());
            this.f7001c = eVar.b();
        }

        @Override // com.google.firebase.installations.u.e.a
        public e a() {
            String str = "";
            if (this.f7000b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f6999a, this.f7000b.longValue(), this.f7001c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.u.e.a
        public e.a b(e.b bVar) {
            this.f7001c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.u.e.a
        public e.a c(String str) {
            this.f6999a = str;
            return this;
        }

        @Override // com.google.firebase.installations.u.e.a
        public e.a d(long j) {
            this.f7000b = Long.valueOf(j);
            return this;
        }
    }

    private b(@i0 String str, long j, @i0 e.b bVar) {
        this.f6996a = str;
        this.f6997b = j;
        this.f6998c = bVar;
    }

    @Override // com.google.firebase.installations.u.e
    @i0
    public e.b b() {
        return this.f6998c;
    }

    @Override // com.google.firebase.installations.u.e
    @i0
    public String c() {
        return this.f6996a;
    }

    @Override // com.google.firebase.installations.u.e
    @h0
    public long d() {
        return this.f6997b;
    }

    @Override // com.google.firebase.installations.u.e
    public e.a e() {
        return new C0211b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f6996a;
        if (str != null ? str.equals(eVar.c()) : eVar.c() == null) {
            if (this.f6997b == eVar.d()) {
                e.b bVar = this.f6998c;
                e.b bVarB = eVar.b();
                if (bVar == null) {
                    if (bVarB == null) {
                        return true;
                    }
                } else if (bVar.equals(bVarB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6996a;
        int r0 = str == null ? 0 : str.hashCode();
        long j = this.f6997b;
        int r02 = (((r0 ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        e.b bVar = this.f6998c;
        return r02 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f6996a + ", tokenExpirationTimestamp=" + this.f6997b + ", responseCode=" + this.f6998c + "}";
    }
}
