package com.google.ads.consent;

import c.a.e.z.c;

/* loaded from: classes.dex */
public class AdProvider {

    @c("company_id")
    private String id;

    @c("company_name")
    private String name;

    @c("policy_url")
    private String privacyPolicyUrlString;

    public String a() {
        return this.id;
    }

    public String b() {
        return this.name;
    }

    public String c() {
        return this.privacyPolicyUrlString;
    }

    public void d(String id) {
        this.id = id;
    }

    public void e(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || AdProvider.class != o.getClass()) {
            return false;
        }
        AdProvider adProvider = (AdProvider) o;
        return this.id.equals(adProvider.id) && this.name.equals(adProvider.name) && this.privacyPolicyUrlString.equals(adProvider.privacyPolicyUrlString);
    }

    public void f(String privacyPolicyUrlString) {
        this.privacyPolicyUrlString = privacyPolicyUrlString;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.privacyPolicyUrlString.hashCode();
    }
}
