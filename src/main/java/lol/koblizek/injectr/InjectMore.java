package lol.koblizek.injectr;

import java.lang.annotation.*;

/**
 * Marks method to be injected into the target classes.
 * <p>
 *     The method should be static and have the same signature as the target method,
 *     if such preconditions are not met, the injection might fail(warnings during compilation).
 * </p>
 * <p>
 *     If you're deciding between using this annotation and {@link Inject}, use this one if you want to inject the same method into multiple classes.
 * </p>
 * @see Inject
 * @author KoblizekXD
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface InjectMore {
    /**
     * The target class to inject the method into.
     */
    Class<?> value();

    /**
     * Descriptors of the targeting methods.
     */
    String[] methods();
}
