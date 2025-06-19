package b.l.b;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.i0;
import androidx.annotation.m0;

@m0(19)
/* loaded from: classes.dex */
class d extends a {

    /* renamed from: c, reason: collision with root package name */
    private Context f1305c;
    private Uri d;

    d(@i0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f1305c = context;
        this.d = uri;
    }

    @Override // b.l.b.a
    public boolean a() {
        return b.a(this.f1305c, this.d);
    }

    @Override // b.l.b.a
    public boolean b() {
        return b.b(this.f1305c, this.d);
    }

    @Override // b.l.b.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // b.l.b.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // b.l.b.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f1305c.getContentResolver(), this.d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // b.l.b.a
    public boolean f() {
        return b.d(this.f1305c, this.d);
    }

    @Override // b.l.b.a
    @i0
    public String k() {
        return b.f(this.f1305c, this.d);
    }

    @Override // b.l.b.a
    @i0
    public String m() {
        return b.h(this.f1305c, this.d);
    }

    @Override // b.l.b.a
    public Uri n() {
        return this.d;
    }

    @Override // b.l.b.a
    public boolean o() {
        return b.i(this.f1305c, this.d);
    }

    @Override // b.l.b.a
    public boolean q() {
        return b.j(this.f1305c, this.d);
    }

    @Override // b.l.b.a
    public boolean r() {
        return b.k(this.f1305c, this.d);
    }

    @Override // b.l.b.a
    public long s() {
        return b.l(this.f1305c, this.d);
    }

    @Override // b.l.b.a
    public long t() {
        return b.m(this.f1305c, this.d);
    }

    @Override // b.l.b.a
    public a[] u() {
        throw new UnsupportedOperationException();
    }

    @Override // b.l.b.a
    public boolean v(String str) {
        throw new UnsupportedOperationException();
    }
}
