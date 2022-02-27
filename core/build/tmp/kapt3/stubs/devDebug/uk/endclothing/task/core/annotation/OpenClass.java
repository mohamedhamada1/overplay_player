package uk.endclothing.task.core.annotation;

import java.lang.System;

/**
 * This annotation allows us to open some classes for mocking purposes while they are final in
 * release builds.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Luk/endclothing/task/core/annotation/OpenClass;", "", "core_devDebug"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
public abstract @interface OpenClass {
}