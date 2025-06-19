package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.b.h;
import c.a.b.c.b.i;
import c.a.b.c.b.j;
import c.a.b.c.h.g;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect f;
    private final RectF g;
    private final RectF h;
    private final int[] i;
    private float j;
    private float k;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f6856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f6857c;

        a(boolean z, View view, View view2) {
            this.f6855a = z;
            this.f6856b = view;
            this.f6857c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6855a) {
                return;
            }
            this.f6856b.setVisibility(4);
            this.f6857c.setAlpha(1.0f);
            this.f6857c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f6855a) {
                this.f6856b.setVisibility(0);
                this.f6857c.setAlpha(0.0f);
                this.f6857c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6858a;

        b(View view) {
            this.f6858a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f6858a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f6860a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f6861b;

        c(g gVar, Drawable drawable) {
            this.f6860a = gVar;
            this.f6861b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6860a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f6860a.setCircularRevealOverlayDrawable(this.f6861b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f6863a;

        d(g gVar) {
            this.f6863a = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g.e revealInfo = this.f6863a.getRevealInfo();
            revealInfo.f1971c = Float.MAX_VALUE;
            this.f6863a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {

        /* renamed from: a, reason: collision with root package name */
        @i0
        public h f6865a;

        /* renamed from: b, reason: collision with root package name */
        public j f6866b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f = new Rect();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new Rect();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new int[2];
    }

    @i0
    private ViewGroup N(@h0 View view) {
        View viewFindViewById = view.findViewById(a.h.mtrl_child_content_container);
        return viewFindViewById != null ? i0(viewFindViewById) : ((view instanceof com.google.android.material.transformation.b) || (view instanceof com.google.android.material.transformation.a)) ? i0(((ViewGroup) view).getChildAt(0)) : i0(view);
    }

    private void O(@h0 View view, @h0 e eVar, @h0 i iVar, @h0 i iVar2, float f, float f2, float f3, float f4, @h0 RectF rectF) {
        float fV = V(eVar, iVar, f, f3);
        float fV2 = V(eVar, iVar2, f2, f4);
        Rect rect = this.f;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.g;
        rectF2.set(rect);
        RectF rectF3 = this.h;
        W(view, rectF3);
        rectF3.offset(fV, fV2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void P(@h0 View view, @h0 RectF rectF) {
        W(view, rectF);
        rectF.offset(this.j, this.k);
    }

    @h0
    private Pair<i, i> Q(float f, float f2, boolean z, @h0 e eVar) {
        i iVarH;
        h hVar;
        String str;
        if (f == 0.0f || f2 == 0.0f) {
            iVarH = eVar.f6865a.h("translationXLinear");
            hVar = eVar.f6865a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            iVarH = eVar.f6865a.h("translationXCurveDownwards");
            hVar = eVar.f6865a;
            str = "translationYCurveDownwards";
        } else {
            iVarH = eVar.f6865a.h("translationXCurveUpwards");
            hVar = eVar.f6865a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(iVarH, hVar.h(str));
    }

    private float R(@h0 View view, @h0 View view2, @h0 j jVar) {
        RectF rectF = this.g;
        RectF rectF2 = this.h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(-T(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float S(@h0 View view, @h0 View view2, @h0 j jVar) {
        RectF rectF = this.g;
        RectF rectF2 = this.h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(0.0f, -U(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float T(@h0 View view, @h0 View view2, @h0 j jVar) {
        float fCenterX;
        float fCenterX2;
        float f;
        RectF rectF = this.g;
        RectF rectF2 = this.h;
        P(view, rectF);
        W(view2, rectF2);
        int r3 = jVar.f1952a & 7;
        if (r3 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (r3 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (r3 != 5) {
                f = 0.0f;
                return f + jVar.f1953b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f = fCenterX - fCenterX2;
        return f + jVar.f1953b;
    }

    private float U(@h0 View view, @h0 View view2, @h0 j jVar) {
        float fCenterY;
        float fCenterY2;
        float f;
        RectF rectF = this.g;
        RectF rectF2 = this.h;
        P(view, rectF);
        W(view2, rectF2);
        int r3 = jVar.f1952a & 112;
        if (r3 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (r3 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (r3 != 80) {
                f = 0.0f;
                return f + jVar.f1954c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f = fCenterY - fCenterY2;
        return f + jVar.f1954c;
    }

    private float V(@h0 e eVar, @h0 i iVar, float f, float f2) {
        long jC = iVar.c();
        long jD = iVar.d();
        i iVarH = eVar.f6865a.h("expansion");
        return c.a.b.c.b.a.a(f, f2, iVar.e().getInterpolation((((iVarH.c() + iVarH.d()) + 17) - jC) / jD));
    }

    private void W(@h0 View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.i);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void X(View view, View view2, boolean z, boolean z2, @h0 e eVar, @h0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupN;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof g) && c.a.b.c.h.d.o == 0) || (viewGroupN = N(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    c.a.b.c.b.d.f1939a.set(viewGroupN, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupN, c.a.b.c.b.d.f1939a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupN, c.a.b.c.b.d.f1939a, 0.0f);
            }
            eVar.f6865a.h("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Y(@h0 View view, View view2, boolean z, boolean z2, @h0 e eVar, @h0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof g) {
            g gVar = (g) view2;
            int r3 = g0(view);
            int r9 = 16777215 & r3;
            if (z) {
                if (!z2) {
                    gVar.setCircularRevealScrimColor(r3);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(gVar, g.d.f1968a, r9);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(gVar, g.d.f1968a, r3);
            }
            objectAnimatorOfInt.setEvaluator(c.a.b.c.b.c.b());
            eVar.f6865a.h("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void Z(@h0 View view, @h0 View view2, boolean z, @h0 e eVar, @h0 List<Animator> list) {
        float fT = T(view, view2, eVar.f6866b);
        float fU = U(view, view2, eVar.f6866b);
        Pair<i, i> pairQ = Q(fT, fU, z, eVar);
        i iVar = (i) pairQ.first;
        i iVar2 = (i) pairQ.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fT = this.j;
        }
        fArr[0] = fT;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fU = this.k;
        }
        fArr2[0] = fU;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    private void a0(View view, @h0 View view2, boolean z, boolean z2, @h0 e eVar, @h0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fP = f0.P(view2) - f0.P(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fP);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fP);
        }
        eVar.f6865a.h("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b0(@h0 View view, View view2, boolean z, boolean z2, @h0 e eVar, float f, float f2, @h0 List<Animator> list, @h0 List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof g) {
            g gVar = (g) view2;
            float fR = R(view, view2, eVar.f6866b);
            float fS = S(view, view2, eVar.f6866b);
            ((FloatingActionButton) view).k(this.f);
            float fWidth = this.f.width() / 2.0f;
            i iVarH = eVar.f6865a.h("expansion");
            if (z) {
                if (!z2) {
                    gVar.setRevealInfo(new g.e(fR, fS, fWidth));
                }
                if (z2) {
                    fWidth = gVar.getRevealInfo().f1971c;
                }
                animatorA = c.a.b.c.h.a.a(gVar, fR, fS, c.a.b.c.o.a.b(fR, fS, 0.0f, 0.0f, f, f2));
                animatorA.addListener(new d(gVar));
                e0(view2, iVarH.c(), (int) fR, (int) fS, fWidth, list);
            } else {
                float f3 = gVar.getRevealInfo().f1971c;
                Animator animatorA2 = c.a.b.c.h.a.a(gVar, fR, fS, fWidth);
                int r7 = (int) fR;
                int r10 = (int) fS;
                e0(view2, iVarH.c(), r7, r10, f3, list);
                d0(view2, iVarH.c(), iVarH.d(), eVar.f6865a.i(), r7, r10, fWidth, list);
                animatorA = animatorA2;
            }
            iVarH.a(animatorA);
            list.add(animatorA);
            list2.add(c.a.b.c.h.a.c(gVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c0(View view, View view2, boolean z, boolean z2, @h0 e eVar, @h0 List<Animator> list, @h0 List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof g) && (view instanceof ImageView)) {
            g gVar = (g) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, c.a.b.c.b.e.f1940b, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, c.a.b.c.b.e.f1940b, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f6865a.h("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(gVar, drawable));
        }
    }

    private void d0(View view, long j, long j2, long j3, int r10, int r11, float f, @h0 List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, r10, r11, f, f);
                animatorCreateCircularReveal.setStartDelay(j4);
                animatorCreateCircularReveal.setDuration(j3 - j4);
                list.add(animatorCreateCircularReveal);
            }
        }
    }

    private void e0(View view, long j, int r7, int r8, float f, @h0 List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, r7, r8, f, f);
        animatorCreateCircularReveal.setStartDelay(0L);
        animatorCreateCircularReveal.setDuration(j);
        list.add(animatorCreateCircularReveal);
    }

    private void f0(@h0 View view, @h0 View view2, boolean z, boolean z2, @h0 e eVar, @h0 List<Animator> list, List<Animator.AnimatorListener> list2, @h0 RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fT = T(view, view2, eVar.f6866b);
        float fU = U(view, view2, eVar.f6866b);
        Pair<i, i> pairQ = Q(fT, fU, z, eVar);
        i iVar = (i) pairQ.first;
        i iVar2 = (i) pairQ.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fT);
                view2.setTranslationY(-fU);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            O(view2, eVar, iVar, iVar2, -fT, -fU, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fT);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fU);
        }
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int g0(@h0 View view) {
        ColorStateList colorStateListL = f0.L(view);
        if (colorStateListL != null) {
            return colorStateListL.getColorForState(view.getDrawableState(), colorStateListL.getDefaultColor());
        }
        return 0;
    }

    @i0
    private ViewGroup i0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @h0
    protected AnimatorSet M(@h0 View view, @h0 View view2, boolean z, boolean z2) {
        e eVarH0 = h0(view2.getContext(), z);
        if (z) {
            this.j = view.getTranslationX();
            this.k = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            a0(view, view2, z, z2, eVarH0, arrayList, arrayList2);
        }
        RectF rectF = this.g;
        f0(view, view2, z, z2, eVarH0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        Z(view, view2, z, eVarH0, arrayList);
        c0(view, view2, z, z2, eVarH0, arrayList, arrayList2);
        b0(view, view2, z, z2, eVarH0, fWidth, fHeight, arrayList, arrayList2);
        Y(view, view2, z, z2, eVarH0, arrayList, arrayList2);
        X(view, view2, z, z2, eVarH0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        c.a.b.c.b.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList2.size();
        for (int r1 = 0; r1 < size; r1++) {
            animatorSet.addListener(arrayList2.get(r1));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @androidx.annotation.i
    public boolean f(@h0 CoordinatorLayout coordinatorLayout, @h0 View view, @h0 View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @androidx.annotation.i
    public void h(@h0 CoordinatorLayout.g gVar) {
        if (gVar.h == 0) {
            gVar.h = 80;
        }
    }

    protected abstract e h0(Context context, boolean z);
}
