package me.dio.credit.application.system.validation

import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [FutureDateValidator::class])
annotation class FutureDate(
    val message: String = "The date cannot be more than three months from now",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)
