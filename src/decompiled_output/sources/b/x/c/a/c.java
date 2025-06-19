package b.x.c.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.q;
import b.x.c.a.b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c extends h implements b.x.c.a.b {
    private static final String l = "AnimatedVDCompat";
    private static final String m = "animated-vector";
    private static final String n = "target";
    private static final boolean o = false;
    private C0112c e;
    private Context f;
    private ArgbEvaluator g;
    d h;
    private Animator.AnimatorListener i;
    ArrayList<b.a> j;
    final Drawable.Callback k;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            c.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.j);
            int size = arrayList.size();
            for (int r1 = 0; r1 < size; r1++) {
                ((b.a) arrayList.get(r1)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.j);
            int size = arrayList.size();
            for (int r1 = 0; r1 < size; r1++) {
                ((b.a) arrayList.get(r1)).c(c.this);
            }
        }
    }

    /* renamed from: b.x.c.a.c$c, reason: collision with other inner class name */
    private static class C0112c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f1530a;

        /* renamed from: b, reason: collision with root package name */
        i f1531b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f1532c;
        ArrayList<Animator> d;
        b.f.a<Animator, String> e;

        public C0112c(Context context, C0112c c0112c, Drawable.Callback callback, Resources resources) {
            if (c0112c != null) {
                this.f1530a = c0112c.f1530a;
                i iVar = c0112c.f1531b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f1531b = (i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    i iVar2 = (i) this.f1531b.mutate();
                    this.f1531b = iVar2;
                    iVar2.setCallback(callback);
                    this.f1531b.setBounds(c0112c.f1531b.getBounds());
                    this.f1531b.l(false);
                }
                ArrayList<Animator> arrayList = c0112c.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new b.f.a<>(size);
                    for (int r0 = 0; r0 < size; r0++) {
                        Animator animator = c0112c.d.get(r0);
                        Animator animatorClone = animator.clone();
                        String str = c0112c.e.get(animator);
                        animatorClone.setTarget(this.f1531b.g(str));
                        this.d.add(animatorClone);
                        this.e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f1532c == null) {
                this.f1532c = new AnimatorSet();
            }
            this.f1532c.playTogether(this.d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1530a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    @m0(24)
    private static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f1533a;

        public d(Drawable.ConstantState constantState) {
            this.f1533a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1533a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1533a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f1533a.newDrawable();
            cVar.d = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.k);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f1533a.newDrawable(resources);
            cVar.d = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.k);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f1533a.newDrawable(resources, theme);
            cVar.d = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.k);
            return cVar;
        }
    }

    c() {
        this(null, null, null);
    }

    private c(@i0 Context context) {
        this(context, null, null);
    }

    private c(@i0 Context context, @i0 C0112c c0112c, @i0 Resources resources) {
        this.g = null;
        this.i = null;
        this.j = null;
        this.k = new a();
        this.f = context;
        if (c0112c != null) {
            this.e = c0112c;
        } else {
            this.e = new C0112c(context, c0112c, this.k, resources);
        }
    }

    public static void c(Drawable drawable) {
        if (drawable instanceof Animatable) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            } else {
                ((c) drawable).clearAnimationCallbacks();
            }
        }
    }

    @i0
    public static c d(@h0 Context context, @q int r7) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            c cVar = new c(context);
            Drawable drawableC = b.i.c.j.g.c(context.getResources(), r7, context.getTheme());
            cVar.d = drawableC;
            drawableC.setCallback(cVar.k);
            cVar.h = new d(cVar.d.getConstantState());
            return cVar;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(r7);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return e(context, context.getResources(), xml, attributeSetAsAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Log.e(l, "parser error", e);
            return null;
        }
    }

    public static c e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public static void f(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            g((AnimatedVectorDrawable) drawable, aVar);
        } else {
            ((c) drawable).b(aVar);
        }
    }

    @m0(23)
    private static void g(@h0 AnimatedVectorDrawable animatedVectorDrawable, @h0 b.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.a());
    }

    private void h() {
        Animator.AnimatorListener animatorListener = this.i;
        if (animatorListener != null) {
            this.e.f1532c.removeListener(animatorListener);
            this.i = null;
        }
    }

    private void i(String str, Animator animator) {
        animator.setTarget(this.e.f1531b.g(str));
        if (Build.VERSION.SDK_INT < 21) {
            j(animator);
        }
        C0112c c0112c = this.e;
        if (c0112c.d == null) {
            c0112c.d = new ArrayList<>();
            this.e.e = new b.f.a<>();
        }
        this.e.d.add(animator);
        this.e.e.put(animator, str);
    }

    private void j(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int r1 = 0; r1 < childAnimations.size(); r1++) {
                j(childAnimations.get(r1));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.g == null) {
                    this.g = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.g);
            }
        }
    }

    public static boolean k(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 24 ? l((AnimatedVectorDrawable) drawable, aVar) : ((c) drawable).a(aVar);
    }

    @m0(23)
    private static boolean l(AnimatedVectorDrawable animatedVectorDrawable, b.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.a());
    }

    @Override // b.x.c.a.b
    public boolean a(@h0 b.a aVar) {
        Drawable drawable = this.d;
        if (drawable != null) {
            l((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<b.a> arrayList = this.j;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(aVar);
        if (this.j.size() == 0) {
            h();
        }
        return zRemove;
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // b.x.c.a.b
    public void b(@h0 b.a aVar) {
        Drawable drawable = this.d;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, aVar);
            return;
        }
        if (aVar == null) {
            return;
        }
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        if (this.j.contains(aVar)) {
            return;
        }
        this.j.add(aVar);
        if (this.i == null) {
            this.i = new b();
        }
        this.e.f1532c.addListener(this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // b.x.c.a.b
    public void clearAnimationCallbacks() {
        Drawable drawable = this.d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        h();
        ArrayList<b.a> arrayList = this.j;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.e.f1531b.draw(canvas);
        if (this.e.f1532c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.d;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.e.f1531b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.e.f1530a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.d;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.e.f1531b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.d == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.d.getConstantState());
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicHeight() : this.e.f1531b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicWidth() : this.e.f1531b.getIntrinsicWidth();
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getOpacity() : this.e.f1531b.getOpacity();
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes;
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (m.equals(name)) {
                    typedArrayObtainAttributes = b.i.c.j.h.s(resources, theme, attributeSet, b.x.c.a.a.M);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i iVarD = i.d(resources, resourceId, theme);
                        iVarD.l(false);
                        iVarD.setCallback(this.k);
                        i iVar = this.e.f1531b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.e.f1531b = iVarD;
                    }
                } else if (n.equals(name)) {
                    typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, b.x.c.a.a.O);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        i(string, e.j(context, resourceId2));
                    }
                } else {
                    continue;
                }
                typedArrayObtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.e.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.d;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.e.f1531b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.d;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.e.f1532c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.isStateful() : this.e.f1531b.isStateful();
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.e.f1531b.setBounds(rect);
        }
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
        Drawable drawable = this.d;
        return drawable != null ? drawable.setLevel(r2) : this.e.f1531b.setLevel(r2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r2) {
        Drawable drawable = this.d;
        return drawable != null ? drawable.setState(r2) : this.e.f1531b.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(r2);
        } else {
            this.e.f1531b.setAlpha(r2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.e.f1531b.setAutoMirrored(z);
        }
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int r1) {
        super.setChangingConfigurations(r1);
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int r1, PorterDuff.Mode mode) {
        super.setColorFilter(r1, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.e.f1531b.setColorFilter(colorFilter);
        }
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
        super.setHotspotBounds(r1, r2, r3, r4);
    }

    @Override // b.x.c.a.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] r1) {
        return super.setState(r1);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTint(int r2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, r2);
        } else {
            this.e.f1531b.setTint(r2);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.e.f1531b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.d;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.e.f1531b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.e.f1531b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.e.f1532c.isStarted()) {
                return;
            }
            this.e.f1532c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.e.f1532c.end();
        }
    }
}
