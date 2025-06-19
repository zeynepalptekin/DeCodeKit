package b.i.p.r0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1278a = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: b, reason: collision with root package name */
    private static final String f1279b = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: c, reason: collision with root package name */
    private static final String f1280c = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String d = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String e = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String f = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String g = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String h = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String i = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String j = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String k = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String l = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String m = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final String n = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final int o = 1;

    class a extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f1281a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z, c cVar) {
            super(inputConnection, z);
            this.f1281a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int r4, Bundle bundle) {
            if (this.f1281a.a(b.i.p.r0.c.g(inputContentInfo), r4, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, r4, bundle);
        }
    }

    /* renamed from: b.i.p.r0.b$b, reason: collision with other inner class name */
    class C0075b extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f1282a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0075b(InputConnection inputConnection, boolean z, c cVar) {
            super(inputConnection, z);
            this.f1282a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (b.c(str, bundle, this.f1282a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public interface c {
        boolean a(b.i.p.r0.c cVar, int r2, Bundle bundle);
    }

    @Deprecated
    public b() {
    }

    public static boolean a(@h0 InputConnection inputConnection, @h0 EditorInfo editorInfo, @h0 b.i.p.r0.c cVar, int r10, @i0 Bundle bundle) {
        boolean z;
        ClipDescription clipDescriptionB = cVar.b();
        String[] strArrA = b.i.p.r0.a.a(editorInfo);
        int length = strArrA.length;
        boolean z2 = false;
        int r4 = 0;
        while (true) {
            if (r4 >= length) {
                z = false;
                break;
            }
            if (clipDescriptionB.hasMimeType(strArrA[r4])) {
                z = true;
                break;
            }
            r4++;
        }
        if (!z) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            return inputConnection.commitContent((InputContentInfo) cVar.f(), r10, bundle);
        }
        int r8 = b.i.p.r0.a.b(editorInfo);
        if (r8 == 2) {
            z2 = true;
        } else if (r8 != 3 && r8 != 4) {
            return false;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(z2 ? d : f1280c, cVar.a());
        bundle2.putParcelable(z2 ? f : e, cVar.b());
        bundle2.putParcelable(z2 ? h : g, cVar.c());
        bundle2.putInt(z2 ? l : k, r10);
        bundle2.putParcelable(z2 ? j : i, bundle);
        return inputConnection.performPrivateCommand(z2 ? f1279b : f1278a, bundle2);
    }

    @h0
    public static InputConnection b(@h0 InputConnection inputConnection, @h0 EditorInfo editorInfo, @h0 c cVar) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        }
        if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        }
        if (cVar != null) {
            return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, cVar) : b.i.p.r0.a.a(editorInfo).length == 0 ? inputConnection : new C0075b(inputConnection, false, cVar);
        }
        throw new IllegalArgumentException("onCommitContentListener must be non-null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean c(@i0 String str, @h0 Bundle bundle, @h0 c cVar) throws Throwable {
        boolean z;
        ResultReceiver resultReceiver;
        ?? A = 0;
        A = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(f1278a, str)) {
            z = false;
        } else {
            if (!TextUtils.equals(f1279b, str)) {
                return false;
            }
            z = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z ? n : m);
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? d : f1280c);
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? f : e);
                Uri uri2 = (Uri) bundle.getParcelable(z ? h : g);
                int r6 = bundle.getInt(z ? l : k);
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? j : i);
                if (uri != null && clipDescription != null) {
                    A = cVar.a(new b.i.p.r0.c(uri, clipDescription, uri2), r6, bundle2);
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(A, null);
                }
                return A;
            } catch (Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }
}
