package b.i.e;

import android.graphics.Typeface;
import androidx.annotation.m0;
import androidx.annotation.p0;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@m0(28)
@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o extends n {
    private static final String B = "createFromFamiliesWithDefault";
    private static final int C = -1;
    private static final String D = "sans-serif";

    @Override // b.i.e.n
    protected Typeface l(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.m, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.s.invoke(null, objNewInstance, D, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // b.i.e.n
    protected Method x(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(B, Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
