package com.google.android.gms.ads.n0;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.b0;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.n0.b;
import com.google.android.gms.internal.ads.c03;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f2473a;

    /* renamed from: com.google.android.gms.ads.n0.a$a, reason: collision with other inner class name */
    public static final class C0164a {

        /* renamed from: a, reason: collision with root package name */
        private final b.a f2474a = new b.a();

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f2475b = new Bundle();

        public final C0164a A(int r3) {
            this.f2475b.putString("csa_fontSizeDescription", Integer.toString(r3));
            return this;
        }

        public final C0164a B(int r3) {
            this.f2475b.putString("csa_fontSizeDomainLink", Integer.toString(r3));
            return this;
        }

        public final C0164a C(int r3) {
            this.f2475b.putString("csa_fontSizeTitle", Integer.toString(r3));
            return this;
        }

        public final C0164a D(String str) {
            this.f2475b.putString("csa_hl", str);
            return this;
        }

        public final C0164a E(boolean z) {
            this.f2475b.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        public final C0164a F(boolean z) {
            this.f2475b.putString("csa_location", Boolean.toString(z));
            return this;
        }

        public final C0164a G(boolean z) {
            this.f2475b.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        public final C0164a H(boolean z) {
            this.f2475b.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        public final C0164a I(boolean z) {
            this.f2475b.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        public final C0164a J(boolean z) {
            this.f2475b.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        public final C0164a K(boolean z) {
            this.f2475b.putString("csa_noTitleUnderline", Boolean.toString(!z));
            return this;
        }

        public final C0164a L(String str) {
            this.f2475b.putString("csa_colorLocation", str);
            return this;
        }

        public final C0164a M(int r3) {
            this.f2475b.putString("csa_fontSizeLocation", Integer.toString(r3));
            return this;
        }

        public final C0164a N(boolean z) {
            this.f2475b.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        public final C0164a O(int r3) {
            this.f2475b.putString("csa_number", Integer.toString(r3));
            return this;
        }

        public final C0164a P(int r3) {
            this.f2475b.putString("csa_adPage", Integer.toString(r3));
            return this;
        }

        public final C0164a Q(String str) {
            this.f2474a.s(str);
            return this;
        }

        public final C0164a R(int r3) {
            this.f2475b.putString("csa_verticalSpacing", Integer.toString(r3));
            return this;
        }

        public final C0164a a(Class<? extends com.google.android.gms.ads.mediation.customevent.a> cls, Bundle bundle) {
            this.f2474a.a(cls, bundle);
            return this;
        }

        public final C0164a b(b0 b0Var) {
            this.f2474a.b(b0Var);
            return this;
        }

        public final C0164a c(Class<? extends g> cls, Bundle bundle) {
            this.f2474a.c(cls, bundle);
            return this;
        }

        public final a d() {
            this.f2474a.c(AdMobAdapter.class, this.f2475b);
            return new a(this);
        }

        public final C0164a e(String str) {
            this.f2475b.putString("csa_adBorderSelectors", str);
            return this;
        }

        public final C0164a f(boolean z) {
            this.f2475b.putString("csa_adtest", z ? "on" : "off");
            return this;
        }

        public final C0164a g(int r3) {
            this.f2475b.putString("csa_adjustableLineHeight", Integer.toString(r3));
            return this;
        }

        public final C0164a h(String str, String str2) {
            this.f2475b.putString(str, str2);
            return this;
        }

        public final C0164a i(int r3) {
            this.f2475b.putString("csa_attributionSpacingBelow", Integer.toString(r3));
            return this;
        }

        public final C0164a j(String str) {
            this.f2475b.putString("csa_borderSelections", str);
            return this;
        }

        public final C0164a k(String str) {
            this.f2475b.putString("csa_channel", str);
            return this;
        }

        public final C0164a l(String str) {
            this.f2475b.putString("csa_colorAdBorder", str);
            return this;
        }

        public final C0164a m(String str) {
            this.f2475b.putString("csa_colorAdSeparator", str);
            return this;
        }

        public final C0164a n(String str) {
            this.f2475b.putString("csa_colorAnnotation", str);
            return this;
        }

        public final C0164a o(String str) {
            this.f2475b.putString("csa_colorAttribution", str);
            return this;
        }

        public final C0164a p(String str) {
            this.f2475b.putString("csa_colorBackground", str);
            return this;
        }

        public final C0164a q(String str) {
            this.f2475b.putString("csa_colorBorder", str);
            return this;
        }

        public final C0164a r(String str) {
            this.f2475b.putString("csa_colorDomainLink", str);
            return this;
        }

        public final C0164a s(String str) {
            this.f2475b.putString("csa_colorText", str);
            return this;
        }

        public final C0164a t(String str) {
            this.f2475b.putString("csa_colorTitleLink", str);
            return this;
        }

        public final C0164a u(int r3) {
            this.f2475b.putString("csa_width", Integer.toString(r3));
            return this;
        }

        public final C0164a v(boolean z) {
            this.f2475b.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        public final C0164a w(String str) {
            this.f2475b.putString("csa_fontFamily", str);
            return this;
        }

        public final C0164a x(String str) {
            this.f2475b.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        public final C0164a y(int r3) {
            this.f2475b.putString("csa_fontSizeAnnotation", Integer.toString(r3));
            return this;
        }

        public final C0164a z(int r3) {
            this.f2475b.putString("csa_fontSizeAttribution", Integer.toString(r3));
            return this;
        }
    }

    private a(C0164a c0164a) {
        this.f2473a = c0164a.f2474a.e();
    }

    public final <T extends com.google.android.gms.ads.mediation.customevent.a> Bundle a(Class<T> cls) {
        return this.f2473a.j(cls);
    }

    @Deprecated
    public final <T extends b0> T b(Class<T> cls) {
        return (T) this.f2473a.p(cls);
    }

    public final <T extends g> Bundle c(Class<T> cls) {
        return this.f2473a.q(cls);
    }

    public final String d() {
        return this.f2473a.r();
    }

    public final boolean e(Context context) {
        return this.f2473a.s(context);
    }

    final c03 f() {
        return this.f2473a.t();
    }
}
