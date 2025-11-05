package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * The value represents a pattern of bits and should not be interpreted as a numeric quantity. This
 * annotation is used for values that are manipulated using bitwise operations but should not be
 * used in arithmetic operations.
 *
 * <p>Examples include the return value of {@code Double.doubleToLongBits} or values used as
 * bitsets.
 *
 * <p>Bitwise operations ({@code &}, {@code |}, {@code ^}, {@code ~}, {@code <<}, {@code >>}, {@code
 * >>>}) are permitted on {@code @BitPattern} values. Arithmetic operations ({@code +}, {@code -},
 * {@code *}, {@code /}, {@code %}) and increment/decrement operators ({@code ++}, {@code --}) are
 * forbidden.
 *
 * <p>This annotation is a subtype of {@link UnknownSignedness} and a supertype of {@link
 * SignednessBottom}, but is unrelated to {@link Signed} and {@link Unsigned}.
 *
 * @checker_framework.manual #signedness-checker Signedness Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({UnknownSignedness.class})
public @interface BitPattern {}
