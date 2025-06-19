package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class un {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f5553a;

    /* renamed from: b, reason: collision with root package name */
    private final ho f5554b;
    private final String e;
    private final String f;
    private final Object d = new Object();

    @GuardedBy("lock")
    private long g = -1;

    @GuardedBy("lock")
    private long h = -1;

    @GuardedBy("lock")
    private boolean i = false;

    @GuardedBy("lock")
    private long j = -1;

    @GuardedBy("lock")
    private long k = 0;

    @GuardedBy("lock")
    private long l = -1;

    @GuardedBy("lock")
    private long m = -1;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    private final LinkedList<xn> f5555c = new LinkedList<>();

    un(com.google.android.gms.common.util.g gVar, ho hoVar, String str, String str2) {
        this.f5553a = gVar;
        this.f5554b = hoVar;
        this.e = str;
        this.f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.e);
            bundle.putString("slotid", this.f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.l);
            bundle.putLong("tresponse", this.m);
            bundle.putLong("timp", this.h);
            bundle.putLong("tload", this.j);
            bundle.putLong("pcc", this.k);
            bundle.putLong("tfetch", this.g);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<xn> it = this.f5555c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final void c(boolean z) {
        synchronized (this.d) {
            if (this.m != -1) {
                this.j = this.f5553a.c();
            }
        }
    }

    public final void d(jw2 jw2Var) {
        synchronized (this.d) {
            long jC = this.f5553a.c();
            this.l = jC;
            this.f5554b.d(jw2Var, jC);
        }
    }

    public final void e(long j) {
        synchronized (this.d) {
            this.m = j;
            if (j != -1) {
                this.f5554b.e(this);
            }
        }
    }

    public final void f() {
        synchronized (this.d) {
            if (this.m != -1 && this.h == -1) {
                this.h = this.f5553a.c();
                this.f5554b.e(this);
            }
            this.f5554b.g();
        }
    }

    public final void g() {
        synchronized (this.d) {
            if (this.m != -1) {
                xn xnVar = new xn(this);
                xnVar.d();
                this.f5555c.add(xnVar);
                this.k++;
                this.f5554b.h();
                this.f5554b.e(this);
            }
        }
    }

    public final void h() {
        synchronized (this.d) {
            if (this.m != -1 && !this.f5555c.isEmpty()) {
                xn last = this.f5555c.getLast();
                if (last.b() == -1) {
                    last.c();
                    this.f5554b.e(this);
                }
            }
        }
    }

    public final String i() {
        return this.e;
    }
}
