package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class r91 implements ff1<s91> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f5114a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5115b;

    /* renamed from: c, reason: collision with root package name */
    private final an1 f5116c;
    private final View d;

    public r91(cy1 cy1Var, Context context, an1 an1Var, @androidx.annotation.i0 ViewGroup viewGroup) {
        this.f5114a = cy1Var;
        this.f5115b = context;
        this.f5116c = an1Var;
        this.d = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<s91> a() {
        return this.f5114a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.u91

            /* renamed from: a, reason: collision with root package name */
            private final r91 f5493a;

            {
                this.f5493a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5493a.b();
            }
        });
    }

    final /* synthetic */ s91 b() throws Exception {
        Context context = this.f5115b;
        qw2 qw2Var = this.f5116c.e;
        ArrayList arrayList = new ArrayList();
        View view = this.d;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int r6 = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", r6);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new s91(context, qw2Var, arrayList);
    }
}
