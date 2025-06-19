package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class h<E> extends e {

    @i0
    private final Activity d;

    @h0
    private final Context e;

    @h0
    private final Handler f;
    private final int g;
    final j h;

    h(@i0 Activity activity, @h0 Context context, @h0 Handler handler, int r5) {
        this.h = new j();
        this.d = activity;
        this.e = (Context) b.i.o.i.g(context, "context == null");
        this.f = (Handler) b.i.o.i.g(handler, "handler == null");
        this.g = r5;
    }

    public h(@h0 Context context, @h0 Handler handler, int r4) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, r4);
    }

    h(@h0 d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.e
    @i0
    public View c(int r1) {
        return null;
    }

    @Override // androidx.fragment.app.e
    public boolean f() {
        return true;
    }

    @i0
    Activity g() {
        return this.d;
    }

    @h0
    Context h() {
        return this.e;
    }

    @h0
    Handler i() {
        return this.f;
    }

    void k(@h0 Fragment fragment) {
    }

    public void l(@h0 String str, @i0 FileDescriptor fileDescriptor, @h0 PrintWriter printWriter, @i0 String[] strArr) {
    }

    @i0
    public abstract E m();

    @h0
    public LayoutInflater n() {
        return LayoutInflater.from(this.e);
    }

    public int o() {
        return this.g;
    }

    public boolean p() {
        return true;
    }

    public void q(@h0 Fragment fragment, @h0 String[] strArr, int r3) {
    }

    public boolean r(@h0 Fragment fragment) {
        return true;
    }

    public boolean s(@h0 String str) {
        return false;
    }

    public void t(@h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int r4) {
        u(fragment, intent, r4, null);
    }

    public void u(@h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int r3, @i0 Bundle bundle) {
        if (r3 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.e.startActivity(intent);
    }

    public void v(@h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int r12, @i0 Intent intent, int r14, int r15, int r16, @i0 Bundle bundle) throws IntentSender.SendIntentException {
        if (r12 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.a.J(this.d, intentSender, r12, intent, r14, r15, r16, bundle);
    }

    public void w() {
    }
}
