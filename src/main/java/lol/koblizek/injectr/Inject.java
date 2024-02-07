package lol.koblizek.injectr;

import java.lang.annotation.*;

/**
 * Marks method to be injected into the target class.
 * <p>
 *     The method should be static and have the same signature as the target method,
 *     if such preconditions are not met, the injection might fail(warnings during compilation).
 * </p>
 * @see InjectMore
 * @author KoblizekXD
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Inject {
    /**
     * The target class to inject the method into.
     * Leave empty to inject into any class.
     */
    Class<?> value() default Object.class;

    /**
     * Descriptor of the targeting method.
     * Leave empty to inject into any method.
     */
    String method() default "";
}
