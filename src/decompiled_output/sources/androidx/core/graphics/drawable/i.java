package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
final class i extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    int f395a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f396b;

    /* renamed from: c, reason: collision with root package name */
    ColorStateList f397c;
    PorterDuff.Mode d;

    i(@i0 i iVar) {
        this.f397c = null;
        this.d = g.j;
        if (iVar != null) {
            this.f395a = iVar.f395a;
            this.f396b = iVar.f396b;
            this.f397c = iVar.f397c;
            this.d = iVar.d;
        }
    }

    boolean a() {
        return this.f396b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int r0 = this.f395a;
        Drawable.ConstantState constantState = this.f396b;
        return r0 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @h0
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @h0
    public Drawable newDrawable(@i0 Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new h(this, resources) : new g(this, resources);
    }
}
