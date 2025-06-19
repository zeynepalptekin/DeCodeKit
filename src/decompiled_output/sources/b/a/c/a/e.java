package b.a.c.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.appcompat.widget.o0;
import b.a.c.a.b;
import b.a.d.a;
import b.i.c.j.h;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class e extends b {
    private static final String u = "StateListDrawable";
    private static final boolean v = false;
    private a s;
    private boolean t;

    static class a extends b.c {
        int[][] J;

        a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[g()][];
            }
        }

        int D(int[] r2, Drawable drawable) {
            int r3 = a(drawable);
            this.J[r3] = r2;
            return r3;
        }

        int E(int[] r5) {
            int[][] r0 = this.J;
            int i = i();
            for (int r2 = 0; r2 < i; r2++) {
                if (StateSet.stateSetMatches(r0[r2], r5)) {
                    return r2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @h0
        public Drawable newDrawable() {
            return new e(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @h0
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }

        @Override // b.a.c.a.b.c
        public void r(int r3, int r4) {
            super.r(r3, r4);
            int[][] r42 = new int[r4][];
            System.arraycopy(this.J, 0, r42, 0, r3);
            this.J = r42;
        }

        @Override // b.a.c.a.b.c
        void v() {
            int[][] r0 = this.J;
            int[][] r1 = new int[r0.length][];
            for (int length = r0.length - 1; length >= 0; length--) {
                int[][] r2 = this.J;
                r1[length] = r2[length] != null ? (int[]) r2[length].clone() : null;
            }
            this.J = r1;
        }
    }

    e() {
        this(null, null);
    }

    e(@i0 a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }

    e(a aVar, Resources resources) {
        i(new a(aVar, this, resources));
        onStateChange(getState());
    }

    private void w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        a aVar = this.s;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayS = h.s(resources, theme, attributeSet, a.j.StateListDrawableItem);
                int resourceId = typedArrayS.getResourceId(a.j.StateListDrawableItem_android_drawable, -1);
                Drawable drawableJ = resourceId > 0 ? o0.h().j(context, resourceId) : null;
                typedArrayS.recycle();
                int[] r3 = p(attributeSet);
                if (drawableJ == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    drawableJ = Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
                aVar.D(r3, drawableJ);
            }
        }
    }

    private void x(TypedArray typedArray) {
        a aVar = this.s;
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.d |= typedArray.getChangingConfigurations();
        }
        aVar.i = typedArray.getBoolean(a.j.StateListDrawable_android_variablePadding, aVar.i);
        aVar.l = typedArray.getBoolean(a.j.StateListDrawable_android_constantSize, aVar.l);
        aVar.A = typedArray.getInt(a.j.StateListDrawable_android_enterFadeDuration, aVar.A);
        aVar.B = typedArray.getInt(a.j.StateListDrawable_android_exitFadeDuration, aVar.B);
        aVar.x = typedArray.getBoolean(a.j.StateListDrawable_android_dither, aVar.x);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    @m0(21)
    public void applyTheme(@h0 Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // b.a.c.a.b
    void b() {
        super.b();
        this.t = false;
    }

    @Override // b.a.c.a.b
    void i(@h0 b.c cVar) {
        super.i(cVar);
        if (cVar instanceof a) {
            this.s = (a) cVar;
        }
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    @h0
    public Drawable mutate() {
        if (!this.t && super.mutate() == this) {
            this.s.v();
            this.t = true;
        }
        return this;
    }

    public void n(int[] r2, Drawable drawable) {
        if (drawable != null) {
            this.s.D(r2, drawable);
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.a.c.a.b
    public a o() {
        return new a(this.s, this, null);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
        boolean zOnStateChange = super.onStateChange(r3);
        int r32 = this.s.E(r3);
        if (r32 < 0) {
            r32 = this.s.E(StateSet.WILD_CARD);
        }
        return h(r32) || zOnStateChange;
    }

    int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] r1 = new int[attributeCount];
        int r4 = 0;
        for (int r3 = 0; r3 < attributeCount; r3++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(r3);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int r6 = r4 + 1;
                if (!attributeSet.getAttributeBooleanValue(r3, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                r1[r4] = attributeNameResource;
                r4 = r6;
            }
        }
        return StateSet.trimStateSet(r1, r4);
    }

    int q() {
        return this.s.i();
    }

    Drawable r(int r2) {
        return this.s.h(r2);
    }

    int s(int[] r2) {
        return this.s.E(r2);
    }

    a t() {
        return this.s;
    }

    int[] u(int r2) {
        return this.s.J[r2];
    }

    public void v(@h0 Context context, @h0 Resources resources, @h0 XmlPullParser xmlPullParser, @h0 AttributeSet attributeSet, @i0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = h.s(resources, theme, attributeSet, a.j.StateListDrawable);
        setVisible(typedArrayS.getBoolean(a.j.StateListDrawable_android_visible, true), true);
        x(typedArrayS);
        m(resources);
        typedArrayS.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }
}
