package b.a.c.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.q;
import androidx.appcompat.widget.o0;
import b.a.c.a.b;
import b.a.c.a.e;
import b.a.d.a;
import b.f.j;
import b.i.c.j.h;
import b.x.c.a.i;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class a extends b.a.c.a.e implements androidx.core.graphics.drawable.e {
    private static final String B = a.class.getSimpleName();
    private static final String C = "transition";
    private static final String D = "item";
    private static final String E = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String F = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private static final String G = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    private boolean A;
    private c w;
    private g x;
    private int y;
    private int z;

    private static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f800a;

        b(Animatable animatable) {
            super();
            this.f800a = animatable;
        }

        @Override // b.a.c.a.a.g
        public void c() {
            this.f800a.start();
        }

        @Override // b.a.c.a.a.g
        public void d() {
            this.f800a.stop();
        }
    }

    static class c extends e.a {
        private static final long M = 4294967296L;
        private static final long N = 8589934592L;
        b.f.f<Long> K;
        j<Integer> L;

        c(@i0 c cVar, @h0 a aVar, @i0 Resources resources) {
            j<Integer> jVar;
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                jVar = cVar.L;
            } else {
                this.K = new b.f.f<>();
                jVar = new j<>();
            }
            this.L = jVar;
        }

        private static long H(int r2, int r3) {
            return r3 | (r2 << 32);
        }

        int F(@h0 int[] r1, @h0 Drawable drawable, int r3) {
            int r12 = super.D(r1, drawable);
            this.L.q(r12, Integer.valueOf(r3));
            return r12;
        }

        int G(int r10, int r11, @h0 Drawable drawable, boolean z) {
            int r12 = super.a(drawable);
            long jH = H(r10, r11);
            long j = z ? N : 0L;
            long j2 = r12;
            this.K.b(jH, Long.valueOf(j2 | j));
            if (z) {
                this.K.b(H(r11, r10), Long.valueOf(M | j2 | j));
            }
            return r12;
        }

        int I(int r3) {
            if (r3 < 0) {
                return 0;
            }
            return this.L.l(r3, 0).intValue();
        }

        int J(@h0 int[] r1) {
            int r12 = super.E(r1);
            return r12 >= 0 ? r12 : super.E(StateSet.WILD_CARD);
        }

        int K(int r4, int r5) {
            return (int) this.K.l(H(r4, r5), -1L).longValue();
        }

        boolean L(int r4, int r5) {
            return (this.K.l(H(r4, r5), -1L).longValue() & M) != 0;
        }

        boolean M(int r4, int r5) {
            return (this.K.l(H(r4, r5), -1L).longValue() & N) != 0;
        }

        @Override // b.a.c.a.e.a, android.graphics.drawable.Drawable.ConstantState
        @h0
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // b.a.c.a.e.a, android.graphics.drawable.Drawable.ConstantState
        @h0
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override // b.a.c.a.e.a, b.a.c.a.b.c
        void v() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        private final b.x.c.a.c f801a;

        d(b.x.c.a.c cVar) {
            super();
            this.f801a = cVar;
        }

        @Override // b.a.c.a.a.g
        public void c() {
            this.f801a.start();
        }

        @Override // b.a.c.a.a.g
        public void d() {
            this.f801a.stop();
        }
    }

    private static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f802a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f803b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int r2 = z ? numberOfFrames - 1 : 0;
            int r0 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", r2, r0);
            if (Build.VERSION.SDK_INT >= 18) {
                objectAnimatorOfInt.setAutoCancel(true);
            }
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f803b = z2;
            this.f802a = objectAnimatorOfInt;
        }

        @Override // b.a.c.a.a.g
        public boolean a() {
            return this.f803b;
        }

        @Override // b.a.c.a.a.g
        public void b() {
            this.f802a.reverse();
        }

        @Override // b.a.c.a.a.g
        public void c() {
            this.f802a.start();
        }

        @Override // b.a.c.a.a.g
        public void d() {
            this.f802a.cancel();
        }
    }

    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f804a;

        /* renamed from: b, reason: collision with root package name */
        private int f805b;

        /* renamed from: c, reason: collision with root package name */
        private int f806c;

        f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        int a() {
            return this.f806c;
        }

        int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f805b = numberOfFrames;
            int[] r1 = this.f804a;
            if (r1 == null || r1.length < numberOfFrames) {
                this.f804a = new int[numberOfFrames];
            }
            int[] r12 = this.f804a;
            int r3 = 0;
            for (int r2 = 0; r2 < numberOfFrames; r2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - r2) - 1 : r2);
                r12[r2] = duration;
                r3 += duration;
            }
            this.f806c = r3;
            return r3;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int r5 = (int) ((f * this.f806c) + 0.5f);
            int r0 = this.f805b;
            int[] r1 = this.f804a;
            int r2 = 0;
            while (r2 < r0 && r5 >= r1[r2]) {
                r5 -= r1[r2];
                r2++;
            }
            return (r2 / r0) + (r2 < r0 ? r5 / this.f806c : 0.0f);
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(@i0 c cVar, @i0 Resources resources) {
        super(null);
        this.y = -1;
        this.z = -1;
        i(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @i0
    public static a B(@h0 Context context, @q int r7, @i0 Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(r7);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return C(context, resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e(B, "parser error", e2);
            return null;
        }
    }

    public static a C(@h0 Context context, @h0 Resources resources, @h0 XmlPullParser xmlPullParser, @h0 AttributeSet attributeSet, @i0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.v(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void D() {
        onStateChange(getState());
    }

    private int E(@h0 Context context, @h0 Resources resources, @h0 XmlPullParser xmlPullParser, @h0 AttributeSet attributeSet, @i0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = h.s(resources, theme, attributeSet, a.j.AnimatedStateListDrawableItem);
        int resourceId = typedArrayS.getResourceId(a.j.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = typedArrayS.getResourceId(a.j.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable drawableJ = resourceId2 > 0 ? o0.h().j(context, resourceId2) : null;
        typedArrayS.recycle();
        int[] r0 = p(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + G);
            }
            drawableJ = xmlPullParser.getName().equals("vector") ? i.e(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (drawableJ != null) {
            return this.w.F(r0, drawableJ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + G);
    }

    private int F(@h0 Context context, @h0 Resources resources, @h0 XmlPullParser xmlPullParser, @h0 AttributeSet attributeSet, @i0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = h.s(resources, theme, attributeSet, a.j.AnimatedStateListDrawableTransition);
        int resourceId = typedArrayS.getResourceId(a.j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = typedArrayS.getResourceId(a.j.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = typedArrayS.getResourceId(a.j.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable drawableJ = resourceId3 > 0 ? o0.h().j(context, resourceId3) : null;
        boolean z = typedArrayS.getBoolean(a.j.AnimatedStateListDrawableTransition_android_reversible, false);
        typedArrayS.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + E);
            }
            drawableJ = xmlPullParser.getName().equals("animated-vector") ? b.x.c.a.c.e(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (drawableJ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + E);
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.w.G(resourceId, resourceId2, drawableJ, z);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + F);
    }

    private boolean G(int r10) {
        int r2;
        int r6;
        g bVar;
        g gVar = this.x;
        if (gVar == null) {
            r2 = d();
        } else {
            if (r10 == this.y) {
                return true;
            }
            if (r10 == this.z && gVar.a()) {
                gVar.b();
                this.y = this.z;
                this.z = r10;
                return true;
            }
            r2 = this.y;
            gVar.d();
        }
        this.x = null;
        this.z = -1;
        this.y = -1;
        c cVar = this.w;
        int I = cVar.I(r2);
        int I2 = cVar.I(r10);
        if (I2 == 0 || I == 0 || (r6 = cVar.K(I, I2)) < 0) {
            return false;
        }
        boolean zM = cVar.M(I, I2);
        h(r6);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.L(I, I2), zM);
        } else {
            if (!(current instanceof b.x.c.a.c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((b.x.c.a.c) current);
        }
        bVar.c();
        this.x = bVar;
        this.z = r2;
        this.y = r10;
        return true;
    }

    private void w(@h0 Context context, @h0 Resources resources, @h0 XmlPullParser xmlPullParser, @h0 AttributeSet attributeSet, @i0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals(D)) {
                    E(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(C)) {
                    F(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void x(TypedArray typedArray) {
        c cVar = this.w;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.d |= typedArray.getChangingConfigurations();
        }
        cVar.B(typedArray.getBoolean(a.j.AnimatedStateListDrawableCompat_android_variablePadding, cVar.i));
        cVar.x(typedArray.getBoolean(a.j.AnimatedStateListDrawableCompat_android_constantSize, cVar.l));
        cVar.y(typedArray.getInt(a.j.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.z(typedArray.getInt(a.j.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(a.j.AnimatedStateListDrawableCompat_android_dither, cVar.x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.a.c.a.e
    /* renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c o() {
        return new c(this.w, this, null);
    }

    @Override // b.a.c.a.e, b.a.c.a.b, android.graphics.drawable.Drawable
    @m0(21)
    public /* bridge */ /* synthetic */ void applyTheme(@h0 Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // b.a.c.a.e, b.a.c.a.b
    void b() {
        super.b();
        this.A = false;
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    @m0(21)
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(@h0 Canvas canvas) {
        super.draw(canvas);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    @h0
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(@h0 Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    @m0(21)
    public /* bridge */ /* synthetic */ void getOutline(@h0 Outline outline) {
        super.getOutline(outline);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(@h0 Rect rect) {
        return super.getPadding(rect);
    }

    @Override // b.a.c.a.e, b.a.c.a.b
    void i(@h0 b.c cVar) {
        super.i(cVar);
        if (cVar instanceof c) {
            this.w = (c) cVar;
        }
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(@h0 Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // b.a.c.a.e, b.a.c.a.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.x;
        if (gVar != null) {
            gVar.d();
            this.x = null;
            h(this.y);
            this.y = -1;
            this.z = -1;
        }
    }

    @Override // b.a.c.a.b
    public /* bridge */ /* synthetic */ void k(int r1) {
        super.k(r1);
    }

    @Override // b.a.c.a.b
    public /* bridge */ /* synthetic */ void l(int r1) {
        super.l(r1);
    }

    @Override // b.a.c.a.e, b.a.c.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.A && super.mutate() == this) {
            this.w.v();
            this.A = true;
        }
        return this;
    }

    @Override // b.a.c.a.e
    public /* bridge */ /* synthetic */ void n(int[] r1, Drawable drawable) {
        super.n(r1, drawable);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int r1) {
        return super.onLayoutDirectionChanged(r1);
    }

    @Override // b.a.c.a.e, b.a.c.a.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r3) {
        int r0 = this.w.J(r3);
        boolean z = r0 != d() && (G(r0) || h(r0));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(r3) : z;
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(@h0 Drawable drawable, @h0 Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int r1) {
        super.setAlpha(r1);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
        super.setHotspotBounds(r1, r2, r3, r4);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public /* bridge */ /* synthetic */ void setTintMode(@h0 PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.x != null && (visible || z2)) {
            if (z) {
                this.x.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // b.a.c.a.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(@h0 Drawable drawable, @h0 Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    @Override // b.a.c.a.e
    public void v(@h0 Context context, @h0 Resources resources, @h0 XmlPullParser xmlPullParser, @h0 AttributeSet attributeSet, @i0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = h.s(resources, theme, attributeSet, a.j.AnimatedStateListDrawableCompat);
        setVisible(typedArrayS.getBoolean(a.j.AnimatedStateListDrawableCompat_android_visible, true), true);
        x(typedArrayS);
        m(resources);
        typedArrayS.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        D();
    }

    public void y(@h0 int[] r2, @h0 Drawable drawable, int r4) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable must not be null");
        }
        this.w.F(r2, drawable, r4);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void z(int r2, int r3, @h0 T t, boolean z) {
        if (t == null) {
            throw new IllegalArgumentException("Transition drawable must not be null");
        }
        this.w.G(r2, r3, t, z);
    }
}
