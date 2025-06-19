package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class sm0 {

    /* renamed from: a, reason: collision with root package name */
    private final dr0 f5277a;

    /* renamed from: b, reason: collision with root package name */
    private final up0 f5278b;

    /* renamed from: c, reason: collision with root package name */
    private final q30 f5279c;
    private final vl0 d;

    public sm0(dr0 dr0Var, up0 up0Var, q30 q30Var, vl0 vl0Var) {
        this.f5277a = dr0Var;
        this.f5278b = up0Var;
        this.f5279c = q30Var;
        this.d = vl0Var;
    }

    final /* synthetic */ void a(rw rwVar, Map map) {
        tr.h("Hiding native ads overlay.");
        rwVar.getView().setVisibility(8);
        this.f5279c.q(false);
    }

    final /* synthetic */ void b(Map map, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f5278b.f("sendMessageToNativeJs", map2);
    }

    public final View c() throws dx {
        rw rwVarC = this.f5277a.c(qw2.l());
        rwVarC.getView().setVisibility(8);
        rwVarC.o("/sendMessageToSdk", new z6(this) { // from class: com.google.android.gms.internal.ads.rm0

            /* renamed from: a, reason: collision with root package name */
            private final sm0 f5160a;

            {
                this.f5160a = this;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, Map map) {
                this.f5160a.f((rw) obj, map);
            }
        });
        rwVarC.o("/adMuted", new z6(this) { // from class: com.google.android.gms.internal.ads.um0

            /* renamed from: a, reason: collision with root package name */
            private final sm0 f5549a;

            {
                this.f5549a = this;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, Map map) {
                this.f5549a.e((rw) obj, map);
            }
        });
        this.f5278b.g(new WeakReference(rwVarC), "/loadHtml", new z6(this) { // from class: com.google.android.gms.internal.ads.tm0

            /* renamed from: a, reason: collision with root package name */
            private final sm0 f5423a;

            {
                this.f5423a = this;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, final Map map) {
                final sm0 sm0Var = this.f5423a;
                rw rwVar = (rw) obj;
                rwVar.C0().m(new dy(sm0Var, map) { // from class: com.google.android.gms.internal.ads.ym0

                    /* renamed from: a, reason: collision with root package name */
                    private final sm0 f6150a;

                    /* renamed from: b, reason: collision with root package name */
                    private final Map f6151b;

                    {
                        this.f6150a = sm0Var;
                        this.f6151b = map;
                    }

                    @Override // com.google.android.gms.internal.ads.dy
                    public final void a(boolean z) {
                        this.f6150a.b(this.f6151b, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    rwVar.loadData(str, "text/html", "UTF-8");
                } else {
                    rwVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f5278b.g(new WeakReference(rwVarC), "/showOverlay", new z6(this) { // from class: com.google.android.gms.internal.ads.wm0

            /* renamed from: a, reason: collision with root package name */
            private final sm0 f5856a;

            {
                this.f5856a = this;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, Map map) {
                this.f5856a.d((rw) obj, map);
            }
        });
        this.f5278b.g(new WeakReference(rwVarC), "/hideOverlay", new z6(this) { // from class: com.google.android.gms.internal.ads.vm0

            /* renamed from: a, reason: collision with root package name */
            private final sm0 f5709a;

            {
                this.f5709a = this;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, Map map) {
                this.f5709a.a((rw) obj, map);
            }
        });
        return rwVarC.getView();
    }

    final /* synthetic */ void d(rw rwVar, Map map) {
        tr.h("Showing native ads overlay.");
        rwVar.getView().setVisibility(0);
        this.f5279c.q(true);
    }

    final /* synthetic */ void e(rw rwVar, Map map) {
        this.d.b();
    }

    final /* synthetic */ void f(rw rwVar, Map map) {
        this.f5278b.f("sendMessageToNativeJs", map);
    }
}
