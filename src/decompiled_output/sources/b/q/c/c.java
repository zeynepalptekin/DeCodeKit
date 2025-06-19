package b.q.c;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class c<D> {

    /* renamed from: a, reason: collision with root package name */
    int f1328a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC0092c<D> f1329b;

    /* renamed from: c, reason: collision with root package name */
    b<D> f1330c;
    Context d;
    boolean e = false;
    boolean f = false;
    boolean g = true;
    boolean h = false;
    boolean i = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            c.this.p();
        }
    }

    public interface b<D> {
        void a(@h0 c<D> cVar);
    }

    /* renamed from: b.q.c.c$c, reason: collision with other inner class name */
    public interface InterfaceC0092c<D> {
        void a(@h0 c<D> cVar, @i0 D d);
    }

    public c(@h0 Context context) {
        this.d = context.getApplicationContext();
    }

    public boolean A() {
        boolean z = this.h;
        this.h = false;
        this.i |= z;
        return z;
    }

    @e0
    public void B(@h0 InterfaceC0092c<D> interfaceC0092c) {
        InterfaceC0092c<D> interfaceC0092c2 = this.f1329b;
        if (interfaceC0092c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0092c2 != interfaceC0092c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f1329b = null;
    }

    @e0
    public void C(@h0 b<D> bVar) {
        b<D> bVar2 = this.f1330c;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f1330c = null;
    }

    @e0
    public void a() {
        this.f = true;
        n();
    }

    @e0
    public boolean b() {
        return o();
    }

    public void c() {
        this.i = false;
    }

    @h0
    public String d(@i0 D d) {
        StringBuilder sb = new StringBuilder(64);
        b.i.o.c.a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @e0
    public void e() {
        b<D> bVar = this.f1330c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @e0
    public void f(@i0 D d) {
        InterfaceC0092c<D> interfaceC0092c = this.f1329b;
        if (interfaceC0092c != null) {
            interfaceC0092c.a(this, d);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f1328a);
        printWriter.print(" mListener=");
        printWriter.println(this.f1329b);
        if (this.e || this.h || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.i);
        }
        if (this.f || this.g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f);
            printWriter.print(" mReset=");
            printWriter.println(this.g);
        }
    }

    @e0
    public void h() {
        q();
    }

    @h0
    public Context i() {
        return this.d;
    }

    public int j() {
        return this.f1328a;
    }

    public boolean k() {
        return this.f;
    }

    public boolean l() {
        return this.g;
    }

    public boolean m() {
        return this.e;
    }

    @e0
    protected void n() {
    }

    @e0
    protected boolean o() {
        return false;
    }

    @e0
    public void p() {
        if (this.e) {
            h();
        } else {
            this.h = true;
        }
    }

    @e0
    protected void q() {
    }

    @e0
    protected void r() {
    }

    @e0
    protected void s() {
    }

    @e0
    protected void t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        b.i.o.c.a(this, sb);
        sb.append(" id=");
        sb.append(this.f1328a);
        sb.append("}");
        return sb.toString();
    }

    @e0
    public void u(int r2, @h0 InterfaceC0092c<D> interfaceC0092c) {
        if (this.f1329b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f1329b = interfaceC0092c;
        this.f1328a = r2;
    }

    @e0
    public void v(@h0 b<D> bVar) {
        if (this.f1330c != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f1330c = bVar;
    }

    @e0
    public void w() {
        r();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }

    public void x() {
        if (this.i) {
            p();
        }
    }

    @e0
    public final void y() {
        this.e = true;
        this.g = false;
        this.f = false;
        s();
    }

    @e0
    public void z() {
        this.e = false;
        t();
    }
}
