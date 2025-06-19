package b.q.c;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.h0;
import androidx.annotation.i0;
import b.i.k.k;
import b.q.c.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b extends a<Cursor> {
    final c<Cursor>.a r;
    Uri s;
    String[] t;
    String u;
    String[] v;
    String w;
    Cursor x;
    b.i.k.b y;

    public b(@h0 Context context) {
        super(context);
        this.r = new c.a();
    }

    public b(@h0 Context context, @h0 Uri uri, @i0 String[] strArr, @i0 String str, @i0 String[] strArr2, @i0 String str2) {
        super(context);
        this.r = new c.a();
        this.s = uri;
        this.t = strArr;
        this.u = str;
        this.v = strArr2;
        this.w = str2;
    }

    @Override // b.q.c.a
    public void D() {
        super.D();
        synchronized (this) {
            if (this.y != null) {
                this.y.a();
            }
        }
    }

    @Override // b.q.c.c
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (l()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.x;
        this.x = cursor;
        if (m()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @i0
    public String[] O() {
        return this.t;
    }

    @i0
    public String P() {
        return this.u;
    }

    @i0
    public String[] Q() {
        return this.v;
    }

    @i0
    public String R() {
        return this.w;
    }

    @h0
    public Uri S() {
        return this.s;
    }

    @Override // b.q.c.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Cursor I() {
        synchronized (this) {
            if (H()) {
                throw new k();
            }
            this.y = new b.i.k.b();
        }
        try {
            Cursor cursorA = b.i.c.b.a(i().getContentResolver(), this.s, this.t, this.u, this.v, this.w, this.y);
            if (cursorA != null) {
                try {
                    cursorA.getCount();
                    cursorA.registerContentObserver(this.r);
                } catch (RuntimeException e) {
                    cursorA.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.y = null;
            }
            return cursorA;
        } catch (Throwable th) {
            synchronized (this) {
                this.y = null;
                throw th;
            }
        }
    }

    @Override // b.q.c.a
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void J(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void V(@i0 String[] strArr) {
        this.t = strArr;
    }

    public void W(@i0 String str) {
        this.u = str;
    }

    public void X(@i0 String[] strArr) {
        this.v = strArr;
    }

    public void Y(@i0 String str) {
        this.w = str;
    }

    public void Z(@h0 Uri uri) {
        this.s = uri;
    }

    @Override // b.q.c.a, b.q.c.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.h);
    }

    @Override // b.q.c.c
    protected void r() {
        super.r();
        t();
        Cursor cursor = this.x;
        if (cursor != null && !cursor.isClosed()) {
            this.x.close();
        }
        this.x = null;
    }

    @Override // b.q.c.c
    protected void s() {
        Cursor cursor = this.x;
        if (cursor != null) {
            f(cursor);
        }
        if (A() || this.x == null) {
            h();
        }
    }

    @Override // b.q.c.c
    protected void t() {
        b();
    }
}
