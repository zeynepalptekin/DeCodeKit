package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cv2;
import com.google.android.gms.internal.ads.vu2;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class zs0 implements cb0, tb0, nc0, od0, mf0, zv2 {
    private final tu2 d;

    @GuardedBy("this")
    private boolean e = false;

    public zs0(tu2 tu2Var, @Nullable rk1 rk1Var) {
        this.d = tu2Var;
        tu2Var.b(vu2.a.b.AD_REQUEST);
        if (rk1Var != null) {
            tu2Var.b(vu2.a.b.REQUEST_IS_PREFETCH);
        }
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void D(final cv2.g gVar) {
        this.d.a(new su2(gVar) { // from class: com.google.android.gms.internal.ads.bt0

            /* renamed from: a, reason: collision with root package name */
            private final cv2.g f2874a;

            {
                this.f2874a = gVar;
            }

            @Override // com.google.android.gms.internal.ads.su2
            public final void a(cv2.n.a aVar) {
                aVar.x(this.f2874a);
            }
        });
        this.d.b(vu2.a.b.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void G() {
        this.d.b(vu2.a.b.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void J(boolean z) {
        this.d.b(z ? vu2.a.b.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED : vu2.a.b.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void T(final cv2.g gVar) {
        this.d.a(new su2(gVar) { // from class: com.google.android.gms.internal.ads.et0

            /* renamed from: a, reason: collision with root package name */
            private final cv2.g f3325a;

            {
                this.f3325a = gVar;
            }

            @Override // com.google.android.gms.internal.ads.su2
            public final void a(cv2.n.a aVar) {
                aVar.x(this.f3325a);
            }
        });
        this.d.b(vu2.a.b.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final synchronized void U() {
        this.d.b(vu2.a.b.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void X(final cv2.g gVar) {
        this.d.a(new su2(gVar) { // from class: com.google.android.gms.internal.ads.dt0

            /* renamed from: a, reason: collision with root package name */
            private final cv2.g f3174a;

            {
                this.f3174a = gVar;
            }

            @Override // com.google.android.gms.internal.ads.su2
            public final void a(cv2.n.a aVar) {
                aVar.x(this.f3174a);
            }
        });
        this.d.b(vu2.a.b.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void e0(wi wiVar) {
    }

    @Override // com.google.android.gms.internal.ads.cb0
    public final void i(dw2 dw2Var) {
        tu2 tu2Var;
        vu2.a.b bVar;
        switch (dw2Var.d) {
            case 1:
                tu2Var = this.d;
                bVar = vu2.a.b.AD_FAILED_TO_LOAD_INVALID_REQUEST;
                break;
            case 2:
                tu2Var = this.d;
                bVar = vu2.a.b.AD_FAILED_TO_LOAD_NETWORK_ERROR;
                break;
            case 3:
                tu2Var = this.d;
                bVar = vu2.a.b.AD_FAILED_TO_LOAD_NO_FILL;
                break;
            case 4:
                tu2Var = this.d;
                bVar = vu2.a.b.AD_FAILED_TO_LOAD_TIMEOUT;
                break;
            case 5:
                tu2Var = this.d;
                bVar = vu2.a.b.AD_FAILED_TO_LOAD_CANCELLED;
                break;
            case 6:
                tu2Var = this.d;
                bVar = vu2.a.b.AD_FAILED_TO_LOAD_NO_ERROR;
                break;
            case 7:
                tu2Var = this.d;
                bVar = vu2.a.b.AD_FAILED_TO_LOAD_NOT_FOUND;
                break;
            default:
                tu2Var = this.d;
                bVar = vu2.a.b.AD_FAILED_TO_LOAD;
                break;
        }
        tu2Var.b(bVar);
    }

    @Override // com.google.android.gms.internal.ads.zv2
    public final synchronized void p() {
        if (this.e) {
            this.d.b(vu2.a.b.AD_SUBSEQUENT_CLICK);
        } else {
            this.d.b(vu2.a.b.AD_FIRST_CLICK);
            this.e = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void q(boolean z) {
        this.d.b(z ? vu2.a.b.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED : vu2.a.b.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void t(final wm1 wm1Var) {
        this.d.a(new su2(wm1Var) { // from class: com.google.android.gms.internal.ads.ct0

            /* renamed from: a, reason: collision with root package name */
            private final wm1 f3030a;

            {
                this.f3030a = wm1Var;
            }

            @Override // com.google.android.gms.internal.ads.su2
            public final void a(cv2.n.a aVar) {
                aVar.v(aVar.K().A().v(aVar.K().L().A().v(this.f3030a.f5858b.f5551b.f4275b)));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final void u() {
        this.d.b(vu2.a.b.AD_LOADED);
    }
}
