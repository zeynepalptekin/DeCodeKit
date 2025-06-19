package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class da {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3097a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3098b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3099c;
    private final as d;
    private fq<u9> e;
    private fq<u9> f;

    @androidx.annotation.i0
    private za g;
    private int h;

    public da(Context context, as asVar, String str) {
        this.f3097a = new Object();
        this.h = 1;
        this.f3099c = str;
        this.f3098b = context.getApplicationContext();
        this.d = asVar;
        this.e = new sa();
        this.f = new sa();
    }

    public da(Context context, as asVar, String str, fq<u9> fqVar, fq<u9> fqVar2) {
        this(context, asVar, str);
        this.e = fqVar;
        this.f = fqVar2;
    }

    protected final za c(@androidx.annotation.i0 final i52 i52Var) {
        final za zaVar = new za(this.f);
        cs.e.execute(new Runnable(this, i52Var, zaVar) { // from class: com.google.android.gms.internal.ads.ga
            private final da d;
            private final i52 e;
            private final za f;

            {
                this.d = this;
                this.e = i52Var;
                this.f = zaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.g(this.e, this.f);
            }
        });
        zaVar.d(new ra(this, zaVar), new qa(this, zaVar));
        return zaVar;
    }

    final /* synthetic */ void e(u9 u9Var) {
        if (u9Var.g()) {
            this.h = 1;
        }
    }

    final /* synthetic */ void f(za zaVar, u9 u9Var) {
        synchronized (this.f3097a) {
            if (zaVar.a() != -1 && zaVar.a() != 1) {
                zaVar.b();
                cy1 cy1Var = cs.e;
                u9Var.getClass();
                cy1Var.execute(ja.a(u9Var));
                oo.m("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    final /* synthetic */ void g(i52 i52Var, final za zaVar) {
        try {
            Context context = this.f3098b;
            as asVar = this.d;
            final u9 f9Var = m2.f4332c.a().booleanValue() ? new f9(context, asVar) : new w9(context, asVar, i52Var, null);
            f9Var.e0(new t9(this, zaVar, f9Var) { // from class: com.google.android.gms.internal.ads.ha

                /* renamed from: a, reason: collision with root package name */
                private final da f3645a;

                /* renamed from: b, reason: collision with root package name */
                private final za f3646b;

                /* renamed from: c, reason: collision with root package name */
                private final u9 f3647c;

                {
                    this.f3645a = this;
                    this.f3646b = zaVar;
                    this.f3647c = f9Var;
                }

                @Override // com.google.android.gms.internal.ads.t9
                public final void a() {
                    final da daVar = this.f3645a;
                    final za zaVar2 = this.f3646b;
                    final u9 u9Var = this.f3647c;
                    to.h.postDelayed(new Runnable(daVar, zaVar2, u9Var) { // from class: com.google.android.gms.internal.ads.ka
                        private final da d;
                        private final za e;
                        private final u9 f;

                        {
                            this.d = daVar;
                            this.e = zaVar2;
                            this.f = u9Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.d.f(this.e, this.f);
                        }
                    }, ta.f5373b);
                }
            });
            f9Var.o("/jsLoaded", new na(this, zaVar, f9Var));
            br brVar = new br();
            la laVar = new la(this, i52Var, f9Var, brVar);
            brVar.b(laVar);
            f9Var.o("/requestReload", laVar);
            if (this.f3099c.endsWith(".js")) {
                f9Var.r0(this.f3099c);
            } else if (this.f3099c.startsWith("<html>")) {
                f9Var.J(this.f3099c);
            } else {
                f9Var.c0(this.f3099c);
            }
            to.h.postDelayed(new pa(this, zaVar, f9Var), ta.f5372a);
        } catch (Throwable th) {
            tr.c("Error creating webview.", th);
            com.google.android.gms.ads.internal.p.g().e(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zaVar.b();
        }
    }

    public final va h(@androidx.annotation.i0 i52 i52Var) {
        synchronized (this.f3097a) {
            synchronized (this.f3097a) {
                if (this.g != null && this.h == 0) {
                    this.g.d(new os(this) { // from class: com.google.android.gms.internal.ads.fa

                        /* renamed from: a, reason: collision with root package name */
                        private final da f3386a;

                        {
                            this.f3386a = this;
                        }

                        @Override // com.google.android.gms.internal.ads.os
                        public final void a(Object obj) {
                            this.f3386a.e((u9) obj);
                        }
                    }, ia.f3794a);
                }
            }
            if (this.g != null && this.g.a() != -1) {
                if (this.h == 0) {
                    return this.g.g();
                }
                if (this.h == 1) {
                    this.h = 2;
                    c(null);
                    return this.g.g();
                }
                if (this.h == 2) {
                    return this.g.g();
                }
                return this.g.g();
            }
            this.h = 2;
            za zaVarC = c(null);
            this.g = zaVarC;
            return zaVarC.g();
        }
    }
}
