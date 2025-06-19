package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.h0;
import com.google.android.gms.ads.d0.g;
import com.google.android.gms.ads.d0.i;
import com.google.android.gms.ads.d0.k;
import com.google.android.gms.ads.d0.o;
import com.google.android.gms.internal.ads.a6;
import com.google.android.gms.internal.ads.c03;
import com.google.android.gms.internal.ads.dy2;
import com.google.android.gms.internal.ads.fw2;
import com.google.android.gms.internal.ads.ow2;
import com.google.android.gms.internal.ads.qw2;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.rc;
import com.google.android.gms.internal.ads.s5;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.v5;
import com.google.android.gms.internal.ads.w5;
import com.google.android.gms.internal.ads.y5;
import com.google.android.gms.internal.ads.yx2;
import com.google.android.gms.internal.ads.z2;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final ow2 f2352a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2353b;

    /* renamed from: c, reason: collision with root package name */
    private final yx2 f2354c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f2355a;

        /* renamed from: b, reason: collision with root package name */
        private final dy2 f2356b;

        private a(Context context, dy2 dy2Var) {
            this.f2355a = context;
            this.f2356b = dy2Var;
        }

        public a(Context context, String str) {
            this((Context) com.google.android.gms.common.internal.r.l(context, "context cannot be null"), qx2.b().j(context, str, new rc()));
        }

        public d a() {
            try {
                return new d(this.f2355a, this.f2356b.C4());
            } catch (RemoteException e) {
                tr.c("Failed to build AdLoader.", e);
                return null;
            }
        }

        @Deprecated
        public a b(g.a aVar) {
            try {
                this.f2356b.n5(new w5(aVar));
            } catch (RemoteException e) {
                tr.d("Failed to add app install ad listener", e);
            }
            return this;
        }

        @Deprecated
        public a c(i.a aVar) {
            try {
                this.f2356b.B3(new v5(aVar));
            } catch (RemoteException e) {
                tr.d("Failed to add content ad listener", e);
            }
            return this;
        }

        public a d(String str, k.c cVar, k.b bVar) {
            s5 s5Var = new s5(cVar, bVar);
            try {
                this.f2356b.P2(str, s5Var.e(), s5Var.f());
            } catch (RemoteException e) {
                tr.d("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public a e(com.google.android.gms.ads.d0.l lVar, f... fVarArr) {
            if (fVarArr == null || fVarArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.f2356b.W2(new y5(lVar), new qw2(this.f2355a, fVarArr));
            } catch (RemoteException e) {
                tr.d("Failed to add publisher banner ad listener", e);
            }
            return this;
        }

        public a f(o.a aVar) {
            try {
                this.f2356b.u2(new a6(aVar));
            } catch (RemoteException e) {
                tr.d("Failed to add google native ad listener", e);
            }
            return this;
        }

        public a g(c cVar) {
            try {
                this.f2356b.c3(new fw2(cVar));
            } catch (RemoteException e) {
                tr.d("Failed to set AdListener.", e);
            }
            return this;
        }

        @com.google.android.gms.common.annotation.a
        @Deprecated
        public a h(@h0 j jVar) {
            return this;
        }

        public a i(com.google.android.gms.ads.d0.d dVar) {
            try {
                this.f2356b.Q3(new z2(dVar));
            } catch (RemoteException e) {
                tr.d("Failed to specify native ad options", e);
            }
            return this;
        }

        public a j(com.google.android.gms.ads.d0.m mVar) {
            try {
                this.f2356b.D4(mVar);
            } catch (RemoteException e) {
                tr.d("Failed to specify DFP banner ad options", e);
            }
            return this;
        }
    }

    d(Context context, yx2 yx2Var) {
        this(context, yx2Var, ow2.f4752a);
    }

    private d(Context context, yx2 yx2Var, ow2 ow2Var) {
        this.f2353b = context;
        this.f2354c = yx2Var;
        this.f2352a = ow2Var;
    }

    private final void f(c03 c03Var) {
        try {
            this.f2354c.I3(ow2.b(this.f2353b, c03Var));
        } catch (RemoteException e) {
            tr.c("Failed to load ad.", e);
        }
    }

    @Deprecated
    public String a() {
        try {
            return this.f2354c.R0();
        } catch (RemoteException e) {
            tr.d("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean b() {
        try {
            return this.f2354c.Y();
        } catch (RemoteException e) {
            tr.d("Failed to check if ad is loading.", e);
            return false;
        }
    }

    @androidx.annotation.o0("android.permission.INTERNET")
    public void c(e eVar) {
        f(eVar.k());
    }

    public void d(com.google.android.gms.ads.c0.d dVar) {
        f(dVar.n());
    }

    @androidx.annotation.o0("android.permission.INTERNET")
    public void e(e eVar, int r4) {
        try {
            this.f2354c.s6(ow2.b(this.f2353b, eVar.k()), r4);
        } catch (RemoteException e) {
            tr.c("Failed to load ads.", e);
        }
    }
}
