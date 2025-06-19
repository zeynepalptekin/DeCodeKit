package com.google.android.gms.ads.mediation;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface g extends m {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f2463a;

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f2463a);
            return bundle;
        }

        public final a b(int r1) {
            this.f2463a = 1;
            return this;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
