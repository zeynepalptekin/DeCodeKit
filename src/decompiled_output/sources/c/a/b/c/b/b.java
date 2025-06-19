package c.a.b.c.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.h0;
import androidx.annotation.p0;
import java.util.List;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class b {
    public static void a(@h0 AnimatorSet animatorSet, @h0 List<Animator> list) {
        int size = list.size();
        long jMax = 0;
        for (int r4 = 0; r4 < size; r4++) {
            Animator animator = list.get(r4);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
