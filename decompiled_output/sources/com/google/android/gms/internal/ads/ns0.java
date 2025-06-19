package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.cv2;

/* loaded from: classes.dex */
public final class ns0 implements pe2<tu2> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4600a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<String> f4601b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<as> f4602c;
    private final ze2<cv2.a.EnumC0172a> d;
    private final ze2<String> e;

    private ns0(ze2<Context> ze2Var, ze2<String> ze2Var2, ze2<as> ze2Var3, ze2<cv2.a.EnumC0172a> ze2Var4, ze2<String> ze2Var5) {
        this.f4600a = ze2Var;
        this.f4601b = ze2Var2;
        this.f4602c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    public static ns0 a(ze2<Context> ze2Var, ze2<String> ze2Var2, ze2<as> ze2Var3, ze2<cv2.a.EnumC0172a> ze2Var4, ze2<String> ze2Var5) {
        return new ns0(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        Context context = this.f4600a.get();
        final String str = this.f4601b.get();
        as asVar = this.f4602c.get();
        final cv2.a.EnumC0172a enumC0172a = this.d.get();
        final String str2 = this.e.get();
        tu2 tu2Var = new tu2(new yu2(context));
        final cv2.z zVar = (cv2.z) ((l92) cv2.z.N().v(asVar.e).w(asVar.f).x(asVar.g ? 0 : 2).P());
        tu2Var.a(new su2(enumC0172a, str, zVar, str2) { // from class: com.google.android.gms.internal.ads.os0

            /* renamed from: a, reason: collision with root package name */
            private final cv2.a.EnumC0172a f4732a;

            /* renamed from: b, reason: collision with root package name */
            private final String f4733b;

            /* renamed from: c, reason: collision with root package name */
            private final cv2.z f4734c;
            private final String d;

            {
                this.f4732a = enumC0172a;
                this.f4733b = str;
                this.f4734c = zVar;
                this.d = str2;
            }

            @Override // com.google.android.gms.internal.ads.su2
            public final void a(cv2.n.a aVar) {
                cv2.a.EnumC0172a enumC0172a2 = this.f4732a;
                String str3 = this.f4733b;
                cv2.z zVar2 = this.f4734c;
                aVar.v(aVar.K().A().w(enumC0172a2)).z(aVar.J().A().w(str3).v(zVar2)).D(this.d);
            }
        });
        return (tu2) we2.b(tu2Var, "Cannot return null from a non-@Nullable @Provides method");
    }
}
