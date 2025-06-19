package b.s;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a {
    private static final String g = "PrintHelper";
    private static final int h = 3500;
    static final boolean i;
    static final boolean j;
    public static final int k = 1;
    public static final int l = 2;

    @SuppressLint({"InlinedApi"})
    public static final int m = 1;

    @SuppressLint({"InlinedApi"})
    public static final int n = 2;
    public static final int o = 1;
    public static final int p = 2;

    /* renamed from: a, reason: collision with root package name */
    final Context f1347a;

    /* renamed from: b, reason: collision with root package name */
    BitmapFactory.Options f1348b = null;

    /* renamed from: c, reason: collision with root package name */
    final Object f1349c = new Object();
    int d = 2;
    int e = 2;
    int f = 1;

    /* renamed from: b.s.a$a, reason: collision with other inner class name */
    class AsyncTaskC0095a extends AsyncTask<Void, Void, Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f1350a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PrintAttributes f1351b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f1352c;
        final /* synthetic */ PrintAttributes d;
        final /* synthetic */ int e;
        final /* synthetic */ ParcelFileDescriptor f;
        final /* synthetic */ PrintDocumentAdapter.WriteResultCallback g;

        AsyncTaskC0095a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int r6, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f1350a = cancellationSignal;
            this.f1351b = printAttributes;
            this.f1352c = bitmap;
            this.d = printAttributes2;
            this.e = r6;
            this.f = parcelFileDescriptor;
            this.g = writeResultCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f1350a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(a.this.f1347a, this.f1351b);
                Bitmap bitmapA = a.a(this.f1352c, this.f1351b.getColorMode());
                if (this.f1350a.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                    if (a.j) {
                        rectF = new RectF(pageStartPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(a.this.f1347a, this.d);
                        PdfDocument.Page pageStartPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(pageStartPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(pageStartPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix matrixD = a.d(bitmapA.getWidth(), bitmapA.getHeight(), rectF, this.e);
                    if (!a.j) {
                        matrixD.postTranslate(rectF.left, rectF.top);
                        pageStartPage.getCanvas().clipRect(rectF);
                    }
                    pageStartPage.getCanvas().drawBitmap(bitmapA, matrixD, null);
                    printedPdfDocument.finishPage(pageStartPage);
                    if (this.f1350a.isCanceled()) {
                        printedPdfDocument.close();
                        if (this.f != null) {
                            try {
                                this.f.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (bitmapA != this.f1352c) {
                            bitmapA.recycle();
                        }
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f.getFileDescriptor()));
                    printedPdfDocument.close();
                    if (this.f != null) {
                        try {
                            this.f.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (bitmapA != this.f1352c) {
                        bitmapA.recycle();
                    }
                    return null;
                } finally {
                }
            } catch (Throwable th) {
                return th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Throwable th) {
            if (this.f1350a.isCanceled()) {
                this.g.onWriteCancelled();
            } else if (th == null) {
                this.g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                Log.e(a.g, "Error writing printed content", th);
                this.g.onWriteFailed(null);
            }
        }
    }

    public interface b {
        void a();
    }

    @m0(19)
    private class c extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final String f1353a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1354b;

        /* renamed from: c, reason: collision with root package name */
        private final Bitmap f1355c;
        private final b d;
        private PrintAttributes e;

        c(String str, int r3, Bitmap bitmap, b bVar) {
            this.f1353a = str;
            this.f1354b = r3;
            this.f1355c = bitmap;
            this.d = bVar;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            b bVar = this.d;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f1353a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.e, this.f1354b, this.f1355c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @m0(19)
    private class d extends PrintDocumentAdapter {

        /* renamed from: a, reason: collision with root package name */
        final String f1356a;

        /* renamed from: b, reason: collision with root package name */
        final Uri f1357b;

        /* renamed from: c, reason: collision with root package name */
        final b f1358c;
        final int d;
        PrintAttributes e;
        AsyncTask<Uri, Boolean, Bitmap> f;
        Bitmap g = null;

        /* renamed from: b.s.a$d$a, reason: collision with other inner class name */
        class AsyncTaskC0096a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellationSignal f1359a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f1360b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ PrintAttributes f1361c;
            final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback d;

            /* renamed from: b.s.a$d$a$a, reason: collision with other inner class name */
            class C0097a implements CancellationSignal.OnCancelListener {
                C0097a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    d.this.a();
                    AsyncTaskC0096a.this.cancel(false);
                }
            }

            AsyncTaskC0096a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f1359a = cancellationSignal;
                this.f1360b = printAttributes;
                this.f1361c = printAttributes2;
                this.d = layoutResultCallback;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    return a.this.i(d.this.f1357b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.d.onLayoutCancelled();
                d.this.f = null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!a.i || a.this.f == 0)) {
                    synchronized (this) {
                        mediaSize = d.this.e.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != a.g(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                d.this.g = bitmap;
                if (bitmap != null) {
                    this.d.onLayoutFinished(new PrintDocumentInfo.Builder(d.this.f1356a).setContentType(1).setPageCount(1).build(), true ^ this.f1360b.equals(this.f1361c));
                } else {
                    this.d.onLayoutFailed(null);
                }
                d.this.f = null;
            }

            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                this.f1359a.setOnCancelListener(new C0097a());
            }
        }

        d(String str, Uri uri, b bVar, int r5) {
            this.f1356a = str;
            this.f1357b = uri;
            this.f1358c = bVar;
            this.d = r5;
        }

        void a() {
            synchronized (a.this.f1349c) {
                if (a.this.f1348b != null) {
                    if (Build.VERSION.SDK_INT < 24) {
                        a.this.f1348b.requestCancelDecode();
                    }
                    a.this.f1348b = null;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            b bVar = this.f1358c;
            if (bVar != null) {
                bVar.a();
            }
            Bitmap bitmap = this.g;
            if (bitmap != null) {
                bitmap.recycle();
                this.g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f1356a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f = new AsyncTaskC0096a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.e, this.d, this.g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        int r0 = Build.VERSION.SDK_INT;
        i = r0 < 20 || r0 > 23;
        j = Build.VERSION.SDK_INT != 23;
    }

    public a(@h0 Context context) {
        this.f1347a = context;
    }

    static Bitmap a(Bitmap bitmap, int r6) {
        if (r6 != 1) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @m0(19)
    private static PrintAttributes.Builder b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (Build.VERSION.SDK_INT >= 23 && printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    static Matrix d(int r3, int r4, RectF rectF, int r6) {
        Matrix matrix = new Matrix();
        float f = r3;
        float fWidth = rectF.width() / f;
        float fMax = r6 == 2 ? Math.max(fWidth, rectF.height() / r4) : Math.min(fWidth, rectF.height() / r4);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate((rectF.width() - (f * fMax)) / 2.0f, (rectF.height() - (r4 * fMax)) / 2.0f);
        return matrix;
    }

    static boolean g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    private Bitmap h(Uri uri, BitmapFactory.Options options) throws Throwable {
        Context context;
        if (uri == null || (context = this.f1347a) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e) {
                        Log.w(g, "close fail ", e);
                    }
                }
                return bitmapDecodeStream;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        Log.w(g, "close fail ", e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean q() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public int c() {
        return this.e;
    }

    public int e() {
        if (Build.VERSION.SDK_INT < 19 || this.f != 0) {
            return this.f;
        }
        return 1;
    }

    public int f() {
        return this.d;
    }

    Bitmap i(Uri uri) throws Throwable {
        BitmapFactory.Options options;
        if (uri == null || this.f1347a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        h(uri, options2);
        int r2 = options2.outWidth;
        int r0 = options2.outHeight;
        if (r2 > 0 && r0 > 0) {
            int r4 = Math.max(r2, r0);
            int r5 = 1;
            while (r4 > h) {
                r4 >>>= 1;
                r5 <<= 1;
            }
            if (r5 > 0 && Math.min(r2, r0) / r5 > 0) {
                synchronized (this.f1349c) {
                    options = new BitmapFactory.Options();
                    this.f1348b = options;
                    options.inMutable = true;
                    options.inSampleSize = r5;
                }
                try {
                    Bitmap bitmapH = h(uri, options);
                    synchronized (this.f1349c) {
                        this.f1348b = null;
                    }
                    return bitmapH;
                } catch (Throwable th) {
                    synchronized (this.f1349c) {
                        this.f1348b = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public void j(@h0 String str, @h0 Bitmap bitmap) {
        k(str, bitmap, null);
    }

    public void k(@h0 String str, @h0 Bitmap bitmap, @i0 b bVar) {
        if (Build.VERSION.SDK_INT < 19 || bitmap == null) {
            return;
        }
        ((PrintManager) this.f1347a.getSystemService("print")).print(str, new c(str, this.d, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(g(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.e).build());
    }

    public void l(@h0 String str, @h0 Uri uri) throws FileNotFoundException {
        m(str, uri, null);
    }

    public void m(@h0 String str, @h0 Uri uri, @i0 b bVar) throws FileNotFoundException {
        PrintAttributes.MediaSize mediaSize;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        d dVar = new d(str, uri, bVar, this.d);
        PrintManager printManager = (PrintManager) this.f1347a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.e);
        int r1 = this.f;
        if (r1 != 1 && r1 != 0) {
            if (r1 == 2) {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
            }
            printManager.print(str, dVar, builder.build());
        }
        mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        builder.setMediaSize(mediaSize);
        printManager.print(str, dVar, builder.build());
    }

    public void n(int r1) {
        this.e = r1;
    }

    public void o(int r1) {
        this.f = r1;
    }

    public void p(int r1) {
        this.d = r1;
    }

    @m0(19)
    void r(PrintAttributes printAttributes, int r13, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new AsyncTaskC0095a(cancellationSignal, j ? printAttributes : b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, r13, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
