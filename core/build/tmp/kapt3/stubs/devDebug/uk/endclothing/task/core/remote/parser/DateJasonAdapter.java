package uk.endclothing.task.core.remote.parser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Luk/endclothing/task/core/remote/parser/DateJasonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "()V", "requestSDF", "Ljava/text/SimpleDateFormat;", "responseSDF", "theOtherResponseSDF", "transactionSDF", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "parseDate", "dateStr", "", "Companion", "core_devDebug"})
public final class DateJasonAdapter extends com.squareup.moshi.JsonAdapter<java.util.Date> {
    private final java.text.SimpleDateFormat responseSDF = null;
    private final java.text.SimpleDateFormat theOtherResponseSDF = null;
    private final java.text.SimpleDateFormat requestSDF = null;
    private final java.text.SimpleDateFormat transactionSDF = null;
    @org.jetbrains.annotations.NotNull()
    public static final uk.endclothing.task.core.remote.parser.DateJasonAdapter.Companion Companion = null;
    private static final java.lang.String RESPONSE_FORMAT = "yyyy-MM-dd\'T\'HH:mm:ss";
    private static final java.lang.String THE_OTHER_RESPONSE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final java.lang.String REQUEST_FORMAT = "yyyy-MM-dd";
    private static final java.lang.String TRANSACTION_DATE_FORMAT = "yyyy-MM-dd HH:mm";
    
    public DateJasonAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Date fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    java.util.Date value) {
    }
    
    private final java.util.Date parseDate(java.text.SimpleDateFormat $this$parseDate, java.lang.String dateStr) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Luk/endclothing/task/core/remote/parser/DateJasonAdapter$Companion;", "", "()V", "REQUEST_FORMAT", "", "RESPONSE_FORMAT", "THE_OTHER_RESPONSE_FORMAT", "TRANSACTION_DATE_FORMAT", "core_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}