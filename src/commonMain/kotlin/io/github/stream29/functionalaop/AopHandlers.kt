package io.github.stream29.functionalaop

typealias AopHandler<R> = (() -> R) -> () -> R

inline fun <R> around(crossinline action: (f: () -> R) -> R): AopHandler<R> =
    { f -> { action(f) } }

inline fun <R> before(crossinline action: () -> Unit): AopHandler<R> =
    { f -> { action();f() } }

inline fun <R> after(crossinline action: (ret: R) -> Unit): AopHandler<R> =
    { f -> { f().also { ret -> action(ret) } } }
