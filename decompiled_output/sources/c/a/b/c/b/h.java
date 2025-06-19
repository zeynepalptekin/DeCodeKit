package c.a.b.c.b;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.u0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f1946c = "MotionSpec";

    /* renamed from: a, reason: collision with root package name */
    private final b.f.i<String, i> f1947a = new b.f.i<>();

    /* renamed from: b, reason: collision with root package name */
    private final b.f.i<String, PropertyValuesHolder[]> f1948b = new b.f.i<>();

    private static void a(@h0 h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.m(objectAnimator.getPropertyName(), i.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    @h0
    private PropertyValuesHolder[] b(@h0 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int r1 = 0; r1 < propertyValuesHolderArr.length; r1++) {
            propertyValuesHolderArr2[r1] = propertyValuesHolderArr[r1].clone();
        }
        return propertyValuesHolderArr2;
    }

    @i0
    public static h c(@h0 Context context, @h0 TypedArray typedArray, @u0 int r3) {
        int resourceId;
        if (!typedArray.hasValue(r3) || (resourceId = typedArray.getResourceId(r3, 0)) == 0) {
            return null;
        }
        return d(context, resourceId);
    }

    @i0
    public static h d(@h0 Context context, @androidx.annotation.b int r4) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, r4);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return e(arrayList);
        } catch (Exception e) {
            Log.w(f1946c, "Can't load animation resource ID #0x" + Integer.toHexString(r4), e);
            return null;
        }
    }

    @h0
    private static h e(@h0 List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int r2 = 0; r2 < size; r2++) {
            a(hVar, list.get(r2));
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f1947a.equals(((h) obj).f1947a);
        }
        return false;
    }

    @h0
    public <T> ObjectAnimator f(@h0 String str, @h0 T t, @h0 Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, g(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        h(str).a(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @h0
    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.f1948b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public i h(String str) {
        if (k(str)) {
            return this.f1947a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f1947a.hashCode();
    }

    public long i() {
        int size = this.f1947a.size();
        long jMax = 0;
        for (int r3 = 0; r3 < size; r3++) {
            i iVarM = this.f1947a.m(r3);
            jMax = Math.max(jMax, iVarM.c() + iVarM.d());
        }
        return jMax;
    }

    public boolean j(String str) {
        return this.f1948b.get(str) != null;
    }

    public boolean k(String str) {
        return this.f1947a.get(str) != null;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f1948b.put(str, propertyValuesHolderArr);
    }

    public void m(String str, @i0 i iVar) {
        this.f1947a.put(str, iVar);
    }

    @h0
    public String toString() {
        return '\n' + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f1947a + "}\n";
    }
}
