package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.pg;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.tr;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    @com.google.android.gms.common.annotation.a
    public static final String e = "com.google.android.gms.ads.AdActivity";

    @com.google.android.gms.common.annotation.a
    public static final String f = "AdActivity";
    private pg d;

    private final void a() {
        pg pgVar = this.d;
        if (pgVar != null) {
            try {
                pgVar.Z1();
            } catch (RemoteException e2) {
                tr.e("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int r3, int r4, Intent intent) {
        try {
            this.d.f2(r3, r4, intent);
        } catch (Exception e2) {
            tr.e("#007 Could not call remote method.", e2);
        }
        super.onActivityResult(r3, r4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        boolean zK7 = true;
        try {
            if (this.d != null) {
                zK7 = this.d.k7();
            }
        } catch (RemoteException e2) {
            tr.e("#007 Could not call remote method.", e2);
        }
        if (zK7) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.d.c5(c.a.b.b.e.e.i2(configuration));
        } catch (RemoteException e2) {
            tr.e("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        pg pgVarH = qx2.b().h(this);
        this.d = pgVarH;
        if (pgVarH == null) {
            e = null;
        } else {
            try {
                pgVarH.C1(bundle);
                return;
            } catch (RemoteException e2) {
                e = e2;
            }
        }
        tr.e("#007 Could not call remote method.", e);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            if (this.d != null) {
                this.d.onDestroy();
            }
        } catch (RemoteException e2) {
            tr.e("#007 Could not call remote method.", e2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            if (this.d != null) {
                this.d.onPause();
            }
        } catch (RemoteException e2) {
            tr.e("#007 Could not call remote method.", e2);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            if (this.d != null) {
                this.d.N4();
            }
        } catch (RemoteException e2) {
            tr.e("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            if (this.d != null) {
                this.d.onResume();
            }
        } catch (RemoteException e2) {
            tr.e("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.d != null) {
                this.d.x1(bundle);
            }
        } catch (RemoteException e2) {
            tr.e("#007 Could not call remote method.", e2);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            if (this.d != null) {
                this.d.C0();
            }
        } catch (RemoteException e2) {
            tr.e("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            if (this.d != null) {
                this.d.U0();
            }
        } catch (RemoteException e2) {
            tr.e("#007 Could not call remote method.", e2);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void setContentView(int r1) {
        super.setContentView(r1);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
