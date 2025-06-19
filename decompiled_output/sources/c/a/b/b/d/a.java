package c.a.b.b.d;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c.a.b.b.d.a$a, reason: collision with other inner class name */
    public static class C0120a {

        /* renamed from: a, reason: collision with root package name */
        @i0
        private Account f1597a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f1598b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        private ArrayList<Account> f1599c;

        @i0
        private ArrayList<String> d;
        private boolean e;

        @i0
        private String f;

        @i0
        private Bundle g;
        private boolean h;
        private int i;

        @i0
        private String j;
        private boolean k;

        @i0
        private b l;

        @i0
        private String m;
        private boolean n;

        /* renamed from: c.a.b.b.d.a$a$a, reason: collision with other inner class name */
        public static class C0121a {

            /* renamed from: a, reason: collision with root package name */
            @i0
            private Account f1600a;

            /* renamed from: b, reason: collision with root package name */
            @i0
            private ArrayList<Account> f1601b;

            /* renamed from: c, reason: collision with root package name */
            @i0
            private ArrayList<String> f1602c;

            @i0
            private String e;

            @i0
            private Bundle f;
            private boolean d = false;
            private boolean g = false;
            private int h = 0;
            private boolean i = false;

            @RecentlyNonNull
            public C0120a a() {
                r.b(true, "We only support hostedDomain filter for account chip styled account picker");
                r.b(true, "Consent is only valid for account chip styled account picker");
                C0120a c0120a = new C0120a();
                c0120a.d = this.f1602c;
                c0120a.f1599c = this.f1601b;
                c0120a.e = this.d;
                C0120a.d(c0120a, null);
                C0120a.e(c0120a, null);
                c0120a.g = this.f;
                c0120a.f1597a = this.f1600a;
                C0120a.l(c0120a, false);
                C0120a.o(c0120a, false);
                C0120a.i(c0120a, null);
                C0120a.a(c0120a, 0);
                c0120a.f = this.e;
                C0120a.q(c0120a, false);
                C0120a.s(c0120a, false);
                return c0120a;
            }

            @RecentlyNonNull
            public C0121a b(@i0 List<Account> list) {
                this.f1601b = list == null ? null : new ArrayList<>(list);
                return this;
            }

            @RecentlyNonNull
            public C0121a c(@i0 List<String> list) {
                this.f1602c = list == null ? null : new ArrayList<>(list);
                return this;
            }

            @RecentlyNonNull
            public C0121a d(@RecentlyNonNull boolean z) {
                this.d = z;
                return this;
            }

            @RecentlyNonNull
            public C0121a e(@i0 Bundle bundle) {
                this.f = bundle;
                return this;
            }

            @RecentlyNonNull
            public C0121a f(@i0 Account account) {
                this.f1600a = account;
                return this;
            }

            @RecentlyNonNull
            public C0121a g(@i0 String str) {
                this.e = str;
                return this;
            }
        }

        /* renamed from: c.a.b.b.d.a$a$b */
        public static class b {
        }

        static /* synthetic */ int a(C0120a c0120a, int r1) {
            c0120a.i = 0;
            return 0;
        }

        static /* synthetic */ b d(C0120a c0120a, b bVar) {
            c0120a.l = null;
            return null;
        }

        static /* synthetic */ String e(C0120a c0120a, String str) {
            c0120a.j = null;
            return null;
        }

        static /* synthetic */ String i(C0120a c0120a, String str) {
            c0120a.m = null;
            return null;
        }

        static /* synthetic */ boolean l(C0120a c0120a, boolean z) {
            c0120a.f1598b = false;
            return false;
        }

        static /* synthetic */ boolean o(C0120a c0120a, boolean z) {
            c0120a.h = false;
            return false;
        }

        static /* synthetic */ boolean q(C0120a c0120a, boolean z) {
            c0120a.k = false;
            return false;
        }

        static /* synthetic */ boolean s(C0120a c0120a, boolean z) {
            c0120a.n = false;
            return false;
        }
    }

    private a() {
    }

    @RecentlyNonNull
    @Deprecated
    public static Intent a(@i0 Account account, @i0 ArrayList<Account> arrayList, @i0 String[] strArr, @RecentlyNonNull boolean z, @i0 String str, @i0 String str2, @i0 String[] strArr2, @i0 Bundle bundle) {
        Intent intent = new Intent();
        r.b(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @RecentlyNonNull
    public static Intent b(@RecentlyNonNull C0120a c0120a) {
        Intent intent = new Intent();
        r.b(true, "We only support hostedDomain filter for account chip styled account picker");
        r.b(true, "Consent is only valid for account chip styled account picker");
        r.b(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", c0120a.f1599c);
        if (c0120a.d != null) {
            intent.putExtra("allowableAccountTypes", (String[]) c0120a.d.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", c0120a.g);
        intent.putExtra("selectedAccount", c0120a.f1597a);
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", c0120a.e);
        intent.putExtra("descriptionTextOverride", c0120a.f);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("realClientPackage", (String) null);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
